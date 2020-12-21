/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Jesus
 */
public class Calculadora {

    public static double potencia(double base, double exponente) {
        double pot;
        pot = 1;
        int i;
        for (i = 1; i <= exponente; i++) {
            pot = pot * base;
        }
        return pot;
    }

    public static double factorial(double n) {
        double fac;
        double i;
        fac = 1;
        for (i = 1; i <= n; i++) {
            fac = fac * i;
        }
        return fac;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        double e;
        double exp1;
        double i;
        int num1;
        int num2;
        int num3;
        int numterminos;
        int op;
        double result;
        double result1;
        double signo;
        double suma;
        int x;
        do {
            System.out.println("¿que operacion desea realizar?");
            System.out.println("1.e a la x");
            System.out.println("2.In x");
            System.out.println("3.pi nilakantha");
            System.out.println("4.salir");
            op = Integer.parseInt(bufEntrada.readLine());
            switch (op) {
                case 1:
                    System.out.println("e a la x");
                    System.out.println("ingrese x:");
                    x = Integer.parseInt(bufEntrada.readLine());
                    e = 0;
                    for (i = 1; i <= 100; i++) {
                        if (i == 1) {
                            e = 1;
                        } else {
                            if (i == 2) {
                                e = e + x;
                            } else {
                                e = e + (potencia(x, i - 1) / factorial(i - 1));
                            }
                        }
                    }
                    System.out.println("e a la " + x + "=" + e);
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("In x");
                    System.out.println("ingrese x:");
                    x = Integer.parseInt(bufEntrada.readLine());
                    result = (x - 1) / (x + 1);
                    exp1 = 3;
                    suma = 0;
                    for (i = 1; i <= 100; i++) {
                        result1 = (1 / exp1) * potencia(result, exp1);
                        exp1 = exp1 + 2;
                        suma = suma + result1;
                    }
                    System.out.println(" in (" + x + ")=" + (result + suma) * 2);
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("pi nilakantha");
                    System.out.println("cuantos terminos de presicion desea:");
                    numterminos = Integer.parseInt(bufEntrada.readLine());
                    suma = 0;
                    signo = 1;
                    num1 = 2;
                    num2 = 3;
                    num3 = 4;
                    for (i = 1; i <= numterminos; i++) {
                        result = 4 / (num1 * num2 * num3) * signo;
                        num1 = num1 + 2;
                        num2 = num2 + 2;
                        num3 = num3 + 2;
                        suma = suma + result;
                        signo = signo * (-1);
                    }
                    System.out.println("pi = " + suma + 3);
                    System.out.println("");
                    break;
                case 4:
                    break;
            }
        } while (op != 4);
    }

}
