/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package APP1;


public class EJERCICIO4 {
//VERIFICACION DE DOS NUMEROS PARES A PARTIR DEL USO DE OPERADORES LOGICOS SI SE CUMPLE LA CONDICION
    
    public static void main(String[] args) {
       int numero1 = 10;
       int numero2 = 2;
       int residuo1 =0;
       int residuo2 = 0;
       
       //PROCESO
       residuo1=numero1%2;
       residuo2=numero1%2;
       if (residuo1 ==0 && residuo2 ==0) {
           //SALIDA
            System.out.println("LOS DOS NUMEROS SON PARES");
       }else{
            System.out.println("LOS DOS NUMEROS SON INCORRECTOS");  
       }
    }
    
}
