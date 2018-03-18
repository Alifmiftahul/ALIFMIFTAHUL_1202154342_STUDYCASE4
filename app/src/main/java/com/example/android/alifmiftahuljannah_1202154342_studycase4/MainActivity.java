package com.example.android.alifmiftahuljannah_1202154342_studycase4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnListNama;
    private Button btnCariGambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnListNama = (Button) findViewById(R.id.btnListNama);
        btnCariGambar = (Button) findViewById(R.id.btnCariGambar);
        btnCariGambar.setOnClickListener(this);
        btnListNama.setOnClickListener(this);
    }

    //Methods untuk handle semua view yang di deklarasikan diatas pada onCreate()
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnListNama:
                //Memanggil activity ListMahasiswa dengan Intent
                startActivity(new Intent(MainActivity.this, ListMahasiswa.class));
                break;
            case R.id.btnCariGambar:
                //Memanggil activity PencariGambar dengan Intent
                startActivity(new Intent(MainActivity.this, PencariGambar.class));
                break;
        }
    }
}