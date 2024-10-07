package edu.temple.simplerecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Set up RecyclerView display responsibility
        val numbers = Array(100) {it + 1}
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val displayTextView = findViewById<TextView>(R.id.displayTextView)
        recyclerView.layoutManager = GridLayoutManager(this, 4)

        // Step 2: Define lambda to modify displayTextView size, (define call back function)
        val callBack = { num: Int ->
            displayTextView.textSize = num.toFloat()
        }


        // Step 3: Pass lambda to adapter
        recyclerView.adapter = NumberDisplayAdapter(numbers)


    }

}