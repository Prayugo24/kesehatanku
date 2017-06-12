package com.ad_srtarevolution.course_1;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class AboutActivity extends ActionBarActivity {

    ImageView IvGam;
    TextView Tv_judul;
    WebView Tv_penjelasn;

    String about="&nbsp;&nbsp;aplikasi kesehatanku merupakan aplikasi yang dikembangkan oleh Prayugo Dwi Setiyoko,yang dibuat " +
            "untuk membantu anda memahami tentang berbagai penyakit dalam, <br>&nbsp;&nbsp;didalam menu terdapat beberapa informasi mengenai penyakit dalam " +
            "yang sering terjadi pada manusia serta penyebab terjadinya penyakit tersebut,di aplikasi ini " +
            "juga menginformasikan gejala apa saja yang terjadi,";
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
//      jika ingin membuat circleImage dengan ImgaeView bsa dengan dibwh ini
//        Bitmap bitmap = BitmapFactory.decodeResource(this.getResources(),R.drawable.pray);
//        Bitmap circularBitmap = ImageConverter.getRoundedCornerBitmap(bitmap, 100);
//
//        ImageView circularImageView = (ImageView)findViewById(R.id.imageView);
//        circularImageView.setImageBitmap(circularBitmap);

        Tv_judul= (TextView) findViewById(R.id.Tv_judul);
        Tv_penjelasn= (WebView) findViewById(R.id.Tv_penjelasan);

        getSupportActionBar().setTitle("About");
        Tv_judul.setText("About");
        Tv_penjelasn.loadData("<P style=\"text-align:justify\">"+about+"</P>","text/html","UTF-8");

    }
}
