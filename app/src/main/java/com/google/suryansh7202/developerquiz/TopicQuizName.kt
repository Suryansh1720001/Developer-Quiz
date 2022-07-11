package com.google.suryansh7202.developerquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast



class TopicQuizName : AppCompatActivity() {
    private var mUserName: String? =null
    private var UserName: TextView? =null
    private var mSelected_Quiz: String? =null
//    private var Cplusplus : ImageView?= null
    private var java : ImageView?= null
     private var mCurrentPosition: Int =1
     private var progressBar: ProgressBar? =null
     private var tvProgress: TextView?= null



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

        Cplusplus.setOnClickListener {
            mCurrentPosition =1
            mSelected_Quiz = "C++"
            val intent = Intent(this, QuizQuestionsActivity::class.java)
            intent.putExtra(Constants.USER_NAME, mUserName)
            intent.putExtra(Constants.CURRENT_POSITION,mCurrentPosition)
            intent.putExtra(Constants.SELECTED_QUIZ, mSelected_Quiz.toString())
//            Toast.makeText(this,"${mSelected_Quiz.toString()}",Toast.LENGTH_LONG).show()



            startActivity(intent)
            finish()
        }


        java.setOnClickListener {
            mCurrentPosition=11
            mSelected_Quiz = "Java"
            val intent = Intent(this, QuizQuestionsActivity::class.java)
            intent.putExtra(Constants.USER_NAME, mUserName)
            intent.putExtra(Constants.CURRENT_POSITION,mCurrentPosition)
            intent.putExtra(Constants.SELECTED_QUIZ, mSelected_Quiz.toString())
//            Toast.makeText(this,"${mSelected_Quiz.toString()}", Toast.LENGTH_LONG).show()



            startActivity(intent)
            finish()
        }


        python.setOnClickListener {
            mCurrentPosition=21
            mSelected_Quiz = "Python"
            val intent = Intent(this, QuizQuestionsActivity::class.java)
            intent.putExtra(Constants.USER_NAME, mUserName)
            intent.putExtra(Constants.CURRENT_POSITION,mCurrentPosition)
            intent.putExtra(Constants.SELECTED_QUIZ, mSelected_Quiz.toString())


            startActivity(intent)
            finish()
        }



       c.setOnClickListener {
            mCurrentPosition=31
            mSelected_Quiz = "C"
            val intent = Intent(this, QuizQuestionsActivity::class.java)
            intent.putExtra(Constants.USER_NAME, mUserName)
            intent.putExtra(Constants.CURRENT_POSITION,mCurrentPosition)
            intent.putExtra(Constants.SELECTED_QUIZ, mSelected_Quiz.toString())


            startActivity(intent)
            finish()
        }



    }
}
