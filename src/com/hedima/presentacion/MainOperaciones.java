package com.hedima.presentacion;

public class MainOperaciones {

    public static void main(String[] args) {

        System.out.println("Hello world!");
        //Asignacion de variables
        int a = 10;
//        a=a+5; // suma 5 al valor que ya tiene a ==> valdría 10 + 5 = 15
        a+=5; // De forma resumida quedaría así,
        System.out.println(a); // lo muestra por pantalla
        int b = 10; //asigna a b el valor de 10
//        b=b-5; // le resta a b 5, pero lo comenta
        b-=5; // resta 5 a b, por lo que ahora b valdría 5
        System.out.println(b); // lo muestra por pantalla
        //Resto
        int c = 10; // asigna 10 a la variable c
        System.out.println("resto es ->" + (c%3)); // muestra por pantalla el resto de la división de c/3,
        //Incremento
        int d = 10;  // asigna 10 a d
//        d+=1;
        d++; // Incrementa en 1 el valor de d, en este caso valdría 11
        System.out.println(d); // muestra d por pantalla
        //Pre-incremento y post-incremento
//        int e = 10;  // asigna 10 a e
//        int f = 5;  // asigna 5 a f
//        e+=f++;  // pone en e lo que vale f e incrementa f
//        System.out.println(e); // muestra lo que vale e
//        System.out.println(f); // muestra lo que vale f
        int e = 10;
        int f = 5;
        System.out.println("El valor de e es: " + e + " y el de f es: " + f);
        e+=++f; // valdría e =  16 ya que sería 10+ (1+5) y f se sumaría 1 a su valor = 1 + 5 = 6
        System.out.println("El valor de e es ahora: " + e);
        System.out.println("Y el de f es: " + f);

        int g = 10;
        int h = 5;
        System.out.println(" restando solo sería --h = " + --h);
        g+=--h;
        System.out.println(g);
        System.out.println(h);



    }
}

