package kr.ac.tukorea.helloworld

import android.app.Activity
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "메인 액티비티"

        var cal = findViewById<Button>(R.id.cal)
        cal.setOnClickListener {
            var sum = findViewById<RadioButton>(R.id.sum)
            var sub = findViewById<RadioButton>(R.id.sub)
            var mul = findViewById<RadioButton>(R.id.mul)
            var div = findViewById<RadioButton>(R.id.div)
            var num1 = findViewById<EditText>(R.id.num1)
            var num2 = findViewById<EditText>(R.id.num2)
            var intent = Intent(applicationContext, SecondActivity::class.java)
            intent.putExtra("Num1",num1.text.toString().toIntOrNull())
            intent.putExtra("Num2",num2.text.toString().toIntOrNull())

            if(sum.isChecked == true){
                intent.putExtra("calculate",1)
            } else if (sub.isChecked == true){
                intent.putExtra("calculate",2)
            } else if (mul.isChecked == true){
                intent.putExtra("calculate",3)
            } else {
                intent.putExtra("calculate",4)
            }

            startActivityForResult(intent, 0)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(resultCode == Activity.RESULT_OK){
            var hap = data!!.getIntExtra("Hap",0)
            Toast.makeText(applicationContext,"합계: $hap",Toast.LENGTH_SHORT).show()
        }
    }
}
