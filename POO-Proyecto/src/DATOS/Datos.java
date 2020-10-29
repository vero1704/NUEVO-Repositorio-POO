package DATOS;

import Entidades.Familia;
import Entidades.Persona;
import Entidades.Presupuesto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ma210
 */
public class Datos {

    public void insertarFamilia(Familia familias) {
        try (Connection connection = Conexion.getConexion()) {
            String sql = "INSERT INTO familia(apellido, provincia, canton, distrito, direccion)\n"
                    + "                               VALUES (?, ?, ?, ?, ?)";

            PreparedStatement p = connection.prepareStatement(sql);

            p.setString(1, familias.getApellido());
            p.setString(2, familias.ubicacion.getProvincia());
            p.setString(3, familias.ubicacion.getCanton());
            p.setString(4, familias.ubicacion.getDistrito());
            p.setString(5, familias.ubicacion.getDireccionExacta());

            int res = p.executeUpdate();

            if (res == 1) {
                JOptionPane.showMessageDialog(null, "Se ha registrado "
                        + "satisfactoriamente!", "INFORMACION",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Lo sentimos, registro fallido",
                        "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("No se pudo establecer la conexión");
        }
    }

    public ArrayList<Familia> mostrarFamilia() {

        ArrayList<Familia> familias = new ArrayList<>();

        try (Connection connection = Conexion.getConexion()) {
            String sql = "select apellido from familia";

            Statement s = connection.createStatement();
            ResultSet rs = s.executeQuery(sql);

            while (rs.next()) {
                Familia customer = new Familia();
                customer.setApellido(rs.getString("apellido"));
                familias.add(customer);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("No se pudo establecer la conexión");
        }
        return familias;
    }

    public void insertarPersona(Persona personas) {
        try (Connection connection = Conexion.getConexion()) {
            String sql = "INSERT INTO public.persona(\n"
                    + "	id, nombre, edad, trabajo, genero, \"gradoEscolaridad\", familia)\n"
                    + "	VALUES (?, ?, ?, ?, ?, ?, ?);";

            PreparedStatement p = connection.prepareStatement(sql);
            p.setInt(1, personas.getId());
            p.setString(2, personas.getNombre());
            p.setInt(3, personas.getEdad());
            p.setString(4, personas.getTrabajo());
            p.setString(5, personas.getGenero());
            p.setString(6, personas.getEscolaridad());
            p.setInt(7, personas.getFamilia());

            int res = p.executeUpdate();

            if (res == 1) {
                JOptionPane.showMessageDialog(null, "Se ha registrado "
                        + "satisfactoriamente!", "INFORMACION",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Lo sentimos, registro fallido",
                        "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("No se pudo establecer la conexión");
        }
    }

    public ArrayList<Persona> mostrarID() {

        ArrayList<Persona> personas = new ArrayList<>();

        try (Connection connection = Conexion.getConexion()) {
            String sql = "select id from persona";

            Statement s = connection.createStatement();
            ResultSet rs = s.executeQuery(sql);

            while (rs.next()) {
                Persona customer = new Persona();
                customer.setId(rs.getInt("id"));
                personas.add(customer);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("No se pudo establecer la conexión");
        }
        return personas;
    }

    public void insertarPresupuesto(Presupuesto presupuestos) {
        try (Connection connection = Conexion.getConexion()) {
            String sql = "INSERT INTO public.presupuesto(\n"
                    + "	 idpersona, anno, mes, semana, tipo, clasificacion, monto, descripcion)\n"
                    + "	VALUES ( ?, ?, ?, ?, ?, ?, ?, ?);";

            PreparedStatement p = connection.prepareStatement(sql);
            p.setInt(1, presupuestos.getIdPersona());
            p.setInt(2, presupuestos.getAnno());
            p.setString(3, presupuestos.getMes());
            p.setString(4, presupuestos.getSemana());
            p.setString(5, presupuestos.getTipo());
            p.setString(6, presupuestos.getClasificacion());
            p.setInt(7, presupuestos.getMonto());
            p.setString(8, presupuestos.getDescripcion());

            int res = p.executeUpdate();

            if (res == 1) {
                JOptionPane.showMessageDialog(null, "Se ha registrado "
                        + "satisfactoriamente!", "INFORMACION",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Lo sentimos, registro fallido",
                        "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("No se pudo establecer la conexión");
        }

    }

    public void Eliminar(Persona personas) {
        try (Connection connection = Conexion.getConexion()) {
            String sql = "delete  from persona where id = ?";

            PreparedStatement p = connection.prepareStatement(sql);
            p.setInt(1, personas.getId());

            int res = p.executeUpdate();

            if (res == 1) {
                JOptionPane.showMessageDialog(null, "Se ha eliminado "
                        + "satisfactoriamente!", "INFORMACION",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Lo sentimos, registro fallido",
                        "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("No se pudo establecer la conexión");
        }
    }

    public void modificarPersona(Persona personas) {
        try (Connection connection = Conexion.getConexion()) {
            String sql = "UPDATE persona\n"
                    + "	SET  nombre=?, edad=?, trabajo=?, genero=?, \"gradoEscolaridad\"=?\n"
                    + "	WHERE id=?;";

            PreparedStatement p = connection.prepareStatement(sql);
            p.setString(1, personas.getNombre());
            p.setInt(2, personas.getEdad());
            p.setString(3, personas.getTrabajo());
            p.setString(4, personas.getGenero());
            p.setString(5, personas.getEscolaridad());
            p.setInt(6, personas.getId());

            int res = p.executeUpdate();

            if (res == 1) {
                JOptionPane.showMessageDialog(null, "Se ha modificado "
                        + "satisfactoriamente!", "INFORMACION",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Lo sentimos, registro fallido",
                        "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("No se pudo establecer la conexión");
        }
    }

    public void EliminarFamilia(Familia familias) {
        try (Connection connection = Conexion.getConexion()) {
            String sql = "delete  from persona where id = ?";

            PreparedStatement p = connection.prepareStatement(sql);
            p.setString(1, familias.getApellido());

            int res = p.executeUpdate();

            if (res == 1) {
                JOptionPane.showMessageDialog(null, "Se ha eliminado "
                        + "satisfactoriamente!", "INFORMACION",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Lo sentimos, registro fallido",
                        "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("No se pudo establecer la conexión");
        }
    }

    public void modificarFamilia(Familia familias) {
        try (Connection connection = Conexion.getConexion()) {
            String sql = "UPDATE persona\n"
                    + "	SET  apellido=?";

            PreparedStatement p = connection.prepareStatement(sql);
            p.setString(1, familias.getApellido());

            int res = p.executeUpdate();

            if (res == 1) {
                JOptionPane.showMessageDialog(null, "Se ha modificado "
                        + "satisfactoriamente!", "INFORMACION",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Lo sentimos, registro fallido",
                        "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("No se pudo establecer la conexión");
        }
    }
}


