package mt.mentalistFrontend.UI.Paneles.PanelAdministrador;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import mt.mentalistFrontend.UI.Paneles.PanelAdministrador.Reporte.InformacionReportePanel;
import mt.mentalistFrontend.UI.Paneles.General.ReportePanel;

public class ReportesPanel extends javax.swing.JPanel {

    private DefaultTableModel modelo;

    public ReportesPanel() {
        initComponents();
        initStyles();
        cargarReportes();
    }

    private void initStyles() {
        Titulo.putClientProperty("FlatLaf.style", "font: 25 $h4.font");
        Titulo.setForeground(new Color(55, 71, 79));
        TablaReportes.putClientProperty("FlatLaf.style", "font: 14 $h4.regular.font");
        TablaReportes.setForeground(Color.BLACK);
        CrearBTN.putClientProperty("FlatLaf.style", "font: 12 $h4.regular.font");
        CrearBTN.setForeground(Color.white);
        BuscarBTN.putClientProperty("FlatLaf.style", "font: 12 $h4.regular.font");
        BuscarBTN.setForeground(Color.white);
    }

    private void ShowJPanel(JPanel p) {
        p.setSize(750, 400);
        p.setLocation(0, 0);

        Bg.removeAll();
        Bg.setLayout(new BorderLayout());
        Bg.add(p, BorderLayout.CENTER);
        Bg.revalidate();
        Bg.repaint();
    };
        
    private void cargarReportes() {
//        if (reporteServicio == null) {
//            System.err.println("No se ha inicializado el servicio");
//            return;
//        }
//        modelo = (DefaultTableModel) TablaReportes.getModel();
//        modelo.setRowCount(0);
//
//        var reportes = this.reporteServicio.listarReportes();
//
//        if (reportes == null || reportes.isEmpty()) {
//            System.err.println("No se encontraron casos en la base de datos");
//            return;
//        }
//
//        reportes.forEach(reporte -> {
//            Object[] renglonReporte = {
//                reporte.getIdReporte(),
//                reporte.getUsuario().getIdUsuario(),
//                reporte.getTipoReporte(),
//                reporte.getFecha()
//            };
//            modelo.addRow(renglonReporte);
//        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bg = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        CrearBTN = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        BuscarBTN = new javax.swing.JButton();
        ActualizarBTN = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaReportes = new javax.swing.JTable();

        Bg.setBackground(new java.awt.Color(245, 245, 240));

        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Gestion de reportes");

        CrearBTN.setBackground(new java.awt.Color(17, 129, 133));
        CrearBTN.setText("Crear");
        CrearBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearBTNActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(27, 203, 209));
        jSeparator1.setForeground(new java.awt.Color(27, 203, 209));

        BuscarBTN.setBackground(new java.awt.Color(17, 129, 133));
        BuscarBTN.setText("Buscar");
        BuscarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarBTNActionPerformed(evt);
            }
        });

        ActualizarBTN.setBackground(new java.awt.Color(17, 129, 133));
        ActualizarBTN.setText("Actualizar");
        ActualizarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarBTNActionPerformed(evt);
            }
        });

        TablaReportes.setBackground(new java.awt.Color(188, 234, 255));
        TablaReportes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID reporte", "ID usuario", "Tipo de reporte", "Fecha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaReportes);

        jScrollPane2.setViewportView(jScrollPane1);

        javax.swing.GroupLayout BgLayout = new javax.swing.GroupLayout(Bg);
        Bg.setLayout(BgLayout);
        BgLayout.setHorizontalGroup(
            BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BgLayout.createSequentialGroup()
                .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BgLayout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BgLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BgLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BgLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BuscarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CrearBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(BgLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ActualizarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        BgLayout.setVerticalGroup(
            BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BgLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(Titulo)
                .addGap(12, 12, 12)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BgLayout.createSequentialGroup()
                        .addComponent(BuscarBTN)
                        .addGap(6, 6, 6)
                        .addComponent(CrearBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ActualizarBTN))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarBTNActionPerformed
        ShowJPanel(new InformacionReportePanel());
    }//GEN-LAST:event_BuscarBTNActionPerformed

    private void CrearBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearBTNActionPerformed
        ShowJPanel(new ReportePanel());
    }//GEN-LAST:event_CrearBTNActionPerformed

    private void ActualizarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarBTNActionPerformed
        cargarReportes();
    }//GEN-LAST:event_ActualizarBTNActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ActualizarBTN;
    private javax.swing.JPanel Bg;
    private javax.swing.JButton BuscarBTN;
    private javax.swing.JButton CrearBTN;
    private javax.swing.JTable TablaReportes;
    private javax.swing.JLabel Titulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
