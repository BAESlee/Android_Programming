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
    lateinit var image : ImageView
    lateinit var edit : EditText
    var angle : Float? = 0f
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        var mInflater = menuInflater
        mInflater.inflate(R.menu.menu1,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.rotate -> {
                angle = edit.text.toString().toFloatOrNull()
                if (angle == null){
                    angle = 0f
                }
                image.rotation = angle!!
                return true
            }
            R.id.item1 -> {
                image.setImageResource(R.drawable.dog)
                return true
            }
            R.id.item2 -> {
                image.setImageResource(R.drawable.cat)
                return true
            }
            R.id.item3 -> {
                image.setImageResource(R.drawable.rabbit)
                return true
            }
        }
        return false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "제주"
        image = findViewById<ImageView>(R.id.image)
        edit = findViewById<EditText>(R.id.edit)
    }
}
