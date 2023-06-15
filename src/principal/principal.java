/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal;

import com.formdev.flatlaf.FlatLightLaf;
import conexion.Conexion;
import javax.swing.UIManager;
import vista.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author OSVALDO
 */


public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            // Establecer el look and feel de FlatLaf Light
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception e) {
            System.err.println("Error al establecer el look and feel: " + e.getMessage());
        }

      login l = new login();
      l.setLocationRelativeTo(null);
      l.setVisible(true);
       

    }

}
