/*
Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano.
 */
package ejercicioextra4;

import java.util.Scanner;

public class EjercicioExtra4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa un número del 1 al 10: ");
        int numero = entrada.nextInt();
        
        while(numero < 0 || numero > 10){
            System.out.println("Error, el número debe ser del 1 al 10, vuelve a ingresarlo: ");
            numero = entrada.nextInt();
        }
        
        switch(numero){
            case 1: 
                System.out.println("Su número equivalente en romano es: I");
                break;
            case 2:
                System.out.println("Su número equivalente en romano es: II");
                break;
            case 3: 
                System.out.println("Su número equivalente en romano es: III");
                break;
            case 4: 
                System.out.println("Su número equivalente en romano es: IV");
                break;
            case 5: 
                System.out.println("Su número equivalente en romano es: V");
                break;
            case 6: 
                System.out.println("Su número equivalente en romano es: VI");
                break;
            case 7: 
                System.out.println("Su número equivalente en romano es: VII");
                break;
            case 8: 
                System.out.println("Su número equivalente en romano es: VIII");
                break;
            case 9: 
                System.out.println("Su número equivalente en romano es: IX");
                break;
            case 10: 
                System.out.println("Su número equivalente en romano es: X");
                break;
        }
    }
    
}
