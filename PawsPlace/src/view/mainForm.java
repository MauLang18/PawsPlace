/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import constants.paramsConst;
import constants.usuarioConst;
import javax.swing.ImageIcon;
import javax.swing.JComponent;

/**
 *
 * @author mlang
 */
public class mainForm extends javax.swing.JFrame {

    /**
     * Creates new form mainForm
     */

    public mainForm() {
        initComponents();
        ImageIcon imgi = new ImageIcon(paramsConst.imagen.getScaledInstance(128, 128, 0));
        lblLogo.setIcon(imgi);
        lblEmpresa.setText(paramsConst.empresa);
        setTitle(paramsConst.empresa);
        setLocationRelativeTo(null);
        setIconImage(paramsConst.imagen);

        //Mostrar los datos del usuario
        lblUsuario.setText(usuarioConst.nombre + " " + usuarioConst.apellido);
        lblRol.setText(usuarioConst.obtenerRol());

        //Validar si es gerente o vendedor
        if (usuarioConst.obtenerRol().equals("VENDEDOR")) {
            Menu2.setVisible(false);
            btnClientes.setEnabled(false);
            btnUsuarios.setEnabled(false);
            btnInventario.setEnabled(false);
            btnVentas.setEnabled(true);
        } else {
            Menu2.setVisible(true);
            btnClientes.setEnabled(true);
            btnUsuarios.setEnabled(true);
            btnInventario.setEnabled(true);
            btnVentas.setEnabled(true);
        }
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
        lblEmpresa = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        lblRol = new javax.swing.JLabel();
        pnlEscritorio = new javax.swing.JDesktopPane();
        btnInventario = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Menu = new javax.swing.JMenu();
        btnSalir = new javax.swing.JMenuItem();
        btnCerrarSesion = new javax.swing.JMenuItem();
        Menu2 = new javax.swing.JMenu();
        btnParametros = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(73, 165, 164));

        lblEmpresa.setBackground(new java.awt.Color(255, 255, 255));
        lblEmpresa.setFont(new java.awt.Font("Lucida Sans", 0, 48)); // NOI18N
        lblEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        lblEmpresa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmpresa.setText("PawPlace");

        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/pet-shop.png"))); // NOI18N

        lblUsuario.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuario.setText("jLabel8");

