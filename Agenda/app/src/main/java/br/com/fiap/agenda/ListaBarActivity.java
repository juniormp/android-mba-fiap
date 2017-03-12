package br.com.fiap.agenda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListaBarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_bar);

        String[] bares = {"Praça XV", "Irish Pub", "Vila Mada"};
        ListView listaBar = (ListView) findViewById(R.id.lista_bar);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, bares);
        listaBar.setAdapter(adapter);
    }



}
