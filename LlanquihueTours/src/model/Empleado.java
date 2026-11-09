/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author katae
 */
public class Empleado extends Persona {
   private String cargo;
   private double sueldo;
   public Empleado(String rut, String nombre, String correo, Direccion direccion, String cargo, double sueldo){
   super( rut, nombre, correo,direccion);
   this.cargo = cargo;
   this.sueldo=sueldo;
   }
public String getCargo(){   
    return cargo;
}
public void setCargo(String cargo){
    this.cargo = cargo;
   
}
public double getSueldo(){
    return sueldo;
}
public void setSueldo( double sueldo){
    this.sueldo= sueldo;
}
@Override
public String toString(){
    return super.toString()+ "| Cargo: " + cargo +"| Sueldo:  $" + sueldo;
}
}
   
   

    

