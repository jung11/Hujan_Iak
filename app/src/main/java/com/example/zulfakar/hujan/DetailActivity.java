package com.example.zulfakar.hujan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        String nama = intent.getExtras().getString("nama");
        int harga = Integer.parseInt(intent.getExtras().getString("harga"));
        int gambar = Integer.parseInt(intent.getExtras().getString("gambar"));

        ImageView imgGambar = findViewById(R.id.imgDone);
        TextView tvharga = findViewById(R.id.tvHargaDone);
        TextView tvNama = findViewById(R.id.tvNamaDone);

        imgGambar.setImageResource(gambar);
        tvNama.setText(nama);
        tvharga.setText("Rp. " + harga);






    }
}
