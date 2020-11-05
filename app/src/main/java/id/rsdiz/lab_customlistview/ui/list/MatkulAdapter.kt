package id.rsdiz.lab_customlistview.ui.list

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import id.rsdiz.lab_customlistview.R
import id.rsdiz.lab_customlistview.data.MataKuliah

class MatkulAdapter(
    private val context: Context,
    private val dataSource: ArrayList<MataKuliah>
): BaseAdapter() {
    private val inflater: LayoutInflater =
        context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getCount(): Int {
        return dataSource.size
    }

    override fun getItem(position: Int): Any {
        return dataSource[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View
        val holder: ViewHolder

        // Cek apakah tamplan sudah ada, jika true maka tidak perlu meng-inflate dari layout
        // dan memanggil fungsi findViewById() lagi
        if (convertView == null) {
            view = inflater.inflate(R.layout.row_item, parent, false)

            holder = ViewHolder()
            holder.gambarIcon = view.findViewById(R.id.gambar) as ImageView
            holder.namaMatkul = view.findViewById(R.id.nama) as TextView
            holder.deskripsiMatkul =  view.findViewById(R.id.deskripsi) as TextView

            view.tag = holder
        } else {
            view = convertView
            holder = convertView.tag as ViewHolder
        }

        val gambarIcon = holder.gambarIcon
        val namaMatkul = holder.namaMatkul
        val deskripsiMatkul = holder.deskripsiMatkul

        // Mengambil data matkul yang sesuai
        val matkul = getItem(position) as MataKuliah

        // Mengubah konten tiap elemen widget
        Glide
            .with(context)
            .load(matkul.icon)
            .centerInside()
            .into(gambarIcon)
        namaMatkul.text = matkul.nama
        deskripsiMatkul.text = matkul.deskripsi

        return view
    }

    private class ViewHolder {
        lateinit var gambarIcon: ImageView
        lateinit var namaMatkul: TextView
        lateinit var deskripsiMatkul: TextView
    }
}