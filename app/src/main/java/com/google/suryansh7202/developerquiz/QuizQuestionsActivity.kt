package com.google.suryansh7202.developerquiz

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.os.*
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import kotlin.system.exitProcess

class QuizQuestionsActivity : AppCompatActivity(),View.OnClickListener {

    private val questionSelectedOptions= ArrayList<Int>()

    private var mUserName: String? =null
    private var mCorrectAnswers: Int = 0
    private var mWrongAnswer: Int = 0
    private var mNotSelected: Int = 0

    private var mCurrentPosition:Int =0
    private var mQuestionsList: ArrayList<Question>? =null
    private var mSelectedOptionPosition: Int =0

    private var progressBar: ProgressBar? =null
    private var tvProgress: TextView?= null
    private var tvQuestion: TextView?= null
//    private var ivImage : ImageView?= null

    private var tvOptionOne: TextView? = null
    private var tvOptionTwo: TextView? = null
    private var tvOptionThree: TextView? = null
    private var tvOptionFour: TextView? = null
    private var btnSubmit: Button?= null
    private var progressBarPosition =0
    private var maxQuestion : Int = 10
    private var sendCurrentPosition:Int = 0
    private var mSelected_Quiz: String? =null
    private var Selected_Quiz:TextView?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        mUserName = intent.getStringExtra(Constants.USER_NAME)
        mSelected_Quiz = intent.getStringExtra(Constants.SELECTED_QUIZ)

        mCurrentPosition = intent.getIntExtra(Constants.CURRENT_POSITION,0)
        maxQuestion = mCurrentPosition
        sendCurrentPosition = mCurrentPosition


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)




        Selected_Quiz = findViewById(R.id.selectedQuiz)
        Selected_Quiz?.setText(mSelected_Quiz + " Quiz")





        progressBar = findViewById(R.id.progressBar)
        tvProgress = findViewById(R.id.tv_progress)
        tvQuestion = findViewById(R.id.tv_question)
