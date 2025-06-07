package mt.mentalistFrontend.UI.Paneles.PanelMedico.Caso;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import mt.mentalistFrontend.UI.Paneles.PanelMedico.Paciente.DatoPacientePanel;

public class InfoPaciente extends javax.swing.JPanel {
     
    public InfoPaciente() {
        initComponents();
        initStyles();
    }

    private void initStyles() {
        Titulo.putClientProperty("FlatLaf.style", "font: 18 bold $h2.font");
        Titulo.setForeground(new Color(55, 71, 79));
        TItuloNB.putClientProperty("FlatLaf.style", "font: 14 bold $h2.font");
        TItuloNB.setForeground(new Color(55, 71, 79));
        TituloAO.putClientProperty("FlatLaf.style", "font: 14 bold $h2.font");
        TituloAO.setForeground(new Color(55, 71, 79));
        TituloCV.putClientProperty("FlatLaf.style", "font: 14 bold $h2.font");
        TituloCV.setForeground(new Color(55, 71, 79));
        TituloFN.putClientProperty("FlatLaf.style", "font: 14 bold $h2.font");
        TituloFN.setForeground(new Color(55, 71, 79));
        TituloGN.putClientProperty("FlatLaf.style", "font: 14 bold $h2.font");
        TituloGN.setForeground(new Color(55, 71, 79));
        TituloRA.putClientProperty("FlatLaf.style", "font: 14 bold $h2.font");
        TituloRA.setForeground(new Color(55, 71, 79));

        SetArea.putClientProperty("FlatLaf.style", "font: 11 $h4.font");
        SetArea.setForeground(Color.BLACK);
        SetEtapa.putClientProperty("FlatLaf.style", "font: 11 $h4.font");
        SetEtapa.setForeground(Color.BLACK);
        SetFecha.putClientProperty("FlatLaf.style", "font: 11 $h4.font");
        SetFecha.setForeground(Color.BLACK);
        SetGenero.putClientProperty("FlatLaf.style", "font: 11 $h4.font");
        SetGenero.setForeground(Color.BLACK);
        SetIDPaciente.putClientProperty("FlatLaf.style", "font: 11 $h4.font");
        SetIDPaciente.setForeground(Color.BLACK);
        SetNombre.putClientProperty("FlatLaf.style", "font: 11 $h4.font");
        SetNombre.setForeground(Color.BLACK);
        SetRuta.putClientProperty("FlatLaf.style", "font: 11 $h4.font");
        SetRuta.setForeground(Color.BLACK);

        GuardarBTN.putClientProperty("FlatLaf.style", "font: 13 $h4.font");
        GuardarBTN.setForeground(Color.white);
        BuscarBTN.putClientProperty("FlatLaf.style", "font: 13 $h4.font");
        BuscarBTN.setForeground(Color.white);
        LimpiarBTN.putClientProperty("FlatLaf.style", "font: 13 $h4.font");
        LimpiarBTN.setForeground(Color.white);
        NuevoBTN.putClientProperty("FlatLaf.style", "font: 13 $h4.font");
        NuevoBTN.setForeground(Color.white);
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bg = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        SetIDPaciente = new javax.swing.JTextField();
        BuscarBTN = new javax.swing.JButton();
        NuevoBTN = new javax.swing.JButton();
        TItuloNB = new javax.swing.JLabel();
        TituloFN = new javax.swing.JLabel();
        TituloGN = new javax.swing.JLabel();
        SetNombre = new javax.swing.JTextField();
        SetFecha = new javax.swing.JTextField();
        SetGenero = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        LimpiarBTN = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        SetArea = new javax.swing.JTextField();
        TituloAO = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        SetRuta = new javax.swing.JTextField();
        TituloRA = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        TituloCV = new javax.swing.JLabel();
        SetEtapa = new javax.swing.JComboBox<>();
        GuardarBTN = new javax.swing.JButton();

        Bg.setBackground(new java.awt.Color(245, 245, 240));

        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Información del Paciente");

        jSeparator1.setBackground(new java.awt.Color(27, 203, 209));
        jSeparator1.setForeground(new java.awt.Color(27, 203, 209));

        jPanel3.setBackground(new java.awt.Color(245, 245, 240));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        SetIDPaciente.setBackground(new java.awt.Color(188, 234, 255));
        SetIDPaciente.setBorder(null);

        BuscarBTN.setBackground(new java.awt.Color(17, 129, 133));
        BuscarBTN.setText("Buscar");
        BuscarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarBTNActionPerformed(evt);
            }
        });

        NuevoBTN.setBackground(new java.awt.Color(0, 123, 255));
        NuevoBTN.setText("Nuevo");
        NuevoBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoBTNActionPerformed(evt);
            }
        });

        TItuloNB.setText("Nombre completo");

        TituloFN.setText("Fecha de nacimiento");

        TituloGN.setText("Genero");

        SetNombre.setEditable(false);
        SetNombre.setBackground(new java.awt.Color(188, 234, 255));
        SetNombre.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        SetNombre.setBorder(null);

        SetFecha.setEditable(false);
        SetFecha.setBackground(new java.awt.Color(188, 234, 255));
        SetFecha.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        SetFecha.setBorder(null);

        SetGenero.setEditable(false);
        SetGenero.setBackground(new java.awt.Color(188, 234, 255));
        SetGenero.setBorder(null);

        jLabel2.setText("1. Paciente");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(NuevoBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(SetIDPaciente)
                        .addGap(18, 18, 18)
                        .addComponent(BuscarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SetFecha, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SetNombre)
                            .addComponent(TituloFN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TItuloNB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TituloGN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SetGenero))
                        .addGap(12, 12, 12)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SetIDPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BuscarBTN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NuevoBTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TItuloNB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SetNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TituloFN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SetFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TituloGN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SetGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        LimpiarBTN.setBackground(new java.awt.Color(255, 193, 7));
        LimpiarBTN.setText("Limpiar");
        LimpiarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarBTNActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(245, 245, 240));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        SetArea.setBackground(new java.awt.Color(188, 234, 255));
        SetArea.setBorder(null);

        TituloAO.setText("2. Area de Ocurrencia");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TituloAO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(SetArea, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TituloAO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SetArea, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(245, 245, 240));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        SetRuta.setBackground(new java.awt.Color(188, 234, 255));
        SetRuta.setBorder(null);

        TituloRA.setText("3. Ruta de Atención");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TituloRA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(SetRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TituloRA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SetRuta, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(245, 245, 240));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TituloCV.setText("4. Curso de Vida");

        SetEtapa.setBackground(new java.awt.Color(188, 234, 255));
        SetEtapa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Primera_Infancia", "Infancia", "Adolescencia", "Juventud", "Adultez", "Vejez" }));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TituloCV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(SetEtapa, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TituloCV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SetEtapa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GuardarBTN.setBackground(new java.awt.Color(40, 167, 69));
        GuardarBTN.setText("Guardar");
        GuardarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BgLayout = new javax.swing.GroupLayout(Bg);
        Bg.setLayout(BgLayout);
        BgLayout.setHorizontalGroup(
            BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BgLayout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(332, 332, 332))
            .addGroup(BgLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jSeparator1)
                .addGap(30, 30, 30))
            .addGroup(BgLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BgLayout.createSequentialGroup()
                        .addComponent(LimpiarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(GuardarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BgLayout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(47, 47, 47))
        );
        BgLayout.setVerticalGroup(
            BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BgLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(Titulo)
                .addGap(14, 14, 14)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BgLayout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LimpiarBTN)
                    .addComponent(GuardarBTN))
                .addGap(20, 20, 20))
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
        /*try {
            int idPaciente = Integer.parseInt(SetIDPaciente.getText().trim());

            // Buscar al paciente en la base de datos
            Paciente paciente = pacienteServicio.buscarPacientesId(idPaciente);

            if (paciente != null) {
                // Mostrar los datos en la interfaz
                SetNombre.setText(paciente.getNombreCompleto());
                SetFecha.setText(paciente.getFechaNacimiento().toString());
                SetGenero.setText((paciente.getGenero() != null) ? paciente.getGenero().name() : "No definido");

                JOptionPane.showMessageDialog(null, "Paciente encontrado.");
            } else {
                JOptionPane.showMessageDialog(null, "Paciente no encontrado.");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Ingrese un número válido para el ID del paciente.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos.");}*/


    }//GEN-LAST:event_BuscarBTNActionPerformed

    private void GuardarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarBTNActionPerformed

        ShowJPanel(new DiagnósticoEspecíficoPanel());

        /*  try {
            // Validar que los campos no estén vacíos
            if (SetArea.getText().trim().isEmpty()
                    || SetRuta.getText().trim().isEmpty()
                    || SetEtapa.getSelectedItem() == null
                    || SetEtapa.getSelectedItem().toString().trim().isEmpty()) {

                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios.");
                return;
            }

            // Obtener los valores ingresados
            String areaOcurrencia = SetArea.getText().trim();
            String rutaAtencion = SetRuta.getText().trim();
            String cursoVida = SetEtapa.getSelectedItem().toString().trim();

            // Validar si existe un ID de paciente para la relación
            if (SetIDPaciente.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un ID de paciente válido.");
                return;
            }

            int idPaciente = Integer.parseInt(SetIDPaciente.getText().trim());

            // Buscar el paciente en la base de datos
            Paciente paciente = pacienteServicio.buscarPacientesId(idPaciente);

            if (paciente == null) {
                JOptionPane.showMessageDialog(null, "El paciente no existe en la base de datos.");
                return;
            }

            // Crear instancias de las entidades correspondientes y asignarlas al caso
            AreaOcurrencia area = new AreaOcurrencia();
            area.setNombre(areaOcurrencia);
            area.setNombre(areaOcurrencia);

            RutaAtencion ruta = new RutaAtencion();
            ruta.setDescripcion(rutaAtencion);
            ruta.setDescripcion(rutaAtencion);

            CursoVida curso = new CursoVida();
            curso.setEtapa(Etapa.valueOf(cursoVida.toUpperCase()));

            // Guardar en la base de datos a través de sus servicios
            areaServicio.guardarAreaOcurrencia(area);
            rutaServicio.guardarRuta(ruta);
            cursoServicio.guardarCursoVida(curso);

            // Mensaje de confirmación
            JOptionPane.showMessageDialog(null, "Datos guardados correctamente.");

            // Abir el panel de Diagnostico Espefico */
 /* } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Error: El ID debe ser un número válido.");
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar los datos: " + ex.getMessage()); }*/

    }//GEN-LAST:event_GuardarBTNActionPerformed

    private void NuevoBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoBTNActionPerformed
        ShowJPanel(new DatoPacientePanel());

    }//GEN-LAST:event_NuevoBTNActionPerformed

    private void LimpiarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarBTNActionPerformed
