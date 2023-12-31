/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import conexion.Conexion;
import java.awt.Color;
import principal.validar;

/**
 *
 * @author OSVALDO
 */
public class registro extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public registro() {
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

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jtR_user = new javax.swing.JTextField();
        jbR_resgistrate = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jcb_terminosCondiciones = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jlR_iniciaSesionAqui = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtR_email = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jpf_password = new javax.swing.JPasswordField();
        jpf_passwordC = new javax.swing.JPasswordField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Crea tu cuenta");
        setBackground(new java.awt.Color(51, 51, 51));
        setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        setForeground(new java.awt.Color(51, 51, 51));
        setMinimumSize(new java.awt.Dimension(450, 400));
        setName("fm_login"); // NOI18N
        setPreferredSize(new java.awt.Dimension(800, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabel6.setFont(new java.awt.Font("Roboto Thin", 0, 48)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("¡Bienvenido(a) a bordo!");
        jPanel2.add(jLabel6, java.awt.BorderLayout.CENTER);

        jtR_user.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jtR_user.setForeground(new java.awt.Color(204, 204, 204));
        jtR_user.setText("Usuario");
        jtR_user.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtR_userFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtR_userFocusLost(evt);
            }
        });
        jtR_user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtR_userKeyTyped(evt);
            }
        });

        jbR_resgistrate.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jbR_resgistrate.setText("Registrarse");
        jbR_resgistrate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbR_resgistrateActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel2.setText("¿Ya tienes una cuenta?");

        jcb_terminosCondiciones.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jcb_terminosCondiciones.setText("Acepto Terminos y Condiciones");

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel3.setText("Contraseña");

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel4.setText("Usuario");

        jlR_iniciaSesionAqui.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jlR_iniciaSesionAqui.setForeground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));
        jlR_iniciaSesionAqui.setText("Inicia sesión aquí");
        jlR_iniciaSesionAqui.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlR_iniciaSesionAquiMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Crea tu cuenta");

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel9.setText("Correo");

        jtR_email.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jtR_email.setForeground(new java.awt.Color(204, 204, 204));
        jtR_email.setText("Email");
        jtR_email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtR_emailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtR_emailFocusLost(evt);
            }
        });
        jtR_email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtR_emailKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel10.setText("Confirmar contraseña");

        jpf_password.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jpf_password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jpf_passwordFocusGained(evt);
            }
        });
        jpf_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jpf_passwordKeyTyped(evt);
            }
        });

        jpf_passwordC.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jpf_passwordC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jpf_passwordCFocusGained(evt);
            }
        });
        jpf_passwordC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jpf_passwordCKeyTyped(evt);
            }
        });

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/001-ojo.png"))); // NOI18N
        jToggleButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton1.setOpaque(true);
        jToggleButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/002-ver.png"))); // NOI18N
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/001-ojo.png"))); // NOI18N
        jToggleButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton3.setOpaque(true);
        jToggleButton3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/002-ver.png"))); // NOI18N
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtR_user)
                    .addComponent(jtR_email)
                    .addComponent(jbR_resgistrate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jpf_password)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcb_terminosCondiciones)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlR_iniciaSesionAqui)))
                        .addGap(40, 40, 40))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jpf_passwordC, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtR_user, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtR_email, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpf_password)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jToggleButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(jpf_passwordC))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jcb_terminosCondiciones, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbR_resgistrate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlR_iniciaSesionAqui, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(180, 180, 180))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    }//GEN-LAST:event_formWindowActivated

    private void jlR_iniciaSesionAquiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlR_iniciaSesionAquiMouseClicked
        login l = new login();
        l.setLocationRelativeTo(null);
        l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jlR_iniciaSesionAquiMouseClicked

    private void jtR_userKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtR_userKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;
        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean simbolo = key == 35 || key == 46 || key == 95;

        if (!(minusculas || mayusculas || simbolo || numeros)) {
            evt.consume();
        }
    }//GEN-LAST:event_jtR_userKeyTyped

    private void jtR_emailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtR_emailKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;
        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean simbolo = key == 64 || key == 46 || key == 95;

        if (!(minusculas || mayusculas || simbolo || numeros)) {
            evt.consume();
        }
    }//GEN-LAST:event_jtR_emailKeyTyped

    private void jpf_passwordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpf_passwordKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;
        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean simbolo = key == 35 || key == 46 || key == 95;

        if (!(minusculas || mayusculas || simbolo || numeros)) {
            evt.consume();
        }
    }//GEN-LAST:event_jpf_passwordKeyTyped

    private void jpf_passwordCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpf_passwordCKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;
        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean simbolo = key == 35 || key == 46 || key == 95;

        if (!(minusculas || mayusculas || simbolo || numeros)) {
            evt.consume();
        }
    }//GEN-LAST:event_jpf_passwordCKeyTyped

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        if (jToggleButton1.isSelected()) {
            jpf_password.setEchoChar((char) 0);
        } else {
            jpf_password.setEchoChar('●');

        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jpf_passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jpf_passwordFocusGained
        jpf_password.setEchoChar('●');
        jToggleButton1.setSelected(false);

    }//GEN-LAST:event_jpf_passwordFocusGained

    private void jpf_passwordCFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jpf_passwordCFocusGained
        jpf_passwordC.setEchoChar('●');
        jToggleButton3.setSelected(false);

    }//GEN-LAST:event_jpf_passwordCFocusGained

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        if (jToggleButton3.isSelected()) {
            jpf_passwordC.setEchoChar((char) 0);
        } else {
            jpf_passwordC.setEchoChar('●');
        }
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jtR_userFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtR_userFocusGained
        if (jtR_user.getText().equals("Usuario")) {
            jtR_user.setText("");
            jtR_user.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jtR_userFocusGained

    private void jtR_userFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtR_userFocusLost
        if (jtR_user.getText().equals("")) {
            jtR_user.setText("Usuario");
            jtR_user.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_jtR_userFocusLost

    private void jtR_emailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtR_emailFocusGained
        if (jtR_email.getText().equals("Email")) {
            jtR_email.setText("");
            jtR_email.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jtR_emailFocusGained

    private void jtR_emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtR_emailFocusLost
        if (jtR_email.getText().equals("")) {
            jtR_email.setText("Email");
            jtR_email.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_jtR_emailFocusLost

    private void jbR_resgistrateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbR_resgistrateActionPerformed
        validar v = new validar();

        String user = jtR_user.getText();
        String email = jtR_email.getText();
        String pst1 = new String(jpf_password.getPassword());
        String pst2 = new String(jpf_passwordC.getPassword());
        boolean chek = jcb_terminosCondiciones.isSelected();

        boolean validUser = v.validarUserOrPassword(user);
        boolean validPst1 = v.validarUserOrPassword(pst1);
        boolean validPst2 = v.validarUserOrPassword(pst2);
        boolean pstEquality = (pst1.equals(pst2));
        boolean validEmail = v.isEmail(email);
        boolean check = chek;

        if (validUser && validPst1 && validPst2 && pstEquality && validEmail && check) {
            
            Conexion conexion = Conexion.getInstancia();
            String consultaInsercion = "INSERT INTO usuarios (usuario, email, contrasena) VALUES (?, ?, ?)";
            conexion.ejecutarConsultaSinResultado(consultaInsercion, user, email, pst1);
            

            jtR_user.setText("");
            jtR_email.setText("");
            jpf_password.setText("");
            jpf_passwordC.setText("");
            jcb_terminosCondiciones.setSelected(false);

        } else {
            // Al menos una de las expresiones booleanas es falsa

            if (!validUser) {
                v.highlightComponent(jtR_user, 2000);
            }

            if (!validPst1) {
                v.highlightComponent(jpf_password, 2000);
            }

            if (!validPst2) {
                v.highlightComponent(jpf_passwordC, 2000);
            }

            if (!pstEquality) {
                v.highlightComponent(jpf_passwordC, 2000);

            }

            if (!validEmail) {
                v.highlightComponent(jtR_email, 2000);
            }

            if (!check) {
                v.highlightComponent(jcb_terminosCondiciones, 2000);
            }
        }

    }//GEN-LAST:event_jbR_resgistrateActionPerformed

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
            java.util.logging.Logger.getLogger(registro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JButton jbR_resgistrate;
    private javax.swing.JCheckBox jcb_terminosCondiciones;
    private javax.swing.JLabel jlR_iniciaSesionAqui;
    private javax.swing.JPasswordField jpf_password;
    private javax.swing.JPasswordField jpf_passwordC;
    private javax.swing.JTextField jtR_email;
    private javax.swing.JTextField jtR_user;
    // End of variables declaration//GEN-END:variables
}
