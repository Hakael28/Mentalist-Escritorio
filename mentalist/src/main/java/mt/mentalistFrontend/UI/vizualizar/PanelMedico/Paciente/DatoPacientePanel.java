package mt.mentalistFrontend.UI.vizualizar.PanelMedico.Paciente;

import java.awt.Color;
import javax.swing.JOptionPane;


public class DatoPacientePanel extends javax.swing.JPanel {


    public DatoPacientePanel() {
        initComponents();
        initStyles();
        initPlaceHolders();
    }

    private void initStyles() {
        Titulo.putClientProperty("FlatLaf.style", "font: 25 $h4.font");
        Titulo.setForeground(new Color(55, 71, 79));
        TituloCU.putClientProperty("FlatLaf.style", "font: 14 $h4.font");
        TituloCU.setForeground(new Color(55, 71, 79));
        TituloInfoID.putClientProperty("FlatLaf.style", "font: 14 $h4.font");
        TituloInfoID.setForeground(new Color(55, 71, 79));
        TituloPB.putClientProperty("FlatLaf.style", "font: 14 $h4.font");
        TituloPB.setForeground(new Color(55, 71, 79));
        Nombre.putClientProperty("FlatLaf.style", "font: 12 $h4.font");
        Nombre.setForeground(Color.BLACK);
        Nacion.putClientProperty("FlatLaf.style", "font: 12 $h4.font");
        Nacion.setForeground(Color.BLACK);
        Fecha.putClientProperty("FlatLaf.style", "font: 12 $h4.font");
        Fecha.setForeground(Color.BLACK);
        Edad.putClientProperty("FlatLaf.style", "font: 12 $h4.font");
        Edad.setForeground(Color.BLACK);
        TituloGenero.putClientProperty("FlatLaf.style", "font: 12 $h4.font");
        TituloGenero.setForeground(Color.BLACK);
        TipoDocu.putClientProperty("FlatLaf.style", "font: 12 $h4.font");
        TipoDocu.setForeground(Color.BLACK);
        NumeDocu.putClientProperty("FlatLaf.style", "font: 12 $h4.font");
        NumeDocu.setForeground(Color.BLACK);
        Direccion.putClientProperty("FlatLaf.style", "font: 12 $h4.font");
        Direccion.setForeground(Color.BLACK);
        Correo.putClientProperty("FlatLaf.style", "font: 12 $h4.font");
        Correo.setForeground(Color.BLACK);
        Telefono.putClientProperty("FlatLaf.style", "font: 12 $h4.font");
        Telefono.setForeground(Color.BLACK);
        SetCorreo.putClientProperty("FlatLaf.style", "font: 11 $h4.font");
        SetCorreo.setForeground(new Color(107, 129, 154));
        SetDireccion.putClientProperty("FlatLaf.style", "font: 11 $h4.font");
        SetDireccion.setForeground(new Color(107, 129, 154));
        SetFecha.putClientProperty("FlatLaf.style", "font: 11 $h4.font");
        SetFecha.setForeground(new Color(107, 129, 154));
        SetGenero.putClientProperty("FlatLaf.style", "font: 11 $h4.font");
        SetGenero.setForeground(new Color(107, 129, 154));
        SetNombre.putClientProperty("FlatLaf.style", "font: 11 $h4.font");
        SetNombre.setForeground(new Color(107, 129, 154));
        SetNumero.putClientProperty("FlatLaf.style", "font: 11 $h4.font");
        SetNumero.setForeground(new Color(107, 129, 154));
        SetTelefono.putClientProperty("FlatLaf.style", "font: 11 $h4.font");
        SetTelefono.setForeground(new Color(107, 129, 154));
        SetTipo.putClientProperty("FlatLaf.style", "font: 11 $h4.font");
        SetTipo.setForeground(new Color(107, 129, 154));
        setNacionalidad.putClientProperty("FlatLaf.style", "font: 11 $h4.font");
        setNacionalidad.setForeground(new Color(107, 129, 154));
        SetEdad.putClientProperty("FlatLaf.style", "font: 11 $h4.font");
        SetEdad.setForeground(new Color(107, 129, 154));

        GuardarBTN.putClientProperty("FlatLaf.style", "font: 11 $h4.font");
        GuardarBTN.setForeground(Color.white);
    }

