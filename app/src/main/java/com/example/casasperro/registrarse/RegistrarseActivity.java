package com.example.casasperro.registrarse;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.casasperro.R;

public class RegistrarseActivity extends AppCompatActivity implements View.OnClickListener {

    Button crear_cuenta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrarse);

        crear_cuenta = (Button) findViewById(R.id.crear_cuenta);
        crear_cuenta.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.crear_cuenta)
        {
            startActivity(new Intent(getApplicationContext(), VerificarCorreoActivity.class));
        }
    }
}
