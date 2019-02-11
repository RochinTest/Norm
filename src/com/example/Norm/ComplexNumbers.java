package com.example.Norm;

public class ComplexNumbers implements Norm{
    int x,y;

    public ComplexNumbers() {
        this.x = x;
        this.y = y;
    }

    @Override
    public void norma() {
        System.out.println(" Модуль комплексного числа ="+ Math.sqrt(x*x + y*y));

    }
}
