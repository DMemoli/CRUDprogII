package CRUD;

public class Usuarios {
    private int id;
    private String user;
    private String pass;
    private String nombre;
    private String apellido;

    public Usuarios(int id, String user, String pass, String nombre, String apellido) {
        this.id = id;
        this.user = user;
        this.pass = pass;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String toString(){
        return "\nId: "+id
                +"\tUsuario: "+user
                +"\t\tNombre: "+nombre
                +"\t\tApellido: "+apellido+"\n";
    }
}
