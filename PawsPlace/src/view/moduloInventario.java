/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package view;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.categoriaDatos;
import model.categoriaModel;
import model.inventarioDatos;
import model.inventarioModel;

/**
 *
 * @author mlang
 */
public class moduloInventario extends javax.swing.JInternalFrame {

    /**
     * Creates new form moduloInventario
     */
    //Variable para guardar el dato obtenido de las categorias
    private ArrayList<Object> categorias = new ArrayList();

    //ArrayList para almacenar los datos de la consulta
    ArrayList<Object[]> data = new ArrayList<>();
    ArrayList<Object[]> data1 = new ArrayList<>();

    //Creando instancias de modelo y datos
    inventarioModel model = new inventarioModel();
    inventarioModel model1 = new inventarioModel();
    categoriaModel model2 = new categoriaModel();
    inventarioDatos datos = new inventarioDatos();
    categoriaDatos datos1 = new categoriaDatos();

    //Creando el modelo de la tabla
    DefaultTableModel tableModel = new DefaultTableModel();

    //Variable para guardar el Id
    private String Id = "";

    public moduloInventario() {
        initComponents();

        //Asignando valores a los atributos
        model.setOPCION(0);
        model.setPK_TBL_PMK_INVENTARIO(0);
        model.setUSUARIO("MAURICE.LANG");
        model.setCODIGO("");
        model.setNOMBRE("");
        model.setTIPO_ANIMAL("");
        model.setPRECIO(0.0);
        model.setCANTIDAD(0);
        model.setID_CATEGORIA(0);

        //Guardando los datos en la arraylist
        data = datos.obtenerDatos(model);

        //Añadiendo las columnas a la tabla
        tableModel.addColumn("ID");
        tableModel.addColumn("CODIGO");
        tableModel.addColumn("NOMBRE");
        tableModel.addColumn("TIPO ANIMAL");
        tableModel.addColumn("PRECIO");
        tableModel.addColumn("CANTIDAD");
        tableModel.addColumn("CATEGORIA");

        //Leyendo los datos por medio de un for each
        for (Object[] fila : data) {
            tableModel.addRow(fila);
        }

        //Agregando los datos a la tabla
        tblInventario.setModel(tableModel);
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
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtTipoAnimal = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInventario = new javax.swing.JTable();
        txtCategoria = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Inventario");
        setAutoscrolls(true);
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/inventory (1).png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(198, 216, 211));

        txtCodigo.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        txtCodigo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Codigo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Sans", 1, 14))); // NOI18N

        txtNombre.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        txtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Sans", 1, 14))); // NOI18N
        txtNombre.setPreferredSize(new java.awt.Dimension(77, 39));