    private void initPlaceHolders() {
        mt.mentalistFrontend.Util.PlaceholderSupport.aplicar(SetNombre, "Ingrese nombre del paciente");
        mt.mentalistFrontend.Util.PlaceholderSupport.aplicar(SetFecha, "Ingrese fecha de nacimiento del paciente");
        mt.mentalistFrontend.Util.PlaceholderSupport.aplicar(SetEdad, "Ingrese la edad del paciente");
        mt.mentalistFrontend.Util.PlaceholderSupport.aplicar(SetNumero, "Ingrese el N° de documento del paciente");
        mt.mentalistFrontend.Util.PlaceholderSupport.aplicar(SetTelefono, "Ingrese el número de teléfono del paciente");
        mt.mentalistFrontend.Util.PlaceholderSupport.aplicar(SetCorreo, "Ingrese el correo electrónico del paciente");
        mt.mentalistFrontend.Util.PlaceholderSupport.aplicar(SetDireccion, "Ingrese la dirección del paciente");
    }

    private void guardarPaciente() {
//        Map<JTextField, String> campos = new LinkedHashMap<>();
//        campos.put(SetNombre, "Proporciona el nombre");
//        campos.put(SetFecha, "Proporciona la fecha");
//        campos.put(SetEdad, "Proporciona la edad");
//        campos.put(SetNumero, "Proporciona el numero de identificacion");
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
//            numeroIdentidad = Integer.parseInt(SetNumero.getText().trim());
//        } catch (NumberFormatException e) {
//            mostrarMensaje("El número de identificación debe ser un valor numérico.");
//            SetNumero.requestFocusInWindow();
//            return;
//        }
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
//        var nacionalidad= setNacionalidad.getSelectedItem().toString().trim();
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
//
//        //Validar el genero
//        Genero genero;
//        try {
//            genero = Genero.valueOf(SetGenero.getSelectedItem().toString());
//        } catch (IllegalArgumentException e) {
//            mostrarMensaje("Tipo de genero invalido");
//            return;
//        }
//
//        //Validar fecha de nacimiento
//        var fecha = SetFecha.getText();
//        DateTimeFormatter entrada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        LocalDate fechaNacimiento;
//        try {
//            fechaNacimiento = LocalDate.parse(SetFecha.getText().trim(), entrada);
//        } catch (Exception e) {
//            mostrarMensaje("Formato de fecha inválido. Usa el formato DD/MM/AAAA.");
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
//        mostrarMensaje("Los datos del paciente se guardaron exitosamenten.");
//        limpiar();
    }

    private void limpiar() {
        SetNombre.setText("");
        SetFecha.setText("");
        SetEdad.setText("");
        setNacionalidad.setSelectedIndex(0);
        SetNumero.setText("");
        SetTelefono.setText("");
        SetCorreo.setText("");
        SetDireccion.setText("");
        SetGenero.setSelectedIndex(0);
        SetTipo.setSelectedIndex(0);
    }

