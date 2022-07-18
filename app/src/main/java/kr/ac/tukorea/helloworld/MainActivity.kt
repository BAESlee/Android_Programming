package kr.ac.tukorea.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    lateinit var num1 : EditText
    lateinit var num2 : EditText
    lateinit var btnAdd : Button
    lateinit var btnSub : Button
    lateinit var btnMul : Button
    lateinit var btnDiv : Button
    lateinit var textResult : TextView
    lateinit var number1 : String
    lateinit var number2 : String
    var result : Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        num1 = findViewById<EditText>(R.id.num1)
        num2 = findViewById<EditText>(R.id.num2)
        btnAdd = findViewById<Button>(R.id.btnAdd)
        btnSub = findViewById<Button>(R.id.btnSub)
        btnMul = findViewById<Button>(R.id.btnMul)
        btnDiv = findViewById<Button>(R.id.btnDiv)
        textResult = findViewById<TextView>(R.id.textResult)

        btnAdd.setOnClickListener {
            number1 = num1.text.toString()
            number2 = num2.text.toString()
            result = Integer.parseInt(number1) + Integer.parseInt(number2)
            textResult.text = "계산결과: ${result.toString()}"
        }
        btnSub.setOnClickListener {
            number1 = num1.text.toString()
            number2 = num2.text.toString()
            result = Integer.parseInt(number1) - Integer.parseInt(number2)
            textResult.text = "계산결과: ${result.toString()}"
        }
        btnMul.setOnClickListener {
            number1 = num1.text.toString()
            number2 = num2.text.toString()
            result = Integer.parseInt(number1) * Integer.parseInt(number2)
            textResult.text = "계산결과: ${result.toString()}"
        }
        btnDiv.setOnClickListener {
            number1 = num1.text.toString()
            number2 = num2.text.toString()
            result = Integer.parseInt(number1) / Integer.parseInt(number2)
            textResult.text = "계산결과: ${result.toString()}"
        }
    }
}