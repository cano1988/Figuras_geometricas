package com.example.figuras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CirculoActivity extends AppCompatActivity {
    EditText jetradio;
    TextView jtvrarea, jtvrperi;
    Button jbtcalcular,jbtlimpiar, jbtregresar;

    ClsAreas objcarea = new ClsAreas();
    ClsPerimetro objcperimetro = new ClsPerimetro();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circulo);
        getSupportActionBar().hide();

        //Asociar los objetos xml con los objetos java
        jetradio=findViewById(R.id.etradio);
        jtvrarea=findViewById(R.id.tvrarea);
        jtvrperi=findViewById(R.id.tvrperi);
        jbtcalcular=findViewById(R.id.btcalcular);
        jbtlimpiar=findViewById(R.id.btlimpiar);
        jbtregresar=findViewById(R.id.btregresar);

    }

    public void calcular(View view){
       String radio = jetradio.getText().toString();
       if (radio.isEmpty()){
           Toast.makeText(this, "El campo no puede estar vacío", Toast.LENGTH_SHORT).show();
       }else{
           int numradio = Integer.parseInt(radio);
           if(numradio == 0){
               Toast.makeText(this, "El valor no puede ser 0", Toast.LENGTH_SHORT).show();

           }else {
               float area, perimetro;

               //operaciones
               area = objcarea.Area_circulo(numradio);
               perimetro = objcperimetro.perimetro_circulo(numradio);

               //Imprimir

               jtvrarea.setText(String.valueOf(area));
               jtvrperi.setText(String.valueOf(perimetro));


           }
       }
    }// Fin proceso calcular

    public void limpiar(View view){
        jetradio.setText("");
        jetradio.requestFocus();
        jtvrarea.setText("");
        jtvrperi.setText("");

    }  // Fin proceso limpiar

    public  void regresar(View view){
       finish();
    }
}