/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package mt.mentalistFrontend.UI.Paneles.PanelMedico.Paciente;

import java.awt.Color;
import javax.swing.JOptionPane;


public class BuscarPacientePanel extends javax.swing.JPanel {


    public BuscarPacientePanel() {
        initComponents();
        initStyles();
    }

    private void initStyles() {
        Titulo.putClientProperty("FlatLaf.style", "font: 18 $h4.font");
        Titulo.setForeground(new Color(55, 71, 79));

        TituloIDRE.putClientProperty("FlatLaf.style", "font: 14 $h4.font");
        TituloIDRE.setForeground(new Color(55, 71, 79));
        TipoDocu.putClientProperty("FlatLaf.style", "font: 14 $h4.font");
        TipoDocu.setForeground(new Color(55, 71, 79));
        Direccion.putClientProperty("FlatLaf.style", "font: 14 $h4.font");
        Direccion.setForeground(new Color(55, 71, 79));
        Telefono.putClientProperty("FlatLaf.style", "font: 14 $h4.font");
        Telefono.setForeground(new Color(55, 71, 79));
        Correo.putClientProperty("FlatLaf.style", "font: 14 $h4.font");
        Correo.setForeground(new Color(55, 71, 79));
        Nombre.putClientProperty("FlatLaf.style", "font: 14 $h4.font");
        Nombre.setForeground(new Color(55, 71, 79));
        Fecha.putClientProperty("FlatLaf.style", "font: 14 $h4.font");
        Fecha.setForeground(new Color(55, 71, 79));
        Edad.putClientProperty("FlatLaf.style", "font: 14 $h4.font");
        Edad.setForeground(new Color(55, 71, 79));
        Nacion.putClientProperty("FlatLaf.style", "font: 14 $h4.font");
        Nacion.setForeground(new Color(55, 71, 79));
        GeneroTitulo.putClientProperty("FlatLaf.style", "font: 14 $h4.font");
        GeneroTitulo.setForeground(new Color(55, 71, 79));

        SetIDPaciente.putClientProperty("FlatLaf.style", "font: 11 $h4.font");
        SetIDPaciente.setForeground(Color.BLACK);
        SetTipo.putClientProperty("FlatLaf.style", "font: 11 $h4.font");
        SetTipo.setForeground(Color.BLACK);
        SetDireccion.putClientProperty("FlatLaf.style", "font: 11 $h4.font");
        SetDireccion.setForeground(Color.BLACK);
        SetTelefono.putClientProperty("FlatLaf.style", "font: 11 $h4.font");
        SetTelefono.setForeground(Color.BLACK);
        SetCorreo.putClientProperty("FlatLaf.style", "font: 11 $h4.font");
        SetCorreo.setForeground(Color.BLACK);
        SetNombre.putClientProperty("FlatLaf.style", "font: 11 $h4.font");
        SetNombre.setForeground(Color.BLACK);
        SetEdad.putClientProperty("FlatLaf.style", "font: 11 $h4.font");
        SetEdad.setForeground(Color.BLACK);
        setNacionalidad.putClientProperty("FlatLaf.style", "font: 11 $h4.font");
        setNacionalidad.setForeground(Color.BLACK);
        SetGenero.putClientProperty("FlatLaf.style", "font: 11 $h4.font");
        SetGenero.setForeground(Color.BLACK);
        SetFecha.putClientProperty("FlatLaf.style", "font: 11 $h4.font");
        SetFecha.setForeground(Color.BLACK);

        BuscarBTN.putClientProperty("FlatLaf.style", "font: 11 $h4.font");
        BuscarBTN.setForeground(Color.white);
        EditarBTN.putClientProperty("FlatLaf.style", "font: 11 $h4.font");
        EditarBTN.setForeground(Color.white);
        EliminarBTN.putClientProperty("FlatLaf.style", "font: 11 $h4.font");
        EliminarBTN.setForeground(Color.white);
        CasosBTN.putClientProperty("FlatLaf.style", "font: 11 $h4.font");
        CasosBTN.setForeground(Color.white);
        ClinicaBTN.putClientProperty("FlatLaf.style", "font: 11 $h4.font");
        ClinicaBTN.setForeground(Color.white);
        ConsultasBTN.putClientProperty("FlatLaf.style", "font: 11 $h4.font");
        ConsultasBTN.setForeground(Color.white);
        guardarBTN.putClientProperty("FlatLaf.style", "font: 11 $h4.font");
        guardarBTN.setForeground(Color.white);
    }

