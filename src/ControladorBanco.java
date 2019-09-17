








public class ControladorBanco extends Banco{

    
    public static AgenciaBancaria agenciasBan[] = new AgenciaBancaria[50];
    public static AgenciaAutoBanco agenciasAuto[]=new AgenciaAutoBanco[50];
    public static Cajero cajeros[] = new Cajero[50];
    public static Servicios agua[] = new Servicios[50];
    public static Servicios luz[] = new Servicios[50];
    public static Servicios telefono[] = new Servicios[50];
    public static Tarjeta[] tarjetas = new Tarjeta[50];
    public static Prestamo prestamos []= new Prestamo[50];
     
    ///// AGENCIAS BANCARIAS
     public void CrearAgenciaBancaria(String nombre,String direccion,String telefono,int id,int numCajas,int numEscritorios,double efectivo){
         
        for(int i = 0; i < agenciasBan.length; i++){
            if(agenciasBan[i]==null){
                agenciasBan[i]=new AgenciaBancaria(nombre, direccion, telefono, id, numCajas, numEscritorios,efectivo);
                agenciasBan[i].setId(i+1);
                agenciasBan[i].setEfectivo(10000);
                System.out.println(agenciasBan[i]);
                break;
            }
        }
     }
    
    public void eliminarAgenciaBancaria(int id){
        agenciasBan[id]=null;
     }
  
///// AGENCIAS DE AUTOBANCO    
    public void CrearAgenciaBancariaAuto(String nombre,String direccion,String telefono,
            int id,int numCajas,int numEscritorios,int numCajasAuto, double efectivo){
         
        for(int i = 0; i < agenciasAuto.length; i++){
            if(agenciasAuto[i]==null){
                agenciasAuto[i]=new AgenciaAutoBanco(nombre, direccion, telefono, id, numCajas, numEscritorios,numCajasAuto,efectivo);
                agenciasAuto[i].setId(i+1);
                agenciasAuto[i].setEfectivo(100000);
                System.out.println(agenciasAuto[i]);
                break;
            }
        }
     }
    

    public void eliminarAgenciaBancariaAuto(int id){
        agenciasAuto[id]=null;
     }
    

 ////// CAJEROS   
    public void CrearCajero(String direccion,int id,int numTransaccion, double efectivo,boolean estado){
         
        for(int i = 0; i < cajeros.length; i++){
            if(cajeros[i]==null){
                cajeros[i]=new Cajero(direccion,id,numTransaccion,efectivo,estado);
                cajeros[i].setId(i+1);
                cajeros[i].setEfectivo(100000);
                System.out.println(cajeros[i]);
                break;
            }
        }
     }
     
    public void eliminarCajero(int id){
        cajeros[id]=null;
     }
    
    ////////////////////////////////////////////////

    public void depositar(int id, double monto){
        for(int i = 0; i < agenciasBan.length; i++){
            
                if(agenciasBan[i]!= null){
                     if(agenciasBan[i].getId()== id){
                         agenciasBan[i].setEfectivo(agenciasBan[i].getEfectivo()+monto);
                        System.out.println(agenciasBan[i].getEfectivo());
                        break;
                    }
                }
            
        }
    }
    
        public void retirar(int id, double monto){
            for(int i = 0; i < agenciasBan.length; i++){
            
                if(agenciasBan[i]!= null){
                     if(agenciasBan[i].getId()== id){
                         agenciasBan[i].setEfectivo(agenciasBan[i].getEfectivo()-monto);
                        System.out.println(agenciasBan[i].getEfectivo());
                        break;
                    }
                }
            
        }
    }
        
        
            public void retirarCajero(int id, double monto){
            for(int i = 0; i < cajeros.length; i++){
            
                if(cajeros[i]!= null){
                     if(cajeros[i].getId()== id){
                         cajeros[i].setEfectivo(cajeros[i].getEfectivo()-monto);
                        System.out.println(cajeros[i].getEfectivo());
                        break;
                    }
                }
            
        }
    }    
     public void pagar(int id){
         agua[1].setMonto(0);
     }
     
     
         public void crearServicio(){
            for(int i=0;i<agua.length; i++){
                if(agua[i]==null){
                    agua[i]=new Servicios();
                }
            }
            for(int i=0;i<luz.length; i++){
                if(luz[i]==null){
                    luz[i]=new Servicios();
                }
            }

            for(int i=0;i<telefono.length; i++){
                if(telefono[i]==null){
                    telefono[i]=new Servicios();
                }
            }
    }
         
    
        public void crearTarjeta(Cliente cliente, int numero,double credito, boolean estado){
            for(int i = 0; i < tarjetas.length;i++){
                if(tarjetas[i]==null){
                    tarjetas[i]=new Tarjeta(cliente, numero,credito,estado);
                    tarjetas[i].setNumero(i+1);
                    System.out.println(tarjetas[i]);
                    break;
                }
            }
        }
        
       public void eliminarTarjeta(int id){
         tarjetas[id]=null;
     }
    
        public void crearPrestamo(Cliente cliente, int numero,double deuda, boolean estado){
            for(int i = 0; i < prestamos.length;i++){
                if(prestamos[i]==null){
                    prestamos[i]=new Prestamo(cliente,deuda, numero,estado);
                    prestamos[i].setNumero(i+1);
                    System.out.println(prestamos[i]);
                    break;
                }
            }
        }       
     
        public void eliminarPrestamo(int id){
             prestamos[id]=null;
        }

    
     
}
