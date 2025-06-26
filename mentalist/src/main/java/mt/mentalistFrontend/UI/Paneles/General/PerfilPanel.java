package mt.mentalistFrontend.UI.Paneles.General;

import mt.mentalistFrontend.Util.SesionUsuario;

import java.awt.Color;

public class PerfilPanel extends javax.swing.JPanel {

    public PerfilPanel() {
        initComponents();
        initStyles();
        cargarDatosUsuario();
    }

    private void initStyles() {
        Titulo.putClientProperty("FlatLaf.style", "font: 25 $h4.font");
        Titulo.setForeground(new Color(55, 71, 79));
        IDUsuario.putClientProperty("FlatLaf.style", "font: 14 $h4.font");
        IDUsuario.setForeground(Color.BLACK);
        Usuario.putClientProperty("FlatLaf.style", "font: 14 $h4.font");
        Usuario.setForeground(Color.BLACK);
        UsuarioLogin.putClientProperty("FlatLaf.style", "font: 14 $h4.font");
        UsuarioLogin.setForeground(Color.BLACK);
        Rol.putClientProperty("FlatLaf.style", "font: 14 $h4.font");
        Rol.setForeground(Color.BLACK);
        Correo.putClientProperty("FlatLaf.style", "font: 14 $h4.font");
        Correo.setForeground(Color.BLACK);
        Telefono.putClientProperty("FlatLaf.style", "font: 14 $h4.font");
        Telefono.setForeground(Color.BLACK);
        setID.putClientProperty("FlatLaf.style", "font: 12 $h4.font");
        setID.setForeground(Color.BLACK);
        setUsuario.putClientProperty("FlatLaf.style", "font: 12 $h4.font");
        setUsuario.setForeground(Color.BLACK);
        setUsuarioLogin.putClientProperty("FlatLaf.style", "font: 12 $h4.font");
        setUsuarioLogin.setForeground(Color.BLACK);
        setRol.putClientProperty("FlatLaf.style", "font: 12 $h4.font");
        setRol.setForeground(Color.BLACK);
        setCorreo.putClientProperty("FlatLaf.style", "font: 12 $h4.font");
        setCorreo.setForeground(Color.BLACK);
        setTelefono.putClientProperty("FlatLaf.style", "font: 12 $h4.font");
        setTelefono.setForeground(Color.BLACK);
        editarBTN.putClientProperty("FlatLaf.style", "font: 13 $h4.font");
        editarBTN.setForeground(Color.white);
    }

    private void cargarDatosUsuario() {
        setID.setText(String.valueOf(SesionUsuario.getIdUsuario()));
        setUsuario.setText(SesionUsuario.getNombre());
        setUsuarioLogin.setText(SesionUsuario.getUsuario());
        setRol.setText(SesionUsuario.getRol());
        setCorreo.setText(SesionUsuario.getCorreo());
        setTelefono.setText(SesionUsuario.getTelefono());
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        IDUsuario = new javax.swing.JLabel();
        setID = new javax.swing.JLabel();
        Rol = new javax.swing.JLabel();
        setRol = new javax.swing.JLabel();
        Usuario = new javax.swing.JLabel();
        setUsuario = new javax.swing.JLabel();
        UsuarioLogin = new javax.swing.JLabel();
        setUsuarioLogin = new javax.swing.JLabel();
        Telefono = new javax.swing.JLabel();
        setTelefono = new javax.swing.JLabel();
        Correo = new javax.swing.JLabel();
        setCorreo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        editarBTN = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(245, 245, 240));
        jPanel2.setBackground(new java.awt.Color(245, 245, 240));
        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/PerfilImage.png")));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(8, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(image)
                                .addContainerGap())
        );

        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Titulo.setText("Información del Perfil");

        jPanel3.setBackground(new java.awt.Color(245, 245, 240));
        IDUsuario.setText("🆔 ID");
        Usuario.setText("👤 Nombre");
        UsuarioLogin.setText("🧾 Usuario");
        Rol.setText("👨‍⚕ Rol");
        Telefono.setText("📞 Teléfono");
        Correo.setText("📧 Correo");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(IDUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                                        .addComponent(Usuario)
                                        .addComponent(UsuarioLogin)
                                        .addComponent(Rol)
                                        .addComponent(Telefono)
                                        .addComponent(Correo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(setID)
                                        .addComponent(setUsuario)
                                        .addComponent(setUsuarioLogin)
                                        .addComponent(setRol)
                                        .addComponent(setTelefono)
                                        .addComponent(setCorreo))
                                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(13)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(IDUsuario)
                                        .addComponent(setID))
                                .addGap(12)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Usuario)
                                        .addComponent(setUsuario))
                                .addGap(12)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(UsuarioLogin)
                                        .addComponent(setUsuarioLogin))
                                .addGap(12)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Rol)
                                        .addComponent(setRol))
                                .addGap(12)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Telefono)
                                        .addComponent(setTelefono))
                                .addGap(12)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Correo)
                                        .addComponent(setCorreo)))
        );

        jSeparator1.setBackground(new java.awt.Color(27, 203, 209));
        jSeparator1.setForeground(new java.awt.Color(27, 203, 209));

        editarBTN.setBackground(new java.awt.Color(17, 129, 133));
        editarBTN.setText("✏️ Editar");
        editarBTN.setBorder(null);
        editarBTN.addActionListener(evt -> editarBTNActionPerformed(evt));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50)
                                .addComponent(Titulo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                                .addComponent(editarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50))
                        .addComponent(jSeparator1)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Titulo)
                                        .addComponent(editarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(30, Short.MAX_VALUE))
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
    }

    private void editarBTNActionPerformed(java.awt.event.ActionEvent evt) {
        // Acción del botón editar
    }

    // Variables declaration - no modificar
    private javax.swing.JLabel Correo;
    private javax.swing.JLabel IDUsuario;
    private javax.swing.JLabel Rol;
    private javax.swing.JLabel Telefono;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel Usuario;
    private javax.swing.JLabel UsuarioLogin;
    private javax.swing.JButton editarBTN;
    private javax.swing.JLabel image;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel setCorreo;
    private javax.swing.JLabel setID;
    private javax.swing.JLabel setRol;
    private javax.swing.JLabel setTelefono;
    private javax.swing.JLabel setUsuario;
    private javax.swing.JLabel setUsuarioLogin;
    // End of variables declaration
}