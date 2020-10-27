package DATOS;

import Entidades.Familia;
import Entidades.Persona;
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
            String sql = "INSERT INTO familia(apellido, provincia, canton, distrito, direccion)\n" +
"                               VALUES (?, ?, ?, ?, ?)";

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
            String sql = "INSERT INTO public.persona(\n" +
"	id, nombre, edad, trabajo, genero, \"gradoEscolaridad\", familia)\n" +
"	VALUES (?, ?, ?, ?, ?, ?, ?);";

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
}