package com.example.casasperro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.casasperro.admin.AdminActivity;
import com.example.casasperro.menu.MenuActivity;
import com.example.casasperro.registrarse.RegistrarseActivity;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView registrarse, textView4;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = (Button) findViewById(R.id.login);
        login.setOnClickListener(this);

        registrarse = findViewById(R.id.register);
        registrarse.setOnClickListener(this);

        textView4 = findViewById(R.id.textView4);
        textView4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.login)
        {
            startActivity(new Intent(getApplicationContext(), MenuActivity.class));
        }

        if (view.getId() == R.id.register)
        {
            startActivity(new Intent(getApplicationContext(), RegistrarseActivity.class));
        }

        if (view.getId() == R.id.textView4)
        {
            startActivity(new Intent(getApplicationContext(), AdminActivity.class));
        }
    }
}