package com.fathsbs.monitori;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class biodataActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE="com.app.Monitori.MESSAGE";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);
    }

    public void pindahHai(View view){
        Intent intent = new Intent(this,haiActivity.class);
        EditText inputNama = (EditText) findViewById(R.id.input_nama);
        String nama = inputNama.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, nama);
        startActivity(intent);
    }
}
