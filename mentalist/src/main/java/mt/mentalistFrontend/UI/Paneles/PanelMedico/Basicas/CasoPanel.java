/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package mt.mentalistFrontend.UI.Paneles.PanelMedico.Basicas;

import mt.mentalistFrontend.UI.Paneles.PanelMedico.Caso.BuscarCasoPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import mt.mentalistFrontend.UI.Paneles.PanelMedico.Caso.InfoPaciente;
import mt.mentalistFrontend.UI.Paneles.PanelMedico.Caso.ListarCasos;

public class CasoPanel extends javax.swing.JPanel {

     
    public CasoPanel() {
        initComponents();
        initStyles();
    }

    private void initStyles() {
        RegistrarBTN.putClientProperty("FlatLaf.style", "font: 13 $h4.font");
        RegistrarBTN.setForeground(Color.white);
        
        BuscarBTN.putClientProperty("FlatLaf.style", "font: 13 $h4.font");
        BuscarBTN.setForeground(Color.white);
        
        ListarBTN.putClientProperty("FlatLaf.style", "font: 13 $h4.font");
        ListarBTN.setForeground(Color.white);
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

        jProgressBar1 = new javax.swing.JProgressBar();
        jTextField1 = new javax.swing.JTextField();
        jMenuItem1 = new javax.swing.JMenuItem();
        Bg = new javax.swing.JPanel();
        RegistrarBTN = new javax.swing.JButton();
        BuscarBTN = new javax.swing.JButton();
        ListarBTN = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        TItulo = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        jMenuItem1.setText("jMenuItem1");

        setPreferredSize(new java.awt.Dimension(750, 400));

        Bg.setBackground(new java.awt.Color(245, 245, 240));

        RegistrarBTN.setBackground(new java.awt.Color(17, 129, 133));
        RegistrarBTN.setText("Registar Caso");
        RegistrarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarBTNActionPerformed(evt);
            }
        });

        BuscarBTN.setBackground(new java.awt.Color(17, 129, 133));
        BuscarBTN.setText("Buscar Caso");
        BuscarBTN.setPreferredSize(new java.awt.Dimension(10, 24));
        BuscarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarBTNActionPerformed(evt);
            }
        });

        ListarBTN.setBackground(new java.awt.Color(17, 129, 133));
        ListarBTN.setText("Listar Casos");
        ListarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarBTNActionPerformed(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/buscar.png"))); // NOI18N
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/listar.png"))); // NOI18N
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Registra.png"))); // NOI18N
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jSeparator1.setBackground(new java.awt.Color(27, 203, 209));
        jSeparator1.setForeground(new java.awt.Color(27, 203, 209));

        TItulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TItulo.setText("Opciones Caso");

        javax.swing.GroupLayout BgLayout = new javax.swing.GroupLayout(Bg);
        Bg.setLayout(BgLayout);
        BgLayout.setHorizontalGroup(
            BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BgLayout.createSequentialGroup()
                .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(BgLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(RegistrarBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(151, 151, 151)
                        .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addComponent(BuscarBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(159, 159, 159)
                        .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ListarBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)))
                    .addGroup(BgLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addComponent(TItulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(27, 27, 27))
        );
        BgLayout.setVerticalGroup(
            BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BgLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(TItulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BuscarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ListarBTN)
                    .addComponent(RegistrarBTN))
                .addContainerGap(124, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void RegistrarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarBTNActionPerformed
        ShowJPanel(new InfoPaciente());
    }//GEN-LAST:event_RegistrarBTNActionPerformed

    private void BuscarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarBTNActionPerformed
        ShowJPanel(new BuscarCasoPanel());
    }//GEN-LAST:event_BuscarBTNActionPerformed

    private void ListarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarBTNActionPerformed
         ShowJPanel(new ListarCasos());
    }//GEN-LAST:event_ListarBTNActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Bg;
    private javax.swing.JButton BuscarBTN;
    private javax.swing.JButton ListarBTN;
    private javax.swing.JButton RegistrarBTN;
    private javax.swing.JLabel TItulo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