//       ivImage = findViewById(R.id.iv_image)
        tvOptionOne = findViewById(R.id.tv_option_one)
        tvOptionTwo = findViewById(R.id.tv_option_two)
        tvOptionThree = findViewById(R.id.tv_option_three)
        tvOptionFour = findViewById(R.id.tv_option_four)
        btnSubmit = findViewById(R.id.btn_submit)
        mQuestionsList = Constants.getQuestions()
        TimeRemaning(findViewById<TextView>(R.id.tv_timecount))
        setQuestion()

    }


    private fun TimeRemaning(mTextFieldsec: TextView) {
        object : CountDownTimer(120000, 1000) {
            @SuppressLint("SetTextI18n")
            override fun onTick(millisUntilFinished: Long) {
                // TODO do this later in minutes and seconds both

                mTextFieldsec.text = "Time Remaining (sec) : " +(millisUntilFinished / (1000))

            }

            override fun onFinish() {
                timeFinish()
            }

        }.start()

    }

    private fun timeFinish(){
        val intent = Intent(this, ResultActivity::class.java)
        intent.putExtra(Constants.USER_NAME,mUserName)
        intent.putExtra(Constants.CORRECT_ANSWER,mCorrectAnswers)
        intent.putExtra(Constants.WRONG_ANSWER,mWrongAnswer)
        intent.putExtra(Constants.NOT_SELECTED,mNotSelected)
        intent.putExtra(Constants.TOTAL_QUESTIONS,progressBar?.max)
        intent.putExtra(Constants.SELECTED_QUIZ, mSelected_Quiz)

        // array list
        intent.putParcelableArrayListExtra(
            "QuestionsExtra",
            questionSelectedOptions as ArrayList<out Parcelable?>?
        )
        intent.putExtra(Constants.Send_Current_Position,sendCurrentPosition)
        startActivity(intent)
        this.overridePendingTransition(0, 0);


        finish()

    }


    private fun setQuestion() {
        progressBarPosition++
        defaultOptionsView()
        val question: Question =mQuestionsList!![mCurrentPosition - 1]

//        ivImage?.setImageResource(question.image)
        progressBar?.progress = progressBarPosition
        tvProgress?.text = "$progressBarPosition/${progressBar?.max}"
        tvQuestion?.text = question.question
        tvOptionOne?.text = question.optionOne
        tvOptionTwo?.text = question.optionTwo
        tvOptionThree?.text = question.optionThree
        tvOptionFour?.text = question.optionFour

        tvOptionOne?.setOnClickListener(this)
        tvOptionTwo?.setOnClickListener(this)
        tvOptionThree?.setOnClickListener(this)
        tvOptionFour?.setOnClickListener(this)
        btnSubmit?.setOnClickListener(this)

        tvOptionOne?.isEnabled = true
        tvOptionTwo?.isEnabled = true
        tvOptionThree?.isEnabled = true
        tvOptionFour?.isEnabled = true

        if(mCurrentPosition== maxQuestion+9){
            btnSubmit?.text = "FINISH"
        }else{
            btnSubmit?.text = "SUBMIT"
        }


    }

    override fun onClick(view: View?) {

        when(view?.id) {
            R.id.tv_option_one -> {
                tvOptionOne?.let {
                    selectedOptionView(it, 1)
                }
            }
            R.id.tv_option_two -> {
                tvOptionTwo?.let {
                    selectedOptionView(it, 2)
                }
            }
            R.id.tv_option_three -> {
                tvOptionThree?.let {
                    selectedOptionView(it, 3)
                }
            }
            R.id.tv_option_four -> {
                tvOptionFour?.let {
                    selectedOptionView(it, 4)
                }
            }


            R.id.btn_submit -> {

                    val vibrator = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
                    if (vibrator.hasVibrator()) { // Vibrator availability checking
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                            vibrator.vibrate(VibrationEffect.createOneShot(30, VibrationEffect.DEFAULT_AMPLITUDE)) // New vibrate method for API Level 26 or higher
                        } else {
                            vibrator.vibrate(500) // Vibrate method for below API Level 26
                        }
                    }


                val question = mQuestionsList?.get(mCurrentPosition - 1)
                    if (question!!.correctAnswer == mSelectedOptionPosition) {
                        mCorrectAnswers++
                    }else if(mSelectedOptionPosition==0){
                        mNotSelected++
                    }else{
                        mWrongAnswer++
                    }
                    questionSelectedOptions.add(mSelectedOptionPosition)

                if(btnSubmit?.text == "FINISH"){

                    val intent = Intent(this, ResultActivity::class.java)
                    intent.putExtra(Constants.USER_NAME,mUserName)
                    intent.putExtra(Constants.CORRECT_ANSWER,mCorrectAnswers)
                    intent.putExtra(Constants.WRONG_ANSWER,mWrongAnswer)
                    intent.putExtra(Constants.NOT_SELECTED,mNotSelected)
                    intent.putExtra(Constants.TOTAL_QUESTIONS,progressBar?.max)
                    intent.putExtra(Constants.SELECTED_QUIZ, mSelected_Quiz)
                    // array list
                    intent.putParcelableArrayListExtra(
                        "QuestionsExtra",
                        questionSelectedOptions as ArrayList<out Parcelable?>?
                    )
                    intent.putExtra(Constants.Send_Current_Position,sendCurrentPosition)

                    startActivity(intent)
                    this.overridePendingTransition(0, 0);


                    finish()
                    exitProcess(0)

                }

                mCurrentPosition++

                mSelectedOptionPosition =0

                setQuestion()
                }

            }

    }


    private fun selectedOptionView(tv:TextView,selectedOptionNum:Int){
        defaultOptionsView()
        mSelectedOptionPosition = selectedOptionNum
        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background= ContextCompat.getDrawable(
            this,
            R.drawable.selected_option_border_bg

        )

    }


    private fun defaultOptionsView(){

        val options= ArrayList<TextView>()
        tvOptionOne?.let {
            options.add(0,it)
        }
        tvOptionTwo?.let {
            options.add(1,it)
        }
        tvOptionThree?.let {
            options.add(2,it)
        }
        tvOptionFour?.let {
            options.add(3,it)
        }

        for(option in options){
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface=Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                this,
                R.drawable.default_option_border_bg

            )
        }

    }
}




