package com.google.suryansh7202.developerquiz

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import org.eazegraph.lib.charts.PieChart
import org.eazegraph.lib.models.PieModel



class PieChart : AppCompatActivity() {

    var correctAnswer: TextView? = null
    var wrongAnswer: TextView? = null
    var notSelected: TextView? = null

    var pieChart: PieChart? = null
    private var mQuestionsList: ArrayList<Question>? =null
    var mquestionSelectedOptions =  ArrayList<Int>()

    private var maxQuestion : Int = 10
    private var sendCurrentPosition:Int = 0

    private var mCorrectAnswers: Int = 0
    private var mWrongAnswer: Int = 0
    private var mNotSelected: Int = 0

    private var Anaysis: TextView? = null
    private var Solution: TextView? = null

    private var extraNotSelectedby_timelimit: Int = 0
    private var not: Int = 0
    private var mSelected_Quiz: String? =null
    private var tvResult :TextView?=null




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pie_chart)
        val questionSelectedOptions = intent.getSerializableExtra("QuestionsExtra") as ArrayList<Int>?
        val tvScore = findViewById<TextView>(R.id.tv_score)
        val TotalQuestion = intent.getIntExtra(Constants.TOTAL_QUESTIONS,0)

        val totalques = findViewById<TextView>(R.id.totalQue)
        totalques.text = TotalQuestion.toString()

        sendCurrentPosition = intent.getIntExtra(Constants.Send_Current_Position, 0)
        mSelected_Quiz = intent.getStringExtra(Constants.SELECTED_QUIZ)
        mCorrectAnswers = intent.getIntExtra(Constants.CORRECT_ANSWER, 0)
        mWrongAnswer = intent.getIntExtra(Constants.WRONG_ANSWER, 0)
        mNotSelected = intent.getIntExtra(Constants.NOT_SELECTED, 0)
        maxQuestion = sendCurrentPosition
        tvResult = findViewById(R.id.tv_result)

        tvResult?.text = mSelected_Quiz
        mquestionSelectedOptions.addAll(questionSelectedOptions!!)

        tvScore.text = "★ Your Score is ${mCorrectAnswers} out of ${TotalQuestion}."

        for( i in (mquestionSelectedOptions.size+1)..10 ){
            mquestionSelectedOptions.add(0)
        }





        for(i in mquestionSelectedOptions){
            if(i==0){
                extraNotSelectedby_timelimit++
            }
        }

        mNotSelected = extraNotSelectedby_timelimit



        Anaysis = findViewById(R.id.Analysis)
        Solution = findViewById(R.id.Solution)


        setButtonColour(Anaysis)

        Solution?.setOnClickListener{
            Anaysis?.setTextColor(Color.parseColor("#7A8089"))
            Anaysis?.background = ContextCompat.getDrawable(
                this,
                R.drawable.not_selected_result_option

            )

                    val intent = Intent(this, com.google.suryansh7202.developerquiz.Solution::class.java)
            intent.putParcelableArrayListExtra(
                "QuestionsExtra",
                questionSelectedOptions as ArrayList<out Parcelable?>?
            )

            intent.putExtra(Constants.Send_Current_Position,sendCurrentPosition)


            intent.putExtra(Constants.CORRECT_ANSWER,mCorrectAnswers)
            intent.putExtra(Constants.WRONG_ANSWER,mWrongAnswer)
            intent.putExtra(Constants.NOT_SELECTED,mNotSelected)
            intent.putExtra(Constants.SELECTED_QUIZ, mSelected_Quiz)
            intent.putExtra(Constants.TOTAL_QUESTIONS,TotalQuestion)
            startActivity(intent)
            this.overridePendingTransition(0, 0);

            finish()



    }



        correctAnswer = findViewById(R.id.CorrectAnswer)
        wrongAnswer = findViewById(R.id.wrong_answer)
        notSelected = findViewById(R.id.not_selected)






        pieChart = findViewById(R.id.piechart);
        mQuestionsList = Constants.getQuestions()




        setData();


    }



    private fun setButtonColour(Analysis: TextView?) {

        Analysis?.setTextColor(Color.parseColor("#363A43"))
        Analysis?.background = ContextCompat.getDrawable(
            this,
            R.drawable.selected_result_option

        )
    }


    private fun setData() {

        // Set the percentage of language used
        correctAnswer!!.text = mCorrectAnswers.toString()
        wrongAnswer?.text = mWrongAnswer.toString()
        notSelected?.text = mNotSelected.toString()

        // Set the data and color to the pie chart
        pieChart!!.addPieSlice(
            PieModel(
                "R", correctAnswer!!.text.toString().toInt().toFloat(),
                Color.parseColor("#66BB6A")
            )
        )
        pieChart!!.addPieSlice(
            PieModel(
                "Python", wrongAnswer?.text.toString().toInt().toFloat(),
                Color.parseColor("#EF5350")
            )
        )
        pieChart!!.addPieSlice(
            PieModel(
                "C++", notSelected?.text.toString().toInt().toFloat(),
                Color.parseColor("#FFA726")
            )
        )


        // To animate the pie chart
        pieChart!!.startAnimation()
    }



}