    private void buscador() {
//        if (pacienteServicio == null) {
//            mostrarMensaje("No se ha inicializado el servicio");
//            return;
//        }
//        var campoId = SetIDPaciente.getText().trim();
//
//        if (campoId.isEmpty()) {
//            mostrarMensaje("Ingrese un numero de identificacion valido.");
//            return;
//        }
//
//        int idPaciente;
//        try {
//            idPaciente = Integer.parseInt(campoId);
//        } catch (NumberFormatException e) {
//            mostrarMensaje("El número de identificación debe ser numérico");
//            return;
//        }
//        Paciente paciente = this.pacienteServicio.buscarPacientesId(idPaciente);
//
//        if (paciente == null) {
//            mostrarMensaje("No se encontró un paciente con ese número de identificacion.");
//            return;
//        }
//        String fecha="";
//        try {
//            DateTimeFormatter formatoFecha= DateTimeFormatter.ofPattern("dd/MM/yyyy");
//            fecha= paciente.getFechaNacimiento().format(formatoFecha);
//        } catch (Exception e) {
//            mostrarMensaje("Error en el formato de la fecha de nacimiento");
//        }
//
//        SetNombre.setText(paciente.getNombreCompleto());
//        SetFecha.setText(fecha);
//        SetEdad.setText(String.valueOf(paciente.getEdad()));
//        setNacionalidad.setSelectedItem(paciente.getNacionalidad().toString());
//        SetGenero.setSelectedItem(paciente.getGenero().toString());
//        SetTipo.setSelectedItem(paciente.getTipoDocumento().toString());
//        SetDireccion.setText(paciente.getDireccion());
//        SetTelefono.setText(paciente.getTelefono());
//        SetCorreo.setText(paciente.getCorreo());
    }

    private void eliminar() {
//        if (pacienteServicio == null) {
//            mostrarMensaje("No se ha inicializado el servicio");
//            return;
//        }
//        var campoId = SetIDPaciente.getText().trim();
//
//        if (campoId.isEmpty()) {
//            mostrarMensaje("Ingrese un numero de identificacion valido.");
//            return;
//        }
//        int idPaciente;
//        try {
//            idPaciente = Integer.parseInt(campoId);
//        } catch (NumberFormatException e) {
//            mostrarMensaje("El número de identificación debe ser numérico.");
//            return;
//        }
//        int confirmar = JOptionPane.showConfirmDialog(
//                null,
//                "¿Esta seguro de eliminar el paciente con el ID: " + idPaciente + " ?",
//                "Confirma eliminación.",
//                JOptionPane.YES_NO_OPTION);
//        if (confirmar != JOptionPane.YES_OPTION) {
//            mostrarMensaje("Operacion cancelada.");
//            return;
//        }
//        Paciente paciente = pacienteServicio.buscarPacientesId(idPaciente);
//
//        if (paciente == null) {
//            mostrarMensaje("No se encontro un paciente con ese ID.");
//        }
//
//        pacienteServicio.eliminarPaciente(idPaciente);
//        mostrarMensaje("El paciente con ID:  " + idPaciente + " fue eliminado de los registros");
//        limpiar();
//        deshabilitar();
//
    }

