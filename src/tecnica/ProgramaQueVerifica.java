/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecnica;

import java.util.Scanner;

/**
 *
 * @author anapa
 */
public class ProgramaQueVerifica {
    
     public static void main(String[] args) {
       
         Scanner scan = new Scanner(System.in);
         System.out.println("Digite uma palavra: ");
         String palavra = scan.next();
         int contadorLetraA = 0;
         
         for (int i = 0; i < palavra.length(); i++) {
             char caractere = palavra.charAt(i);
             if (caractere == 'a' || caractere == 'A') {
                 contadorLetraA++;
             }
         }
         if (contadorLetraA > 0) {
             System.out.println("A letra 'a' ocorre " + contadorLetraA + " vezes na palavra. ");
         }else{
             System.out.println("A letra 'a' não foi encontrada na palavra. ");
         }
    }
    
}
