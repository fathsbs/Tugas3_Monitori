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
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class loginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void pindahBiodata(View view){
        Intent intent = new Intent(this,biodataActivity.class);
        startActivity(intent);
    }
}
