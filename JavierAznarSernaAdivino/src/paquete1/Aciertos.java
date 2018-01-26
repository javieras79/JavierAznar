package paquete1;

import java.util.Scanner;

/**
 *@author Javier Aznar Serna
 *@version 1.0
 *@since 26/01/2018
 */

public class Aciertos {

    /**
     *Programa que genera un numero aleatorio entre 0 y 500. Pide por teclado un numero y calcula si te has quedado
     *cerca o te has pasado. El programa termina cuando n == x e informa del numero de intentos.
     *@param args Argumentos metodo main
     */
	
    public static void main(String[] args) {
    	
        int n = 0,cont = 0;
        int x = (int) (500 *Math.random());   //instruccion que genera el numero aleatorio
        //System.out.print(x);
        Scanner sc = new Scanner(System.in);
        do {									//bucle que pide numero por teclado hasta que n == x
            System.out.print("\nIntroduce el valor de X: ");
            n = sc.nextInt();
            if (n > x) {
                System.out.print("Te pasaste Amigo");
            } else if (n < x){
                System.out.print("Casi cerca ...");
            }
            cont++;								//contador que suma el numero de intentos
        } while (n != x);
        System.out.print("Exelente!!! Haz acertado , No. de intentos: "+cont );
        sc.close();
    }
}