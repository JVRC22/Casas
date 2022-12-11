package com.example.casasperro.registrarse;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.casasperro.MainActivity;
import com.example.casasperro.R;

public class ActivarCuentaActivity extends AppCompatActivity implements View.OnClickListener {

    Button activar;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activar_cuenta);

        activar = (Button) findViewById(R.id.activar);
        activar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.activar)
        {
            startActivity(new Intent(getApplicationContext(), MainActivity.class));
        }
    }
}
