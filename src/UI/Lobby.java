/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import com.sun.glass.events.KeyEvent;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.xml.bind.annotation.XmlElement;
import models.*;
import utilities.Audio;

/**
 *
 * @author verena312
 */
public class Lobby extends javax.swing.JFrame {

    DefaultTableModel modelotabla1;
    List<Personaje> listaPersonajeEquipo1 = new ArrayList<>();

    private int contadorPersonajesEquipo1 = 6;

    DefaultTableModel modelotabla2;
    List<Personaje> listaPersonajeEquipo2 = new ArrayList<>();

    private int contadorPersonajesEquipo2 = 6;
    

    /**
     * Creates new form Lobby
     */
    public Lobby(String nombreUsuario) {
        initComponents();

        modelotabla1 = (DefaultTableModel) TablaPersonajeEquipo1.getModel();
        modelotabla2 = (DefaultTableModel) TablaPersonajeEquipo2.getModel();
        this.setTitle("Bienvenido Sr. " + nombreUsuario);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cdRol = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        Lbimagen = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        tbpeq = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaPersonajeEquipo1 = new javax.swing.JTable() {
            public Class getColumnClass(int column){
                return getValueAt(0, column).getClass();
            }
        };
        jLabel4 = new javax.swing.JLabel();
        tfeq1 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaPersonajeEquipo2 = new javax.swing.JTable() {
            public Class getColumnClass(int column){
                return getValueAt(0, column).getClass();
            }
        };
        jLabel5 = new javax.swing.JLabel();
        tfeq2 = new javax.swing.JTextField();
        btBatalla = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/Resources/icons/Logo.png")).getImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 2, 18)); // NOI18N
        jLabel1.setText("Nombre");

        tfNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfNombreKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        jLabel2.setText("Tipo");

        cdRol.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Aldeano", "Mago", "Paladin" }));
        cdRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdRolActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        jLabel3.setText("Imagen");

        Lbimagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/characters/Aldeano.jpg"))); // NOI18N

        jButton2.setText("Crear");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(cdRol, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Lbimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(112, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(87, 87, 87)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cdRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(Lbimagen, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                        .addGap(45, 45, 45))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(238, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        jTabbedPane1.addTab("Nuevo Personaje", jPanel1);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 290, 310));

        TablaPersonajeEquipo1.setBackground(new java.awt.Color(0, 0, 0));
        TablaPersonajeEquipo1.setFont(new java.awt.Font("Ravie", 0, 14)); // NOI18N
        TablaPersonajeEquipo1.setForeground(new java.awt.Color(153, 0, 153));
        TablaPersonajeEquipo1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Ataque", "Vida", "Tipo", "Imagen"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaPersonajeEquipo1.setToolTipText("Selecione un Pj para Borrar con Del.");
        TablaPersonajeEquipo1.setGridColor(new java.awt.Color(255, 153, 0));
        TablaPersonajeEquipo1.setRowHeight(130);
        TablaPersonajeEquipo1.setSelectionForeground(new java.awt.Color(255, 0, 0));
        TablaPersonajeEquipo1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        TablaPersonajeEquipo1.setShowHorizontalLines(false);
        TablaPersonajeEquipo1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TablaPersonajeEquipo1KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(TablaPersonajeEquipo1);
        if (TablaPersonajeEquipo1.getColumnModel().getColumnCount() > 0) {
            TablaPersonajeEquipo1.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 2, 18)); // NOI18N
        jLabel4.setText("Nombre De Equipo 1");

        tfeq1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfeq1KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfeq1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 20, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfeq1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(506, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addGap(0, 72, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        tbpeq.addTab("Team 1", jPanel2);

        TablaPersonajeEquipo2.setBackground(new java.awt.Color(0, 0, 0));
        TablaPersonajeEquipo2.setFont(new java.awt.Font("Ravie", 0, 14)); // NOI18N
        TablaPersonajeEquipo2.setForeground(new java.awt.Color(153, 0, 153));
        TablaPersonajeEquipo2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Ataque", "Vida", "Tipo", "Imagen"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaPersonajeEquipo2.setToolTipText("Selecione un Pj para Borrar con Del.");
        TablaPersonajeEquipo2.setGridColor(new java.awt.Color(255, 153, 0));
        TablaPersonajeEquipo2.setRowHeight(130);
        TablaPersonajeEquipo2.setSelectionForeground(new java.awt.Color(255, 0, 0));
        TablaPersonajeEquipo2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        TablaPersonajeEquipo2.setShowHorizontalLines(false);
        TablaPersonajeEquipo2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TablaPersonajeEquipo2KeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(TablaPersonajeEquipo2);
        if (TablaPersonajeEquipo2.getColumnModel().getColumnCount() > 0) {
            TablaPersonajeEquipo2.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 2, 18)); // NOI18N
        jLabel5.setText("Nombre De Equipo 2");

        tfeq2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfeq2KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfeq2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 20, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfeq2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(506, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                    .addGap(0, 72, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        tbpeq.addTab("Team 2", jPanel4);

        getContentPane().add(tbpeq, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 440, 580));

        btBatalla.setText("Listos Para la Batalla.!!");
        btBatalla.setEnabled(false);
        btBatalla.setFocusTraversalPolicyProvider(true);
        btBatalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBatallaActionPerformed(evt);
            }
        });
        getContentPane().add(btBatalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 460, 210, 80));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/icons/background.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cdRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdRolActionPerformed

        switch ((String) cdRol.getSelectedItem()) {
            case "Aldeano":
                Lbimagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/characters/Aldeano.jpg")));
                break;

            case "Mago":
                Lbimagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/characters/Mago.jpg")));
                break;

            case "Paladin":
                Lbimagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/characters/rsz_paladin.jpg")));

                break;

        }
    }//GEN-LAST:event_cdRolActionPerformed

    private void TablaPersonajeEquipo1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TablaPersonajeEquipo1KeyReleased
        if (TablaPersonajeEquipo1.getSelectedRow() == -1) {
            return;
        }
        int fila = TablaPersonajeEquipo1.getSelectedRow();

        if (evt.getKeyCode() == KeyEvent.VK_DELETE) {
            modelotabla1.removeRow(fila);
            listaPersonajeEquipo1.remove(fila);
            contadorPersonajesEquipo1++;
            btBatalla.setEnabled(listaPersonajeEquipo1.size()>=1 && listaPersonajeEquipo2.size()>=1);
        }


    }//GEN-LAST:event_TablaPersonajeEquipo1KeyReleased

    private void tfNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNombreKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jButton2MouseClicked(null);
        }
    }//GEN-LAST:event_tfNombreKeyReleased

    private void tfeq1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfeq1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tfeq1KeyReleased

    private void TablaPersonajeEquipo2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TablaPersonajeEquipo2KeyReleased
        if (TablaPersonajeEquipo2.getSelectedRow() == -1) {
            return;
        }
        int fila = TablaPersonajeEquipo2.getSelectedRow();

        if (evt.getKeyCode() == KeyEvent.VK_DELETE) {
            modelotabla2.removeRow(fila);
            listaPersonajeEquipo2.remove(fila);
            contadorPersonajesEquipo2++;
            btBatalla.setEnabled(listaPersonajeEquipo1.size()>=1 && listaPersonajeEquipo2.size()>=1);
        }

    }//GEN-LAST:event_TablaPersonajeEquipo2KeyReleased

    private void tfeq2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfeq2KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tfeq2KeyReleased

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
       if (tbpeq.getSelectedIndex() == 0 && contadorPersonajesEquipo1 == 0
                || tbpeq.getSelectedIndex() == 1 && contadorPersonajesEquipo2 == 0) {
            JOptionPane.showMessageDialog(this,
                    "Ya posee el numero maximo de personajes creados en este equipo");
            return;
        }
        if (tfNombre.getText().equals("")) {
            tfNombre.requestFocus();
            return;
        }
        Personaje p = null;
        String tipo = "";
        switch ((String) cdRol.getSelectedItem()) {
            case "Aldeano":
                p = new Aldeano(tfNombre.getText());
                tipo = "Aldeano";
                break;
            case "Mago":
                p = new Mago(tfNombre.getText());
                tipo = "Mago";
                break;
            case "Paladin":
                p = new paladin(tfNombre.getText());
                tipo = "Paladin";
                break;
        }
        switch (tbpeq.getSelectedIndex()) {
            case 0:
                modelotabla1.addRow(new Object[]{
                    p.getNombre(),
                    p.getPt_ataque(),
                    p.getPt_vida(),
                    tipo,
                    new javax.swing.ImageIcon(getClass().
                    getResource("/resources/characters/" + tipo.toLowerCase() + ".jpg"))
                });
                listaPersonajeEquipo1.add(p);
                contadorPersonajesEquipo1--;
                break;
            case 1:
                modelotabla2.addRow(new Object[]{
                    p.getNombre(),
                    p.getPt_ataque(),
                    p.getPt_vida(),
                    tipo,
                    new javax.swing.ImageIcon(getClass().
                    getResource("/resources/characters/" + tipo.toLowerCase() + ".jpg"))
                });
                listaPersonajeEquipo2.add(p);
                contadorPersonajesEquipo2--;
                break;
        }
        tfNombre.setText("");
        
        btBatalla.setEnabled(listaPersonajeEquipo1.size()>=1 && listaPersonajeEquipo2.size()>=1);
        
    }//GEN-LAST:event_jButton2MouseClicked

    private void btBatallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBatallaActionPerformed
        Audio atk = new Audio(getClass().getResource("/Resources/sound/attack.wav"));
            atk.play(); 
            
            dispose();
            new BattleField(listaPersonajeEquipo1,listaPersonajeEquipo2).setVisible(true);
            
    }//GEN-LAST:event_btBatallaActionPerformed

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
            java.util.logging.Logger.getLogger(Lobby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lobby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lobby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lobby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lobby("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lbimagen;
    private javax.swing.JTable TablaPersonajeEquipo1;
    private javax.swing.JTable TablaPersonajeEquipo2;
    private javax.swing.JButton btBatalla;
    private javax.swing.JComboBox cdRol;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane tbpeq;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfeq1;
    private javax.swing.JTextField tfeq2;
    // End of variables declaration//GEN-END:variables
}
