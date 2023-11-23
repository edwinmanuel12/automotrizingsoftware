package gui;

import businessObject.RolesBLL;
import dataAccess.RolesDto;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gardu
 */
public class FormRoles extends javax.swing.JFrame
{

    /**
     * Creates new form FormRoles
     */
    DefaultTableModel modelo = new DefaultTableModel();

    public FormRoles()
    {
        initComponents();
        disenoFormRoles();
    }

    private void disenoFormRoles()
    {
        this.setTitle("Roles");
        this.setSize(1000, 600);
        this.setLocationRelativeTo(null);
        listarRoles();
        txtIdRol.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        popEliminarRol = new javax.swing.JPopupMenu();
        mnuEliminar = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRoles = new javax.swing.JTable();
        cboEstatus = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextPane();
        btnModificar = new javax.swing.JButton();
        txtIdRol = new javax.swing.JTextField();
        btnEliminarRol = new javax.swing.JButton();

        mnuEliminar.setText("Eliminar");
        popEliminarRol.add(mnuEliminar);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Nombre");

        jLabel2.setText("Descripcion");

        jLabel3.setText("Estatus");

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnRegistrarActionPerformed(evt);
            }
        });

        tblRoles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "ID", "Nombre", "Descripcion", "Estatus"
            }
        ));
        tblRoles.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                tblRolesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblRoles);

        cboEstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "INACTIVO", "ACTIVO" }));

        jScrollPane2.setViewportView(txtDescripcion);

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminarRol.setText("Eliminar");
        btnEliminarRol.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnEliminarRolActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(53, 53, 53)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(btnModificar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRegistrar)))
                    .addComponent(txtIdRol, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarRol))
                .addGap(66, 66, 66))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(cboEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addComponent(txtIdRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminarRol))
                .addContainerGap(113, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnRegistrarActionPerformed
    {//GEN-HEADEREND:event_btnRegistrarActionPerformed
        try
        {
            registrarRol();
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Ocurrió un error \n Contacte al administrador");
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void tblRolesMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_tblRolesMouseClicked
    {//GEN-HEADEREND:event_tblRolesMouseClicked
        // TODO add your handling code here:
        int fila = tblRoles.rowAtPoint(evt.getPoint());
        txtIdRol.setText(tblRoles.getValueAt(fila, 0).toString());
        txtNombre.setText(tblRoles.getValueAt(fila, 1).toString());
        txtDescripcion.setText(tblRoles.getValueAt(fila, 2).toString());
        cboEstatus.setSelectedItem(tblRoles.getValueAt(fila, 3).toString());
        btnRegistrar.setEnabled(false);

    }//GEN-LAST:event_tblRolesMouseClicked

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnModificarActionPerformed
    {//GEN-HEADEREND:event_btnModificarActionPerformed
        // TODO add your handling code here:
        try
        {
            modificarRol();

        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Ocurrió un error \n Contacte al administrador");
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarRolActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnEliminarRolActionPerformed
    {//GEN-HEADEREND:event_btnEliminarRolActionPerformed
        try
        {
            eliminarRol();
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Ocurrió un error \n Contacte al administrador");
        }
    }//GEN-LAST:event_btnEliminarRolActionPerformed

    public void registrarRol()
    {
        if (txtNombre.getText().equals("") || txtDescripcion.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorioss");
        } else
        {
            RolesBLL rol = new RolesBLL();
            String nombre = txtNombre.getText();
            String descripcion = txtDescripcion.getText();
            int estatus = cboEstatus.getSelectedIndex();

            boolean x = rol.crearRol(nombre, descripcion, estatus);

            if (x)
            {
                limpiarTablaRoles();
                listarRoles();
                limpiarCampos();
                JOptionPane.showMessageDialog(null, "Rol registrado");
            } else
            {
                JOptionPane.showMessageDialog(null, "No se pudo registrar \n Verifique campos");
            }

        }

    }

    public void eliminarRol()
    {
        if (txtIdRol.equals("") || txtNombre.equals("") || txtDescripcion.equals(""))
        {
            JOptionPane.showMessageDialog(null, "¡Seleccione una fila!");
        } else
        {
            int idDel = Integer.parseInt(txtIdRol.getText());
            RolesBLL usuarioBLL = new RolesBLL();

            boolean b = usuarioBLL.eliminarRoles(idDel);
            if (b)
            {
                limpiarTablaRoles();
                listarRoles();
                limpiarCampos();
                JOptionPane.showMessageDialog(null, "Se eliminó el rol");
            } else
            {
                JOptionPane.showMessageDialog(null, "Error al eliminar");
            }
        }
    }

    public void modificarRol()
    {

        if (txtNombre.getText().equals("") || txtDescripcion.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "¡Seleccione una fila!");
        } else
        {
            RolesBLL rol = new RolesBLL();
            String nombre = txtNombre.getText();
            String descripcion = txtDescripcion.getText();
            int estatus = cboEstatus.getSelectedIndex();
            int id = Integer.parseInt(txtIdRol.getText());
            boolean x = rol.modificarRol(id, nombre, descripcion, estatus);

            if (x)
            {
                limpiarTablaRoles();
                listarRoles();
                limpiarCampos();
                btnRegistrar.setEnabled(true);
                JOptionPane.showMessageDialog(null, "Rol modificado");
            } else
            {
                JOptionPane.showMessageDialog(null, "No se pudo registrar \n Verifique campos");
            }

        }

    }

    public void listarRoles()
    {
        RolesBLL rolesBLL = new RolesBLL();
        ArrayList<RolesDto> lista = rolesBLL.mostrarRoles();
        modelo = (DefaultTableModel) tblRoles.getModel();
        Object[] obj = new Object[4];

        for (int i = 0; i < lista.size(); i++)
        {
            obj[0] = lista.get(i).getIdRol();
            obj[1] = lista.get(i).getNombre();
            obj[2] = lista.get(i).getDescripcion();
            obj[3] = lista.get(i).getEstatus();

            modelo.addRow(obj);
        }
        tblRoles.setModel(modelo);
    }

    public void limpiarTablaRoles()
    {
        for (int i = 0; i < modelo.getRowCount(); i++)
        {
            modelo.removeRow(i);
            i = i - 1;
        }
    }

    public void limpiarCampos()
    {
        txtDescripcion.setText("");
        txtNombre.setText("");
        txtIdRol.setText("");
        cboEstatus.setSelectedIndex(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminarRol;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cboEstatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem mnuEliminar;
    private javax.swing.JPopupMenu popEliminarRol;
    private javax.swing.JTable tblRoles;
    private javax.swing.JTextPane txtDescripcion;
    private javax.swing.JTextField txtIdRol;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}