package com.example.figuras;



import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.media.tv.interactive.TvInteractiveAppService;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class TrianguloActivity extends AppCompatActivity {

EditText jetladoa, jetladob, jetladoc, jetbase, jetaltura;
TextView jtvrarea, jtvrperi;
String ladoa, ladob, ladoc, base, altura;

Float area, perimetro;
ClsAreas objareatrin = new ClsAreas();
ClsPerimetro objperitri = new ClsPerimetro();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangulo);
        getSupportActionBar().hide();

        jetladoa=findViewById(R.id.etladoa);
        jetladob=findViewById(R.id.etladob);
        jetladoc=findViewById(R.id.etladoc);
        jetbase=findViewById(R.id.etbase);
        jetaltura=findViewById(R.id.etaltura);
        jtvrarea=findViewById(R.id.tvrarea);
        jtvrperi=findViewById(R.id.tvrperi);


    }

    public  void calcular1(View view){

        base = jetbase.getText().toString();
        altura = jetaltura.getText().toString();
        if (base.isEmpty() || altura.isEmpty()){
            Toast.makeText(this, "El campo no puede estar vacío", Toast.LENGTH_SHORT).show();
        }else{

            int numbase = Integer.parseInt(base);
            int numaltura = Integer.parseInt(altura);

         if (numbase == 0 || numaltura == 0 ){
            Toast.makeText(this, "El valor no puede ser 0", Toast.LENGTH_SHORT).show();
           }else{
             //Inicio operaci0nes

             area = objareatrin.Area_triangulo(numbase, numaltura);


             //Imprimir operaciones
             jtvrarea.setText(String.valueOf(area));


           }
        }
    }

    public  void calcular2(View view){
        ladoa = jetladoa.getText().toString();
        ladob = jetladob.getText().toString();
        ladoc = jetladoc.getText().toString();

        if (ladoa.isEmpty()|| ladob.isEmpty() || ladoc.isEmpty()){
            Toast.makeText(this, "El campo no puede estar vacío", Toast.LENGTH_SHORT).show();
        }else{
            int numladoa = Integer.parseInt(ladoa);
            int numladob = Integer.parseInt(ladob);
            int numladoc = Integer.parseInt(ladoc);


            if (numladoa == 0 || numladob == 0 || numladoc == 0 ){
                Toast.makeText(this, "El valor no puede ser 0", Toast.LENGTH_SHORT).show();
            }else{
                //Inicio operaci0nes


                perimetro= objperitri.perimetro_triangulo(numladoa, numladob, numladoc);

                //Imprimir operaciones

                jtvrperi.setText(String.valueOf(perimetro));

            }
        }

    }//Fin método calcular
    //Inicio método limpar
    public void limpiar(View view){
        jetbase.setText("");
        jetbase.requestFocus();
        jetaltura.setText("");
        jetladoa.setText("");
        jetladob.setText("");
        jetladoc.setText("");
        jtvrarea.setText("");
        jtvrperi.setText("");

    }// Fin proceso limpiar

    public void regresar(View view){
        Intent intMainActivity = new Intent(this, MainActivity.class);
        startActivity(intMainActivity);
    }

}