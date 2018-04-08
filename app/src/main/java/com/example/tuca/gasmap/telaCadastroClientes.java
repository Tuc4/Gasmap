package com.example.tuca.gasmap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.widget.AdapterView;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class telaCadastroClientes extends AppCompatActivity implements View.OnClickListener {
    private RadioButton rdbMasc;
    private RadioButton rdbFem;
    private EditText edtData;
    private EditText edtNome;
    private EditText edtEmail;
    private EditText edtSenha;
    private EditText edtConfSenha;
    private Button btnSalvar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastro_clientes);

        rdbFem = findViewById(R.id.rdbFem);
        rdbMasc = findViewById(R.id.rdbMasc);
        edtSenha = findViewById(R.id.edtSenha);
        edtConfSenha = findViewById(R.id.edtConfSenha);
        edtData = findViewById(R.id.edtData);
        edtNome = findViewById(R.id.edtNome);
        edtEmail = findViewById(R.id.edtEmail);
        btnSalvar = findViewById(R.id.btnSalvar);

        rdbFem.setOnClickListener(this);
        rdbMasc.setOnClickListener(this);
        edtEmail.setOnClickListener(this);
        edtConfSenha.setOnClickListener(this);
        edtData.setOnClickListener(this);
        edtNome.setOnClickListener(this);
        edtSenha.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btnSalvar) {
            Intent it = new Intent(this, telaPrincipal.class);
            it.putExtra("email", edtEmail.getText().toString());
            it.putExtra("senha", edtSenha.getText().toString());

            if (rdbMasc.isChecked()) {
                it.putExtra("sexo", "Masculino");
            } else if (rdbFem.isChecked()) {
                it.putExtra("sexo", "Feminino");

            }
            startActivity(it);
        }


        //Chama a tela de mapa
    /*public void telaMapa(View view)
    {
        Intent it = new Intent(this, telaMapa.class);
        startActivity(it);

    }
    */
    }

    //Abrir tela secundaria


}