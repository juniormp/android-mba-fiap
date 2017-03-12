package br.com.fiap.agenda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
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

        Button novoBar = (Button) findViewById(R.id.novo_bar);
        novoBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intentVaiProFormulario = new Intent(ListaBarActivity.this, FormularioActivity.class);
                startActivity(intentVaiProFormulario);
            }
        });

    }



}
