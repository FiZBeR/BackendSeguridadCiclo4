package comProyectoFinalCiclo4.SegurityBE.Modelos;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document()
public class Usuario {
    @Id
    private String _id;
    private String seudonimo;
    private String correo;
    private String clave;

    @DBRef //Con este Objeto el programa entiende que se ace referencia a un objeto de otra coleccion la cual debe  dejar de referencia para consultar
    private Rol rol;




    public Usuario(String seudonimo, String correo, String clave) {
        this.seudonimo = seudonimo;
        this.correo = correo;
        this.clave = clave;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getSeudonimo() {
        return seudonimo;
    }

    public void setSeudonimo(String seudonimo) {
        this.seudonimo = seudonimo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }


    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

}
