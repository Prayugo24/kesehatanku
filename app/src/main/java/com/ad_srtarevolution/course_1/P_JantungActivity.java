package com.ad_srtarevolution.course_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class P_JantungActivity extends AppCompatActivity {

    ListView Lv_Pjantung;
    private String[] listPJantung=new String[]{
      "Jantung Koroner","Imfark Miokard","Gagal Jantung"
            ,"Kardiomiopati","Kelainan Katup Jantung","Jantung Rematik"

    };

    private String[] listPenjelasan=new String[]{
      "&nbsp;&nbsp;"+"Penyakit jantung koroner (PJK) merupakan jenis paling umum dan paling banyak dari macam-macam penyakit " +
              "jantung Iainnya. Penyakit jantung koroner dikenal juga dengan (the silent killer) karena banyak " +
              "mengakibatkan kematian,(PJK) terjadi ketika pembuluh arteri yang memasok darah ke jantung mengeras dan menyempit akibat " +
              "penumpukan kolesterol dan zat lainnya atau lebih dikenal dengan plak. Di Indonesia sendiri penyakit jantung <br>" +
              "<br>" +
              "&nbsp;&nbsp;koroner atau dikenal juga dengan penyakit arteri koroner ini mengakibatkan kematian \n" +
              "<br>" +
              "sekitar 26% dari seluruh kematian di Indonesia, bahkan tercatat daiam 10 tahun terahir jumlah " +
              "angka kematian akibat penyakit jantung koroner (PJK) cenderung mangalami \n" +
              "<br>" +
              "peningkatan. <br>" +
              "<br><br>" +
              "&nbsp;&nbsp;<b>Penyebab utama penyakit jantung koroner </b><br><br>&nbsp;&nbsp;yaitu sterosklerosis. Sterosklerosis " +
              "adalah proses pengerasan dan penebalan pembuluh arteri koroner yang di sebabkan " +
              "oleh penumpukan plak ateromatosa yang terdiri dari kolesterol, lemak dan sisa hasil " +
              "metabolisme tubuh Iainnya. Banyak faktor yang dapat mengakibat terjadinya aterosklerosis, " +
              "namun sebagian besar akibat pola makan dan gaya hidup yang tidak sehhat, seperti :" +
              "<br><ol> <li>kebiasaan merokok</li><li>banyak mengkonsumsi makanan yang mengadung kolesterol dan lemak jenuh</li>" +
              "<li>Obesitas atau kegemukan</li> <li>dan kurang berolahraga juga dapat mengakibatkan penyakit jantung koroner </li></ol>" +
              "<br><b>Gejala penyakit jantung koroner</b><br>" +
              "<ol><li>Sakit dibagian dada, sakit dibagian lengan, pundak, leher, rahang dan juga bagian punggung.</li>" +
              "<li>Mengalami sesak nafas.</li><li>Keluhan pada sakit dada biasanya bervariasi terjadi.</li>"

            ,"&nbsp;&nbsp;Infark miokard terjadi, Ketika aliran darah ke otot jantung berkurang atau terganggu. " +
            "Oksigen tidak mengalir ke otot jantung, dan ini menyebabkan kerusakan dan nekrosis jaringan " +
            "(nekrosis miokard iskemik).<br><br>" +
            "<b>Penyebab infark miokard</b><br>" +
            "Infark miokard dapat diinduksi:<br><ol><li>Penebalan dinding arteri, memasok otot jantung (Arteri koroner)</li>" +
            "<li>Akumulasi plak lemak dalam arteri koroner</li>" +
            "<li>Penyempitan arteri koroner</li>" +
            "<li>Kejang arteri koroner</li>" +
            "<li>Pengembangan gumpalan darah di arteri koroner</li>" +
            "<li>Blockader (gangguan peredaran darah), yang mempengaruhi arteri koroner</li>" +
            "</ol><br><b>Gejala infark miokard</b><ol><li>Kompresi, nyeri dada yang parah, terutama setelah atau selama:" +
            "Olahraga, atau aktivitas fisik yang tinggi,Stres emosional Dalam cuaca dingin,Penerimaan makan berat</li>" +
            "<li>Nyeri di bahu kiri, tangan kiri, rahang</li><li>Sesak napas</li><li>Berkeringat, kulit lipkaya</li>" +
            "<li>Mual</li><li>Kelemahan</li><li>Penurunan kesadaran</li></ol><br>"


            ,"&nbsp;&nbsp;Gagal jantung adalah kondisi saat otot jantung menjadi sangat lemah sehingga tidak bisa memompa cukup darah ke " +
            "seluruh tubuh. Kondisi ini dikenal juga dengan istilah gagal jantung kongestif" +
            "<br><br><b>Penyebab Gagal Jantung</b><br><ol><li>Tekanan darah tinggi</li><li>Gangguan ritme jantung</li><li>Katup jantung rusak</li></ol>" +
            "<br><b>Gejala gagal jantung</b><br><br>&nbsp;&nbsp;Berdasarkan rentang waktu berkembangnya gejala, gagal jantung terbagi menjadi dua, " +
            "yaitu kronis dan akut. Pada gagal jantung kronis, gejala berkembang secara bertahap dan lama. Sedangkan pada " +
            "gagal jantung akut, gejala berkembang secara cepat. Gejala utama gagal jantung adalah:<ol><li>Sesak napas, baik ketika beraktivitas maupun beristirahat</li>" +
            "<li>Tubuh terasa lelah sepanjang waktu.</li><li>Pembengkakan kaki dan pergelangan kaki</li></ol><br>" +
            "<b>Ada empat jenis gagal jantung, di antaranya</b><ol><li>Gagal jantung sebelah kiri (ventrikel kiri jantung tidak dapat " +
            "memompa darah dengan baik ke seluruh tubuh menyebabkan tubuh kekurangan darah yang mengandung oksigen)</li>" +
            "<li>Gagal jantung sebelah kanan (kerusakan pada ventrikel kanan jantung yang menyebabkan proses pengambilan" +
            "oksigen di dalam paru-paru oleh darah tidak berjalan dengan baik)</li>" +
            "<li>Gagal jantung sistolik (otot jantung tidak dapat berkontraksi dengan baik sehingga proses " +
            "penyaluran darah yang mengandung oksigen ke seluruh tubuh menjadi terganggu)</li>" +
            "<li>Gagal jantung diastolik (jantung sulit terisi darah akibat kekakuan pada otot organ tersebut)</li></ol>"

            ,"&nbsp;&nbsp;Kardiomiopati atau lemah jantung adalah penyakit yang berhubungan dengan miokard atau otot jantung. " +
            "Penyakit ini tidak berkaitan dengan penyakit arteri jantung, katup jantung, atau darah tinggi, namun memiliki " +
            "beberapa tingkatan disfungsi otot jantung yang dapat disebabkan oleh penyakit lain. Kardiomiopati dapat menjadi " +
            "penyebab detak jantung yang lemah ataupun tidak beraturan hingga gagal jantung pada penderitanya<br><br>" +
            "<b>Penyebab Kardiomiopati</b><br><br>Selain dipengaruhi oleh struktur otot jantung yang abnormal, gangguan fungsi " +
            "ini juga terkait dengan beberapa faktor risiko, di antaranya:<ol><li>Rusaknya jaringan jantung akibat serangan jantung " +
            "yang sebelumnya dialami.<li>Denyut jantung yang berdetak terlalu cepat dalam jangka panjang</li><li>Kondisi genetik yang diturunkan.</li>" +
            "<li>Penderita tekanan darah tinggi jangka panjang</li><li>Gangguan pada katup jantung.</li><li>Kekurangan vitamin dan mineral yang penting bagi tubuh, seperti vitamin B1.</li>" +
            "<li>Infeksi tertentu, termasuk hepatitis C, dapat mencederai jantung dan memicu kardiomiopati</li><li>Gangguan pada jaringan ikat tubuh.</li></ol>" +
            "<br><b>Gejala Kardiomiopati</b><br><br><ol><li>Pembengkakan pada tungkai, kaki, dan pergelangan kaki.</li><li>Batuk saat berbaring.</li>" +
            "<li>Perut kembung yang diakibatkan oleh adanya cairan</li><li>Kelelahan.</li><li>Kesulitan bernapas bahkan saat beristirahat.</li>" +
            "<li>Denyut jantung yang tidak beraturan.</li><li>Pusing dan pingsan.</li><li>Sakit pada dada.</li></ol>"

            ,"&nbsp;&nbsp;Katup jantung atau klep jantung adalah istilah yang menyerupai gerbang atau pintu satu arah yang terdapat pada jantung, " +
            "tepatnya di antara empat ruangan pada jantung dan pembuluh darah. Katup jantung berfungsi menjaga aliran darah yang berasal " +
            "dari seluruh tubuh yang berada di dalam jantung maupun yang keluar dari jantung berjalan dengan benar.Ada empat katup " +
            "jantung:<ol><li>Di antara serambi (atrium) kanan dengan bilik (ventrikel) kanan, bernama katup trikuspid</li><li>Di antara serambi kiri dengan " +
            "bilik kiri, bernama katup mitral.</li><li>Di antara bilik kanan dengan arteri pulmonaris (pembuluh yang membawa darah menuju paru-paru untuk " +
            "memperoleh oksigen), bernama katup pulmonal.</li><li>Di antara bilik kiri dengan aorta (pembuluh yang membawa darah berisi oksigen dari jantung ke seluruh tubuh), bernama katup aorta.</li></ol>" +
            "Penyakit katup jantung adalah penyakit yang muncul akibat adanya kelainan atau gangguan pada salah satu atau lebih dari keempat katup jantung di atas sehingga darah sulit mengalir ke ruangan atau " +
            "pembuluh darah selanjutnya, atau sebagian aliran berbalik ke area sebelumnya.<br><br><b>Penyebab Penyakit Katup Jantung</b><br><ol>" +
            "<li>Stenosis katup jantung, gangguan ini terjadi ketika katup jantung tidak dapat terbuka dengan baik akibat katup yang menjadi kaku, menebal, atau saling menempel. </li>" +
            "<li>Insufisiensi katup jantung atau regurgitasi adalah kondisi katup jantung yang tidak dapat menutup dengan baik atau tidak kembali ke posisi semula</li>" +
            "<li>rheumatic fever, yaitu infeksi bakteri pada katup jantung yang menyebabkan peradangan dan umumnya menyerang anak-anak</li>" +
            "<li>Endocarditis disebabkan oleh masuknya bakteri ke dalam aliran darah, umumnya masuk melalui prosedur operasi, prosedur pemeriksaan gigi, infeksi berat, dan penyalahgunaan obat melalui metode suntikan</li>" +
            "</ol><br><b>Gejala Penyakit Katup Jantung</b><br><br><ol><li> Kesulitan mengambil napas</li><li>Tekanan pada bagian dada terutama saat sedang beraktivitas</li>" +
            "<li>Pusing</li><li>Kelelahan</li><li>Detak jantung tidak beraturan atau tidak normal</li><li>Penambahan berat badan</li><li>Edema (pembengkakan berlebih di bagian kaki, daerah perut, atau pergelangan kaki sebagai akibat tersumbatnya cairan)</li>" +
            "</ol>"

            ,"&nbsp;&nbsp;Penyakit jantung rematik adalah suatu kondisi dimana terjadi kerusakan pada katup jantung " +
            "yang bisa berupa penyempitan atau kebocoran, terutama katup mitral (stenosis katup mitral) sebagai akibat " +
            "adanya gejala sisa dari demam rematik.<br><br><b>Gejala Penyakit Jantung Rematik</b><br><ol>" +
            "<li>Mudah merasa lelah</li><li>Berat badan berkurang</li><li>Sesak nafa, karena adanya gangguan para organ jantung</li>" +
            "<li>Nyeri sendi berpindah-pindah</li><li>Adanya bercak-bercak berwarna kemeraha pada bagian kulit</li><li>Gerakan tangan yang tidak beraturan serta tidak terkendali</li>" +
            "</ol>"
    };

    private  int[] listGambar=new int[]{
      R.drawable.koroner,R.drawable.imfark,R.drawable.ggl_jantung,
            R.drawable.kardiomiop,R.drawable.kelainan_katup_j,R.drawable.rematik
    };
    private String[] video=new String[]{
            "v7NHjpHC5u0","zeS-0au8ij4","rWnB8oVyFhY"
            ,"HNvtdkjDpTQ","J8arOJLnylE","4SncAiW6j18"

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p__jantung);
        getSupportActionBar().setTitle("Jantung");

//        casting
        Lv_Pjantung= (ListView) findViewById(R.id.Lv_Pjantung);

       final ArrayAdapter<String> mAdapter=new ArrayAdapter<String>(P_JantungActivity.this,
                android.R.layout.simple_list_item_1,listPJantung);
//        untuk menampilkan list
        Lv_Pjantung.setAdapter(mAdapter);

        Lv_Pjantung.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(getApplicationContext(),"Click "+listPJantung[position],
                        Toast.LENGTH_SHORT).show();

                Bundle mBundle=new Bundle();
                mBundle.putString("Ljudul",listPJantung[position]);
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
