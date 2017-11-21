package com.example.zulfakar.hujan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tvNama;
    EditText etUsername, etPassword;
    Button btnShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvNama = findViewById(R.id.tvNama);
        etUsername = findViewById(R.id.etUsername);
        btnShow = findViewById(R.id.btnShow);
        etPassword = findViewById(R.id.etPassword);

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inpUseramae = etUsername.getText().toString();
                String inpPassword = etPassword.getText().toString();

                Intent login = new Intent(MainActivity.this, LoginSukses.class);

                if(inpUseramae.equals("andy") && inpPassword.equals("toor")){
                    login.putExtra("Nama", inpUseramae);
                    login.putExtra("passwd", inpPassword);
                    startActivity(login);
                }else if(!inpPassword.equals("toor")){
                    etPassword.setError("ini salah");
                }
            }
        });



    }
}
