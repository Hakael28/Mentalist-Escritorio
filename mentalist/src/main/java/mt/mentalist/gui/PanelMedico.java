package mt.mentalist.gui;

import mt.mentalist.gui.vizualizar.PerfilPanel;
import mt.mentalist.gui.vizualizar.ReportePanel;
import mt.mentalist.gui.vizualizar.PanelMedico.PacientePanel;
import mt.mentalist.gui.vizualizar.PanelMedico.CasoPanel;
import mt.mentalist.gui.vizualizar.PanelMedico.PrincipalMedico;
import java.awt.BorderLayout;


import java.awt.Color;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import javax.swing.JPanel;

public class PanelMedico extends javax.swing.JFrame {


    public PanelMedico() {
        initComponents();
        initStyles();
        setDate();
        initContent();
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
        CasoBTN.putClientProperty("FlatLaf.style", "font: 18 $h4.font");
        CasoBTN.setForeground(Color.white);
        PacienteBTN.putClientProperty("FlatLaf.style", "font: 18 $h4.font");
        PacienteBTN.setForeground(Color.white);
        PerfilBTN.putClientProperty("FlatLaf.style", "font: 18 $h4.font");
        PerfilBTN.setForeground(Color.white);
        ReporteBTN.putClientProperty("FlatLaf.style", "font: 18 $h4.font");
        ReporteBTN.setForeground(Color.white);
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
        ShowJPanel(new PrincipalMedico());
    }

    private void ShowJPanel(JPanel p) {
        p.setSize(750, 400);
        p.setLocation(0, 0);

        Contenido.removeAll();
        Contenido.setLayout(new BorderLayout());
        Contenido.add(p, BorderLayout.CENTER);
        Contenido.revalidate();
        Contenido.repaint();
    };

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        PrincipalBTN = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        CasoBTN = new javax.swing.JButton();
        SalirBTN = new javax.swing.JButton();
        PacienteBTN = new javax.swing.JButton();
        PerfilBTN = new javax.swing.JButton();
        ReporteBTN = new javax.swing.JButton();
        Menssage = new javax.swing.JPanel();
        Bienvenida = new javax.swing.JLabel();
        tiempo = new javax.swing.JLabel();
        Subtitulo = new javax.swing.JLabel();
        Contenido = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(null);
        setName("frame"); // NOI18N

        Background.setBackground(new java.awt.Color(245, 245, 240));
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

        CasoBTN.setBackground(new java.awt.Color(17, 129, 133));
        CasoBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/caso.png"))); // NOI18N
        CasoBTN.setText("Caso");
        CasoBTN.setToolTipText("");
        CasoBTN.setBorder(null);
        CasoBTN.setBorderPainted(false);
        CasoBTN.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CasoBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CasoBTNActionPerformed(evt);
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

        PacienteBTN.setBackground(new java.awt.Color(17, 129, 133));
        PacienteBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/paciente.png"))); // NOI18N
        PacienteBTN.setText("Paciente");
        PacienteBTN.setBorder(null);
        PacienteBTN.setBorderPainted(false);
        PacienteBTN.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        PacienteBTN.setPreferredSize(new java.awt.Dimension(73, 24));
        PacienteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PacienteBTNActionPerformed(evt);
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

        ReporteBTN.setBackground(new java.awt.Color(17, 129, 133));
        ReporteBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reporte.png"))); // NOI18N
        ReporteBTN.setText("Reporte");
        ReporteBTN.setBorder(null);
        ReporteBTN.setBorderPainted(false);
        ReporteBTN.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ReporteBTN.setPreferredSize(new java.awt.Dimension(73, 24));
        ReporteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReporteBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ReporteBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PerfilBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PrincipalBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CasoBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(626, 626, 626))
            .addGroup(MenuLayout.createSequentialGroup()
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(SalirBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(MenuLayout.createSequentialGroup()
                .addComponent(PacienteBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(CasoBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PacienteBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(PerfilBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addComponent(ReporteBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenssageLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(MenssageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Bienvenida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tiempo, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE))
                .addGap(148, 148, 148))
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
                .addGap(269, 269, 269)
                .addComponent(Menssage, javax.swing.GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE))
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(276, 276, 276)
                .addComponent(Contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(288, 288, 288)
                .addComponent(Subtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(Menssage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(Subtitulo)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CasoBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CasoBTNActionPerformed
        ShowJPanel(new CasoPanel());
    }//GEN-LAST:event_CasoBTNActionPerformed

    private void SalirBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirBTNActionPerformed
    }//GEN-LAST:event_SalirBTNActionPerformed

    private void PrincipalBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrincipalBTNActionPerformed
        ShowJPanel(new PrincipalMedico());
    }//GEN-LAST:event_PrincipalBTNActionPerformed


    private void PerfilBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PerfilBTNActionPerformed
        ShowJPanel(new PerfilPanel());
    }//GEN-LAST:event_PerfilBTNActionPerformed

    private void ReporteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReporteBTNActionPerformed
        ShowJPanel(new ReportePanel());
    }//GEN-LAST:event_ReporteBTNActionPerformed

    private void PacienteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PacienteBTNActionPerformed
        ShowJPanel(new PacientePanel());
    }//GEN-LAST:event_PacienteBTNActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JLabel Bienvenida;
    private javax.swing.JButton CasoBTN;
    private javax.swing.JPanel Contenido;
    private javax.swing.JPanel Menssage;
    private javax.swing.JPanel Menu;
    private javax.swing.JButton PacienteBTN;
    private javax.swing.JButton PerfilBTN;
    private javax.swing.JButton PrincipalBTN;
    private javax.swing.JButton ReporteBTN;
    private javax.swing.JButton SalirBTN;
    private javax.swing.JLabel Subtitulo;
    private javax.swing.JLabel Titulo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel tiempo;
    // End of variables declaration//GEN-END:variables
}
