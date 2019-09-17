
public class Cliente {
    private String nombre, direccion, telefono;
    private int id, numPrestamo, numTransaccion, numTarjeta;
    private double prestamo, transaccion, tarjeta;
    private Cuenta monetaria, ahorro;
    
    public Cliente(String nombre, String direccion, String telefono, int id, int numPrestamo, int numTransaccion, int numTarjeta, double prestamo, double transaccion, double tarjeta, Cuenta monetaria, Cuenta ahorro) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.id = id;
        this.numPrestamo = numPrestamo;
        this.numTransaccion = numTransaccion;
        this.numTarjeta = numTarjeta;
        this.prestamo = prestamo;
        this.transaccion = transaccion;
        this.tarjeta = tarjeta;
        this.monetaria = monetaria;
        this.ahorro = ahorro;
    }

    public Cliente(String nombre, String direccion, String telefono, int id, Cuenta monetaria) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.id = id;
        this.monetaria = monetaria;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumPrestamo() {
        return numPrestamo;
    }

    public void setNumPrestamo(int numPrestamo) {
        this.numPrestamo = numPrestamo;
    }

    public int getNumTransaccion() {
        return numTransaccion;
    }

    public void setNumTransaccion(int numTransaccion) {
        this.numTransaccion = numTransaccion;
    }

    public int getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(int numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    public double getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(double prestamo) {
        this.prestamo = prestamo;
    }

    public double getTransaccion() {
        return transaccion;
    }

    public void setTransaccion(double transaccion) {
        this.transaccion = transaccion;
    }

    public double getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(double tarjeta) {
        this.tarjeta = tarjeta;
    }

    public Cuenta getMonetaria() {
        return monetaria;
    }

    public void setMonetaria(Cuenta monetaria) {
        this.monetaria = monetaria;
    }

    public Cuenta getAhorro() {
        return ahorro;
    }

    public void setAhorro(Cuenta ahorro) {
        this.ahorro = ahorro;
    }
    
    
    
    
    
    
}
