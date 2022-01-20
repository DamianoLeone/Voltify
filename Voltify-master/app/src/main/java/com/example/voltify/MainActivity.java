package com.example.voltify;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.io.Serializable;


public class MainActivity extends AppCompatActivity {
    Button inserisci,vedi;
    EditText titolo,durata, regista;
    EditText data;
    GestioneDati gd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inserisci = (Button)findViewById(R.id.inserisci);
        vedi = (Button)findViewById(R.id.vedi_lista);
        gd = new GestioneDati();
        titolo = (EditText)findViewById(R.id.titolo);
        Spinner spinner = (Spinner) findViewById(R.id.spinner); //creato un oggetto di tipo Spinner
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, //potevi anche creare una stringa del tipo String[] a={"",""....} e poi però non usavi createfromresource
                R.array.generi_film, android.R.layout.simple_spinner_item); //abbiaamo usato l'adapter per lo spinner aggiungendo gli elementi del menù a tendina andando su values,strings e poi ho aggiunto lì
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); //layout quindi come appare il menù a tendina
// Apply the adapter to the spinner
        spinner.setAdapter(adapter);

        durata = (EditText)findViewById(R.id.durata);
        data = (EditText)findViewById(R.id.data);
        regista = (EditText) findViewById(R.id.regista);

        inserisci.setOnClickListener(new View.OnClickListener(){ //questo è quello che succede quando clicchi il bottone
            @Override
            public void onClick(View v){
                gd.addBrani(titolo.getText().toString(),spinner.getSelectedItem().toString(),Integer.parseInt(durata.getText().toString()),data.getText().toString(),regista.getText().toString()); // qua potevo separare lo spinner e inserirlo separatamente  con String genSelez=spn.Genere.getSelectedItem().toString();
                gd.listaBrani();
                Toast t = Toast.makeText(getApplicationContext(), "Film aggiunto!",Toast.LENGTH_SHORT); //cosa appare quando aggiungi un coso e poi quelli sotto sono per vedere le cose nelle robe
                t.show();
                titolo.setText("Titolo");
                durata.setText("Durata (minuti)");
                data.setText("Data");
                regista.setText("Regista");
                spinner.setSelection(0);
            }
        });

            vedi.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                    StringBuilder str = new StringBuilder();
                    str=gd.vediLista();
                    System.out.println(str);
                    intent.putExtra("lista",str.toString());
                    startActivity(intent);
                }
            });

    }
}
