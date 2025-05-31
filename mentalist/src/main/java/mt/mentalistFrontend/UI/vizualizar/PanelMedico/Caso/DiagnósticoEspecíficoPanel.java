package mt.mentalistFrontend.UI.vizualizar.PanelMedico.Caso;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;

public class DiagnósticoEspecíficoPanel extends javax.swing.JPanel {

    public DiagnósticoEspecíficoPanel() {
        initComponents();
        initStyles();
    }

    private void initStyles() {
        Titulo.putClientProperty("FlatLaf.style", "font: 18 bold $h2.font");
        Titulo.setForeground(new Color(55, 71, 79));
        TituloCie.putClientProperty("FlatLaf.style", "font: 14 bold $h2.font");
        TituloCie.setForeground(new Color(55, 71, 79));
        TituloDa.putClientProperty("FlatLaf.style", "font: 14 bold $h2.font");
        TituloDa.setForeground(new Color(55, 71, 79));
        TituloDiagnostico.putClientProperty("FlatLaf.style", "font: 14 bold $h2.font");
        TituloDiagnostico.setForeground(new Color(55, 71, 79));
        TituloFD.putClientProperty("FlatLaf.style", "font: 14 bold $h2.font");
        TituloFD.setForeground(new Color(55, 71, 79));

        SetCodigo.putClientProperty("FlatLaf.style", "font: 11 $h4.font");
        SetCodigo.setForeground(Color.BLACK);
        SetDiagnostico.putClientProperty("FlatLaf.style", "font: 11 $h4.font");
        SetDiagnostico.setForeground(Color.BLACK);
        SetFechaDia.putClientProperty("FlatLaf.style", "font: 11 $h4.font");
        SetFechaDia.setForeground(Color.BLACK);

        GuardarBTN.putClientProperty("FlatLaf.style", "font: 13 $h4.font");
        GuardarBTN.setForeground(Color.white);
        LimpiarBTN.putClientProperty("FlatLaf.style", "font: 13 $h4.font");
        LimpiarBTN.setForeground(Color.white);
    }

    private void ShowJPanel(JPanel p) {
        p.setSize(750, 400);
        p.setLocation(0, 0);

        Bg.removeAll();
        Bg.setLayout(new BorderLayout());
        Bg.add(p, BorderLayout.CENTER);
        Bg.revalidate();
        Bg.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bg = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel6 = new javax.swing.JPanel();
        SetCodigo = new javax.swing.JTextField();
        TituloDiagnostico = new javax.swing.JLabel();
        TtiuloTD = new javax.swing.JLabel();
        OpcionesDiagnostico = new javax.swing.JComboBox<>();
        TituloCie = new javax.swing.JLabel();
        TituloFD = new javax.swing.JLabel();
        SetFechaDia = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        SetDiagnostico = new javax.swing.JTextArea();
        TituloDa = new javax.swing.JLabel();
        GuardarBTN = new javax.swing.JButton();
        LimpiarBTN = new javax.swing.JButton();

        Bg.setBackground(new java.awt.Color(245, 245, 240));

        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Contexto del Caso");

        jSeparator2.setBackground(new java.awt.Color(27, 203, 209));
        jSeparator2.setForeground(new java.awt.Color(27, 203, 209));

        jPanel6.setBackground(new java.awt.Color(245, 245, 240));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        SetCodigo.setBackground(new java.awt.Color(188, 234, 255));
        SetCodigo.setBorder(null);

        TituloDiagnostico.setText("5. Diagnostico Especifico");

        TtiuloTD.setText("Tipo de Diagnostico");

        OpcionesDiagnostico.setBackground(new java.awt.Color(188, 234, 255));
        OpcionesDiagnostico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Violencia de Genero", "Trastorno Mental", "Intento de Suicidio", "Consumo de Sustancias" }));

        TituloCie.setText("Codigo Cie-11");

        TituloFD.setText("Fecha del diagnostico");

        SetFechaDia.setBackground(new java.awt.Color(188, 234, 255));
        SetFechaDia.setBorder(null);

        jScrollPane2.setBorder(null);

        SetDiagnostico.setBackground(new java.awt.Color(188, 234, 255));
        SetDiagnostico.setColumns(500);
        SetDiagnostico.setLineWrap(true);
        SetDiagnostico.setRows(5);
        SetDiagnostico.setBorder(null);
        jScrollPane2.setViewportView(SetDiagnostico);

        TituloDa.setText("Observaciones Medicas");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TituloDiagnostico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TituloFD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TituloCie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(SetCodigo)
                                        .addGap(3, 3, 3))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(SetFechaDia)
                                        .addGap(5, 5, 5))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(OpcionesDiagnostico, 0, 242, Short.MAX_VALUE)
                                        .addGap(3, 3, 3)))
                                .addGap(18, 18, 18))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(TtiuloTD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(57, 57, 57)))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(TituloDa, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                                .addGap(167, 167, 167))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGap(14, 14, 14)))))
                .addGap(0, 0, 0))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TituloDiagnostico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TtiuloTD)
                    .addComponent(TituloDa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(OpcionesDiagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TituloCie)
                        .addGap(18, 18, 18)
                        .addComponent(SetCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TituloFD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SetFechaDia, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addGap(32, 32, 32))
        );

        GuardarBTN.setBackground(new java.awt.Color(40, 167, 69));
        GuardarBTN.setText("Guardar");
        GuardarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarBTNActionPerformed(evt);
            }
        });

        LimpiarBTN.setBackground(new java.awt.Color(255, 193, 7));
        LimpiarBTN.setText("Limpiar");

        javax.swing.GroupLayout BgLayout = new javax.swing.GroupLayout(Bg);
        Bg.setLayout(BgLayout);
        BgLayout.setHorizontalGroup(
            BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BgLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BgLayout.createSequentialGroup()
                        .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(BgLayout.createSequentialGroup()
                                .addComponent(LimpiarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(GuardarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(1, 1, 1)))
                .addGap(20, 20, 20))
        );
        BgLayout.setVerticalGroup(
            BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BgLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Titulo)
                .addGap(14, 14, 14)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LimpiarBTN)
                    .addComponent(GuardarBTN))
                .addGap(10, 10, 10))
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

    private void GuardarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarBTNActionPerformed
        ShowJPanel(new DatosAdministrativos());

    }//GEN-LAST:event_GuardarBTNActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Bg;
    private javax.swing.JButton GuardarBTN;
    private javax.swing.JButton LimpiarBTN;
    private javax.swing.JComboBox<String> OpcionesDiagnostico;
    private javax.swing.JTextField SetCodigo;
    private javax.swing.JTextArea SetDiagnostico;
    private javax.swing.JTextField SetFechaDia;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel TituloCie;
    private javax.swing.JLabel TituloDa;
    private javax.swing.JLabel TituloDiagnostico;
    private javax.swing.JLabel TituloFD;
    private javax.swing.JLabel TtiuloTD;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
