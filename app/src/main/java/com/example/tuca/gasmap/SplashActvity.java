package com.example.tuca.gasmap;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Bruno on 14/03/2018.
 */

public class SplashActvity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(this, TelaPrincipal.class);
        startActivity(intent);
        finish();

    }
}
