package com.example.figuras;

import static com.example.figuras.R.id.etaltura;
import static com.example.figuras.R.id.etbase;
import static com.example.figuras.R.id.etlado;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.style.TabStopSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RectanguloActivity extends AppCompatActivity {
    EditText jetbase, jetaltura;
    TextView jtvrarea, jtvrperi;
    Button jbtcalcular,jbtlimpiar, jbtregresar;

    //Se inserta la clase de resctangulo que esta en RectanguloActivity
    ClsAreas objrecarea = new ClsAreas();
    ClsPerimetro objrecperi = new ClsPerimetro();



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangulo);
        getSupportActionBar().hide();

        //Asociar los objetos xml con los objetos java
        jetbase=findViewById(etbase);
        jetaltura=findViewById(etaltura);
        jtvrarea=findViewById(R.id.tvrarea);
        jtvrperi=findViewById(R.id.tvrperi);
        jbtcalcular=findViewById(R.id.btcalcular);
        jbtlimpiar=findViewById(R.id.btlimpiar);
        jbtregresar=findViewById(R.id.btregresar);


    }

    public  void calcular(View view){
        String base  = jetbase.getText().toString();
        String altura  = jetaltura.getText().toString();
        if(base.isEmpty() || altura.isEmpty()){
            Toast.makeText(this, "El campo no puede estar vacío", Toast.LENGTH_SHORT).show();
        }else{
            int numbase= Integer.parseInt(base);
            int numaltura = Integer.parseInt(altura);
            float area, perimetro;
            if (numbase == 0 || numaltura == 0){
                Toast.makeText(this,"El valor no puede ser 0", Toast.LENGTH_SHORT).show();
            }else{
                //operaciones
                area = objrecarea.Area_rectangulo(numbase, numaltura);
                perimetro = objrecperi.perimetro_rectangulo(numbase,numaltura);

                //Imprimir operaciones
                jtvrarea.setText(String.valueOf(area));
                jtvrperi.setText(String.valueOf(perimetro));

            }
        }
    }//Fin proceso calcular
    //Inicio proceso limpiar

    public void limpiar(View View){
        jetbase.setText("");
        jetbase.requestFocus();
        jetaltura.setText("");
        jtvrarea.setText("");
        jtvrperi.setText("");

    }

    public void regresar(View view){
      finish();

    }
}