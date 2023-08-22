/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JOptionPane;

/**
 *
 * @author pc01
 */
public class frm_ventana extends javax.swing.JFrame {

    /**
     * Creates new form frm_ventana
     */
    public frm_ventana() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_principal = new javax.swing.JPanel();
        lbl_titulo1 = new javax.swing.JLabel();
        lbl_tx = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btn_procesar = new javax.swing.JButton();
        lbl_longitud_txt = new javax.swing.JLabel();
        lbl_total_palabras = new javax.swing.JLabel();
        lbl_letra1 = new javax.swing.JLabel();
        lbl_letraU = new javax.swing.JLabel();
        lbl_letraC = new javax.swing.JLabel();
        lbl_palabra1 = new javax.swing.JLabel();
        lbl_palabraC = new javax.swing.JLabel();
        lbl_palabraU = new javax.swing.JLabel();
        lbl_repeticionesA = new javax.swing.JLabel();
        lbl_repeticionesE = new javax.swing.JLabel();
        lbl_repeticionesI = new javax.swing.JLabel();
        lbl_repeticionesO = new javax.swing.JLabel();
        lbl_repeticionesU = new javax.swing.JLabel();
        lbl_palabrasPar = new javax.swing.JLabel();
        lbl_palabrasImpar = new javax.swing.JLabel();
        txt_longitud_txt = new javax.swing.JTextField();
        txt_total_palabra = new javax.swing.JTextField();
        txt_letra1 = new javax.swing.JTextField();
        txt_letraU = new javax.swing.JTextField();
        txt_letraC = new javax.swing.JTextField();
        txt_palabra1 = new javax.swing.JTextField();
        txt_palabraC = new javax.swing.JTextField();
        txt_palabraU = new javax.swing.JTextField();
        txt_repeticionesA = new javax.swing.JTextField();
        txt_repeticionesE = new javax.swing.JTextField();
        txt_repeticionesI = new javax.swing.JTextField();
        txt_repeticionesO = new javax.swing.JTextField();
        txt_repeticionesU = new javax.swing.JTextField();
        txt_palabrasPar = new javax.swing.JTextField();
        txt_palabrasImpar = new javax.swing.JTextField();
        lbl_titulo2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        mn_archivo = new javax.swing.JMenu();
        itm_abrir = new javax.swing.JMenuItem();
        itm_guardar = new javax.swing.JMenuItem();
        itm_guardarcomo = new javax.swing.JMenuItem();
        mn_editar = new javax.swing.JMenu();
        itm_copiar = new javax.swing.JMenuItem();
        itm_cortar = new javax.swing.JMenuItem();
        itm_pegar = new javax.swing.JMenuItem();
        itm_buscar = new javax.swing.JMenuItem();
        itm_reemplazar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MURCIELAGO");

        lbl_titulo1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lbl_titulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_titulo1.setText("MANEJO DE CADENAS");

