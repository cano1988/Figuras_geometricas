package com.example.figuras;

public class ClsAreas {
    float area;
    public float Area_cuadrado(int lado){
        area = lado * lado;
        return area;
    }

    public float Area_rectangulo(int base, int altura) {
        area = base * altura;
        return area;
    }

    public float Area_circulo(int radio) {
       area = (float) Math .PI * radio * radio;
       return area;
    }

    public float Area_triangulo(int base, int altura){
           area = (base * altura) / 2;
           return area;
    }
}