    private void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        Titulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        NumeDocu = new javax.swing.JLabel();
        SetNumero = new javax.swing.JTextField();
        TipoDocu = new javax.swing.JLabel();
        SetTipo = new javax.swing.JComboBox<>();
        TituloInfoID = new javax.swing.JLabel();
        TituloPB = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Telefono = new javax.swing.JLabel();
        SetDireccion = new javax.swing.JTextField();
        SetTelefono = new javax.swing.JTextField();
        Correo = new javax.swing.JLabel();
        SetCorreo = new javax.swing.JTextField();
        Direccion = new javax.swing.JLabel();
        GuardarBTN = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        Nombre = new javax.swing.JLabel();
        SetNombre = new javax.swing.JTextField();
        Fecha = new javax.swing.JLabel();
        SetFecha = new javax.swing.JTextField();
        TituloGenero = new javax.swing.JLabel();
        SetGenero = new javax.swing.JComboBox<>();
        Nacion = new javax.swing.JLabel();
        Edad = new javax.swing.JLabel();
        SetEdad = new javax.swing.JTextField();
        setNacionalidad = new javax.swing.JComboBox<>();
        TituloCU = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(245, 245, 240));

        jSeparator1.setBackground(new java.awt.Color(27, 203, 209));
        jSeparator1.setForeground(new java.awt.Color(27, 203, 209));

        Titulo.setText("Registro de Paciente - Mentalist");

        jPanel2.setBackground(new java.awt.Color(245, 245, 240));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        NumeDocu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NumeDocu.setText("Numero de Documento");

        SetNumero.setBackground(new java.awt.Color(188, 234, 255));
        SetNumero.setText("Ingrese numero de documento");
        SetNumero.setBorder(null);

        TipoDocu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TipoDocu.setText("Tipo de Documento");

        SetTipo.setBackground(new java.awt.Color(188, 234, 255));
        SetTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CC", "TI", "CE", "PAS" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(SetTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TipoDocu, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(NumeDocu, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(SetNumero)))
                .addGap(0, 96, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TipoDocu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SetTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NumeDocu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SetNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        TituloInfoID.setText("Información Personal Básica ");

        TituloPB.setText("Información de Identificación ");

        jPanel4.setBackground(new java.awt.Color(245, 245, 240));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Telefono.setText("Telefono");

        SetDireccion.setBackground(new java.awt.Color(188, 234, 255));
        SetDireccion.setText("Ingrese la dirección");
        SetDireccion.setBorder(null);

        SetTelefono.setBackground(new java.awt.Color(188, 234, 255));
        SetTelefono.setText("Ingrese número");
        SetTelefono.setBorder(null);

        Correo.setText("Correo");

        SetCorreo.setBackground(new java.awt.Color(188, 234, 255));
        SetCorreo.setText("Ingrese correo");
        SetCorreo.setBorder(null);

        Direccion.setText("Direccion");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Telefono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Direccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SetDireccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                        .addComponent(SetTelefono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SetCorreo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(Direccion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SetDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Telefono)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SetTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Correo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SetCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        GuardarBTN.setBackground(new java.awt.Color(17, 129, 133));
        GuardarBTN.setText("Guardar");
        GuardarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarBTNActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(245, 245, 240));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Nombre.setText("Nombre completo");

        SetNombre.setBackground(new java.awt.Color(188, 234, 255));
        SetNombre.setBorder(null);

        Fecha.setText("Fecha de nacimiento");

        SetFecha.setBackground(new java.awt.Color(188, 234, 255));
        SetFecha.setBorder(null);

        TituloGenero.setText("Genero");

        SetGenero.setBackground(new java.awt.Color(188, 234, 255));
        SetGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));

        Nacion.setText("Nacionalidad");

        Edad.setText("Edad");

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
                        .addComponent(Edad, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(76, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SetNombre)
                            .addComponent(Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                                .addGap(1, 1, 1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(TituloGenero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(3, 3, 3)))
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
                .addComponent(TituloGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SetGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        TituloCU.setText("Información de Contacto y Ubicación");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TituloInfoID, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TituloPB, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TituloCU, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(GuardarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Titulo)
                    .addComponent(GuardarBTN))
                .addGap(4, 4, 4)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TituloPB)
                    .addComponent(TituloInfoID, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TituloCU)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
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
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarBTNActionPerformed
        guardarPaciente();
    }//GEN-LAST:event_GuardarBTNActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Correo;
    private javax.swing.JLabel Direccion;
    private javax.swing.JLabel Edad;
    private javax.swing.JLabel Fecha;
    private javax.swing.JButton GuardarBTN;
    private javax.swing.JLabel Nacion;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel NumeDocu;
    private javax.swing.JTextField SetCorreo;
    private javax.swing.JTextField SetDireccion;
    private javax.swing.JTextField SetEdad;
    private javax.swing.JTextField SetFecha;
    private javax.swing.JComboBox<String> SetGenero;
    private javax.swing.JTextField SetNombre;
    private javax.swing.JTextField SetNumero;
    private javax.swing.JTextField SetTelefono;
    private javax.swing.JComboBox<String> SetTipo;
    private javax.swing.JLabel Telefono;
    private javax.swing.JLabel TipoDocu;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel TituloCU;
    private javax.swing.JLabel TituloGenero;
    private javax.swing.JLabel TituloInfoID;
    private javax.swing.JLabel TituloPB;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> setNacionalidad;
    // End of variables declaration//GEN-END:variables
}
