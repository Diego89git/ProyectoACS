package Interfaz;

import Controlador.Controller;
import Objetos.Rol;
import Pruebas.Controlador;


import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        jPMenu1.setVisible(true);
        jPIngreso.setVisible(true);
        jPSalir.setVisible(true);
        JPMRegistro.setVisible(false);
        jPMenu2.setVisible(false);
        jPAgendar.setVisible(false);
        jPM1Rutasprecio.setVisible(false);
        jPM1Precios.setVisible(false);
        jPM1Horarios.setVisible(false);
        jPAsiento.setVisible(false);
        jPBus.setVisible(false);
        jPCiudad.setVisible(false);
        jPCliente.setVisible(false);
        jPCooperativa.setVisible(false);
        jPRol.setVisible(false);
        jPRuta.setVisible(false);
        jPUsuario.setVisible(false);
        this.setLocationRelativeTo(null);
    }

    public void salirM2() {
        jPMenu1.setVisible(false);
        jPIngreso.setVisible(false);
        jPSalir.setVisible(true);
        JPMRegistro.setVisible(false);
        jPMenu2.setVisible(true);
        jPAgendar.setVisible(false);
        jPM1Rutasprecio.setVisible(false);
        jPM1Precios.setVisible(false);
        jPM1Horarios.setVisible(false);
        jPAsiento.setVisible(false);
        jPBus.setVisible(false);
        jPCiudad.setVisible(false);
        jPCliente.setVisible(false);
        jPCooperativa.setVisible(false);
        jPRol.setVisible(false);
        jPRuta.setVisible(false);
        jPUsuario.setVisible(false);
    }

    public void inicio() {
        jPMenu1.setVisible(true);
        jPIngreso.setVisible(true);
        jPSalir.setVisible(true);
        JPMRegistro.setVisible(false);
        jPMenu2.setVisible(false);
        jPAgendar.setVisible(false);
        jPM1Rutasprecio.setVisible(false);
        jPM1Precios.setVisible(false);
        jPM1Horarios.setVisible(false);
        jPAsiento.setVisible(false);
        jPBus.setVisible(false);
        jPCiudad.setVisible(false);
        jPCliente.setVisible(false);
        jPCooperativa.setVisible(false);
        jPRol.setVisible(false);
        jPRuta.setVisible(false);
        jPUsuario.setVisible(false);
    }

    public void blanco() {
        jPMenu1.setVisible(false);
        jPIngreso.setVisible(false);
        jPSalir.setVisible(true);
        JPMRegistro.setVisible(false);
        jPMenu2.setVisible(false);
        jPAgendar.setVisible(false);
        jPM1Rutasprecio.setVisible(false);
        jPM1Precios.setVisible(false);
        jPM1Horarios.setVisible(false);
        jPAsiento.setVisible(false);
        jPBus.setVisible(false);
        jPCiudad.setVisible(false);
        jPCliente.setVisible(false);
        jPCooperativa.setVisible(false);
        jPRol.setVisible(false);
        jPRuta.setVisible(false);
        jPUsuario.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPRuta = new javax.swing.JPanel();
        JBM2Salir1 = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jPCooperativa = new javax.swing.JPanel();
        JBM2Salir6 = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jPAsiento = new javax.swing.JPanel();
        JBM2Salir3 = new javax.swing.JButton();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jPCiudad = new javax.swing.JPanel();
        JBM2Salir7 = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jPRol = new javax.swing.JPanel();
        JBM2Salir8 = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jPBus = new javax.swing.JPanel();
        JBM2Salir2 = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jPUsuario = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        JBM2Salir4 = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        jPCliente = new javax.swing.JPanel();
        JBM2Salir5 = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jPSalir = new javax.swing.JPanel();
        jlSalir = new javax.swing.JLabel();
        jlMinimizar = new javax.swing.JLabel();
        jPIngreso = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxtUser = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtxtPass = new javax.swing.JPasswordField();
        jBM1Registrar = new javax.swing.JButton();
        JBIngresar = new javax.swing.JButton();
        jPMenu1 = new javax.swing.JPanel();
        jBM1rutas = new javax.swing.JButton();
        jBM1horarios = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jPM1Rutasprecio = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        JTM1ruta = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jBRPregresdar1 = new javax.swing.JButton();
        jPM1Horarios = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jBhregresdar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPMenu2 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jBagendar = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        JBM2Salir = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        JPMRegistro = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLapll = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLnom = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLced = new javax.swing.JLabel();
        JTRContraseña = new javax.swing.JTextField();
        JTRDireccion = new javax.swing.JTextField();
        JTRCorreo = new javax.swing.JTextField();
        JTRTelefono = new javax.swing.JTextField();
        JTRApellido = new javax.swing.JTextField();
        JTRNombre = new javax.swing.JTextField();
        JTRCedula = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        JBRegSalir = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jPM1Precios = new javax.swing.JPanel();
        jPAgendar = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtUsuario1 = new javax.swing.JTable();
        btUsU1 = new javax.swing.JButton();
        btUsD1 = new javax.swing.JButton();
        txUsS = new javax.swing.JTextField();
        btRlUPS1 = new javax.swing.JButton();
        btRlUPN1 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txUsCed = new javax.swing.JTextField();
        txUsId = new javax.swing.JTextField();
        btUsG = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txUsNom = new javax.swing.JTextField();
        txUsApe = new javax.swing.JTextField();
        txUsCor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txUsTel = new javax.swing.JTextField();
        txUsCon = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txUsDir = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cbRol = new javax.swing.JComboBox<>();
        jbSalir = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPRuta.setBackground(new java.awt.Color(255, 255, 255));
        jPRuta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0), 4));
        jPRuta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JBM2Salir1.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        JBM2Salir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Exit_41038.png"))); // NOI18N
        JBM2Salir1.setText("SALIR");
        JBM2Salir1.setBorderPainted(false);
        JBM2Salir1.setContentAreaFilled(false);
        JBM2Salir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBM2Salir1ActionPerformed(evt);
            }
        });
        jPRuta.add(JBM2Salir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 460, -1, -1));

        jLabel34.setBackground(new java.awt.Color(238, 111, 82));
        jLabel34.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(238, 111, 82));
        jLabel34.setText("RUTA");
        jPRuta.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, -1, -1));

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/map_route_10854.png"))); // NOI18N
        jPRuta.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        getContentPane().add(jPRuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1030, 520));

        jPCooperativa.setBackground(new java.awt.Color(255, 255, 255));
        jPCooperativa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0), 4));
        jPCooperativa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JBM2Salir6.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        JBM2Salir6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Exit_41038.png"))); // NOI18N
        JBM2Salir6.setText("SALIR");
        JBM2Salir6.setBorderPainted(false);
        JBM2Salir6.setContentAreaFilled(false);
        JBM2Salir6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBM2Salir6ActionPerformed(evt);
            }
        });
        jPCooperativa.add(JBM2Salir6, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 460, -1, -1));

        jLabel36.setBackground(new java.awt.Color(238, 111, 82));
        jLabel36.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(238, 111, 82));
        jLabel36.setText("COOPERATIVA");
        jPCooperativa.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, -1, -1));

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Handshake_96px.png"))); // NOI18N
        jPCooperativa.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        getContentPane().add(jPCooperativa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1030, 520));

        jPAsiento.setBackground(new java.awt.Color(255, 255, 255));
        jPAsiento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0), 4));
        jPAsiento.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JBM2Salir3.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        JBM2Salir3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Exit_41038.png"))); // NOI18N
        JBM2Salir3.setText("SALIR");
        JBM2Salir3.setBorderPainted(false);
        JBM2Salir3.setContentAreaFilled(false);
        JBM2Salir3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBM2Salir3ActionPerformed(evt);
            }
        });
        jPAsiento.add(JBM2Salir3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 450, -1, -1));

        jLabel44.setBackground(new java.awt.Color(238, 111, 82));
        jLabel44.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(238, 111, 82));
        jLabel44.setText("ASIENTO");
        jPAsiento.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, -1, -1));

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/airline-seat-recline-normal_119451.png"))); // NOI18N
        jPAsiento.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        getContentPane().add(jPAsiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1030, 520));

        jPCiudad.setBackground(new java.awt.Color(255, 255, 255));
        jPCiudad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0), 4));
        jPCiudad.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JBM2Salir7.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        JBM2Salir7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Exit_41038.png"))); // NOI18N
        JBM2Salir7.setText("SALIR");
        JBM2Salir7.setBorderPainted(false);
        JBM2Salir7.setContentAreaFilled(false);
        JBM2Salir7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBM2Salir7ActionPerformed(evt);
            }
        });
        jPCiudad.add(JBM2Salir7, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 460, -1, -1));

        jLabel32.setBackground(new java.awt.Color(238, 111, 82));
        jLabel32.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(238, 111, 82));
        jLabel32.setText("CIUDAD");
        jPCiudad.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, -1, -1));

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/_123049.png"))); // NOI18N
        jPCiudad.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        getContentPane().add(jPCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1030, 520));

        jPRol.setBackground(new java.awt.Color(255, 255, 255));
        jPRol.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0), 4));
        jPRol.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JBM2Salir8.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        JBM2Salir8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Exit_41038.png"))); // NOI18N
        JBM2Salir8.setText("SALIR");
        JBM2Salir8.setBorderPainted(false);
        JBM2Salir8.setContentAreaFilled(false);
        JBM2Salir8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBM2Salir8ActionPerformed(evt);
            }
        });
        jPRol.add(JBM2Salir8, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 450, -1, -1));

        jLabel33.setBackground(new java.awt.Color(238, 111, 82));
        jLabel33.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(238, 111, 82));
        jLabel33.setText("ROL");
        jPRol.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, -1, -1));

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Maintenance_96px.png"))); // NOI18N
        jPRol.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        getContentPane().add(jPRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1030, 520));

        jPBus.setBackground(new java.awt.Color(255, 255, 255));
        jPBus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0), 4));
        jPBus.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JBM2Salir2.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        JBM2Salir2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Exit_41038.png"))); // NOI18N
        JBM2Salir2.setText("SALIR");
        JBM2Salir2.setBorderPainted(false);
        JBM2Salir2.setContentAreaFilled(false);
        JBM2Salir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBM2Salir2ActionPerformed(evt);
            }
        });
        jPBus.add(JBM2Salir2, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 460, -1, -1));

        jLabel37.setBackground(new java.awt.Color(238, 111, 82));
        jLabel37.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(238, 111, 82));
        jLabel37.setText("BUS");
        jPBus.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, -1, -1));

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bus_icon-icons.com_76529.png"))); // NOI18N
        jPBus.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        getContentPane().add(jPBus, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1030, 520));

        jPUsuario.setBackground(new java.awt.Color(255, 255, 255));
        jPUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0), 4));
        jPUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel40.setBackground(new java.awt.Color(238, 111, 82));
        jLabel40.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(238, 111, 82));
        jLabel40.setText("USUARIO");
        jPUsuario.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, -1, -1));

        JBM2Salir4.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        JBM2Salir4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Exit_41038.png"))); // NOI18N
        JBM2Salir4.setText("SALIR");
        JBM2Salir4.setBorderPainted(false);
        JBM2Salir4.setContentAreaFilled(false);
        JBM2Salir4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBM2Salir4ActionPerformed(evt);
            }
        });
        jPUsuario.add(JBM2Salir4, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 460, -1, -1));

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/admin_person_user_man_2839.png"))); // NOI18N
        jPUsuario.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        getContentPane().add(jPUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 41, 1030, 520));

        jPCliente.setBackground(new java.awt.Color(255, 255, 255));
        jPCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0), 4));
        jPCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JBM2Salir5.setBackground(new java.awt.Color(238, 111, 82));
        JBM2Salir5.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        JBM2Salir5.setForeground(new java.awt.Color(238, 111, 82));
        JBM2Salir5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Exit_41038.png"))); // NOI18N
        JBM2Salir5.setText("SALIR");
        JBM2Salir5.setBorderPainted(false);
        JBM2Salir5.setContentAreaFilled(false);
        JBM2Salir5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBM2Salir5ActionPerformed(evt);
            }
        });
        jPCliente.add(JBM2Salir5, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 440, -1, -1));

        jLabel41.setBackground(new java.awt.Color(238, 111, 82));
        jLabel41.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(238, 111, 82));
        jLabel41.setText("CLIENTE");
        jPCliente.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, -1, -1));

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/customer_person_people_man_you_1625.png"))); // NOI18N
        jPCliente.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        getContentPane().add(jPCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 41, 1030, 520));

        jPSalir.setBackground(new java.awt.Color(255, 255, 255));
        jPSalir.setForeground(new java.awt.Color(255, 255, 255));
        jPSalir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Multiply_32px.png"))); // NOI18N
        jlSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlSalirMouseClicked(evt);
            }
        });
        jPSalir.add(jlSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 10, 30, 20));

        jlMinimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Expand_Arrow_32px.png"))); // NOI18N
        jlMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlMinimizarMouseClicked(evt);
            }
        });
        jPSalir.add(jlMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 10, -1, 20));

        getContentPane().add(jPSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 40));

        jPIngreso.setBackground(new java.awt.Color(255, 255, 255));
        jPIngreso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0), 4));
        jPIngreso.setForeground(new java.awt.Color(255, 255, 255));
        jPIngreso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(238, 111, 82));
        jLabel1.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(238, 111, 82));
        jLabel1.setText("CONTRASEÑA:");
        jPIngreso.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        jLabel2.setBackground(new java.awt.Color(238, 111, 82));
        jLabel2.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(238, 111, 82));
        jLabel2.setText("USUARIO:");
        jPIngreso.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_User_96px_2.png"))); // NOI18N
        jPIngreso.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 110, 120));

        jtxtUser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtxtUser.setForeground(new java.awt.Color(153, 153, 153));
        jtxtUser.setText("Ingrese su usuario.");
        jtxtUser.setBorder(null);
        jtxtUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtUserMouseClicked(evt);
            }
        });
        jtxtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtUserActionPerformed(evt);
            }
        });
        jPIngreso.add(jtxtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 160, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPIngreso.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 210, 30));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPIngreso.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 200, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_customer_32px_1.png"))); // NOI18N
        jPIngreso.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Key_32px.png"))); // NOI18N
        jPIngreso.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        jtxtPass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jtxtPass.setForeground(new java.awt.Color(153, 153, 153));
        jtxtPass.setText("jPassword53,1d2");
        jtxtPass.setBorder(null);
        jtxtPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtPassMouseClicked(evt);
            }
        });
        jtxtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtPassActionPerformed(evt);
            }
        });
        jPIngreso.add(jtxtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 160, 30));

        jBM1Registrar.setBackground(new java.awt.Color(238, 111, 82));
        jBM1Registrar.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        jBM1Registrar.setForeground(new java.awt.Color(238, 111, 82));
        jBM1Registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/REEGI.png"))); // NOI18N
        jBM1Registrar.setText("REGISTARASE");
        jBM1Registrar.setBorder(null);
        jBM1Registrar.setBorderPainted(false);
        jBM1Registrar.setContentAreaFilled(false);
        jBM1Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBM1RegistrarActionPerformed(evt);
            }
        });
        jPIngreso.add(jBM1Registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 50));

        JBIngresar.setBackground(new java.awt.Color(255, 255, 255));
        JBIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Enter_ON.png"))); // NOI18N
        JBIngresar.setBorder(null);
        JBIngresar.setBorderPainted(false);
        JBIngresar.setContentAreaFilled(false);
        JBIngresar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Enter_ON.png"))); // NOI18N
        JBIngresar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Enter_ON.png"))); // NOI18N
        JBIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBIngresarActionPerformed(evt);
            }
        });
        jPIngreso.add(JBIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 150, 50));

        getContentPane().add(jPIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 290, 520));

        jPMenu1.setBackground(new java.awt.Color(255, 255, 255));
        jPMenu1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0), 4));
        jPMenu1.setForeground(new java.awt.Color(255, 255, 255));
        jPMenu1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBM1rutas.setBackground(new java.awt.Color(238, 111, 82));
        jBM1rutas.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jBM1rutas.setForeground(new java.awt.Color(238, 111, 82));
        jBM1rutas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Layers_icon-icons.com_74900.png"))); // NOI18N
        jBM1rutas.setText("RUTAS y PRECIOS");
        jBM1rutas.setBorder(null);
        jBM1rutas.setBorderPainted(false);
        jBM1rutas.setContentAreaFilled(false);
        jBM1rutas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBM1rutasActionPerformed(evt);
            }
        });
        jPMenu1.add(jBM1rutas, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 240, -1));

        jBM1horarios.setBackground(new java.awt.Color(238, 111, 82));
        jBM1horarios.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jBM1horarios.setForeground(new java.awt.Color(238, 111, 82));
        jBM1horarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Schedule_36724.png"))); // NOI18N
        jBM1horarios.setText("HORARIOS");
        jBM1horarios.setBorder(null);
        jBM1horarios.setBorderPainted(false);
        jBM1horarios.setContentAreaFilled(false);
        jBM1horarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBM1horariosActionPerformed(evt);
            }
        });
        jPMenu1.add(jBM1horarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 200, 140));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/handshake_icon_144618.png"))); // NOI18N
        jPMenu1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 100, 100));

        jLabel16.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("BIENVENIDO");
        jPMenu1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 150, 90));

        jLabel17.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setText("VER:");
        jPMenu1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 50, 40));

        jSeparator3.setBackground(new java.awt.Color(238, 111, 82));
        jSeparator3.setForeground(new java.awt.Color(238, 111, 82));
        jPMenu1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 750, 10));

        getContentPane().add(jPMenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 740, 520));

        jPM1Rutasprecio.setBackground(new java.awt.Color(255, 255, 255));
        jPM1Rutasprecio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0), 4));
        jPM1Rutasprecio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JTM1ruta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(JTM1ruta);

        jPM1Rutasprecio.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 440, 220));

        jLabel12.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel12.setText("RUTAS y PRECIOS");
        jPM1Rutasprecio.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 350, -1));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Layers_icon-icons.com_74900.png"))); // NOI18N
        jPM1Rutasprecio.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 120, 90));

        jBRPregresdar1.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        jBRPregresdar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Exit_41038.png"))); // NOI18N
        jBRPregresdar1.setText("REGERSAR");
        jBRPregresdar1.setBorderPainted(false);
        jBRPregresdar1.setContentAreaFilled(false);
        jBRPregresdar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRPregresdar1ActionPerformed(evt);
            }
        });
        jPM1Rutasprecio.add(jBRPregresdar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 440, -1, -1));

        getContentPane().add(jPM1Rutasprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 740, 520));

        jPM1Horarios.setBackground(new java.awt.Color(255, 255, 255));
        jPM1Horarios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0), 4));
        jPM1Horarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setBackground(new java.awt.Color(238, 111, 82));
        jLabel20.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(238, 111, 82));
        jLabel20.setText("HORARIO");
        jPM1Horarios.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, -1, -1));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Schedule_36724.png"))); // NOI18N
        jPM1Horarios.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        jBhregresdar.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        jBhregresdar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Exit_41038.png"))); // NOI18N
        jBhregresdar.setText("REGERSAR");
        jBhregresdar.setBorderPainted(false);
        jBhregresdar.setContentAreaFilled(false);
        jBhregresdar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBhregresdarActionPerformed(evt);
            }
        });
        jPM1Horarios.add(jBhregresdar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 440, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPM1Horarios.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 390, 240));

        getContentPane().add(jPM1Horarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 740, 520));

        jPMenu2.setBackground(new java.awt.Color(255, 255, 255));
        jPMenu2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0), 4));
        jPMenu2.setForeground(new java.awt.Color(255, 255, 255));
        jPMenu2.setLayout(null);

        jButton4.setBackground(new java.awt.Color(255, 99, 71));
        jButton4.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 99, 71));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bus_icon-icons.com_76529.png"))); // NOI18N
        jButton4.setText("BUS");
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPMenu2.add(jButton4);
        jButton4.setBounds(430, 340, 169, 97);

        jButton5.setBackground(new java.awt.Color(255, 99, 71));
        jButton5.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 99, 71));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/map_route_10854.png"))); // NOI18N
        jButton5.setText("RUTAS");
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPMenu2.add(jButton5);
        jButton5.setBounds(760, 360, 145, 97);

        jButton3.setBackground(new java.awt.Color(255, 99, 71));
        jButton3.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 99, 71));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/customer_person_people_man_you_1625.png"))); // NOI18N
        jButton3.setText("CLIENTE");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPMenu2.add(jButton3);
        jButton3.setBounds(70, 80, 220, 97);

        jButton9.setBackground(new java.awt.Color(255, 99, 71));
        jButton9.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 99, 71));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Maintenance_96px.png"))); // NOI18N
        jButton9.setText("ROL");
        jButton9.setBorder(null);
        jButton9.setBorderPainted(false);
        jButton9.setContentAreaFilled(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPMenu2.add(jButton9);
        jButton9.setBounds(720, 220, 210, 110);

        jBagendar.setBackground(new java.awt.Color(255, 99, 71));
        jBagendar.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        jBagendar.setForeground(new java.awt.Color(255, 99, 71));
        jBagendar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Today_96px.png"))); // NOI18N
        jBagendar.setText("RESERVACIONES");
        jBagendar.setBorder(null);
        jBagendar.setBorderPainted(false);
        jBagendar.setContentAreaFilled(false);
        jBagendar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jBagendarMouseMoved(evt);
            }
        });
        jBagendar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBagendarMouseExited(evt);
            }
        });
        jBagendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBagendarActionPerformed(evt);
            }
        });
        jPMenu2.add(jBagendar);
        jBagendar.setBounds(70, 200, 220, 97);

        jButton6.setBackground(new java.awt.Color(255, 99, 71));
        jButton6.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 99, 71));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Handshake_96px.png"))); // NOI18N
        jButton6.setText("COOPERATIVA");
        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPMenu2.add(jButton6);
        jButton6.setBounds(420, 210, 200, 97);

        JBM2Salir.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        JBM2Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Exit_41038.png"))); // NOI18N
        JBM2Salir.setText("SALIR");
        JBM2Salir.setBorderPainted(false);
        JBM2Salir.setContentAreaFilled(false);
        JBM2Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBM2SalirActionPerformed(evt);
            }
        });
        jPMenu2.add(JBM2Salir);
        JBM2Salir.setBounds(20, 460, 111, 50);

        jButton7.setBackground(new java.awt.Color(255, 99, 71));
        jButton7.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 99, 71));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/airline-seat-recline-normal_119451.png"))); // NOI18N
        jButton7.setText("ASIENTO");
        jButton7.setBorder(null);
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPMenu2.add(jButton7);
        jButton7.setBounds(90, 330, 169, 97);

        jButton10.setBackground(new java.awt.Color(255, 99, 71));
        jButton10.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 99, 71));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/admin_person_user_man_2839.png"))); // NOI18N
        jButton10.setText("USUARIO");
        jButton10.setBorder(null);
        jButton10.setBorderPainted(false);
        jButton10.setContentAreaFilled(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPMenu2.add(jButton10);
        jButton10.setBounds(430, 80, 161, 97);

        jButton13.setBackground(new java.awt.Color(255, 99, 71));
        jButton13.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        jButton13.setForeground(new java.awt.Color(255, 99, 71));
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/_123049.png"))); // NOI18N
        jButton13.setText("CIUDAD");
        jButton13.setBorder(null);
        jButton13.setBorderPainted(false);
        jButton13.setContentAreaFilled(false);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPMenu2.add(jButton13);
        jButton13.setBounds(740, 80, 169, 97);

        jLabel18.setBackground(new java.awt.Color(255, 99, 71));
        jLabel18.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 99, 71));
        jLabel18.setText("MENU PRINCIPAL");
        jPMenu2.add(jLabel18);
        jLabel18.setBounds(430, 20, 150, 20);

        getContentPane().add(jPMenu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1030, 520));

        JPMRegistro.setBackground(new java.awt.Color(255, 255, 255));
        JPMRegistro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 0), 4, true));
        JPMRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JPMRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/addUser.png"))); // NOI18N
        JPMRegistro.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel14.setBackground(new java.awt.Color(238, 111, 82));
        jLabel14.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(238, 111, 82));
        jLabel14.setText("REGISTRO DE USUARIOS.");
        JPMRegistro.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, -1, -1));

        jLapll.setBackground(new java.awt.Color(238, 111, 82));
        jLapll.setFont(new java.awt.Font("Cooper Black", 2, 14)); // NOI18N
        jLapll.setForeground(new java.awt.Color(238, 111, 82));
        jLapll.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLapll.setText("Apellido : ");
        JPMRegistro.add(jLapll, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 80, -1));

        jLabel19.setBackground(new java.awt.Color(238, 111, 82));
        jLabel19.setFont(new java.awt.Font("Cooper Black", 2, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(238, 111, 82));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Telefono : ");
        JPMRegistro.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, 80, -1));

        jLnom.setBackground(new java.awt.Color(238, 111, 82));
        jLnom.setFont(new java.awt.Font("Cooper Black", 2, 14)); // NOI18N
        jLnom.setForeground(new java.awt.Color(238, 111, 82));
        jLnom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLnom.setText("Nombre : ");
        JPMRegistro.add(jLnom, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, -1, -1));

        jLabel27.setBackground(new java.awt.Color(238, 111, 82));
        jLabel27.setFont(new java.awt.Font("Cooper Black", 2, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(238, 111, 82));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Correo : ");
        JPMRegistro.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 270, -1, -1));

        jLabel28.setBackground(new java.awt.Color(238, 111, 82));
        jLabel28.setFont(new java.awt.Font("Cooper Black", 2, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(238, 111, 82));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Direccion : ");
        JPMRegistro.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 350, -1, -1));

        jLabel29.setBackground(new java.awt.Color(238, 111, 82));
        jLabel29.setFont(new java.awt.Font("Cooper Black", 2, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(238, 111, 82));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Contraeña : ");
        JPMRegistro.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, 90, -1));

        jLced.setBackground(new java.awt.Color(238, 111, 82));
        jLced.setFont(new java.awt.Font("Cooper Black", 2, 14)); // NOI18N
        jLced.setForeground(new java.awt.Color(238, 111, 82));
        jLced.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLced.setText("Cedula : ");
        JPMRegistro.add(jLced, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, -1, -1));

        JTRContraseña.setBorder(null);
        JTRContraseña.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JPMRegistro.add(JTRContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 180, 200, 30));

        JTRDireccion.setBorder(null);
        JTRDireccion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JPMRegistro.add(JTRDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 340, 260, 30));

        JTRCorreo.setBorder(null);
        JTRCorreo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JPMRegistro.add(JTRCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 260, 260, 30));

        JTRTelefono.setBorder(null);
        JTRTelefono.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JPMRegistro.add(JTRTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, 170, 30));

        JTRApellido.setBorder(null);
        JTRApellido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JPMRegistro.add(JTRApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 170, 30));

        JTRNombre.setBorder(null);
        JTRNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JPMRegistro.add(JTRNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 170, 30));

        JTRCedula.setBorder(null);
        JTRCedula.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JPMRegistro.add(JTRCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 170, 30));
        JPMRegistro.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 210, 20));
        JPMRegistro.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, 200, 20));
        JPMRegistro.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 210, 210, 20));
        JPMRegistro.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 290, 270, 20));
        JPMRegistro.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 370, 270, 20));
        JPMRegistro.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 210, 20));
        JPMRegistro.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 210, 20));

        JBRegSalir.setFont(new java.awt.Font("Cooper Black", 0, 11)); // NOI18N
        JBRegSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Exit_41038.png"))); // NOI18N
        JBRegSalir.setText("Salir");
        JBRegSalir.setBorder(null);
        JBRegSalir.setBorderPainted(false);
        JBRegSalir.setContentAreaFilled(false);
        JBRegSalir.setDefaultCapable(false);
        JBRegSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBRegSalirActionPerformed(evt);
            }
        });
        JPMRegistro.add(JBRegSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 450, -1, -1));

        jButton12.setFont(new java.awt.Font("Cooper Black", 0, 11)); // NOI18N
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/save.png"))); // NOI18N
        jButton12.setText("Guardar");
        jButton12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton12.setBorderPainted(false);
        jButton12.setContentAreaFilled(false);
        jButton12.setDefaultCapable(false);
        JPMRegistro.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 410, -1, -1));

        getContentPane().add(JPMRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1030, 520));

        jPM1Precios.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPM1PreciosLayout = new javax.swing.GroupLayout(jPM1Precios);
        jPM1Precios.setLayout(jPM1PreciosLayout);
        jPM1PreciosLayout.setHorizontalGroup(
            jPM1PreciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1030, Short.MAX_VALUE)
        );
        jPM1PreciosLayout.setVerticalGroup(
            jPM1PreciosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        getContentPane().add(jPM1Precios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1030, 450));

        jPAgendar.setBackground(new java.awt.Color(255, 255, 255));
        jPAgendar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0), 4));
        jPAgendar.setForeground(new java.awt.Color(255, 255, 255));
        jPAgendar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jtUsuario1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jtUsuario1);

        btUsU1.setText("Editar");
        btUsU1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUsU1ActionPerformed(evt);
            }
        });

        btUsD1.setText("Eliminar");
        btUsD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUsD1ActionPerformed(evt);
            }
        });

        btRlUPS1.setText("S");
        btRlUPS1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRlUPS1ActionPerformed(evt);
            }
        });

        btRlUPN1.setText("N");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btUsU1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btUsD1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btRlUPS1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btRlUPN1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txUsS, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btUsU1)
                        .addComponent(btUsD1)
                        .addComponent(txUsS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btRlUPS1)
                    .addComponent(btRlUPN1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPAgendar.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 910, 220));

        jLabel23.setText("Id");
        jPAgendar.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel24.setText("Cedula");
        jPAgendar.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));
        jPAgendar.add(txUsCed, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 100, -1));
        jPAgendar.add(txUsId, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 20, -1));

        btUsG.setText("Guardar");
        btUsG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUsGActionPerformed(evt);
            }
        });
        jPAgendar.add(btUsG, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 140, -1, -1));

        jLabel25.setText("Nombre");
        jPAgendar.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, -1, -1));

        jLabel26.setText("Apellido");
        jPAgendar.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, -1, -1));
        jPAgendar.add(txUsNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 120, -1));
        jPAgendar.add(txUsApe, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 140, -1));
        jPAgendar.add(txUsCor, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 110, 130, -1));

        jLabel7.setText("Correo");
        jPAgendar.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 110, -1, -1));

        jLabel8.setText("Telefono");
        jPAgendar.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 110, -1, -1));
        jPAgendar.add(txUsTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 110, 110, -1));
        jPAgendar.add(txUsCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 90, -1));

        jLabel9.setText("Direccion");
        jPAgendar.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, -1, -1));

        jLabel10.setText("Contraseña");
        jPAgendar.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));
        jPAgendar.add(txUsDir, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 330, -1));

        jLabel11.setText("Rol");
        jPAgendar.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 140, -1, -1));

        cbRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRolActionPerformed(evt);
            }
        });
        jPAgendar.add(cbRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 140, 120, -1));

        jbSalir.setBackground(new java.awt.Color(238, 111, 82));
        jbSalir.setFont(new java.awt.Font("Cooper Black", 0, 12)); // NOI18N
        jbSalir.setForeground(new java.awt.Color(238, 111, 82));
        jbSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Exit_41038.png"))); // NOI18N
        jbSalir.setText("REGRESAR");
        jbSalir.setBorder(null);
        jbSalir.setBorderPainted(false);
        jbSalir.setContentAreaFilled(false);
        jbSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbSalirMouseClicked(evt);
            }
        });
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });
        jPAgendar.add(jbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 430, -1, -1));

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(153, 153, 153));
        jLabel21.setText("Buscar...");
        jLabel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 99, 71)));
        jPAgendar.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 230, 30));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Search_32px_2.png"))); // NOI18N
        jPAgendar.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        jLabel31.setBackground(new java.awt.Color(238, 111, 82));
        jLabel31.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(238, 111, 82));
        jLabel31.setText("AGENDAR");
        jPAgendar.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, -1, -1));

        getContentPane().add(jPAgendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1030, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtUserActionPerformed

    private void jtxtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtPassActionPerformed
       
    }//GEN-LAST:event_jtxtPassActionPerformed

    private void jlMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlMinimizarMouseClicked
        this.setState(Principal.ICONIFIED);
    }//GEN-LAST:event_jlMinimizarMouseClicked

    private void jlSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlSalirMouseClicked
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "¿Desea salir?", "SALIR", dialog);
        if (result == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jlSalirMouseClicked

    private void jBagendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBagendarActionPerformed
        blanco();
        this.jPAgendar.setVisible(true);
    }//GEN-LAST:event_jBagendarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       blanco();
        jPCliente.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       blanco();
       jPBus.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       blanco();
       jPRuta.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        blanco();
        jPCooperativa.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
       blanco();
       jPRol.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jBagendarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBagendarMouseMoved
        jBagendar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(238, 111, 82)));
    }//GEN-LAST:event_jBagendarMouseMoved

    private void jBagendarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBagendarMouseExited
        jBagendar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_jBagendarMouseExited

    private void jBM1RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBM1RegistrarActionPerformed
        blanco();
        JPMRegistro.setVisible(true);
    }//GEN-LAST:event_jBM1RegistrarActionPerformed

    private void jtxtUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtUserMouseClicked
        jtxtUser.setText("");
    }//GEN-LAST:event_jtxtUserMouseClicked

    private void jtxtPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtPassMouseClicked
        jtxtPass.setText("");
    }//GEN-LAST:event_jtxtPassMouseClicked

    private void btUsD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUsD1ActionPerformed


    }//GEN-LAST:event_btUsD1ActionPerformed

    private void btRlUPS1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRlUPS1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btRlUPS1ActionPerformed

    private void btUsGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUsGActionPerformed

        // paso 5 cargar desde el controlador el metodo para crear el objeto en cuestion
        Controlador con = new Controlador();
        con.crearUsuario(this.txUsCed.getText(), this.txUsNom.getText(),
                this.txUsApe.getText(), this.txUsTel.getText(),
                this.txUsCor.getText(), this.txUsDir.getText(),
                this.txUsCon.getText(),
                this.cbRol.getItemAt(this.cbRol.getSelectedIndex()));


    }//GEN-LAST:event_btUsGActionPerformed

    private void cbRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRolActionPerformed

    }//GEN-LAST:event_cbRolActionPerformed

    private void btUsU1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUsU1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btUsU1ActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        salirM2();

    }//GEN-LAST:event_jbSalirActionPerformed

    private void JBM2SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBM2SalirActionPerformed
     inicio();
    }//GEN-LAST:event_JBM2SalirActionPerformed

    private void jBM1rutasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBM1rutasActionPerformed
       blanco();
        jPM1Rutasprecio.setVisible(true);
        jPIngreso.setVisible(true);
        jPSalir.setVisible(true);

    }//GEN-LAST:event_jBM1rutasActionPerformed

    private void jBM1horariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBM1horariosActionPerformed
     blanco();
        jPM1Horarios.setVisible(true);
        jPIngreso.setVisible(true);
        jPSalir.setVisible(true);
    }//GEN-LAST:event_jBM1horariosActionPerformed

    private void JBIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBIngresarActionPerformed
        Controller control = new Controller();
        Boolean resp = control.login();
        if (resp == true) {
            jPM1Rutasprecio.setVisible(false);
            JPMRegistro.setVisible(false);
            jPMenu2.setVisible(true);
            jPAgendar.setVisible(false);
            jPM1Precios.setVisible(false);
            jPM1Horarios.setVisible(false);
            jPMenu1.setVisible(false);
            jPIngreso.setVisible(false);
            jPSalir.setVisible(true);
            JOptionPane.showMessageDialog(null, "Bienvenido");
        } else {
            JOptionPane.showMessageDialog(null, "Datos incorrectos");
        }
    }//GEN-LAST:event_JBIngresarActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        blanco();
        jPAsiento.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
       blanco();
        jPUsuario.setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
      blanco();
      jPCiudad.setVisible(true);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jBhregresdarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBhregresdarActionPerformed
        inicio();
    }//GEN-LAST:event_jBhregresdarActionPerformed

    private void jBRPregresdar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRPregresdar1ActionPerformed
        inicio();
    }//GEN-LAST:event_jBRPregresdar1ActionPerformed

    private void JBRegSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBRegSalirActionPerformed
        inicio();
    }//GEN-LAST:event_JBRegSalirActionPerformed

    private void JBM2Salir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBM2Salir1ActionPerformed
        salirM2();
    }//GEN-LAST:event_JBM2Salir1ActionPerformed

    private void JBM2Salir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBM2Salir2ActionPerformed
        salirM2();
    }//GEN-LAST:event_JBM2Salir2ActionPerformed

    private void JBM2Salir3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBM2Salir3ActionPerformed
        salirM2();
    }//GEN-LAST:event_JBM2Salir3ActionPerformed

    private void JBM2Salir4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBM2Salir4ActionPerformed
        salirM2();
    }//GEN-LAST:event_JBM2Salir4ActionPerformed

    private void JBM2Salir5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBM2Salir5ActionPerformed
        salirM2();
    }//GEN-LAST:event_JBM2Salir5ActionPerformed

    private void JBM2Salir6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBM2Salir6ActionPerformed
        salirM2();
    }//GEN-LAST:event_JBM2Salir6ActionPerformed

    private void JBM2Salir7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBM2Salir7ActionPerformed
        salirM2();
    }//GEN-LAST:event_JBM2Salir7ActionPerformed

    private void JBM2Salir8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBM2Salir8ActionPerformed
        salirM2();
    }//GEN-LAST:event_JBM2Salir8ActionPerformed

    private void jbSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbSalirMouseClicked

    }//GEN-LAST:event_jbSalirMouseClicked

    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton JBIngresar;
    private javax.swing.JButton JBM2Salir;
    private javax.swing.JButton JBM2Salir1;
    private javax.swing.JButton JBM2Salir2;
    private javax.swing.JButton JBM2Salir3;
    private javax.swing.JButton JBM2Salir4;
    private javax.swing.JButton JBM2Salir5;
    private javax.swing.JButton JBM2Salir6;
    private javax.swing.JButton JBM2Salir7;
    private javax.swing.JButton JBM2Salir8;
    private javax.swing.JButton JBRegSalir;
    private javax.swing.JPanel JPMRegistro;
    private javax.swing.JTable JTM1ruta;
    private javax.swing.JTextField JTRApellido;
    private javax.swing.JTextField JTRCedula;
    private javax.swing.JTextField JTRContraseña;
    private javax.swing.JTextField JTRCorreo;
    private javax.swing.JTextField JTRDireccion;
    private javax.swing.JTextField JTRNombre;
    private javax.swing.JTextField JTRTelefono;
    private javax.swing.JButton btRlUPN1;
    private javax.swing.JButton btRlUPS1;
    private javax.swing.JButton btUsD1;
    private javax.swing.JButton btUsG;
    private javax.swing.JButton btUsU1;
    private javax.swing.JComboBox<Rol> cbRol;
    public static javax.swing.JButton jBM1Registrar;
    private javax.swing.JButton jBM1horarios;
    private javax.swing.JButton jBM1rutas;
    private javax.swing.JButton jBRPregresdar1;
    private javax.swing.JButton jBagendar;
    private javax.swing.JButton jBhregresdar;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLapll;
    private javax.swing.JLabel jLced;
    private javax.swing.JLabel jLnom;
    private javax.swing.JPanel jPAgendar;
    private javax.swing.JPanel jPAsiento;
    private javax.swing.JPanel jPBus;
    private javax.swing.JPanel jPCiudad;
    private javax.swing.JPanel jPCliente;
    private javax.swing.JPanel jPCooperativa;
    private javax.swing.JPanel jPIngreso;
    private javax.swing.JPanel jPM1Horarios;
    private javax.swing.JPanel jPM1Precios;
    private javax.swing.JPanel jPM1Rutasprecio;
    private javax.swing.JPanel jPMenu1;
    private javax.swing.JPanel jPMenu2;
    private javax.swing.JPanel jPRol;
    private javax.swing.JPanel jPRuta;
    private javax.swing.JPanel jPSalir;
    private javax.swing.JPanel jPUsuario;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel jlMinimizar;
    private javax.swing.JLabel jlSalir;
    private javax.swing.JTable jtUsuario1;
    public static javax.swing.JPasswordField jtxtPass;
    public static javax.swing.JTextField jtxtUser;
    private javax.swing.JTextField txUsApe;
    private javax.swing.JTextField txUsCed;
    private javax.swing.JTextField txUsCon;
    private javax.swing.JTextField txUsCor;
    private javax.swing.JTextField txUsDir;
    private javax.swing.JTextField txUsId;
    private javax.swing.JTextField txUsNom;
    private javax.swing.JTextField txUsS;
    private javax.swing.JTextField txUsTel;
    // End of variables declaration//GEN-END:variables
}
