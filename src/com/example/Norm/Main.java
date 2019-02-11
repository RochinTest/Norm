//3). Создать интерфейс с методом норма и реализовать его в классах:
// комплексные числа, вектор из 10 элементов, матрица (2х2).
// Определить метод  нормы:
//для комплексных чисел – модуль в квадрате,
//для вектора – корень квадратный из суммы элементов по модулю,
//для матрицы – максимальное значение по модулю.
package com.example.Norm;

import java.text.DecimalFormat;
import java.time.format.DecimalStyle;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Vector ob = new Vector();
        Matrix ob1 = new Matrix();
        ComplexNumbers ob2 = new ComplexNumbers();
        Main ob3 = new Main();
        //ob3.complexNumber(ob2);
       // ob3.fillMatrix(ob1);
        ob3.makeVectors(ob);

    }
private void makeVectors(Vector ob){
        int n=0;
      ob.element=new int[20];
      System.out.println("Строим вектора");
    for (int i = 0; i < ob.element.length; i++) {
        ob.element[i] = (int) ((Math.random() * 20) - 5);
        System.out.print(" "+ob.element[i]);
    }System.out.println();
    for (int i = 0; i < ob.element.length; i++) {
      n=n+Math.abs(ob.element[i+1]-ob.element[i]);i++;
    }ob.summ=n;
   // System.out.print(n);
    ob.norma();
    }

    private void fillMatrix(Matrix ob1) {
        int n = 0;
        ob1.matrix = new int[2][2];
        for (int i = 0; i < ob1.matrix.length; i++) {
            System.out.println();
            for (int j = 0; j < ob1.matrix[i].length; j++) {
                ob1.matrix[i][j] = (int) ((Math.random() * 20) - 5);
                System.out.print(" " + ob1.matrix[i][j]);
            }
        }
        for (int i = 0; i < ob1.matrix.length; i++) {
            for (int j = 0; j < ob1.matrix[i].length; j++)
                if (n <= Math.abs(ob1.matrix[i][j])) {
                    n = Math.abs(ob1.matrix[i][j]);

                }

        }
        ob1.maxABS = n;
        ob1.norma();
    }

    private void complexNumber(ComplexNumbers ob2) {
        System.out.println(" Введите комплексное число вида Z=X+Yi, вводим X y");
        ob2.x = input();
        ob2.y = input();
        ob2.norma();
    }

    private int input() {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            n = (sc.nextInt());
        }
        return n;

    }
}