package Modelo;

public class UsuarioModelo extends ModeloPersona {
    
    private String idUsuario;

    public UsuarioModelo() {}

    public UsuarioModelo(String nombre, int edad, String idUsuario) {
        super(nombre, edad);
        this.idUsuario = idUsuario;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }
}