    private void actulizar() {
//        Map<JTextField, String> campos = new LinkedHashMap<>();
//        campos.put(SetNombre, "Proporciona el nombre");
//        campos.put(SetFecha, "Proporciona la fecha");
//        campos.put(SetEdad, "Proporciona la edad");
//        campos.put(SetIDPaciente, "Proporciona el numero de identificacion");
//        campos.put(SetTelefono, "Proporciona el telefono");
//        campos.put(SetCorreo, "Proporciona el correo electronico");
//        campos.put(SetDireccion, "Proporciona la direccion");
//
//        Map<JComboBox<?>, String> comboCampos = new LinkedHashMap<>();
//        comboCampos.put(SetGenero, "Selecciona un genero");
//        comboCampos.put(SetTipo, "Selecciona el tipo de documento");
//        comboCampos.put(setNacionalidad, "Selecciona la nacionalidad");
//
//        campos.forEach((campo, mensaje) -> {
//            if (campo.getText().trim().isEmpty()) {
//                mostrarMensaje(mensaje);
//                campo.requestFocusInWindow();
//                throw new RuntimeException();
//            }
//        });
//        comboCampos.forEach((campo, mensaje) -> {
//            if (campo.getSelectedItem() == null) {
//                mostrarMensaje(mensaje);
//                campo.requestFocusInWindow();
//                throw new RuntimeException();
//            }
//        });
//
//        Integer numeroIdentidad;
//        try {
//            numeroIdentidad = Integer.parseInt(SetIDPaciente.getText().trim());
//        } catch (NumberFormatException e) {
//            mostrarMensaje("El número de identificación debe ser un valor numérico.");
//            SetIDPaciente.requestFocusInWindow();
//            return;
//        }
//
//        var nombre = SetNombre.getText();
//        var edadTxt = Integer.parseInt(SetEdad.getText());
//
//        // Validar y convertir edad
//        int edad;
//        try {
//            edad = Integer.parseInt(SetEdad.getText().trim());
//        } catch (NumberFormatException e) {
//            mostrarMensaje("La edad debe ser un valor numérico.");
//            SetEdad.requestFocusInWindow();
//            return;
//        }
//        var nacionalidad = setNacionalidad.getSelectedItem().toString().trim();
//        var telefono = SetTelefono.getText();
//        var correo = SetCorreo.getText();
//        var direccion = SetDireccion.getText();
//
//        var tipo = SetTipo.getSelectedItem().toString().trim();
//
//          TipoDocumento tipoDocumento;
//          try {
//            tipoDocumento = TipoDocumento.valueOf(SetTipo.getSelectedItem().toString());
//        } catch (IllegalArgumentException e) {
//              mostrarMensaje("Tipo de documento invalido");
//              return;
//        }
//
//        var generoTxt = SetGenero.getSelectedItem().toString().trim();
//        //Validar el genero
//        Genero genero;
//        try {
//            genero = Genero.valueOf(generoTxt);
//        } catch (IllegalArgumentException e) {
//            mostrarMensaje("Tipo de documento invalido");
//            return;
//        }
//
//        //Validar fecha de nacimiento
//        var fecha = SetFecha.getText().trim();
//        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        LocalDate fechaNacimiento;
//        try {
//            fechaNacimiento = LocalDate.parse(fecha, formato);
//        } catch (Exception e) {
//            mostrarMensaje("Formato de fecha inválido.");
//            return;
//        }
//
//        Paciente paciente = Paciente.builder()
//                .idPaciente(numeroIdentidad)
//                .tipoDocumento(tipoDocumento)
//                .nombreCompleto(nombre)
//                .fechaNacimiento(fechaNacimiento)
//                .edad(edad)
//                .genero(genero)
//                .nacionalidad(nacionalidad)
//                .telefono(telefono)
//                .correo(correo)
//                .direccion(direccion)
//                .build();
//
//        this.pacienteServicio.guardarPaciente(paciente);
//
//        mostrarMensaje("Los datos del paciente se actualizaron exitosamenten.");
//        limpiar();
//        deshabilitar();
    }

    private void limpiar() {
        SetNombre.setText("");
        SetFecha.setText("");
        SetEdad.setText("");
        setNacionalidad.setSelectedIndex(0);
        SetIDPaciente.setText("");
        SetTelefono.setText("");
        SetCorreo.setText("");
        SetDireccion.setText("");
        SetGenero.setSelectedIndex(0);
        SetTipo.setSelectedIndex(0);
    }

    private void editar() {
        SetNombre.setEditable(true);
        SetFecha.setEditable(true);
        SetEdad.setEditable(true);
        SetTelefono.setEditable(true);
        SetCorreo.setEditable(true);
        SetDireccion.setEditable(true);

        SetGenero.setEnabled(true);
        SetTipo.setEnabled(true);
        setNacionalidad.setEnabled(true);
        guardarBTN.setEnabled(true);
        EliminarBTN.setEnabled(true);
    }

    private void deshabilitar() {
        SetNombre.setEditable(false);
        SetFecha.setEditable(false);
        SetEdad.setEditable(false);
        SetTelefono.setEditable(false);
        SetCorreo.setEditable(false);
        SetDireccion.setEditable(false);

        SetGenero.setEnabled(false);
        SetTipo.setEnabled(false);
        setNacionalidad.setEnabled(false);
        guardarBTN.setEnabled(false);
        EliminarBTN.setEnabled(false);
    }

