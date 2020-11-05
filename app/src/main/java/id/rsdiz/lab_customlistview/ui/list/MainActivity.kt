package id.rsdiz.lab_customlistview.ui.list

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import id.rsdiz.lab_customlistview.R
import id.rsdiz.lab_customlistview.data.DataMataKuliah
import id.rsdiz.lab_customlistview.data.MataKuliah
import id.rsdiz.lab_customlistview.ui.detail.DetailActivity

class MainActivity : AppCompatActivity() {
    private lateinit var listView: ListView
    private var matkulList: ArrayList<MataKuliah> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inisialisasi ListView
        listView = findViewById(R.id.listView)

        // Menambahkan data dari data source yang sudah dibuat ke list
        matkulList.addAll(DataMataKuliah.getData)

        // Atur adapter dari listView dengan custom adapter
        val adapter = MatkulAdapter(this, matkulList)
        listView.adapter = adapter

        // Menambah interaksi dari user berupa klik pada item
        listView.setOnItemClickListener { _, _, position, _ ->
            val selectedMatkul = matkulList[position]
            val detailIntent = DetailActivity.newIntent(this, selectedMatkul)
            startActivity(detailIntent)
        }
    }
}