/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package APP1;

import javax.swing.JOptionPane;


public class EJERCICIO20 {

    public static void main(String[] args) {
// NUMERO PERFECTO
        int numero = 4;
        int antecesores = 0;
        int acumuladodivisibles = 0;
        //proceso
        antecesores = numero - 1;
        while (antecesores > 0) {
            if (numero % antecesores == 0) {
                acumuladodivisibles = acumuladodivisibles + antecesores;

            }
            antecesores--;
        }
        //SALIDA
        if (numero == acumuladodivisibles) {
            JOptionPane.showMessageDialog(null, "Es perfecto");

        } else {
            JOptionPane.showMessageDialog(null, "NO perfecto");

        }
    }

}