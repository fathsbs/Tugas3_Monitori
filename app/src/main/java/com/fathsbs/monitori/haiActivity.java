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
