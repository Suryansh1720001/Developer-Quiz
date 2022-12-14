package com.google.suryansh7202.developerquiz

import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.VibrationEffect
import android.os.Vibrator
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnStart: Button = findViewById(R.id.btnStart)
        val etname: EditText = findViewById(R.id.etname)



        btnStart.setOnClickListener {

            val vibrator = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
            if (vibrator.hasVibrator()) { // Vibrator availability checking
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                        vibrator.vibrate(VibrationEffect.createOneShot(30, VibrationEffect.DEFAULT_AMPLITUDE)) // New vibrate method for API Level 26 or higher
                    } else {
                    vibrator.vibrate(500) // Vibrate method for below API Level 26
                }
            }

            if(etname.text.isEmpty()){
                Toast.makeText(this,"Please enter your name!" , Toast.LENGTH_LONG).show()
            }else{
                val intent = Intent(this,TopicQuizName::class.java)
                intent.putExtra(Constants.USER_NAME,etname.text.toString())
                startActivity(intent)
                this.overridePendingTransition(0, 0);

                finish()
            }
        }
    }
}