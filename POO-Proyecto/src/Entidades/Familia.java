/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Veronica Quesada
 */
public class Familia {
    public String Apellido;
    public Ubicacion ubicacion;

    public Familia(String Apellido, Ubicacion ubicacion) {
        this.Apellido = Apellido;
        this.ubicacion = ubicacion;
    }

    public Familia() {
    }
    
    

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }
    
    
}
