package mt.mentalistFrontend.UI.Paneles.PanelMedico.Caso;

import mt.mentalistFrontend.UI.Paneles.PanelMedico.Basicas.CasoPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;

public class RegistroCaso extends javax.swing.JPanel {

    public RegistroCaso() {
        initComponents();
        initStyles();
    }

    private void initStyles() {
        TituloRC.putClientProperty("FlatLaf.style", "font: 18 bold $h2.font");
        TituloRC.setForeground(new Color(55, 71, 79));
        TituloDE.putClientProperty("FlatLaf.style", "font: 14 bold $h2.font");
        TituloDE.setForeground(new Color(55, 71, 79));
        TituloFC.putClientProperty("FlatLaf.style", "font: 14 bold $h2.font");
        TituloFC.setForeground(new Color(55, 71, 79));
        TituloFI.putClientProperty("FlatLaf.style", "font: 14 bold $h2.font");
        TituloFI.setForeground(new Color(55, 71, 79));
        TituloFN.putClientProperty("FlatLaf.style", "font: 14 bold $h2.font");
        TituloFN.setForeground(new Color(55, 71, 79));
        TituloIA.putClientProperty("FlatLaf.style", "font: 14 bold $h2.font");
        TituloIA.setForeground(new Color(55, 71, 79));
        TituloRH.putClientProperty("FlatLaf.style", "font: 14 bold $h2.font");
        TituloRH.setForeground(new Color(55, 71, 79));
        TituloRRMS.putClientProperty("FlatLaf.style", "font: 14 bold $h2.font");
        TituloRRMS.setForeground(new Color(55, 71, 79));
        TituloSE.putClientProperty("FlatLaf.style", "font: 14 bold $h2.font");
        TituloSE.setForeground(new Color(55, 71, 79));

        SetFI.putClientProperty("FlatLaf.style", "font: 11 $h4.font");
        SetFI.setForeground(Color.BLACK);
        SetFN.putClientProperty("FlatLaf.style", "font: 11 $h4.font");
        SetFN.setForeground(Color.BLACK);
        SetFRH.putClientProperty("FlatLaf.style", "font: 11 $h4.font");
        SetFRH.setForeground(Color.BLACK);
        SetRRMS.putClientProperty("FlatLaf.style", "font: 11 $h4.font");
        SetRRMS.setForeground(Color.BLACK);
        SetSE.putClientProperty("FlatLaf.style", "font: 11 $h4.font");
        SetSE.setForeground(Color.BLACK);
        
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
        TituloRC = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel6 = new javax.swing.JPanel();
        SetSE = new javax.swing.JTextField();
        TituloDE = new javax.swing.JLabel();
        TituloSE = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        SetFN = new javax.swing.JTextField();
        TituloFC = new javax.swing.JLabel();
        SetFRH = new javax.swing.JTextField();
        SetFI = new javax.swing.JTextField();
        TituloFN = new javax.swing.JLabel();
        TituloFI = new javax.swing.JLabel();
        TituloRH = new javax.swing.JLabel();
        LimpiarBTN = new javax.swing.JButton();
        GuardarBTN = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        SetRRMS = new javax.swing.JTextField();
        TituloIA = new javax.swing.JLabel();
        TituloRRMS = new javax.swing.JLabel();

        Bg.setBackground(new java.awt.Color(245, 245, 240));
        Bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TituloRC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TituloRC.setText("Registro del Caso");
        Bg.add(TituloRC, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 30, 690, -1));

        jSeparator2.setBackground(new java.awt.Color(27, 203, 209));
        jSeparator2.setForeground(new java.awt.Color(27, 203, 209));
        Bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 690, 10));

        jPanel6.setBackground(new java.awt.Color(245, 245, 240));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        SetSE.setBackground(new java.awt.Color(188, 234, 255));
        SetSE.setBorder(null);

        TituloDE.setText("9.Datos Epidemiológicos");

        TituloSE.setText("Semana Epidemiologica");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TituloDE, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SetSE)
                            .addComponent(TituloSE, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TituloDE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(TituloSE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SetSE, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        Bg.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 340, 100));

        jPanel7.setBackground(new java.awt.Color(245, 245, 240));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        SetFN.setBackground(new java.awt.Color(188, 234, 255));
        SetFN.setBorder(null);

        TituloFC.setText("8. Fechas Clave");

        SetFRH.setBackground(new java.awt.Color(188, 234, 255));
        SetFRH.setBorder(null);

        SetFI.setBackground(new java.awt.Color(188, 234, 255));
        SetFI.setBorder(null);

        TituloFN.setText("Fecha Notificacion");

        TituloFI.setText("Fecha Ingreso");

        TituloRH.setText("Fecha Revision Historia");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TituloFC, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SetFN, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                            .addComponent(SetFI, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                            .addComponent(SetFRH, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                            .addComponent(TituloFN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TituloFI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TituloRH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TituloFC)
                .addGap(8, 8, 8)
                .addComponent(TituloFN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SetFN, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(TituloFI)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SetFI, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(TituloRH)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SetFRH, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        Bg.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 340, 230));

        LimpiarBTN.setBackground(new java.awt.Color(255, 193, 7));
        LimpiarBTN.setText("Limpiar");
        Bg.add(LimpiarBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 120, -1));

        GuardarBTN.setBackground(new java.awt.Color(40, 167, 69));
        GuardarBTN.setText("Guardar");
        GuardarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarBTNActionPerformed(evt);
            }
        });
        Bg.add(GuardarBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 330, 130, -1));

        jPanel8.setBackground(new java.awt.Color(245, 245, 240));
        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        SetRRMS.setBackground(new java.awt.Color(188, 234, 255));
        SetRRMS.setBorder(null);

        TituloIA.setText("10.  Información Adicional");

        TituloRRMS.setText("Remisión Ruta Mantenimiento de la Salud");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TituloIA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TituloRRMS, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SetRRMS, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 28, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TituloIA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TituloRRMS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SetRRMS, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        Bg.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 340, 120));

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
        ShowJPanel(new CasoPanel());

    }//GEN-LAST:event_GuardarBTNActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Bg;
    private javax.swing.JButton GuardarBTN;
    private javax.swing.JButton LimpiarBTN;
    private javax.swing.JTextField SetFI;
    private javax.swing.JTextField SetFN;
    private javax.swing.JTextField SetFRH;
    private javax.swing.JTextField SetRRMS;
    private javax.swing.JTextField SetSE;
    private javax.swing.JLabel TituloDE;
    private javax.swing.JLabel TituloFC;
    private javax.swing.JLabel TituloFI;
    private javax.swing.JLabel TituloFN;
    private javax.swing.JLabel TituloIA;
    private javax.swing.JLabel TituloRC;
    private javax.swing.JLabel TituloRH;
    private javax.swing.JLabel TituloRRMS;
    private javax.swing.JLabel TituloSE;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
