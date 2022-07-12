package com.google.suryansh7202.developerquiz

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.os.*
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat

class Solution : AppCompatActivity() {
    private var progressBarPosition =0
    private var progressBar: ProgressBar? =null
    private var tvProgress: TextView?= null
    private var mQuestionsList: ArrayList<Question>? =null

    private var tvQuestion: TextView?= null


    private var mCurrentPosition:Int =1

    val mquestionSelectedOptions =  ArrayList<Int>()

    private var tv_AcutalCorrectAnswer: TextView? = null
    private var tv_YourAnswer: TextView? = null

    private var Analysis: TextView? = null
    private var Solution: TextView? = null


    private var mCorrectAnswers: Int = 0
    private var mWrongAnswer: Int = 0
    private var mNotSelected: Int = 0


    private var mSelected_Quiz: String? =null

    private var tvResult :TextView?=null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_solution)
        mQuestionsList = Constants.getQuestions()
        mCurrentPosition= intent.getIntExtra(Constants.Send_Current_Position, 0)
        mSelected_Quiz = intent.getStringExtra(Constants.SELECTED_QUIZ)
        val questionSelectedOptions = intent.getSerializableExtra("QuestionsExtra") as ArrayList<Int>?
        mCorrectAnswers = intent.getIntExtra(Constants.CORRECT_ANSWER, 0)
        mWrongAnswer = intent.getIntExtra(Constants.WRONG_ANSWER, 0)
        mNotSelected = intent.getIntExtra(Constants.NOT_SELECTED, 0)
        val TotalQuestion = intent.getIntExtra(Constants.TOTAL_QUESTIONS,0)
        val tvScore = findViewById<TextView>(R.id.tv_score)

        tvScore.text = "★ Your Score is ${mCorrectAnswers} out of ${TotalQuestion}."
        tvQuestion = findViewById(R.id.tv_question)
        progressBar =findViewById(R.id.ResultprogressBar)
        tvProgress = findViewById(R.id.tv_Resultprogress)
        tvResult = findViewById(R.id.tv_result)
        tvResult?.text = mSelected_Quiz

        mquestionSelectedOptions.addAll(questionSelectedOptions!!)


        for( i in (mquestionSelectedOptions.size+1)..10 ){
            mquestionSelectedOptions.add(0)
        }



        val next = findViewById<ImageView>(R.id.btn_next)
        val previous = findViewById<ImageView>(R.id.btn_previous)



        Analysis = findViewById(R.id.Analysis)
        Solution = findViewById(R.id.Solution)



        setButtonColour(Solution)

        Analysis?.setOnClickListener{
            Solution?.setTextColor(Color.parseColor("#7A8089"))
            Solution?.background = ContextCompat.getDrawable(
                this,
                R.drawable.not_selected_result_option

            )
//
           Analysis?.setTextColor(Color.parseColor("#363A43"))
            Analysis?.background = ContextCompat.getDrawable(
                this,
                R.drawable.selected_result_option
            )


            val intent = Intent(this, PieChart::class.java)
            intent.putParcelableArrayListExtra(
                "QuestionsExtra",
                questionSelectedOptions as ArrayList<out Parcelable?>?
            )

            intent.putExtra(Constants.Send_Current_Position,mCurrentPosition)

            intent.putExtra(Constants.CORRECT_ANSWER,mCorrectAnswers)
            intent.putExtra(Constants.WRONG_ANSWER,mWrongAnswer)
            intent.putExtra(Constants.NOT_SELECTED,mNotSelected)
            intent.putExtra(Constants.SELECTED_QUIZ, mSelected_Quiz)
            intent.putExtra(Constants.TOTAL_QUESTIONS,TotalQuestion)




            startActivity(intent)
            this.overridePendingTransition(0, 0);

            finish()



        }


        tv_AcutalCorrectAnswer = findViewById(R.id.tv_AcutalCorrectAnswer)
        tv_YourAnswer = findViewById(R.id.tv_YourAnswer)
        previous?.isEnabled = false
       progressBarPosition++
        setQuestion()





        previous.setOnClickListener {
            val vibrator = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
            if (vibrator.hasVibrator()) { // Vibrator availability checking
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    vibrator.vibrate(VibrationEffect.createOneShot(30, VibrationEffect.DEFAULT_AMPLITUDE)) // New vibrate method for API Level 26 or higher
                } else {
                    vibrator.vibrate(500) // Vibrate method for below API Level 26
                }
            }
            previous.alpha =1f
            previous.translationY = 8f;
            previous.animate().alpha(1f).translationYBy(-5f).duration = 50

            mCurrentPosition--
            progressBarPosition--
            if(progressBarPosition==1){

                previous?.isEnabled = false
                next?.isEnabled = true
            }else {
                next?.isEnabled = true

            }

            setQuestion()
        }

        next.setOnClickListener {
            val vibrator = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
            if (vibrator.hasVibrator()) { // Vibrator availability checking
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                    vibrator.vibrate(VibrationEffect.createOneShot(30, VibrationEffect.DEFAULT_AMPLITUDE)) // New vibrate method for API Level 26 or higher
                } else {
                    vibrator.vibrate(500) // Vibrate method for below API Level 26
                }
            }
            next.alpha =1f
            next.translationY = 8f;
            next.animate().alpha(1f).translationYBy(-5f).duration = 50

            mCurrentPosition++
            progressBarPosition++
            if(progressBarPosition==mquestionSelectedOptions.size){

                next?.isEnabled = false
                previous?.isEnabled = true
            }else{
                previous?.isEnabled = true

            }
            setQuestion()
        }





    }


    private fun setButtonColour(Solution: TextView?) {

        Solution?.setTextColor(Color.parseColor("#363A43"))
        Solution?.background = ContextCompat.getDrawable(
            this,
            R.drawable.selected_result_option

        )

    }

    private fun setQuestion() {

        val question: Question = mQuestionsList!![mCurrentPosition - 1]
        tvQuestion?.text = question.question

        progressBar?.progress = progressBarPosition
        tvProgress?.text = "$progressBarPosition/${progressBar?.max}"

        yourans()
        correctans()
    }


    private fun yourans(){
        val question: Question =mQuestionsList!![mCurrentPosition - 1]

        if(mquestionSelectedOptions[progressBarPosition-1] == question.correctAnswer ){
            setOptions(question.correctAnswer)
            tv_YourAnswer?.background = ContextCompat.getDrawable(
                this,R.drawable.correct_option_border_bg
            )
        }else if (mquestionSelectedOptions[progressBarPosition-1] ==0 ){
            tv_YourAnswer?.text = "Not Selected"
            tv_YourAnswer?.background = ContextCompat.getDrawable(
                this,R.drawable.selected_option_border_bg
            )

        }

        else{
            setOptions(mquestionSelectedOptions[progressBarPosition-1])

            tv_YourAnswer?.background = ContextCompat.getDrawable(
                this,R.drawable.wrong_option_border_bg
            )
        }
    }


    private fun correctans(){
        val question: Question =mQuestionsList!![mCurrentPosition - 1]

        when(question!!.correctAnswer){
            1 -> {
                tv_AcutalCorrectAnswer?.text = question.optionOne

            }
            2 -> {
                tv_AcutalCorrectAnswer?.text = question.optionTwo
            }
            3 -> {
                tv_AcutalCorrectAnswer?.text = question.optionThree
            }
            else ->{
                tv_AcutalCorrectAnswer?.text = question.optionFour
            }
        }
        tv_AcutalCorrectAnswer?.background = ContextCompat.getDrawable(
            this,R.drawable.correct_option_border_bg
        )
    }






    private fun setOptions(option : Int){
        val question: Question =mQuestionsList!![mCurrentPosition - 1]

        when(option){
            1 -> {
                tv_YourAnswer?.text = question.optionOne

            }
            2 -> {
                tv_YourAnswer?.text = question.optionTwo
            }
            3 -> {
                tv_YourAnswer?.text = question.optionThree
            }
            else ->{
                tv_YourAnswer?.text = question.optionFour
            }
        }

    }



}