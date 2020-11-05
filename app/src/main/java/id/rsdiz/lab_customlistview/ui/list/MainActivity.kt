package id.rsdiz.lab_customlistview.ui.list

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import id.rsdiz.lab_customlistview.R

class MainActivity : AppCompatActivity() {
    private lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inisialisasi ListView
        listView = findViewById(R.id.listView)
    }
}