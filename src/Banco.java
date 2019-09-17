
public class Banco {
    String nombre, direccion, telefono;
    int id, numCajas, numEscritorios;
    double efectivo;
    
    

    public Banco(String nombre, String direccion, String telefono, int id, int numCajas, int numEscritorios, double efectivo) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.id = id;
        this.numCajas = numCajas;
        this.numEscritorios = numEscritorios;
        this.efectivo = efectivo;
    }
    
    public Banco(String direccion, int id, double efectivo){
        this.direccion = direccion;
        this.id = id;
        this.efectivo = efectivo;
    }
    public Banco(){
        
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

    public int getNumCajas() {
        return numCajas;
    }

    public void setNumCajas(int numCajas) {
        this.numCajas = numCajas;
    }

    public int getNumEscritorios() {
        return numEscritorios;
    }

    public void setNumEscritorios(int numEscritorios) {
        this.numEscritorios = numEscritorios;
    }

    public double getEfectivo() {
        return efectivo;
    }

    public void setEfectivo(double efectivo) {
        this.efectivo = efectivo;
    }
    
    
    

    public class AgenciaBancaria extends Banco{
        
        public AgenciaBancaria(String nombre, String direccion, String telefono, int id, int numCajas, int numEscritorios, double efectivo) {
            super(nombre, direccion, telefono, id, numCajas, numEscritorios, efectivo);
        }
        
        
    }
    
    public class AgenciaAutoBanco extends Banco{
        int numCajasAuto;
        public AgenciaAutoBanco(String nombre, String direccion, String telefono, int id, int numCajas, int numEscritorios,int numCajasAuto,double efectivo) {
            super(nombre, direccion, telefono, id, numCajas, numEscritorios, efectivo);
            this.numCajasAuto = numCajasAuto;
        }

        public int getNumCajasAuto() {
            return numCajasAuto;
        }

        public void setNumCajasAuto(int numCajasAuto) {
            this.numCajasAuto = numCajasAuto;
        }
        
        
 
    }
    
        public class Cajero extends Banco{
            boolean estado;
            int numTransaccion;
            public Cajero(String direccion, int id,int numTransaccion,double efectivo,boolean estado) {
                super(direccion,id,efectivo);
                this.estado = estado;
                this.numTransaccion = numTransaccion;
            }

        public boolean getEstado() {
            return estado;
        }
        
        public String getEstado2(){
            if(getEstado()){
                return "Activo";
            }else{
                return "En mantenimiento";
            }
        }

        public void setEstado(boolean estado) {
            this.estado = estado;
        }

        public int getNumTransaccion() {
            return numTransaccion;
        }

        public void setNumTransaccion(int numTransaccion) {
            this.numTransaccion = numTransaccion;
        }
            
            
 
    }
        
    public class Servicios{
        double monto;
        public Servicios(){
            this.monto = 300;
        }

        public double getMonto() {
            return monto;
        }

        public void setMonto(double monto) {
            this.monto = monto;
        }
        
        
    }
    
    public class Tarjeta{
        int numero;
        Cliente cliente;
        double credito;
        double deuda;
        boolean estado;
        public Tarjeta(Cliente cliente, int numero, double credito,boolean estado){
            this.credito = credito;
            this.deuda = 0;
            this.cliente = cliente;
            this.numero = numero;
            this.estado = estado;
        }

        public int getNumero() {
            return numero;
        }

        public void setNumero(int numero) {
            this.numero = numero;
        }

        public Cliente getCliente() {
            return cliente;
        }

        public void setCliente(Cliente cliente) {
            this.cliente = cliente;
        }

        public double getCredito() {
            return credito;
        }

        public void setCredito(double credito) {
            this.credito = credito;
        }

        public double getDeuda() {
            return deuda;
        }

        public void setDeuda(double deuda) {
            this.deuda = deuda;
        }

        public boolean isEstado() {
            return estado;
        }

        public void setEstado(boolean estado) {
            this.estado = estado;
        }
        
        
        
        
    }
    
    public class Prestamo{
         int numero;
        Cliente cliente;
        double deuda;
        boolean estado;
        public Prestamo(Cliente cliente,double deuda, int numero,boolean estado){
            this.deuda = deuda;
            this.cliente = cliente;
            this.numero = numero;
            this.estado = estado;
        }

        public int getNumero() {
            return numero;
        }

        public void setNumero(int numero) {
            this.numero = numero;
        }

        public Cliente getCliente() {
            return cliente;
        }

        public void setCliente(Cliente cliente) {
            this.cliente = cliente;
        }

        public double getDeuda() {
            return deuda;
        }

        public void setDeuda(double deuda) {
            this.deuda = deuda;
        }

        public boolean getEstado() {
            return estado;
        }

        public void setEstado(boolean estado) {
            this.estado = estado;
        }
        
        
        
    }
}
