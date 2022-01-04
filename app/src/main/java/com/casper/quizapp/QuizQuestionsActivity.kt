package com.casper.quizapp

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.core.content.ContextCompat

class QuizQuestionsActivity : AppCompatActivity(), View.OnClickListener{

    private var mCurrentPosition : Int = 1
    private var mQuestionsList : ArrayList<Questions>? = null
    private var mSelectedOptionPosition : Int = 0

    var progressBar : ProgressBar? = null
    var tvProgress : TextView? = null
    var tvQuestion : TextView? = null
    var ivImage : ImageView? = null
    var tvOption1 : TextView? = null
    var tvOption2 : TextView? = null
    var tvOption3 : TextView? = null
    var tvOption4 : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        progressBar = findViewById(R.id.progressBar)
        tvProgress = findViewById(R.id.tvProgress)
        tvQuestion = findViewById(R.id.tvQuestion)
        ivImage = findViewById(R.id.ivImage)
        tvOption1 = findViewById(R.id.tvOption1)
        tvOption2 = findViewById(R.id.tvOption2)
        tvOption3 = findViewById(R.id.tvOption3)
        tvOption4 = findViewById(R.id.tvOption4)

        mQuestionsList = Constants.getQuestions()

        setQuestions()

        tvOption1?.setOnClickListener(this)
        tvOption2?.setOnClickListener(this)
        tvOption3?.setOnClickListener(this)
        tvOption4?.setOnClickListener(this)





    }

    private fun setQuestions(){

        mCurrentPosition = 1
        val question = mQuestionsList!![mCurrentPosition-1]

        defaultOptionsView()

        progressBar?.progress = mCurrentPosition
        tvProgress?.text = "$mCurrentPosition" + "/" + progressBar?.max
        tvQuestion?.text = question!!.question
        ivImage?.setImageResource(question.image)
        tvOption1?.text = question.optionOne
        tvOption2?.text = question.optionTwo
        tvOption3?.text = question.optionThree
        tvOption4?.text = question.optionFour

    }

    private fun defaultOptionsView(){
        val options = java.util.ArrayList<TextView>()
        tvOption1?.let { options.add(0, it) }
        tvOption2?.let { options.add(1, it) }
        tvOption3?.let { options.add(2, it) }
        tvOption4?.let { options.add(3, it) }

        for(option in options){
            option.setTextColor(Color.parseColor("#6C757D"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(this,R.drawable.default_option_border)
        }

    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.tvOption1 ->{
                tvOption1?.let { selectedOptionView(it, 1) }
            }
            R.id.tvOption2 ->{
                tvOption2?.let { selectedOptionView(it, 2) }
            }
            R.id.tvOption3 ->{
                tvOption3?.let { selectedOptionView(it, 3) }
            }
            R.id.tvOption4 ->{
                tvOption4?.let { selectedOptionView(it, 4) }
            }

        }
    }

    private fun selectedOptionView(tv : TextView, selectedOptionNum : Int){
        defaultOptionsView()
        mSelectedOptionPosition = selectedOptionNum

        tv.setTextColor(Color.parseColor("#FF000000"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(this,R.drawable.selected_option_border)

    }
}