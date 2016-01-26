package com.example.toni.calculadora;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Calculadora extends AppCompatActivity implements View.OnClickListener {

    private Button boton1, boton2, botonmas;
    private TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        boton1 = (Button) findViewById(R.id.button1);
        boton2 = (Button) findViewById(R.id.button2);
        botonmas = (Button) findViewById(R.id.buttonmas);
        texto = (TextView) findViewById(R.id.textView);

        boton1.setOnClickListener(this);
        boton2.setOnClickListener(this);
        botonmas.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button1:
                texto.setText("1");
                break;
            case R.id.button2:
                texto.setText("2");
                break;
            case R.id.button3:
                texto.setText("3");
                break;
            case R.id.button4:
                texto.setText("4");
                break;
            case R.id.button5:
                texto.setText("5");
                break;
            case R.id.button6:
                texto.setText("6");
                break;
            case R.id.button7:
                texto.setText("7");
                break;
            case R.id.button8:
                texto.setText("8");
                break;
            case R.id.button9:
                texto.setText("9");
                break;
            case R.id.buttoncero:
                texto.setText("0");
                break;
            case R.id.buttonmas:
                texto.setText("+");
                break;
            case R.id.buttonmenos:
                texto.setText("-");
                break;
            case R.id.buttonigual:
                texto.setText("=");
                break;
            case R.id.buttonx:
                texto.setText("X");
                break;
            case R.id.buttonpunto:
                texto.setText("0");
                break;
            case R.id.button0:
                texto.setText("0");
                break;

        }

    }
}
