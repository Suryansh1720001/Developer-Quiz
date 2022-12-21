package com.google.suryansh7202.developerquiz

import android.content.Context
import android.content.Intent
import android.os.*
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast



class TopicQuizName : AppCompatActivity() {
    private var mUserName: String? =null
    private var UserName: TextView? =null
    private var mSelected_Quiz: String? =null

     private var mCurrentPosition: Int =1



    override fun onCreate(savedInstanceState: Bundle?) {
        mUserName = intent.getStringExtra(Constants.USER_NAME)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_topic_quiz_name)

        UserName = findViewById(R.id.UserName)
        UserName?.setText("Hello, "+mUserName)

       val  Cplusplus = findViewById<ImageView>(R.id.iv_cplusplus)
      val  java = findViewById<ImageView>(R.id.iv_java)
        val python = findViewById<ImageView>(R.id.iv_python)
        val c = findViewById<ImageView>(R.id.iv_c)
        val html = findViewById<ImageView>(R.id.iv_html)
        val CSS = findViewById<ImageView>(R.id.iv_css)
        val javascript = findViewById<ImageView>(R.id.iv_javascript)
        val reactJS = findViewById<ImageView>(R.id.iv_reactjs)

        Cplusplus.setOnClickListener {
            vibration()
            mCurrentPosition =1
            mSelected_Quiz = "C++"
            val intent = Intent(this, QuizQuestionsActivity::class.java)
            intent.putExtra(Constants.USER_NAME, mUserName)
            intent.putExtra(Constants.CURRENT_POSITION,mCurrentPosition)
            intent.putExtra(Constants.SELECTED_QUIZ, mSelected_Quiz.toString())



            startActivity(intent)
            this.overridePendingTransition(0, 0);

            //
        }


        java.setOnClickListener {
            vibration()

            mCurrentPosition=11
            mSelected_Quiz = "Java"
            val intent = Intent(this, QuizQuestionsActivity::class.java)
            intent.putExtra(Constants.USER_NAME, mUserName)
            intent.putExtra(Constants.CURRENT_POSITION,mCurrentPosition)
            intent.putExtra(Constants.SELECTED_QUIZ, mSelected_Quiz.toString())



            startActivity(intent)
            this.overridePendingTransition(0, 0);

            //
        }


        python.setOnClickListener {
            vibration()

            mCurrentPosition=21
            mSelected_Quiz = "Python"
            val intent = Intent(this, QuizQuestionsActivity::class.java)
            intent.putExtra(Constants.USER_NAME, mUserName)
            intent.putExtra(Constants.CURRENT_POSITION,mCurrentPosition)
            intent.putExtra(Constants.SELECTED_QUIZ, mSelected_Quiz.toString())


            startActivity(intent)
            this.overridePendingTransition(0, 0);

            //
        }



       c.setOnClickListener {
           vibration()

           mCurrentPosition=31
            mSelected_Quiz = "C"
            val intent = Intent(this, QuizQuestionsActivity::class.java)
            intent.putExtra(Constants.USER_NAME, mUserName)
            intent.putExtra(Constants.CURRENT_POSITION,mCurrentPosition)
            intent.putExtra(Constants.SELECTED_QUIZ, mSelected_Quiz.toString())


            startActivity(intent)
           this.overridePendingTransition(0, 0);

           //
        }

        html.setOnClickListener{
            vibration()

            mCurrentPosition=41
            mSelected_Quiz = "HTML"
            val intent = Intent(this, QuizQuestionsActivity::class.java)
            intent.putExtra(Constants.USER_NAME, mUserName)
            intent.putExtra(Constants.CURRENT_POSITION,mCurrentPosition)
            intent.putExtra(Constants.SELECTED_QUIZ, mSelected_Quiz.toString())


            startActivity(intent)
            this.overridePendingTransition(0, 0);

            //
        }



        CSS.setOnClickListener{
            vibration()

            mCurrentPosition=51
            mSelected_Quiz = "CSS"
            val intent = Intent(this, QuizQuestionsActivity::class.java)
            intent.putExtra(Constants.USER_NAME, mUserName)
            intent.putExtra(Constants.CURRENT_POSITION,mCurrentPosition)
            intent.putExtra(Constants.SELECTED_QUIZ, mSelected_Quiz.toString())


            startActivity(intent)
            this.overridePendingTransition(0, 0);

            //
        }



        javascript.setOnClickListener{
            vibration()

            mCurrentPosition=61
            mSelected_Quiz = "JavaScript"
            val intent = Intent(this, QuizQuestionsActivity::class.java)
            intent.putExtra(Constants.USER_NAME, mUserName)
            intent.putExtra(Constants.CURRENT_POSITION,mCurrentPosition)
            intent.putExtra(Constants.SELECTED_QUIZ, mSelected_Quiz.toString())


            startActivity(intent)
            this.overridePendingTransition(0, 0);

            //
        }



        reactJS.setOnClickListener{
            vibration()

            mCurrentPosition=71
            mSelected_Quiz = "React JS"
            val intent = Intent(this, QuizQuestionsActivity::class.java)
            intent.putExtra(Constants.USER_NAME, mUserName)
            intent.putExtra(Constants.CURRENT_POSITION,mCurrentPosition)
            intent.putExtra(Constants.SELECTED_QUIZ, mSelected_Quiz.toString())


            startActivity(intent)
            this.overridePendingTransition(0, 0);

            //
        }






    }

    private fun vibration(){
        val vibrator = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
        if (vibrator.hasVibrator()) { // Vibrator availability checking
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                vibrator.vibrate(VibrationEffect.createOneShot(30, VibrationEffect.DEFAULT_AMPLITUDE)) // New vibrate method for API Level 26 or higher
            } else {
                vibrator.vibrate(500) // Vibrate method for below API Level 26
            }
        }
    }
}
