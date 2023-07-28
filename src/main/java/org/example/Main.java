package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Integer NumeroUno;
        Integer NumeroDos;
        Integer NumeroTres;
        Integer NumeroCuatro;
        Integer NumeroCinco;
        Scanner teclado=new Scanner(System.in);

        System.out.print("Digite un numero:");
        NumeroUno=teclado.nextInt();

        System.out.print("Digite otro numero por favor:");
        NumeroDos=teclado.nextInt();

        //EVALUANDO CONDICIONES
         if (NumeroUno>0 || NumeroUno<10){
             System.out.println("Bienvenido al bloque1");
         }else {
             System.out.println("Bienvenido al bloque2");
         }



    }
}