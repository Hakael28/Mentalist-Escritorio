
package mt.mentalist.gui.vizualizar.PanelMedico.Caso;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;

public class DatosAdministrativos extends javax.swing.JPanel {

public DatosAdministrativos() {
        initComponents();
        initStyles();
    }
    private void initStyles() {
        TituloDA.putClientProperty("FlatLaf.style", "font: 18 bold $h2.font");
        TituloDA.setForeground(new Color(55, 71, 79));
        TituloEAPB .putClientProperty("FlatLaf.style", "font: 14 bold $h2.font");
        TituloEAPB.setForeground(new Color(55, 71, 79));
        TituloNM.putClientProperty("FlatLaf.style", "font: 14 bold $h2.font");
        TituloNM.setForeground(new Color(55, 71, 79));
        TituloDU.putClientProperty("FlatLaf.style", "font: 14 bold $h2.font");
        TituloDU.setForeground(new Color(55, 71, 79));
   
       
        SetNombre.putClientProperty("FlatLaf.style", "font: 11 $h4.font");
        SetNombre.setForeground(Color.BLACK);
        SetEAPB.putClientProperty("FlatLaf.style", "font: 11 $h4.font");
        SetEAPB.setForeground(Color.BLACK);
  
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
        TituloDA = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel6 = new javax.swing.JPanel();
        SetNombre = new javax.swing.JTextField();
        TituloDU = new javax.swing.JLabel();
        TituloNM = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        SetEAPB = new javax.swing.JTextField();
        TituloEAPB = new javax.swing.JLabel();
        LimpiarBTN = new javax.swing.JButton();
        GuardarBTN = new javax.swing.JButton();

        Bg.setBackground(new java.awt.Color(245, 245, 240));

        TituloDA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TituloDA.setText("Datos Administrativos");

        jSeparator2.setBackground(new java.awt.Color(27, 203, 209));
        jSeparator2.setForeground(new java.awt.Color(27, 203, 209));

        jPanel6.setBackground(new java.awt.Color(245, 245, 240));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        SetNombre.setBackground(new java.awt.Color(188, 234, 255));
        SetNombre.setBorder(null);

        TituloDU.setText("7. Datos del Usuario");

        TituloNM.setText("Nombre del Medico");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TituloDU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SetNombre)
                            .addComponent(TituloNM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(28, 28, 28)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TituloDU)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(TituloNM)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SetNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jPanel7.setBackground(new java.awt.Color(245, 245, 240));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        SetEAPB.setBackground(new java.awt.Color(188, 234, 255));
        SetEAPB.setBorder(null);

        TituloEAPB.setText("6. Entidad Administradora de Planes de Beneficios (EAPB)");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TituloEAPB, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(SetEAPB)
                        .addGap(28, 28, 28)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TituloEAPB)
                .addGap(18, 18, 18)
                .addComponent(SetEAPB, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        LimpiarBTN.setBackground(new java.awt.Color(255, 193, 7));
        LimpiarBTN.setText("Limpiar");

        GuardarBTN.setBackground(new java.awt.Color(40, 167, 69));
        GuardarBTN.setText("Guardar");
        GuardarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BgLayout = new javax.swing.GroupLayout(Bg);
        Bg.setLayout(BgLayout);
        BgLayout.setHorizontalGroup(
            BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BgLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(TituloDA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4))
            .addGroup(BgLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jSeparator2)
                .addGap(20, 20, 20))
            .addGroup(BgLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(LimpiarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(400, 400, 400)
                .addComponent(GuardarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(BgLayout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(158, 158, 158))
        );
        BgLayout.setVerticalGroup(
            BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BgLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(TituloDA)
                .addGap(14, 14, 14)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(26, 26, 26)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(26, 26, 26)
                .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LimpiarBTN)
                    .addComponent(GuardarBTN))
                .addGap(20, 20, 20))
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
        ShowJPanel(new RegistroCaso());

    }//GEN-LAST:event_GuardarBTNActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Bg;
    private javax.swing.JButton GuardarBTN;
    private javax.swing.JButton LimpiarBTN;
    private javax.swing.JTextField SetEAPB;
    private javax.swing.JTextField SetNombre;
    private javax.swing.JLabel TituloDA;
    private javax.swing.JLabel TituloDU;
    private javax.swing.JLabel TituloEAPB;
    private javax.swing.JLabel TituloNM;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
