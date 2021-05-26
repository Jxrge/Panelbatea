
package bateas.com.Marcos.David;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class cuerdas extends javax.swing.JFrame {

 
    public cuerdas() {
        initComponents();
        this.setLocationRelativeTo(null);
        int resultado1;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        NombreBatea = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        NumeroCuerdas = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Cuerdascria = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Desdoble = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Cuerdasdeventa = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Tiempodecuerdasdecria = new javax.swing.JTextField();
        Registrar = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        Buscar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        Cuerdasporponer = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Poligono = new javax.swing.JTextField();
        Cuadricula = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Localización = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        Tiempodecuerdasdesdoble = new javax.swing.JTextField();
        CalcularCuerdas = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        Totalcuerdascria = new javax.swing.JTextField();
        Calcularcuerdascria = new javax.swing.JButton();
        Calcularcuerdesdoble = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        Totalcuerdesdoble = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        Totalcuerdasventa = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        Kg = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        TotaldeKg = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        PrecioporKG = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        Importe = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        Totalprecio = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        PrecioIva = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        Ivatotal = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        PrecioconIva = new javax.swing.JTextField();
        Calcularimporte = new javax.swing.JButton();
        label_status = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        Fechaventa = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        jLabel19.setText("Total de Kg:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));
        jPanel1.setForeground(new java.awt.Color(51, 204, 255));

        jLabel1.setText("Nombre Batea:");

        jLabel2.setText("Nº Cuerdas:");

        NumeroCuerdas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumeroCuerdasActionPerformed(evt);
            }
        });

        jLabel3.setText("Cuerdas de Cria:");

        jLabel4.setText("Desdoble:");

        jLabel5.setText("Numero de cuerdas para la venta:");

        Cuerdasdeventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CuerdasdeventaActionPerformed(evt);
            }
        });

        jLabel6.setText("Maximo permitido:");

        jLabel7.setText("Fecha:");

        Registrar.setText("Registrar");
        Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarActionPerformed(evt);
            }
        });

        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        jLabel8.setText("Puedes poner:");

        jLabel9.setText("Localización:");

        jLabel10.setText("Polígono:");

        jLabel11.setText("Identificación");

        jLabel12.setText("Cuadrícula:");

        jLabel13.setText("Fecha:");

        CalcularCuerdas.setText("Calcular");
        CalcularCuerdas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularCuerdasActionPerformed(evt);
            }
        });

        jLabel15.setText("Total cuerdas cría:");

        Totalcuerdascria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalcuerdascriaActionPerformed(evt);
            }
        });

        Calcularcuerdascria.setText("Calcular");

        Calcularcuerdesdoble.setText("Calcular");

        jLabel16.setText("Total cuerdas desdoble:");

        Totalcuerdesdoble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalcuerdesdobleActionPerformed(evt);
            }
        });

        jLabel14.setText("Total de cuerdas:");

        jLabel17.setText("Kg:");

        Kg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KgActionPerformed(evt);
            }
        });

        jLabel18.setText("Total de Kg:");

        TotaldeKg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotaldeKgActionPerformed(evt);
            }
        });

        jLabel20.setText("Precio por Kg:");

        jLabel21.setText("Importe:");

        Importe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImporteActionPerformed(evt);
            }
        });

        jLabel22.setText("Precio Total:");

        Totalprecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalprecioActionPerformed(evt);
            }
        });

        jLabel23.setText("IVA:");

        PrecioIva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrecioIvaActionPerformed(evt);
            }
        });

        jLabel24.setText("Iva Total:");

        Ivatotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IvatotalActionPerformed(evt);
            }
        });

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("500");
        jLabel25.setOpaque(true);

        jLabel26.setText("Subtotal:");

        PrecioconIva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrecioconIvaActionPerformed(evt);
            }
        });

        Calcularimporte.setText("Calcular Precio");
        Calcularimporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularimporteActionPerformed(evt);
            }
        });

        label_status.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel27.setText("Fecha de la venta:");

        Fechaventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FechaventaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(NombreBatea, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(94, 94, 94)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Poligono, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Cuadricula, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Buscar)
                        .addGap(187, 187, 187))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Cuerdascria, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(NumeroCuerdas, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Desdoble, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(74, 74, 74)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Tiempodecuerdasdesdoble, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Tiempodecuerdasdecria, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(Registrar)
                                .addGap(130, 130, 130)
                                .addComponent(Modificar)
                                .addGap(142, 142, 142)
                                .addComponent(Eliminar)
                                .addGap(96, 96, 96)
                                .addComponent(Calcularimporte))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(label_status)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(Fechaventa, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(Cuerdasdeventa, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGap(34, 34, 34)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGap(27, 27, 27)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Kg, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Importe, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(29, 29, 29)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(PrecioporKG, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(PrecioIva, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(PrecioconIva, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(452, 452, 452)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(CalcularCuerdas)
                                        .addComponent(Calcularcuerdascria)
                                        .addComponent(Calcularcuerdesdoble))
                                    .addGap(44, 44, 44)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Cuerdasporponer, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel15)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Totalcuerdascria, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel16)
                                            .addGap(18, 18, 18)
                                            .addComponent(Totalcuerdesdoble, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(85, 85, 85)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Totalcuerdasventa, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(113, 113, 113)
                                    .addComponent(TotaldeKg, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(29, 29, 29)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(Ivatotal, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Totalprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(Localización, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreBatea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Buscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Poligono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cuadricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Localización, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NumeroCuerdas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CalcularCuerdas)
                    .addComponent(jLabel25)
                    .addComponent(Cuerdasporponer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cuerdascria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tiempodecuerdasdecria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Totalcuerdascria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Calcularcuerdascria))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Desdoble, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tiempodecuerdasdesdoble, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Calcularcuerdesdoble)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Totalcuerdesdoble, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Importe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Fechaventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label_status)
                        .addGap(31, 31, 31))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Cuerdasdeventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PrecioporKG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Kg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PrecioIva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PrecioconIva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Totalprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Totalcuerdasventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TotaldeKg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ivatotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Registrar)
                    .addComponent(Modificar)
                    .addComponent(Eliminar)
                    .addComponent(Calcularimporte))
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 864, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PrecioconIvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrecioconIvaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrecioconIvaActionPerformed

    private void IvatotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IvatotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IvatotalActionPerformed

    private void PrecioIvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrecioIvaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrecioIvaActionPerformed

    private void TotalprecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalprecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalprecioActionPerformed

    private void ImporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ImporteActionPerformed

    private void TotaldeKgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotaldeKgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotaldeKgActionPerformed

    private void KgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KgActionPerformed

    private void TotalcuerdesdobleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalcuerdesdobleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalcuerdesdobleActionPerformed

    private void TotalcuerdascriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalcuerdascriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalcuerdascriaActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
                      try{
          Connection sol = DriverManager.getConnection("jdbc:mysql://localhost/bateas","root","");
          PreparedStatement obx = sol.prepareStatement("delete from cuerdas where Nombre = ?");

          obx.setString(1, NombreBatea.getText().trim());
          obx.executeUpdate();
          
          NombreBatea.setText("");
          Poligono.setText("");
          Cuadricula.setText("");
          NumeroCuerdas.setText("");
          Localización.setText("");
          Cuerdasporponer.setText("");
          Cuerdascria.setText("");
          Tiempodecuerdasdecria.setText("");
          Totalcuerdascria.setText("");
          Desdoble.setText("");
          Tiempodecuerdasdesdoble.setText("");
          Totalcuerdesdoble.setText("");
          Cuerdasdeventa.setText("");
          Totalcuerdasventa.setText("");
          Kg.setText("");
          TotaldeKg.setText("");
          PrecioporKG.setText("");
          Importe.setText("");
          PrecioIva.setText("");
          PrecioconIva.setText("");
          Totalprecio.setText("");
          Ivatotal.setText("");
          
          
          
         label_status.setText("REGISTRO ELIMINADO");
          
        }catch(Exception a){
            
        }
    }//GEN-LAST:event_EliminarActionPerformed

    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed
               try{
        Connection ox= DriverManager.getConnection("jdbc:mysql://localhost/bateas","root","");
        
        PreparedStatement obx = ox.prepareStatement("insert into cuerdas values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        obx.setString(1, NombreBatea.getText().trim());
        obx.setString(2, Poligono.getText().trim());
        obx.setString(3, Cuadricula.getText().trim());
        obx.setString(4, Localización.getText().trim());
        obx.setString(5, NumeroCuerdas.getText().trim());
        obx.setString(6, NumeroCuerdas.getText().trim());
        obx.setString(7, Cuerdasporponer.getText().trim());
        obx.setString(8, Tiempodecuerdasdecria.getText().trim());
        obx.setString(9, Totalcuerdascria.getText().trim());
        obx.setString(10, Desdoble.getText().trim());
        obx.setString(11, Tiempodecuerdasdesdoble.getText().trim());
        obx.setString(12, Totalcuerdesdoble.getText().trim());
        obx.setString(13, Cuerdasdeventa.getText().trim());
        obx.setString(14, Kg.getText().trim());
        obx.setString(15, TotaldeKg.getText().trim());
        obx.setString(16, PrecioporKG.getText().trim());
        obx.setString(17, Importe.getText().trim());
        obx.setString(18, PrecioconIva.getText().trim());
        obx.setString(19, Fechaventa.getText().trim());
        obx.setString(20, Totalprecio.getText().trim());
        obx.setString(21, Ivatotal.getText().trim());
        obx.setString(22, Totalcuerdasventa.getText().trim());

        obx.executeUpdate();
        
        NombreBatea.setText("");
        Poligono.setText("");
        Cuadricula.setText("");
        Localización.setText("");
        NumeroCuerdas.setText("");
        Cuerdascria.setText("");
        Tiempodecuerdasdecria.setText("");
        Totalcuerdascria.setText("");
        Desdoble.setText("");
        Tiempodecuerdasdesdoble.setText("");
        Totalcuerdesdoble.setText("");
        Cuerdasdeventa.setText("");
        Kg.setText("");
        TotaldeKg.setText("");
        PrecioporKG.setText("");
        Importe.setText("");
        PrecioconIva.setText("");
        Fechaventa.setText("");
        Totalprecio.setText("");
        Ivatotal.setText("");
        Totalcuerdasventa.setText("");
        Cuerdasporponer.setText("");
        PrecioIva.setText("");
        

        
        
        label_status.setText("Registro Correcto");
        
           
        
       }catch (Exception a){
           
       }
    }//GEN-LAST:event_RegistrarActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
                    try{
        Connection ox= DriverManager.getConnection("jdbc:mysql://localhost/bateas","root","");
        PreparedStatement obx = ox.prepareStatement("select * from cuerdas where Nombre = ?");
        
        obx.setString(1, NombreBatea.getText().trim());
        
        ResultSet sol = obx.executeQuery();
        
        if(sol.next()){
            
        NombreBatea.setText(sol.getString("Nombre"));
        Poligono.setText(sol.getString("Poligono"));
        Cuadricula.setText(sol.getString("Cuadricula"));
        Localización.setText(sol.getString("Localizacion"));
        NumeroCuerdas.setText(sol.getString("Nº Cuerdas"));
        Cuerdasporponer.setText(sol.getString("Puedes poner"));
        Cuerdascria.setText(sol.getString("Nº Cuerdas de Cria"));
        Tiempodecuerdasdecria.setText(sol.getString("Fecha de cria"));
        Totalcuerdascria.setText(sol.getString("Nº Cuerdas de cria en total"));
        Desdoble.setText(sol.getString("Nº Cuerdas de Desdoble"));
        Tiempodecuerdasdesdoble.setText(sol.getString("Fecha Desdoble"));
        Totalcuerdesdoble.setText(sol.getString("Nº cuerdas desdoble en total"));
        Cuerdasdeventa.setText(sol.getString("Cuerdas para Venta"));
        Kg.setText(sol.getString("Cantidad Kg"));
        TotaldeKg.setText(sol.getString("Cantidad total de kg"));
        PrecioporKG.setText(sol.getString("Precio por kg"));
        Importe.setText(sol.getString("Subtotal"));
        PrecioconIva.setText(sol.getString("Precio con IVA"));
        Fechaventa.setText(sol.getString("Fecha de la venta"));
        Totalprecio.setText(sol.getString("Precio Total"));
        Ivatotal.setText(sol.getString("Total Iva"));
        Totalcuerdasventa.setText(sol.getString("Total cuerdas vendidas"));
        
          
        }else{
           JOptionPane.showMessageDialog(null, "Batea no encontrada");
            
        }
        
        
       }catch (Exception a){
           
       }
    }//GEN-LAST:event_BuscarActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
                try{
          String ID = NombreBatea.getText().trim(); 
          
          
          
          Connection sol = DriverManager.getConnection("jdbc:mysql://localhost/bateas","root","");
          PreparedStatement obx = sol.prepareStatement("update cuerdas set Nombre = ?, Poligono = ?, Cuadricula = ?, Localizacion = ?, Nº Cuerdas = ?,"
                  + "Puedes poner = ?, Nº Cuerdas de Cria = ?, Fecha de cria = ?, Nº Cuerdas de cria en total = ?, Nº Cuerdas de Desdoble = ?,"
                  + "Fecha Desdoble = ?, Nº cuerdas desdoble en total = ?, Cuerdas para Venta = ?, Cantidad Kg = ?, Cantidad total de kg = ?,"
                  + "Precio por kg = ?,Subtotal = ?,Precio con IVA = ?,Fecha de la venta = ?,Precio Total = ?,Total Iva = ?,"
                  + "Total de cuerdas vendidas = ?   where Nombre = " + ID);
       
        obx.setString(1, NombreBatea.getText().trim());
        obx.setString(2, Poligono.getText().trim());
        obx.setString(3, Cuadricula.getText().trim());
        obx.setString(4, Localización.getText().trim());
        obx.setString(5, NumeroCuerdas.getText().trim());
        obx.setString(6, NumeroCuerdas.getText().trim());
        obx.setString(7, Cuerdasporponer.getText().trim());
        obx.setString(8, Tiempodecuerdasdecria.getText().trim());
        obx.setString(9, Totalcuerdascria.getText().trim());
        obx.setString(10, Desdoble.getText().trim());
        obx.setString(11, Tiempodecuerdasdesdoble.getText().trim());
        obx.setString(12, Totalcuerdesdoble.getText().trim());
        obx.setString(13, Cuerdasdeventa.getText().trim());
        obx.setString(14, Kg.getText().trim());
        obx.setString(15, TotaldeKg.getText().trim());
        obx.setString(16, PrecioporKG.getText().trim());
        obx.setString(17, Importe.getText().trim());
        obx.setString(18, PrecioconIva.getText().trim());
        obx.setString(19, Fechaventa.getText().trim());
        obx.setString(20, Totalprecio.getText().trim());
        obx.setString(21, Ivatotal.getText().trim());
        obx.setString(22, Totalcuerdasventa.getText().trim());
        
        
        NombreBatea.setText("");
        Poligono.setText("");
        Cuadricula.setText("");
        Localización.setText("");
        NumeroCuerdas.setText("");
        Cuerdascria.setText("");
        Tiempodecuerdasdecria.setText("");
        Totalcuerdascria.setText("");
        Desdoble.setText("");
        Tiempodecuerdasdesdoble.setText("");
        Totalcuerdesdoble.setText("");
        Cuerdasdeventa.setText("");
        Kg.setText("");
        TotaldeKg.setText("");
        PrecioporKG.setText("");
        Importe.setText("");
        PrecioconIva.setText("");
        Fechaventa.setText("");
        Totalprecio.setText("");
        Ivatotal.setText("");
        Totalcuerdasventa.setText("");
        Cuerdasporponer.setText("");
        PrecioIva.setText("");
          
          label_status.setText("MODIFICACIÓN COMPLETA");
          
        }catch(Exception a){
            
        }
    }//GEN-LAST:event_ModificarActionPerformed

    private void CalcularCuerdasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularCuerdasActionPerformed
 String n1 = NumeroCuerdas.getText();


 
 int numero1 = Integer.parseInt(n1);

 
 int resultado1 = 500 - numero1;
       Cuerdasporponer.setText("" + resultado1);
       
       

    }//GEN-LAST:event_CalcularCuerdasActionPerformed

    private void FechaventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FechaventaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FechaventaActionPerformed

    private void CalcularimporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularimporteActionPerformed

        
        
 String n1 = Kg.getText();
 String n2 = PrecioporKG.getText();
 String n3 = NumeroCuerdas.getText();
 String n4 = Cuerdasdeventa.getText();
 
 int numero1 = Integer.parseInt(n1);
 float numero2 = Float.parseFloat (n2);
 int numero3 = Integer.parseInt(n3);
 int numero4 = Integer.parseInt(n4);
 
 
 
 float resultado1 = numero1 * numero2;
       Importe.setText("" + resultado1);
       
       
       
       
  float  resultado2 =   (resultado1 * 21) /100;
    PrecioIva.setText("" + resultado2);
       
  
    
  float resultado3 = resultado1 + resultado2;
  PrecioconIva.setText("" + resultado3);
  
  