    private void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bg = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        Titulo = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        TituloIDRE = new javax.swing.JLabel();
        SetIDPaciente = new javax.swing.JTextField();
        BuscarBTN = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        Nombre = new javax.swing.JLabel();
        SetNombre = new javax.swing.JTextField();
        Fecha = new javax.swing.JLabel();
        SetFecha = new javax.swing.JTextField();
        GeneroTitulo = new javax.swing.JLabel();
        SetGenero = new javax.swing.JComboBox<>();
        Nacion = new javax.swing.JLabel();
        Edad = new javax.swing.JLabel();
        SetEdad = new javax.swing.JTextField();
        setNacionalidad = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        TipoDocu = new javax.swing.JLabel();
        SetTipo = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        Direccion = new javax.swing.JLabel();
        Telefono = new javax.swing.JLabel();
        SetDireccion = new javax.swing.JTextField();
        SetTelefono = new javax.swing.JTextField();
        Correo = new javax.swing.JLabel();
        SetCorreo = new javax.swing.JTextField();
        ConsultasBTN = new javax.swing.JButton();
        EditarBTN = new javax.swing.JButton();
        EliminarBTN = new javax.swing.JButton();
        guardarBTN = new javax.swing.JButton();
        CasosBTN = new javax.swing.JButton();
        ClinicaBTN = new javax.swing.JButton();

        Bg.setBackground(new java.awt.Color(245, 245, 240));

        jSeparator1.setBackground(new java.awt.Color(27, 203, 209));
        jSeparator1.setForeground(new java.awt.Color(27, 203, 209));

        Titulo.setText("Motor de Busqueda de Pacientes - Mentalist");

        jPanel9.setBackground(new java.awt.Color(245, 245, 240));
        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel9.setPreferredSize(new java.awt.Dimension(282, 62));

        TituloIDRE.setText("ID del Paciente");

        SetIDPaciente.setBackground(new java.awt.Color(188, 234, 255));
        SetIDPaciente.setForeground(new java.awt.Color(204, 204, 204));
        SetIDPaciente.setBorder(null);

