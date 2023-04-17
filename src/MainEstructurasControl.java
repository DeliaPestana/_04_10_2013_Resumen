import java.util.Scanner;

public class MainEstructurasControl {

    public static void main(String[] args){

        //ESTRUCTURA IF
        // Devuelve verdadero o falso
        //tiene que estar formada por variable, operador y valor de la variable
        //Decir si un número es múltiplo de 3 o no lo es

        // para trabajar con el IF necesitamos una condición

        // Ejemplo, saber si un número es múltiplo de 3

        int numero = 7;
        if (numero%3==0){
            System.out.println("El número "+ numero +" es múltiplo de 3");
        } else {
            System.out.println("El número "+ numero + " no es múltiplo de 3");
        }

        // Ejercicio:
        // Pedir un número entre 0 y 9999 y decir cuantas cifras tiene:

        // Forma de la profesora Versión 1

        Scanner s1 = new Scanner(System.in);
        System.out.println("Escriba un número entre 0 y 9999");
        int numeroS = s1.nextInt();
        if(numeroS>=0 && numeroS<=9999){
            int cifras = String.valueOf(numeroS).length();
            System.out.println("El número tiene " + cifras + " cifras");
        }else {
            System.out.println("valor inválido");
        }

        // Forma de la profesora Versión 2

        Scanner ss1 = new Scanner(System.in);
        System.out.println("Escriba un número entre 0 y 9999");
        int numeroS1 = ss1.nextInt();
        if(numeroS>=0 && numeroS1<=9999){
            if(numeroS1 < 10){
                System.out.println("Tiene una cifra");
            }else if (numeroS1< 100 ) {
                System.out.println("Tiene dos cifras");
            }else if (numeroS1 <1000){
                System.out.println("Tiene tres cifras");
            }else{
                System.out.println("Tiene cuatro cifras");
            }

        }else {
            System.out.println("valor inválido");
        }

        // Mi forma

        // Defino la variable Scanner para solicitar el número

        Scanner solicitarNumero = new Scanner(System.in);
        //sout y el tabulador me escribe la línea siguiente
        // System.out.println();
        // 1º vamos a pensar en los pasos para realizarlo
        /* 1.- Pedir número
           2.- Comprobar que cumple la condición
           3.- En caso de no cumplirla volver a pedir número
           4.- Pasar el número a String
           5.- Contar caracteres
        */

        int numeroSolicitado = -1;
        String cadena ="";
        while (numeroSolicitado > 9999 || numeroSolicitado < 0)  {
            System.out.println("Escribe un número entre 0 y 9999");

           numeroSolicitado = solicitarNumero.nextInt();
        }
        cadena = Integer.toString(numeroSolicitado);
        int longitudCadena = cadena.length();
        System.out.println("La longitud del número es de  -> " + longitudCadena + " cifras");


        // El switch

        // EJERCICIO: Solicitar por la consola un mes y decir por medio de la estructura switch cuantos días se tiene

        /*MI EXPLICACIÓN

         1.- Solicito por pantalla el mes
           2.- Para cada mes hago un switch

           Opción 2
           1.- Solicito por pantalla el mes
           2.- hago un switch con tres opciones
            2.1 si es 1, 3, 5,7,8,10,12 es de 31
            2.2 si es 4, 6, 9 y 11 es de 30
            2.3 si es 2 es de 28 o 29
            2.4 si es mayor de 12 es incorrecto
         */












    }
}
