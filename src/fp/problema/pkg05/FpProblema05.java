/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp.problema.pkg05;
import java.util.*;

public class FpProblema05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entradaDato = new Scanner(System.in);
         int a=0,i,numero;
         System.out.println("Ingrese numero");
         numero=entradaDato.nextInt();
         for(i=1;i<(numero+1);i++){
         if(numero%i==0){
             a++;
            }
         }
         if(a!=2){
              System.out.println("No es Primo");
            }else{
                System.out.println("Si es Primo");
         }
     }
}
   