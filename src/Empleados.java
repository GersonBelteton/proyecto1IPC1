import javax.swing.*;

public class Empleados{
    String nombre, direccion, telefono,puesto;
    int id;
    Banco agencia;
    
            public Empleados(String nombre, String direccion, String telefono, String puesto,int id){
        
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.puesto = puesto;
        this. id = id;
        
    }
    
    public Empleados(String nombre, String direccion, String telefono,int id){
        
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this. id = id;
        
    }
    

    
    public Empleados(){
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPuesto() {
        if(puesto == null){
            puesto = "Sin puesto";
        }
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Banco getAgencia() {
        return agencia;
    }

    public void setAgencia(Banco agencia) {
        this.agencia = agencia;
    }
    
    

    
}
