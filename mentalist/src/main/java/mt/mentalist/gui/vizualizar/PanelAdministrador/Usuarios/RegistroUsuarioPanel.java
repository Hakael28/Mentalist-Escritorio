package mt.mentalist.gui.vizualizar.PanelAdministrador.Usuarios;

import java.awt.Color;

public class RegistroUsuarioPanel extends javax.swing.JPanel {
    public RegistroUsuarioPanel() {
        initComponents();
        initStyles();
    }

    private void initStyles() {
        Titulo.putClientProperty("FlatLaf.style", "font: 18 $h4.font");
        Titulo.setForeground(new Color(55, 71, 79));
        TituloIPB.putClientProperty("FlatLaf.style", "font: 14 $h4.font");
        TituloIPB.setForeground(new Color(55, 71, 79));
        TituloNombre.putClientProperty("FlatLaf.style", "font: 14 $h4.font");
        TituloNombre.setForeground(new Color(55, 71, 79));
        TituloUC.putClientProperty("FlatLaf.style", "font: 14 $h4.font");
        TituloUC.setForeground(new Color(55, 71, 79));
        TituloIDUS.putClientProperty("FlatLaf.style", "font: 12 $h4.font");
        TituloIDUS.setForeground(Color.BLACK);
        TituloUsuario.putClientProperty("FlatLaf.style", "font: 12 $h4.font");
        TituloUsuario.setForeground(Color.BLACK);
        TituloRol.putClientProperty("FlatLaf.style", "font: 12 $h4.font");
        TituloRol.setForeground(Color.BLACK);
        TituloContraseña.putClientProperty("FlatLaf.style", "font: 12 $h4.font");
        TituloContraseña.setForeground(Color.BLACK);
        TituloConfirmar.putClientProperty("FlatLaf.style", "font: 12 $h4.font");
        TituloConfirmar.setForeground(Color.BLACK);
        correoLB.putClientProperty("FlatLaf.style", "font: 12 $h4.font");
        correoLB.setForeground(Color.BLACK);
        telefonolLB.putClientProperty("FlatLaf.style", "font: 12 $h4.font");
        telefonolLB.setForeground(Color.BLACK);

        telefonoTXT.putClientProperty("FlatLaf.style", "font: 11 $h4.font");
        telefonoTXT.setForeground(new Color(107, 129, 154));
        correoTFX.putClientProperty("FlatLaf.style", "font: 11 $h4.font");
        correoTFX.setForeground(new Color(107, 129, 154));
        SetContraseña.putClientProperty("FlatLaf.style", "font: 11 $h4.font");
        SetContraseña.setForeground(new Color(107, 129, 154));
        SetConfirmar.putClientProperty("FlatLaf.style", "font: 11 $h4.font");
        SetConfirmar.setForeground(new Color(107, 129, 154));
        SetRol.putClientProperty("FlatLaf.style", "font: 11 $h4.font");
        SetRol.setForeground(new Color(107, 129, 154));
        SetNombre.putClientProperty("FlatLaf.style", "font: 11 $h4.font");
        SetNombre.setForeground(new Color(107, 129, 154));
        SetUsuario.putClientProperty("FlatLaf.style", "font: 11 $h4.font");
        SetUsuario.setForeground(new Color(107, 129, 154));
        SetID.putClientProperty("FlatLaf.style", "font: 11 $h4.font");
        SetID.setForeground(new Color(107, 129, 154));

        guardarBTN.putClientProperty("FlatLaf.style", "font: 11 $h4.font");
        guardarBTN.setForeground(Color.white);
        limpiarBTN.putClientProperty("FlatLaf.style", "font: 11 $h4.font");
        limpiarBTN.setForeground(Color.white);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        TituloUC = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        correoTFX = new javax.swing.JTextField();
        telefonoTXT = new javax.swing.JTextField();
        correoLB = new javax.swing.JLabel();
        telefonolLB = new javax.swing.JLabel();
        TituloIPB = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        guardarBTN = new javax.swing.JButton();
        limpiarBTN = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        SetNombre = new javax.swing.JTextField();
        TituloUsuario = new javax.swing.JLabel();
        SetID = new javax.swing.JTextField();
        TituloIDUS = new javax.swing.JLabel();
        SetUsuario = new javax.swing.JTextField();
        TituloNombre = new javax.swing.JLabel();
        SetRol = new javax.swing.JComboBox<>();
        TituloRol = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        TituloContraseña = new javax.swing.JLabel();
        TituloConfirmar = new javax.swing.JLabel();
        SetContraseña = new javax.swing.JTextField();
        SetConfirmar = new javax.swing.JTextField();

        jPanel1.setPreferredSize(new java.awt.Dimension(750, 400));

        jPanel2.setBackground(new java.awt.Color(245, 245, 240));

        jPanel3.setBackground(new java.awt.Color(245, 245, 240));

        TituloUC.setBackground(new java.awt.Color(245, 245, 240));
        TituloUC.setText("Contacto");

        jSeparator1.setBackground(new java.awt.Color(27, 203, 209));
        jSeparator1.setForeground(new java.awt.Color(27, 203, 209));

        jPanel5.setBackground(new java.awt.Color(245, 245, 240));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        correoTFX.setEditable(false);
        correoTFX.setBackground(new java.awt.Color(204, 255, 255));
        correoTFX.setForeground(new java.awt.Color(204, 204, 204));
        correoTFX.setText("ingrese correo electronico");
        correoTFX.setBorder(null);

        telefonoTXT.setEditable(false);
        telefonoTXT.setBackground(new java.awt.Color(204, 255, 255));
        telefonoTXT.setForeground(new java.awt.Color(204, 204, 204));
        telefonoTXT.setText("ingrese telefono");
        telefonoTXT.setBorder(null);

        correoLB.setText("Correo  electronico");

        telefonolLB.setText("Telefono");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(telefonolLB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(239, 239, 239))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(correoLB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(185, 185, 185))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(telefonoTXT, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(correoTFX, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(21, 21, 21))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(correoLB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(correoTFX, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(telefonolLB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(telefonoTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        TituloIPB.setText("Informacion Personal Basica");

        Titulo.setText(" Registro de Usuario -Mentalist");

        guardarBTN.setBackground(new java.awt.Color(17, 129, 133));
        guardarBTN.setText("Guardar");
        guardarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarBTNActionPerformed(evt);
            }
        });

        limpiarBTN.setBackground(new java.awt.Color(17, 129, 133));
        limpiarBTN.setText("Limpiar");
        limpiarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarBTNActionPerformed(evt);
            }
        });

