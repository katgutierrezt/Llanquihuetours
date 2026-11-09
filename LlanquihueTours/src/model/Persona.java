/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author katae
 */
public class Persona {
    private String rut;
    private String nombre;
    private String correo;
    private Direccion direccion;
    public Persona (String rut, String nombre, String correo, Direccion direccion){
        this.rut=rut;
        this.nombre=nombre;
        this.correo=correo;
        this.direccion= direccion;
        
    }
    public String getRut(){
    return rut;
    }
    public void setRut( String rut){
        this.rut = rut;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre( String nombre){
        this.nombre= nombre;
    }
    public String getCorreo(){
        return correo;
    }
    public void setCorreo(String correo){
        this.correo= correo;
    }
    public Direccion getDireccion(){
        return direccion;
    }
    public void setDireccion(Direccion direccion){
        this.direccion= direccion;
    }
    @Override
    public String toString(){
        return "RUT "+ rut + "| Nombre:" + nombre+ "| Correo: "+ correo+"| Direccion: " + direccion;
    }
}
