package gui;

import businessObject.UsuariosBLL;
import dataAccess.UsuariosDto;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormAdministrador extends javax.swing.JFrame
{

    DefaultTableModel modelo = new DefaultTableModel();

    public FormAdministrador()
    {
        initComponents();
        disenoFormAdministrador();
    }

    private void disenoFormAdministrador()
    {
        this.setTitle("Login");
        this.setSize(1000, 600);
        this.setLocationRelativeTo(null);
        listarUsuarios();
        txtIdUsuario.setEditable(false);
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

        popUsuarios = new javax.swing.JPopupMenu();
        mnuEliminar = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        cboEstatus = new javax.swing.JComboBox<>();
        txtCorreo = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtContrasenia = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        txtConfContrasenia = new javax.swing.JPasswordField();
        btnRegistrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableUsuarios = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        cboRol = new javax.swing.JComboBox<>();
        btnModificar = new javax.swing.JButton();
        txtIdUsuario = new javax.swing.JTextField();
        txtBuscarUsuarios = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();

        mnuEliminar.setText("Eliminar");
        mnuEliminar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mnuEliminarActionPerformed(evt);
            }
        });
        popUsuarios.add(mnuEliminar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Nombre");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Estatus");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Confirmar : ");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Apellido");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Correo");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Telefono");

        cboEstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ACTIVO", "INACTIVO" }));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Contraseña");

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnRegistrarActionPerformed(evt);
            }
        });

        tableUsuarios.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "ID", "Nombre", "Apellido", "Estatus", "Correo", "Telefono", "Rol"
            }
        ));
        tableUsuarios.setComponentPopupMenu(popUsuarios);
        tableUsuarios.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                tableUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableUsuarios);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Rol");

        cboRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Recepcionista", "Mantenimiento", "Director" }));

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnModificarActionPerformed(evt);
            }
        });

        txtIdUsuario.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                txtIdUsuarioActionPerformed(evt);
            }
        });

        jLabel9.setText("Buscar:");

        jMenuBar1.setBackground(new java.awt.Color(0, 204, 204));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jMenuBar1.setPreferredSize(new java.awt.Dimension(90, 80));

        jMenu1.setText("Usuarios");
        jMenu1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jMenu1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenu1ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu4.setText("Roles");
        jMenu4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jMenu4MouseClicked(evt);
            }
        });
        jMenu4.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenu4ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        jMenu6.setText("Permisos");
        jMenu6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jMenu6.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jMenu6MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu6);

        jMenu7.setText("Cerrar Sesion");
        jMenu7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jMenu7.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jMenu7MouseClicked(evt);
            }
        });
        jMenu7.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenu7ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(58, 58, 58)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnModificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRegistrar))
                            .addComponent(txtApellido, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtContrasenia, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtConfContrasenia)
                            .addComponent(cboRol, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtIdUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBuscarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtConfContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBuscarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnModificar))
                .addGap(65, 65, 65))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenu4ActionPerformed
    {//GEN-HEADEREND:event_jMenu4ActionPerformed
        new FormRoles().setVisible(true);
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jMenu4MouseClicked
    {//GEN-HEADEREND:event_jMenu4MouseClicked
        new FormRoles().setVisible(true);
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMenu6MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jMenu6MouseClicked
    {//GEN-HEADEREND:event_jMenu6MouseClicked
        new FormPermisos().setVisible(true);
    }//GEN-LAST:event_jMenu6MouseClicked

    private void jMenu7ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenu7ActionPerformed
    {//GEN-HEADEREND:event_jMenu7ActionPerformed

    }//GEN-LAST:event_jMenu7ActionPerformed

    private void jMenu7MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jMenu7MouseClicked
    {//GEN-HEADEREND:event_jMenu7MouseClicked
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_jMenu7MouseClicked

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnRegistrarActionPerformed
    {//GEN-HEADEREND:event_btnRegistrarActionPerformed
        try
        {
            validarCamposInsertar();

        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Ocurrio un error \n Contacte al administrador");
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void tableUsuariosMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_tableUsuariosMouseClicked
    {//GEN-HEADEREND:event_tableUsuariosMouseClicked
        // TODO add your handling code here: nombre apellido estatus correo telefono rol contrasenia
        int fila = tableUsuarios.rowAtPoint(evt.getPoint());
        txtIdUsuario.setText(tableUsuarios.getValueAt(fila, 0).toString());
        txtNombre.setText(tableUsuarios.getValueAt(fila, 1).toString());
        txtApellido.setText(tableUsuarios.getValueAt(fila, 2).toString());
        cboEstatus.setSelectedItem(tableUsuarios.getValueAt(fila, 3).toString());
        txtCorreo.setText(tableUsuarios.getValueAt(fila, 4).toString());
        txtTelefono.setText(tableUsuarios.getValueAt(fila, 5).toString());
        cboRol.setSelectedItem(tableUsuarios.getValueAt(fila, 6).toString());
        
        //btnRegistrar.setEnabled(false);

    }//GEN-LAST:event_tableUsuariosMouseClicked

    private void txtIdUsuarioActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_txtIdUsuarioActionPerformed
    {//GEN-HEADEREND:event_txtIdUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdUsuarioActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnModificarActionPerformed
    {//GEN-HEADEREND:event_btnModificarActionPerformed
        try
        {
            validarCamposModificar();

        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Ocurrio un error \n Contacte al administrador");
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenu1ActionPerformed
    {//GEN-HEADEREND:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void mnuEliminarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_mnuEliminarActionPerformed
    {//GEN-HEADEREND:event_mnuEliminarActionPerformed
        try
        {
            eliminar();
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Ocurrio un error contacte al administrador");
        }
    }//GEN-LAST:event_mnuEliminarActionPerformed

    public void eliminar()
    {

        int idDel = Integer.parseInt(txtIdUsuario.getText());
        UsuariosBLL usuarioBLL = new UsuariosBLL();

        boolean b = usuarioBLL.eliminarUsuario(idDel);
        if (b)
        {
            limpiarTabla();
            listarUsuarios();
            JOptionPane.showMessageDialog(null, "Se eliminó el usuario");
        } else
        {
            JOptionPane.showMessageDialog(null, "Error al eliminar");
        }

    }

    public void validarCamposModificar()
    {
        if (txtNombre.getText().equals("") || txtApellido.getText().equals("") || txtCorreo.getText().equals("") || txtTelefono.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Campos vacios");
        } else
        {
            UsuariosBLL usuarioBLL = new UsuariosBLL();
            boolean x = usuarioBLL.modificarUsuario(Integer.parseInt(txtIdUsuario.getText()), txtNombre.getText(), txtApellido.getText(), cboEstatus.getSelectedIndex(), txtCorreo.getText(), Integer.parseInt(txtTelefono.getText()), String.valueOf(txtConfContrasenia.getPassword()), cboRol.getSelectedIndex() + 1);
            if (x == false)
            {
                JOptionPane.showMessageDialog(null, "Falló en Actualización");
            } else
            {
                limpiarTabla();
                listarUsuarios();
                JOptionPane.showMessageDialog(null, "Actualización exitosa");
            }

        }
    }

    public void validarCamposInsertar()
    {
        if (txtNombre.getText().equals("")
                || txtApellido.getText().equals("") || txtCorreo.getText().equals("") || txtTelefono.getText().equals("")
                || String.valueOf(txtContrasenia.getPassword()).equals("") || String.valueOf(txtConfContrasenia.getPassword()).equals(""))
        {
            JOptionPane.showMessageDialog(null, "Campos vacios");
        } else
        {
            if (!(String.valueOf(txtContrasenia.getPassword()).equals(String.valueOf(txtConfContrasenia.getPassword()))))
            {
                JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
            } else
            {
                UsuariosBLL usuarioBLL = new UsuariosBLL();
                boolean x = usuarioBLL.crearUsuario(txtNombre.getText(), txtApellido.getText(), cboEstatus.getSelectedIndex(), txtCorreo.getText(), Integer.parseInt(txtTelefono.getText()), String.valueOf(txtConfContrasenia.getPassword()), cboRol.getSelectedIndex() + 1);
                if (x == false)
                {
                    JOptionPane.showMessageDialog(null, "Error al registrar");
                } else
                {
                    limpiarTabla();
                    listarUsuarios();
                    JOptionPane.showMessageDialog(null, "Registro con exito");
                }

            }

        }
    }

    public void listarUsuarios()
    {
        try
        {
            UsuariosBLL usuarioBLL = new UsuariosBLL();
            ArrayList<UsuariosDto> lista = usuarioBLL.mostrarUsuarios();
            modelo = (DefaultTableModel) tableUsuarios.getModel();
            Object[] obj = new Object[7];

            for (int i = 0; i < lista.size(); i++)
            {
                obj[0] = lista.get(i).getIdUsuario();
                obj[1] = lista.get(i).getNombre();
                obj[2] = lista.get(i).getApellido();
                obj[3] = lista.get(i).getEstatus();
                obj[4] = lista.get(i).getCorreo();
                obj[5] = lista.get(i).getTelefono();
                obj[6] = lista.get(i).getIdRolFk();
                modelo.addRow(obj);
            }
            tableUsuarios.setModel(modelo);
        } catch (Exception e)
        {
        }

    }

    public void limpiarTabla()
    {
        for (int i = 0; i < modelo.getRowCount(); i++)
        {
            modelo.removeRow(i);
            i = i - 1;
        }
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cboEstatus;
    private javax.swing.JComboBox<String> cboRol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem mnuEliminar;
    private javax.swing.JPopupMenu popUsuarios;
    private javax.swing.JTable tableUsuarios;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtBuscarUsuarios;
    private javax.swing.JPasswordField txtConfContrasenia;
    private javax.swing.JPasswordField txtContrasenia;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtIdUsuario;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