        lblRol.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        lblRol.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRol.setText("jLabel9");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
            .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel3)
                .addContainerGap(274, Short.MAX_VALUE))
            .addComponent(lblRol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(lblUsuario)
                .addGap(37, 37, 37)
                .addComponent(lblRol)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLogo)
                .addGap(90, 90, 90)
                .addComponent(lblEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(159, 159, 159))
        );

        pnlEscritorio.setBackground(new java.awt.Color(136, 191, 190));

        btnInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/inventory.png"))); // NOI18N
        btnInventario.setToolTipText("Inventario");
        btnInventario.setBorderPainted(false);
        btnInventario.setContentAreaFilled(false);
        btnInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventarioActionPerformed(evt);
            }
        });

        btnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/client.png"))); // NOI18N
        btnClientes.setToolTipText("Clientes");
        btnClientes.setBorderPainted(false);
        btnClientes.setContentAreaFilled(false);
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        btnUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/user.png"))); // NOI18N
        btnUsuarios.setToolTipText("Usuarios");
        btnUsuarios.setBorderPainted(false);
        btnUsuarios.setContentAreaFilled(false);
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });

        btnVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/point-of-sale.png"))); // NOI18N
        btnVentas.setToolTipText("Ventas");
        btnVentas.setBorderPainted(false);
        btnVentas.setContentAreaFilled(false);
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VENTAS");

        jLabel5.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("INVENTARIO");

        jLabel6.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("CLIENTES");

        jLabel7.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("USUARIOS");

        pnlEscritorio.setLayer(btnInventario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlEscritorio.setLayer(btnClientes, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlEscritorio.setLayer(btnUsuarios, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlEscritorio.setLayer(btnVentas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlEscritorio.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlEscritorio.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlEscritorio.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pnlEscritorio.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout pnlEscritorioLayout = new javax.swing.GroupLayout(pnlEscritorio);
        pnlEscritorio.setLayout(pnlEscritorioLayout);
        pnlEscritorioLayout.setHorizontalGroup(
            pnlEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEscritorioLayout.createSequentialGroup()
                .addGroup(pnlEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(pnlEscritorioLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlEscritorioLayout.createSequentialGroup()
                            .addGap(109, 109, 109)
                            .addGroup(pnlEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 239, Short.MAX_VALUE)
                .addGroup(pnlEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInventario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUsuarios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(141, 141, 141))
        );
        pnlEscritorioLayout.setVerticalGroup(
            pnlEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEscritorioLayout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(pnlEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEscritorioLayout.createSequentialGroup()
                        .addComponent(btnVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(98, 98, 98)
                        .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlEscritorioLayout.createSequentialGroup()
                        .addComponent(btnInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                        .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addGap(105, 105, 105))))
        );

        jMenuBar1.setBorderPainted(false);

        Menu.setText("Salir");

        btnSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/shutdown.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        Menu.add(btnSalir);

        btnCerrarSesion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        btnCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logout.png"))); // NOI18N
        btnCerrarSesion.setText("Cerrar Sesion");
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });
        Menu.add(btnCerrarSesion);

        jMenuBar1.add(Menu);

        Menu2.setText("Configuracion");

        btnParametros.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        btnParametros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/adjust.png"))); // NOI18N
        btnParametros.setText("Parametros");
        btnParametros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParametrosActionPerformed(evt);
            }
        });
        Menu2.add(btnParametros);

        jMenuBar1.add(Menu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnlEscritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlEscritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Boton del modulo de control de usuarios
    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        //Crea una instancia de la vista
        moduloControUsuario af = new moduloControUsuario();

        //Agrega el modulo al desktop panel
        pnlEscritorio.add(af);

        //Muestra la instancia
        af.show();
    }//GEN-LAST:event_btnUsuariosActionPerformed

    //Boton del modulo de ventas
    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
        //Crea una instancia de la vista
        moduloVentas af = new moduloVentas();

        //Agrega el modulo al desktop panel
        pnlEscritorio.add(af);

        //Muestra la instancia
        af.show();
    }//GEN-LAST:event_btnVentasActionPerformed

    //Boton del modulo de inventario
    private void btnInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventarioActionPerformed
        //Crea una instancia de la vista
        moduloInventario af = new moduloInventario();

        //Agrega el modulo al desktop panel
        pnlEscritorio.add(af);

        //Muestra la instancia
        af.show();
    }//GEN-LAST:event_btnInventarioActionPerformed

    //Boton del modulo de cliente
    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        //Crea una instancia de la vista
        moduloCliente af = new moduloCliente();

        //Agrega el modulo al desktop panel
        pnlEscritorio.add(af);

        //Muestra la instancia
        af.show();
    }//GEN-LAST:event_btnClientesActionPerformed

    //Boton para cerrar el sistema
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        //Funcion para cerrar el programa
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        //Funcion para cerrar la sesion
        this.dispose();

        loginForm lg = new loginForm();
        lg.setVisible(true);

        //Funcion para borrar los datos de la sesion
        usuarioConst.cerrarSesion();
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnParametrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParametrosActionPerformed
        //Creamos una instancia del modal
        ParametroForm fm = new ParametroForm(this, true);
        //Colocamos el modal en media pantalla
        fm.setLocationRelativeTo(null);
        //Mostramos el modal
        fm.setVisible(true);
        
        ImageIcon imgi = new ImageIcon(paramsConst.imagen.getScaledInstance(128, 128, 0));
        lblLogo.setIcon(imgi);
        lblEmpresa.setText(paramsConst.empresa);
        setTitle(paramsConst.empresa);
        setLocationRelativeTo(null);
        setIconImage(paramsConst.imagen);
    }//GEN-LAST:event_btnParametrosActionPerformed

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
            java.util.logging.Logger.getLogger(mainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Menu;
    private javax.swing.JMenu Menu2;
    private javax.swing.JMenuItem btnCerrarSesion;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnInventario;
    private javax.swing.JMenuItem btnParametros;
    private javax.swing.JMenuItem btnSalir;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JButton btnVentas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblEmpresa;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblRol;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JDesktopPane pnlEscritorio;
    // End of variables declaration//GEN-END:variables
}
