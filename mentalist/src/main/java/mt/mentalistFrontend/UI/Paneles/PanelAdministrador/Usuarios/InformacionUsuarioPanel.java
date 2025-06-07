package mt.mentalistFrontend.UI.Paneles.PanelAdministrador.Usuarios;

import java.awt.Color;

public class InformacionUsuarioPanel extends javax.swing.JPanel {

    public InformacionUsuarioPanel() {
        initComponents();
        initStyles();
    }

    private void initStyles() {
        Titulo.putClientProperty("FlatLaf.style", "font: 18 $h4.font");
        Titulo.setForeground(new Color(55, 71, 79));
        TituloNombre.putClientProperty("FlatLaf.style", "font: 14 $h4.font");
        TituloNombre.setForeground(new Color(55, 71, 79));
        TituloUC.putClientProperty("FlatLaf.style", "font: 14 $h4.font");
        TituloUC.setForeground(new Color(55, 71, 79));
        TituloIDRE.putClientProperty("FlatLaf.style", "font: 12 $h4.font");
        TituloIDRE.setForeground(Color.BLACK);
        TituloUsuario.putClientProperty("FlatLaf.style", "font: 12 $h4.font");
        TituloUsuario.setForeground(Color.BLACK);
        TituloRol.putClientProperty("FlatLaf.style", "font: 12 $h4.font");
        TituloRol.setForeground(Color.BLACK);
        TituloContraseña.putClientProperty("FlatLaf.style", "font: 12 $h4.font");
        TituloContraseña.setForeground(Color.BLACK);
        TituloConfirmar.putClientProperty("FlatLaf.style", "font: 12 $h4.font");
        TituloConfirmar.setForeground(Color.BLACK);
        TituloCE.putClientProperty("FlatLaf.style", "font: 12 $h4.font");
        TituloCE.setForeground(Color.BLACK);
        TituloTelefono.putClientProperty("FlatLaf.style", "font: 12 $h4.font");
        TituloTelefono.setForeground(Color.BLACK);
        TituloUC.putClientProperty("FlatLaf.style", "font: 12 $h4.font");
        TituloUC.setForeground(Color.BLACK);

        telefono.putClientProperty("FlatLaf.style", "font: 11 $h4.font");
        telefono.setForeground(new Color(107, 129, 154));
        SetCorreo.putClientProperty("FlatLaf.style", "font: 11 $h4.font");
        SetCorreo.setForeground(new Color(107, 129, 154));
        contraseña.putClientProperty("FlatLaf.style", "font: 11 $h4.font");
        contraseña.setForeground(new Color(107, 129, 154));
        Confirmar.putClientProperty("FlatLaf.style", "font: 11 $h4.font");
        Confirmar.setForeground(new Color(107, 129, 154));
        SetRol.putClientProperty("FlatLaf.style", "font: 11 $h4.font");
        SetRol.setForeground(new Color(107, 129, 154));
        SetNombre.putClientProperty("FlatLaf.style", "font: 11 $h4.font");
        SetNombre.setForeground(new Color(107, 129, 154));
        SetUsuario.putClientProperty("FlatLaf.style", "font: 11 $h4.font");
        SetUsuario.setForeground(new Color(107, 129, 154));
        SetIDUsuario.putClientProperty("FlatLaf.style", "font: 11 $h4.font");
        SetIDUsuario.setForeground(new Color(107, 129, 154));

        guardarBTN.putClientProperty("FlatLaf.style", "font: 11 $h4.font");
        guardarBTN.setForeground(Color.white);
        EditarBTN.putClientProperty("FlatLaf.style", "font: 11 $h4.font");
        EditarBTN.setForeground(Color.white);
        EliminarBTN.putClientProperty("FlatLaf.style", "font: 11 $h4.font");
        EliminarBTN.setForeground(Color.white);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        TituloUC = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        SetCorreo = new javax.swing.JTextField();
        telefono = new javax.swing.JTextField();
        TituloCE = new javax.swing.JLabel();
        TituloTelefono = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        guardarBTN = new javax.swing.JButton();
        EditarBTN = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        SetNombre = new javax.swing.JTextField();
        TituloUsuario = new javax.swing.JLabel();
        SetUsuario = new javax.swing.JTextField();
        TituloNombre = new javax.swing.JLabel();
        SetRol = new javax.swing.JComboBox<>();
        TituloRol = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        TituloIDRE = new javax.swing.JLabel();
        SetIDUsuario = new javax.swing.JTextField();
        BuscarBTN = new javax.swing.JButton();
        EliminarBTN = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        TituloContraseña = new javax.swing.JLabel();
        contraseña = new javax.swing.JTextField();
        TituloConfirmar = new javax.swing.JLabel();
        Confirmar = new javax.swing.JTextField();

        jButton1.setText("jButton1");

        jPanel3.setBackground(new java.awt.Color(245, 245, 240));

        TituloUC.setBackground(new java.awt.Color(245, 245, 240));
        TituloUC.setText("Contacto");

        jSeparator1.setBackground(new java.awt.Color(27, 203, 209));
        jSeparator1.setForeground(new java.awt.Color(27, 203, 209));

        jPanel5.setBackground(new java.awt.Color(245, 245, 240));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        SetCorreo.setBackground(new java.awt.Color(188, 234, 255));
        SetCorreo.setForeground(new java.awt.Color(204, 204, 204));
        SetCorreo.setBorder(null);

        telefono.setBackground(new java.awt.Color(188, 234, 255));
        telefono.setForeground(new java.awt.Color(204, 204, 204));
        telefono.setBorder(null);

        TituloCE.setText("Correo  electronico");

        TituloTelefono.setText("Telefono");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(TituloTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(291, 291, 291))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(TituloCE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(237, 237, 237))
                    .addComponent(SetCorreo)
                    .addComponent(telefono))
                .addGap(28, 28, 28))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TituloCE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SetCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TituloTelefono)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        Titulo.setText("Informacion del Usuario -Mentalist");

        guardarBTN.setBackground(new java.awt.Color(17, 129, 133));
        guardarBTN.setText("Guardar");

        EditarBTN.setBackground(new java.awt.Color(17, 129, 133));
        EditarBTN.setText("Editar");
        EditarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarBTNActionPerformed(evt);
            }
        });

        jPanel8.setBackground(new java.awt.Color(245, 245, 240));
        jPanel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        SetNombre.setEditable(false);
        SetNombre.setBackground(new java.awt.Color(188, 234, 255));
        SetNombre.setForeground(new java.awt.Color(153, 153, 153));
        SetNombre.setBorder(null);
        SetNombre.setSelectedTextColor(new java.awt.Color(204, 255, 255));
        SetNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetNombreActionPerformed(evt);
            }
        });

        TituloUsuario.setText("Usuario");

        SetUsuario.setBackground(new java.awt.Color(188, 234, 255));
        SetUsuario.setForeground(new java.awt.Color(153, 153, 153));
        SetUsuario.setBorder(null);
        SetUsuario.setSelectedTextColor(new java.awt.Color(204, 255, 255));
        SetUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetUsuarioActionPerformed(evt);
            }
        });

        TituloNombre.setText("Nombre ");

        SetRol.setBackground(new java.awt.Color(188, 234, 255));
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
                    .addComponent(TituloUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TituloNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(TituloRol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(91, 91, 91))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SetRol, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SetNombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                                .addComponent(SetUsuario)
                                .addGap(2, 2, 2)))
                        .addGap(30, 30, 30)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(14, 14, 14)
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
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(245, 245, 240));
        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel9.setPreferredSize(new java.awt.Dimension(282, 62));

        TituloIDRE.setText("ID del Usuario");

        SetIDUsuario.setEditable(false);
        SetIDUsuario.setBackground(new java.awt.Color(188, 234, 255));
        SetIDUsuario.setForeground(new java.awt.Color(204, 204, 204));
        SetIDUsuario.setBorder(null);

        BuscarBTN.setBackground(new java.awt.Color(17, 129, 133));
        BuscarBTN.setText("Buscar");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(TituloIDRE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(105, 105, 105))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(SetIDUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BuscarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TituloIDRE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SetIDUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BuscarBTN))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        EliminarBTN.setBackground(new java.awt.Color(17, 129, 133));
        EliminarBTN.setText("Eliminar");
        EliminarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jSeparator1)
                .addGap(35, 35, 35))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(guardarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EditarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(EliminarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                        .addGap(430, 430, 430))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TituloUC, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(guardarBTN)
                                .addComponent(EditarBTN))
                            .addComponent(EliminarBTN)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(Titulo)))
                .addGap(4, 4, 4)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(TituloUC, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jPanel6.setBackground(new java.awt.Color(245, 245, 240));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TituloContraseña.setText("Contraseña");

        contraseña.setBackground(new java.awt.Color(188, 234, 255));
        contraseña.setForeground(new java.awt.Color(204, 204, 204));
        contraseña.setBorder(null);

        TituloConfirmar.setText("Confirmar Contraseña");

        Confirmar.setBackground(new java.awt.Color(188, 234, 255));
        Confirmar.setForeground(new java.awt.Color(204, 204, 204));
        Confirmar.setBorder(null);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(TituloConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(227, 227, 227))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(TituloContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(282, 282, 282))
                    .addComponent(Confirmar)
                    .addComponent(contraseña))
                .addGap(26, 26, 26))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TituloContraseña)
                .addGap(2, 2, 2)
                .addComponent(contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TituloConfirmar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(327, 327, 327)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(38, 38, 38))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(189, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SetNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SetNombreActionPerformed

    private void SetUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SetUsuarioActionPerformed

    private void SetRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetRolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SetRolActionPerformed

    private void EditarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditarBTNActionPerformed

    private void EliminarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EliminarBTNActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscarBTN;
    private javax.swing.JTextField Confirmar;
    private javax.swing.JButton EditarBTN;
    private javax.swing.JButton EliminarBTN;
    private javax.swing.JTextField SetCorreo;
    private javax.swing.JTextField SetIDUsuario;
    private javax.swing.JTextField SetNombre;
    private javax.swing.JComboBox<String> SetRol;
    private javax.swing.JTextField SetUsuario;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel TituloCE;
    private javax.swing.JLabel TituloConfirmar;
    private javax.swing.JLabel TituloContraseña;
    private javax.swing.JLabel TituloIDRE;
    private javax.swing.JLabel TituloNombre;
    private javax.swing.JLabel TituloRol;
    private javax.swing.JLabel TituloTelefono;
    private javax.swing.JLabel TituloUC;
    private javax.swing.JLabel TituloUsuario;
    private javax.swing.JTextField contraseña;
    private javax.swing.JButton guardarBTN;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField telefono;
    // End of variables declaration//GEN-END:variables
}
