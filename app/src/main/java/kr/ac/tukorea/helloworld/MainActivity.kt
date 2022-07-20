package kr.ac.tukorea.helloworld

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {

    lateinit var baseLayout : LinearLayout
    lateinit var button1 : Button
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        var mInflater = menuInflater
        mInflater.inflate(R.menu.menu1,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.red -> {
                baseLayout.setBackgroundColor(Color.RED)
                return true
            }
            R.id.green -> {
                baseLayout.setBackgroundColor(Color.GREEN)
                return true
            }
            R.id.blue -> {
                baseLayout.setBackgroundColor(Color.BLUE)
                return true
            }
            R.id.rotate -> {
                button1.rotation += 45f
                return true
            }
            R.id.size -> {
                button1.scaleX += 2f
                return true
            }
        }
        return false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "배경 바꾸기"
        baseLayout = findViewById<LinearLayout>(R.id.layout)
        button1 = findViewById<Button>(R.id.btn)

        button1.setOnClickListener {
            button1.rotation = 0f
            button1.scaleX = 1f
        }
    }
}
