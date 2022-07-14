/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package APP1;

//INICIALIZAR UN NUMERO SI ES MULTIPLO DE 7
public class EJERCICIO2 {

    
    public static void main(String[] args) {
       int numero = 35;
       int residuo = 0;
       residuo=numero % 7;
       if (residuo == 0){
           //SALIDA
           System.out.println("EL NUMERO ES MULTIPLO PARA 7");
           
       }else {
           System.out.println("EL NUMERO NO ES MULTIPLO PARA 7");
       }
    }
    
}
