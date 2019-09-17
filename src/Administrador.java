import java.awt.event.*;
import javax.swing.*;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

public class Administrador extends JFrame {
    static JButton btnIngresar, btnCliente, btnIr, crearCliente, btnEliminar, btnActualizar, btnEditar, btnCrearAgencia,asignar;
    static JLabel titulo, titulo1,titulo2, titulo3, titulo4,titulo5, titulo6, tituloEditar, tituloBuscarCliente,puesto;
     JTextField escribir,nomCliente, direccion, telefono, nomAgencia, numCajas, numEscritorios, numCajasAuto,usuario ;
    static JComboBox comboOpcion2, comboOpcion1, comboBuscarCliente,comboBuscarAgencia,comboBuscarCajero,comboEditar,comboPuesto,comboEmpleado;
    static JButton btnRegresar, btnRegresar2, btnAprovar,btnRechazar;
    JMenuBar barMenu;
    JMenu asignacionPuesto,empleados;
    JMenuItem solicitud, crearempleados,buscarEmpleado, tarjeta, prestamo,crearEmpleado,agencia,oficinasCentrales,reportes;
           
    boolean ingresar;
    boolean tar=false;
    String seleccion1, seleccion2, seleccion3,seleccion4;
    int opcion,idEmpleado;
    
    ControladorCliente cc = new ControladorCliente();
    ControladorBanco cb = new ControladorBanco();
    ControladorEmpleado ce = new ControladorEmpleado();
    