        jPanel8.setBackground(new java.awt.Color(245, 245, 240));
        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        SetNombre.setEditable(false);
        SetNombre.setBackground(new java.awt.Color(204, 255, 255));
        SetNombre.setForeground(new java.awt.Color(153, 153, 153));
        SetNombre.setText("ingrese nombre del usuario");
        SetNombre.setBorder(null);
        SetNombre.setSelectedTextColor(new java.awt.Color(204, 255, 255));
        SetNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetNombreActionPerformed(evt);
            }
        });

        TituloUsuario.setText("Usuario");

        SetID.setEditable(false);
        SetID.setBackground(new java.awt.Color(204, 255, 255));
        SetID.setForeground(new java.awt.Color(153, 153, 153));
        SetID.setBorder(null);
        SetID.setSelectionColor(new java.awt.Color(204, 255, 255));
        SetID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetIDActionPerformed(evt);
            }
        });

        TituloIDUS.setText("ID Usuario");

        SetUsuario.setEditable(false);
        SetUsuario.setBackground(new java.awt.Color(204, 255, 255));
        SetUsuario.setForeground(new java.awt.Color(153, 153, 153));
        SetUsuario.setText("ingrese el usuario");
        SetUsuario.setBorder(null);
        SetUsuario.setSelectedTextColor(new java.awt.Color(204, 255, 255));
        SetUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetUsuarioActionPerformed(evt);
            }
        });

        TituloNombre.setText("Nombre ");

        SetRol.setBackground(new java.awt.Color(204, 255, 255));
        SetRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Medico ", "Administrador " }));
        SetRol.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SetRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetRolActionPerformed(evt);
            }
        });

        TituloRol.setText("Rol");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TituloIDUS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TituloUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TituloNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(TituloRol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(91, 91, 91))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SetRol, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SetNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                                .addComponent(SetUsuario)
                                .addGap(2, 2, 2))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                                .addComponent(SetID)
                                .addGap(3, 3, 3)))
                        .addGap(30, 30, 30)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(TituloIDUS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SetID, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TituloUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SetUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TituloNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SetNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TituloRol)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SetRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(245, 245, 240));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TituloContraseña.setText("Contraseña");

        TituloConfirmar.setText("Confirmar Contraseña");

        SetContraseña.setBackground(new java.awt.Color(204, 255, 255));
        SetContraseña.setForeground(new java.awt.Color(204, 204, 204));
        SetContraseña.setText("ingrese contraseña");
        SetContraseña.setBorder(null);

        SetConfirmar.setBackground(new java.awt.Color(204, 255, 255));
        SetConfirmar.setForeground(new java.awt.Color(204, 204, 204));
        SetConfirmar.setText("ingrese contraseña");
        SetConfirmar.setBorder(null);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SetConfirmar)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(TituloConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(239, 239, 239))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(TituloContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(294, 294, 294))
                    .addComponent(SetContraseña))
                .addGap(19, 19, 19))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(TituloContraseña)
                .addGap(8, 8, 8)
                .addComponent(SetContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TituloConfirmar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SetConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addComponent(guardarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(limpiarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jSeparator1)
                .addGap(31, 31, 31))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(TituloIPB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(TituloUC, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(Titulo))
                    .addComponent(guardarBTN)
                    .addComponent(limpiarBTN))
                .addGap(4, 4, 4)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TituloUC, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(TituloIPB)
                        .addGap(8, 8, 8)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 751, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void limpiarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_limpiarBTNActionPerformed

    private void guardarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guardarBTNActionPerformed

    private void SetNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SetNombreActionPerformed

    private void SetIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SetIDActionPerformed

    private void SetUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SetUsuarioActionPerformed

    private void SetRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetRolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SetRolActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField SetConfirmar;
    private javax.swing.JTextField SetContraseña;
    private javax.swing.JTextField SetID;
    private javax.swing.JTextField SetNombre;
    private javax.swing.JComboBox<String> SetRol;
    private javax.swing.JTextField SetUsuario;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel TituloConfirmar;
    private javax.swing.JLabel TituloContraseña;
    private javax.swing.JLabel TituloIDUS;
    private javax.swing.JLabel TituloIPB;
    private javax.swing.JLabel TituloNombre;
    private javax.swing.JLabel TituloRol;
    private javax.swing.JLabel TituloUC;
    private javax.swing.JLabel TituloUsuario;
    private javax.swing.JLabel correoLB;
    private javax.swing.JTextField correoTFX;
    private javax.swing.JButton guardarBTN;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton limpiarBTN;
    private javax.swing.JTextField telefonoTXT;
    private javax.swing.JLabel telefonolLB;
    // End of variables declaration//GEN-END:variables
}
