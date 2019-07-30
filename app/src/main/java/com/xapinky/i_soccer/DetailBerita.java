package com.xapinky.i_soccer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailBerita extends AppCompatActivity {

    ImageView gambar;
    TextView judul, isi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_berita);

        gambar = findViewById(R.id.imageView);
        judul = findViewById(R.id.judul);
        isi = findViewById(R.id.subjudul);

        Intent intent = getIntent();
        String poto = intent.getStringExtra("gambar_berita");
        String isi2 = intent.getStringExtra("isi_berita");
        String judul2 = intent.getStringExtra("jsul_berita");

        Glide.with(DetailBerita.this).load(poto).into(gambar);
        judul.setText(judul2);
        isi.setText(isi2);

    }
}
