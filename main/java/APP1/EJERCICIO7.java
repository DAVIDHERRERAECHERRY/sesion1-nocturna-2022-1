/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package APP1;


public class EJERCICIO7 {
//APLICACION QUE VALIDE EL PAGO EN MEDIO EFECTIVO Y DE DOCUMENTOS A LA VENTA 
//DE UN VEHICULO A UN CLIENTE
  
    public static void main(String[] args) {
     String persona="GABRIELA";
     boolean lugarvotacion= true;
     boolean edad=true;
     boolean mesacorrecta=true;
     
     //PROCESO
     if (lugarvotacion== true){
         if(edad==true){
         if(mesacorrecta==true){
             System.out.println(persona+"esta acto para realizar el proceso de votacion");
         }else{
         System.out.println("No se encuentra en la mesa correcta , pero esta en el lugar correcto");
         System.out.println(persona+"No tiene la edad accesible para sufragar");
         }
         }else{
             System.out.println(persona+"Edad minima para sufragar en este proceso es de 16 años");
         }    
         }else{
             System.out.println(persona+"No se encuentra en el establecimiento correcto");    
                 }    
         }
     }
    
   

