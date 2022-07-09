package com.google.suryansh7202.developerquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView


 class TopicQuizName : AppCompatActivity() {
    private var mUserName: String? =null
    private var UserName: TextView? =null
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
        UserName?.setText("Hello, "+mUserName +" \uD83E\uDD20")

       val  Cplusplus = findViewById<ImageView>(R.id.iv_cplusplus)
      val  java = findViewById<ImageView>(R.id.iv_java)

        Cplusplus.setOnClickListener {
            mCurrentPosition =1
            val intent = Intent(this, QuizQuestionsActivity::class.java)
            intent.putExtra(Constants.USER_NAME, mUserName)
            intent.putExtra(Constants.CURRENT_POSITION,mCurrentPosition)

            startActivity(intent)
            finish()
        }


        java.setOnClickListener {
            mCurrentPosition=11
            val intent = Intent(this, QuizQuestionsActivity::class.java)
            intent.putExtra(Constants.USER_NAME, mUserName)
            intent.putExtra(Constants.CURRENT_POSITION,mCurrentPosition)

            startActivity(intent)
            finish()
        }



    }
}
