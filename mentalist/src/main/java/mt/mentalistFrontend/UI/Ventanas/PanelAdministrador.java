package mt.mentalistFrontend.UI.Ventanas;

import mt.mentalistFrontend.UI.Paneles.PanelAdministrador.EstadisticaPanel;
import mt.mentalistFrontend.UI.Paneles.PanelAdministrador.ReportesPanel;
import mt.mentalistFrontend.UI.Paneles.General.PerfilPanel;
import mt.mentalistFrontend.UI.Paneles.PanelAdministrador.PrincipalAdministrador;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import javax.swing.JPanel;


import org.springframework.stereotype.Component;

@Component
public class PanelAdministrador extends javax.swing.JFrame {


    public PanelAdministrador() {
        initComponents();
        initStyles();
        setDate();
        initContent();
        this.setMinimumSize(new Dimension(1020, 640));
        this.setSize(1020, 640);
        this.setLocationRelativeTo(null);
    }

    private void initStyles() {
        Titulo.putClientProperty("FlatLaf.style", "font: 24 bold $h2.regular.font");
        Titulo.setForeground(Color.white);
        Subtitulo.putClientProperty("FlatLaf.style", "font: 24 $h4.font");
        Subtitulo.setForeground(new Color(55, 71, 79));
        tiempo.putClientProperty("FlatLaf.style", "font: 22 $h4.font");
        tiempo.setForeground(Color.WHITE);
        Bienvenida.putClientProperty("FlatLaf.style", "font: 24 $h4.font");
        Bienvenida.setForeground(Color.WHITE);

        PrincipalBTN.putClientProperty("FlatLaf.style", "font: 18 $h4.font");
        PrincipalBTN.setForeground(Color.white);
        EstadisticaBTN.putClientProperty("FlatLaf.style", "font: 18 $h4.font");
        EstadisticaBTN.setForeground(Color.white);
        UsuarioBTN.putClientProperty("FlatLaf.style", "font: 18 $h4.font");
        UsuarioBTN.setForeground(Color.white);
        PerfilBTN.putClientProperty("FlatLaf.style", "font: 18 $h4.font");
        PerfilBTN.setForeground(Color.white);
        ReportesBTN.putClientProperty("FlatLaf.style", "font: 18 $h4.font");
        ReportesBTN.setForeground(Color.white);
        SalirBTN.putClientProperty("FlatLaf.style", "font: 18 $h4.font");
        SalirBTN.setForeground(Color.white);
    }

    private void setDate() {
        LocalDate now = LocalDate.now();
        Locale spanishLocale = new Locale("es", "ES");
        tiempo.setText(now.format(DateTimeFormatter.ofPattern("'Hoy es' EEEE dd 'de' MMMM 'de' yyyy", spanishLocale)));
    }

    public void usuarioActual(String nombreUsuario) {
    }

    private void initContent() {
        ShowJPanel(new PrincipalAdministrador());
    }

    private void ShowJPanel(JPanel p) {
        p.setSize(750, 400);
        p.setLocation(0, 0);

        Contenido.removeAll();
        Contenido.setLayout(new BorderLayout());
        Contenido.add(p, BorderLayout.CENTER);
        Contenido.revalidate();
        Contenido.repaint();
    }

    ;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        PrincipalBTN = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        EstadisticaBTN = new javax.swing.JButton();
        SalirBTN = new javax.swing.JButton();
        UsuarioBTN = new javax.swing.JButton();
        PerfilBTN = new javax.swing.JButton();
        ReportesBTN = new javax.swing.JButton();
        Menssage = new javax.swing.JPanel();
        Bienvenida = new javax.swing.JLabel();
        tiempo = new javax.swing.JLabel();
        Subtitulo = new javax.swing.JLabel();
        Contenido = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Background.setBackground(new java.awt.Color(245, 245, 240));
        Background.setMinimumSize(new java.awt.Dimension(1020, 640));
        Background.setName(""); // NOI18N

        Menu.setBackground(new java.awt.Color(17, 129, 133));
        Menu.setPreferredSize(new java.awt.Dimension(270, 640));

        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Mentalist");

