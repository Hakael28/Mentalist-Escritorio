package mt.mentalistFrontend.UI.Paneles.PanelAdministrador.Basicas;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import mt.mentalistFrontend.UI.Paneles.PanelAdministrador.Usuarios.InformacionUsuarioPanel;
import mt.mentalistFrontend.UI.Paneles.PanelAdministrador.Usuarios.RegistroUsuarioPanel;

public class UsuariosPanel extends javax.swing.JPanel {

    private DefaultTableModel modelo;

    public UsuariosPanel() {
        initComponents();
        initStyles();
        cargarUsuarios();
    }

    private void initStyles() {
        Titulo.putClientProperty("FlatLaf.style", "font: 25 $h4.font");
        Titulo.setForeground(new Color(55, 71, 79));
        TablaUsuarios.putClientProperty("FlatLaf.style", "font: 14 $h4.regular.font");
        TablaUsuarios.setForeground(Color.BLACK);
        CrearBTN.putClientProperty("FlatLaf.style", "font: 14 $h4.font");
        CrearBTN.setForeground(Color.white);
        BuscarBTN.putClientProperty("FlatLaf.style", "font: 14 $h4.font");
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
    }

    private void cargarUsuarios() {
//        if (usuarioServicio == null) {
//            System.err.println("No se ha inicializado el servicio");
//            return;
//        }
//        modelo = (DefaultTableModel) TablaUsuarios.getModel();
//        modelo.setRowCount(0);
//
//        var usuarios = this.usuarioServicio.listarUsuarios();
//
//        if (usuarios == null || usuarios.isEmpty()) {
//            System.err.println("No se encontraron casos en la base de datos");
//            return;
//        }
//
//        usuarios.forEach(usuario -> {
//            Object[] renglonUsuario = {
//                usuario.getIdUsuario(),
//                usuario.getUsuario(),
//                usuario.getRol(),
//                usuario.getCorreo(),
//                usuario.getTelefono()
//            };
//            modelo.addRow(renglonUsuario);
//        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bg = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaUsuarios = new javax.swing.JTable();
        CrearBTN = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        BuscarBTN = new javax.swing.JButton();
        ActualizarBTN = new javax.swing.JButton();

        setBackground(new java.awt.Color(245, 245, 240));
        setToolTipText("");

        Bg.setBackground(new java.awt.Color(245, 245, 240));

        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Gestion de usuarios");

        TablaUsuarios.setBackground(new java.awt.Color(188, 234, 255));
        TablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID usuario", "Usuario", "Rol", "Correo", "Telefono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });

        jScrollPane1.setViewportView(TablaUsuarios);
        if (TablaUsuarios.getColumnModel().getColumnCount() > 0) {
            TablaUsuarios.getColumnModel().getColumn(0).setResizable(false);
            TablaUsuarios.getColumnModel().getColumn(1).setResizable(false);
            TablaUsuarios.getColumnModel().getColumn(3).setResizable(false);
        }

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
        BuscarBTN.setToolTipText("");
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

        javax.swing.GroupLayout BgLayout = new javax.swing.GroupLayout(Bg);
        Bg.setLayout(BgLayout);
        BgLayout.setHorizontalGroup(
            BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BgLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BgLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CrearBTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BuscarBTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                            .addComponent(ActualizarBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(67, 67, 67))
        );
        BgLayout.setVerticalGroup(
            BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BgLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(BgLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(BgLayout.createSequentialGroup()
                        .addGap(0, 53, Short.MAX_VALUE)
                        .addComponent(BuscarBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CrearBTN)
                        .addGap(152, 152, 152)
                        .addComponent(ActualizarBTN)
                        .addGap(8, 8, 8)))
                .addGap(35, 35, 35))
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
        ShowJPanel(new InformacionUsuarioPanel());
    }//GEN-LAST:event_BuscarBTNActionPerformed

    private void CrearBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearBTNActionPerformed
        ShowJPanel(new RegistroUsuarioPanel());
    }//GEN-LAST:event_CrearBTNActionPerformed

    private void ActualizarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarBTNActionPerformed
        cargarUsuarios();
    }//GEN-LAST:event_ActualizarBTNActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ActualizarBTN;
    private javax.swing.JPanel Bg;
    private javax.swing.JButton BuscarBTN;
    private javax.swing.JButton CrearBTN;
    private javax.swing.JTable TablaUsuarios;
    private javax.swing.JLabel Titulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
