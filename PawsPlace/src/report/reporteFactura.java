/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package report;

import java.awt.Image;
import java.sql.Connection;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import model.conexion;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import view.moduloVentas;

/**
 *
 * @author maula
 */
public class reporteFactura {
    public static void reporte(long id, Image imagen){
        try {
            conexion con = new conexion();
            Connection conn = con.getConexion();
            
            JasperReport reporte = null;
            String path = "src\\factura\\factur.jasper";
            
            HashMap param = new HashMap();
            param.put("VENTA", id);
            param.put("IMAGEN", imagen);
            
            reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
            
            JasperPrint jprint = JasperFillManager.fillReport(reporte, param, conn);
            
            JasperViewer view = new JasperViewer(jprint, false);
            
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            
            JOptionPane.showMessageDialog(null, "Generado con exito");
            
            view.setVisible(true);
            
        } catch (JRException ex) {
            Logger.getLogger(moduloVentas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error al generar");
        }
    }
}
