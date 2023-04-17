package com.hedima.presentacion;

public class OperadoresLogicos {

    public static void main(String[] args) {

        //Operadores de Comparacion
        //Devuelven un valor booleano.
        int a = 10;
        int b = 20;

        System.out.println("El valor de a es: " + a + " y el de b es: " + b);



        boolean resultado = a >= b;  // compara el valor de a con el de b y lo pone en resultado


        System.out.println(resultado);

        resultado = a <= b;  // compara el valor de a con el de b y lo pone resultado

        System.out.println(resultado);

        int c = 10;
        int d = 10;
        resultado = c == d; // compara c y d
        System.out.println("Compara que c y de sean iguales y la respuesta es: " + resultado + " ya que " + " c= " +  c + " y d= " + d);
        resultado = c!= d; // compara que c no sea igual a d
        System.out.println("Compara que c no sea igual que d y la respuesta es: " + resultado);

        //Operadores Lógicos
        //and &&
        //or ||
        //not!
        a=20;
        b=10;
        c=30;
        resultado = (a > b) && (a < c);  // (a es mayor que b) y además (a es menor que c) ==> se deben cumplir ambas condiciones
        System.out.println("El resultado de que (a > b) && (a < c) es->"+resultado);
        resultado = (a > b) || (a < c);  // a es mayor que b) o  (a es menor que c)  ==> será cierta cuando se cumpla una de ambas.
        System.out.println("El resultado de (a > b) || (a < c) que es: " + resultado);
        resultado =!(a > b);  // a > b si es correcto lo niega y si no lo es lo afirma con el símbolo ! antes del paréntesis
        System.out.println("El resultado de que !(a > b) es: " +resultado + " ya que  (a > b) es: "  + !resultado + " puesto que a = " + a + " y b es = " + b);



    }
}


