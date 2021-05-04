/*
    Nama                : Fatahillah Satria Bima Seno
    NIM                 : 10118039
    Kelas               : AKB-1 / IF-1
    Deskripsi Pekerjaan : pembuatan welcome Activity yang nantinya menuju loginActivity
    Tanggal Pengerjaan  : 03 Mei 2021
 */
package com.fathsbs.monitori;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class haiActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hi);

        Intent intent = getIntent();
        String nama = intent.getStringExtra(biodataActivity.EXTRA_MESSAGE);

        TextView lemparNama = findViewById(R.id.inputan_nama);
        lemparNama.setText(nama);
    }
}
