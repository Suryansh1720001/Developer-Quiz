package com.google.suryansh7202.developerquiz

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
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

    private var mCurrentPosition: Int =1
    var pieChart: PieChart? = null
    private var mQuestionsList: ArrayList<Question>? =null
    val mquestionSelectedOptions =  ArrayList<Int>()

    private var maxQuestion : Int = 10
    private var progressBarPosition =0
    private var sendCurrentPosition:Int = 0

    private var mCorrectAnswers: Int = 0
    private var mWrongAnswer: Int = 0
    private var mNotSelected: Int = 0

    private var Anaysis: TextView? = null
    private var Solution: TextView? = null




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pie_chart)
        val questionSelectedOptions = intent.getSerializableExtra("QuestionsExtra") as ArrayList<*>?
        sendCurrentPosition = intent.getIntExtra(Constants.Send_Current_Position, 0)
        mCorrectAnswers = intent.getIntExtra(Constants.CORRECT_ANSWER, 0)
        mWrongAnswer = intent.getIntExtra(Constants.WRONG_ANSWER, 0)
        mNotSelected = intent.getIntExtra(Constants.NOT_SELECTED, 0)
        maxQuestion = sendCurrentPosition

        Anaysis = findViewById(R.id.Analysis)
        Solution = findViewById(R.id.Solution)

        Anaysis?.setTextColor(Color.parseColor("#363A43"))
        Anaysis?.background = ContextCompat.getDrawable(
            this,
            R.drawable.selected_result_option

        )


        Solution?.setOnClickListener{
            Anaysis?.setTextColor(Color.parseColor("#7A8089"))
            Anaysis?.background = ContextCompat.getDrawable(
                this,
                R.drawable.not_selected_result_option

            )

            Solution?.setTextColor(Color.parseColor("#363A43"))
                Solution?.background = ContextCompat.getDrawable(
                    this,
            R.drawable.selected_result_option
                )


                    val intent = Intent(this, com.google.suryansh7202.developerquiz.Solution::class.java)
            intent.putParcelableArrayListExtra(
                "QuestionsExtra",
                questionSelectedOptions as ArrayList<out Parcelable?>?
            )

            intent.putExtra(Constants.Send_Current_Position,sendCurrentPosition)
            Toast.makeText(this,"$sendCurrentPosition",Toast.LENGTH_LONG).show()

            intent.putExtra(Constants.CORRECT_ANSWER,mCorrectAnswers)
            intent.putExtra(Constants.WRONG_ANSWER,mWrongAnswer)
            intent.putExtra(Constants.NOT_SELECTED,mNotSelected)

//            intent.putExtra(Constants.CORRECT_ANSWER,CorrectAns)
//            intent.putExtra(Constants.WRONG_ANSWER,WrongAns)
//            intent.putExtra(Constants.NOT_SELECTED,NotSelected)

            startActivity(intent)
finish()



    }










//        mCurrentPosition = intent.getIntExtra(Constants.CURRENT_POSITION,0)
//        maxQuestion = mCurrentPosition

        correctAnswer = findViewById(R.id.CorrectAnswer)
        wrongAnswer = findViewById(R.id.wrong_answer)
        notSelected = findViewById(R.id.not_selected)






        pieChart = findViewById(R.id.piechart);
        mQuestionsList = Constants.getQuestions()


        Toast.makeText(this,"Correct ans = $mCorrectAnswers",Toast.LENGTH_LONG).show()
        Toast.makeText(this,"wrong ans = $mWrongAnswer",Toast.LENGTH_LONG).show()
        Toast.makeText(this,"not selected ans = $mNotSelected",Toast.LENGTH_LONG).show()






        // Creating a method setData()
        // to set the text in text view and pie chart
        Toast.makeText(this,"$questionSelectedOptions",Toast.LENGTH_LONG).show()
        setData();
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


