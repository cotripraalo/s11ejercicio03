/*
 * Cuenta los numeros positivos y negativos
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s11ejercicio03;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class S11ejercicio03 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creando Scanner
        Scanner input = new Scanner(System.in);
        
        int positivos =0;
        int negativos = 0;
        int contador = 0;
        double total=0;
        
        //Mostrar mensaje
        System.out.println("Ingrese varios numeros(cero para terminar)");
        int numero= input.nextInt();
        
        if(numero==0){
            System.out.println("No se ingreso ningun numero");
            System.exit(1);
        }
        while(numero !=0){
            System.out.println("No es cero!");
           if (numero >0){
               positivos++;
           }
           else {
               negativos++;
           }
           contador++;
           total +=numero;
            System.out.println("Total: "+ total);
            numero=input.nextInt();
        }
        double promedio = total / contador;
        
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Contador: " + negativos);
        System.out.println("Promedio: " + promedio);
            
       }
    }
