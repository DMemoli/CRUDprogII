package CRUD;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        String ip = "localhost";
        String bd = "clasecrud";
        Modelo m = new Modelo(ip, bd);
        //m.agregarUsuario("Pato", "1234", "pato", "pato");
        m.consultarUsuarios();

        ArrayList<Usuarios> resultado = m.getResultado();
        EntradaSalida.salidaString(String.valueOf(resultado));


    }
}