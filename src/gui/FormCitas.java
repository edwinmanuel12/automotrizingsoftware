/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import businessObject.CitasBLL;
import dataAccess.CitasDto;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gardu
 */
public class FormCitas extends javax.swing.JFrame
{

    DefaultTableModel modelo = new DefaultTableModel();

    /**
     * Creates new form FormCitas
     */
    public FormCitas()
    {
        initComponents();
        disenoCitas();
    }

    public void disenoCitas()
    {
        listarCitas();
        txtIdCita.setEditable(false);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtEntrada = new javax.swing.JTextField();
        txtSalida = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        cboEstatus = new javax.swing.JComboBox<>();
        txtIdVehiculo = new javax.swing.JTextField();
        txtIdCita = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCitas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Fecha Entrada: ");

        jLabel2.setText("Fecha Salida: ");

        jLabel3.setText("Descripcion:");

        jLabel4.setText("Estatus:");

        jLabel5.setText("Id Vehiculo");

        cboEstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "INACTIVO", "ACTIVO" }));

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnModificarActionPerformed(evt);
            }
        });

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnEliminarActionPerformed(evt);
            }
        });

        tablaCitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "ID CITA", "Entrada", "Salida", "Descripcion", "Estatus", "Vehiculo"
            }
        ));
        tablaCitas.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                tablaCitasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaCitas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnModificar)
                        .addGap(74, 74, 74)
                        .addComponent(btnRegistrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDescripcion)
                                    .addComponent(txtEntrada)))
                            .addComponent(txtSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdCita, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(88, 88, 88)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cboEstatus, 0, 94, Short.MAX_VALUE)
                                    .addComponent(txtIdVehiculo))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(96, 96, 96))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cboEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtIdVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(txtIdCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificar)
                    .addComponent(btnRegistrar)
                    .addComponent(btnEliminar))
                .addContainerGap(121, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tablaCitasMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_tablaCitasMouseClicked
    {//GEN-HEADEREND:event_tablaCitasMouseClicked
        // TODO add your handling code here:

        int fila = tablaCitas.rowAtPoint(evt.getPoint());
        txtIdCita.setText(tablaCitas.getValueAt(fila, 0).toString());

        txtEntrada.setText(tablaCitas.getValueAt(fila, 1).toString());
        txtSalida.setText(tablaCitas.getValueAt(fila, 2).toString());
        txtDescripcion.setText(tablaCitas.getValueAt(fila, 3).toString());
        txtIdVehiculo.setText(tablaCitas.getValueAt(fila, 5).toString());

        btnRegistrar.setEnabled(false);
    }//GEN-LAST:event_tablaCitasMouseClicked

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnModificarActionPerformed
    {//GEN-HEADEREND:event_btnModificarActionPerformed
        try
        {
            modificar();
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Ocurrió un error\nContacte al administrador");
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnRegistrarActionPerformed
    {//GEN-HEADEREND:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        try
        {
            registrar();
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Ocurrió un error\nContacte al administrador");
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnEliminarActionPerformed
    {//GEN-HEADEREND:event_btnEliminarActionPerformed
        try
        {
            eliminar();
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Ocurrió un error\nContacte al administrador");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    public void registrar()
    {
        if (!validarCampos())
        {
            String entrada, salida, descripcion;
            int idVehiculo, estatus;
            entrada = txtEntrada.getText();
            salida = txtSalida.getText();
            descripcion = txtDescripcion.getText();
            estatus = cboEstatus.getSelectedIndex();
            idVehiculo = Integer.parseInt(txtIdVehiculo.getText());

            CitasBLL citas = new CitasBLL();
            boolean x = citas.crearCita(entrada, salida, descripcion, estatus, idVehiculo);
            if (x)
            {
                limpiarTablaCitas();
                listarCitas();
                limpiarCampos();
                JOptionPane.showMessageDialog(null, "Se registró con exito");
            } else
            {
                JOptionPane.showMessageDialog(null, "No se registro");
            }

        } else
        {
            JOptionPane.showMessageDialog(null, "Todos los Campos son Obligatorios");
        }

    }

    public void modificar()
    {
        if (!validarCampos())
        {
            String entrada, salida, descripcion;

            int idVehiculo, estatus, idCita;
            entrada = txtEntrada.getText();
            salida = txtSalida.getText();
            descripcion = txtDescripcion.getText();
            estatus = cboEstatus.getSelectedIndex();
            idVehiculo = Integer.parseInt(txtIdVehiculo.getText());
            idCita = Integer.parseInt(txtIdCita.getText());
            CitasBLL citas = new CitasBLL();
            boolean x = citas.modificarCita(idCita, entrada, salida, descripcion, estatus, idVehiculo);
            if (x)
            {
                limpiarTablaCitas();
                listarCitas();
                limpiarCampos();
                btnRegistrar.setEnabled(true);
                JOptionPane.showMessageDialog(null, "Se modifico con exito");
            } else
            {
                JOptionPane.showMessageDialog(null, "No se modifico");
            }

        } else
        {
            JOptionPane.showMessageDialog(null, "Seleccione una fila");
        }

    }

    public void eliminar()
    {
        if (!validarSeleccion())
        {
            int idCita = Integer.parseInt(txtIdCita.getText());
            CitasBLL citas = new CitasBLL();
            boolean x = citas.eliminarCita(idCita);
            if (x)
            {
                limpiarTablaCitas();
                listarCitas();
                limpiarCampos();
                btnRegistrar.setEnabled(true);
                JOptionPane.showMessageDialog(null, "Se elimino con exito");
            } else
            {
                JOptionPane.showMessageDialog(null, "No se elimino");
            }

        } else
        {
            JOptionPane.showMessageDialog(null, "Seleccione una fila");
        }

    }

    public void listarCitas()
    {
        try
        {
            CitasBLL cita = new CitasBLL();
            ArrayList<CitasDto> lista = cita.mostrarCitas();
            modelo = (DefaultTableModel) tablaCitas.getModel();
            Object[] obj = new Object[6];

            for (int i = 0; i < lista.size(); i++)
            {
                obj[0] = lista.get(i).getIdCita();
                obj[1] = lista.get(i).getFechaEntrada();
                obj[2] = lista.get(i).getFechaSalida();
                obj[3] = lista.get(i).getDescripcion();
                obj[4] = lista.get(i).getEstatus();
                obj[5] = lista.get(i).getIdVehiculo();
                modelo.addRow(obj);
            }
            tablaCitas.setModel(modelo);
        } catch (Exception e)
        {
        }

    }

    public void limpiarTablaCitas()
    {
        for (int i = 0; i < modelo.getRowCount(); i++)
        {
            modelo.removeRow(i);
            i = i - 1;
        }
    }

    public boolean validarCampos()
    {
        return txtEntrada.getText().equals("")
                || txtSalida.getText().equals("")
                || txtDescripcion.getText().equals("")
                || txtIdVehiculo.getText().equals("");

    }

    public boolean validarSeleccion()
    {
        return txtIdCita.getText().equals("");
    }

    public void limpiarCampos()
    {
        txtEntrada.setText("");
        txtSalida.setText("");
        txtDescripcion.setText("");
        txtIdVehiculo.setText("");
        txtIdCita.setText("");
    }

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cboEstatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaCitas;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtEntrada;
    private javax.swing.JTextField txtIdCita;
    private javax.swing.JTextField txtIdVehiculo;
    private javax.swing.JTextField txtSalida;
    // End of variables declaration//GEN-END:variables
}
