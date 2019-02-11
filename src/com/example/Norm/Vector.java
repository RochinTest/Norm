package com.example.Norm;

import java.text.DecimalFormat;
import java.time.format.DecimalStyle;

public class Vector implements Norm{
public int[] element;
public int summ;
    public Vector() {
        this.element = element;
        this.summ=summ;
    }

    @Override
    public void norma() {
        DecimalFormat count=new DecimalFormat("# 0.00");
        System.out.println("Корень квадратный из суммы элементов по модулю = "+ count.format(Math.sqrt(summ)));

    }
}
