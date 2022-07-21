package kr.ac.tukorea.helloworld

import android.app.Activity
import android.content.Intent
import android.os.Bundle

class SecondActivity:Activity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second)
        title = "Second 액티비티"

        var inIntent = intent
        var hapValue = 1
        var calculate = inIntent.getIntExtra("calculate",1)
        if (calculate == 1){
            hapValue = inIntent.getIntExtra("Num1",0) + inIntent.getIntExtra("Num2",0)
        }else if (calculate == 2){
            hapValue = inIntent.getIntExtra("Num1",0) - inIntent.getIntExtra("Num2",0)
        }else if (calculate == 3){
            hapValue = inIntent.getIntExtra("Num1",0) * inIntent.getIntExtra("Num2",1)
        }else {
            hapValue = inIntent.getIntExtra("Num1",0) / inIntent.getIntExtra("Num2",1)
        }

        var outIntent = Intent(applicationContext, MainActivity::class.java)
        outIntent.putExtra("Hap",hapValue)
        setResult(Activity.RESULT_OK,outIntent)
        finish()

    }

}