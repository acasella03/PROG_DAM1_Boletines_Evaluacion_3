/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package prog_boletin29;

/**
 *
 * @author dam1
 */
public class NewUser extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public NewUser() {
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

        panel = new javax.swing.JPanel();
        etiqueta1 = new javax.swing.JLabel();
        etiqueta2 = new javax.swing.JLabel();
        etiqueta3 = new javax.swing.JLabel();
        etiqueta4 = new javax.swing.JLabel();
        etiqueta5 = new javax.swing.JLabel();
        etiqueta6 = new javax.swing.JLabel();
        etiqueta7 = new javax.swing.JLabel();
        etiqueta8 = new javax.swing.JLabel();
        etiqueta9 = new javax.swing.JLabel();
        lineaTexto1 = new javax.swing.JTextField();
        lineaTexto2 = new javax.swing.JTextField();
        lineaTexto3 = new javax.swing.JTextField();
        comboBox1 = new javax.swing.JComboBox<>();
        lineaTexto4 = new javax.swing.JTextField();
        comboBox2 = new javax.swing.JComboBox<>();
        lineaPassword1 = new javax.swing.JPasswordField();
        lineaPassword2 = new javax.swing.JPasswordField();
        botonCancelar = new javax.swing.JButton();
        botonOk = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setName(""); // NOI18N

        etiqueta1.setText("Create a new user");

        etiqueta2.setText("User Name:");

        etiqueta3.setText("Full Name:");

        etiqueta4.setText("User ID:");

        etiqueta5.setText("Group:");

        etiqueta6.setText("Home Directory:");

        etiqueta7.setText("Login Shell:");

        etiqueta8.setText("Password:");

        etiqueta9.setText("Confirm:");

        lineaTexto1.setText("mary");
        lineaTexto1.setToolTipText("");
        lineaTexto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lineaTexto1ActionPerformed(evt);
            }
        });

        lineaTexto2.setText("User mary");
        lineaTexto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lineaTexto2ActionPerformed(evt);
            }
        });

        lineaTexto3.setForeground(new java.awt.Color(153, 153, 153));
        lineaTexto3.setText("(automatic)");

        comboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "staff", "Item 2", "Item 3", "Item 4" }));
        comboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBox1ActionPerformed(evt);
            }
        });

        lineaTexto4.setForeground(new java.awt.Color(153, 153, 153));
        lineaTexto4.setText("(automatic)");

        comboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "/bin/kgh/", "Item 2", "Item 3", "Item 4" }));

        lineaPassword1.setText("Password");
        lineaPassword1.setCaretPosition(8);

        lineaPassword2.setText("Password");

        botonCancelar.setText("Cancel");

        botonOk.setText("OK");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonCancelar)
                        .addGap(29, 29, 29)
                        .addComponent(botonOk))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiqueta3)
                            .addComponent(etiqueta1)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etiqueta6)
                                    .addComponent(etiqueta2)
                                    .addComponent(etiqueta4)
                                    .addComponent(etiqueta5)
                                    .addComponent(etiqueta7)
                                    .addComponent(etiqueta8)
                                    .addComponent(etiqueta9))
                                .addGap(18, 18, 18)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lineaTexto4)
                                    .addComponent(lineaTexto2)
                                    .addComponent(lineaTexto3)
                                    .addGroup(panelLayout.createSequentialGroup()
                                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lineaTexto1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(comboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(lineaPassword2, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lineaPassword1, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(comboBox2, javax.swing.GroupLayout.Alignment.LEADING, 0, 100, Short.MAX_VALUE)))
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addGap(39, 39, 39))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(etiqueta1)
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiqueta2)
                    .addComponent(lineaTexto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiqueta3)
                    .addComponent(lineaTexto2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiqueta4)
                    .addComponent(lineaTexto3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiqueta5)
                    .addComponent(comboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiqueta6)
                    .addComponent(lineaTexto4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiqueta7)
                    .addComponent(comboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiqueta8)
                    .addComponent(lineaPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiqueta9)
                    .addComponent(lineaPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCancelar)
                    .addComponent(botonOk))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lineaTexto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lineaTexto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lineaTexto1ActionPerformed

    private void lineaTexto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lineaTexto2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lineaTexto2ActionPerformed

    private void comboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(NewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonOk;
    private javax.swing.JComboBox<String> comboBox1;
    private javax.swing.JComboBox<String> comboBox2;
    private javax.swing.JLabel etiqueta1;
    private javax.swing.JLabel etiqueta2;
    private javax.swing.JLabel etiqueta3;
    private javax.swing.JLabel etiqueta4;
    private javax.swing.JLabel etiqueta5;
    private javax.swing.JLabel etiqueta6;
    private javax.swing.JLabel etiqueta7;
    private javax.swing.JLabel etiqueta8;
    private javax.swing.JLabel etiqueta9;
    private javax.swing.JPasswordField lineaPassword1;
    private javax.swing.JPasswordField lineaPassword2;
    private javax.swing.JTextField lineaTexto1;
    private javax.swing.JTextField lineaTexto2;
    private javax.swing.JTextField lineaTexto3;
    private javax.swing.JTextField lineaTexto4;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}