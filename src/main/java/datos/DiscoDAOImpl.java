package datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Disco;

public class DiscoDAOImpl implements DiscoDAO{
    
    private static final String SQL_SELECT = "SELECT * FROM discos";
    private static final String SQL_INSERT = "INSERT INTO discos (nombre, banda, genero, formato, precio) VALUES (?, ?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE discos SET nombre = ?, banda = ?, genero = ?, formato = ?, precio = ? WHERE id = ?";
    private static final String SQL_DELETE = "DELETE FROM discos WHERE id = ?";
    private static final String SQL_SELECT_BY_ID = "SELECT * FROM discos WHERE id = ?";

    @Override
    public List<Disco> Listar() {

        Connection conn = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        Disco disco = null;
        List<Disco> discos = new ArrayList<>();

        try {
            conn = Conexion.getConnection();
            stm = conn.prepareStatement(SQL_SELECT);
            rs = stm.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String banda = rs.getString("banda");
                String genero = rs.getString("genero");
                String formato = rs.getString("formato");
                int precio = rs.getInt("precio");

                disco = new Disco(id, nombre, banda, genero, formato, precio);

                discos.add(disco);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                Conexion.close(rs);
                Conexion.close(stm);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }

        return discos;
    }

    @Override
    public void insertar(Disco disco) {

        Connection conn = null;
        PreparedStatement stm = null;

        try {
            conn = Conexion.getConnection();
            stm = conn.prepareStatement(SQL_INSERT);

            stm.setString(1, disco.getNombre());
            stm.setString(2, disco.getBanda());
            stm.setString(3, disco.getGenero());
            stm.setString(4, disco.getFormato());
            stm.setInt(5, disco.getPrecio());

            stm.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                Conexion.close(stm);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
    }

    @Override
    public void editar(Disco disco) {

        Connection conn = null;
        PreparedStatement stm = null;

        try {
            conn = Conexion.getConnection();
            stm = conn.prepareStatement(SQL_UPDATE);

            stm.setString(1, disco.getNombre());
            stm.setString(2, disco.getBanda());
            stm.setString(3, disco.getGenero());
            stm.setString(4, disco.getFormato());
            stm.setInt(5, disco.getPrecio());
            stm.setInt(6, disco.getId());

            stm.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                Conexion.close(stm);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
    }

    @Override
    public void eliminar(Disco disco) {

        Connection conn = null;
        PreparedStatement stm = null;

        try {
            conn = Conexion.getConnection();
            stm = conn.prepareStatement(SQL_DELETE);

            stm.setInt(1, disco.getId());

            stm.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                Conexion.close(stm);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
    }

    @Override
    public Disco buscar(Disco disco) {

        Connection conn = null;
        PreparedStatement stm = null;
        ResultSet rs = null;

        try {
            conn = Conexion.getConnection();
            stm = conn.prepareStatement(SQL_SELECT_BY_ID);
            stm.setInt(1, disco.getId());
            rs = stm.executeQuery();
            //rs.absolute(1); //Nos posicionamos en la fila 1 

            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String banda = rs.getString("banda");
                String genero = rs.getString("genero");
                String formato = rs.getString("formato");
                int precio = rs.getInt("precio");

                disco = new Disco(id, nombre, banda, genero, formato, precio);
            }


        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                Conexion.close(rs);
                Conexion.close(stm);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return disco;
    }
}
