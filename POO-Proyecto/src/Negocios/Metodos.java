package Negocios;

import DATOS.Datos;
import Entidades.Familia;
import Entidades.Persona;
import Entidades.Presupuesto;
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
    
public ArrayList<Persona> mostrarCedulas() {
        Persona udatos = new Persona();
        return usu.mostrarID();
    }


public void guardarPresupuesto(Presupuesto presupuestos) {

        if (presupuestos.descripcion.isEmpty()) {
            throw new RuntimeException("Nombre requerido.");
        }

        Datos udatos = new Datos();
        udatos.insertarPresupuesto(presupuestos);
    }

public void EliminarCedulas(Persona usuarios) {
 Datos udatos = new Datos();
 usu.Eliminar(usuarios);
}

public void modificarPersona(Persona usuario) {

 Datos udatos = new Datos();
 udatos.modificarPersona(usuario);

}
public void EliminarFamilia(Familia familias) {
 Datos udatos = new Datos();
 usu.EliminarFamilia(familias);
}

public void modificarFamilia(Familia familias) {

 Datos udatos = new Datos();
 udatos.modificarFamilia(familias);

   }
public void modificarPresupuesto(Presupuesto presupuestos) {

 Datos udatos = new Datos();
 udatos.modificarPresupuesto(presupuestos);

}       


public ArrayList<Presupuesto> extraerIngreso(Presupuesto personas) {
        
        return usu.extraerIngreso(personas);
    }

public ArrayList<Presupuesto> extraerEgreso(Presupuesto personas) {
        
        return usu.extraerEgreso(personas);
    }
}


