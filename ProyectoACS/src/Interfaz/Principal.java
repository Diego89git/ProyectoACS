package Interfaz;

import Controlador.Controller;
import Objetos.Bus;
import Objetos.Ciudad;
import Objetos.Cooperativa;
import Objetos.Rol;
import Objetos.Usuario;
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

        jPBus = new javax.swing.JPanel();
        JBM2Salir2 = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        txBusPla = new javax.swing.JTextField();
        txBusId = new javax.swing.JTextField();
        btBusG = new javax.swing.JButton();
        txBusAño = new javax.swing.JTextField();
        jLabel72 = new javax.swing.JLabel();
        txBusMar = new javax.swing.JTextField();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btBusU = new javax.swing.JButton();
        btBusD = new javax.swing.JButton();
        txBusS = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtBus = new javax.swing.JTable();
        cbBusCop = new javax.swing.JComboBox<>();
        jPCliente = new javax.swing.JPanel();
        JBM2Salir5 = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jtCliente = new javax.swing.JTable();
        btClU = new javax.swing.JButton();
        btClD = new javax.swing.JButton();
        txClS = new javax.swing.JTextField();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        txClCed = new javax.swing.JTextField();
        txClId = new javax.swing.JTextField();
        btClG = new javax.swing.JButton();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        txClNom = new javax.swing.JTextField();
        txClApe = new javax.swing.JTextField();
        txClCor = new javax.swing.JTextField();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        txClTel = new javax.swing.JTextField();
        txClCon = new javax.swing.JTextField();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        txClDir = new javax.swing.JTextField();
        jPUsuario = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        JBM2Salir4 = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jtUsuario = new javax.swing.JTable();
        btUsU = new javax.swing.JButton();
        btUsD = new javax.swing.JButton();
        txUsS1 = new javax.swing.JTextField();
        btRlUPS2 = new javax.swing.JButton();
        btRlUPN2 = new javax.swing.JButton();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        txUsCed1 = new javax.swing.JTextField();
        txUsId1 = new javax.swing.JTextField();
        btUsG1 = new javax.swing.JButton();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        txUsNom1 = new javax.swing.JTextField();
        txUsApe1 = new javax.swing.JTextField();
        txUsCor1 = new javax.swing.JTextField();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        txUsTel1 = new javax.swing.JTextField();
        txUsCon1 = new javax.swing.JTextField();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        txUsDir1 = new javax.swing.JTextField();
        jLabel83 = new javax.swing.JLabel();
        cbRol1 = new javax.swing.JComboBox<>();
        jPRol = new javax.swing.JPanel();
        JBM2Salir8 = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jtRol = new javax.swing.JTable();
        btRlU = new javax.swing.JButton();
        btRlD = new javax.swing.JButton();
        txRlS = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        txRlDescripcion = new javax.swing.JTextField();
        txRlId = new javax.swing.JTextField();
        btRlG = new javax.swing.JButton();
        btRlUPS = new javax.swing.JButton();
        btRlUPN = new javax.swing.JButton();
        jPCiudad = new javax.swing.JPanel();
        JBM2Salir7 = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtCiudad = new javax.swing.JTable();
        btCiuU = new javax.swing.JButton();
        btCiuD = new javax.swing.JButton();
        txCiuS = new javax.swing.JTextField();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        txCiuNom = new javax.swing.JTextField();
        txCiuID = new javax.swing.JTextField();
        btCiuG = new javax.swing.JButton();
        jLabel67 = new javax.swing.JLabel();
        txCiuCodPos = new javax.swing.JTextField();
        jPAsiento = new javax.swing.JPanel();
        JBM2Salir3 = new javax.swing.JButton();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        Numero = new javax.swing.JLabel();
        txAsNum = new javax.swing.JTextField();
        txAsId = new javax.swing.JTextField();
        btAsG = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jtAsiento = new javax.swing.JTable();
        btAsU = new javax.swing.JButton();
        btAsD = new javax.swing.JButton();
        txAsS = new javax.swing.JTextField();
        txAsUbi = new javax.swing.JTextField();
        Ubicacion = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        cbAsBus = new javax.swing.JComboBox<>();
        jPCooperativa = new javax.swing.JPanel();
        JBM2Salir6 = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        txCopNom = new javax.swing.JTextField();
        txCopId = new javax.swing.JTextField();
        btCopG = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jtCop = new javax.swing.JTable();
        btCopU = new javax.swing.JButton();
        btCopD = new javax.swing.JButton();
        txCopS = new javax.swing.JTextField();
        txCopRuc = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        txCopDir = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        txCopTel = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        txCopCor = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        jPRuta = new javax.swing.JPanel();
        JBM2Salir1 = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        txRtId = new javax.swing.JTextField();
        btRtG = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jtRuta = new javax.swing.JTable();
        btRtU = new javax.swing.JButton();
        btRtD = new javax.swing.JButton();
        txRtS = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        txRtPpj = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        txRtEst = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        cbRtBus = new javax.swing.JComboBox<>();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        cbRtUsu = new javax.swing.JComboBox<>();
        cbRtCO = new javax.swing.JComboBox<>();
        cbRtCD = new javax.swing.JComboBox<>();
        dcRtFhl = new com.toedter.calendar.JDateChooser();
        dcRtFhs = new com.toedter.calendar.JDateChooser();
        jPSalir = new javax.swing.JPanel();
        jlSalir = new javax.swing.JLabel();
        jlMinimizar = new javax.swing.JLabel();
        jPMenu1 = new javax.swing.JPanel();
        jBM1rutas = new javax.swing.JButton();
        jBM1horarios = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
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
        jLabel37.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        jLabel37.setText("BUS");
        jPBus.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, -1, -1));

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bus_icon-icons.com_76529.png"))); // NOI18N
        jPBus.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabel70.setText("Id");
        jPBus.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, -1, -1));

        jLabel71.setText("Placa");
        jPBus.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, -1, -1));
        jPBus.add(txBusPla, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 80, -1));
        jPBus.add(txBusId, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 25, -1));

        btBusG.setText("Guardar");
        btBusG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBusGActionPerformed(evt);
            }
        });
        jPBus.add(btBusG, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 150, -1, -1));
        jPBus.add(txBusAño, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 120, 73, -1));

        jLabel72.setText("Año");
        jPBus.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, -1, -1));
        jPBus.add(txBusMar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 74, -1));

        jLabel73.setText("Marca");
        jPBus.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 120, -1, -1));

        jLabel74.setText("Cooperativa");
        jPBus.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btBusU.setText("Editar");
        btBusU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBusUActionPerformed(evt);
            }
        });

        btBusD.setText("Eliminar");
        btBusD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBusDActionPerformed(evt);
            }
        });

        jtBus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jtBus);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btBusU)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btBusD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txBusS, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 187, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btBusU)
                    .addComponent(btBusD)
                    .addComponent(txBusS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPBus.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 430, 210));

        jPBus.add(cbBusCop, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 200, -1));

        getContentPane().add(jPBus, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1030, 520));

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
        jLabel41.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(51, 51, 51));
        jLabel41.setText("CLIENTE");
        jPCliente.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, -1, -1));

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/customer_person_people_man_you_1625.png"))); // NOI18N
        jPCliente.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane11.setViewportView(jtCliente);

        jPanel12.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 720, 109));

        btClU.setText("Editar");
        jPanel12.add(btClU, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        btClD.setText("Eliminar");
        jPanel12.add(btClD, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 11, -1, -1));
        jPanel12.add(txClS, new org.netbeans.lib.awtextra.AbsoluteConstraints(657, 12, 73, -1));

        jPCliente.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 740, 160));

        jLabel84.setText("Id");
        jPCliente.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, -1, -1));

        jLabel85.setText("Cedula");
        jPCliente.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, -1, -1));
        jPCliente.add(txClCed, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 90, -1));
        jPCliente.add(txClId, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 30, -1));

        btClG.setText("Guardar");
        btClG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClGActionPerformed(evt);
            }
        });
        jPCliente.add(btClG, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 180, -1, -1));

        jLabel86.setText("Nombre");
        jPCliente.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, -1, -1));

        jLabel87.setText("Apellido");
        jPCliente.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, -1, -1));
        jPCliente.add(txClNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 120, -1));
        jPCliente.add(txClApe, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, 100, -1));
        jPCliente.add(txClCor, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 140, -1));

        jLabel88.setText("Correo");
        jPCliente.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, -1, -1));

        jLabel89.setText("Telefono");
        jPCliente.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 150, -1, -1));

        txClTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txClTelActionPerformed(evt);
            }
        });
        jPCliente.add(txClTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 150, 100, -1));
        jPCliente.add(txClCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 180, 100, -1));

        jLabel90.setText("Direccion");
        jPCliente.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, -1, -1));

        jLabel91.setText("Contraseña");
        jPCliente.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, -1, -1));
        jPCliente.add(txClDir, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 150, -1));

        getContentPane().add(jPCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 41, 1030, 520));

        jPUsuario.setBackground(new java.awt.Color(255, 255, 255));
        jPUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0), 4));
        jPUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel40.setBackground(new java.awt.Color(238, 111, 82));
        jLabel40.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
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
        jPUsuario.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane10.setViewportView(jtUsuario);

        jPanel4.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 45, 890, 164));

        btUsU.setText("Editar");
        jPanel4.add(btUsU, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        btUsD.setText("Eliminar");
        btUsD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUsDActionPerformed(evt);
            }
        });
        jPanel4.add(btUsD, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 11, -1, -1));
        jPanel4.add(txUsS1, new org.netbeans.lib.awtextra.AbsoluteConstraints(827, 12, 73, -1));

        btRlUPS2.setText("S");
        btRlUPS2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRlUPS2ActionPerformed(evt);
            }
        });
        jPanel4.add(btRlUPS2, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 11, 50, -1));

        btRlUPN2.setText("N");
        jPanel4.add(btRlUPN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 11, -1, -1));

        jPUsuario.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 910, 220));

        jLabel75.setText("Id");
        jPUsuario.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 20, -1));

        jLabel76.setText("Cedula");
        jPUsuario.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, -1, -1));
        jPUsuario.add(txUsCed1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 100, -1));
        jPUsuario.add(txUsId1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 20, -1));

        btUsG1.setText("Guardar");
        btUsG1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUsG1ActionPerformed(evt);
            }
        });
        jPUsuario.add(btUsG1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 170, -1, -1));

        jLabel77.setText("Nombre");
        jPUsuario.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, -1, -1));

        jLabel78.setText("Apellido");
        jPUsuario.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, -1, -1));
        jPUsuario.add(txUsNom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 120, -1));
        jPUsuario.add(txUsApe1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 140, -1));
        jPUsuario.add(txUsCor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 140, 130, -1));

        jLabel79.setText("Correo");
        jPUsuario.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 140, -1, -1));

        jLabel80.setText("Telefono");
        jPUsuario.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 140, -1, -1));
        jPUsuario.add(txUsTel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 140, 110, -1));
        jPUsuario.add(txUsCon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 90, -1));

        jLabel81.setText("Direccion");
        jPUsuario.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, -1, -1));

        jLabel82.setText("Contraseña");
        jPUsuario.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));
        jPUsuario.add(txUsDir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 330, -1));

        jLabel83.setText("Rol");
        jPUsuario.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 170, -1, -1));

        cbRol1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRol1ActionPerformed(evt);
            }
        });
        jPUsuario.add(cbRol1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 170, 120, -1));

        getContentPane().add(jPUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 41, 1030, 520));

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
        jLabel33.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        jLabel33.setText("ROL");
        jPRol.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, -1, -1));

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Maintenance_96px.png"))); // NOI18N
        jPRol.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtRol.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane8.setViewportView(jtRol);

        jPanel8.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 45, 267, 169));

        btRlU.setText("Editar");
        btRlU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRlUActionPerformed(evt);
            }
        });
        jPanel8.add(btRlU, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        btRlD.setText("Eliminar");
        btRlD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRlDActionPerformed(evt);
            }
        });
        jPanel8.add(btRlD, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 11, -1, -1));
        jPanel8.add(txRlS, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 12, 73, -1));

        jPRol.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, 287, -1));

        jLabel68.setText("Id");
        jPRol.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 30, -1));

        jLabel69.setText("Descripcion");
        jPRol.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, -1, -1));
        jPRol.add(txRlDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 169, -1));
        jPRol.add(txRlId, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 120, 30, -1));

        btRlG.setText("Guardar");
        btRlG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRlGActionPerformed(evt);
            }
        });
        jPRol.add(btRlG, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 160, -1, -1));

        btRlUPS.setText("S");
        btRlUPS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRlUPSActionPerformed(evt);
            }
        });
        jPRol.add(btRlUPS, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 50, -1));

        btRlUPN.setText("N");
        jPRol.add(btRlUPN, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, -1, -1));

        getContentPane().add(jPRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1030, 520));

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
        jLabel32.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        jLabel32.setText("CIUDAD");
        jPCiudad.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, -1, -1));

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/_123049.png"))); // NOI18N
        jPCiudad.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtCiudad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(jtCiudad);

        jPanel6.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 390, 269));

        btCiuU.setText("Editar");
        jPanel6.add(btCiuU, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        btCiuD.setText("Eliminar");
        jPanel6.add(btCiuD, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 11, -1, -1));
        jPanel6.add(txCiuS, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 11, 73, -1));

        jPCiudad.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 410, 320));

        jLabel65.setText("Id");
        jPCiudad.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 20, -1));

        jLabel66.setText("Nombre");
        jPCiudad.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, -1, -1));
        jPCiudad.add(txCiuNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 80, -1));
        jPCiudad.add(txCiuID, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 20, -1));

        btCiuG.setText("Guardar");
        btCiuG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCiuGActionPerformed(evt);
            }
        });
        jPCiudad.add(btCiuG, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 90, 80, -1));

        jLabel67.setText("Codigo Postal");
        jPCiudad.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, -1, -1));
        jPCiudad.add(txCiuCodPos, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, 60, -1));

        getContentPane().add(jPCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1030, 520));

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
        jLabel44.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        jLabel44.setText("ASIENTO");
        jPAsiento.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, -1, -1));

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/airline-seat-recline-normal_119451.png"))); // NOI18N
        jPAsiento.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jLabel63.setText("Id");
        jPAsiento.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, -1, -1));

        Numero.setText("Numero");
        jPAsiento.add(Numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, -1, -1));
        jPAsiento.add(txAsNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 130, 90, -1));
        jPAsiento.add(txAsId, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 20, -1));

        btAsG.setText("Guardar");
        btAsG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAsGActionPerformed(evt);
            }
        });
        jPAsiento.add(btAsG, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 200, -1, -1));

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtAsiento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane7.setViewportView(jtAsiento);

        jPanel14.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 420, 111));

        btAsU.setText("Editar");
        jPanel14.add(btAsU, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        btAsD.setText("Eliminar");
        jPanel14.add(btAsD, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 11, -1, -1));
        jPanel14.add(txAsS, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 12, 73, -1));

        jPAsiento.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 440, 160));
        jPAsiento.add(txAsUbi, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 140, -1));

        Ubicacion.setText("Ubicacion");
        jPAsiento.add(Ubicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, -1, -1));

        jLabel64.setText("Bus");
        jPAsiento.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, -1, -1));

        jPAsiento.add(cbAsBus, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 150, -1));

        getContentPane().add(jPAsiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1030, 520));

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
        jLabel36.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        jLabel36.setText("COOPERATIVA");
        jPCooperativa.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, -1, -1));

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Handshake_96px.png"))); // NOI18N
        jPCooperativa.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel57.setText("Id");
        jPCooperativa.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, -1, -1));

        jLabel58.setText("Nombre");
        jPCooperativa.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, -1, -1));
        jPCooperativa.add(txCopNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 130, -1));
        jPCooperativa.add(txCopId, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 10, -1));

        btCopG.setText("Guardar");
        btCopG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCopGActionPerformed(evt);
            }
        });
        jPCooperativa.add(btCopG, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 150, -1, -1));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtCop.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane6.setViewportView(jtCop);

        jPanel10.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 740, 147));

        btCopU.setText("Editar");
        jPanel10.add(btCopU, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 11, -1, -1));

        btCopD.setText("Eliminar");
        btCopD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCopDActionPerformed(evt);
            }
        });
        jPanel10.add(btCopD, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 11, -1, -1));
        jPanel10.add(txCopS, new org.netbeans.lib.awtextra.AbsoluteConstraints(677, 12, 73, -1));

        jPCooperativa.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 760, 210));
        jPCooperativa.add(txCopRuc, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 130, -1));

        jLabel59.setText("RUC");
        jPCooperativa.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, -1, -1));
        jPCooperativa.add(txCopDir, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 420, -1));

        jLabel60.setText("Direccion");
        jPCooperativa.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, -1, -1));
        jPCooperativa.add(txCopTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, 60, -1));

        jLabel61.setText("Telefono");
        jPCooperativa.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, -1, -1));
        jPCooperativa.add(txCopCor, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 120, 160, -1));

        jLabel62.setText("Correo");
        jPCooperativa.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 120, -1, -1));

        getContentPane().add(jPCooperativa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1030, 520));

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
        jPRuta.add(JBM2Salir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 450, -1, -1));

        jLabel34.setBackground(new java.awt.Color(238, 111, 82));
        jLabel34.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        jLabel34.setText("RUTA");
        jPRuta.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, -1, -1));

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/map_route_10854.png"))); // NOI18N
        jPRuta.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel48.setText("Id");
        jPRuta.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));

        jLabel49.setText("Fecha y hora salida");
        jPRuta.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, -1, -1));
        jPRuta.add(txRtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 10, -1));

        btRtG.setText("Guardar");
        btRtG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRtGActionPerformed(evt);
            }
        });
        jPRuta.add(btRtG, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 180, -1, -1));

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtRuta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane9.setViewportView(jtRuta);

        jPanel18.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 740, 176));

        btRtU.setText("Editar");
        jPanel18.add(btRtU, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, -1, -1));

        btRtD.setText("Eliminar");
        jPanel18.add(btRtD, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 14, -1, -1));
        jPanel18.add(txRtS, new org.netbeans.lib.awtextra.AbsoluteConstraints(668, 15, 73, -1));

        jPRuta.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 760, 230));

        jLabel50.setText("Fecha y hora llegada");
        jPRuta.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, -1, -1));
        jPRuta.add(txRtPpj, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 140, 100, -1));

        jLabel51.setText("Precio Pasaje");
        jPRuta.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 140, -1, -1));
        jPRuta.add(txRtEst, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 110, -1));

        jLabel52.setText("Estado");
        jPRuta.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, -1, -1));

        jLabel53.setText("Bus");
        jPRuta.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, -1, -1));

        jPRuta.add(cbRtBus, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 160, -1));

        jLabel54.setText("Usuario");
        jPRuta.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, -1));

        jLabel55.setText("Ciudad Origen");
        jPRuta.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, -1, 26));

        jLabel56.setText("Ciudad Destino");
        jPRuta.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, -1, -1));

        jPRuta.add(cbRtUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 160, -1));

        jPRuta.add(cbRtCO, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 180, -1));

        jPRuta.add(cbRtCD, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 180, -1));
        jPRuta.add(dcRtFhl, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 100, 130, -1));
        jPRuta.add(dcRtFhs, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 130, -1));

        getContentPane().add(jPRuta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1030, 520));

        jPSalir.setBackground(new java.awt.Color(255, 255, 255));
        jPSalir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0), 4));
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
        jPSalir.add(jlSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 0, 30, 30));

        jlMinimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Expand_Arrow_32px.png"))); // NOI18N
        jlMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlMinimizarMouseClicked(evt);
            }
        });
        jPSalir.add(jlMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, -1, 30));

        getContentPane().add(jPSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 40));

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

        JPMRegistro.setBackground(new java.awt.Color(255, 255, 255));
        JPMRegistro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0), 4));
        JPMRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JPMRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/addUser.png"))); // NOI18N
        JPMRegistro.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel14.setBackground(new java.awt.Color(238, 111, 82));
        jLabel14.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        jLabel14.setText("REGISTRO DE USUARIOS.");
        JPMRegistro.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, -1, -1));

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
        jLabel20.setFont(new java.awt.Font("Cooper Black", 0, 36)); // NOI18N
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

    private void btRtGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRtGActionPerformed
    
    }//GEN-LAST:event_btRtGActionPerformed

    private void btCopGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCopGActionPerformed
 
    }//GEN-LAST:event_btCopGActionPerformed

    private void btCopDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCopDActionPerformed
    
    }//GEN-LAST:event_btCopDActionPerformed

    private void btAsGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAsGActionPerformed

     

    }//GEN-LAST:event_btAsGActionPerformed

    private void btCiuGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCiuGActionPerformed
  
    }//GEN-LAST:event_btCiuGActionPerformed

    private void btRlUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRlUActionPerformed
    
    }//GEN-LAST:event_btRlUActionPerformed

    private void btRlDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRlDActionPerformed
  
    }//GEN-LAST:event_btRlDActionPerformed

    private void btRlGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRlGActionPerformed
     
    }//GEN-LAST:event_btRlGActionPerformed

    private void btRlUPSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRlUPSActionPerformed
 
    }//GEN-LAST:event_btRlUPSActionPerformed

    private void btBusGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBusGActionPerformed

    }//GEN-LAST:event_btBusGActionPerformed

    private void btBusUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBusUActionPerformed

    }//GEN-LAST:event_btBusUActionPerformed

    private void btBusDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBusDActionPerformed
 
    }//GEN-LAST:event_btBusDActionPerformed

    private void btUsDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUsDActionPerformed
 
    }//GEN-LAST:event_btUsDActionPerformed

    private void btRlUPS2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRlUPS2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btRlUPS2ActionPerformed

    private void btUsG1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUsG1ActionPerformed


    }//GEN-LAST:event_btUsG1ActionPerformed

    private void cbRol1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRol1ActionPerformed

    }//GEN-LAST:event_cbRol1ActionPerformed

    private void btClGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClGActionPerformed
    

    }//GEN-LAST:event_btClGActionPerformed

    private void txClTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txClTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txClTelActionPerformed

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
    private javax.swing.JLabel Numero;
    private javax.swing.JLabel Ubicacion;
    private javax.swing.JButton btAsD;
    private javax.swing.JButton btAsG;
    private javax.swing.JButton btAsU;
    private javax.swing.JButton btBusD;
    private javax.swing.JButton btBusG;
    private javax.swing.JButton btBusU;
    private javax.swing.JButton btCiuD;
    private javax.swing.JButton btCiuG;
    private javax.swing.JButton btCiuU;
    private javax.swing.JButton btClD;
    private javax.swing.JButton btClG;
    private javax.swing.JButton btClU;
    private javax.swing.JButton btCopD;
    private javax.swing.JButton btCopG;
    private javax.swing.JButton btCopU;
    private javax.swing.JButton btRlD;
    private javax.swing.JButton btRlG;
    private javax.swing.JButton btRlU;
    private javax.swing.JButton btRlUPN;
    private javax.swing.JButton btRlUPN1;
    private javax.swing.JButton btRlUPN2;
    private javax.swing.JButton btRlUPS;
    private javax.swing.JButton btRlUPS1;
    private javax.swing.JButton btRlUPS2;
    private javax.swing.JButton btRtD;
    private javax.swing.JButton btRtG;
    private javax.swing.JButton btRtU;
    private javax.swing.JButton btUsD;
    private javax.swing.JButton btUsD1;
    private javax.swing.JButton btUsG;
    private javax.swing.JButton btUsG1;
    private javax.swing.JButton btUsU;
    private javax.swing.JButton btUsU1;
    private javax.swing.JComboBox<Bus> cbAsBus;
    private javax.swing.JComboBox<Cooperativa> cbBusCop;
    private javax.swing.JComboBox<Rol> cbRol;
    private javax.swing.JComboBox<Rol> cbRol1;
    private javax.swing.JComboBox<Bus> cbRtBus;
    private javax.swing.JComboBox<Ciudad> cbRtCD;
    private javax.swing.JComboBox<Ciudad> cbRtCO;
    private javax.swing.JComboBox<Usuario> cbRtUsu;
    private com.toedter.calendar.JDateChooser dcRtFhl;
    private com.toedter.calendar.JDateChooser dcRtFhs;
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
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
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
    private javax.swing.JPanel jPM1Rutasprecio;
    private javax.swing.JPanel jPMenu1;
    private javax.swing.JPanel jPMenu2;
    private javax.swing.JPanel jPRol;
    private javax.swing.JPanel jPRuta;
    private javax.swing.JPanel jPSalir;
    private javax.swing.JPanel jPUsuario;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
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
    private javax.swing.JTable jtAsiento;
    private javax.swing.JTable jtBus;
    private javax.swing.JTable jtCiudad;
    private javax.swing.JTable jtCliente;
    private javax.swing.JTable jtCop;
    private javax.swing.JTable jtRol;
    private javax.swing.JTable jtRuta;
    private javax.swing.JTable jtUsuario;
    private javax.swing.JTable jtUsuario1;
    public static javax.swing.JPasswordField jtxtPass;
    public static javax.swing.JTextField jtxtUser;
    private javax.swing.JTextField txAsId;
    private javax.swing.JTextField txAsNum;
    private javax.swing.JTextField txAsS;
    private javax.swing.JTextField txAsUbi;
    private javax.swing.JTextField txBusAño;
    private javax.swing.JTextField txBusId;
    private javax.swing.JTextField txBusMar;
    private javax.swing.JTextField txBusPla;
    private javax.swing.JTextField txBusS;
    private javax.swing.JTextField txCiuCodPos;
    private javax.swing.JTextField txCiuID;
    private javax.swing.JTextField txCiuNom;
    private javax.swing.JTextField txCiuS;
    private javax.swing.JTextField txClApe;
    private javax.swing.JTextField txClCed;
    private javax.swing.JTextField txClCon;
    private javax.swing.JTextField txClCor;
    private javax.swing.JTextField txClDir;
    private javax.swing.JTextField txClId;
    private javax.swing.JTextField txClNom;
    private javax.swing.JTextField txClS;
    private javax.swing.JTextField txClTel;
    private javax.swing.JTextField txCopCor;
    private javax.swing.JTextField txCopDir;
    private javax.swing.JTextField txCopId;
    private javax.swing.JTextField txCopNom;
    private javax.swing.JTextField txCopRuc;
    private javax.swing.JTextField txCopS;
    private javax.swing.JTextField txCopTel;
    private javax.swing.JTextField txRlDescripcion;
    private javax.swing.JTextField txRlId;
    private javax.swing.JTextField txRlS;
    private javax.swing.JTextField txRtEst;
    private javax.swing.JTextField txRtId;
    private javax.swing.JTextField txRtPpj;
    private javax.swing.JTextField txRtS;
    private javax.swing.JTextField txUsApe;
    private javax.swing.JTextField txUsApe1;
    private javax.swing.JTextField txUsCed;
    private javax.swing.JTextField txUsCed1;
    private javax.swing.JTextField txUsCon;
    private javax.swing.JTextField txUsCon1;
    private javax.swing.JTextField txUsCor;
    private javax.swing.JTextField txUsCor1;
    private javax.swing.JTextField txUsDir;
    private javax.swing.JTextField txUsDir1;
    private javax.swing.JTextField txUsId;
    private javax.swing.JTextField txUsId1;
    private javax.swing.JTextField txUsNom;
    private javax.swing.JTextField txUsNom1;
    private javax.swing.JTextField txUsS;
    private javax.swing.JTextField txUsS1;
    private javax.swing.JTextField txUsTel;
    private javax.swing.JTextField txUsTel1;
    // End of variables declaration//GEN-END:variables
}