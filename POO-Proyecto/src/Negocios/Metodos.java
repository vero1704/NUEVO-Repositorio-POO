package Negocios;


import DATOS.Datos;
import Entidades.Familia;
import Entidades.Persona;
import java.util.ArrayList;
/**
 *
 * @author ma210
 */
public class Metodos {
    
    Datos usu = new Datos();
    
    public void guardarFamilia(Familia usuario) {
        
        if (usuario.Apellido.isEmpty()) {
            throw new RuntimeException("Apellido requerido.");
        }
        
         if (usuario.ubicacion.distrito.isEmpty()) {
            throw new RuntimeException("Distrito requerido.");
        }
         
         if (usuario.ubicacion.canton.isEmpty()) {
            throw new RuntimeException("Cantón requerido.");
        }
         
         if (usuario.ubicacion.direccionExacta.isEmpty()) {
            throw new RuntimeException("Dirección Exacta requerido.");
        }
 
        Datos udatos = new Datos();
        udatos.insertarFamilia(usuario);
    }
    
    public ArrayList<Familia> mostrarReporte() {
        Familia udatos = new Familia();
        return usu.mostrarFamilia();
    }
    
      public void guardarPersona(Persona usuario) {
        
        if (usuario.nombre.isEmpty()) {
            throw new RuntimeException("Nombre requerido.");
        }
        
        Datos udatos = new Datos();
        udatos.insertarPersona(usuario);
    }
    
}