        BuscarBTN.setBackground(new java.awt.Color(17, 129, 133));
        BuscarBTN.setText("Buscar");
        BuscarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(TituloIDRE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(163, 163, 163))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(SetIDPaciente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BuscarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TituloIDRE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SetIDPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BuscarBTN))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(245, 245, 240));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Nombre.setText("Nombre completo");

        SetNombre.setEditable(false);
        SetNombre.setBackground(new java.awt.Color(188, 234, 255));
        SetNombre.setBorder(null);

        Fecha.setText("Fecha de nacimiento");

        SetFecha.setEditable(false);
        SetFecha.setBackground(new java.awt.Color(188, 234, 255));
        SetFecha.setBorder(null);

        GeneroTitulo.setText("Genero");

        SetGenero.setBackground(new java.awt.Color(188, 234, 255));
        SetGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));

        Nacion.setText("Nacionalidad");

        Edad.setText("Edad");

        SetEdad.setEditable(false);
        SetEdad.setBackground(new java.awt.Color(188, 234, 255));
        SetEdad.setBorder(null);

        setNacionalidad.setBackground(new java.awt.Color(188, 234, 255));
        setNacionalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Colombia", "Venezuela", "Ecuador", "Perú", "Brasil", "Panamá", "Argentina", "México", "Chile", "Bolivia", "Paraguay", "Uruguay", "Honduras", "Guatemala", "El Salvador", "Nicaragua", "Cuba", "República Dominicana", "Haití", "Estados Unidos", "Canadá", "España", "Francia", "Alemania", "Reino Unido", "Italia", "Países Bajos", "Suiza", "Australia", "China", "India", "Japón", "Corea del Sur", "Israel", "Marruecos", "Nigeria" }));
        setNacionalidad.setToolTipText("");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Edad, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                        .addGap(184, 184, 184))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SetNombre)
                            .addComponent(Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(GeneroTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(3, 3, 3))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(SetGenero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(3, 3, 3))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SetFecha)
                                    .addComponent(Fecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Nacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(SetEdad)
                                    .addComponent(setNacionalidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(1, 1, 1)))
                        .addGap(34, 34, 34))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(Nombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SetNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Fecha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SetFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(Edad, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SetEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Nacion, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(setNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(GeneroTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SetGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(245, 245, 240));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TipoDocu.setText("Tipo de Documento");

        SetTipo.setBackground(new java.awt.Color(188, 234, 255));
        SetTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CC", "TI", "CE", "PAS" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(TipoDocu, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addGap(88, 88, 88))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(SetTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(63, 63, 63))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TipoDocu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SetTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(245, 245, 240));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Direccion.setText("Direccion");

        Telefono.setText("Telefono");

        SetDireccion.setEditable(false);
        SetDireccion.setBackground(new java.awt.Color(188, 234, 255));
        SetDireccion.setBorder(null);

        SetTelefono.setEditable(false);
        SetTelefono.setBackground(new java.awt.Color(188, 234, 255));
        SetTelefono.setBorder(null);

        Correo.setText("Correo");

        SetCorreo.setEditable(false);
        SetCorreo.setBackground(new java.awt.Color(188, 234, 255));
        SetCorreo.setBorder(null);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(Correo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(144, 144, 144))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(Direccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(35, 35, 35))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(SetDireccion)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(Telefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(21, 21, 21))
                                    .addComponent(SetTelefono)))
                            .addComponent(SetCorreo))
                        .addGap(17, 17, 17))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Direccion)
                    .addComponent(Telefono))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SetDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SetTelefono))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Correo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SetCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ConsultasBTN.setBackground(new java.awt.Color(17, 129, 133));
        ConsultasBTN.setText("Historial Consultas");

        EditarBTN.setBackground(new java.awt.Color(17, 129, 133));
        EditarBTN.setText("Editar");
        EditarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarBTNActionPerformed(evt);
            }
        });

        EliminarBTN.setBackground(new java.awt.Color(17, 129, 133));
        EliminarBTN.setText("Eliminar");
        EliminarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarBTNActionPerformed(evt);
            }
        });

        guardarBTN.setBackground(new java.awt.Color(17, 129, 133));
        guardarBTN.setText("Guardar");
        guardarBTN.setEnabled(false);
        guardarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarBTNActionPerformed(evt);
            }
        });

        CasosBTN.setBackground(new java.awt.Color(17, 129, 133));
        CasosBTN.setText("Casos");

        ClinicaBTN.setBackground(new java.awt.Color(17, 129, 133));
        ClinicaBTN.setText("Historia Clinica");

        javax.swing.GroupLayout BgLayout = new javax.swing.GroupLayout(Bg);
        Bg.setLayout(BgLayout);
        BgLayout.setHorizontalGroup(
            BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BgLayout.createSequentialGroup()
                .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BgLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guardarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EditarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(EliminarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1))
                    .addGroup(BgLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BgLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jSeparator1))
                            .addGroup(BgLayout.createSequentialGroup()
                                .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(BgLayout.createSequentialGroup()
                                        .addComponent(CasosBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                                        .addComponent(ClinicaBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(102, 102, 102)
                                        .addComponent(ConsultasBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(BgLayout.createSequentialGroup()
                                        .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(7, 7, 7)))))
                .addGap(35, 35, 35))
        );
        BgLayout.setVerticalGroup(
            BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BgLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BgLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(Titulo))
                    .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(EliminarBTN)
                        .addComponent(EditarBTN)
                        .addComponent(guardarBTN)))
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(BgLayout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CasosBTN)
                    .addComponent(ClinicaBTN)
                    .addComponent(ConsultasBTN))
                .addGap(14, 14, 14))
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

    private void guardarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarBTNActionPerformed
        actulizar();
    }//GEN-LAST:event_guardarBTNActionPerformed

    private void EditarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarBTNActionPerformed
        editar();
    }//GEN-LAST:event_EditarBTNActionPerformed

    private void EliminarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarBTNActionPerformed
        eliminar();
    }//GEN-LAST:event_EliminarBTNActionPerformed

    private void BuscarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarBTNActionPerformed
        buscador();
    }//GEN-LAST:event_BuscarBTNActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Bg;
    private javax.swing.JButton BuscarBTN;
    private javax.swing.JButton CasosBTN;
    private javax.swing.JButton ClinicaBTN;
    private javax.swing.JButton ConsultasBTN;
    private javax.swing.JLabel Correo;
    private javax.swing.JLabel Direccion;
    private javax.swing.JLabel Edad;
    private javax.swing.JButton EditarBTN;
    private javax.swing.JButton EliminarBTN;
    private javax.swing.JLabel Fecha;
    private javax.swing.JLabel GeneroTitulo;
    private javax.swing.JLabel Nacion;
    private javax.swing.JLabel Nombre;
    private javax.swing.JTextField SetCorreo;
    private javax.swing.JTextField SetDireccion;
    private javax.swing.JTextField SetEdad;
    private javax.swing.JTextField SetFecha;
    private javax.swing.JComboBox<String> SetGenero;
    private javax.swing.JTextField SetIDPaciente;
    private javax.swing.JTextField SetNombre;
    private javax.swing.JTextField SetTelefono;
    private javax.swing.JComboBox<String> SetTipo;
    private javax.swing.JLabel Telefono;
    private javax.swing.JLabel TipoDocu;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel TituloIDRE;
    private javax.swing.JButton guardarBTN;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> setNacionalidad;
    // End of variables declaration//GEN-END:variables

}
