package com.ad_srtarevolution.course_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class KorneaActivity extends AppCompatActivity {
    ListView Lv_Kornea;
    private String[] listPKornea=new String[]{
            "Degenerasi Makula","Ablasi Retina","Mata Juling (Strabismus)"

    };

    private String[] listPenjelasan=new String[]{
            "&nbsp;&nbsp;Degenerasi makula adalah sebuah penyakit mata yang menyerang pada bagian " +
                    "makula sehingga menyebabkan mata tidak bisa melihat dengan jelas atau penglihatan " +
                    "kabur. Makula merupakan sebuah organ kecil pada mata yang terletak dibagian belakang " +
                    "mata dan berfungsi untuk mengirimkan sinyal gambar dari mata ke bagian otak. Penyakit ini " +
                    "paling sering terjadi pada orang tua<br><br><b>Gejala Degenerasi Makula</b>" +
                    "<ol><li>Penglihatan mata menjadi kabur atau tidak fokus</li><li>Adanya garis gelombang dalam penglihatan</li>" +
                    "<li>Tidak bisa mengenal warna dengan baik</li><li>Membutuhkan cahaya yang sangat terang untuk membaca</li>" +
                    "<li>Sulit untuk mengenali wajah</li><li>Tidak bisa melihat warna cerah</li><li>Mengalami halusinasi dalam melihat warna dan gelombang cahaya</li>" +
                    "</ol><br><b>Penyebab Degenerasi Makula</b><ol><li>Pertambahan usia yang biasanya terjadi pada orang tua dengan usia lebih dari 65 tahun.</li>" +
                    "<li>Adanya riwayat keluarga yang mengalami degenerasi makula</li><li>Kebiasaan merokok</li><li>Riwayat penyakit jantung dan kolesterol tinggi</li>" +
                    "<li>Terlalu banyak konsumsi sayur dan buah seperti diet hanya dengan konsumsi sayur dan buah.</li></ol>"

            ,"&nbsp;&nbsp;Ablasi retina adalah sebuah kondisi yang menyebabkan lapisan penting dari jaringan pada retina " +
            "mengalami penurunan sehingga posisinya lebih kebawah atau menarik ke dalam yang menyebabkan gangguan untuk " +
            "pembuluh darah di daerah ini. Kondisi ini akan menyebabkan retina mengalami kekurangan oksigen sehingga bisa " +
            "menyebabkan kebutaan.<br><br><b>Penyebab Ablasi Retina</b><ol><li>Pengurangan jumlah gel yang melapisi mata " +
            "sehingga menyebabkan bagian retina robek atau mengalami ablasi.</li><li>Cedera karena benturan atau kecelakaan " +
            "yang terjadi pada mata.</li><li>Menderita penyakit diabetes</li><li>Peradangan pada bagian mata</li>" +
            "<li>Penuaan yang bisa menyebabkan retina menjadi semakin tipis dan sangat sensitif saat terkena tekanan dari air mata.</li>" +
            "<li>Pernah menjalani operasi mata</li></ol>" +
            "<br><br><b>Gejala Ablasi Retina</b><ol><li>Mata seperti melihat bintik-bintik kecil pada pandangan.</li>" +
            "<li>Mata seperti tertutup oleh rambut atau beberapa benang kecil meskipun sebenarnya tidak</li><li>Mata memberikan respon berkedip dalam waktu cepat saat melihat mata.</li>" +
            "</ol>"

            ,"&nbsp;&nbsp;Strabismus adalah sebuah kondisi yang menggambarkan bahwa mata tidak bisa melihat dengan baik. " +
            "Bola mata bisa melihat ke arah kanan atau kiri sehingga menyebabkan pandangan mata yang sebenarnya lurus tapi " +
            "tidak bisa terjadi dengan baik. Penyakit ini bisa terjadi pada semua orang dan termasuk untuk anak-anak maupun " +
            "orang dewasa.<br><br><b>Penyebab Strabismus</b><ol><li>Otak tidak bisa mengatur keseimbangan mata saat melihat pada sebuah objek</li>" +
            "<li>Kelainan mata yang menyebabkan satu mata mengalami rabun jauh atau rabun dekat dengan beberapa ukuran dan selisih yang sangat jauh</li>" +
            "<li>Saraf yang bekerja untuk mengatur otot mata tidak bisa berfungsi dengan baik atau justru tidak normal</li></ol><br><br>" +
            "<b>Gejala Strabismus</b><ol><li>Anak-anak akan sering memiringkan salah satu bagian mata atau menutup satu mata untuk bisa " +
            "melihat objek dengan benar.</li><li>Mata menjadi tidak fokus saat melihat dan sering terlihat oleh orang lain</li></ol>"
    };

    private  int[] listGambar=new int[]{
            R.drawable.degenerasimakula,R.drawable.ablasiretina,R.drawable.matajuling
    };
    private String[] video=new String[]{
            "Nfjzt-ts7UQ","GPAQIB__ojM","f_rb6FMVHPk"

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kornea);
        getSupportActionBar().setTitle("Kornea");

        Lv_Kornea= (ListView) findViewById(R.id.Lv_Kornea);

        final ArrayAdapter<String> mAdapter=new ArrayAdapter<String>(KorneaActivity.this,
                android.R.layout.simple_list_item_1,listPKornea);
//        untuk menampilkan list
        Lv_Kornea.setAdapter(mAdapter);

        Lv_Kornea.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(getApplicationContext(),"Click "+listPKornea[position],
                        Toast.LENGTH_SHORT).show();

                Bundle mBundle=new Bundle();
                mBundle.putString("Ljudul",listPKornea[position]);
                mBundle.putString("Lpenjelasan",listPenjelasan[position]);
                mBundle.putInt("gambar",listGambar[position]);
                mBundle.putString("video",video[position]);
                Intent mIntent=new Intent(getApplicationContext(),Detail_PenyakitActivity.class);
                mIntent.putExtras(mBundle);

                startActivity(mIntent);
            }
        });
    }
    }

