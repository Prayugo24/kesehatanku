package com.ad_srtarevolution.course_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail_PenyakitActivity extends AppCompatActivity {

    ImageView IvGamJantung;
    TextView Tv_judul;
    WebView Tv_penjelasn;
    Button bt_lihatVideo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail__penyakit);
        getSupportActionBar().setTitle("Jantung");

        IvGamJantung= (ImageView) findViewById(R.id.Iv_gambar);
        Tv_judul= (TextView) findViewById(R.id.Tv_judulPjantng);
        Tv_penjelasn= (WebView) findViewById(R.id.Tv_penjelasan);
        bt_lihatVideo= (Button) findViewById(R.id.bt_lihatVideo);

        Bundle mBundle=getIntent().getExtras();
        getSupportActionBar().setTitle(mBundle.getString("Ljudul"));
        IvGamJantung.setImageResource(mBundle.getInt("gambar"));
        Tv_judul.setText(mBundle.getString("Ljudul"));
        Tv_penjelasn.loadData("<P style=\"text-align:justify\">"+mBundle.getString("Lpenjelasan")+"</P>","text/html","UTF-8");
        final String video=mBundle.getString("video");
        bt_lihatVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle nBundle=new Bundle();
                nBundle.putString("video",video);
                Intent mIntent=new Intent(getApplicationContext(),video_jantungActivity.class);
                mIntent.putExtras(nBundle);
                startActivity(mIntent);
            }
        });
    }
}
