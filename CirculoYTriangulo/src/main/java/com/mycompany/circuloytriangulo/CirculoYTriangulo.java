
package com.mycompany.circuloytriangulo;


public class CirculoYTriangulo {

    public static void main(String[] args) {
        
        Circulo a=new Circulo(3);
        Triangulo b=new Triangulo(3, 4);
        System.out.println("Las carateristicas de los ejemplos son:\nCirculo:\nArea="+a.getArea()+"\nPerimetro"+a.getPerimetro()+"\nTriangulo Area="+b.getArea());
    }
}