    public Administrador(){
        

        
            //crearComponentes();


            setLayout(null);
            
            login();
            btnIngresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(escribir.getText().equals("12345")&& usuario.getText().equals("admin")){
                   // System.out.println("hola");
                    MenuAdministrador ma = new MenuAdministrador();
                    ma.setBounds(0,0,300,300);
                    ma.setLocationRelativeTo(null);
                    ma.setVisible(true);
                    setVisible(false);
                    ma.setResizable(false);
                    ma.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }else{
                    JOptionPane.showMessageDialog(null, "Contraseña o usuario Incorrect0", "Error", ERROR_MESSAGE);
                     //JOptionPane.showMessageDialog(null,"Contraseña incorrecta");
                    
                    Interfaz interfaz = new Interfaz();
                    interfaz.setBounds(0,0,300,200);
                    interfaz.setVisible(true);
                    interfaz.setLocationRelativeTo(null);
                    interfaz.setResizable(false);
                    interfaz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    interfaz.setResizable(false);
                    setVisible(false);
                    
                         
                }

        
            }});
         
        

    }
    public void menuAdmin(){
                    MenuAdministrador ma = new MenuAdministrador();
                    ma.setBounds(0,0,300,300);
                    ma.setLocationRelativeTo(null);
                    ma.setVisible(true);
                    setVisible(false);
                    ma.setResizable(false);
                    ma.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void login(){
        
        titulo1 = new JLabel("Introduce el nombre de Usuario");
        titulo1.setBounds(20,50,270,20);
        add(titulo1);
        
        usuario=new JTextField();
        usuario.setBounds(20,70,270,20);
        add(usuario);
        
        titulo = new JLabel("Introduce la contraseña: ");
            titulo.setBounds(20,130,270,20);
            add(titulo);
            
            escribir = new JTextField();
            escribir.setBounds(20, 150, 270, 20);
            add(escribir);
            
            btnIngresar = new JButton("Ingresar");
            btnIngresar.setBounds(90,180,100,20);
            add(btnIngresar);
            
    }
    
   
    public class MenuAdministrador extends JFrame{
        public MenuAdministrador(){
            setLayout(null);
            titulo = new JLabel("Administrador");
            titulo.setBounds(20,20,200,20);
            add(titulo);
            
            barMenu = new JMenuBar();
            setJMenuBar(barMenu);
            
            btnRegresar = new JButton("Regresar");
           //  btnRegresar.setBounds(0,0,100,20);
            barMenu. add(btnRegresar);
            solicitud = new JMenuItem("Solicitudes");
            barMenu.add(solicitud);

            empleados = new JMenu("Empleados");
            barMenu.add(empleados);
            
            crearEmpleado = new JMenuItem("Crear");
            empleados.add(crearEmpleado);
            
            buscarEmpleado = new JMenuItem("Buscar");
            empleados.add(buscarEmpleado);
            
            reportes = new JMenuItem("Reportes");
            barMenu.add(reportes);
        
            
            
            
            comboOpcion1 = new JComboBox();
            comboOpcion1.setBounds(20,100,200,20);
            comboOpcion1.addItem("");
            comboOpcion1.addItem("Cliente");
            comboOpcion1.addItem("Agencia Bancaria");
            comboOpcion1.addItem("Agencia de Auto Banco");
            comboOpcion1.addItem("Cajero");
            comboOpcion1.addItem("Empleado");
            add(comboOpcion1);
            
            comboOpcion2 = new JComboBox();
            comboOpcion2.setBounds(20,60,200,20);
            comboOpcion2.addItem("");
            comboOpcion2.addItem("Crear");
            comboOpcion2.addItem("Buscar");
            add(comboOpcion2);
            
             btnIr = new JButton("Ir");
             btnIr.setBounds(90,140,100,20);
             add(btnIr);
             

             
          
            comboOpcion1.addItemListener(new ItemListener() {
            @Override
                public void itemStateChanged(ItemEvent e) {
                    System.out.println("combo");
                    seleccion1 = comboOpcion1.getSelectedItem().toString();
                }
            });
            
            comboOpcion2.addItemListener(new ItemListener() {
            @Override
                public void itemStateChanged(ItemEvent e) {
                    System.out.println("combo");
                    seleccion2 = comboOpcion2.getSelectedItem().toString();
                }
            });
            
            btnIr.addActionListener(new ActionListener() {
            @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println(seleccion1+seleccion2);
                    if(seleccion1.equals("Cliente")&&seleccion2.equals("Crear")){
                               // menuCrearCliente();

                        VentanaCrearCliente vcc= new VentanaCrearCliente();
                        vcc.setBounds(0,0,500,300);
                        vcc.setVisible(true);
                        vcc.setLocationRelativeTo(null);
                        setVisible(false);
                        vcc.setResizable(false);
                        vcc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                
                                
                    }
                    else if(seleccion1.equals("Cliente")&&seleccion2.equals("Buscar")){
                                //menuBuscarCliente();
                        VentanaBuscarCliente vbc= new VentanaBuscarCliente();
                        vbc.setBounds(0,0,500,300);
                        vbc.setVisible(true);
                        vbc.setLocationRelativeTo(null);
                        setVisible(false);
                        vbc.setResizable(false);
                        vbc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    }
                    
                    else if (seleccion1.equals("Agencia Bancaria")&&seleccion2.equals("Crear")){
                        VentanaCrearAgencia vca= new VentanaCrearAgencia();
                        vca.setBounds(0,0,600,300);
                        vca.setVisible(true);
                        vca.setLocationRelativeTo(null);
                        setVisible(false);
                        vca.setResizable(false);
                        vca.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                
                    }
                    
                    else if(seleccion1.equals("Agencia Bancaria")&&seleccion2.equals("Buscar")){
                        VentanaBuscarAgencia vba= new VentanaBuscarAgencia();
                        vba.setBounds(0,0,500,300);
                        vba.setVisible(true);
                        vba.setLocationRelativeTo(null);
                        setVisible(false);
                        vba.setResizable(false);
                        vba.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    }
                    
                    else if (seleccion1.equals("Agencia de Auto Banco")&&seleccion2.equals("Crear")){
                        VentanaCrearAgenciaAuto vcaa= new VentanaCrearAgenciaAuto();
                        vcaa.setBounds(0,0,600,300);
                        vcaa.setVisible(true);
                        vcaa.setLocationRelativeTo(null);
                        setVisible(false);
                        vcaa.setResizable(false);
                        vcaa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                
                    }
                    
                    else if(seleccion1.equals("Agencia de Auto Banco")&&seleccion2.equals("Buscar")){
                        VentanaBuscarAgenciaAuto vbaa= new VentanaBuscarAgenciaAuto();
                        vbaa.setBounds(0,0,500,300);
                        vbaa.setVisible(true);
                        vbaa.setLocationRelativeTo(null);
                        setVisible(false);
                        vbaa.setResizable(false);
                        vbaa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    }
                    
                    else if (seleccion1.equals("Cajero")&&seleccion2.equals("Crear")){
                        VentanaCrearCajero vcca= new VentanaCrearCajero();
                        vcca.setBounds(0,0,250,200);
                        vcca.setVisible(true);
                        vcca.setLocationRelativeTo(null);
                        setVisible(false);
                        vcca.setResizable(false);
                        vcca.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                
                    }
                    
                    else if(seleccion1.equals("Cajero")&&seleccion2.equals("Buscar")){
                        VentanaBuscarCajero vbca= new VentanaBuscarCajero();
                        vbca.setBounds(0,0,500,300);
                        vbca.setVisible(true);
                        vbca.setLocationRelativeTo(null);
                        setVisible(false);
                        vbca.setResizable(false);
                        vbca.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    }
                            
                }
            });
            
            btnRegresar.addActionListener(new ActionListener() {
            @Override
                public void actionPerformed(ActionEvent e) {
                    Interfaz interfaz = new Interfaz();
                    interfaz.setBounds(0,0,300,200);
                    interfaz.setVisible(true);
                    interfaz.setLocationRelativeTo(null);
                    interfaz.setResizable(false);
                    interfaz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    interfaz.setResizable(false);
                    setVisible(false);
                    
                }
    
            }); 
            solicitud.addActionListener(new ActionListener() {
            @Override
                public void actionPerformed(ActionEvent e) {
                    ventanaSolicitud vs = new ventanaSolicitud();
                    vs.setBounds(0,0,600,300);
                    vs.setVisible(true);
                    vs.setLocationRelativeTo(null);
                    vs.setResizable(false);
                    vs.setTitle("Solicitudes");
                    
                }
    
            });
            

            crearEmpleado.addActionListener(new ActionListener() {
            @Override
                public void actionPerformed(ActionEvent e) {
                    setVisible(false);
                    VentanaCrearEmpleado vce = new VentanaCrearEmpleado();
                    vce.setBounds(0,0,600,300);
                    vce.setVisible(true);
                    vce.setLocationRelativeTo(null);
                    vce.setResizable(false);
                    vce.setTitle("Empleados");
                    vce.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
    
            });     
            
            buscarEmpleado.addActionListener(new ActionListener() {
            @Override
                public void actionPerformed(ActionEvent e) {
                    setVisible(false);
                    VentanaBuscarEmpleado vbe = new VentanaBuscarEmpleado();
                    vbe.setBounds(0,0,600,300);
                    vbe.setVisible(true);
                    vbe.setLocationRelativeTo(null);
                    vbe.setResizable(false);
                    vbe.setTitle("Empleados");
                    vbe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
    
            }); 
            
            reportes.addActionListener(new ActionListener() {
            @Override
                public void actionPerformed(ActionEvent e) {
                    setVisible(false);
                    Reportes R = new Reportes();
                  
                }
    
            });
        }
    }
    public class VentanaCrearCliente extends JFrame{
        public VentanaCrearCliente(){
            
            setLayout(null);
            titulo1 = new JLabel("Introduce el nombre del cliente");
            titulo1.setBounds(20,20,200,20);
            add(titulo1);
            
            nomCliente = new JTextField();
            nomCliente.setBounds(20,40,200,20);
            add(nomCliente);
            
            titulo2 = new JLabel("Introduce su Dirección");
            titulo2.setBounds(20,80,200,20);
            add(titulo2);
      
            direccion = new JTextField();
            direccion.setBounds(20,100,200,20);
            add(direccion);
            
            titulo3 = new JLabel("Introduce su numero telefónico");
            titulo3.setBounds(20,140,300,20);
            add(titulo3);
            
            telefono = new JTextField();
            telefono.setBounds(20,160,200,20);
            add(telefono);
            
            crearCliente = new JButton("Crear");
            crearCliente.setBounds(250,100,100,20);
            add(crearCliente);
            
            btnRegresar = new JButton("Regresar");
            btnRegresar.setBounds(0,0,100,20);
            add(btnRegresar);
         
            crearCliente.addActionListener(new ActionListener() {
            @Override
                public void actionPerformed(ActionEvent e) {
                    if(nomCliente.getText().equals("")||direccion.getText().equals("")||telefono.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "Espacio Vacio", "Error", ERROR_MESSAGE);
                    }else{
                              cc.crearCliente(nomCliente.getText(), direccion.getText(), telefono.getText(), 0,cc.agregarCuenta(0,0));
                              nomCliente.setText(null);
                              direccion.setText(null);
                              telefono.setText(null);
                    }
                }
    
            });

            btnRegresar.addActionListener(new ActionListener() {
            @Override
                public void actionPerformed(ActionEvent e) {
                    setVisible(false);
                    MenuAdministrador ma = new MenuAdministrador();
                    ma.setBounds(0,0,300,300);
                    ma.setLocationRelativeTo(null);
                    ma.setVisible(true);
                    ma.setResizable(false);
                    ma.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    
                }
    
            });
       }    
    }
    
    public class VentanaBuscarCliente extends JFrame{
        public VentanaBuscarCliente(){
            setLayout(null);
            titulo = new JLabel("Buscar Cliente");
            titulo.setBounds(20,20,270,20);
            add(titulo);
            
            tituloEditar = new JLabel("Editar");
            tituloEditar.setBounds(340,70,100,20);
            add(tituloEditar);
        
            comboEditar = new JComboBox();
            comboEditar.setBounds(300,100,150,20);
            add(comboEditar);
        
            btnEliminar = new JButton("Eliminar");
            btnEliminar.setBounds(200,150,100,20);
            add(btnEliminar);
            
            btnEditar = new JButton("Editar");
            btnEditar.setBounds(340,150,100,20);
            add(btnEditar);
            
            btnRegresar = new JButton("Regresar");
            btnRegresar.setBounds(0,0,100,20);
            add(btnRegresar);
        
            comboBuscarCliente = new JComboBox();
            comboBuscarCliente.setBounds(20,60,300,20);
            add(comboBuscarCliente);
            
            comboEditar.addItem("Cambiar Nombre");
            comboEditar.addItem("Cambiar Direccion");
            comboEditar.addItem("Cambiar Numero Telefónico");
            comboEditar.addItem("Crear Cuenta Nueva");
            
            comboBuscarCliente.addItem("Clientes");
            for(int i = 0; i < cc.clientes.length; i++){
                if(cc.clientes[i]!=null){
                    comboBuscarCliente.addItem(cc.clientes[i].getId()+" "+cc.clientes[i].getNombre());
                }
            }
            
            comboBuscarCliente.addItemListener(new ItemListener() {
            @Override
                public void itemStateChanged(ItemEvent e) {
                    
                    seleccion1 = comboBuscarCliente.getSelectedItem().toString();
                }
            });
            
            comboEditar.addItemListener(new ItemListener() {
            @Override
                public void itemStateChanged(ItemEvent e) {
                    
                    seleccion3 = comboEditar.getSelectedItem().toString();
                }
            });
            
            btnEditar.addActionListener(new ActionListener() {
            @Override
                public void actionPerformed(ActionEvent e) {
                    for(int i = 0; i < ControladorCliente.clientes.length;i++){
                        if(ControladorCliente.clientes[i]!=null){
                            if(seleccion1.equals(ControladorCliente.clientes[i].getId()+" "+ControladorCliente.clientes[i].getNombre())){
                                System.out.println("Eliminar");
                              //  cc.eliminarCliente(i);
                                if(seleccion3.equals("Cambiar Nombre")){
                                     cc.clientes[i].setNombre(JOptionPane.showInputDialog("Introduce un nombre nuevo", null));

                                }else if(seleccion3.equals("Cambiar Direccion")){
                                    cc.clientes[i].setDireccion(JOptionPane.showInputDialog("Introduce una dirección nueva", null));

                                }else if(seleccion3.equals("Cambiar Numero Telefónico")){
                                    cc.clientes[i].setTelefono(JOptionPane.showInputDialog("Introduce un telefono nuevo", null));

                                }else if(seleccion3.equals("Crear Cuenta Nueva")){
                                    System.out.println(cc.agregarCuenta(0, 0));
                                    
                                }
                                break;
                            }
                        }
                    }
                        
                    
                }
    
            });
            btnEliminar.addActionListener(new ActionListener() {
            @Override
                public void actionPerformed(ActionEvent e) {
                    for(int i = 0; i < cc.clientes.length;i++){
                        if(cc.clientes[i]!=null){
                            System.out.println("Eliminar"+seleccion1);
                           // System.out.println(cc.clientes[i].getId());
                            if(seleccion1.equals(cc.clientes[i].getId()+" "+cc.clientes[i].getNombre())){
                                System.out.println("Eliminar");
                                cc.eliminarCliente(i);
                                break;
                            }
                        }
                    }
                    
                }
    
            });

            
            btnRegresar.addActionListener(new ActionListener() {
            @Override
                public void actionPerformed(ActionEvent e) {
                    setVisible(false);
                    MenuAdministrador ma = new MenuAdministrador();
                    ma.setBounds(0,0,300,300);
                    ma.setLocationRelativeTo(null);
                    ma.setVisible(true);
                    ma.setResizable(false);
                    ma.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    
                }
    
            });
        }
    }
    
     public class VentanaCrearAgencia extends JFrame{
        public VentanaCrearAgencia(){
            
            setLayout(null);
            titulo1 = new JLabel("Introduce el nombre de la Agencia");
            titulo1.setBounds(20,20,200,20);
            add(titulo1);
            
            nomAgencia = new JTextField();
            nomAgencia.setBounds(20,40,200,20);
            add(nomAgencia);
            
            titulo2 = new JLabel("Introduce su Dirección");
            titulo2.setBounds(20,80,200,20);
            add(titulo2);
      
            direccion = new JTextField();
            direccion.setBounds(20,100,200,20);
            add(direccion);
            
            titulo3 = new JLabel("Introduce su numero telefónico");
            titulo3.setBounds(20,140,300,20);
            add(titulo3);
            
            telefono = new JTextField();
            telefono.setBounds(20,160,200,20);
            add(telefono);

            titulo4 = new JLabel("Introduce el numero de cajas");
            titulo4.setBounds(320,20,200,20);
            add(titulo4);
            
            numCajas = new JTextField();
            numCajas.setBounds(320,40,200,20);
            add(numCajas);
            
            titulo5 = new JLabel("Introduce el numero de escritoiros");
            titulo5.setBounds(320,80,200,20);
            add(titulo5);
            
            numEscritorios = new JTextField();
            numEscritorios.setBounds(320,100,200,20);
            add(numEscritorios);
            
            btnCrearAgencia = new JButton("Crear");
            btnCrearAgencia.setBounds(350,140,100,20);
            add(btnCrearAgencia);
            
            btnRegresar = new JButton("Regresar");
            btnRegresar.setBounds(0,0,100,20);
            add(btnRegresar);
         
            btnCrearAgencia.addActionListener(new ActionListener() {
            @Override
                public void actionPerformed(ActionEvent e) {
                    if(nomAgencia.getText().equals("")||direccion.getText().equals("")||telefono.getText().equals("")||numCajas.getText().equals("")||numEscritorios.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "Espacio Vacio", "Error", ERROR_MESSAGE);
                    }else{
             
                            //String nombre,String direccion,String telefono,int id,int numCajas,int numEscritorios,double efectivo
                            try {
                                cb.CrearAgenciaBancaria(nomAgencia.getText(), 
                                      direccion.getText(), 
                                      telefono.getText(), 
                                      0,
                                      Integer.parseInt(numCajas.getText()),
                                      Integer.parseInt(numEscritorios.getText()),
                                      0);
                            } catch (NumberFormatException a) {
                                System.err.println("ERROR PARSEO");
                            }
  
                            
                         
                    }
                }
    
            });

            btnRegresar.addActionListener(new ActionListener() {
            @Override
                public void actionPerformed(ActionEvent e) {
                    setVisible(false);
                    MenuAdministrador ma = new MenuAdministrador();
                    ma.setBounds(0,0,300,300);
                    ma.setLocationRelativeTo(null);
                    ma.setVisible(true);
                    ma.setResizable(false);
                    ma.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    
                }
    
            });
       }    
    }
    
    public class VentanaBuscarAgencia extends JFrame{
        public VentanaBuscarAgencia(){
            setLayout(null);
            titulo = new JLabel("Buscar Agencia");
            titulo.setBounds(20,20,270,20);
            add(titulo);
            
            tituloEditar = new JLabel("Editar");
            tituloEditar.setBounds(340,70,100,20);
            add(tituloEditar);
        
            comboEditar = new JComboBox();
            comboEditar.setBounds(300,100,150,20);
            add(comboEditar);
        
            btnEliminar = new JButton("Eliminar");
            btnEliminar.setBounds(200,150,100,20);
            add(btnEliminar);
            
            btnEditar = new JButton("Editar");
            btnEditar.setBounds(340,150,100,20);
            add(btnEditar);
            
            btnRegresar = new JButton("Regresar");
            btnRegresar.setBounds(0,0,100,20);
            add(btnRegresar);
        
            comboBuscarAgencia = new JComboBox();
            comboBuscarAgencia.setBounds(20,60,300,20);
            add(comboBuscarAgencia);
            
            comboEditar.addItem("Cambiar Nombre");
            comboEditar.addItem("Cambiar Dirección");
            comboEditar.addItem("Cambiar Numero Telefónico");
            comboEditar.addItem("Cambiar Numero de Cajas");
            comboEditar.addItem("Cambiar Numero de Escritorios");
            comboEditar.addItem("Cambiar Efectivo");

            comboBuscarAgencia.addItem("");
            for(int i = 0; i < ControladorBanco.agenciasBan.length; i++){
                if(ControladorBanco.agenciasBan[i]!=null){
                    comboBuscarAgencia.addItem(ControladorBanco.agenciasBan[i].getId()+" "+ControladorBanco.agenciasBan[i].getNombre());
                }
            }
            
            comboBuscarAgencia.addItemListener(new ItemListener() {
            @Override
                public void itemStateChanged(ItemEvent e) {
                    
                    seleccion1 = comboBuscarAgencia.getSelectedItem().toString();
                }
            });
            
            comboEditar.addItemListener(new ItemListener() {
            @Override
                public void itemStateChanged(ItemEvent e) {
                    
                    seleccion3 = comboEditar.getSelectedItem().toString();
                }
            });
            
            btnEditar.addActionListener(new ActionListener() {
            @Override
                public void actionPerformed(ActionEvent e) {
                    for(int i = 0; i < ControladorBanco.agenciasBan.length;i++){
                        if(ControladorBanco.agenciasBan[i]!=null){
                            if(seleccion1.equals(ControladorBanco.agenciasBan[i].getId()+" "+ControladorBanco.agenciasBan[i].getNombre())){
                                System.out.println("Eliminar");
                              //  cc.eliminarCliente(i);
                                if(seleccion3.equals("Cambiar Nombre")){
                                     ControladorBanco.agenciasBan[i].setNombre(JOptionPane.showInputDialog("Introduce un nombre nuevo", null));

                                }else if(seleccion3.equals("Cambiar Direccion")){
                                    ControladorBanco.agenciasBan[i].setDireccion(JOptionPane.showInputDialog("Introduce una dirección nueva", null));

                                }else if(seleccion3.equals("Cambiar Numero Telefónico")){
                                    cb.agenciasBan[i].setTelefono(JOptionPane.showInputDialog("Introduce un telefono nuevo", null));

                                }else if(seleccion3.equals("Cambiar Numero de Cajas")){
                                    cb.agenciasBan[i].setNumCajas(Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero de cajas", null)));  

                                }else if(seleccion3.equals("Cambiar Numero de Escritorios")){
                                    cb.agenciasBan[i].setNumEscritorios(Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero de Escritorios", null)));  

                                }else if(seleccion3.equals("Cambiar Efectivo")){
                                    cb.agenciasBan[i].setEfectivo(Double.parseDouble(JOptionPane.showInputDialog("Introduce la cantidad de efectivo", null)));  
                                }
                                break;
                            }
                        }
                    }

                    
                }
    
            });
            btnEliminar.addActionListener(new ActionListener() {
            @Override
                public void actionPerformed(ActionEvent e) {
                    for(int i = 0; i < cb.agenciasBan.length;i++){
                        if(ControladorBanco.agenciasBan[i]!=null){
                            System.out.println("Eliminar"+seleccion1);
                           // System.out.println(cc.clientes[i].getId());
                            if(seleccion1.equals(cb.agenciasBan[i].getId()+" "+cb.agenciasBan[i].getNombre())){
                                System.out.println("Eliminar");
                                cb.eliminarAgenciaBancaria(i);
                                break;
                            }
                        }
                    }
                    
                }
    
            });

            
            btnRegresar.addActionListener(new ActionListener() {
            @Override
                public void actionPerformed(ActionEvent e) {
                    setVisible(false);
                    MenuAdministrador ma = new MenuAdministrador();
                    ma.setBounds(0,0,300,300);
                    ma.setLocationRelativeTo(null);
                    ma.setVisible(true);
                    ma.setResizable(false);
                    ma.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    
                }
    
            });
        }
    }
     public class VentanaCrearAgenciaAuto extends JFrame{
        public VentanaCrearAgenciaAuto(){
            
            setLayout(null);
            titulo1 = new JLabel("Introduce el nombre de la Agencia");
            titulo1.setBounds(20,20,200,20);
            add(titulo1);
            
            nomAgencia = new JTextField();
            nomAgencia.setBounds(20,40,200,20);
            add(nomAgencia);
            
            titulo2 = new JLabel("Introduce su Dirección");
            titulo2.setBounds(20,80,200,20);
            add(titulo2);
      
            direccion = new JTextField();
            direccion.setBounds(20,100,200,20);
            add(direccion);
            
            titulo3 = new JLabel("Introduce su numero telefónico");
            titulo3.setBounds(20,140,300,20);
            add(titulo3);
            
            telefono = new JTextField();
            telefono.setBounds(20,160,200,20);
            add(telefono);

            titulo4 = new JLabel("Introduce el numero de cajas");
            titulo4.setBounds(320,20,200,20);
            add(titulo4);
            
            numCajas = new JTextField();
            numCajas.setBounds(320,40,200,20);
            add(numCajas);
            
            titulo5 = new JLabel("Introduce el numero de escritoiros");
            titulo5.setBounds(320,80,200,20);
            add(titulo5);
            
            numEscritorios = new JTextField();
            numEscritorios.setBounds(320,100,200,20);
            add(numEscritorios);
            
            titulo6 = new JLabel("Introduce el numero de cajas de Auto banco");
            titulo6.setBounds(320,140,300,20);
            add(titulo6);
            
            numCajasAuto = new JTextField();
            numCajasAuto.setBounds(320,160,200,20);
            add(numCajasAuto);
            
            btnCrearAgencia = new JButton("Crear");
            btnCrearAgencia.setBounds(350,200,100,20);
            add(btnCrearAgencia);
            
            btnRegresar = new JButton("Regresar");
            btnRegresar.setBounds(0,0,100,20);
            add(btnRegresar);
         
            btnCrearAgencia.addActionListener(new ActionListener() {
            @Override
                public void actionPerformed(ActionEvent e) {
                    if(nomAgencia.getText().equals("")||direccion.getText().equals("")||telefono.getText().equals("")
                       ||numCajas.getText().equals("")||numEscritorios.getText().equals("")||numCajasAuto.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "Espacio Vacio", "Error", ERROR_MESSAGE);
                    }else{
             
                            //String nombre,String direccion,String telefono,int id,int numCajas,int numEscritorios,double efectivo
                            try {
                                cb.CrearAgenciaBancariaAuto(nomAgencia.getText(), 
                                      direccion.getText(), 
                                      telefono.getText(), 
                                      0,
                                      Integer.parseInt(numCajas.getText()),
                                      Integer.parseInt(numEscritorios.getText()),
                                      Integer.parseInt(numCajasAuto.getText()),
                                      0);
                            } catch (NumberFormatException a) {
                                System.err.println("ERROR PARSEO");
                            }
  
                            
                         
                    }
                }
    
            });

            btnRegresar.addActionListener(new ActionListener() {
            @Override
                public void actionPerformed(ActionEvent e) {
                    setVisible(false);
                    MenuAdministrador ma = new MenuAdministrador();
                    ma.setBounds(0,0,300,300);
                    ma.setLocationRelativeTo(null);
                    ma.setVisible(true);
                    ma.setResizable(false);
                    ma.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    
                }
    
            });
       }    
    }
    
    public class VentanaBuscarAgenciaAuto extends JFrame{
        public VentanaBuscarAgenciaAuto(){
            setLayout(null);
            titulo = new JLabel("Buscar Agencia de Auto Banco");
            titulo.setBounds(20,20,270,20);
            add(titulo);
            
            tituloEditar = new JLabel("Editar");
            tituloEditar.setBounds(340,70,100,20);
            add(tituloEditar);
        
            comboEditar = new JComboBox();
            comboEditar.setBounds(300,100,150,20);
            add(comboEditar);
        
            btnEliminar = new JButton("Eliminar");
            btnEliminar.setBounds(200,150,100,20);
            add(btnEliminar);
            
            btnEditar = new JButton("Editar");
            btnEditar.setBounds(340,150,100,20);
            add(btnEditar);
            
            btnRegresar = new JButton("Regresar");
            btnRegresar.setBounds(0,0,100,20);
            add(btnRegresar);
        
            comboBuscarAgencia = new JComboBox();
            comboBuscarAgencia.setBounds(20,60,300,20);
            add(comboBuscarAgencia);
            
            comboEditar.addItem("Cambiar Nombre");
            comboEditar.addItem("Cambiar Dirección");
            comboEditar.addItem("Cambiar Numero Telefónico");
            comboEditar.addItem("Cambiar Numero de Cajas");
            comboEditar.addItem("Cambiar Numero de Escritorios");
            comboEditar.addItem("Cambiar Numero de Auto Cajas");
            comboEditar.addItem("Cambiar Efectivo");

            for(int i = 0; i < cb.agenciasAuto.length; i++){
                if(cb.agenciasAuto[i]!=null){
                    comboBuscarAgencia.addItem(cb.agenciasAuto[i].getId()+" "+cb.agenciasAuto[i].getNombre());
                }
            }
            
            comboBuscarAgencia.addItemListener(new ItemListener() {
            @Override
                public void itemStateChanged(ItemEvent e) {
                    
                    seleccion1 = comboBuscarAgencia.getSelectedItem().toString();
                }
            });
            
            comboEditar.addItemListener(new ItemListener() {
            @Override
                public void itemStateChanged(ItemEvent e) {
                    
                    seleccion3 = comboEditar.getSelectedItem().toString();
                }
            });
            
            btnEditar.addActionListener(new ActionListener() {
            @Override
                public void actionPerformed(ActionEvent e) {
                    for(int i = 0; i < cb.agenciasAuto.length;i++){
                        if(cb.agenciasAuto[i]!=null){
                            if(seleccion1.equals(cb.agenciasAuto[i].getId()+" "+cb.agenciasAuto[i].getNombre())){
                                System.out.println("Eliminar");
                              //  cc.eliminarCliente(i);
                                if(seleccion3.equals("Cambiar Nombre")){
                                     cb.agenciasAuto[i].setNombre(JOptionPane.showInputDialog("Introduce un nombre nuevo", null));

                                }else if(seleccion3.equals("Cambiar Direccion")){
                                    cb.agenciasAuto[i].setDireccion(JOptionPane.showInputDialog("Introduce una dirección nueva", null));

                                }else if(seleccion3.equals("Cambiar Numero Telefónico")){
                                    cb.agenciasAuto[i].setTelefono(JOptionPane.showInputDialog("Introduce un telefono nuevo", null));

                                }else if(seleccion3.equals("Cambiar Numero de Cajas")){
                                    cb.agenciasAuto[i].setNumCajas(Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero de cajas", null)));  

                                }else if(seleccion3.equals("Cambiar Numero de Escritorios")){
                                    cb.agenciasAuto[i].setNumEscritorios(Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero de Escritorios", null)));  

                                }else if(seleccion3.equals("Cambiar Numero de Auto Cajas")){
                                    cb.agenciasAuto[i].setNumCajasAuto(Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero de Auto Cajas", null)));  

                                }else if(seleccion3.equals("Cambiar Efectivo")){
                                    cb.agenciasAuto[i].setEfectivo(Double.parseDouble(JOptionPane.showInputDialog("Introduce la cantidad de efectivo", null)));  
                                }
                                break;
                            }
                        }
                    }

                    
                }
    
            });
            btnEliminar.addActionListener(new ActionListener() {
            @Override
                public void actionPerformed(ActionEvent e) {
                    for(int i = 0; i < cb.agenciasAuto.length;i++){
                        if(cb.agenciasAuto[i]!=null){
                            System.out.println("Eliminar"+seleccion1);
                            if(seleccion1.equals(cb.agenciasAuto[i].getId()+" "+cb.agenciasAuto[i].getNombre())){
                                System.out.println("Eliminar");
                                cb.eliminarAgenciaBancariaAuto(i);
                                break;
                            }
                        }
                    }
                    
                }
    
            });

            
            btnRegresar.addActionListener(new ActionListener() {
            @Override
                public void actionPerformed(ActionEvent e) {
                    setVisible(false);
                    MenuAdministrador ma = new MenuAdministrador();
                    ma.setBounds(0,0,300,300);
                    ma.setLocationRelativeTo(null);
                    ma.setVisible(true);
                    ma.setResizable(false);
                    ma.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    
                }
    
            });
        }
    }
     
         public class VentanaCrearCajero extends JFrame{
        public VentanaCrearCajero(){
            
            setLayout(null);

            titulo2 = new JLabel("Introduce la ubicación del cajero");
            titulo2.setBounds(20,80,200,20);
            add(titulo2);
      
            direccion = new JTextField();
            direccion.setBounds(20,100,200,20);
            add(direccion);

            btnCrearAgencia = new JButton("Crear");
            btnCrearAgencia.setBounds(70,130,100,20);
            add(btnCrearAgencia);
            
            btnRegresar = new JButton("Regresar");
            btnRegresar.setBounds(0,0,100,20);
            add(btnRegresar);
         
            btnCrearAgencia.addActionListener(new ActionListener() {
            @Override
                public void actionPerformed(ActionEvent e) {
                    if(direccion.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "Espacio Vacio", "Error", ERROR_MESSAGE);
                    }else{
             
                            //String nombre,String direccion,String telefono,int id,int numCajas,int numEscritorios,double efectivo
                            try {
                                cb.CrearCajero( direccion.getText(),0,0,0,true);
                            } catch (NumberFormatException a) {
                                System.err.println("ERROR PARSEO");
                            }
  
                            
                         
                    }
                }
    
            });

            btnRegresar.addActionListener(new ActionListener() {
            @Override
                public void actionPerformed(ActionEvent e) {
                    setVisible(false);
                    MenuAdministrador ma = new MenuAdministrador();
                    ma.setBounds(0,0,300,300);
                    ma.setLocationRelativeTo(null);
                    ma.setVisible(true);
                    ma.setResizable(false);
                    ma.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    
                }
    
            });
       }    
    }
         
     public class VentanaBuscarCajero extends JFrame{
        public VentanaBuscarCajero(){
            setLayout(null);
            titulo = new JLabel("Buscar Cajero");
            titulo.setBounds(20,20,270,20);
            add(titulo);
            
            tituloEditar = new JLabel("Editar");
            tituloEditar.setBounds(340,70,100,20);
            add(tituloEditar);
        
            comboEditar = new JComboBox();
            comboEditar.setBounds(300,100,150,20);
            add(comboEditar);
        
            btnEliminar = new JButton("Eliminar");
            btnEliminar.setBounds(200,150,100,20);
            add(btnEliminar);
            
            btnEditar = new JButton("Editar");
            btnEditar.setBounds(340,150,100,20);
            add(btnEditar);
            
            btnRegresar = new JButton("Regresar");
            btnRegresar.setBounds(0,0,100,20);
            add(btnRegresar);
        
            comboBuscarCajero = new JComboBox();
            comboBuscarCajero.setBounds(20,60,300,20);
            add(comboBuscarCajero);
            
            
            comboEditar.addItem("Cambiar Ubicacion");
            comboEditar.addItem("Cambiar Efectivo");
            comboEditar.addItem("Activar/Desactivar");

            comboBuscarCajero.addItem("");
            for(int i = 0; i < ControladorBanco.cajeros.length; i++){
                if(ControladorBanco.cajeros[i]!=null){
                    comboBuscarCajero.addItem(ControladorBanco.cajeros[i].getId()+" "+ControladorBanco.cajeros[i].getDireccion()+" "+ControladorBanco.cajeros[i].getEstado2());
                }
            }
            
            comboBuscarCajero.addItemListener(new ItemListener() {
            @Override
                public void itemStateChanged(ItemEvent e) {
                    
                    seleccion1 = comboBuscarCajero.getSelectedItem().toString();
                }
            });
            
            comboEditar.addItemListener(new ItemListener() {
            @Override
                public void itemStateChanged(ItemEvent e) {
                    
                    seleccion3 = comboEditar.getSelectedItem().toString();
                }
            });
            
            btnEditar.addActionListener(new ActionListener() {
            @Override
                public void actionPerformed(ActionEvent e) {
                    for(int i = 0; i < ControladorBanco.cajeros.length;i++){
                        if(ControladorBanco.cajeros[i]!=null){
                            if(seleccion1.equals(ControladorBanco.cajeros[i].getId()+" "+ControladorBanco.cajeros[i].getDireccion()+" "+ControladorBanco.cajeros[i].getEstado2())){
                                System.out.println("Eliminar");
                              //  cc.eliminarCliente(i);
                                 if(seleccion3.equals("Cambiar Ubicacion")){
                                    ControladorBanco.cajeros[i].setDireccion(JOptionPane.showInputDialog("Introduce una dirección nueva", null));

                                }else if(seleccion3.equals("Cambiar Efectivo")){
                                    ControladorBanco.cajeros[i].setEfectivo(Double.parseDouble(JOptionPane.showInputDialog("Introduce la cantidad de efectivo", null)));  
                                    
                                }else if(seleccion3.equals("Activar/Desactivar")){
                                    
                                    if(ControladorBanco.cajeros[i].getEstado()){
                                        ControladorBanco.cajeros[i].setEstado(false);
                                    }else{
                                        ControladorBanco.cajeros[i].setEstado(true);
                                    }
  
                                }
                                break;
                            }
                        }
                    }

                    
                }
    
            });
            btnEliminar.addActionListener(new ActionListener() {
            @Override
                public void actionPerformed(ActionEvent e) {
                    for(int i = 0; i < ControladorBanco.cajeros.length;i++){
                        if(ControladorBanco.cajeros[i]!=null){
                            System.out.println("Eliminar"+seleccion1);
                           // System.out.println(cc.clientes[i].getId());
                            if(seleccion1.equals(ControladorBanco.cajeros[i].getId()+" "+ControladorBanco.cajeros[i].getDireccion()+" "+ControladorBanco.cajeros[i].getEstado2())){
                                System.out.println("Eliminar");
                                cb.eliminarCajero(i);
                                break;
                            }
                        }
                    }
                    
                }
    
            });

            
            btnRegresar.addActionListener(new ActionListener() {
            @Override
                public void actionPerformed(ActionEvent e) {
                    setVisible(false);
                    MenuAdministrador ma = new MenuAdministrador();
                    ma.setBounds(0,0,300,300);
                    ma.setLocationRelativeTo(null);
                    ma.setVisible(true);
                    ma.setResizable(false);
                    ma.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    
                }
    
            });
        }
    }
     
    public class ventanaSolicitud extends JFrame{
        public ventanaSolicitud(){
            
            setLayout(null);
            barMenu = new JMenuBar();
            setJMenuBar(barMenu);
            
            titulo = new JLabel("Solicitudes de prestamos");
            titulo.setBounds(20,30,200,20);
            add(titulo);
            titulo.setVisible(false);
            
            titulo1 = new JLabel("Solicitudes de tarjetas");
            titulo1.setBounds(20,30,200,20);
            add(titulo1);        
            titulo1.setVisible(false);
            
            titulo2 = new JLabel("Selecciona un empleado para ser aprovada");
            titulo2.setBounds(20,100,300,20);
            add(titulo2);
            
            tarjeta = new JMenuItem("Tarjetas");
            barMenu.add(tarjeta);
            
            prestamo = new JMenuItem("Prestamos");
            barMenu.add(prestamo);
            
            btnAprovar = new JButton("Aprovar");
            btnAprovar.setBounds(400,80,100,20);
            add(btnAprovar);
            
            btnRechazar = new JButton("Rechazar");
            btnRechazar.setBounds(400,140,100,20);
            add(btnRechazar);
            
            comboOpcion1 = new JComboBox();
            comboOpcion1.setBounds(20,60,300,20);
            add(comboOpcion1);
            comboOpcion1.setVisible(false);
            
            comboOpcion1.addItem("");
            for(int i = 0; i < ControladorBanco.tarjetas.length; i++){
                if(ControladorBanco.tarjetas[i]!=null){
                    comboOpcion1.addItem(ControladorBanco.tarjetas[i].getNumero()+" "+ControladorBanco.tarjetas[i].getCliente().getNombre()+" "+ControladorBanco.tarjetas[i].getCredito());
                }
            }            
            
            
            comboOpcion2 = new JComboBox();
            comboOpcion2.setBounds(20,60,300,20);
            add(comboOpcion2);
            comboOpcion2.setVisible(false);
            
            comboOpcion2.addItem("");
            for(int i = 0; i < ControladorBanco.prestamos.length; i++){
                if(ControladorBanco.prestamos[i]!=null){
                    if(cb.prestamos[i].getDeuda()!=0){
                         comboOpcion2.addItem(ControladorBanco.prestamos[i].getNumero()+" "+ControladorBanco.prestamos[i].getCliente().getNombre()+" "+ControladorBanco.prestamos[i].getDeuda());
                    }
                }
            }             
            
            comboEmpleado = new JComboBox();
            comboEmpleado.setBounds(20,130,300,20);
            add(comboEmpleado);
            
            comboEmpleado.addItem("");
            for(int i = 0; i < ce.empleados.length; i++){
                if(ce.empleados[i]!=null){
                    if(ce.empleados[i].getPuesto().equals("Finanzas")){
                        comboEmpleado.addItem(ce.empleados[i].getId()+" "+ce.empleados[i].getNombre()+" "+ce.empleados[i].getPuesto());
                    }
                    
                }
            }   
            
            comboOpcion1.addItemListener(new ItemListener() {
            @Override
                public void itemStateChanged(ItemEvent e) {
                    
                    seleccion1 = comboOpcion1.getSelectedItem().toString();
                }
            });
            
            comboOpcion2.addItemListener(new ItemListener() {
            @Override
                public void itemStateChanged(ItemEvent e) {
                    
                    seleccion1 = comboOpcion2.getSelectedItem().toString();
                }
            });
            
            comboEmpleado.addItemListener(new ItemListener() {
            @Override
                public void itemStateChanged(ItemEvent e) {
                    
                    seleccion2 = comboEmpleado.getSelectedItem().toString();
                }
            });
            
            tarjeta.addActionListener(new ActionListener() {
            @Override
                public void actionPerformed(ActionEvent e) {
                    comboOpcion1.setVisible(true);
                    comboOpcion2.setVisible(false);
                    titulo1.setVisible(true);
                    titulo.setVisible(false);
                    tar = true;
                }
    
            });
            
            prestamo.addActionListener(new ActionListener() {
            @Override
                public void actionPerformed(ActionEvent e) {
                    comboOpcion2.setVisible(true);
                    comboOpcion1.setVisible(false);
                    titulo.setVisible(true);
                    titulo1.setVisible(false);
                    tar = false;
                }
    
            });
            
            btnAprovar.addActionListener(new ActionListener() {
            @Override
                public void actionPerformed(ActionEvent e) {
                    if(tar){
                        for(int i = 0; i < cb.tarjetas.length; i++){
                            if(cb.tarjetas[i]!=null){
                                if(seleccion2 == null || seleccion2.equals("")){
                                        JOptionPane.showMessageDialog(null, "Selecciona un Empleado", "Error", ERROR_MESSAGE);
                                }else{
                                    if(seleccion1.equals(ControladorBanco.tarjetas[i].getNumero()+" "+ControladorBanco.tarjetas[i].getCliente().getNombre()+" "+ControladorBanco.tarjetas[i].getCredito())){
                                        cb.tarjetas[i].setEstado(true);
                                        JOptionPane.showMessageDialog(null, "La tarjeta ha sido aprovada");
                                     }
                                }
                            }
                        }
                    }else{
                         for(int i = 0; i < cb.prestamos.length; i++){
                            if(cb.prestamos[i]!=null){
                                if(seleccion2 == null || seleccion2.equals("")){
                                        JOptionPane.showMessageDialog(null, "Selecciona un Empleado", "Error", ERROR_MESSAGE);
                                }else{
                                    if(seleccion1.equals(ControladorBanco.prestamos[i].getNumero()+" "+ControladorBanco.prestamos[i].getCliente().getNombre()+" "+ControladorBanco.prestamos[i].getDeuda())){
                                        cb.prestamos[i].setEstado(true);
                                        JOptionPane.showMessageDialog(null, "El prestamo ha sido aprovado");
                                        if(cb.prestamos[i].getEstado()){
                                            cc.depositar(cc.cuentas[cb.prestamos[i].getCliente().getId()][0].getNumero(),cb.prestamos[i].getDeuda());
                                        }
                                     }
                                }
                            }
                        }
                    }
                }
    
            });
            

            btnRechazar.addActionListener(new ActionListener() {
            @Override
                public void actionPerformed(ActionEvent e) {
                    if(tar){
                        for(int i = 0; i < cb.tarjetas.length; i++){
                            if(cb.tarjetas[i]!=null){
                                if(seleccion2 == null || seleccion2.equals("")){
                                        JOptionPane.showMessageDialog(null, "Selecciona un Empleado", "Error", ERROR_MESSAGE);
                                }else{
                                    if(seleccion1.equals(ControladorBanco.tarjetas[i].getNumero()+" "+ControladorBanco.tarjetas[i].getCliente().getNombre()+" "+ControladorBanco.tarjetas[i].getCredito())){

                                        cb.eliminarTarjeta(i);
                                        JOptionPane.showMessageDialog(null, "La tarjeta ha sido Rechazada");
                                     }
                                }
                            }
                        }
                    }else{
                    for(int i = 0; i < cb.prestamos.length; i++){
                            if(cb.prestamos[i]!=null){
                                if(seleccion2 == null || seleccion2.equals("")){
                                        JOptionPane.showMessageDialog(null, "Selecciona un Empleado", "Error", ERROR_MESSAGE);
                                }else{
                                    if(seleccion1.equals(ControladorBanco.prestamos[i].getNumero()+" "+ControladorBanco.prestamos[i].getCliente().getNombre()+" "+ControladorBanco.prestamos[i].getDeuda())){

                                        cb.eliminarPrestamo(i);
                                        JOptionPane.showMessageDialog(null, "El prestamo ha sido Rechazado");
                                     }
                                }
                            }
                        }
                    }
                }
    
            });
        }
    }
    
    public class VentanaCrearEmpleado extends JFrame{
        public VentanaCrearEmpleado(){
            
            setLayout(null);
            barMenu=new JMenuBar();
            setJMenuBar(barMenu);
            
            asignacionPuesto = new JMenu("Asignacion de Puesto");
            barMenu.add(asignacionPuesto);
            
            oficinasCentrales = new JMenuItem("Oficinas centrales");
            asignacionPuesto.add(oficinasCentrales);
            
            agencia = new JMenuItem("Asignar a agencia");
            asignacionPuesto.add(agencia);
            
            titulo1 = new JLabel("Introduce el nombre del empleado");
            titulo1.setBounds(20,20,200,20);
            add(titulo1);
            
            nomCliente = new JTextField();
            nomCliente.setBounds(20,40,200,20);
            add(nomCliente);
            
            titulo2 = new JLabel("Introduce su Dirección");
            titulo2.setBounds(20,80,200,20);
            add(titulo2);
      
            direccion = new JTextField();
            direccion.setBounds(20,100,200,20);
            add(direccion);
            
            titulo3 = new JLabel("Introduce su numero telefónico");
            titulo3.setBounds(20,140,300,20);
            add(titulo3);
            
            telefono = new JTextField();
            telefono.setBounds(20,160,200,20);
            add(telefono);
            
 /*           puesto = new JLabel("Selecciona su puesto");
            puesto.setBounds(20,200,200,20);
            add(puesto);
            
            comboPuesto = new JComboBox();
            comboPuesto.setBounds(20,240,200,20);
            add(comboPuesto);
       */     
            
            crearCliente = new JButton("Crear");
            crearCliente.setBounds(250,100,100,20);
            add(crearCliente);
            
            btnRegresar = new JButton("Regresar");
            btnRegresar.setBounds(0,0,100,20);
            add(btnRegresar);
         
            crearCliente.addActionListener(new ActionListener() {
            @Override
                public void actionPerformed(ActionEvent e) {
                    if(nomCliente.getText().equals("")||direccion.getText().equals("")||telefono.getText().equals("")){
                        JOptionPane.showMessageDialog(null, "Espacio Vacio", "Error", ERROR_MESSAGE);
                    }else{
                              ce.crearEmpleado(nomCliente.getText(), direccion.getText(), telefono.getText(), 0);
                              nomCliente.setText(null);
                              direccion.setText(null);
                              telefono.setText(null);
                    }
                }
    
            });

            oficinasCentrales.addActionListener(new ActionListener() {
            @Override
                public void actionPerformed(ActionEvent e) {
                    ventanaOficinasCentrales voc = new ventanaOficinasCentrales();
                    voc.setLayout(null);
                    voc.setBounds(0,0,300,300);
                    voc.setLocationRelativeTo(null);
                    voc.setVisible(true);
                    voc.setResizable(false);
         
                }
            });      
            
            agencia.addActionListener(new ActionListener() {
            @Override
                public void actionPerformed(ActionEvent e) {
                    ventanaAsignarAgencia vaa = new ventanaAsignarAgencia();
                    vaa.setLayout(null);
                    vaa.setBounds(0,0,300,300);
                    vaa.setLocationRelativeTo(null);
                    vaa.setVisible(true);
                    vaa.setResizable(false);
         
                }
            });              
            btnRegresar.addActionListener(new ActionListener() {
            @Override
                public void actionPerformed(ActionEvent e) {
                    setVisible(false);
                    MenuAdministrador ma = new MenuAdministrador();
                    ma.setBounds(0,0,300,300);
                    ma.setLocationRelativeTo(null);
                    ma.setVisible(true);
                    ma.setResizable(false);
                    ma.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    
                }
    
            });
       }    
    }
    
        public class VentanaBuscarEmpleado extends JFrame{
        public VentanaBuscarEmpleado(){
            setLayout(null);
            titulo = new JLabel("Buscar Empleado");
            titulo.setBounds(20,20,270,20);
            add(titulo);
            
            tituloEditar = new JLabel("Editar");
            tituloEditar.setBounds(340,70,100,20);
            add(tituloEditar);
        
            comboEditar = new JComboBox();
            comboEditar.setBounds(300,100,150,20);
            add(comboEditar);
        
            btnEliminar = new JButton("Eliminar");
            btnEliminar.setBounds(200,150,100,20);
            add(btnEliminar);
            
            btnEditar = new JButton("Editar");
            btnEditar.setBounds(340,150,100,20);
            add(btnEditar);
            
            btnRegresar = new JButton("Regresar");
            btnRegresar.setBounds(0,0,100,20);
            add(btnRegresar);
        
            comboBuscarCliente = new JComboBox();
            comboBuscarCliente.setBounds(20,60,300,20);
            add(comboBuscarCliente);
            
            comboEditar.addItem("Cambiar Nombre");
            comboEditar.addItem("Cambiar Direccion");
            comboEditar.addItem("Cambiar Numero Telefónico");
            
            comboBuscarCliente.addItem("");
            for(int i = 0; i < ce.empleados.length; i++){
                if(ce.empleados[i]!=null){
                    comboBuscarCliente.addItem(ce.empleados[i].getId()+" "+ce.empleados[i].getNombre()+" "+ce.empleados[i].getPuesto());
                }
            }
            
            comboBuscarCliente.addItemListener(new ItemListener() {
            @Override
                public void itemStateChanged(ItemEvent e) {
                    
                    seleccion1 = comboBuscarCliente.getSelectedItem().toString();
                }
            });
            
            comboEditar.addItemListener(new ItemListener() {
            @Override
                public void itemStateChanged(ItemEvent e) {
                    
                    seleccion3 = comboEditar.getSelectedItem().toString();
                }
            });
            
            btnEditar.addActionListener(new ActionListener() {
            @Override
                public void actionPerformed(ActionEvent e) {
                    for(int i = 0; i < ce.empleados.length;i++){
                        if(ce.empleados[i]!=null){
                            if(seleccion1.equals(ce.empleados[i].getId()+" "+ce.empleados[i].getNombre()+" "+ce.empleados[i].getPuesto())){
                                System.out.println("Eliminar");
                              //  cc.eliminarCliente(i);
                                if(seleccion3.equals("Cambiar Nombre")){
                                     ce.empleados[i].setNombre(JOptionPane.showInputDialog("Introduce un nombre nuevo", null));

                                }else if(seleccion3.equals("Cambiar Direccion")){
                                    ce.empleados[i].setDireccion(JOptionPane.showInputDialog("Introduce una dirección nueva", null));

                                }else if(seleccion3.equals("Cambiar Numero Telefónico")){
                                    ce.empleados[i].setTelefono(JOptionPane.showInputDialog("Introduce un telefono nuevo", null));

                                }
                                break;
                            }
                        }
                    }
                        
                    
                }
    
            });
            btnEliminar.addActionListener(new ActionListener() {
            @Override
                public void actionPerformed(ActionEvent e) {
                    for(int i = 0; i < ce.empleados.length;i++){
                        if(ce.empleados[i]!=null){
                            System.out.println("Eliminar"+seleccion1);
                           // System.out.println(cc.clientes[i].getId());
                            if(seleccion1.equals(ce.empleados[i].getId()+" "+ce.empleados[i].getNombre()+" "+ce.empleados[i].getPuesto())){
                                System.out.println("Eliminar");
                                ce.eliminarEmpleado(i);
                                break;
                            }
                        }
                    }
                    
                }
    
            });

            
            btnRegresar.addActionListener(new ActionListener() {
            @Override
                public void actionPerformed(ActionEvent e) {
                    setVisible(false);
                    MenuAdministrador ma = new MenuAdministrador();
                    ma.setBounds(0,0,300,300);
                    ma.setLocationRelativeTo(null);
                    ma.setVisible(true);
                    ma.setResizable(false);
                    ma.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    
                }
    
            });
        }
    }
    
    public class ventanaOficinasCentrales extends JFrame{
        public ventanaOficinasCentrales(){
            titulo = new JLabel("Selecciona un empleado");
            titulo.setBounds(20,20,200,20);
            add(titulo);
            
            comboPuesto = new JComboBox();
            comboPuesto.setBounds(20,140,200,20);
            add(comboPuesto);
            comboPuesto.addItem("Gerencia");
            comboPuesto.addItem("Marketing");
            comboPuesto.addItem("Informatica");
            comboPuesto.addItem("Reclamos");
            comboPuesto.addItem("Cobros");
            comboPuesto.addItem("Finanzas");
            
            comboPuesto.addItemListener(new ItemListener() {
            @Override
                public void itemStateChanged(ItemEvent e) {        
                    seleccion2 = comboPuesto.getSelectedItem().toString();
                }
            });
            
            titulo1 = new JLabel("Selecciona un puesto");
            titulo1.setBounds(20,100,200,20);
            add(titulo1);
            
            asignar = new JButton("Asignar");
            asignar.setBounds(20,180,200,20);
            add(asignar);
            
            comboEmpleado = new JComboBox();
            comboEmpleado.setBounds(20,60,200,20);
            add(comboEmpleado);
            
            comboEmpleado.addItem("");
            for(int i = 0; i < ce.empleados.length; i++){
                if(ce.empleados[i]!=null){
                    comboEmpleado.addItem(ce.empleados[i].getId()+" "+ce.empleados[i].getNombre()+" "+ce.empleados[i].getPuesto());
                }
            }
            
            comboEmpleado.addItemListener(new ItemListener() {
            @Override
                public void itemStateChanged(ItemEvent e) {        
                    seleccion1 = comboEmpleado.getSelectedItem().toString();
                }
            });
            
            asignar.addActionListener(new ActionListener() {
            @Override
                public void actionPerformed(ActionEvent e) {
                    for(int i = 0; i < ce.empleados.length;i++){
                        if(ce.empleados[i]!=null){
                            if(seleccion1.equals(ce.empleados[i].getId()+" "+ce.empleados[i].getNombre()+" "+ce.empleados[i].getPuesto())){
                                idEmpleado = i+1; 

                   }}}
                    ce.empleados[idEmpleado-1].setPuesto(seleccion2);
                    System.out.println(ce.empleados[idEmpleado-1].getNombre()+ce.empleados[idEmpleado-1].getPuesto());
                }                    
            });
            
        }
    }
    
    public class ventanaAsignarAgencia extends JFrame{
        public ventanaAsignarAgencia(){
            titulo = new JLabel("Selecciona un empleado");
            titulo.setBounds(20,20,200,20);
            add(titulo);
            
            comboPuesto = new JComboBox();
            comboPuesto.setBounds(20,140,200,20);
            add(comboPuesto);
            
            comboPuesto.addItem("");
            for(int i = 0; i < cb.agenciasBan.length; i++){
                if(cb.agenciasBan[i]!=null){
                    comboPuesto.addItem(cb.agenciasBan[i].getNombre());
                }
            }    
            
            for(int i = 0; i < cb.agenciasAuto.length; i++){
                if(cb.agenciasAuto[i]!=null){
                    comboPuesto.addItem(cb.agenciasAuto[i].getNombre());
                }
            }
            
            comboPuesto.addItemListener(new ItemListener() {
            @Override
                public void itemStateChanged(ItemEvent e) {        
                    seleccion2 = comboPuesto.getSelectedItem().toString();
                }
            });
            
            titulo1 = new JLabel("Selecciona una agencia");
            titulo1.setBounds(20,100,200,20);
            add(titulo1);
            
            asignar = new JButton("Asignar");
            asignar.setBounds(20,180,200,20);
            add(asignar);
            
            comboEmpleado = new JComboBox();
            comboEmpleado.setBounds(20,60,200,20);
            add(comboEmpleado);
            
            comboEmpleado.addItem("");
            for(int i = 0; i < ce.empleados.length; i++){
                if(ce.empleados[i]!=null){
                    comboEmpleado.addItem(ce.empleados[i].getId()+" "+ce.empleados[i].getNombre()+" "+ce.empleados[i].getPuesto());
                }
            }
            
            comboEmpleado.addItemListener(new ItemListener() {
            @Override
                public void itemStateChanged(ItemEvent e) {        
                    seleccion1 = comboEmpleado.getSelectedItem().toString();
                }
            });
            
            asignar.addActionListener(new ActionListener() {
            @Override
                public void actionPerformed(ActionEvent e) {
                    for(int i = 0; i < ce.empleados.length;i++){
                        if(ce.empleados[i]!=null){
                            if(seleccion1.equals(ce.empleados[i].getId()+" "+ce.empleados[i].getNombre()+" "+ce.empleados[i].getPuesto())){
                                idEmpleado = i+1; 

                   }}}
                    ce.empleados[idEmpleado-1].setPuesto(seleccion2);
                    System.out.println(ce.empleados[idEmpleado-1].getNombre()+ce.empleados[idEmpleado-1].getPuesto());
                }                    
            });
            
        }
    }    
    
}
    




