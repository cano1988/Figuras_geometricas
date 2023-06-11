package com.example.figuras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.tv.interactive.TvInteractiveAppService;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class CuadradoActivity extends AppCompatActivity {

  EditText jetlado;
  TextView jtvrarea, jtvrperi;
  Button jbtcalcular,jbtlimpiar, jbtregresar;
  String lado;
  //Instancias las clases de areas y perimetros
  ClsAreas objcuaarea = new ClsAreas();
  ClsPerimetro objcuaper = new ClsPerimetro();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuadrado);
        getSupportActionBar().hide();

        //Asociar los objetos xml con los objetos java
        jetlado=findViewById(R.id.etlado);
        jtvrarea=findViewById(R.id.tvrarea);
        jtvrperi=findViewById(R.id.tvrperi);
        jbtcalcular=findViewById(R.id.btcalcular);
        jbtlimpiar=findViewById(R.id.btlimpiar);
        jbtregresar=findViewById(R.id.btregresar);

    }

    //Leer los datos del front por medio de string, se colocan en public class

    public void calcular(View view){
        lado = jetlado.getText().toString();
        //Validar que el campo de numeros no este vacío
        if(lado.isEmpty()){
            Toast.makeText(this, "El campo no puede estar vacío", Toast.LENGTH_SHORT).show();
        }else {
            int numlado = Integer.parseInt(lado);

            if(numlado == 0){
                Toast.makeText(this, "El valor no puede ser 0", Toast.LENGTH_SHORT).show();
            }else{
                float area, perimetro;
                area = objcuaarea.Area_cuadrado(numlado);
                perimetro = objcuaper.perimetro_cuadrado(numlado);

                //Imprimir

                jtvrarea.setText(String.valueOf(area));
                jtvrperi.setText(String.valueOf(perimetro));

            }
        }
    }// Fin método calcular

    public void limpiar(View view){
        jetlado.setText("");
        jetlado.requestFocus();
        jtvrarea.setText("");
        jtvrperi.setText("");
    }// Fin proces limpiar
    // Inicia proceso calcular

    public  void regresar(View view){
        finish();
    }
}