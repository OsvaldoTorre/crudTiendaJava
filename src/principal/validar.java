/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JTable;
import javax.swing.Timer;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;

import java.sql.SQLException;
import org.postgresql.jdbc.PgResultSetMetaData;

/**
 *
 * @author OSVALDO
 */
public class validar {

    public boolean isEmail(String correo) {
        Pattern pat = null;
        Matcher mat = null;
        pat = Pattern.compile("^([0-9a-zA-Z]([_.w]*[0-9a-zA-Z])*@([0-9a-zA-Z][-w]*[0-9a-zA-Z].)+([a-zA-Z]{2,9}.)+[a-zA-Z]{2,3})$");
        mat = pat.matcher(correo);
        return mat.find();
    }

    public boolean validarUserOrPassword(String input) {
        boolean isValidUsername = input.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[#._]).{8,}$");
        return isValidUsername;
    }

    public boolean validarN(String input) {
        boolean isValidUsername = input.matches("^[0-9]+$");
        return isValidUsername;
    }

    public boolean validarNL(String input) {
        boolean isValidUsername = input.matches("^[a-zA-Z0-9]+$");
        return isValidUsername;
    }

    public boolean validarL(String input) {
        boolean isValidUsername = input.matches("^[a-zA-Z]+$");
        return isValidUsername;
    }

    public void highlightComponent(JComponent component, int duration) {
        // Guardar el borde original
        Border originalBorder = component.getBorder();

        // Establecer el borde rojo
        component.setBorder(BorderFactory.createLineBorder(Color.RED, 1));

        // Crear un temporizador para restablecer el borde original después de la duración especificada
        Timer timer = new Timer(duration, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Restablecer el borde original

                component.setBorder(originalBorder);
            }
        });

        timer.setRepeats(false); // No repetir el temporizador

        timer.start();

    }

    public static void cargarTabla(JTable tabla, ResultSet resultado) throws SQLException {
        // Obtener metadatos del ResultSet
        ResultSetMetaData metaData = (ResultSetMetaData) resultado.getMetaData();

        // Obtener el número de columnas
        int columnCount = metaData.getColumnCount();

        // Crear un modelo de tabla vacío con las columnas
        DefaultTableModel tableModel = new DefaultTableModel();
        for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
            tableModel.addColumn(metaData.getColumnLabel(columnIndex));
        }

        // Iterar sobre el ResultSet y agregar filas al modelo de tabla
        while (resultado.next()) {
            Object[] rowData = new Object[columnCount];
            for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                rowData[columnIndex - 1] = resultado.getObject(columnIndex);
            }
            tableModel.addRow(rowData);
        }

        // Asignar el modelo de tabla al componente JTable
        tabla.setModel(tableModel);
    }

}
