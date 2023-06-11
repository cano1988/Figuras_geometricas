package com.example.figuras;

public class ClsPerimetro {
    float perimetro;
    public float perimetro_cuadrado(int lado){
    perimetro = 4 * lado;
        return perimetro;
    }

    public float perimetro_rectangulo(int base, int altura) {
        perimetro = 2 * (base + altura);
        return perimetro;
    }

    public float perimetro_circulo(int radio) {
        perimetro = (float)(2*Math .PI) * radio; //Con (float) se castea la variable perimetro por que math da double
        return perimetro;
    }

    public float perimetro_triangulo(int ladoa, int ladob, int ladoc){
        perimetro = ladoa + ladob + ladoc;
        return perimetro;
    }
}

