package ru.dvfu.mrcpk.java.proj01;

import java.util.Random;
import java.util.Scanner;

public class Practice_02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*System.out.println("Введите числовое значение переменной и нажмите Enter: ");
        int count = in.nextInt();

        if (count > 5){
            count = count + 1;
            System.out.println("Значение переменной > 5 и увеличено на 1: " + count);
        }else if (count == 5){
            count = count + 3;
            System.out.println("Значение переменной = 5 и увеличено на 3: " + count);
        }else{
            count = count + 5;
            System.out.println("Значение переменной < 5 и увеличено на 5: " + count);
        }*/


        /* count = count > 15?count + 1:count + 5;  // Сокращенная запись условного оператора
        System.out.println("Результат выполнения сокращенной записи оператора: " + count);
        */

        double d = 2e2;         // e2 - степень числа 10, на которую следует умножить данное число
        System.out.println(d);
    }
}
