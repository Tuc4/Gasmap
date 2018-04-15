package com.example.tuca.gasmap;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class telaOpcoes extends AppCompatActivity  {
    private ImageButton btnMapa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_opcoes);
    }


    //Chama a tela do Mapa
    public void Mapa(View view)
    {
        Intent it = new Intent(this, telaMapa.class);
        startActivity(it);

    }

    //Chama a tela Sobre
    public void Sobre(View view)
    {
        Intent it = new Intent(this, telaSobre.class);
        startActivity(it);

    }

    //Chama a tela Combustivel
    public void Combustivel(View view)
    {
        Intent it = new Intent(this, telaCombustivel.class);
        startActivity(it);

    }

    //Chama a tela Configuracoes
    public void Configuracoes(View view)
    {
        Intent it = new Intent(this, telaConfiguracoes.class);
        startActivity(it);

    }

}