        txtTipoAnimal.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        txtTipoAnimal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo de Animal", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Sans", 1, 14))); // NOI18N
        txtTipoAnimal.setPreferredSize(new java.awt.Dimension(77, 39));

        txtPrecio.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        txtPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Precio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Sans", 1, 14))); // NOI18N
        txtPrecio.setPreferredSize(new java.awt.Dimension(77, 39));

        txtCantidad.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cantidad", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Sans", 1, 14))); // NOI18N
        txtCantidad.setPreferredSize(new java.awt.Dimension(77, 39));

        tblInventario.setModel(new javax.swing.table.DefaultTableModel(
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
        tblInventario.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblInventarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblInventario);

        txtCategoria.setEditable(false);
        txtCategoria.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        txtCategoria.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Categoria", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Sans", 1, 14))); // NOI18N
        txtCategoria.setPreferredSize(new java.awt.Dimension(77, 39));
        txtCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCategoriaMouseClicked(evt);
            }
        });

        btnAgregar.setBackground(new java.awt.Color(234, 234, 234));
        btnAgregar.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/plus.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(234, 234, 234));
        btnModificar.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/pencil.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(234, 234, 234));
        btnEliminar.setFont(new java.awt.Font("Lucida Sans", 0, 12)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/trash.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTipoAnimal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgregar))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnModificar)
                        .addGap(124, 124, 124)
                        .addComponent(btnEliminar)
                        .addGap(105, 105, 105)
                        .addComponent(btnBuscar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane1)))
                .addGap(48, 48, 48))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(txtTipoAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar)
                    .addComponent(btnBuscar))
                .addContainerGap(70, Short.MAX_VALUE))
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

    private void txtCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCategoriaMouseClicked
        //Creamos una instancia del modal
        CategoriaForm fm = new CategoriaForm(this, true);
        //Colocamos el modal en media pantalla
        fm.setLocationRelativeTo(null);
        //Mostramos el modal
        fm.setVisible(true);
        //Guardamos el valor obtenido
        categorias = fm.obtenerValor();

        //Validamos si categorias no es null
        if (categorias != null) {
            //Asignamos valor al txtCategoria
            txtCategoria.setText(categorias.get(1).toString());
            //Varible para guardar las primeras letras de la categoria
            String letrasCategoria = categorias.get(1).toString().substring(0, 3);
            //Variable para crear las iniciales del codigo
            String cod = "COD-" + letrasCategoria + "-";
            txtCodigo.setText(cod);
        }
    }//GEN-LAST:event_txtCategoriaMouseClicked

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        //Atributos
        model.setOPCION(0);
        model.setUSUARIO("MAURICE.LANG");

        //Condicional para validar si el campo id tiene un valor
        if (!Id.equals("")) {
            model.setPK_TBL_PMK_INVENTARIO(Integer.parseInt(Id));
        } else {
            model.setPK_TBL_PMK_INVENTARIO(0);
        }

        model.setCODIGO(txtCodigo.getText().toUpperCase());
        model.setNOMBRE(txtNombre.getText().toUpperCase());
        model.setTIPO_ANIMAL(txtTipoAnimal.getText().toUpperCase());
        model.setPRECIO(Double.parseDouble(txtPrecio.getText()));
        model.setCANTIDAD(Integer.parseInt(txtCantidad.getText()));
        model.setID_CATEGORIA(Integer.parseInt(categorias.get(0).toString()));

        //Condicional para saber si se hizo la transaccion
        if (datos.ingresar(model)) {
            JOptionPane.showMessageDialog(null, "Ingresado con exito");
            limpiar();

            model1.setOPCION(0);
            model1.setUSUARIO("MAURICE.LANG");
            model1.setPK_TBL_PMK_INVENTARIO(0);
            model1.setCODIGO("");
            model1.setNOMBRE("");
            model1.setTIPO_ANIMAL("");
            model1.setPRECIO(0.0);
            model1.setCANTIDAD(0);
            model1.setID_CATEGORIA(0);

            data = null;
            tableModel.setRowCount(0);

            data = datos.obtenerDatos(model1);

            for (Object[] fila : data) {
                tableModel.addRow(fila);
            }

            //Agregando los datos a la tabla
            tblInventario.setModel(tableModel);
        } else {
            JOptionPane.showMessageDialog(null, "Error al ingresar");
            limpiar();
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void tblInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblInventarioMouseClicked
        //Obtiene la posicion donde se hizo el click
        int filaSeleccionada = tblInventario.getSelectedRow();
        //Se realiza una condicional para determinar si la fila seleccionada es mayor o igual a 0
        if (filaSeleccionada >= 0) {
            //Se crea una instacia de ArrayList
            ArrayList<Object> datosFila = new ArrayList<>();
            //Se empieza a recorrer la tabla para obtener los valores de la fila seleccionada
            for (int i = 0; i < tableModel.getColumnCount(); i++) {
                datosFila.add(tableModel.getValueAt(filaSeleccionada, i));
            }

            //Agregan los datos a los textfield
            Id = datosFila.get(0).toString();
            txtCodigo.setText(datosFila.get(1).toString());
            txtNombre.setText(datosFila.get(2).toString());
            txtTipoAnimal.setText(datosFila.get(3).toString());
            txtPrecio.setText(datosFila.get(4).toString());
            txtCantidad.setText(datosFila.get(5).toString());
            txtCategoria.setText(datosFila.get(6).toString());
        }
    }//GEN-LAST:event_tblInventarioMouseClicked

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        //Atributos
        model.setOPCION(0);
        model.setUSUARIO("MAURICE.LANG");

        //Condicional para validar si el campo id tiene un valor
        if (!Id.equals("")) {
            model.setPK_TBL_PMK_INVENTARIO(Integer.parseInt(Id));
        } else {
            model.setPK_TBL_PMK_INVENTARIO(0);
        }
        
        model2.setOPCION(0);
        model2.setUSUARIO("MAURICE.LANG");
        model2.setPK_TBL_PMK_CATEGORIA(0);
        model2.setCATEGORIA(txtCategoria.getText());

        data1 = datos1.obtenerDatos(model2);
        
        model.setCODIGO(txtCodigo.getText().toUpperCase());
        model.setNOMBRE(txtNombre.getText().toUpperCase());
        model.setTIPO_ANIMAL(txtTipoAnimal.getText().toUpperCase());
        model.setPRECIO(Double.parseDouble(txtPrecio.getText()));
        model.setCANTIDAD(Integer.parseInt(txtCantidad.getText()));
        model.setID_CATEGORIA(Integer.parseInt(data1.get(0)[0].toString()));

        //Condicional para saber si se hizo la transaccion
        if (datos.modificar(model)) {
            JOptionPane.showMessageDialog(null, "Modificado con exito");
            limpiar();

            model1.setOPCION(0);
            model1.setUSUARIO("MAURICE.LANG");
            model1.setPK_TBL_PMK_INVENTARIO(0);
            model1.setCODIGO("");
            model1.setNOMBRE("");
            model1.setTIPO_ANIMAL("");
            model1.setPRECIO(0.0);
            model1.setCANTIDAD(0);
            model1.setID_CATEGORIA(0);

            data = null;
            tableModel.setRowCount(0);

            data = datos.obtenerDatos(model1);

            for (Object[] fila : data) {
                tableModel.addRow(fila);
            }

            //Agregando los datos a la tabla
            tblInventario.setModel(tableModel);
        } else {
            JOptionPane.showMessageDialog(null, "Error al modificar");
            limpiar();
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        //Atributos
        model.setOPCION(1);
        model.setUSUARIO("MAURICE.LANG");

        //Condicional para validar si el campo id tiene un valor
        if (!Id.equals("")) {
            model.setPK_TBL_PMK_INVENTARIO(Integer.parseInt(Id));
        } else {
            model.setPK_TBL_PMK_INVENTARIO(0);
        }

        model.setCODIGO(txtCodigo.getText().toUpperCase());
        model.setNOMBRE(txtNombre.getText().toUpperCase());
        model.setTIPO_ANIMAL(txtTipoAnimal.getText().toUpperCase());
        model.setPRECIO(Double.parseDouble(txtPrecio.getText()));
        model.setCANTIDAD(Integer.parseInt(txtCantidad.getText()));
        model.setID_CATEGORIA(Integer.parseInt(categorias.get(0).toString()));

        //Condicional para saber si se hizo la transaccion
        if (datos.eliminar(model)) {
            JOptionPane.showMessageDialog(null, "Eliminado con exito");
            limpiar();

            model1.setOPCION(0);
            model1.setUSUARIO("MAURICE.LANG");
            model1.setPK_TBL_PMK_INVENTARIO(0);
            model1.setCODIGO("");
            model1.setNOMBRE("");
            model1.setTIPO_ANIMAL("");
            model1.setPRECIO(0.0);
            model1.setCANTIDAD(0);
            model1.setID_CATEGORIA(0);

            data = null;
            tableModel.setRowCount(0);

            data = datos.obtenerDatos(model1);

            for (Object[] fila : data) {
                tableModel.addRow(fila);
            }

            //Agregando los datos a la tabla
            tblInventario.setModel(tableModel);
        } else {
            JOptionPane.showMessageDialog(null, "Error al eliminar");
            limpiar();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        model.setOPCION(0);
        model.setUSUARIO("MAURICE.LANG");

        //JOptionPane para saber el tipo de dato que desea buscar
        Object buscar = JOptionPane.showInputDialog(null, "Seleccione una Opcion", "Buscar", JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Seleccione", "Id", "Codigo", "Nombre", "Tipo Animal", "Precio", "Cantidad"}, "Seleccione");

        //Variable para almacenar el dato
        String valor = JOptionPane.showInputDialog("Ingrese " + buscar + " para buscar: ");

        //Condicional para buscar por el tipo de dato elegido
        switch (buscar.toString()) {
            case "Id":
                //Atributos
                model.setPK_TBL_PMK_INVENTARIO(Integer.parseInt(valor));
                model.setCODIGO("");
                model.setNOMBRE("");
                model.setTIPO_ANIMAL("");
                model.setPRECIO(0.0);
                model.setCANTIDAD(0);
                model.setID_CATEGORIA(0);

                data = null;
                tableModel.setRowCount(0);

                data = datos.obtenerDatos(model);

                for (Object[] fila : data) {
                    tableModel.addRow(fila);
                }

                //Agregando los datos a la tabla
                tblInventario.setModel(tableModel);
                break;
            case "Codigo":
                //Atributos
                model.setPK_TBL_PMK_INVENTARIO(0);
                model.setCODIGO(valor);
                model.setNOMBRE("");
                model.setTIPO_ANIMAL("");
                model.setPRECIO(0.0);
                model.setCANTIDAD(0);
                model.setID_CATEGORIA(0);

                data = null;
                tableModel.setRowCount(0);

                data = datos.obtenerDatos(model);

                for (Object[] fila : data) {
                    tableModel.addRow(fila);
                }

                //Agregando los datos a la tabla
                tblInventario.setModel(tableModel);
                break;
            case "Nombre":
                //Atributos
                model.setPK_TBL_PMK_INVENTARIO(0);
                model.setCODIGO("");
                model.setNOMBRE(valor);
                model.setTIPO_ANIMAL("");
                model.setPRECIO(0.0);
                model.setCANTIDAD(0);
                model.setID_CATEGORIA(0);

                data = null;
                tableModel.setRowCount(0);

                data = datos.obtenerDatos(model);

                for (Object[] fila : data) {
                    tableModel.addRow(fila);
                }

                //Agregando los datos a la tabla
                tblInventario.setModel(tableModel);
                break;
            case "Tipo Animal":
                //Atributos
                model.setPK_TBL_PMK_INVENTARIO(0);
                model.setCODIGO("");
                model.setNOMBRE("");
                model.setTIPO_ANIMAL(valor);
                model.setPRECIO(0.0);
                model.setCANTIDAD(0);
                model.setID_CATEGORIA(0);

                data = null;
                tableModel.setRowCount(0);

                data = datos.obtenerDatos(model);

                for (Object[] fila : data) {
                    tableModel.addRow(fila);
                }

                //Agregando los datos a la tabla
                tblInventario.setModel(tableModel);
                break;
            case "Precio":
                //Atributos
                model.setPK_TBL_PMK_INVENTARIO(0);
                model.setCODIGO("");
                model.setNOMBRE("");
                model.setTIPO_ANIMAL("");
                model.setPRECIO(Double.parseDouble(valor));
                model.setCANTIDAD(0);
                model.setID_CATEGORIA(0);

                data = null;
                tableModel.setRowCount(0);

                data = datos.obtenerDatos(model);

                for (Object[] fila : data) {
                    tableModel.addRow(fila);
                }

                //Agregando los datos a la tabla
                tblInventario.setModel(tableModel);
                break;
            case "Cantidad":
                //Atributos
                model.setPK_TBL_PMK_INVENTARIO(0);
                model.setCODIGO("");
                model.setNOMBRE("");
                model.setTIPO_ANIMAL("");
                model.setPRECIO(0.0);
                model.setCANTIDAD(Integer.parseInt(valor));
                model.setID_CATEGORIA(0);

                data = null;
                tableModel.setRowCount(0);

                data = datos.obtenerDatos(model);

                for (Object[] fila : data) {
                    tableModel.addRow(fila);
                }

                //Agregando los datos a la tabla
                tblInventario.setModel(tableModel);
                break;
            default:
                JOptionPane.showMessageDialog(null, "No es una opcion valida");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblInventario;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTipoAnimal;
    // End of variables declaration//GEN-END:variables

    private void limpiar() {
        Id = "";
        txtCodigo.setText("");
        txtNombre.setText("");
        txtTipoAnimal.setText("");
        txtPrecio.setText("");
        txtCantidad.setText("");
        txtCategoria.setText("");
    }
}
