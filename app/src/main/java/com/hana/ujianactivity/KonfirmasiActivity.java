package com.hana.ujianactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;

public class KonfirmasiActivity extends AppCompatActivity {
    private TextView tvNama, tvTelepon;
    Button btn_Telusuri;


    @Override
        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_konfirmasi);

            tvNama = findViewById(R.id.tv_nama);
            tvTelepon = findViewById(R.id.tv_telepon);

            Intent terima = getIntent();
            String terimaNama = terima.getStringExtra("amplopNama");
            String terimaTelepon = terima.getStringExtra("amplopTelepon");

            tvNama.setText(terimaNama);
            tvTelepon.setText(terimaTelepon);
            btn_Telusuri = (Button) findViewById(R.id.btn_Telusuri);
            btn_Telusuri.setOnClickListener(view -> {
                Toast.makeText(getApplicationContext(), "Data Kontak Ditemukan", Toast.LENGTH_SHORT).show();


            });
        }
    }

