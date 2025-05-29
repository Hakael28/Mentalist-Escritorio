package mt.mentalist.gui.vizualizar.PanelMedico;

import java.awt.Color;

public class PrincipalMedico extends javax.swing.JPanel {

    public PrincipalMedico() {
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

        Bg = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        comment = new javax.swing.JTextArea();

        setMinimumSize(new java.awt.Dimension(750, 400));
        setPreferredSize(new java.awt.Dimension(750, 400));

        Bg.setBackground(new java.awt.Color(245, 245, 240));
        Bg.setMinimumSize(new java.awt.Dimension(750, 400));

        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("¡Bienvenido al Panel Médico de Mentalist!  ");

        jScrollPane1.setBorder(null);
        jScrollPane1.setToolTipText("");

        comment.setEditable(false);
        comment.setBackground(new java.awt.Color(245, 245, 240));
        comment.setColumns(20);
        comment.setLineWrap(true);
        comment.setRows(5);
        comment.setText("Nos complace darte la bienvenida a Mentalist, un sistema diseñado para apoyar tu labor en la gestión de casos de salud mental de forma eficiente y segura.   \n\nAquí podrás gestionar información clínica detallada, realizar un seguimiento preciso de los casos y optimizar la toma de decisiones clínicas basadas en datos actualizados y confiables.   \n\nRecordatorio Importante: La confidencialidad y seguridad de la información de nuestros pacientes es nuestra máxima prioridad. Le solicitamos manejar todos los datos con el más alto nivel de ética y profesionalismo, cumpliendo con las normativas vigentes de protección de datos. \n\n¡Gracias por confiar en Mentalist para apoyar tu labor profesional!");
        comment.setWrapStyleWord(true);
        comment.setBorder(null);
        jScrollPane1.setViewportView(comment);

        javax.swing.GroupLayout BgLayout = new javax.swing.GroupLayout(Bg);
        Bg.setLayout(BgLayout);
        BgLayout.setHorizontalGroup(
            BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BgLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(BgLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE))
                    .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE))
                .addGap(153, 153, 153))
        );
        BgLayout.setVerticalGroup(
            BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BgLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                .addGap(74, 74, 74))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Bg;
    private javax.swing.JLabel Titulo;
    private javax.swing.JTextArea comment;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables


}
