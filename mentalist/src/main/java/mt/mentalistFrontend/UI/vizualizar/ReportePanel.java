package mt.mentalistFrontend.UI.vizualizar;

import java.awt.Color;

public class ReportePanel extends javax.swing.JPanel {

    public ReportePanel() {
        initComponents();
        initStyles();
    }

    private void initStyles() {
        Titulo.putClientProperty("FlatLaf.style", "font: 25 $h4.font");
        Titulo.setForeground(new Color(55, 71, 79));
        IdUsuario.putClientProperty("FlatLaf.style", "font: 14 $h4.font");
        IdUsuario.setForeground(Color.BLACK);
        Fecha.putClientProperty("FlatLaf.style", "font: 14 $h4.font");
        Fecha.setForeground(Color.BLACK);
        Tipo.putClientProperty("FlatLaf.style", "font: 14 $h4.font");
        Tipo.setForeground(Color.BLACK);
        Descripccion.putClientProperty("FlatLaf.style", "font: 14 $h4.font");
        Descripccion.setForeground(Color.BLACK);
        TipoSelect.putClientProperty("FlatLaf.style", "font: 13 $h4.font");
        TipoSelect.setForeground(Color.BLACK);
        Comment.putClientProperty("FlatLaf.style", "font: 13 $h4.font");
        Comment.setForeground(Color.BLACK);
        SetFecha.putClientProperty("FlatLaf.style", "font: 13 $h4.font");
        SetFecha.setForeground(Color.BLACK);
        SetIdUsuario.putClientProperty("FlatLaf.style", "font: 13 $h4.font");
        SetIdUsuario.setForeground(Color.BLACK);
        GuardarBTN.putClientProperty("FlatLaf.style", "font: 13 $h4.font");
        GuardarBTN.setForeground(Color.white);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bg = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        IdUsuario = new javax.swing.JLabel();
        Fecha = new javax.swing.JLabel();
        Descripccion = new javax.swing.JLabel();
        Tipo = new javax.swing.JLabel();
        TipoSelect = new javax.swing.JComboBox<>();
        Comment = new javax.swing.JTextField();
        SetIdUsuario = new javax.swing.JTextField();
        SetFecha = new javax.swing.JTextField();
        GuardarBTN = new javax.swing.JButton();

        Bg.setBackground(new java.awt.Color(245, 245, 240));

        jPanel1.setBackground(new java.awt.Color(245, 245, 240));
        jPanel1.setPreferredSize(new java.awt.Dimension(750, 400));

        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Reporte");

        jSeparator1.setBackground(new java.awt.Color(27, 203, 209));
        jSeparator1.setForeground(new java.awt.Color(27, 203, 209));

        IdUsuario.setText("ID del Usuario");

        Fecha.setText("Fecha");

        Descripccion.setText("Descripccion");

        Tipo.setText("Tipo del Reporte");

        TipoSelect.setBackground(new java.awt.Color(188, 234, 255));
        TipoSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Medico", "Administrativo", "Tecnico" }));

        Comment.setBackground(new java.awt.Color(188, 234, 255));
        Comment.setBorder(null);

        SetIdUsuario.setEditable(false);
        SetIdUsuario.setBackground(new java.awt.Color(188, 234, 255));
        SetIdUsuario.setBorder(null);
        SetIdUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetIdUsuarioActionPerformed(evt);
            }
        });

        SetFecha.setBackground(new java.awt.Color(188, 234, 255));
        SetFecha.setBorder(null);

        GuardarBTN.setBackground(new java.awt.Color(17, 129, 133));
        GuardarBTN.setText("Guardar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(IdUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                    .addComponent(SetIdUsuario))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(TipoSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Tipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(37, 37, 37)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Fecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(153, 153, 153))
                                    .addComponent(SetFecha)))
                            .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Comment)
                            .addComponent(Descripccion, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(GuardarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(Titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Fecha)
                    .addComponent(IdUsuario)
                    .addComponent(Tipo))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SetIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SetFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TipoSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(Descripccion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Comment, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                .addGap(42, 42, 42)
                .addComponent(GuardarBTN)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout BgLayout = new javax.swing.GroupLayout(Bg);
        Bg.setLayout(BgLayout);
        BgLayout.setHorizontalGroup(
            BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BgLayout.setVerticalGroup(
            BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void SetIdUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetIdUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SetIdUsuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Bg;
    private javax.swing.JTextField Comment;
    private javax.swing.JLabel Descripccion;
    private javax.swing.JLabel Fecha;
    private javax.swing.JButton GuardarBTN;
    private javax.swing.JLabel IdUsuario;
    private javax.swing.JTextField SetFecha;
    private javax.swing.JTextField SetIdUsuario;
    private javax.swing.JLabel Tipo;
    private javax.swing.JComboBox<String> TipoSelect;
    private javax.swing.JLabel Titulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
