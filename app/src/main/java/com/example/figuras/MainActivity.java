package com.example.figuras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Ocultar barra de titulo
        getSupportActionBar().hide();
    }

    public void Cuadrado(View view){
        //Intent, para trasladarse de una actividad a otra
        Intent intcuadrado = new Intent(this,CuadradoActivity.class);
        startActivity(intcuadrado);



    }

    public void Rectangulo(View view){
        Intent intrectangulo = new Intent(this,RectanguloActivity.class);
        startActivity(intrectangulo);
    }

    public  void Circulo(View view){
        Intent intcirculo = new Intent(this,CirculoActivity.class);
        startActivity(intcirculo);
    }

    public  void  triangulo(View view){
        Intent inttriangulo = new Intent(this, TrianguloActivity.class);
        startActivity(inttriangulo);

    }
}