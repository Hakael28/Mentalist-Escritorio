package mt.mentalist.gui.vizualizar.PanelAdministrador;

import java.awt.Color;

public class PrincipalAdministrador extends javax.swing.JPanel {

    public PrincipalAdministrador() {
        initComponents();
         initStyles();
    }

    private void initStyles() {
        Titulo.putClientProperty("FlatLaf.style", "font: 18 $h4.font");
        Titulo.setForeground(new Color(55, 71, 79));
        comment.putClientProperty("FlatLaf.style", "font: 14 $h4.regular.font");
        comment.setForeground(Color.BLACK);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        comment = new javax.swing.JTextArea();

        setPreferredSize(new java.awt.Dimension(750, 400));

        jPanel1.setBackground(new java.awt.Color(245, 245, 240));

        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Bienvenido al Panel Administrativo de Mentalist ");

        jScrollPane1.setBorder(null);
        jScrollPane1.setToolTipText("");

        comment.setEditable(false);
        comment.setBackground(new java.awt.Color(245, 245, 240));
        comment.setColumns(20);
        comment.setLineWrap(true);
        comment.setRows(5);
        comment.setText("Nos complace darte la bienvenida al Panel Administrativo de Mentalist, una plataforma diseñada para optimizar la gestión de los servicios de salud mental de manera eficiente y segura.\n\nMentalist es una plataforma diseñada para que los administradores gestionen eficientemente las cuentas de los profesionales, asegurando que cada miembro del equipo tenga los permisos adecuados según sus responsabilidades; además, garantiza el cumplimiento de las leyes y regulaciones vigentes en materia de salud y protección de datos mediante la encriptacion de los datos sensibles; y ofrece herramientas para generar gráficos estadísticos que permiten evaluar y apoyar la toma de decisiones informadas.\n\nRecordatorio Importante: La confidencialidad y seguridad de la información de nuestros pacientes es nuestra máxima prioridad. Te solicitamos manejar todos los datos con el más alto nivel de ética y profesionalismo, cumpliendo con las normativas vigentes de protección de datos.\n\nAgradecemos tu compromiso en la gestión eficiente y segura de los servicios de salud mental. Si tienes alguna pregunta o necesitas asistencia, no dudes en ponerte en contacto con nuestro equipo de soporte.\n\nAtentamente,\n\nEl equipo de Mentalist");
        comment.setWrapStyleWord(true);
        comment.setBorder(null);
        jScrollPane1.setViewportView(comment);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(80, 80, 80))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(Titulo)
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private javax.swing.JTextArea comment;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