// Limpiar los campos de texto
        SetIDPaciente.setText("");
        SetNombre.setText("");
        SetFecha.setText("");
        SetGenero.setText("");
        SetArea.setText("");
        SetRuta.setText("");

        // Restablecer la selección del ComboBox
        SetEtapa.setSelectedIndex(0);

        // Mensaje de confirmación
        JOptionPane.showMessageDialog(null, "Los campos han sido limpiados.");
    }//GEN-LAST:event_LimpiarBTNActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Bg;
    private javax.swing.JButton BuscarBTN;
    private javax.swing.JButton GuardarBTN;
    private javax.swing.JButton LimpiarBTN;
    private javax.swing.JButton NuevoBTN;
    private javax.swing.JTextField SetArea;
    private javax.swing.JComboBox<String> SetEtapa;
    private javax.swing.JTextField SetFecha;
    private javax.swing.JTextField SetGenero;
    private javax.swing.JTextField SetIDPaciente;
    private javax.swing.JTextField SetNombre;
    private javax.swing.JTextField SetRuta;
    private javax.swing.JLabel TItuloNB;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel TituloAO;
    private javax.swing.JLabel TituloCV;
    private javax.swing.JLabel TituloFN;
    private javax.swing.JLabel TituloGN;
    private javax.swing.JLabel TituloRA;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
