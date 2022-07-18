package kr.ac.tukorea.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    lateinit var start : CheckBox
    lateinit var question : TextView
    lateinit var choice : RadioGroup
    lateinit var rbDog : RadioButton
    lateinit var rbCat : RadioButton
    lateinit var rbRab : RadioButton
    lateinit var complete : Button
    lateinit var image : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title="애완동물 사진 보기"

        start = findViewById<CheckBox>(R.id.start)
        choice = findViewById<RadioGroup>(R.id.rg)
        question = findViewById<TextView>(R.id.text2)
        rbDog = findViewById<RadioButton>(R.id.rb1)
        rbCat = findViewById<RadioButton>(R.id.rb2)
        rbRab = findViewById<RadioButton>(R.id.rb3)
        complete = findViewById<Button>(R.id.complete)
        image = findViewById<ImageView>(R.id.image)

        start.setOnCheckedChangeListener{ compoundButton, b ->
            if(start.isChecked == true){
                question.visibility = android.view.View.VISIBLE
                choice.visibility = android.view.View.VISIBLE
                rbDog.visibility = android.view.View.VISIBLE
                rbCat.visibility = android.view.View.VISIBLE
                rbRab.visibility = android.view.View.VISIBLE
                complete.visibility = android.view.View.VISIBLE
                image.visibility = android.view.View.VISIBLE
                image.setImageResource(0)
            }else {
                question.visibility = android.view.View.GONE
                choice.visibility = android.view.View.GONE
                rbDog.visibility = android.view.View.GONE
                rbCat.visibility = android.view.View.GONE
                rbRab.visibility = android.view.View.GONE
                complete.visibility = android.view.View.GONE
                image.visibility = android.view.View.GONE
            }
        }

        complete.setOnClickListener {
            when(choice.checkedRadioButtonId){
                R.id.rb1 -> image.setImageResource(R.drawable.dog)
                R.id.rb2 -> image.setImageResource(R.drawable.cat)
                R.id.rb3 -> image.setImageResource(R.drawable.rabbit)
                else -> Toast.makeText(applicationContext,"선택 먼저 하기",Toast.LENGTH_SHORT).show()
            }
        }
    }
}