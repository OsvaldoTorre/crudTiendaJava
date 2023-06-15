/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import conexion.Conexion;
import java.awt.Color;
import principal.validar;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author OSVALDO
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
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

        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jtI_user = new javax.swing.JTextField();
        jtI_password = new javax.swing.JTextField();
        jbI_IniciaSesion = new javax.swing.JButton();
        jlI_olvidasteContrasena = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcb_recuerdame = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jlI_registrateAqui = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jlI_mensaje = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicia Sesión");
        setBackground(new java.awt.Color(204, 204, 204));
        setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        setForeground(new java.awt.Color(51, 51, 51));
        setMinimumSize(new java.awt.Dimension(450, 400));
        setName("fm_login"); // NOI18N
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jtI_user.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jtI_user.setForeground(new java.awt.Color(204, 204, 204));
        jtI_user.setText("Usuario");
        jtI_user.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtI_userFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtI_userFocusLost(evt);
            }
        });
        jtI_user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtI_userKeyTyped(evt);
            }
        });

        jtI_password.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jtI_password.setForeground(new java.awt.Color(204, 204, 204));
        jtI_password.setText("Contraseña");
        jtI_password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtI_passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtI_passwordFocusLost(evt);
            }
        });
        jtI_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtI_passwordKeyTyped(evt);
            }
        });

        jbI_IniciaSesion.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jbI_IniciaSesion.setText("Inicia sesión");
        jbI_IniciaSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbI_IniciaSesionActionPerformed(evt);
            }
        });

        jlI_olvidasteContrasena.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jlI_olvidasteContrasena.setForeground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));
        jlI_olvidasteContrasena.setText("¿Olvidaste tu contraseña?");

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel2.setText("¿No tienes una cuenta?");

        jcb_recuerdame.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jcb_recuerdame.setText("Recuerdame");

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel3.setText("Contraseña");

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel4.setText("Usuario");

        jlI_registrateAqui.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jlI_registrateAqui.setForeground(javax.swing.UIManager.getDefaults().getColor("Actions.Blue"));
        jlI_registrateAqui.setText("Regístrate aquí");
        jlI_registrateAqui.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlI_registrateAquiMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Inicia sesión");

        jlI_mensaje.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Green"));
        jlI_mensaje.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jlI_mensaje.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        jlI_mensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlI_mensaje.setText("Por favor, ingresa tus credenciales para acceder a tu cuenta.");
        jlI_mensaje.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jcb_recuerdame)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addComponent(jlI_olvidasteContrasena))
                    .addComponent(jtI_password, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtI_user, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbI_IniciaSesion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlI_registrateAqui)
                .addContainerGap(144, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlI_mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtI_user, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(8, 8, 8)
                .addComponent(jtI_password, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcb_recuerdame, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlI_olvidasteContrasena, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jbI_IniciaSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlI_registrateAqui, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(50, 50, 50)
                .addComponent(jlI_mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Roboto Thin", 0, 48)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("¡Bienvenido de nuevo!");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(180, 180, 180))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlI_registrateAquiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlI_registrateAquiMouseClicked
        registro r = new registro();
        r.setLocationRelativeTo(null);
        r.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jlI_registrateAquiMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    }//GEN-LAST:event_formWindowActivated

    private void jtI_userFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtI_userFocusGained
        if (jtI_user.getText().equals("Usuario")) {
            jtI_user.setText("");
            jtI_user.setForeground(Color.BLACK);
        }

    }//GEN-LAST:event_jtI_userFocusGained

    private void jtI_userFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtI_userFocusLost
        if (jtI_user.getText().equals("")) {
            jtI_user.setText("Usuario");
            jtI_user.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_jtI_userFocusLost

    private void jtI_passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtI_passwordFocusGained
        if (jtI_password.getText().equals("Contraseña")) {
            jtI_password.setText("");
            jtI_password.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jtI_passwordFocusGained

    private void jtI_passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtI_passwordFocusLost
        if (jtI_password.getText().equals("")) {
            jtI_password.setText("Contraseña");
            jtI_password.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_jtI_passwordFocusLost

    private void jtI_userKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtI_userKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;
        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean simbolo = key == 35 || key == 46 || key == 95;

        if (!(minusculas || mayusculas || simbolo || numeros)) {
            evt.consume();
        }
    }//GEN-LAST:event_jtI_userKeyTyped

    private void jtI_passwordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtI_passwordKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;
        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean simbolo = key == 35 || key == 46 || key == 95;

        if (!(minusculas || mayusculas || simbolo || numeros)) {
            evt.consume();
        }
    }//GEN-LAST:event_jtI_passwordKeyTyped

    private void jbI_IniciaSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbI_IniciaSesionActionPerformed

        String user = jtI_user.getText();
        String pass = jtI_password.getText();

        validar v = new validar();

        boolean u = v.validarUserOrPassword(user);
        boolean p = v.validarUserOrPassword(pass);

        if (p && u) {
            Conexion conexion = Conexion.getInstancia();

            // Ejemplo de ejecución de consulta
            String consulta = "SELECT * FROM usuarios WHERE usuario = ? AND contrasena = ?;";
            ResultSet resultado = conexion.ejecutarConsulta(consulta, user, pass);

            if (resultado != null) {
                try {
                    while (resultado.next()) {

                    }
                    crud n = new crud();
                    n.setVisible(true);
                    n.setLocationRelativeTo(null);
                    this.dispose();
                    
                } catch (SQLException e) {
                    System.out.println("Error al procesar los resultados: " + e.getMessage());
                }

                
            } else {
                conexion.cerrarConexion();
            }
        } else {
            if (!u) {
                v.highlightComponent(jtI_user, 2000);
            }

            if (!p) {
                v.highlightComponent(jtI_password, 2000);
            }
        }
    }//GEN-LAST:event_jbI_IniciaSesionActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton jbI_IniciaSesion;
    private javax.swing.JCheckBox jcb_recuerdame;
    private javax.swing.JLabel jlI_mensaje;
    private javax.swing.JLabel jlI_olvidasteContrasena;
    private javax.swing.JLabel jlI_registrateAqui;
    private javax.swing.JTextField jtI_password;
    private javax.swing.JTextField jtI_user;
    // End of variables declaration//GEN-END:variables
}
