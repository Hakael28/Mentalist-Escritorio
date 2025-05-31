package mt.mentalistFrontend.UI.vizualizar.PanelMedico.Caso;

import java.awt.Color;
import javax.swing.table.DefaultTableModel;
public class ListarCasos extends javax.swing.JPanel {

    private DefaultTableModel modelo;

    public ListarCasos() {
        initComponents();
        initStyles();
        cargarCasos();
    }

    private void initStyles() {
        Titulo.putClientProperty("FlatLaf.style", "font: 18 $h4.font");
        Titulo.setForeground(new Color(55, 71, 79));
        TablaCasos.putClientProperty("FlatLaf.style", "font: 10 $h4.regular.font");
        TablaCasos.setForeground(Color.BLACK);
        ActualizarBTN.putClientProperty("FlatLaf.style", "font: 14 $h4.font");
        ActualizarBTN.setForeground(Color.white);
    }

    private void cargarCasos() {
//        if (casoServicio == null) {
//            System.err.println("No se ha inicializado el servicio");
//            return;
//        }
//        modelo = (DefaultTableModel) TablaCasos.getModel();
//        modelo.setRowCount(0);
//
//        var casos = this.casoServicio.listarCaso();
//
//        if (casos == null || casos.isEmpty()) {
//            System.err.println("No se encontraron casos en la base de datos");
//            return;
//        }
//
//        casos.forEach(caso -> {
//            Object[] renglonCaso = {
//                caso.getIdCaso(),
//                caso.getPaciente().getIdPaciente(),
//                caso.getDiagnostico().getTipodiagnostico(),
//                caso.getFechaIngreso(),
//                caso.getFechaRevisionHistoria()
//            };
//            modelo.addRow(renglonCaso);
//        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        ActualizarBTN = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaCasos = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(245, 245, 240));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Casos");
        jPanel1.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 30, 694, -1));

        ActualizarBTN.setBackground(new java.awt.Color(17, 129, 133));
        ActualizarBTN.setText("Actualizar");
        ActualizarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarBTNActionPerformed(evt);
            }
        });
        jPanel1.add(ActualizarBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 360, 88, -1));

        jSeparator1.setBackground(new java.awt.Color(27, 203, 209));
        jSeparator1.setForeground(new java.awt.Color(27, 203, 209));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 58, 690, 10));

        TablaCasos.setBackground(new java.awt.Color(188, 234, 255));
        TablaCasos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Caso", "ID Paciente", "Diagnostico", "Fecha Ingreso", "Fecha Consulta"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaCasos);

        jScrollPane2.setViewportView(jScrollPane1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 690, 260));

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

    private void ActualizarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarBTNActionPerformed
        cargarCasos();
    }//GEN-LAST:event_ActualizarBTNActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ActualizarBTN;
    private javax.swing.JTable TablaCasos;
    private javax.swing.JLabel Titulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

}
