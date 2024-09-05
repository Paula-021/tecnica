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
public class SequenciaFibonacci {
    
    public static void sequencia(int numero){
        int anterior = 0;
        int atual = 1;
        
        while(atual < numero){
            int proximoNumero = atual;
            atual = anterior + atual;
            anterior = proximoNumero;
        }
        if(atual == numero){
            System.out.println("O número pertence a sequência. ");
        }else{
            System.out.println("O número não pertence a sequência. ");
        } 
    }

    
    public static void main(String[] args) {
        
        Scanner scan  = new Scanner(System.in);
        System.out.println("Informe o número: ");
        int numero = scan.nextInt();
        
        sequencia(numero);
        
        
    }
    
}
