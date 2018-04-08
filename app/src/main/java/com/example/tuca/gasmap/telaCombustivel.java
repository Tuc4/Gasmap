package com.example.tuca.gasmap;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class telaCombustivel extends AppCompatActivity {

    //variaveis
    private EditText edtPrecoAlc;
    private EditText edtPrecoGas;
    private TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_combustivel);

        edtPrecoAlc = findViewById(R.id.edtPrecoAlc);
        edtPrecoGas = findViewById(R.id.edtPrecoGas);
        txtResultado = findViewById(R.id.txtResultado);
    }

    //View view: parametro para um método (calcularPreco) que
    //será chamado a partir de um botão
    public void calcularPreco(View view) {
        //recuperar os valores digitados
        String precoAlcool = edtPrecoAlc.getText().toString();
        String precoGasolina = edtPrecoGas.getText().toString();
        String Resultado = txtResultado.getText().toString();

        //Validar os campos digitados
        Boolean camposValidados = this.validarCampos(precoAlcool, precoGasolina);
        if (camposValidados) {
            this.calcularMelhorPreco(precoAlcool, precoGasolina);

        } else {
            txtResultado.setText("Preencha os campos primeiro!");
        }

    }


    public Boolean validarCampos(String pAlcool, String pGas) {
        Boolean camposValidados = true;
        //Validar campos
        if (pAlcool == null || pAlcool.equals("")) {
            camposValidados = false;
        } else if (pGas == null || pGas.equals("")) {
            camposValidados = false;
        }

        return camposValidados;
    }


    public void calcularMelhorPreco(String pAlcool, String pGas) {
        //Converter valores string para numeros
        Double precoAlcool = Double.parseDouble(pAlcool);
        Double precoGasolina = Double.parseDouble(pGas);

        /*Faz cálculo (precoAlcool / precoGasolina)
            * Se resultado >= 0.7 melhor utilizar gasolina
            * senão melhor utlizar álcool
         */
        Double resultado = precoAlcool / precoGasolina;
        if (resultado >= 0.7) {
            txtResultado.setText("Melhor utilizar gasolina!");
        } else {
            txtResultado.setText("Melhor utilizar álcool!");
        }
    }
}
