





public class ControladorEmpleado {
    public static Empleados[] empleados = new Empleados[100];
    
        public void crearEmpleado(String nombre, String direccion, String telefono, int id){
        for(int i = 0; i <empleados.length; i++){
            if(empleados[i]==null){
               empleados[i]=new Empleados(nombre, direccion, telefono, id);
               empleados[i].setId(i+1);
                break;
            }
        }
    }

    public void eliminarEmpleado(int id) {
        empleados[id]=null;
    }
    
    
    
}
