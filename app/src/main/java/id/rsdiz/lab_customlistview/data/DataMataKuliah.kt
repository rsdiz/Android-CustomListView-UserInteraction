package id.rsdiz.lab_customlistview.data

import id.rsdiz.lab_customlistview.R

object DataMataKuliah {

    private val nama = arrayOf(
            "Pengembangan Kepribadian",
            "Pemrograman Mobile",
            "Pemrograman Mobile Praktikum",
            "Bahasa Indonesia",
            "Penelitian Informatika",
            "Manajemen Proyek Perangkat Lunak",
            "Riset Operasi",
            "Rekayasa Web",
            "Pemrograman Jaringan"
    )

    private val deskripsi = arrayOf(
            "Mata kuliah Pengembangan Kepribadian merupakan mata kuliah yang bertujuan untuk memberikan pemahaman dan menumbuhkan kepribadian yang bertanggung jawab sebagai bekal mahasiswa dalam persaingan dunia kerja. Mata kuliah ini memberikan pengertian dan pemahaman tentang career skill, self marketing, career planning, hingga persiapan meghadapi rekrutmen kerja melalui latihan-latihan sederhana terstruktur.  Latihan sederhana terstruktur dimaksudkan untuk memotivasi mahasiswa sejak dini menggali potensi dan mencari bidang kerja yang sesuai dengan minat dan bakat.",
            "Mata kuliah ini mempelajari tentang perancagan dan pengembangan aplikasi android, mulai dari membuat aplikasi android sederhana hingga aplikasi android tersebut siap untuk dipublikasikan di playstore.",
            "Mata kuliah ini merupakan praktikum dari mata kuliah pemrograman mobile.",
            "Mata kuliah Bahasa Indonesia ditujukan untuk mengasah  kemahiran mahasiswa dalam berbahasa tulis dalam lingkup akademik. Mata kuliah ini disusun dengan pembekalan materi seperti penggunaan tanda baca, penyusunan kalimat efektif, penyusunan kerangka karangan,dan karangan untuk menghasilkan karya berupa proposal penelitian.",
            "Mata Kuliah ini membahas tentang cara pengumpulan informasi (information gathering) terkait tema penelitian, memilih topik penelitian yang diminati, menemukan judul penelitian, mempelajari tahapan-tahapan dalam proses penelitian.",
            "Mata kuliah Manajemen Proyek Perangkat Lunak berisi pengajaran mengenai Manajemen Proyek secara umum dan bagaimana penerapannya pada Proyek Pengembangan Perangkat Lunak yang memiliki karakteristik khusus. Tujuan perkuliahan: Mahasiswa mampumenganalisis, merencanakan, dan mendokumentasikan hal-hal yang diperlukan dalam melaksanakan tiap tahapan Proyek Pengembangan Perangkat Lunak.",
            "Aspek-aspek yang diberikan dalam matakuliah ini adalah pemodelan secara matematis Permasalahan produksi, transportasi, penugasan, jaringan, pemrograman dinamis, dan analisis keputusan.",
            "Mata kuliah Rekayasa Web merupakan lanjutan dari Pemrograman Web Dasar dan Pemrograman Web Lanjut. Jika mata kuliah Pemrograman Web Dasar lebih membahas pemrograman web sisi klien (client side programming), dan mata kuliah pemrograman Web lanjut membahas tentang pemrograman sisi server (server side programming), maka mata kuliah ini lebih membahas ke arah rekayasa dan implementasinya.",
            "Mata kuliah ini membahas terkait pengembangan aplikasi Jaringan, Routing, TCP Socket, TCP Client Server, UDP Socket, Implementasi Network Programming, Monitoring Sistem, Jaringan pomputer, Pemrograman Untuk Keamanan Jaringan."
    )

    private val kelas = arrayOf("A", "A", "II", "D", "F", "B", "A", "A", "A")

    private val ruang = arrayOf(
            "E.3.1 Kampus 1",
            "E.3.2 Kampus 1",
            "LK 1 Kampus 1",
            "D.0.2 Kampus 1",
            "H.3.2 Kampus 1",
            "D.2.1 Kampus 1",
            "H.3.2 Kampus 1",
            "D.0.2 Kampus 1",
            "E.3.3 Kampus 1"
    )

    private val jam = arrayOf(
            "Selasa, 10:40-12:20 WIB",
            "Rabu, 12:50-15:20 WIB",
            "Selasa, 14:40-18:10 WIB",
            "Kamis, 14:40-16:20 WIB",
            "Kamis, 08:50-10:30 WIB",
            "Kamis, 12:50-14:30 WIB",
            "Rabu, 09:40-12:10 WIB",
            "Jum\'at, 12:50-15:20 WIB",
            "Selasa, 07:00-09:30 WIB"
    )

    private val dosen = arrayOf(
            "Adhita Dwi Pandyki, M.Psi., Psikolog",
            "Fadil Indra Sanjaya, S.Kom., M.Kom.",
            "Fadil Indra Sanjaya, S.Kom., M.Kom.",
            "Oktarini Pratama S.Par M.Sc.",
            "Canggih Puspo Wibowo",
            "Yuli Asriningtias, M.Kom.",
            "Wahyu Sri Utami",
            "Yosef Murya Kusuma Ardhana, S.T., M.Kom.",
            "Tri Widodo, S.T., M.Kom."
    )

    private val sks = intArrayOf(2, 3, 2, 2, 2, 2, 3, 3, 3)

    private val cover = intArrayOf(
            R.drawable.images_assets_1,
            R.drawable.images_assets_2,
            R.drawable.images_assets_9,
            R.drawable.images_assets_3,
            R.drawable.images_assets_4,
            R.drawable.images_assets_5,
            R.drawable.images_assets_6,
            R.drawable.images_assets_7,
            R.drawable.images_assets_8
    )

    private val icon = intArrayOf(
            R.drawable.ic_person,
            R.drawable.ic_mobile,
            R.drawable.ic_mobile,
            R.drawable.ic_indonesia_flag,
            R.drawable.ic_search,
            R.drawable.ic_write,
            R.drawable.ic_stats,
            R.drawable.ic_world,
            R.drawable.ic_network
    )

    val getData: ArrayList<MataKuliah>
        get() {
            val list = arrayListOf<MataKuliah>()
            for (position in nama.indices) {
                val mataKuliah = MataKuliah()
                mataKuliah.nama = nama[position]
                mataKuliah.deskripsi = deskripsi[position]
                mataKuliah.kelas = kelas[position]
                mataKuliah.ruang = ruang[position]
                mataKuliah.jam = jam[position]
                mataKuliah.dosen = dosen[position]
                mataKuliah.sks = sks[position]
                mataKuliah.cover = cover[position]
                mataKuliah.icon = icon[position]
                list.add(mataKuliah)
            }
            return list
        }

}