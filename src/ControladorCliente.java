
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;


public class ControladorCliente {
    public static Cliente[] clientes = new Cliente[100];
    public static Cuenta[][] cuentas = new Cuenta[100][100];
    ControladorBanco cb = new ControladorBanco();
    static int num=0;
    
    public void crearCliente(String nombre, String direccion, String telefono, int id, Cuenta monetaria){
        for(int i = 0; i < clientes.length; i++){
            if(clientes[i]==null){
               clientes[i]=new Cliente(nombre, direccion, telefono, id, monetaria);
               clientes[i].setId(i+1);
                break;
            }
        }
    }
    

    
    public void eliminarCliente(int id){
        clientes[id]=null;
    }
    
   
    
 
    
    public Cuenta agregarCuenta(int numero, double dinero){
        //int num=0;
        for(int i = 0; i<cuentas.length;i++){
            if(cuentas[i][0]==null){
                cuentas[i][0]= new Cuenta(numero,dinero);
                cuentas[i][0].setNumero(i+1);
                num = i;
                break;
            }
        }
        return cuentas[num][0];
    }
    
        public Cuenta agregarCuenta2(int id,int numero, double dinero){
        
        
        for(int i = 0; i<cuentas.length;i++){
            if(cuentas[id][i]==null){
                cuentas[id][i]= new Cuenta(numero,dinero);
                
                num++;
                cuentas[id][i].setNumero(num);
                break;
            }
        }
        return cuentas[id][num];
    }
        
    
    
    public Cuenta[]listaCuenta(int id){
        return cuentas[id];
    }
    
    public  void listaCliente(){
        
        for (int i = 0; i < clientes.length; i++) {
            if(clientes[i] != null ) {
                System.out.println(clientes[i].getNombre());
                System.out.println(clientes[i].getDireccion());
                System.out.println(clientes[i].getTelefono());

                System.out.println(clientes[i].getId());
            } 
        }    
    }
    
    public void depositar(int numero, double monto){
        for(int i = 0; i < cuentas.length; i++){
            for(int j = 0; j<10; j++){
                if(cuentas[i][j]!= null){
                     if(cuentas[i][j].getNumero()== numero){
                         cuentas[i][j].setDinero(cuentas[i][j].getDinero()+monto);
                        System.out.println(cuentas[i][j].getDinero());
                        break;
                    }
                }
            }
        }
        System.out.println(cuentas[1][0].getDinero());
    }
    
    public boolean retiro (int numero, double monto){

        boolean hayDinero = true;
        
            for(int i = 0; i < cuentas.length; i++){
                for(int j = 0; j<10; j++){
                    if(cuentas[i][j]!= null){
                         if(cuentas[i][j].getNumero()== numero){
                             if(cuentas[i][j].getDinero()>=monto){
                                 cuentas[i][j].setDinero(cuentas[i][j].getDinero()-monto);
                             }else{
                                 JOptionPane.showMessageDialog(null, "No hay suficiente dinero en la cuenta", "Error", ERROR_MESSAGE);
                                 hayDinero = false;
                             }

                            System.out.println(cuentas[i][j].getDinero());
                            break;
                        }
                    }
                }
            }
            System.out.println(cuentas[1][0].getDinero());
            return hayDinero;
        }
    
    public void consultarSaldo(int numero){
        for(int i = 0; i <cuentas.length;i++){
            for(int j = 0; j <10;j++){
                if(cuentas[i][j]!=null){
                    if(cuentas[i][j].getNumero()==numero){
                        JOptionPane.showMessageDialog(null, "El saldo es de: "+cuentas[i][j].getDinero());
                    }
                }
            }
        }
    }
    

    public void matrizCuenta(){
        for(int i = 0; i < cuentas.length; i++){
            for(int j = 0; j<10; j++){
                 
                   cuentas[i][j].setNumero(0);

            }
        }
    }
    
    
        public void mostrarDineroDeCuentas(){
            System.out.println("-----------------------------------------");
        for(int i = 0; i < cuentas.length; i++){
            for(int j = 0; j<10; j++){
                if(cuentas[i][j]!= null){
                    System.out.println(cuentas[i][j].getNumero()+"  "+cuentas[i][j].getDinero());
                }
            }
        }
       
    }
        
        public int ContadorDeCuentas(int id){
            System.out.println("-----------------------------------------");
            int contador=0;
            for(int j = 0; j<10; j++){
                if(cuentas[id+1][j]!= null){
                    //System.out.println(cuentas[id][j].getNumero()+"  "+cuentas[id][j].getDinero()+" "+clientes[id-1].getNombre());
                    contador++;
                }
            }
        
       return contador;
    }

    public double contadorDinero(int id){
        double dinero = 0;
        for(int j = 0; j<10;j++){
            if(cuentas[id+1][j]!=null){
                dinero = dinero + cuentas[id+1][j].getDinero();
            }
        }
        //System.out.println(dinero);
        return dinero;
    }
    
    public double[] contadorDeuda(){
        double dinero[] = new double[clientes.length];
        for(int i = 0; i < cb.prestamos.length;i++){
            if(cb.tarjetas[i]!=null||cb.prestamos!=null){
                if(cb.tarjetas[i]!=null&&cb.prestamos[i]!=null){
                    dinero[i]=cb.tarjetas[i].getCredito()+cb.prestamos[i].getDeuda();
                }else if(cb.tarjetas[i]!=null){
                    dinero[i]=cb.tarjetas[i].getCredito();
                }else if(cb.prestamos[i]!=null){
                    dinero[i] = cb.prestamos[i].getDeuda();
                }else{
                    
                }
                    
                    
            }
        }
        
     
        return dinero;
    }
}
