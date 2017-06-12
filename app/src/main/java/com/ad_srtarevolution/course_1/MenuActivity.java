package com.ad_srtarevolution.course_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.youtube.player.internal.d;

public class MenuActivity extends AppCompatActivity {
    TextView Tv_username;
    LinearLayout LL_MenuJantung,LL_MenuParu,LL_MenuKornea,LL_about;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        getSupportActionBar().setTitle("Menu");

        Tv_username=(TextView)findViewById(R.id.Tv_username);
        LL_MenuJantung=(LinearLayout)findViewById(R.id.LL_menuPenyakitJantung);
        LL_MenuParu= (LinearLayout) findViewById(R.id.LL_menuPenyakitParu);
        LL_MenuKornea= (LinearLayout) findViewById(R.id.LL_menuPenyakitKornea);
        LL_about= (LinearLayout) findViewById(R.id.LL_About);
        Bundle mBundle=getIntent().getExtras();
//        Tv_username.setText("Selamat Datang "+mBundle.getString("email"));

        LL_MenuJantung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MenuActivity.this,"Click Menu Penyakit Jantung",
                        Toast.LENGTH_SHORT).show();

                Intent mIntent=new Intent(getApplicationContext(),
                        P_JantungActivity.class);

                startActivity(mIntent);
            }
        });

        LL_MenuParu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MenuActivity.this,"Click Menu Penyakit Paru-paru",
                        Toast.LENGTH_SHORT).show();
                Intent mIntent=new Intent(getApplicationContext(),
                        ParuActivity.class);

                startActivity(mIntent);

            }
        });

        LL_MenuKornea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MenuActivity.this,"Click Menu Penyakit Kornea",
                        Toast.LENGTH_SHORT).show();
                Intent mIntent=new Intent(getApplicationContext(),
                        KorneaActivity.class);

                startActivity(mIntent);
            }
        });

        LL_about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MenuActivity.this,"Click About",
                        Toast.LENGTH_SHORT).show();
                Intent mIntent=new Intent(getApplicationContext(),
                        AboutActivity.class);

                startActivity(mIntent);
            }
        });
    }
}
