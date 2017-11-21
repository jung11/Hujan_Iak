package com.example.zulfakar.hujan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class LoginSukses extends AppCompatActivity {
    TextView sukses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_sukses);
        sukses = findViewById(R.id.tvBerhasil);

        Intent terima = getIntent();
        String nama = terima.getExtras().getString("Nama");
        String pass = terima.getExtras().getString("passwd");
        sukses.setText("Selamat Datang " + nama + "Password: " + pass);

    }
}
