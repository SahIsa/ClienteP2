package br.usjt.arqdesis.clientep2.controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.BaseAdapter;
import android.widget.ListView;

import br.usjt.arqdesis.clientep2.R;
import br.usjt.arqdesis.clientep2.model.Cliente;
import br.usjt.arqdesis.clientep2.model.ClienteAdapter;
import br.usjt.arqdesis.clientep2.model.Data;

public class ListaClientesActivity extends AppCompatActivity {
    Cliente[] lista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_clientes);
        Intent intent = getIntent();
        String chave = intent.getStringExtra(MainActivity.CHAVE);
        lista = Data.buscaClientes(chave);
        BaseAdapter adapter  = new ClienteAdapter(lista, this);
        ListView listView = (ListView)findViewById(R.id.lista_clientes);
        listView.setAdapter(adapter);


    }
}
