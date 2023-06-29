/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import java.awt.Component;
import java.awt.Frame;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import model.clienteDatos;
import model.clienteModel;

/**
 *
 * @author maula
 */
public class ClienteForm extends javax.swing.JDialog {

    /**
     * Creates new form ClienteForm
     */
    //ArrayList para almacenar los datos de la consulta
    ArrayList<Object[]> data = new ArrayList<>();

    //Creando instancias de modelo y datos
    clienteModel model = new clienteModel();
    clienteDatos datos = new clienteDatos();

    //Variable para asignar el valor del cliente
    private ArrayList<Object> valor = new ArrayList<>();

    //Creando el modelo de la tabla
    DefaultTableModel tableModel = new DefaultTableModel();

    public ClienteForm(Component parent, boolean modal) {
        super((Frame) SwingUtilities.getWindowAncestor(parent), modal);
        initComponents();
        
        //Añadiendo las columnas a la tabla
        tableModel.addColumn("ID");
        tableModel.addColumn("CEDULA");
        tableModel.addColumn("NOMBRE");
        tableModel.addColumn("APELLIDO1");
        tableModel.addColumn("APELLIDO2");
        tableModel.addColumn("CORREO");
        tableModel.addColumn("TELEFONO");
        
        //Agregando los datos a la tabla
        tblClientes.setModel(tableModel);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        txtApellido1 = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        txtApellido2 = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(123, 158, 171));

        tblClientes = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblClientes.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblClientes);

        txtApellido1.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        txtApellido1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Apellido1", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Sans", 1, 14))); // NOI18N
        txtApellido1.setPreferredSize(new java.awt.Dimension(77, 39));

        txtCedula.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        txtCedula.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cedula", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Sans", 1, 14))); // NOI18N
        txtCedula.setPreferredSize(new java.awt.Dimension(77, 39));

        btnAgregar.setBackground(new java.awt.Color(234, 234, 234));
        btnAgregar.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/plus.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(234, 234, 234));
        btnBuscar.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/search.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtNombre.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        txtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Sans", 1, 14))); // NOI18N
        txtNombre.setPreferredSize(new java.awt.Dimension(77, 39));

        txtApellido2.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        txtApellido2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Apellido2", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Sans", 1, 14))); // NOI18N
        txtApellido2.setPreferredSize(new java.awt.Dimension(77, 39));

        txtCorreo.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        txtCorreo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Correo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Sans", 1, 14))); // NOI18N
        txtCorreo.setPreferredSize(new java.awt.Dimension(77, 39));

        txtTelefono.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        txtTelefono.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Telefono", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Sans", 1, 14))); // NOI18N
        txtTelefono.setPreferredSize(new java.awt.Dimension(77, 39));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtApellido2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCedula, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtApellido1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(btnAgregar))
                .addContainerGap(27, Short.MAX_VALUE))
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

    private void tblClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientesMouseClicked
        //Obtiene la posicion donde se hizo el click
        int filaSeleccionada = tblClientes.getSelectedRow();
        //Se realiza una condicional para determinar si la fila seleccionada es mayor o igual a 0
        if (filaSeleccionada >= 0) {
            //Se crea una instacia de ArrayList
            ArrayList<Object> datosFila = new ArrayList<>();
            //Se empieza a recorrer la tabla para obtener los valores de la fila seleccionada
            for (int i = 0; i < tableModel.getColumnCount(); i++) {
                datosFila.add(tableModel.getValueAt(filaSeleccionada, i));
            }

            //Se guarda el valor de la tabla en una variable
            valor = datosFila;
            dispose();
        }
    }//GEN-LAST:event_tblClientesMouseClicked

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        //Atributos
        model.setOPCION(0);
        model.setUSUARIO("MAURICE.LANG");
        model.setPK_TBL_PMK_CLIENTE(0);

        model.setCEDULA(txtCedula.getText());
        model.setNOMBRE(txtNombre.getText().toUpperCase());
        model.setAPELLIDO1(txtApellido1.getText().toUpperCase());
        model.setAPELLIDO2(txtApellido2.getText().toUpperCase());
        model.setCORREO(txtCorreo.getText().toLowerCase());
        model.setTELEFONO(txtTelefono.getText());

        //Condicional para saber si se hizo la transaccion
        if (datos.ingresar(model)) {
            JOptionPane.showMessageDialog(null, "Ingresado con exito");
            limpiar();

            data = null;
            tableModel.setRowCount(0);

            data = datos.obtenerDatos(model);

            for (Object[] fila : data) {
                tableModel.addRow(fila);
            }

            //Agregando los datos a la tabla
            tblClientes.setModel(tableModel);
        } else {
            JOptionPane.showMessageDialog(null, "Error al ingresar");
            limpiar();
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        model.setOPCION(0);
        model.setUSUARIO("MAURICE.LANG");

        //JOptionPane para saber el tipo de dato que desea buscar
        Object buscar = JOptionPane.showInputDialog(null, "Seleccione una Opcion", "Buscar", JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Seleccione", "Cedula", "Nombre", "Primer Apellido"}, "Seleccione");

        //Variable para almacenar el dato
        String valor = JOptionPane.showInputDialog("Ingrese " + buscar + " para buscar: ");

        //Condicional para buscar por el tipo de dato elegido
        switch (buscar.toString()) {
            case "Cedula":
                //Atributos
                model.setPK_TBL_PMK_CLIENTE(0);
                model.setCEDULA(valor);
                model.setNOMBRE("");
                model.setAPELLIDO1("");

                data = null;
                tableModel.setRowCount(0);

                data = datos.obtenerDatos(model);

                for (Object[] fila : data) {
                    tableModel.addRow(fila);
                }

                //Agregando los datos a la tabla
                tblClientes.setModel(tableModel);
                break;
            case "Nombre":
                //Atributos
                model.setPK_TBL_PMK_CLIENTE(0);
                model.setCEDULA("");
                model.setNOMBRE(valor);
                model.setAPELLIDO1("");

                data = null;
                tableModel.setRowCount(0);

                data = datos.obtenerDatos(model);

                for (Object[] fila : data) {
                    tableModel.addRow(fila);
                }

                //Agregando los datos a la tabla
                tblClientes.setModel(tableModel);
                break;
            case "Primer Apellido":
                //Atributos
                model.setPK_TBL_PMK_CLIENTE(0);
                model.setCEDULA("");
                model.setNOMBRE("");
                model.setAPELLIDO1(valor);

                data = null;
                tableModel.setRowCount(0);

                data = datos.obtenerDatos(model);

                for (Object[] fila : data) {
                    tableModel.addRow(fila);
                }

                //Agregando los datos a la tabla
                tblClientes.setModel(tableModel);
                break;
            default:
                JOptionPane.showMessageDialog(null, "No es una opcion valida");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(ClienteForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ClienteForm dialog = new ClienteForm(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTextField txtApellido1;
    private javax.swing.JTextField txtApellido2;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    public ArrayList<Object> obtenerValor() {
        setVisible(false);
        return valor;
    }

    public void limpiar() {
        txtCedula.setText("");
        txtNombre.setText("");
        txtApellido1.setText("");
        txtApellido2.setText("");
        txtCorreo.setText("");
        txtTelefono.setText("");
    }
}
