/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.jpargav.a02;

/**
 *
 * @author JESUS PARGA VELA
 */
public class DecBin {

    public static void convertir(int n) {
        if (n < 2) {//Caso Base
            System.out.print(n);
        } else {
            convertir(n / 2);
            System.out.print(n % 2);
        }
    }
}
