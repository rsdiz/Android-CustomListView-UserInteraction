package id.rsdiz.lab_customlistview.ui.detail

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
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

        // inisialisasi data dari extra intent
        val namaValue = intent.extras?.getString(EXTRA_NAMA)
        val deskripsiValue = intent.extras?.getString(EXTRA_DESKRIPSI)
        val kelasValue = intent.extras?.getString(EXTRA_KELAS)
        val ruangValue = intent.extras?.getString(EXTRA_RUANG)
        val jamValue = intent.extras?.getString(EXTRA_JAM)
        val dosenValue = intent.extras?.getString(EXTRA_DOSEN)
        val sksValue = intent.extras?.getInt(EXTRA_SKS)
        val coverValue = intent.extras?.getInt(EXTRA_COVER)
        val iconValue = intent.extras?.getInt(EXTRA_ICON)
        // inisialisasi widget yang berada pada layout
        val cover = findViewById<ImageView>(R.id.gambar_cover)
        val icon = findViewById<ImageView>(R.id.gambar_icon)
        val nama = findViewById<TextView>(R.id.nama_matkul)
        val deskripsi = findViewById<TextView>(R.id.deskripsi_matkul)
        val kelas = findViewById<TextView>(R.id.value_kelas)
        val ruang = findViewById<TextView>(R.id.value_ruang)
        val jam = findViewById<TextView>(R.id.value_waktu)
        val dosen = findViewById<TextView>(R.id.value_dosen)
        val sks = findViewById<TextView>(R.id.value_sks)
        // Mengubah konten yang berada pada tiap widget
        Glide
            .with(this)
            .load(coverValue)
            .centerCrop()
            .into(cover)
        Glide
            .with(this)
            .load(iconValue)
            .fitCenter()
            .into(icon)
        nama.text = namaValue
        deskripsi.text = deskripsiValue
        kelas.text = kelasValue
        ruang.text = ruangValue
        jam.text = jamValue
        dosen.text = dosenValue
        sks.text = sksValue.toString()
    }
}