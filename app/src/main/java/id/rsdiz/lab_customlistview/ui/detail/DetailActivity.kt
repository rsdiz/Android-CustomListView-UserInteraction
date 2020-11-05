package id.rsdiz.lab_customlistview.ui.detail

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.rsdiz.lab_customlistview.R
import id.rsdiz.lab_customlistview.data.MataKuliah

class DetailActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_NAMA = "nama"
        const val EXTRA_DESKRIPSI = "deskripsi"
        const val EXTRA_KELAS = "kelas"
        const val EXTRA_RUANG = "ruang"
        const val EXTRA_JAM = "jam"
        const val EXTRA_DOSEN = "dosen"
        const val EXTRA_SKS = "sks"
        const val EXTRA_COVER = "cover"
        const val EXTRA_ICON = "icon"

        /**
         * Fungsi untuk membuat intent baru yang meneruskan data (passing object)
         *
         * @param context
         * @param mataKuliah
         */
        fun newIntent(context: Context, mataKuliah: MataKuliah): Intent {
            val detailIntent = Intent(context, DetailActivity::class.java)

            detailIntent.putExtra(EXTRA_NAMA, mataKuliah.nama)
            detailIntent.putExtra(EXTRA_DESKRIPSI, mataKuliah.deskripsi)
            detailIntent.putExtra(EXTRA_KELAS, mataKuliah.kelas)
            detailIntent.putExtra(EXTRA_RUANG, mataKuliah.ruang)
            detailIntent.putExtra(EXTRA_JAM, mataKuliah.jam)
            detailIntent.putExtra(EXTRA_DOSEN, mataKuliah.dosen)
            detailIntent.putExtra(EXTRA_SKS, mataKuliah.sks)
            detailIntent.putExtra(EXTRA_COVER, mataKuliah.cover)
            detailIntent.putExtra(EXTRA_ICON, mataKuliah.icon)

            return detailIntent
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
    }
}