        lbl_tx.setText("Ingrese un texto o abra un archivo");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        btn_procesar.setText("Procesar");
        btn_procesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_procesarActionPerformed(evt);
            }
        });

        lbl_longitud_txt.setText("Longitud del texto.....:");

        lbl_total_palabras.setText("Total de palabras........:");

        lbl_letra1.setText("Primer letra del texto.:");

        lbl_letraU.setText("Ultima letra del texto.:");

        lbl_letraC.setText("Letra central del texto:");

        lbl_palabra1.setBackground(new java.awt.Color(255, 255, 255));
        lbl_palabra1.setText("Primera palabra...........:");

        lbl_palabraC.setText("Palabra central.............:");

        lbl_palabraU.setText("Ultima palabra.............:");

        lbl_repeticionesA.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_repeticionesA.setText("Repeticiones de \"A\", \"a\" ó \"á\":");

        lbl_repeticionesE.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_repeticionesE.setText("Repeticiones de \"E\", \"e\" ó \"é\":");

        lbl_repeticionesI.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_repeticionesI.setText("Repeticiones de \"I\", \"i\" ó \"í\":");

        lbl_repeticionesO.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_repeticionesO.setText("Repeticiones de \"O\", \"o\" ó \"ó\":");

        lbl_repeticionesU.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_repeticionesU.setText("Repeticiones de \"U\", \"u\" ó \"ú\":");

        lbl_palabrasPar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_palabrasPar.setText("Palabras con cantidades de caracteres par:");

        lbl_palabrasImpar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_palabrasImpar.setText("Palabras con cantidad de caracteres impar: ");

        txt_longitud_txt.setEditable(false);
        txt_longitud_txt.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        txt_longitud_txt.setBorder(null);

        txt_total_palabra.setEditable(false);
        txt_total_palabra.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        txt_total_palabra.setBorder(null);

        txt_letra1.setEditable(false);
        txt_letra1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        txt_letra1.setBorder(null);

        txt_letraU.setEditable(false);
        txt_letraU.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        txt_letraU.setBorder(null);

        txt_letraC.setEditable(false);
        txt_letraC.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        txt_letraC.setBorder(null);

        txt_palabra1.setEditable(false);
        txt_palabra1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        txt_palabra1.setBorder(null);

        txt_palabraC.setEditable(false);
        txt_palabraC.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        txt_palabraC.setBorder(null);

        txt_palabraU.setEditable(false);
        txt_palabraU.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        txt_palabraU.setBorder(null);

        txt_repeticionesA.setEditable(false);
        txt_repeticionesA.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        txt_repeticionesA.setBorder(null);

        txt_repeticionesE.setEditable(false);
        txt_repeticionesE.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        txt_repeticionesE.setBorder(null);

        txt_repeticionesI.setEditable(false);
        txt_repeticionesI.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        txt_repeticionesI.setBorder(null);

        txt_repeticionesO.setEditable(false);
        txt_repeticionesO.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        txt_repeticionesO.setBorder(null);

        txt_repeticionesU.setEditable(false);
        txt_repeticionesU.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        txt_repeticionesU.setBorder(null);

        txt_palabrasPar.setEditable(false);
        txt_palabrasPar.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        txt_palabrasPar.setBorder(null);

        txt_palabrasImpar.setEditable(false);
        txt_palabrasImpar.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        txt_palabrasImpar.setBorder(null);

        lbl_titulo2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lbl_titulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_titulo2.setText("TRADUCCION A CLAVE MURCIELAGO");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        javax.swing.GroupLayout pnl_principalLayout = new javax.swing.GroupLayout(pnl_principal);
        pnl_principal.setLayout(pnl_principalLayout);
        pnl_principalLayout.setHorizontalGroup(
            pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_principalLayout.createSequentialGroup()
                .addGroup(pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_principalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnl_principalLayout.createSequentialGroup()
                                .addComponent(lbl_palabraU)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_palabraU))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_principalLayout.createSequentialGroup()
                                .addComponent(lbl_palabraC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_palabraC, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_principalLayout.createSequentialGroup()
                                .addComponent(lbl_longitud_txt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_longitud_txt))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_principalLayout.createSequentialGroup()
                                .addComponent(lbl_palabra1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_palabra1))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_principalLayout.createSequentialGroup()
                                .addComponent(lbl_letraC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_letraC))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_principalLayout.createSequentialGroup()
                                .addComponent(lbl_letraU)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_letraU))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_principalLayout.createSequentialGroup()
                                .addComponent(lbl_letra1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_letra1))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_principalLayout.createSequentialGroup()
                                .addComponent(lbl_total_palabras)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_total_palabra)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_palabrasImpar)
                            .addComponent(lbl_palabrasPar)
                            .addComponent(lbl_repeticionesU)
                            .addComponent(lbl_repeticionesO)
                            .addComponent(lbl_repeticionesI)
                            .addComponent(lbl_repeticionesE)
                            .addComponent(lbl_repeticionesA))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_repeticionesO, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_repeticionesU, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_palabrasPar, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_palabrasImpar, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_repeticionesA, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_repeticionesE)
                            .addComponent(txt_repeticionesI)))
                    .addGroup(pnl_principalLayout.createSequentialGroup()
                        .addGroup(pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_principalLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbl_tx))
                            .addGroup(pnl_principalLayout.createSequentialGroup()
                                .addGap(244, 244, 244)
                                .addComponent(btn_procesar))
                            .addGroup(pnl_principalLayout.createSequentialGroup()
                                .addGap(219, 219, 219)
                                .addComponent(lbl_titulo1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_principalLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_titulo2)
                .addGap(240, 240, 240))
            .addGroup(pnl_principalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        pnl_principalLayout.setVerticalGroup(
            pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_principalLayout.createSequentialGroup()
                .addComponent(lbl_titulo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_tx)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_procesar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_longitud_txt)
                    .addComponent(lbl_repeticionesA)
                    .addComponent(txt_longitud_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_repeticionesA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_total_palabras)
                    .addComponent(lbl_repeticionesE)
                    .addComponent(txt_total_palabra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_repeticionesE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_letra1)
                    .addComponent(lbl_repeticionesI)
                    .addComponent(txt_letra1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_repeticionesI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_letraU)
                    .addComponent(lbl_repeticionesO)
                    .addComponent(txt_letraU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_repeticionesO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_letraC)
                    .addComponent(lbl_repeticionesU)
                    .addComponent(txt_letraC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_repeticionesU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_palabra1)
                    .addComponent(lbl_palabrasPar)
                    .addComponent(txt_palabra1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_palabrasPar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_palabraC)
                    .addComponent(lbl_palabrasImpar)
                    .addComponent(txt_palabraC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_palabrasImpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_palabraU)
                    .addComponent(txt_palabraU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_titulo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        mn_archivo.setText("Archivo");

        itm_abrir.setText("Abrir");
        itm_abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itm_abrirActionPerformed(evt);
            }
        });
        itm_abrir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                itm_abrirKeyPressed(evt);
            }
        });
        mn_archivo.add(itm_abrir);

        itm_guardar.setText("Guardar");
        itm_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itm_guardarActionPerformed(evt);
            }
        });
        mn_archivo.add(itm_guardar);

        itm_guardarcomo.setText("Guardar como");
        itm_guardarcomo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itm_guardarcomoActionPerformed(evt);
            }
        });
        mn_archivo.add(itm_guardarcomo);

        jMenuBar1.add(mn_archivo);

        mn_editar.setText("Editar");

        itm_copiar.setText("Copiar");
        itm_copiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itm_copiarActionPerformed(evt);
            }
        });
        mn_editar.add(itm_copiar);

        itm_cortar.setText("Cortar");
        itm_cortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itm_cortarActionPerformed(evt);
            }
        });
        mn_editar.add(itm_cortar);

        itm_pegar.setText("Pegar");
        itm_pegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itm_pegarActionPerformed(evt);
            }
        });
        mn_editar.add(itm_pegar);

        itm_buscar.setText("Buscar");
        itm_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itm_buscarActionPerformed(evt);
            }
        });
        mn_editar.add(itm_buscar);

        itm_reemplazar.setText("Reemplazar");
        itm_reemplazar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itm_reemplazarActionPerformed(evt);
            }
        });
        mn_editar.add(itm_reemplazar);

        jMenuBar1.add(mn_editar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itm_abrirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itm_abrirKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_itm_abrirKeyPressed

    private void itm_abrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itm_abrirActionPerformed
        // TODO add your handling code here:
        JFileChooser jFileChooser = new JFileChooser();
        FileNameExtensionFilter filtrado = new FileNameExtensionFilter("TXT","txt");
        jFileChooser.setFileFilter(filtrado);
        int seleccion = jFileChooser.showOpenDialog(this);
        if(seleccion == JFileChooser.APPROVE_OPTION){
            File archivo = jFileChooser.getSelectedFile();
            abrirArchivo(archivo);
        }
    }//GEN-LAST:event_itm_abrirActionPerformed

    private void itm_copiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itm_copiarActionPerformed
        // TODO add your handling code here:
        jTextArea1.copy();
    }//GEN-LAST:event_itm_copiarActionPerformed

    private void itm_cortarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itm_cortarActionPerformed
        // TODO add your handling code here:
        jTextArea1.cut();
    }//GEN-LAST:event_itm_cortarActionPerformed

    private void itm_pegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itm_pegarActionPerformed
        // TODO add your handling code here:
        jTextArea1.paste();
    }//GEN-LAST:event_itm_pegarActionPerformed

    private void itm_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itm_buscarActionPerformed
        // TODO add your handling code here:
        String texto = jTextArea1.getText();
        String palabraBuscada = JOptionPane.showInputDialog(this, "Ingrese la palabra a buscar: ");
        int posicion = texto.indexOf(palabraBuscada);
        
        if(posicion != -1){
            jTextArea1.setSelectionStart(posicion);
            jTextArea1.setSelectionEnd(posicion + palabraBuscada.length());
        } else{
            JOptionPane.showMessageDialog(this, "No se encontro la palabra.");
        }
    }//GEN-LAST:event_itm_buscarActionPerformed

    private void itm_reemplazarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itm_reemplazarActionPerformed
        // TODO add your handling code here:
        String texto = jTextArea1.getText();
        String palabraBuscada = JOptionPane.showInputDialog(this, "Ingrese la palabra a reemplazar: ");
        String palabraReemplazo = JOptionPane.showInputDialog(this, "Ingrese la palabra de reemplazo: ");
        
        String nuevoTexto = texto.replace(palabraBuscada, palabraReemplazo);
        jTextArea1.setText(nuevoTexto);
    }//GEN-LAST:event_itm_reemplazarActionPerformed

    private void btn_procesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_procesarActionPerformed
        // TODO add your handling code here:
        String texto = jTextArea1.getText();
        String[] palabras = texto.split("\\s+");
        
        int longitud = texto.length();
        int totalPalabras = palabras.length;
        String primeraLetra = texto.length() > 0 ? String.valueOf(texto.charAt(0)) : "";
        String ultimaLetra = texto.length() > 0 ? String.valueOf(texto.charAt(texto.length() - 1)) : "";
        String letraCentral = texto.length() > 0 ? String.valueOf(texto.charAt(texto.length() / 2)) : "";
        String primeraPalabra = palabras.length > 0 ? palabras[0] : "";
        String palabraCentral = palabras.length > 0 ? palabras[palabras.length / 2] : "";
        String ultimaPalabra = palabras.length > 0 ? palabras[palabras.length - 1] : "";
        int repeticionesA = Repeticiones(texto, "Aaá");
        int repeticionesE = Repeticiones(texto, "Eeé");
        int repeticionesI = Repeticiones(texto, "Iií");
        int repeticionesO = Repeticiones(texto, "Ooó");
        int repeticionesU = Repeticiones(texto, "Uuú");
        int palabrasPar = palabrasLongitud(palabras, 2);
        int palabrasImpar = palabrasLongitud(palabras, 1);
        
        txt_longitud_txt.setText(String.valueOf(longitud));
        txt_total_palabra.setText(String.valueOf(totalPalabras));
        txt_letra1.setText(primeraLetra);
        txt_letraC.setText(letraCentral);
        txt_letraU.setText(ultimaLetra);
        txt_palabra1.setText(primeraPalabra);
        txt_palabraC.setText(palabraCentral);
        txt_palabraU.setText(ultimaPalabra);
        txt_repeticionesA.setText(String.valueOf(repeticionesA));
        txt_repeticionesE.setText(String.valueOf(repeticionesE));
        txt_repeticionesI.setText(String.valueOf(repeticionesI));
        txt_repeticionesO.setText(String.valueOf(repeticionesO));
        txt_repeticionesU.setText(String.valueOf(repeticionesU));
        txt_palabrasPar.setText(String.valueOf(palabrasPar));
        txt_palabrasImpar.setText(String.valueOf(palabrasImpar));
        
        String traduccion = traducirMurcielago(texto);
        jTextArea2.setText(traduccion);
    }//GEN-LAST:event_btn_procesarActionPerformed

    private void itm_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itm_guardarActionPerformed
        // TODO add your handling code here:
        guardarTexto();
    }//GEN-LAST:event_itm_guardarActionPerformed

    private void itm_guardarcomoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itm_guardarcomoActionPerformed
        // TODO add your handling code here:
        guardarComo();
    }//GEN-LAST:event_itm_guardarcomoActionPerformed
    
    private String traducirMurcielago(String texto) {
        String claveMurcielago = "murcielago";
        String numeros = "0123456789";

        StringBuilder traduccion = new StringBuilder();

        for (char c : texto.toCharArray()) {
            int indice = claveMurcielago.indexOf(Character.toLowerCase(c));
            if (indice != -1) {
                traduccion.append(numeros.charAt(indice));
            } else {
                traduccion.append(c);
            }
        }

        return traduccion.toString();
    }
    
    private int Repeticiones(String texto, String letras){
        int contador = 0;
        for (char c : texto.toCharArray()){
            if(letras.contains(String.valueOf(c))){
                contador++;
            }
        }
        return contador;
    }
    
    private int palabrasLongitud(String[] palabras, int longitud){
        int contador = 0;
        for(String palabra : palabras){
            if(palabra.length() % 2 == 0 && longitud == 2){
                contador++;
            } else if(palabra.length() % 2 != 0 && longitud == 1){
                contador++;
            }
        }
        return contador;
    }
    
    private void guardarTextoArchivo(File archivo, String contenido){
        try {
            FileWriter escritor = new FileWriter(archivo);
            escritor.write(contenido);
            escritor.close();
            JOptionPane.showMessageDialog(this, "El Archivo se guardo exitosamente.");
        } catch (IOException e){
            JOptionPane.showMessageDialog(this, "Error al guardar el archivo: " + e.getMessage());
        }
    }
    
    private void guardarTexto(){
        if(archivoActual != null){
            guardarTextoArchivo(archivoActual, jTextArea1.getText());
        } else{
            JFileChooser jFileChooser = new JFileChooser();
            int seleccion = jFileChooser.showSaveDialog(this);
            if(seleccion == JFileChooser.APPROVE_OPTION){
                File archivo = jFileChooser.getSelectedFile();
                guardarTextoArchivo(archivo, jTextArea1.getText());
                archivoActual = archivo;
            }
        }
    }
    
    private void guardarComo(){
        JFileChooser jFileChooser = new JFileChooser();
        int seleccion = jFileChooser.showSaveDialog(this);
        if(seleccion == JFileChooser.APPROVE_OPTION){
            File archivo = jFileChooser.getSelectedFile();
            guardarTextoArchivo(archivo, jTextArea1.getText());
        }
    }
    
    private File archivoActual;
    
    private void abrirArchivo(File archivo){
        try {
            FileReader lector = new FileReader(archivo);
            BufferedReader bufferedReader = new BufferedReader(lector);
            String linea;
            StringBuilder contenido = new StringBuilder();
            
            while((linea = bufferedReader.readLine()) != null){
                contenido.append(linea).append("\n");
            }
            
            bufferedReader.close();
            lector.close();
            
            jTextArea1.setText(contenido.toString());
            archivoActual = archivo;
        } catch(IOException e){
            JOptionPane.showMessageDialog(this, "Error al abrir el archivo: " + e.getMessage());
        }
    }
    
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
            java.util.logging.Logger.getLogger(frm_ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_procesar;
    private javax.swing.JMenuItem itm_abrir;
    private javax.swing.JMenuItem itm_buscar;
    private javax.swing.JMenuItem itm_copiar;
    private javax.swing.JMenuItem itm_cortar;
    private javax.swing.JMenuItem itm_guardar;
    private javax.swing.JMenuItem itm_guardarcomo;
    private javax.swing.JMenuItem itm_pegar;
    private javax.swing.JMenuItem itm_reemplazar;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel lbl_letra1;
    private javax.swing.JLabel lbl_letraC;
    private javax.swing.JLabel lbl_letraU;
    private javax.swing.JLabel lbl_longitud_txt;
    private javax.swing.JLabel lbl_palabra1;
    private javax.swing.JLabel lbl_palabraC;
    private javax.swing.JLabel lbl_palabraU;
    private javax.swing.JLabel lbl_palabrasImpar;
    private javax.swing.JLabel lbl_palabrasPar;
    private javax.swing.JLabel lbl_repeticionesA;
    private javax.swing.JLabel lbl_repeticionesE;
    private javax.swing.JLabel lbl_repeticionesI;
    private javax.swing.JLabel lbl_repeticionesO;
    private javax.swing.JLabel lbl_repeticionesU;
    private javax.swing.JLabel lbl_titulo1;
    private javax.swing.JLabel lbl_titulo2;
    private javax.swing.JLabel lbl_total_palabras;
    private javax.swing.JLabel lbl_tx;
    private javax.swing.JMenu mn_archivo;
    private javax.swing.JMenu mn_editar;
    private javax.swing.JPanel pnl_principal;
    private javax.swing.JTextField txt_letra1;
    private javax.swing.JTextField txt_letraC;
    private javax.swing.JTextField txt_letraU;
    private javax.swing.JTextField txt_longitud_txt;
    private javax.swing.JTextField txt_palabra1;
    private javax.swing.JTextField txt_palabraC;
    private javax.swing.JTextField txt_palabraU;
    private javax.swing.JTextField txt_palabrasImpar;
    private javax.swing.JTextField txt_palabrasPar;
    private javax.swing.JTextField txt_repeticionesA;
    private javax.swing.JTextField txt_repeticionesE;
    private javax.swing.JTextField txt_repeticionesI;
    private javax.swing.JTextField txt_repeticionesO;
    private javax.swing.JTextField txt_repeticionesU;
    private javax.swing.JTextField txt_total_palabra;
    // End of variables declaration//GEN-END:variables
}
