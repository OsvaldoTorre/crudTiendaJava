/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author OSVALDO
 */
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JTableLoader {
    public static void loadResultSet(JTable table, ResultSet resultSet) throws SQLException {
        // Obtiene los metadatos del ResultSet
        ResultSetMetaData metaData = resultSet.getMetaData();
        int columnCount = metaData.getColumnCount();

        // Crea el modelo de tabla con las columnas del ResultSet
        DefaultTableModel model = new DefaultTableModel();
        for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
            model.addColumn(metaData.getColumnLabel(columnIndex));
        }
        
        // Agrega las filas al modelo de tabla con los datos del ResultSet
        while (resultSet.next()) {
            Object[] rowData = new Object[columnCount];
            for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                rowData[columnIndex - 1] = resultSet.getObject(columnIndex);
            }
            model.addRow(rowData);
        }
        
        // Establece el modelo de tabla en el JTable
        table.setModel(model);
    }
}
