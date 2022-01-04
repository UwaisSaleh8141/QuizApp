package com.casper.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {

    var tvUsername : TextView? = null
    var tvScore : TextView? = null
    private var btnFinish : Button? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        tvUsername = findViewById(R.id.tvUsername)
        tvScore = findViewById(R.id.tvScore)
        btnFinish = findViewById(R.id.btnFinish)

        val username = intent.getStringExtra(Constants.USER_NAME)
        val totalQn = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        val correctAns = intent.getIntExtra(Constants.CORRECT_ANSWER, 0)
        tvUsername?.text = username

        tvScore?.text = "Your Score Is $correctAns out of $totalQn"

        btnFinish?.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}