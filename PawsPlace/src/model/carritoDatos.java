/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import static model.conexion.getConexion;

/**
 *
 * @author mlang
 */
public class carritoDatos extends conexion{
    //Metodo para ingresar datos
    public boolean ingresar(carritoModel ba) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "EXEC PAWPLACE.PA_MAN_TBL_PMK_CARRITO ?,?,?,?,?,?,?,?,?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, ba.getUSUARIO());
            ps.setInt(2, 0);
            ps.setInt(3, ba.getOPCION());
            ps.setInt(4, 0);
            ps.setInt(5, ba.getPK_TBL_PMK_CARRITO());
            ps.setInt(6, ba.getID_VENTA());
            ps.setInt(7, ba.getID_PRODUCTO());
            ps.setInt(8, ba.getCANTIDAD());
            ps.setDouble(9, ba.getSUBTOTAL());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    //Metodo para modificar datos
    public boolean modificar(carritoModel ba) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "EXEC PAWPLACE.PA_MAN_TBL_PMK_CARRITO ?,?,?,?,?,?,?,?,?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, ba.getUSUARIO());
            ps.setInt(2, 0);
            ps.setInt(3, ba.getOPCION());
            ps.setInt(4, 0);
            ps.setInt(5, ba.getPK_TBL_PMK_CARRITO());
            ps.setInt(6, ba.getID_VENTA());
            ps.setInt(7, ba.getID_PRODUCTO());
            ps.setInt(8, ba.getCANTIDAD());
            ps.setDouble(9, ba.getSUBTOTAL());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    //Metodo para eliminar datos
    public boolean eliminar(carritoModel ba) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "EXEC PAWPLACE.PA_MAN_TBL_PMK_CARRITO ?,?,?,?,?,?,?,?,?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, ba.getUSUARIO());
            ps.setInt(2, 0);
            ps.setInt(3, ba.getOPCION());
            ps.setInt(4, 0);
            ps.setInt(5, ba.getPK_TBL_PMK_CARRITO());
            ps.setInt(6, ba.getID_VENTA());
            ps.setInt(7, ba.getID_PRODUCTO());
            ps.setInt(8, ba.getCANTIDAD());
            ps.setDouble(9, ba.getSUBTOTAL());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    //Metodo para visualizar datos
    public ArrayList<Object[]> obtenerDatos(carritoModel ba) {
        ArrayList<Object[]> data = new ArrayList<>();

        conexion conn = new conexion();
        Connection con = conn.getConexion();
        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "EXEC PAWPLACE.PA_CON_TBL_PMK_CARRITO ?,?,?,?,?,?,?,?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, ba.getOPCION());
            ps.setString(2, ba.getUSUARIO());
            ps.setInt(3, 0);
            ps.setInt(4, ba.getPK_TBL_PMK_CARRITO());
            ps.setInt(5, ba.getID_VENTA());
            ps.setInt(6, ba.getID_PRODUCTO());
            ps.setInt(7, ba.getCANTIDAD());
            ps.setDouble(8,ba.getSUBTOTAL());

            rs = ps.executeQuery();
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumn = rsMd.getColumnCount();

            while (rs.next()) {
                Object[] fila = new Object[cantidadColumn];

                for (int i = 0; i < cantidadColumn; i++) {
                    fila[i] = rs.getObject(i + 1);
                }

                data.add(fila);
            }

        } catch (SQLException e) {
            System.err.println(e);
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                System.err.println(e);
            }
        }

        return data;
    }
}
