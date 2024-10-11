/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juego.numeros;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class JuegoNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Importa escaner
    Scanner scanner = new Scanner(System.in);
    //Numero al azar
    double numero_aleatorio = Math.random()*100+1;
    numero_aleatorio = (int)numero_aleatorio;
    System.out.println("Introduce un numero entero del 1 al 100");
    //numero del usuario
    int numero_usuario = scanner.nextInt();
    //Si es mayor o menor
    while (numero_aleatorio != numero_usuario){
        if (numero_aleatorio < numero_usuario){
            System.out.println("¡Has escrito un número demasiado alto, te has pasado!");
        }else{
            System.out.println("¡Has escrito un número demasiado bajo, intenta con uno más alto!");
        }
        System.out.println("Escribe otro entero entre 1 y 100");
        numero_usuario = scanner.nextInt();
    }
    //si escoges el correcto
    System.out.println("¡Enhorabuena! El número era " + numero_aleatorio);
    }
    
}
