/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package APP1;

//EJERCICIO QUE VALIDE EL MEDIO DE PAGO EN EFECTIVO Y DE DOCUMENTO EN LA VENTA
//DE UN VEHICULO DE UN CLIENTE
public class EJERCICIO8 {

   
    public static void main(String[] args) {
       String vehiculo="ford";
       boolean Licencia=true;
       boolean efectivo=true;
       
       //PROCESO
       if (Licencia ==true){
           if(efectivo==true){
               System.out.println(vehiculo+"Se ejecuta la venta del vehiculo");
           }else{
               System.out.println(vehiculo+"No Se ejecutala venta del vehiculo");
           }
       }else{
           System.out.println(vehiculo+"No se ejecuta la compra del vehiculo");
       }
    }
    
}
