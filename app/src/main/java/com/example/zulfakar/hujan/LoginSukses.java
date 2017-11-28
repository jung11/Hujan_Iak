package com.example.zulfakar.hujan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class LoginSukses extends AppCompatActivity {

    ListView lvItems;
    String[] itemList;
    int[] itemHarga;
    int[] itemImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_sukses);
        lvItems = findViewById(R.id.lvItems);

        itemList = new String[]{"Ayam Geprek", "Ayam Bakar", "Ayam Kremes", "Ayam Goreng", "Nila Bakar"
                , "Nila Goreng", "Lele Bakar", "Lele Goreng", "Iga Bakar", "Sop Iga", "Iga Penyet", "Sambal Terasi" };

        itemHarga = new int[]{8000, 12000, 10000, 10000, 12000, 11000, 12000, 8000, 14000, 14000, 15000, 4000};

        itemImage = new int[]{R.drawable.ayam_geprek,
                R.drawable.ayam_bakar,
                R.drawable.ayan_kremes,
                R.drawable.ayam_goreng,
                R.drawable.nila_bakar,
                R.drawable.nila_goreng,
                R.drawable.lele_bakar,
                R.drawable.lele_goreng,
                R.drawable.iga_bakar,
                R.drawable.sop_iga,
                R.drawable.iga_penyet,
                R.drawable.sambal_terasi};

        MyListAdapter adapter = new MyListAdapter(this, itemList, itemHarga, itemImage);
        lvItems.setAdapter(adapter);

        lvItems.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(LoginSukses.this, DetailActivity.class);
                intent.putExtra("nama", itemList[i] + "");
                intent.putExtra("harga", itemHarga[i] + "");
                intent.putExtra("gambar", itemImage[i] + "");
                startActivity(intent);
            }
        });


    }
}
