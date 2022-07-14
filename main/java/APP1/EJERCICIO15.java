/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package APP1;

import javax.swing.JOptionPane;

public class EJERCICIO15 {

    
    public static void main(String[] args) {
      //ENTRADA
      int numeroingresado=0;
      //PROCESO
      numeroingresado = Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese un numero"));
      int entrada=Integer.parseInt(JOptionPane.showInputDialog(null,"****MENU CONVERSIONES****"+"\n"
              +"1.PRESENTAR SECUENCIA ASCENDENTE"+"\n"+"2.PRESENTAR SECUENCIADESCENDENTE"+"\n"
      +"3.SALIR"));
      //EVALUAR LOS DOS ESCENARIOS CON SWITCH
      switch (entrada){
          case 1:
              numeroingresado++;
              //generamos la secuenciaascendente
              while(numeroingresado <10){
                  JOptionPane.showMessageDialog(null,numeroingresado);
                  numeroingresado++;
              }
              break;
          case 2:
                numeroingresado--;
              //GENERAMOS LA SECUENCIA DESCENDENTE
              while (numeroingresado >0){
                 JOptionPane.showMessageDialog(null,numeroingresado); 
                  numeroingresado--;
              }
              
              break;
                
                      
      }
    }
    
}
