package com.example.tuca.gasmap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.Locale;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.content.res.Configuration;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.AdapterView;
import android.widget.RadioButton;


public class telaConfiguracoes extends AppCompatActivity implements View.OnClickListener {

    private Button btnSalvar;
    private RadioButton rdbPt;
    private RadioButton rdbIng;
    private RadioButton rdbEsp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_configuracoes);

        btnSalvar = (Button)findViewById(R.id.btnSalvar);
        rdbPt = (RadioButton)findViewById(R.id.rdbPt);
        rdbIng = (RadioButton)findViewById(R.id.rdbIng);
        rdbEsp = (RadioButton)findViewById(R.id.rdbEsp);

        btnSalvar.setOnClickListener(this);
        rdbIng.setOnClickListener(this);
        rdbPt.setOnClickListener(this);
        rdbEsp.setOnClickListener(this);
    }

    //Mudar linguagem do app
    public void setLocale(String lang) {
        Locale myLocale = new Locale(lang);
        Resources res = getResources();
        DisplayMetrics dm = res.getDisplayMetrics();
        Configuration conf = res.getConfiguration();
        conf.locale = myLocale;
        res.updateConfiguration(conf, dm);
        Intent refresh = new Intent(this, telaConfiguracoes.class);
        refresh.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

        Intent refresh2 = new Intent(this, telaOpcoes.class);
        refresh.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(refresh);
        startActivity(refresh2);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btnSalvar){
            if (rdbPt.isChecked()){
                setLocale("Default");
            }else if (rdbIng.isChecked()){
                setLocale("en");;
            }else if (rdbEsp.isChecked()){
                setLocale("es");
            }

        }


    }



}
