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
 * @author maula
 */
public class parametroDatos extends conexion{
    //Metodo para ingresar datos
    public boolean modificar(parametroModel ba) {
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "EXEC PAWPLACE.PA_MAN_TBL_PMK_PARAMETRO ?,?,?,?,?,?,?,?,?,?,?,?,?,?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, ba.getUSUARIO());
            ps.setInt(2, 0);
            ps.setInt(3, ba.getOPCION());
            ps.setInt(4, 0);
            ps.setInt(5, ba.getPK_TBL_PMK_PARAMETRO());
            ps.setString(6, ba.getCEDULA_JURIDICA());
            ps.setString(7, ba.getEMPRESA());
            ps.setString(8, ba.getTELEFONO());
            ps.setString(9, ba.getCORREO());
            ps.setString(10, ba.getWEB());
            ps.setString(11, ba.getDIRECCION());
            ps.setString(12, ba.getDESCRIPCION());
            ps.setString(13, ba.getTIPO_TIENDA());
            ps.setBytes(14, ba.getLOGO());
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
    public ArrayList<Object[]> obtenerDatos(parametroModel ba) {
        ArrayList<Object[]> data = new ArrayList<>();

        conexion conn = new conexion();
        Connection con = conn.getConexion();
        PreparedStatement ps = null;
        ResultSet rs = null;

        String sql = "EXEC PAWPLACE.PA_CON_TBL_PMK_PARAMETRO ?,?,?,?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, ba.getOPCION());
            ps.setString(2, ba.getUSUARIO());
            ps.setInt(3, 0);
            ps.setInt(4, ba.getPK_TBL_PMK_PARAMETRO());

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
    
    /*public ArrayList<ProductoVO> Listar_ProductoVO(){
        ArrayList<ProductoVO> list = new ArrayList<ProductoVO>();
        Conectar conec = new Conectar();
        String sql = "SELECT * FROM producto;";
        ResultSet rs = null;
        PreparedStatement ps = null;
        try{
            ps = conec.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                ProductoVO vo = new ProductoVO();
                vo.setIdproducto(rs.getInt(1));
                vo.setNombre(rs.getString(2));
                vo.setPrecio(rs.getDouble(3));
                vo.setMarca(rs.getString(4));
                vo.setFoto(rs.getBytes(5));
                list.add(vo);
            }
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }finally{
            try{
                ps.close();
                rs.close();
                conec.desconectar();
            }catch(Exception ex){}
        }
        return list;
    }*/
}
