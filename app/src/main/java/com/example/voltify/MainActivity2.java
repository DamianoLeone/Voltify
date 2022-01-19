package com.example.voltify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView textView = (TextView) findViewById(R.id.ls);
        Intent intent = getIntent();
        String lista = intent.getStringExtra( "lista");
        intent.getExtras();
        textView.append(lista);//aggiungi alla fine della textview l'elemento
        /*ListView lv = (ListView) findViewById(R.id.lista);
        ArrayAdapter<String> aa = new ArrayAdapter<>(getApplicationContext(), R.layout.activity_main2, lista);
        lv.setAdapter(aa);*/
    }
}