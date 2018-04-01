package com.example.tuca.gasmap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class telaPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cadastrarCliente(View view)
    {
        Intent it = new Intent(this, telaCadastroClientes.class);
        startActivity(it);

    }
}