        PrincipalBTN.setBackground(new java.awt.Color(17, 129, 133));
        PrincipalBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/inicio.png"))); // NOI18N
        PrincipalBTN.setText("Principal");
        PrincipalBTN.setBorder(null);
        PrincipalBTN.setBorderPainted(false);
        PrincipalBTN.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PrincipalBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrincipalBTNActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));

        EstadisticaBTN.setBackground(new java.awt.Color(17, 129, 133));
        EstadisticaBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/estadistica.png"))); // NOI18N
        EstadisticaBTN.setText("Estadistica");
        EstadisticaBTN.setToolTipText("");
        EstadisticaBTN.setBorder(null);
        EstadisticaBTN.setBorderPainted(false);
        EstadisticaBTN.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        EstadisticaBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstadisticaBTNActionPerformed(evt);
            }
        });

        SalirBTN.setBackground(new java.awt.Color(17, 129, 133));
        SalirBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/salir.png"))); // NOI18N
        SalirBTN.setText("Salir");
        SalirBTN.setBorder(null);
        SalirBTN.setBorderPainted(false);
        SalirBTN.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        SalirBTN.setPreferredSize(new java.awt.Dimension(73, 24));
        SalirBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirBTNActionPerformed(evt);
            }
        });

        UsuarioBTN.setBackground(new java.awt.Color(17, 129, 133));
        UsuarioBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Usuarios.png"))); // NOI18N
        UsuarioBTN.setText("Usuarios");
        UsuarioBTN.setBorder(null);
        UsuarioBTN.setBorderPainted(false);
        UsuarioBTN.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        UsuarioBTN.setPreferredSize(new java.awt.Dimension(73, 24));
        UsuarioBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioBTNActionPerformed(evt);
            }
        });

        PerfilBTN.setBackground(new java.awt.Color(17, 129, 133));
        PerfilBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/perfil.png"))); // NOI18N
        PerfilBTN.setText("Perfil");
        PerfilBTN.setBorder(null);
        PerfilBTN.setBorderPainted(false);
        PerfilBTN.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PerfilBTN.setPreferredSize(new java.awt.Dimension(73, 24));
        PerfilBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PerfilBTNActionPerformed(evt);
            }
        });

        ReportesBTN.setBackground(new java.awt.Color(17, 129, 133));
        ReportesBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reporte.png"))); // NOI18N
        ReportesBTN.setText("Reportes");
        ReportesBTN.setBorder(null);
        ReportesBTN.setBorderPainted(false);
        ReportesBTN.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ReportesBTN.setPreferredSize(new java.awt.Dimension(73, 24));
        ReportesBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportesBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ReportesBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(SalirBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(MenuLayout.createSequentialGroup()
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(PrincipalBTN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(EstadisticaBTN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                        .addComponent(UsuarioBTN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PerfilBTN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(Titulo)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(PrincipalBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(EstadisticaBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UsuarioBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(PerfilBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addComponent(ReportesBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(SalirBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        Menssage.setBackground(new java.awt.Color(27, 203, 209));
        Menssage.setPreferredSize(new java.awt.Dimension(679, 150));

        Bienvenida.setText("Bienvenido(a),");

        tiempo.setText("Hoy es {dayname} {day} de {month} de {year}");

        javax.swing.GroupLayout MenssageLayout = new javax.swing.GroupLayout(Menssage);
        Menssage.setLayout(MenssageLayout);
        MenssageLayout.setHorizontalGroup(
            MenssageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenssageLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(MenssageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenssageLayout.createSequentialGroup()
                        .addComponent(Bienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(MenssageLayout.createSequentialGroup()
                        .addComponent(tiempo, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
                        .addGap(148, 148, 148))))
        );
        MenssageLayout.setVerticalGroup(
            MenssageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenssageLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(Bienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        Subtitulo.setText("Gestion de Salud Mental");

        Contenido.setBackground(new java.awt.Color(245, 245, 240));

        javax.swing.GroupLayout ContenidoLayout = new javax.swing.GroupLayout(Contenido);
        Contenido.setLayout(ContenidoLayout);
        ContenidoLayout.setHorizontalGroup(
            ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ContenidoLayout.setVerticalGroup(
            ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(288, 288, 288)
                .addComponent(Subtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(269, 269, 269)
                .addComponent(Menssage, javax.swing.GroupLayout.DEFAULT_SIZE, 839, Short.MAX_VALUE))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(Subtitulo))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(Menssage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addComponent(Contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

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

    private void PrincipalBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrincipalBTNActionPerformed
        ShowJPanel(new PrincipalAdministrador());
    }//GEN-LAST:event_PrincipalBTNActionPerformed

    private void EstadisticaBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstadisticaBTNActionPerformed
        ShowJPanel(new EstadisticaPanel());
    }//GEN-LAST:event_EstadisticaBTNActionPerformed

    private void SalirBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirBTNActionPerformed
    }//GEN-LAST:event_SalirBTNActionPerformed

    private void UsuarioBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioBTNActionPerformed
    }//GEN-LAST:event_UsuarioBTNActionPerformed

    private void PerfilBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PerfilBTNActionPerformed
        ShowJPanel(new PerfilPanel());

    }//GEN-LAST:event_PerfilBTNActionPerformed

    private void ReportesBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportesBTNActionPerformed
        ShowJPanel(new ReportesPanel());
    }//GEN-LAST:event_ReportesBTNActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JLabel Bienvenida;
    private javax.swing.JPanel Contenido;
    private javax.swing.JButton EstadisticaBTN;
    private javax.swing.JPanel Menssage;
    private javax.swing.JPanel Menu;
    private javax.swing.JButton PerfilBTN;
    private javax.swing.JButton PrincipalBTN;
    private javax.swing.JButton ReportesBTN;
    private javax.swing.JButton SalirBTN;
    private javax.swing.JLabel Subtitulo;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton UsuarioBTN;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel tiempo;
    // End of variables declaration//GEN-END:variables
}
