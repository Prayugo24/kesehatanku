package com.ad_srtarevolution.course_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ParuActivity extends AppCompatActivity {
    ListView Lv_Paru;
    private String[] listParu=new String[]{
            "Pneumonia (radang paru-paru)","Penyakit Legionnaries","Bronkitis"

    };

    private String[] listPenjelasan=new String[]{
            "&nbsp;&nbsp;Peradangan dari gelembung udara mikroskopik paru-paru yaitu alveolus dan saluran udara " +
                    "terkecil yaitu bronkiolus atau disebut pneumonia Pneumonia dapat timbul " +
                    "di berbagai daerah di paru-paru. Pneumonia lobar menyerang sebuah lobus atau " +
                    "potongan besar paru-paru. Pneumonia lobar adalah bentuk pneumonia yang mempengaruhi " +
                    "area yang luas dan terus-menerus dari lobus paru-paru Selain itu, ada juga yang " +
                    "disebut bronkopneumonia yang menyerang seberkas jaringan di salah satu paru-paru atau keduanya.<br><br>" +
                    "<br><br><b>Penyebab:</b><br><br>&nbsp;&nbsp;Penyebab utama infeksi bakteri, sering kali dari jenis Streptococcus pneumoniae. " +
                    "Pneumonia dapat dipicu menjadi permasalahan sekunder oleh infeksi virus di saluran pernapasan atas, seperti flu." +
                    "Penyebab lain meliputi berbagai jenis bakteri juga virus seperti influenza dan cacar air dan lebih jarang mikroorganisme " +
                    "seperti protozoa dan jamur.<br><br><b>Gejala:</b><br><br>&nbsp;&nbsp;Gejala utama adalah batuk dengan dengan dahak berdarah, sesak napas, " +
                    "nyeri dada, dan demam tinggi dengan kesadaran menurun."

            ,"&nbsp;&nbsp;Legionnaries adalah penyakit paru-paru yang disebabkan bakteri legionella pneumophilia. " +
            "Bentuk infeksinya mirip dengan pneumonia<br><br><b>Penyebab:</b><br><br>&nbsp;&nbsp;Bakteri legionella yang menyebabkan penyakit " +
            "ini merupakan bakteri berbentuk batang yang ditemukan di sebagian besar sumber air. Mereka berlipat " +
            "ganda sangat cepat. Mereka terdapat di sistem pipa ledeng atau di mana pun yang air bisa menggenang Penyakit " +
            "Legionnaire pertama kali dijelaskan pada 1976 setelah terjadi wabah penyakit yang mirip penumonia berat " +
            "pada veteran perang di sebuah konvensi American legion. Penyakit ini lebih banyak menyerang laki-laki.<br><br><b>Gejala:</b>" +
            "<br><br>&nbsp;&nbsp;Gejalanya mirip pneumoni atau radang paru-paru lain, khususnya gangguan saluran napas, tapi selain itu penderita juga terserang diare, nyeri perut, atau ikterus " +
            "Penyakit ini terjadi sering kali pada orang berusia menengah atau lebih tua dan dapat menjadi serius atau bahkan menyebabkan " +
            "kematian pada orang pada yang memiliki sistem kekebalan tubuh yang lemah."

            ,"&nbsp;&nbsp;Bronkitis kronis merupakan penyakit yang disebabkan oleh peradangan kronis yang ada di saluran " +
            "udara bagian paru-paru. Saluran udara pada paru-paru akan terinfeksi dengan zat-zat yang terkandung dalam rokok. " +
            "Pada penderita bronkitis kronis, saluran bronkus pada paru-paru dan juga saluran udara utama yang akan menuju ke " +
            "paru-paru mengalami peradangan, mengalami penyempitan akibat zat-zat berbahaya dalam asap tembakau dan yang terakhir " +
            "adalah akan mengalami pembengkakan. Bronkitis juga akan terjadi ketika paru-paru mengalami infeksi yang terjadi secara " +
            "berulang-ulang akibat oleh paparan zat polutan yang berbahaya dan juga terpapar dengan asap rokok secara berulang-ulang.<br><br>" +
            "<b>Gejala Bronkitis</b><ol><li>Batuk Berdahak</li><li>Dahak Kekuningan</li><li>Batuk Berdarah</li><li>Sesak Nafas</li>" +
            "<li>Penderita bronkitis kronis akan mengeluarkan nafas yang berbunyi ( ngik-ngik ) </li><li>Penderita bronkitis kronis akan merasakn mudah lelah dikarenakan staminanya " +
            "menurun</li><li>Pasien yang mengalami penyakit bronkitis akan terkena demam ringan saat virus bronkitis masih bersarang di dalam tubuhnya. Suhu tubuh " +
            "penderita bronkitis akan meningkat sampai 38 derajat celcius</li><li> Rasa tidak nyaman akan muncul jika penderita mengambil nafas panjang. Ketika megambil nafas panjang penderita akan " +
            "merasakan nyeri di dadanya, rasa gatal dan juga merasakan sesak nafas</li><li>Efek dari penyakit bronkitis kronis tersebut bisa menyebabkan tenggorokan penderitanya sakit. Hal itu bisa " +
            "dikarenakan tenggorokan mungkin juga sudah terinfeksi atau teriiritasi dengan virus bronkitis.</li><li>Orang yang mengalami bronkitis kronis akan mengalami sakit kepala. Hal itu dikarenakan " +
            "pasokan oksigen di dalam tubuhnya berkurang. Saat paru-paru terinfeksi, pasokan oksigen pun menjadi berkurang di dalam tubuh.</li>" +
            "<li>Badan akan terasa nyeri ketika seseorang tersebut bernafas, hal itu dikarenakan dada terasa nyeri ketika bernafas sehingga seluruh tubuh pun akan terasa nyeri</li>" +
            "</ol><br><br><b>Penyebab Bronkitis</b><br><ol><li> Bahaya asap rokok yang masuk ke dalam tubuh manusia akan merusak bulu kecil di dalam paru-paru</li>" +
            "<li>Virus atau bakteri merupakan penyebab bronkitis. Virus tersebut ditularkan oleh penderita bronkitis primer sehingga " +
            "seseorang yang berada didekatnya bisa menjadi penderita bronkitis sekunder.</li><li>Membiarkan diri anda dan tubuh anda " +
            "terlalu lama terpapar dengan polusi udara bisa menyebabkan anda terkena bronkitis. Alasanya adalah di dalam polusi udara " +
            "memiliki zat kimia berbahaya dimana zat kimia tersebut bisa merusak rambut silia pada paru-paru</li><li>Bronkitis juga bisa " +
            "disebabkan oleh polusi industri</li></ol>"
    };

    private  int[] listGambar=new int[]{
            R.drawable.radangparu,R.drawable.legionnaries,R.drawable.bronchitis
    };
    private String[] video=new String[]{
            "fnodnZrR-o0","dD4d_apLtl0","ZiGTY0A8ax0"

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paru);
        getSupportActionBar().setTitle("Paru-paru");

        Lv_Paru= (ListView) findViewById(R.id.Lv_Paruparu);

        final ArrayAdapter<String> mAdapter=new ArrayAdapter<String>(ParuActivity.this,
                android.R.layout.simple_list_item_1,listParu);
//        untuk menampilkan list
        Lv_Paru.setAdapter(mAdapter);

        Lv_Paru.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(getApplicationContext(),"Click "+listParu[position],
                        Toast.LENGTH_SHORT).show();

                Bundle mBundle=new Bundle();
                mBundle.putString("Ljudul",listParu[position]);
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
