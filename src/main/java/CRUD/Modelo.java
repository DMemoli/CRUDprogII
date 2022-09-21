package CRUD;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.ArrayList;

public class Modelo {

    private String jdbcDriver;
    private String dbName;
    private String urlRoot;
    private ArrayList<Usuarios> resultado;
    private ActionListener listener;

    public Modelo(String url, String dbName) {
        jdbcDriver = "com.mysql.cj.jdbc.Driver";
        urlRoot = "jdbc:mysql://" + url + "/";
        this.dbName = dbName;
        listener = null;
        resultado = new ArrayList<>();
        try {
            Class.forName(jdbcDriver);
        } catch (ClassNotFoundException e) {
            reportException(e.getMessage());
        }
    }

    public void consultarUsuarios() {
        try {
            Connection con = DriverManager.getConnection(urlRoot + dbName, "", "");
            Statement stmt = con.createStatement();
            stmt.execute("SELECT * FROM usuarios;");
            ResultSet rs = stmt.getResultSet();
            while (rs.next()) {
                Usuarios user = new Usuarios(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
                resultado.add(user);
            }
            con.close();
        } catch (SQLException e) {
            reportException(e.getMessage());
        }
    }
    public void agregarUsuario(String user, String pass, String nombre, String apellido){
        try {
            Connection con = DriverManager.getConnection(urlRoot + dbName, "", "");
            Statement stmt = con.createStatement();
            stmt.execute("INSERT INTO `clasecrud`.`usuarios` (`user`, `password`, `nombre`, `apellido`) VALUES ('"+ user +"','" + pass + "','" + nombre + "','" + apellido + "');");
            ResultSet rs = stmt.getResultSet();
            EntradaSalida.salidaString(String.valueOf(rs));
            con.close();
        } catch (SQLException e) {
            reportException(e.getMessage());
        }
    }

    public void borrarUsuario(int id){

    }

    public ArrayList<Usuarios> getResultado() {
        return resultado;
    }

    private void reportException(String exception) {
        if (listener != null) {
            ActionEvent evt = new ActionEvent(this, 0, exception);
            listener.actionPerformed(evt);
        }
    }

    public void addExceptionListener(ActionListener listener) {
        this.listener = listener;
    }
}
