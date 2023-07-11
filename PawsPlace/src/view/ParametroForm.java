/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import constants.paramsConst;
import constants.usuarioConst;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.parametroDatos;
import model.parametroModel;

/**
 *
 * @author maula
 */
public class ParametroForm extends javax.swing.JDialog {

    /**
     * Creates new form ParametroForm
     */
    parametroModel model = new parametroModel();
    parametroDatos datos = new parametroDatos();

    public ParametroForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        txtCedulaJuridica.setText(paramsConst.cedula_juridica);
        txtCorreo.setText(paramsConst.correo);
        txtDescripcion.setText(paramsConst.descripcion);
        txtDireccion.setText(paramsConst.direccion);
        txtEmpresa.setText(paramsConst.empresa);
        txtTelefono.setText(paramsConst.telefono);
        txtTipoTienda.setText(paramsConst.tipo_tienda);
        txtWeb.setText(paramsConst.web);
        ImageIcon imgi = new ImageIcon(paramsConst.imagen.getScaledInstance(128, 128, 0));
        lblImagen.setIcon(imgi);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnFoto = new javax.swing.JButton();
        txtRuta = new javax.swing.JTextField();
        txtCedulaJuridica = new javax.swing.JTextField();
        txtEmpresa = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtWeb = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        txtTipoTienda = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        lblImagen = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDireccion = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(123, 158, 171));

        btnGuardar.setBackground(new java.awt.Color(234, 234, 234));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/pencil.png"))); // NOI18N
        btnGuardar.setText("Modificar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnFoto.setBackground(new java.awt.Color(234, 234, 234));
        btnFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/folder.png"))); // NOI18N
        btnFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFotoActionPerformed(evt);
            }
        });

        txtRuta.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        txtRuta.setActionCommand("<Not Set>");
        txtRuta.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Imagen", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Sans", 1, 14))); // NOI18N

        txtCedulaJuridica.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        txtCedulaJuridica.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cedula Juridica", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Sans", 1, 14))); // NOI18N

        txtEmpresa.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        txtEmpresa.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Empresa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Sans", 1, 14))); // NOI18N

        txtTelefono.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        txtTelefono.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Telefono", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Sans", 1, 14))); // NOI18N

        txtCorreo.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        txtCorreo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Correo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Sans", 1, 14))); // NOI18N

        txtWeb.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        txtWeb.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Web", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Sans", 1, 14))); // NOI18N

        txtDescripcion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Descripcion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Sans", 1, 14))); // NOI18N

        txtTipoTienda.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        txtTipoTienda.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo Tienda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Sans", 1, 14))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(234, 234, 234));

        lblImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblImagen)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtDireccion.setColumns(20);
        txtDireccion.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        txtDireccion.setRows(5);
        txtDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Direccion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Sans", 1, 14))); // NOI18N
        jScrollPane1.setViewportView(txtDireccion);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtWeb, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(txtDescripcion)
                    .addComponent(txtTelefono)
                    .addComponent(txtCorreo)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtEmpresa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtCedulaJuridica, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTipoTienda))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 12, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(37, 37, 37))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addGap(199, 199, 199))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCedulaJuridica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtWeb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTipoTienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtRuta)
                            .addComponent(btnFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(btnGuardar)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFotoActionPerformed
        JFileChooser j = new JFileChooser();
        FileNameExtensionFilter fil = new FileNameExtensionFilter("JPG, PNG & GIF", "jpg", "png", "gif");
        j.setFileFilter(fil);

        int s = j.showOpenDialog(this);
        if (s == JFileChooser.APPROVE_OPTION) {
            String ruta = j.getSelectedFile().getAbsolutePath();
            txtRuta.setText(ruta);
            File ruta2 = new File(txtRuta.getText());
            try {
                byte[] icono = new byte[(int) ruta2.length()];
                InputStream input = new FileInputStream(ruta2);
                input.read(icono);
                BufferedImage image = null;
                InputStream in = new ByteArrayInputStream(icono);
                image = ImageIO.read(in);
                ImageIcon imgi = new ImageIcon(image.getScaledInstance(128, 128, 0));
                lblImagen.setIcon(imgi);
            } catch (Exception ex) {
                lblImagen.setIcon(null);
            }
        }
    }//GEN-LAST:event_btnFotoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        model.setOPCION(0);
        model.setUSUARIO(usuarioConst.nombre + "." + usuarioConst.apellido);
        model.setPK_TBL_PMK_PARAMETRO(1);
        model.setCEDULA_JURIDICA(txtCedulaJuridica.getText());
        model.setEMPRESA(txtEmpresa.getText());
        model.setTELEFONO(txtTelefono.getText());
        model.setCORREO(txtCorreo.getText());
        model.setWEB(txtWeb.getText());
        model.setDIRECCION(txtDireccion.getText());
        model.setDESCRIPCION(txtDescripcion.getText());
        model.setTIPO_TIENDA(txtTipoTienda.getText());
        File ruta = new File(txtRuta.getText());
        try {
            byte[] icono = new byte[(int) ruta.length()];
            InputStream input = new FileInputStream(ruta);
            input.read(icono);
            model.setLOGO(icono);
        } catch (Exception ex) {
            model.setLOGO(null);
        }

        if (datos.modificar(model)) {
            JOptionPane.showMessageDialog(null, "Ingresado con exito");
            BufferedImage image = null;
            InputStream in = new ByteArrayInputStream(model.getLOGO());
            try {
                image = ImageIO.read(in);
            } catch (IOException ex) {
                Logger.getLogger(ParametroForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            paramsConst.eliminarParametros();
            paramsConst.guardarParametros(model.getCEDULA_JURIDICA(), model.getEMPRESA(), model.getTELEFONO(), model.getCORREO(), model.getWEB(), model.getDIRECCION(), model.getDESCRIPCION(), model.getTIPO_TIENDA(), image);
        } else {
            JOptionPane.showMessageDialog(null, "No se ha ingresado con exito");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ParametroForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ParametroForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ParametroForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ParametroForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ParametroForm dialog = new ParametroForm(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFoto;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JTextField txtCedulaJuridica;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextArea txtDireccion;
    private javax.swing.JTextField txtEmpresa;
    private javax.swing.JTextField txtRuta;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTipoTienda;
    private javax.swing.JTextField txtWeb;
    // End of variables declaration//GEN-END:variables
}
