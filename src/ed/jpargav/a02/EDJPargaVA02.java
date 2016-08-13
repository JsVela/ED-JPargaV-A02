/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.jpargav.a02;

import java.util.Scanner;

/**
 *
 * @author JESUS PARGA VELA
 */
public class EDJPargaVA02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.print("Número decimal a convertir a binario: ");
        int n = s.nextInt();
        System.out.print("El número binario equivalente al decimal "+ n +" es: "  );
        DecBin.convertir(n); 
        System.out.println("");
    }
    
}
