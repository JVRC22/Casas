package com.example.casasperro.registrarse;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.casasperro.R;

public class EnviarCodigoActivity extends AppCompatActivity implements View.OnClickListener {

    Button whatsapp, sms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enviar_codigo);

        whatsapp = (Button) findViewById(R.id.whatsapp);
        whatsapp.setOnClickListener(this);

        sms = (Button) findViewById(R.id.sms);
        sms.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.whatsapp)
        {
            startActivity(new Intent(getApplicationContext(), ActivarCuentaActivity.class));
        }

        if (view.getId() == R.id.sms)
        {
            startActivity(new Intent(getApplicationContext(), ActivarCuentaActivity.class));
        }
    }
}
