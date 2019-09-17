
import javax.swing.*;
public class Main {

 
    public static void main(String[] args) {
        ControladorCliente cc = new ControladorCliente();
        ControladorBanco cb = new ControladorBanco();
        ControladorEmpleado ce = new ControladorEmpleado();
        cc.crearCliente("Juan Perez", "zona1", "51534457", 0,cc.agregarCuenta2(1,0,0));
        cc.crearCliente("Luis Martinez", "zona2", "56787645", 0,cc.agregarCuenta2(2,0,100));
        cc.crearCliente("Gerson Belteton", "zona3", "57897634", 0,cc.agregarCuenta2(3,0,200));
        cc.crearCliente("Mario Fernandez", "zona4", "54673456", 0,cc.agregarCuenta2(4,0,600));
        cc.crearCliente("Roberto Mendez", "zona1", "51534457", 0,cc.agregarCuenta2(5,0,0));
        cc.crearCliente("Luis Contreras", "zona2", "56787645", 0,cc.agregarCuenta2(6,0,700));
        cc.crearCliente("Jorge Guevara", "zona3", "57897634", 0,cc.agregarCuenta2(7,0,200));
        cc.crearCliente("Marlon Peña", "zona4", "54673456", 0,cc.agregarCuenta2(8,0,300));
        cc.crearCliente("Jorge Robles", "zona3", "57897634", 0,cc.agregarCuenta2(9,0,200));
        cc.crearCliente("Marlon Ruiz", "zona4", "54673456", 0,cc.agregarCuenta2(10,0,300));
        
        
        cb.CrearAgenciaBancaria("Agencia 1", "Guatemala","123456",0,10,5,0);
        cb.CrearAgenciaBancaria("Agencia 2", "Guatemala","123456",0,10,5,0);
        cb.CrearAgenciaBancaria("Agencia 3", "Guatemala","123456",0,10,5,0);
        cb.CrearAgenciaBancaria("Agencia 4", "Guatemala","123456",0,10,5,0);
        cb.CrearAgenciaBancaria("Agencia 5", "Guatemala","123456",0,10,5,0);
        
        cb.CrearAgenciaBancariaAuto("Agencia Auto 1", "Guatemala","123456",0,10,5,5,0);
        cb.CrearAgenciaBancariaAuto("Agencia Auto 2", "Guatemala","123456",0,10,5,5,0);
        cb.CrearAgenciaBancariaAuto("Agencia Auto 3", "Guatemala","123456",0,10,5,5,0);
        cb.CrearAgenciaBancariaAuto("Agencia Auto 4", "Guatemala","123456",0,10,5,5,0);
        cb.CrearAgenciaBancariaAuto("Agencia Auto 5", "Guatemala","123456",0,10,5,5,0);
        
        cb.CrearCajero("zona1", 0, 0, 0, true);
        cb.CrearCajero("zona2", 0, 0, 0, true);
        cb.CrearCajero("zona3", 0, 0, 0, true);
        cb.CrearCajero("zona4", 0, 0, 0, true);
        cb.CrearCajero("zona5", 0, 0, 0, true);
        cb.CrearCajero("zona6", 0, 0, 0, true);
        cb.CrearCajero("zona7", 0, 0, 0, true);
        cb.CrearCajero("zona8", 0, 0, 0, true);
        cb.CrearCajero("zona9", 0, 0, 0, true);
        cb.CrearCajero("zona10", 0, 0, 0, true);
        
        ce.crearEmpleado("Juan Robles", "Zona1", "56747374", 0);
        ce.empleados[0].setPuesto("Informatica");
        ce.crearEmpleado("Pedro Mendez", "Zona1", "56747374", 0);
        ce.empleados[1].setPuesto(cb.agenciasBan[0].getNombre());
        ce.crearEmpleado("Alejandro Hernandez", "Zona1", "56747374", 0);
        ce.empleados[2].setPuesto(cb.agenciasBan[0].getNombre());
        ce.crearEmpleado("Jorge Matias", "Zona1", "56747374", 0);
        ce.empleados[3].setPuesto(cb.agenciasBan[0].getNombre());
        ce.crearEmpleado("Yazmin Martinez", "Zona1", "56747374", 0);
        ce.empleados[4].setPuesto(cb.agenciasBan[1].getNombre());
        ce.crearEmpleado("Maria Lopez", "Zona1", "56747374", 0);
        ce.empleados[5].setPuesto(cb.agenciasBan[1].getNombre());
        ce.crearEmpleado("Juan Martinez", "Zona1", "56747374", 0);
        ce.empleados[6].setPuesto(cb.agenciasBan[1].getNombre());
        ce.crearEmpleado("Pedro Lopez", "Zona1", "56747374", 0);
        ce.empleados[7].setPuesto(cb.agenciasBan[2].getNombre());
        ce.crearEmpleado("Carlos Morales", "Zona1", "56747374", 0);
        ce.empleados[8].setPuesto(cb.agenciasBan[2].getNombre());
        ce.crearEmpleado("Juan Marquez", "Zona1", "56747374", 0);
        ce.empleados[9].setPuesto(cb.agenciasBan[2].getNombre());
        ce.crearEmpleado("Raul Fernandez", "Zona1", "56747374", 0);
        ce.empleados[10].setPuesto(cb.agenciasBan[3].getNombre());
        ce.crearEmpleado("Pedro Galvez", "Zona1", "56747374", 0);
        ce.empleados[11].setPuesto(cb.agenciasBan[3].getNombre());
        ce.crearEmpleado("Martin Román", "Zona1", "56747374", 0);
        ce.empleados[12].setPuesto(cb.agenciasBan[3].getNombre());
        ce.crearEmpleado("Gladys Zavala", "Zona1", "56747374", 0);
        ce.empleados[13].setPuesto(cb.agenciasBan[4].getNombre());
        ce.crearEmpleado("Mariana Rodriguez", "Zona1", "56747374", 0);
        ce.empleados[14].setPuesto(cb.agenciasBan[4].getNombre());
        ce.crearEmpleado("Angel Benitez", "Zona1", "56747374", 0);
        ce.empleados[15].setPuesto(cb.agenciasBan[4].getNombre());
        
        ce.crearEmpleado("Pedro Melendez", "Zona1", "56747374", 0);
        ce.empleados[16].setPuesto(cb.agenciasAuto[0].getNombre());
        ce.crearEmpleado("Marlon Hernandez", "Zona1", "56747374", 0);
        ce.empleados[17].setPuesto(cb.agenciasAuto[0].getNombre());
        ce.crearEmpleado("Jorge Matta", "Zona1", "56747374", 0);
        ce.empleados[18].setPuesto(cb.agenciasAuto[0].getNombre());
        ce.crearEmpleado("Yeny Martinez", "Zona1", "56747374", 0);
        ce.empleados[19].setPuesto(cb.agenciasAuto[1].getNombre());
        ce.crearEmpleado("Mariana Lopez", "Zona1", "56747374", 0);
        ce.empleados[20].setPuesto(cb.agenciasAuto[1].getNombre());
        ce.crearEmpleado("Juana Martinez", "Zona1", "56747374", 0);
        ce.empleados[21].setPuesto(cb.agenciasAuto[1].getNombre());
        ce.crearEmpleado("Pepe Lopez", "Zona1", "56747374", 0);
        ce.empleados[22].setPuesto(cb.agenciasAuto[2].getNombre());
        ce.crearEmpleado("Carlos Norales", "Zona1", "56747374", 0);
        ce.empleados[23].setPuesto(cb.agenciasAuto[2].getNombre());
        ce.crearEmpleado("Carlos Marquez", "Zona1", "56747374", 0);
        ce.empleados[24].setPuesto(cb.agenciasAuto[2].getNombre());
        ce.crearEmpleado("Roberto Fernandez", "Zona1", "56747374", 0);
        ce.empleados[25].setPuesto(cb.agenciasAuto[3].getNombre());
        ce.crearEmpleado("Pedro Galicia", "Zona1", "56747374", 0);
        ce.empleados[26].setPuesto(cb.agenciasAuto[3].getNombre());
        ce.crearEmpleado("Martin Románo", "Zona1", "56747374", 0);
        ce.empleados[27].setPuesto(cb.agenciasAuto[3].getNombre());
        ce.crearEmpleado("Tatiana Zavala", "Zona1", "56747374", 0);
        ce.empleados[28].setPuesto(cb.agenciasAuto[4].getNombre());
        ce.crearEmpleado("Mariana Vasquez", "Zona1", "56747374", 0);
        ce.empleados[29].setPuesto(cb.agenciasAuto[4].getNombre());
        ce.crearEmpleado("Angel Benito", "Zona1", "56747374", 0);
        ce.empleados[30].setPuesto(cb.agenciasAuto[4].getNombre());        
        ce.crearEmpleado("Samuel Perez", "Zona1", "56747374", 0);
        ce.empleados[31].setPuesto("Informatica");
        ce.crearEmpleado("Claudia Contreras", "Zona1", "56747374", 0);
        ce.empleados[32].setPuesto("Gerencia");
        ce.crearEmpleado("Claudi Gomez", "Zona1", "56747374", 0);
        ce.empleados[33].setPuesto("Gerencia");
        ce.crearEmpleado("Alicia Hernandez", "Zona1", "56747374", 0);
        ce.empleados[34].setPuesto("Marketing");
        ce.crearEmpleado("David Colindres", "Zona1", "56747374", 0);
        ce.empleados[35].setPuesto("Marketing");
        ce.crearEmpleado("Mario Paredes", "Zona1", "56747374", 0);
        ce.empleados[36].setPuesto("Reclamos");
        ce.crearEmpleado("Julio Orellana", "Zona1", "56747374", 0);
        ce.empleados[37].setPuesto("Reclamos");    
        ce.crearEmpleado("Omar Gonzales", "Zona1", "56747374", 0);
        ce.empleados[38].setPuesto("Cobros");
        ce.crearEmpleado("Jose Palacios", "Zona1", "56747374", 0);
        ce.empleados[39].setPuesto("Cobros");
        ce.crearEmpleado("Yazmin Santizo", "Zona1", "56747374", 0);
        ce.empleados[40].setPuesto("Finanzas");
        ce.crearEmpleado("Jaqueline Melendez", "Zona1", "56747374", 0);
        ce.empleados[41].setPuesto("Finanzas");

        
        cc.agregarCuenta2(1,0,0);
        cc.agregarCuenta2(2,0,50);
        cc.agregarCuenta2(3,0,50);
       /* cc.agregarCuenta2(2,0,0);
        cc.agregarCuenta2(1,0,0);
        cc.agregarCuenta2(1,0,0);*/
            
        Interfaz interfaz = new Interfaz();
        interfaz.setBounds(0,0,300,150);
        interfaz.setVisible(true);
        interfaz.setLocationRelativeTo(null);
        interfaz.setResizable(false);
        interfaz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    
}