//resta el total de cuerdas al venderlas
 
 int resultado4 = numero3 - numero4;
 
 NumeroCuerdas.setText("" + resultado4);
 
 int resultado5 =  500 - resultado4;
 
       Cuerdasporponer.setText("" + resultado5);
       
       if (numero4>numero3){
           
          label_status.setText("Tienes cuerdas de más"); 
       }
       else{
           
       }
       

   
    

    }//GEN-LAST:event_CalcularimporteActionPerformed

    private void CuerdasdeventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CuerdasdeventaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CuerdasdeventaActionPerformed

    private void NumeroCuerdasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumeroCuerdasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumeroCuerdasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(cuerdas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cuerdas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cuerdas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cuerdas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cuerdas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JButton CalcularCuerdas;
    private javax.swing.JButton Calcularcuerdascria;
    private javax.swing.JButton Calcularcuerdesdoble;
    private javax.swing.JButton Calcularimporte;
    private javax.swing.JTextField Cuadricula;
    private javax.swing.JTextField Cuerdascria;
    private javax.swing.JTextField Cuerdasdeventa;
    private javax.swing.JTextField Cuerdasporponer;
    private javax.swing.JTextField Desdoble;
    private javax.swing.JButton Eliminar;
    private javax.swing.JTextField Fechaventa;
    private javax.swing.JTextField Importe;
    private javax.swing.JTextField Ivatotal;
    private javax.swing.JTextField Kg;
    private javax.swing.JTextField Localización;
    private javax.swing.JButton Modificar;
    private javax.swing.JTextField NombreBatea;
    private javax.swing.JTextField NumeroCuerdas;
    private javax.swing.JTextField Poligono;
    private javax.swing.JTextField PrecioIva;
    private javax.swing.JTextField PrecioconIva;
    private javax.swing.JTextField PrecioporKG;
    private javax.swing.JButton Registrar;
    private javax.swing.JTextField Tiempodecuerdasdecria;
    private javax.swing.JTextField Tiempodecuerdasdesdoble;
    private javax.swing.JTextField Totalcuerdascria;
    private javax.swing.JTextField Totalcuerdasventa;
    private javax.swing.JTextField Totalcuerdesdoble;
    private javax.swing.JTextField TotaldeKg;
    private javax.swing.JTextField Totalprecio;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel label_status;
    // End of variables declaration//GEN-END:variables
}
