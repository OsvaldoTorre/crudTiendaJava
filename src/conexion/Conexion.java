/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

/**
 *
 * @author OSVALDO
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexion {

    private static Conexion instancia;
    private Connection conexion;

    private Conexion() {
        // Datos de conexión a la base de datos
        String jdbcUrl = "jdbc:postgresql://localhost:5432/tienda_abarrotes";
        String usuario = "postgres";
        String contraseña = "admin";

        try {
            // Establecer la conexión
            conexion = DriverManager.getConnection(jdbcUrl, usuario, contraseña);
            System.out.println("Conexion exitosa a la base de datos PostgreSQL");
        } catch (SQLException e) {
            System.out.println("Error al establecer la conexion: " + e.getMessage());
        }
    }

    public static Conexion getInstancia() {
        if (instancia == null) {
            instancia = new Conexion();
        }
        return instancia;
    }

    public Connection getConexion() {
        return conexion;
    }

    public void cerrarConexion() {
        try {
            if (conexion != null) {
                conexion.close();
                System.out.println("Conexion cerrada");
            }
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexion: " + e.getMessage());
        }
    }

    public ResultSet ejecutarConsulta(String consulta, Object... parametros) {
        ResultSet resultado = null;

        try {
            PreparedStatement statement = conexion.prepareStatement(consulta);
            // Asignar los parámetros a la consulta preparada
            for (int i = 0; i < parametros.length; i++) {
                statement.setObject(i + 1, parametros[i]);
            }
            resultado = statement.executeQuery();
        } catch (SQLException e) {
            System.out.println("Error al ejecutar la consulta: " + e.getMessage());
        }

        return resultado;
    }

    public int ejecutarConsultaIME(String consulta, Object... parametros) {
        int filasAfectadas = 0;

        try {
            PreparedStatement statement = conexion.prepareStatement(consulta);
            // Asignar los parámetros a la consulta preparada
            for (int i = 0; i < parametros.length; i++) {
                statement.setObject(i + 1, parametros[i]);
            }
            filasAfectadas = statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al ejecutar la consulta de actualización: " + e.getMessage());
        }

        return filasAfectadas;
    }
}

/*
Conexion conexion = Conexion.getInstancia();

        // Ejemplo de ejecución de consulta
        String consulta = "SELECT * FROM usuarios";
        ResultSet resultado = conexion.ejecutarConsulta(consulta);

        if (resultado != null) {
            try {
                while (resultado.next()) {
                    int id = resultado.getInt("id");
                    String nombre = resultado.getString("nombre_usuario");
                    String email = resultado.getString("email");
                    String contrasena = resultado.getString("contrasena");

                }
            } catch (SQLException e) {
                System.out.println("Error al procesar los resultados: " + e.getMessage());
            }

            conexion.cerrarConexion();
        } else {
            System.out.println("La consulta esta vacia");
        }
 */
