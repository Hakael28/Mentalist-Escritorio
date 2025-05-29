package mt.mentalist.gui;

import java.awt.Color;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Ingreso extends javax.swing.JFrame {
    int xMouse, yMouse;

    @Autowired
    public Ingreso() {
        initComponents(); // Método que inicializa la UI
        InitStyles();
        initPlaceHolders();
        setLocationRelativeTo(null);
    }

    private void InitStyles() {
        Tituloinicio.putClientProperty("FlatLaf.style", "font: bold $h1.font");
        Tituloinicio.setForeground(new Color(55, 71, 79));
        Usuario.putClientProperty("FlatLaf.style", "font: 18 $h4.font");
        Usuario.setForeground(new Color(55, 71, 79));
        IngresoUsuario.putClientProperty("FlatLaf.style", "font: 12 $h3.regular.font");
        IngresoUsuario.setForeground(new Color(107, 129, 154));
        Contrasena.putClientProperty("FlatLaf.style", "font: 18 $h4.font");
        Contrasena.setForeground(new Color(55, 71, 79));
        IngresoContrasena.putClientProperty("FlatLaf.style", "font: 12 $h3.regular.font");
        IngresoContrasena.setForeground(new Color(107, 129, 154));
        LbRol.putClientProperty("FlatLaf.style", "font: 18 $h4.font");
        LbRol.setForeground(new Color(55, 71, 79));
        IngresoRol.putClientProperty("FlatLaf.style", "font: 12 $h3.regular.font");
        IngresoRol.setForeground(new Color(107, 129, 154));
        CerrarBTN.putClientProperty("FlatLaf.style", "font: 18 $h4.font");
        CerrarBTN.setForeground(Color.white);
        IngresoBTN.putClientProperty("FlatLaf.style", "font: 14 $h4.font");
        IngresoBTN.setForeground(Color.WHITE);

    }

    private void initPlaceHolders() {
        mt.mentalist.GuiFuctions.PlaceholderSupport.aplicar(IngresoUsuario, "Ingrese su nombre de usuario");
        mt.mentalist.GuiFuctions.PlaceholderSupport.aplicar(IngresoContrasena, "*****");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        Background = new javax.swing.JPanel();
        ImagePane = new javax.swing.JPanel();
        Image = new javax.swing.JLabel();
        Tituloinicio = new javax.swing.JLabel();
        Usuario = new javax.swing.JLabel();
        IngresoUsuario = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        Contrasena = new javax.swing.JLabel();
        IngresoContrasena = new javax.swing.JPasswordField();
        jSeparator3 = new javax.swing.JSeparator();
        Encabezado = new javax.swing.JPanel();
        CerrarBTN = new javax.swing.JButton();
        LbRol = new javax.swing.JLabel();
        IngresoRol = new javax.swing.JComboBox<>();
        IngresoBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        Background.setBackground(new java.awt.Color(245, 245, 240));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ImagePane.setBackground(new java.awt.Color(232, 245, 233));

        Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/mental_1.jpg.jpg"))); // NOI18N

        javax.swing.GroupLayout ImagePaneLayout = new javax.swing.GroupLayout(ImagePane);
        ImagePane.setLayout(ImagePaneLayout);
        ImagePaneLayout.setHorizontalGroup(
            ImagePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ImagePaneLayout.createSequentialGroup()
                .addComponent(Image)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        ImagePaneLayout.setVerticalGroup(
            ImagePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ImagePaneLayout.createSequentialGroup()
                .addComponent(Image, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Background.add(ImagePane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 360));

        Tituloinicio.setText("Iniciar Sesion");
        Background.add(Tituloinicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 160, -1));

        Usuario.setText("Usuario");
        Background.add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 230, -1));

        IngresoUsuario.setBackground(new java.awt.Color(224, 245, 255));
        IngresoUsuario.setBorder(null);
        Background.add(IngresoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 270, 20));

        jSeparator2.setBackground(new java.awt.Color(0, 51, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 51, 0));
        Background.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 270, 10));

        Contrasena.setText("Contraseña");
        Background.add(Contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 190, -1));

        IngresoContrasena.setBackground(new java.awt.Color(224, 245, 255));
        IngresoContrasena.setBorder(null);
        Background.add(IngresoContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 270, 20));

        jSeparator3.setBackground(new java.awt.Color(0, 51, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 51, 0));
        Background.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 270, 20));

        Encabezado.setBackground(new java.awt.Color(24, 179, 184));
        Encabezado.setPreferredSize(new java.awt.Dimension(40, 40));
        Encabezado.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                EncabezadoMouseDragged(evt);
            }
        });
        Encabezado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EncabezadoMousePressed(evt);
            }
        });

        CerrarBTN.setBackground(new java.awt.Color(24, 179, 184));
        CerrarBTN.setText("X");
        CerrarBTN.setPreferredSize(new java.awt.Dimension(40, 40));
        CerrarBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarBTNMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CerrarBTNMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CerrarBTNMouseExited(evt);
            }
        });

        javax.swing.GroupLayout EncabezadoLayout = new javax.swing.GroupLayout(Encabezado);
        Encabezado.setLayout(EncabezadoLayout);
        EncabezadoLayout.setHorizontalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EncabezadoLayout.createSequentialGroup()
                .addGap(0, 567, Short.MAX_VALUE)
                .addComponent(CerrarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        EncabezadoLayout.setVerticalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CerrarBTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Background.add(Encabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 40));

        LbRol.setText("Rol");
        Background.add(LbRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 190, -1));

        IngresoRol.setBackground(new java.awt.Color(224, 245, 255));
        IngresoRol.setForeground(new java.awt.Color(107, 129, 154));
        IngresoRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Medico", "Administrador" }));
        Background.add(IngresoRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 180, -1));

        IngresoBTN.setBackground(new java.awt.Color(19, 155, 161));
        IngresoBTN.setText("Ingreso");
        IngresoBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                IngresoBTNMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                IngresoBTNMouseExited(evt);
            }
        });
        IngresoBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresoBTNActionPerformed(evt);
            }
        });
        Background.add(IngresoBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, 100, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EncabezadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EncabezadoMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_EncabezadoMousePressed

    private void EncabezadoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EncabezadoMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_EncabezadoMouseDragged

    private void CerrarBTNMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarBTNMouseEntered
        CerrarBTN.setBackground(new Color(30, 226, 232));
        CerrarBTN.setForeground(Color.white);
    }//GEN-LAST:event_CerrarBTNMouseEntered

    private void CerrarBTNMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarBTNMouseExited
        CerrarBTN.setBackground(new Color(19, 155, 161));
    }//GEN-LAST:event_CerrarBTNMouseExited

    private void CerrarBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarBTNMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CerrarBTNMouseClicked

    private void IngresoBTNMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngresoBTNMouseEntered
        IngresoBTN.setBackground(new Color(30, 226, 232));

    }//GEN-LAST:event_IngresoBTNMouseEntered

    private void IngresoBTNMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngresoBTNMouseExited
        IngresoBTN.setBackground(new Color(19, 155, 161));
    }//GEN-LAST:event_IngresoBTNMouseExited

    private void IngresoBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresoBTNActionPerformed
    }//GEN-LAST:event_IngresoBTNActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton CerrarBTN;
    private javax.swing.JLabel Contrasena;
    private javax.swing.JPanel Encabezado;
    private javax.swing.JLabel Image;
    private javax.swing.JPanel ImagePane;
    private javax.swing.JButton IngresoBTN;
    private javax.swing.JPasswordField IngresoContrasena;
    private javax.swing.JComboBox<String> IngresoRol;
    private javax.swing.JTextField IngresoUsuario;
    private javax.swing.JLabel LbRol;
    private javax.swing.JLabel Tituloinicio;
    private javax.swing.JLabel Usuario;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
