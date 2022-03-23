package eu.tutorials.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class FinishActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        val tvname:TextView=findViewById(R.id.tv_name)
        val tvscore:TextView=findViewById(R.id.tv_score)
        val btnFinish:Button=findViewById(R.id.btn_finish)

         tvname.text=intent.getStringExtra(Constants.USER_NAME)
        val totalquestion=intent.getIntExtra(Constants.TOTAL_QUESTIONS,0)
        val correctanswr=intent.getIntExtra(Constants.CORRECT_ANSWER,0)

        tvscore.text="Your score is $correctanswr out of $totalquestion "

        btnFinish.setOnClickListener(){
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}