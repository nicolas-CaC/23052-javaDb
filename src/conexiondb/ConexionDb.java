package conexiondb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// GRABAR VIDEO DE POLI Y CONDICIONAL
public class ConexionDb {

    public static void main(String[] args) throws SQLException {

        Conexion conexion = new Conexion();
        Connection connect = conexion.getConnection();
        
        PreparedStatement ps ;
        ResultSet rs;
        
        ps = connect.prepareStatement("SELECT * from clientes");
        rs = ps.executeQuery();
        
        
        while(rs.next()){
            int id = rs.getInt("id");
            String nombre = rs.getString("nombre");
            String apellido = rs.getString("apellido");
            byte edad = rs.getByte("edad");
            
            System.out.println("id: " + id + "\nnombre: " + nombre + "\napellido: " + apellido + "\nedad: " + edad);
        }
        
        System.out.println("Finalizado");
    }

}
