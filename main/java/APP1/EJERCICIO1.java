/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package APP1;

public class EJERCICIO1 {
//VALIDACION SI UN NUMERO ES PAR O IMPAR
    
    public static void main(String[] args) {
        //ENTRADA
        int numero = 2;
        int residuo = 0;
        //PROCESO
        residuo = numero % 2;
        
        if (residuo == 0){
            System.out.println("el numero es par");
  
            
        }else {
            System.out.println("el numero es impar");
        }
    }
    
}
