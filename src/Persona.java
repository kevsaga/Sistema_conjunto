
public class Persona {
    String nombre;
    String Cedula;
    String Tipo;
    public Persona (String nombre, String Cedula, String Tipo){
        this.nombre = nombre;
        this.Cedula = Cedula;
        this.Tipo = Tipo;
    }
    public String getnombre(){
    return nombre;
    }
    public String getCedula(){
        return Cedula;
    }
    public String getTipo(){
    return Tipo;
    }
    
}
