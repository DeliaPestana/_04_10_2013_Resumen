package com.hedima.presentacion;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        //1.- variables PRIMITIVAS
        //primero el tipo
        // después el nombre
        // = valor
        float precio = 10.5f;
        //en el caso de flota siempre debe terminar f o F al final
        //la nomenclatura de las variables sería
        // en minúscula y cada palabra diferente la primera en mayúscula
        //también acepta inicio con $ o con _ o con letra
        //sout y pulso tabulador y aparece la línea anterior.
        System.out.println("Mi variable float tiene el valor de: " + precio);

        //Ejercicio declarar una variable de tipo char con el nombre que queramos con el valor z
        char variableChar = 'z';
        System.out.println("El valor de mi variable char es: " + variableChar);

        // Definir una variable de tipo long con valor 123.456,81
        //Las variables Long no pueden tener decimales, así que la dejamos en 123456
        // los long no admiten decimales.


        long variableLong = 123456L;

        System.out.println("El valor de mi variable long es: " + variableLong);

        // Definir una variable float con el valor 34005,87

        float variableFloat = 34005.87f;
        System.out.println("El valor de mi variable float es:  " + variableFloat);

        //2.- Variables de tipo REFRENCIA

        //Declarar una variable de tipo String con el valor hoy es lunes de pascua

        String hoy = "Hoy es lunes de pascua";
        System.out.println("El valor de mi variable string: " + hoy);

        // Para comvertir el contenido de la variable hoy en mayúscula

        System.out.println("El valor de mi variable string en mayúscula sería: " + hoy.toUpperCase());

        // Esta es una de las diferencias que tienen las variables de referencia a las de variables primitivas
        //las primitivas no tienen métodos ni atributos, sólo tienen valor
        //en cambio las de referencia si que las tienen.

        //Extraer de la variable hoy la palabra lunes

        System.out.println("("+hoy.substring(7,12)+")");

        // Para calcular el 7 de forma más fácil sin tener que contarlo

        System.out.println(hoy.indexOf("lunes"));
        System.out.println(hoy.indexOf("lunes")+"lunes".length());
        System.out.println(hoy.substring(hoy.indexOf("lunes"),hoy.indexOf("lunes")+"lunes".length()));

        //Scanner

        //llamamos al constructor
        Scanner s1 = new Scanner(System.in);

        System.out.println("Escriba su edad -> ");
        // para definir la lectura de la entrada por teclado:
        // nextInt recibe información
        int edad = s1.nextInt();


        // para recibir el dato de la profesión
        System.out.println("Escriba su profesión -> ");
        String profesion = s1.next();
        System.out.println("Su profesión es --> " + profesion);
        System.out.println("Y su edad es --> " + edad + "años");

        // 3.- Variables de REFERENCIA para FECHAS

        //Tenemos que saber el nombre de la clase

        // fNacimiento -- siguiendo la nomenclatura correcta
        //para hacerlo correctamente debemos consultar la documentación

        LocalDate fNacimiento = LocalDate.of(1992,11,25);
        System.out.println("Fecha de nacimiento + fNacimiento");

        //Para sumar, restar.... tenemos métodos, para sumar 1 años, por ejemplo

        System.out.println(fNacimiento.plusYears(1));

        System.out.println("Su edad es -> " + Period.between(fNacimiento,LocalDate.now()));

        //Para que me ponga los años
        System.out.println("Su edad es -> " + Period.between(fNacimiento,LocalDate.now()).getYears());

        //Para que me ponga los días desde una fecha a otra

        // se puede hacer con el método instan.of o con el between

        //ESTRUCTURAS DE CONTROL




















    }
}