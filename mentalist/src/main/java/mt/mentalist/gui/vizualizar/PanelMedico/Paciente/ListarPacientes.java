package mt.mentalist.gui.vizualizar.PanelMedico.Paciente;

import java.awt.Color;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jisaw
 */
public class ListarPacientes extends javax.swing.JPanel {

    private DefaultTableModel modelo;

    public ListarPacientes() {
        initComponents();
        initStyles();
        cargarPacientes();
    }

    private void initStyles() {
        Titulo.putClientProperty("FlatLaf.style", "font: 18 $h4.font");
        Titulo.setForeground(new Color(55, 71, 79));
        TablaPacientes.putClientProperty("FlatLaf.style", "font: 10 $h4.regular.font");
        TablaPacientes.setForeground(Color.BLACK);
        ActualizarBTN.putClientProperty("FlatLaf.style", "font: 14 $h4.font");
        ActualizarBTN.setForeground(Color.white);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaPacientes = new javax.swing.JTable();
        ActualizarBTN = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        jPanel1.setBackground(new java.awt.Color(245, 245, 240));

        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Pacientes");

        TablaPacientes.setBackground(new java.awt.Color(188, 234, 255));
        TablaPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Paciente", "Tjpo de documento", "Nombre", "Fecha nacimiento", "Genero", "Telefono", "Direccion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaPacientes);
        if (TablaPacientes.getColumnModel().getColumnCount() > 0) {
            TablaPacientes.getColumnModel().getColumn(0).setResizable(false);
            TablaPacientes.getColumnModel().getColumn(1).setResizable(false);
            TablaPacientes.getColumnModel().getColumn(2).setResizable(false);
            TablaPacientes.getColumnModel().getColumn(3).setResizable(false);
            TablaPacientes.getColumnModel().getColumn(4).setResizable(false);
            TablaPacientes.getColumnModel().getColumn(5).setResizable(false);
            TablaPacientes.getColumnModel().getColumn(6).setResizable(false);
        }

        ActualizarBTN.setBackground(new java.awt.Color(17, 129, 133));
        ActualizarBTN.setText("Actualizar");
        ActualizarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarBTNActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(27, 203, 209));
        jSeparator1.setForeground(new java.awt.Color(27, 203, 209));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ActualizarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)
                            .addComponent(jSeparator1)
                            .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ActualizarBTN)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cargarPacientes() {
//        if (pacienteServicio == null) {
//            System.err.print("No se ha inicializado el servicio");
//            return;
//        }
//        modelo = (DefaultTableModel) TablaPacientes.getModel();
//        modelo.setRowCount(0);
//
//        var pacientes = pacienteServicio.listarPacientes();
//
//        if (pacientes == null || pacientes.isEmpty()) {
//            System.out.println("No se encontraron pacientes en la base de datos.");
//            return;
//        }
//        pacientes.forEach(paciente -> {
//            Object[] renglonPaciente = {
//                paciente.getIdPaciente(),
//                paciente.getTipoDocumento(),
//                paciente.getNombreCompleto(),
//                paciente.getFechaNacimiento(),
//                paciente.getGenero(),
//                paciente.getTelefono(),
//                paciente.getDireccion()
//
//            };
//            modelo.addRow(renglonPaciente);
//        });
    }

    private void ActualizarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarBTNActionPerformed
//        cargarPacientes();
    }//GEN-LAST:event_ActualizarBTNActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ActualizarBTN;
    private javax.swing.JTable TablaPacientes;
    private javax.swing.JLabel Titulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
