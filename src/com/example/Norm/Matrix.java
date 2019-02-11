package com.example.Norm;

public class Matrix implements Norm {
public int[][] matrix;
public int maxABS;

    public Matrix() {
        this.matrix = matrix;
        this.maxABS=maxABS;
    }

    @Override
    public void norma() {
        System.out.println();
System.out.println("Максимальное значение по модулю = "+ maxABS);

    }
}
