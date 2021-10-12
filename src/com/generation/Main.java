package com.generation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// ciclo for
//        for (contador = 0; contador < numero; contador++){
//
//        }

        //explicacion
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Ingresa un número");
//        int numero= sc.nextInt();
//        sc.close();
//        for ( int i = 0; i<=10; i++){
//            if(i%2==0){
//                continue;//pasa a la siguiente iteracion sin terminar de ejecutar el codigo que hay debajo dentro del ciclo
//
//            }
//
//            System.out.println(numero + "x" + i + "=" + (numero*i));
//
//        }

        //Ejercicio:
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Ingresa un número");
//        int fin = sc.nextInt();
//        sc.close();
//        int previo = 0;
//        int actual = 1;
//        int result = 0;
//
//        if(fin<1){
//            System.out.println("Número no válido");
//
//        }else{
//            System.out.println(previo);
//            for (int i = 0; i<fin-1; i++){
//                result=previo+actual;
//                System.out.println(previo + "+" + actual+"=" + result);
//                previo=actual;
//                actual=result;
//
//            }
//
//        }
        //sabemos cuantos ciclos va a hacer
        //while y do while
        //ciclo while, no sabemos cuantos ciclos va a hacer
//        while(condicion){
//
//        }
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Adivina el número secreto");
//        int num = sc.nextInt();
//        int numeroSecreto = 33;
//
//        while(num != numeroSecreto){
//            System.out.println("Adivina el número secreto");
//            num = sc.nextInt();
//
//        }
//        sc.close();
//        System.out.println("Felicidades, adivinaste el número secreto");
//
        //ciclo do while, primero hace y despues pregunta
//        Scanner sc = new Scanner(System.in);
//        int num = 0;
//        int numeroSecreto = 33;
//
//        do{
//            System.out.println("Adivina el número secreto");
//            num = sc.nextInt();
//
//        } while(num!= numeroSecreto);
//
//        sc.close();
//        System.out.println("Felicidades, adivinaste el número secreto");

        //obtener el numero factorial con while o do while
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int numero = sc.nextInt();
        sc.close();
        int contador =2;
        int acumulado=1;
        if (numero<0){
            System.out.println("Ingrese un número válido");

        } else if (numero==0){
            System.out.println("1");

        }else{
            do{
                acumulado=contador*acumulado;
                contador++;

            }while(contador<=numero);
            System.out.println("El factorial de "+ numero + " es "+acumulado);

        }

    }
}
