package kr.ac.tukorea.helloworld

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import org.w3c.dom.Text
import java.util.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_main)
        title="실습 5-1"

        var params = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.MATCH_PARENT)

        var baseLayout = LinearLayout(this)
        baseLayout.orientation = LinearLayout.VERTICAL
        baseLayout.setBackgroundColor(Color.rgb(0,255,0))
        setContentView(baseLayout,params)

        var btn = Button(this)
        btn.text= "버튼입니다"
        btn.setBackgroundColor(Color.LTGRAY)
        baseLayout.addView(btn)

        var red = 0
        var green = 0
        var blue = 0

        btn.setOnClickListener {
            Toast.makeText(applicationContext,"코드로 생성한 버튼",Toast.LENGTH_SHORT).show()
            red = Random().nextInt(256)
            green = Random().nextInt(256)
            blue = Random().nextInt(256)
            baseLayout.setBackgroundColor(Color.rgb(red,green,blue))
        }
    }
}