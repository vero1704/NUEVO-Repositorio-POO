package Entidades;

/**
 *
 * @author ma210
 */
public class Presupuesto {
    public int idPersona;
    public int anno;
    public String mes;
    public String semana;
    public String tipo;
    public String clasificacion;
    public int monto;
    public String descripcion;

    public Presupuesto(int idPersona, int anno, String mes, String semana, String tipo, String clasificacion, int monto, String descripcion) {
        this.idPersona = idPersona;
        this.anno = anno;
        this.mes = mes;
        this.semana = semana;
        this.tipo = tipo;
        this.clasificacion = clasificacion;
        this.monto = monto;
        this.descripcion = descripcion;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getSemana() {
        return semana;
    }

    public void setSemana(String semana) {
        this.semana = semana;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Presupuesto() {
    }

    
}
   

  