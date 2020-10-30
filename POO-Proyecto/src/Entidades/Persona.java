package Entidades;

/**
 *
 * @author ma210
 */
public class Persona {
    
    public int id;
    public String nombre;
    public String familia;
    public int edad;
    public String genero;
    public String escolaridad;
    public String trabajo;

    public Persona(int id, String nombre, String familia, int edad, String genero, String escolaridad, String trabajo) {
        this.id = id;
        this.nombre = nombre;
        this.familia = familia;
        this.edad = edad;
        this.genero = genero;
        this.escolaridad = escolaridad;
        this.trabajo = trabajo;
    }

    public Persona(int id, String nombre, int edad, String genero, String escolaridad, String trabajo) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.escolaridad = escolaridad;
        this.trabajo = trabajo;
    }
    
    public Persona() {
        
    }

    public Persona(int id) {
        this.id = id;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEscolaridad() {
        return escolaridad;
    }

    public void setEscolaridad(String escolaridad) {
        this.escolaridad = escolaridad;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

}
