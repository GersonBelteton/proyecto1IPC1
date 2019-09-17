



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

public class Transaccion extends JFrame {
    
    JLabel titulo,titulo1,titulo2,titulo3;
    JComboBox comboCliente, comboAgencia,comboCuenta,comboCuenta2,comboPrestamo;
    JMenuBar barraMenu;
    JButton menuAgenciaBan, menuAgenciaAuto, menuCajero, menuCallCenter, menuOficina,regresar,btnDeposito,aceptar,btnRetiro;
    JMenu areaCaja, areaAtencion, pago, solicitud;
    JMenuItem deposito, retiro, cambioCheque, tarjeta, prestamo, agua, luz,
            telefono, ahorro, monetaria,solPrestamo,solTarjeta,efectivo,cheque, servicio,consultarSaldo,crearCuenta;
    String seleccion1,seleccion2,seleccion3;
    double monto, montoRetiro;
    boolean retirar=false;
    int idCliente,idAgencia,eleccionServicio, lugar;
    
    ControladorCliente cc = new ControladorCliente();
    ControladorBanco cb = new ControladorBanco();
    
    public Transaccion(){
        cb.crearServicio();
      //  cb.crearTarjeta(ControladorCliente.clientes[1], 1);
        setLayout(null);
        barraMenu = new JMenuBar();
        setJMenuBar(barraMenu);
        
        titulo = new JLabel("Selecciona un Cliente");
        titulo.setBounds(20,30,250,20);
        add(titulo);
        
        regresar = new JButton("Regresar");
        barraMenu.add(regresar);
        
        menuAgenciaBan = new JButton("Agencia Bancaria");
        barraMenu.add(menuAgenciaBan);
        
        menuAgenciaAuto = new JButton("Agencia de Auto Banco");
        barraMenu.add(menuAgenciaAuto);
        
        menuCajero = new JButton("Cajero");
        barraMenu.add(menuCajero);
        
        menuCallCenter = new JButton("Call Center");
        barraMenu.add(menuCallCenter);
        
        comboCliente = new JComboBox();
        comboCliente.setBounds(20,60,300,20);
        add(comboCliente);
            
        comboCliente.addItem("");
        for(int i = 0; i < cc.clientes.length; i++){
            if(cc.clientes[i]!=null){
               comboCliente.addItem(cc.clientes[i].getId()+" "+cc.clientes[i].getNombre());
            }
        }
        
        comboCliente.addItemListener(new ItemListener() {
        @Override
            public void itemStateChanged(ItemEvent e) {
                    
                seleccion1 = comboCliente.getSelectedItem().toString();
            }
        });
        
        regresar.addActionListener(new ActionListener() {
        @Override   
            public void actionPerformed(ActionEvent e){
                Interfaz interfaz = new Interfaz();
                interfaz.setBounds(0,0,300,200);
                interfaz.setVisible(true);
                interfaz.setLocationRelativeTo(null);
                interfaz.setResizable(false);
                interfaz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setVisible(false);
            }    
  
        });
        
        menuAgenciaBan.addActionListener(new ActionListener() {
        @Override   
            public void actionPerformed(ActionEvent e){
                lugar = 0;
                if(seleccion1==null||seleccion1.equals("")){
                    System.out.println("Error");
                    JOptionPane.showMessageDialog(null, "Selecciona un Cliente", "Error", ERROR_MESSAGE);
                }else{
                    
                     for(int i = 0; i < ControladorCliente.clientes.length;i++){
                        if(ControladorCliente.clientes[i]!=null){
                            if(seleccion1.equals(ControladorCliente.clientes[i].getId()+" "+ControladorCliente.clientes[i].getNombre())){
                               idCliente = i+1; 
                                
                            }}}
                     
                    System.out.println(idCliente);
                    System.out.println("holaa");
                    MenuAgenciaBancaria mab = new MenuAgenciaBancaria();
                    mab.setTitle("Agencia Bancaria");
                    mab.setBounds(0,0,600,300);
                    mab.setLocationRelativeTo(null);
                    mab.setVisible(true);
                    setVisible(false);
                    mab.setResizable(false);
                    mab.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
               
            }    
  
        });
        
        menuAgenciaAuto.addActionListener(new ActionListener() {
        @Override   
            public void actionPerformed(ActionEvent e){
                lugar = 1;
                //System.out.println("holaa");
                if(seleccion1==null||seleccion1.equals("")){
                    System.out.println("Error");
                    JOptionPane.showMessageDialog(null, "Selecciona un Cliente", "Error", ERROR_MESSAGE);
                }else{
                    
                     for(int i = 0; i < ControladorCliente.clientes.length;i++){
                        if(ControladorCliente.clientes[i]!=null){
                            if(seleccion1.equals(ControladorCliente.clientes[i].getId()+" "+ControladorCliente.clientes[i].getNombre())){
                               idCliente = i+1; 
                                
                            }}}
                     
                    System.out.println(idCliente);
                    System.out.println("holaa");
                    MenuAgenciaAuto maa = new MenuAgenciaAuto();
                    maa.setTitle("Agencia de Auto Banco");
                    maa.setBounds(0,0,600,300);
                    maa.setLocationRelativeTo(null);
                    maa.setVisible(true);
                    setVisible(false);
                    maa.setResizable(false);
                    maa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
                
            }    
          });
        
        menuCajero.addActionListener(new ActionListener() {
        @Override   
            public void actionPerformed(ActionEvent e){
                lugar=2;
                if(seleccion1==null||seleccion1.equals("")){
                    System.out.println("Error");
                    JOptionPane.showMessageDialog(null, "Selecciona un Cliente", "Error", ERROR_MESSAGE);
                }else{
                    
                     for(int i = 0; i < ControladorCliente.clientes.length;i++){
                        if(ControladorCliente.clientes[i]!=null){
                            if(seleccion1.equals(ControladorCliente.clientes[i].getId()+" "+ControladorCliente.clientes[i].getNombre())){
                               idCliente = i+1; 
                                
                            }}}
                     
                    System.out.println(idCliente);
                    System.out.println("holaa");
                    Cajero c = new Cajero();
                    c.setTitle("Cajero");
                    c.setBounds(0,0,600,300);
                    c.setLocationRelativeTo(null);
                    c.setVisible(true);
                    setVisible(false);
                    c.setResizable(false);
                    c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
                                
            }    
  
        });
        
        menuCallCenter.addActionListener(new ActionListener() {
        @Override   
            public void actionPerformed(ActionEvent e){
                                //System.out.println("holaa");
                if(seleccion1==null||seleccion1.equals("")){
                    System.out.println("Error");
                    JOptionPane.showMessageDialog(null, "Selecciona un Cliente", "Error", ERROR_MESSAGE);
                }else{
                    
                     for(int i = 0; i < ControladorCliente.clientes.length;i++){
                        if(ControladorCliente.clientes[i]!=null){
                            if(seleccion1.equals(ControladorCliente.clientes[i].getId()+" "+ControladorCliente.clientes[i].getNombre())){
                               idCliente = i+1; 
                                
                            }}}
                     
                    System.out.println(idCliente);
                    System.out.println("holaa");
                    CallCenter c = new CallCenter();
                    c.setTitle("Agencia de Auto Banco");
                    c.setBounds(0,0,600,300);
                    c.setLocationRelativeTo(null);
                    c.setVisible(true);
                    setVisible(false);
                    c.setResizable(false);
                    c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
                
            }    
          });
        
        menuCajero.addActionListener(new ActionListener() {
        @Override   
            public void actionPerformed(ActionEvent e){
                lugar=2;
                if(seleccion1==null||seleccion1.equals("")){
                    System.out.println("Error");
                    JOptionPane.showMessageDialog(null, "Selecciona un Cliente", "Error", ERROR_MESSAGE);
                }else{
                    
                     for(int i = 0; i < ControladorCliente.clientes.length;i++){
                        if(ControladorCliente.clientes[i]!=null){
                            if(seleccion1.equals(ControladorCliente.clientes[i].getId()+" "+ControladorCliente.clientes[i].getNombre())){
                               idCliente = i+1; 
                                
                            }}}
                     
                    System.out.println(idCliente);
                    System.out.println("holaa");
                    Cajero c = new Cajero();
                    c.setTitle("Cajero");
                    c.setBounds(0,0,600,300);
                    c.setLocationRelativeTo(null);
                    c.setVisible(true);
                    setVisible(false);
                    c.setResizable(false);
                    c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
            }    
  
        });
          
    }
    
    public class MenuAgenciaBancaria extends JFrame{
        public MenuAgenciaBancaria(){
            setLayout(null);
            barraMenu = new JMenuBar();
            setJMenuBar(barraMenu);
            
            titulo = new JLabel("Selecciona una Agencia Bancaria");
            titulo.setBounds(20,30,250,20);
            add(titulo);
        
            regresar = new JButton("Regresar");
            barraMenu.add(regresar);
            
            areaCaja = new JMenu("Area de Cajas");
            barraMenu.add(areaCaja);
            
            areaAtencion = new JMenu("Atencion al Cliente");
            barraMenu.add(areaAtencion);
            
            deposito = new JMenuItem("Deposito");
            areaCaja.add(deposito);
            
            retiro = new JMenuItem("Retiro");
            areaCaja.add(retiro);
            
            cambioCheque = new JMenuItem("Cambio de Cheque");
            areaCaja.add(cambioCheque);
            
            pago = new JMenu("Pagos");
            areaCaja.add(pago);
            
            servicio = new JMenuItem("Servicios");
            pago.add(servicio);
            
            prestamo = new JMenuItem("Prestamos");
            pago.add(prestamo);
            
            tarjeta = new JMenuItem("Tarjetas");
            pago.add(tarjeta);
            
            crearCuenta = new JMenuItem("Crear Cuenta");
            areaAtencion.add(crearCuenta);
            
            solicitud = new JMenu("Solicitud");
            areaAtencion.add(solicitud);
            
            solPrestamo = new JMenuItem("Prestamo");
            solicitud.add(solPrestamo);
            
            solTarjeta = new JMenuItem("Tarjeta");
            solicitud.add(solTarjeta);
            
            
            comboAgencia = new JComboBox();
            add(comboAgencia);
            comboAgencia.setBounds(20,60,300,20);
            comboAgencia.addItem("");
            for(int i = 0; i < ControladorBanco.agenciasBan.length; i++){
                if(ControladorBanco.agenciasBan[i]!=null){
                    comboAgencia.addItem(ControladorBanco.agenciasBan[i].getId()+" "+ControladorBanco.agenciasBan[i].getNombre());
                }
            }
            
            comboAgencia.addItemListener(new ItemListener() {
            @Override
                public void itemStateChanged(ItemEvent e) {        
                    seleccion3 = comboAgencia.getSelectedItem().toString();
                }
            });
            

            
            deposito.addActionListener(new ActionListener() {
                @Override   
                public void actionPerformed(ActionEvent e){
                    
                    if(seleccion3==null||seleccion3.equals("")){
                        System.out.println("Error");
                        JOptionPane.showMessageDialog(null, "Selecciona una Agencia", "Error", ERROR_MESSAGE);
                    }else{
                        tomarIdAgencia();
                        System.out.println(idAgencia);
                        Deposito D = new Deposito();
                        D.setBounds(0,0,300,300);
                        D.setLocationRelativeTo(null);
                        D.setVisible(true);
                        D.setResizable(false);
                        D.setTitle("Deposito");
                        
                    }
                } 
                
             });
            
            retiro.addActionListener(new ActionListener() {
                @Override   
                public void actionPerformed(ActionEvent e){
                    
                    if(seleccion3==null||seleccion3.equals("")){
                        System.out.println("Error");
                        JOptionPane.showMessageDialog(null, "Selecciona una Agencia", "Error", ERROR_MESSAGE);
                    }else{
                        tomarIdAgencia();
                        System.out.println(idAgencia);
                        Retiro R = new Retiro();
                        R.setBounds(0,0,300,200);
                        R.setLocationRelativeTo(null);
                        R.setVisible(true);
                        R.setResizable(false);
                        R.setTitle("Retiro");
                        
                    }                    
                }    
             });
            
            cambioCheque.addActionListener(new ActionListener() {
                @Override   
                public void actionPerformed(ActionEvent e){
                    
                    if(seleccion3==null||seleccion3.equals("")){
                        System.out.println("Error");
                        JOptionPane.showMessageDialog(null, "Selecciona una Agencia", "Error", ERROR_MESSAGE);
                    }else{
                        tomarIdAgencia();
                        System.out.println(idAgencia);
                        CambioCheque cch = new CambioCheque();
                        cch.setBounds(0,0,300,300);
                        cch.setLocationRelativeTo(null);
                        cch.setVisible(true);
                        cch.setResizable(false);
                        cch.setTitle("Cambio de cheque");
                    
                    }                    
                }    
             });
                        
                servicio.addActionListener(new ActionListener() {
                @Override   
                public void actionPerformed(ActionEvent e){
                    
                    if(seleccion3==null||seleccion3.equals("")){
                        System.out.println("Error");
                        JOptionPane.showMessageDialog(null, "Selecciona una Agencia", "Error", ERROR_MESSAGE);
                    }else{
                        tomarIdAgencia();
                        System.out.println(idAgencia);
                        PagoServicio ps = new PagoServicio();
                        ps.setBounds(0,0,300,300);
                        ps.setLocationRelativeTo(null);
                        ps.setVisible(true);
                        ps.setResizable(false);
                        ps.setTitle("Pago de servicios");
                        
                    }                    
                }    
             });
                
                prestamo.addActionListener(new ActionListener() {
                @Override   
                public void actionPerformed(ActionEvent e){
                    
                    if(seleccion3==null||seleccion3.equals("")){
                        System.out.println("Error");
                        JOptionPane.showMessageDialog(null, "Selecciona una Agencia", "Error", ERROR_MESSAGE);
                    }else{
                        tomarIdAgencia();
                        PagoPrestamo pp = new PagoPrestamo();
                        pp.setBounds(0,0,300,300);
                        pp.setLocationRelativeTo(null);
                        pp.setVisible(true);
                        pp.setResizable(false);
                        pp.setTitle("Pago de prestamos");
                        
                    }                    
                }    
             });
                
             solTarjeta.addActionListener(new ActionListener(){
                 public void actionPerformed(ActionEvent e){
                     double credito=0;
                    credito=Double.parseDouble(JOptionPane.showInputDialog(null, "¿Cuanto credito deseas?"));
                    cb.crearTarjeta(cc.clientes[idCliente-1],0,credito,false);
                 }
             });
             
             solPrestamo.addActionListener(new ActionListener(){
                 public void actionPerformed(ActionEvent e){
                    double credito=0;
                    credito=Double.parseDouble(JOptionPane.showInputDialog(null, "Monto del prestamo"));
                    cb.crearPrestamo(cc.clientes[idCliente-1],0,credito,false);

                 }
             });
             
             tarjeta.addActionListener(new ActionListener(){
                 public void actionPerformed(ActionEvent e){
                     
                 }
             });
             
             crearCuenta.addActionListener(new ActionListener(){
                 public void actionPerformed(ActionEvent e){
                    cc.agregarCuenta2(idCliente, 0,0);
                    JOptionPane.showMessageDialog(null, "Se ha creado una nueva cuenta");
                    
                 }
             });
             
 
            
            regresar.addActionListener(new ActionListener() {
             @Override   
            public void actionPerformed(ActionEvent e){
                Transaccion T = new Transaccion();
                T.setBounds(0,0,600,300);
                T.setLocationRelativeTo(null);
                T.setVisible(true);
                setVisible(false);
                T.setResizable(false);
                T.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }    
  
        });
        }
        
        public void tomarIdAgencia(){
            
            for(int i = 0; i < ControladorBanco.agenciasBan.length;i++){
                if(ControladorBanco.agenciasBan[i]!=null){
                    if(seleccion3.equals(ControladorBanco.agenciasBan[i].getId()+" "+ControladorBanco.agenciasBan[i].getNombre())){
                        idAgencia = i+1; 

                   }}}
        }
    }
    
    
        public class MenuAgenciaAuto extends JFrame{
        public MenuAgenciaAuto(){
            setLayout(null);
            barraMenu = new JMenuBar();
            setJMenuBar(barraMenu);
            
            titulo = new JLabel("Selecciona una Agencia de Auto Banco");
            titulo.setBounds(20,30,250,20);
            add(titulo);
        
            regresar = new JButton("Regresar");
            barraMenu.add(regresar);
            
            areaCaja = new JMenu("Area de Cajas");
            barraMenu.add(areaCaja);
            
            areaAtencion = new JMenu("Atencion al Cliente");
            barraMenu.add(areaAtencion);
            
            deposito = new JMenuItem("Deposito");
            areaCaja.add(deposito);
            
            retiro = new JMenuItem("Retiro");
            areaCaja.add(retiro);
            
            cambioCheque = new JMenuItem("Cambio de Cheque");
            areaCaja.add(cambioCheque);
            
            pago = new JMenu("Pagos");
            areaCaja.add(pago);
            
            servicio = new JMenuItem("Servicios");
            pago.add(servicio);
            
            prestamo = new JMenuItem("Prestamos");
            pago.add(prestamo);
            
            tarjeta = new JMenuItem("Tarjetas");
            pago.add(tarjeta);
            
            crearCuenta = new JMenuItem("Crear Cuenta");
            areaAtencion.add(crearCuenta);
            
            solicitud = new JMenu("Solicitud");
            areaAtencion.add(solicitud);
            
            solPrestamo = new JMenuItem("Prestamo");
            solicitud.add(solPrestamo);
            
            solTarjeta = new JMenuItem("Tarjeta");
            solicitud.add(solTarjeta);
            
            comboAgencia = new JComboBox();
            add(comboAgencia);
            comboAgencia.setBounds(20,60,300,20);
            comboAgencia.addItem("");
            for(int i = 0; i < ControladorBanco.agenciasAuto.length; i++){
                if(ControladorBanco.agenciasAuto[i]!=null){
                    comboAgencia.addItem(ControladorBanco.agenciasAuto[i].getId()+" "+ControladorBanco.agenciasAuto[i].getNombre());
                }
            }
            
            comboAgencia.addItemListener(new ItemListener() {
            @Override
                public void itemStateChanged(ItemEvent e) {        
                    seleccion3 = comboAgencia.getSelectedItem().toString();
                }
            });
            

            
            deposito.addActionListener(new ActionListener() {
                @Override   
                public void actionPerformed(ActionEvent e){
                    
                    if(seleccion3==null||seleccion3.equals("")){
                        System.out.println("Error");
                        JOptionPane.showMessageDialog(null, "Selecciona una Agencia", "Error", ERROR_MESSAGE);
                    }else{
                        tomarIdAgencia();
                        System.out.println(idAgencia);
                        Deposito D = new Deposito();
                        D.setBounds(0,0,300,300);
                        D.setLocationRelativeTo(null);
                        D.setVisible(true);
                        D.setResizable(false);
                        D.setTitle("Deposito");
                        
                    }
                } 
                
             });
            
            retiro.addActionListener(new ActionListener() {
                @Override   
                public void actionPerformed(ActionEvent e){
                    
                    if(seleccion3==null||seleccion3.equals("")){
                        System.out.println("Error");
                        JOptionPane.showMessageDialog(null, "Selecciona una Agencia", "Error", ERROR_MESSAGE);
                    }else{
                        tomarIdAgencia();
                        System.out.println(idAgencia);
                        Retiro R = new Retiro();
                        R.setBounds(0,0,300,200);
                        R.setLocationRelativeTo(null);
                        R.setVisible(true);
                        R.setResizable(false);
                        R.setTitle("Retiro");
                        
                    }                    
                }    
             });
            
            cambioCheque.addActionListener(new ActionListener() {
                @Override   
                public void actionPerformed(ActionEvent e){
                    
                    if(seleccion3==null||seleccion3.equals("")){
                        System.out.println("Error");
                        JOptionPane.showMessageDialog(null, "Selecciona una Agencia", "Error", ERROR_MESSAGE);
                    }else{
                        tomarIdAgencia();
                        System.out.println(idAgencia);
                        CambioCheque cch = new CambioCheque();
                        cch.setBounds(0,0,300,300);
                        cch.setLocationRelativeTo(null);
                        cch.setVisible(true);
                        cch.setResizable(false);
                        cch.setTitle("Cambio de cheque");
                    
                    }                    
                }    
             });
                        
                servicio.addActionListener(new ActionListener() {
                @Override   
                public void actionPerformed(ActionEvent e){
                    
                    if(seleccion3==null||seleccion3.equals("")){
                        System.out.println("Error");
                        JOptionPane.showMessageDialog(null, "Selecciona una Agencia", "Error", ERROR_MESSAGE);
                    }else{
                        tomarIdAgencia();
                        System.out.println(idAgencia);
                        PagoServicio ps = new PagoServicio();
                        ps.setBounds(0,0,300,300);
                        ps.setLocationRelativeTo(null);
                        ps.setVisible(true);
                        ps.setResizable(false);
                        ps.setTitle("Pago de servicios");
                        
                    }                    
                }    
             });
            
                
             solTarjeta.addActionListener(new ActionListener(){
                 public void actionPerformed(ActionEvent e){
                     double credito=0;
                    credito=Double.parseDouble(JOptionPane.showInputDialog(null, "¿Cuanto credito deseas?"));
                    cb.crearTarjeta(cc.clientes[idCliente-1],0,credito,false);
                 }
             });
             
             solPrestamo.addActionListener(new ActionListener(){
                 public void actionPerformed(ActionEvent e){
                    double credito=0;
                    credito=Double.parseDouble(JOptionPane.showInputDialog(null, "Monto del prestamo"));
                    cb.crearPrestamo(cc.clientes[idCliente-1],0,credito,false);

                 }
             });
             
             
                prestamo.addActionListener(new ActionListener() {
                @Override   
                public void actionPerformed(ActionEvent e){
                    
                    if(seleccion3==null||seleccion3.equals("")){
                        System.out.println("Error");
                        JOptionPane.showMessageDialog(null, "Selecciona una Agencia", "Error", ERROR_MESSAGE);
                    }else{
                        tomarIdAgencia();
                        PagoPrestamo pp = new PagoPrestamo();
                        pp.setBounds(0,0,300,300);
                        pp.setLocationRelativeTo(null);
                        pp.setVisible(true);
                        pp.setResizable(false);
                        pp.setTitle("Pago de prestamos");
                        
                    }                    
                }    
             });
                

             crearCuenta.addActionListener(new ActionListener(){
                 public void actionPerformed(ActionEvent e){
                    cc.agregarCuenta2(idCliente, 0,0);
                    JOptionPane.showMessageDialog(null, "Se ha creado una nueva cuenta");
                    
                 }
             });
                
            regresar.addActionListener(new ActionListener() {
             @Override   
            public void actionPerformed(ActionEvent e){
                Transaccion T = new Transaccion();
                T.setBounds(0,0,600,300);
                T.setLocationRelativeTo(null);
                T.setVisible(true);
                setVisible(false);
                T.setResizable(false);
                T.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }    
  
        });
        }
        
        public void tomarIdAgencia(){
            
            for(int i = 0; i < ControladorBanco.agenciasBan.length;i++){
                if(ControladorBanco.agenciasBan[i]!=null){
                    if(seleccion3.equals(ControladorBanco.agenciasBan[i].getId()+" "+ControladorBanco.agenciasBan[i].getNombre())){
                        idAgencia = i+1; 

                   }}}
        }
    }
        
    public class Cajero extends JFrame{
        public Cajero(){
            setLayout(null);
            barraMenu = new JMenuBar();
            setJMenuBar(barraMenu);
            
            titulo = new JLabel("Selecciona un Cajero");
            titulo.setBounds(20,30,250,20);
            add(titulo);
        
            regresar = new JButton("Regresar");
            barraMenu.add(regresar);
            
            
            retiro = new JMenuItem("Retiro");
            barraMenu.add(retiro);
            
           consultarSaldo = new JMenuItem("Consultar Saldo");
           barraMenu.add(consultarSaldo);
            
            comboAgencia = new JComboBox();
            add(comboAgencia);
            comboAgencia.setBounds(20,60,300,20);
            comboAgencia.addItem("");
            for(int i = 0; i < ControladorBanco.cajeros.length; i++){
                if(ControladorBanco.cajeros[i]!=null){
                    comboAgencia.addItem(ControladorBanco.cajeros[i].getId()+" "+ControladorBanco.cajeros[i].getDireccion());
                }
            }
            
            comboAgencia.addItemListener(new ItemListener() {
            @Override
                public void itemStateChanged(ItemEvent e) {        
                    seleccion3 = comboAgencia.getSelectedItem().toString();
                }
            });
            
            retiro.addActionListener(new ActionListener() {
                @Override   
                public void actionPerformed(ActionEvent e){
                    
                    if(seleccion3==null||seleccion3.equals("")){
                        System.out.println("Error");
                        JOptionPane.showMessageDialog(null, "Selecciona una Agencia", "Error", ERROR_MESSAGE);
                    }else{
                        tomarIdAgencia();
                        System.out.println(idAgencia);
                        Retiro R = new Retiro();
                        R.setBounds(0,0,300,200);
                        R.setLocationRelativeTo(null);
                        R.setVisible(true);
                        R.setResizable(false);
                        R.setTitle("Retiro");
                        
                    }                    
                }    
             });
            
            
            consultarSaldo.addActionListener(new ActionListener() {
                @Override   
                public void actionPerformed(ActionEvent e){
                    
                    if(seleccion3==null||seleccion3.equals("")){
                        System.out.println("Error");
                        JOptionPane.showMessageDialog(null, "Selecciona un Cajero", "Error", ERROR_MESSAGE);
                    }else{
                        tomarIdAgencia();
                        
                        consultarSaldo cs = new consultarSaldo();
                        cs.setBounds(0,0,300,200);
                        cs.setLocationRelativeTo(null);
                        cs.setVisible(true);
                        cs.setResizable(false);
                        cs.setTitle("Consultar saldo");
                        
                    }                    
                }    
             });            
            
                
            regresar.addActionListener(new ActionListener() {
             @Override   
            public void actionPerformed(ActionEvent e){
                Transaccion T = new Transaccion();
                T.setBounds(0,0,600,300);
                T.setLocationRelativeTo(null);
                T.setVisible(true);
                setVisible(false);
                T.setResizable(false);
                T.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }    
  
        });
        }
        
        public void tomarIdAgencia(){
            
            for(int i = 0; i < ControladorBanco.cajeros.length;i++){
                if(ControladorBanco.cajeros[i]!=null){
                    if(seleccion3.equals(ControladorBanco.cajeros[i].getId()+" "+ControladorBanco.cajeros[i].getDireccion())){
                        idAgencia = i+1; 

                   }}}
        }
    }
    
 public class CallCenter extends JFrame{
        public CallCenter(){
            setLayout(null);
            barraMenu = new JMenuBar();
            setJMenuBar(barraMenu);
            
            titulo = new JLabel("Call Center");
            titulo.setBounds(20,30,250,20);
            add(titulo);
        
            regresar = new JButton("Regresar");
            barraMenu.add(regresar);
            
            areaCaja = new JMenu("Area de Cajas");
            barraMenu.add(areaCaja);
            
            areaAtencion = new JMenu("Atencion al Cliente");
            barraMenu.add(areaAtencion);
            
            deposito = new JMenuItem("Deposito");
            areaCaja.add(deposito);
            
            
            pago = new JMenu("Pagos");
            areaCaja.add(pago);
            
            servicio = new JMenuItem("Servicios");
            pago.add(servicio);
            
            prestamo = new JMenuItem("Prestamos");
            pago.add(prestamo);
            
            tarjeta = new JMenuItem("Tarjetas");
            pago.add(tarjeta);
            
            crearCuenta = new JMenuItem("Crear Cuenta");
            areaAtencion.add(crearCuenta);
            
            solicitud = new JMenu("Solicitud");
            areaAtencion.add(solicitud);
            
            solPrestamo = new JMenuItem("Prestamo");
            solicitud.add(solPrestamo);
            
            solTarjeta = new JMenuItem("Tarjeta");
            solicitud.add(solTarjeta);
            
           

            
            deposito.addActionListener(new ActionListener() {
                @Override   
                public void actionPerformed(ActionEvent e){
    
                        System.out.println(idAgencia);
                        Deposito D = new Deposito();
                        D.setBounds(0,0,300,300);
                        D.setLocationRelativeTo(null);
                        D.setVisible(true);
                        D.setResizable(false);
                        D.setTitle("Deposito");
                        
                    }
                
                
             });
       
                        
                servicio.addActionListener(new ActionListener() {
                @Override   
                public void actionPerformed(ActionEvent e){
                    
             
                      
                        System.out.println(idAgencia);
                        PagoServicio ps = new PagoServicio();
                        ps.setBounds(0,0,300,300);
                        ps.setLocationRelativeTo(null);
                        ps.setVisible(true);
                        ps.setResizable(false);
                        ps.setTitle("Pago de servicios");
                        
                    }                    
                
             });
                
                prestamo.addActionListener(new ActionListener() {
                @Override   
                public void actionPerformed(ActionEvent e){
                    
                 
                        
                        PagoPrestamo pp = new PagoPrestamo();
                        pp.setBounds(0,0,300,300);
                        pp.setLocationRelativeTo(null);
                        pp.setVisible(true);
                        pp.setResizable(false);
                        pp.setTitle("Pago de prestamos");
                        
                    }                    
                   
             });
                
             solTarjeta.addActionListener(new ActionListener(){
                 public void actionPerformed(ActionEvent e){
                     double credito=0;
                    credito=Double.parseDouble(JOptionPane.showInputDialog(null, "¿Cuanto credito deseas?"));
                    cb.crearTarjeta(cc.clientes[idCliente-1],0,credito,false);
                 }
             });
             
             solPrestamo.addActionListener(new ActionListener(){
                 public void actionPerformed(ActionEvent e){
                    double credito=0;
                    credito=Double.parseDouble(JOptionPane.showInputDialog(null, "Monto del prestamo"));
                    cb.crearPrestamo(cc.clientes[idCliente-1],0,credito,false);

                 }
             });
             
             tarjeta.addActionListener(new ActionListener(){
                 public void actionPerformed(ActionEvent e){
                     
                 }
             });
             
             crearCuenta.addActionListener(new ActionListener(){
                 public void actionPerformed(ActionEvent e){
                    cc.agregarCuenta2(idCliente, 0,0);
                    JOptionPane.showMessageDialog(null, "Se ha creado una nueva cuenta");
                    
                 }
             });
             
 
            
            regresar.addActionListener(new ActionListener() {
             @Override   
            public void actionPerformed(ActionEvent e){
                Transaccion T = new Transaccion();
                T.setBounds(0,0,600,300);
                T.setLocationRelativeTo(null);
                T.setVisible(true);
                setVisible(false);
                T.setResizable(false);
                T.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }    
  
        });
        }
        
      
    }
    
    public class Deposito extends JFrame{
        public Deposito(){
            
            
            setLayout(null);
            
            barraMenu = new JMenuBar();
            setJMenuBar(barraMenu);
            
            efectivo = new JMenuItem("Efectivo");
            barraMenu.add(efectivo);
            
            cheque= new JMenuItem("Cheque");
            barraMenu.add(cheque);
            
            titulo = new JLabel("Selecciona una cuenta de destino");
            titulo.setBounds(20,30,250,20);
            add(titulo);
            
            titulo1 = new JLabel("Selecciona una cuenta de origen");
            titulo1.setBounds(20,100,250,20);
            add(titulo1);
            titulo1.setVisible(false);
            
            
            comboCuenta = new JComboBox();
            comboCuenta.setBounds(20,70,200,20);
            add(comboCuenta);
            comboCuenta.addItem("");
            for(int i = 0; i < cc.cuentas.length; i++){
                for(int j = 0; j<10; j++){
                    if(cc.cuentas[i][j]!=null){
                         comboCuenta.addItem(cc.cuentas[i][j].getNumero());
                    }
                        
                }
                
 
             }
            
            comboCuenta2 = new JComboBox();
            comboCuenta2.setBounds(20,140,200,20);
            add(comboCuenta2);
            comboCuenta2.addItem("");
           // idCliente = 1;
            for(int i = 0; i < 10; i++){
                if(cc.cuentas[idCliente][i]!=null){
                   //comboCuenta2.addItem(cc.cuentas[i][0].getNumero());
                   comboCuenta2.addItem(cc.cuentas[idCliente][i].getNumero());
                   
                }
             }
            comboCuenta2.setVisible(false);
            
            btnDeposito = new JButton("Depositar");
            btnDeposito.setBounds(20,180,100,20);
            add(btnDeposito);
            
            aceptar = new JButton("Aceptar");
            aceptar.setBounds(150,180,100,20);
            add(aceptar);
            
            
            comboCuenta.addItemListener(new ItemListener() {
            @Override
                public void itemStateChanged(ItemEvent e) {
                    seleccion1 = comboCuenta.getSelectedItem().toString();
                }
            });
            
            comboCuenta2.addItemListener(new ItemListener() {
            @Override
                public void itemStateChanged(ItemEvent e) {
                    seleccion2 = comboCuenta2.getSelectedItem().toString();
                }
            });
            
            efectivo.addActionListener(new ActionListener() {
            @Override   
            public void actionPerformed(ActionEvent e){
               // JOptionPane.showInputDialog("Monto", null);
                titulo1.setVisible(false);
                comboCuenta2.setVisible(false);
                retirar = false;
            }    
  
        });
            
            cheque.addActionListener(new ActionListener() {
            @Override   
                public void actionPerformed(ActionEvent e){
                    titulo1.setVisible(true);
                    comboCuenta2.setVisible(true);
                    //JOptionPane.showInputDialog("Monto", null);
                    retirar = true;
                }    
  
           });
            
           
            
            btnDeposito.addActionListener(new ActionListener() {
            @Override   
                public void actionPerformed(ActionEvent e){
 
                 monto=Double.parseDouble ( JOptionPane.showInputDialog("Monto", null));
                }    
  
          });
            
            aceptar.addActionListener(new ActionListener() {
            @Override   
                public void actionPerformed(ActionEvent e){
                  //  Integer.parseInt(seleccion1);
                     boolean retirado = true;
                    if(seleccion2!=null&&retirar){
                        retirado = cc.retiro(Integer.parseInt(seleccion2),monto);
                        if(retirado){
                            
                        }
                       //  System.out.println(  ControladorCliente.cuentas[Integer.parseInt(seleccion1)-1][0].getDinero());
                        // System.out.println(  ControladorCliente.cuentas[Integer.parseInt(seleccion2)-1][0].getDinero());
                    }
                    if(retirado){
                         cc.depositar(Integer.parseInt(seleccion1),monto);
                          cb.depositar(idAgencia,monto);
                          JOptionPane.showMessageDialog(null, "Su deposito se ha realizado con exito");
                    }
                   
                    

                    
                    //seleccion1 =null;
                    //seleccion2=null;
                    cc.mostrarDineroDeCuentas();
                }    
  
          });
            

        }
    }
    
    public class Retiro extends JFrame{
        public Retiro(){
            
            
            setLayout(null);
            
                       
            titulo = new JLabel("Selecciona una cuenta de retiro");
            titulo.setBounds(20,30,250,20);
            add(titulo);
                                   
            comboCuenta2 = new JComboBox();
            comboCuenta2.setBounds(20,70,200,20);
            add(comboCuenta2);
            comboCuenta2.addItem("");
           // idCliente = 1;
            for(int i = 0; i < 10; i++){
                if(cc.cuentas[idCliente][i]!=null){
                   //comboCuenta2.addItem(cc.cuentas[i][0].getNumero());
                   comboCuenta2.addItem(cc.cuentas[idCliente][i].getNumero());
                   
                }
             }
            
            btnRetiro = new JButton("Retirar");
            btnRetiro.setBounds(20,110,100,20);
            add(btnRetiro);
            
            aceptar = new JButton("Aceptar");
            aceptar.setBounds(150,110,100,20);
            add(aceptar);

            
            comboCuenta2.addItemListener(new ItemListener() {
            @Override
                public void itemStateChanged(ItemEvent e) {
                    seleccion2 = comboCuenta2.getSelectedItem().toString();
                }
            });
 

            
            btnRetiro.addActionListener(new ActionListener() {
            @Override   
                public void actionPerformed(ActionEvent e){
 
                 monto=Double.parseDouble ( JOptionPane.showInputDialog("Monto", null));
                }    
  
          });
            
            aceptar.addActionListener(new ActionListener() {
            @Override   
                public void actionPerformed(ActionEvent e){
                  //  Integer.parseInt(seleccion1);
                    
                    System.out.println(lugar);
                    cc.retiro(Integer.parseInt(seleccion2),monto);
                    if(lugar ==0){
                    cb.retirar(idAgencia,monto);
                    }else if(lugar==2){
                        cb.retirarCajero(idAgencia,monto);
                    }
               //     JOptionPane.showMessageDialog(null, "Su retiro se ha realizado con exito");
                    //seleccion1 =null;
                    //seleccion2=null;
                    cc.mostrarDineroDeCuentas();
                }    
  
          });
            

        }
    }

      public class CambioCheque extends JFrame{
        public CambioCheque(){
            
            
            setLayout(null);
            
            barraMenu = new JMenuBar();
            setJMenuBar(barraMenu);
            
            efectivo = new JMenuItem("Efectivo");
            barraMenu.add(efectivo);
            
            cheque= new JMenuItem("Deposito");
            barraMenu.add(cheque);
            
            titulo = new JLabel("Selecciona una cuenta de retiro");
            titulo.setBounds(20,30,250,20);
            add(titulo);
            
            titulo1 = new JLabel("Selecciona una cuenta de deposito");
            titulo1.setBounds(20,100,250,20);
            add(titulo1);
            titulo1.setVisible(false);
            
            
            comboCuenta = new JComboBox();
            comboCuenta.setBounds(20,70,200,20);
            add(comboCuenta);
            comboCuenta.addItem("");
            for(int i = 0; i < cc.cuentas.length; i++){
                for(int j = 0; j<10; j++){
                    if(cc.cuentas[i][j]!=null){
                         comboCuenta.addItem(cc.cuentas[i][j].getNumero());
                    }
                        
                }
                
 
             }
            
            comboCuenta2 = new JComboBox();
            comboCuenta2.setBounds(20,140,200,20);
            add(comboCuenta2);
            comboCuenta2.addItem("");
           // idCliente = 1;
            for(int i = 0; i < cc.cuentas.length; i++){
                for(int j = 0; j<10; j++){
                    if(cc.cuentas[i][j]!=null){
                         comboCuenta2.addItem(cc.cuentas[i][j].getNumero());
                    }
                        
                }
                
 
             }
            comboCuenta2.setVisible(false);
            
            btnRetiro = new JButton("Retirar");
            btnRetiro.setBounds(20,180,100,20);
            add(btnRetiro);
            
            aceptar = new JButton("Aceptar");
            aceptar.setBounds(150,180,100,20);
            add(aceptar);
            
            
            comboCuenta.addItemListener(new ItemListener() {
            @Override
                public void itemStateChanged(ItemEvent e) {
                    seleccion1 = comboCuenta.getSelectedItem().toString();
                }
            });
            
            comboCuenta2.addItemListener(new ItemListener() {
            @Override
                public void itemStateChanged(ItemEvent e) {
                    seleccion2 = comboCuenta2.getSelectedItem().toString();
                }
            });
            
            efectivo.addActionListener(new ActionListener() {
            @Override   
            public void actionPerformed(ActionEvent e){
               // JOptionPane.showInputDialog("Monto", null);
                titulo1.setVisible(false);
                comboCuenta2.setVisible(false);
                retirar = false;
            }    
  
        });
            
            cheque.addActionListener(new ActionListener() {
            @Override   
                public void actionPerformed(ActionEvent e){
                    titulo1.setVisible(true);
                    comboCuenta2.setVisible(true);
                    //JOptionPane.showInputDialog("Monto", null);
                    retirar = true;
                }    
  
           });
            
            btnRetiro.addActionListener(new ActionListener() {
            @Override   
                public void actionPerformed(ActionEvent e){
 
                 monto=Double.parseDouble ( JOptionPane.showInputDialog("Monto", null));
                }    
  
          });
            
            aceptar.addActionListener(new ActionListener() {
            @Override   
                public void actionPerformed(ActionEvent e){
                  //  Integer.parseInt(seleccion1);
                    
                    
                    cc.retiro(Integer.parseInt(seleccion1),monto);
                    cb.retirar(idAgencia,monto);
                 //   JOptionPane.showMessageDialog(null, "Su pago se ha retiro con exito");
                    if(seleccion2!=null&&retirar){
                     cc.depositar(Integer.parseInt(seleccion2),monto);
                       //  System.out.println(  ControladorCliente.cuentas[Integer.parseInt(seleccion1)-1][0].getDinero());
                        // System.out.println(  ControladorCliente.cuentas[Integer.parseInt(seleccion2)-1][0].getDinero());
                    }
                    //seleccion1 =null;
                    //seleccion2=null;
                    cc.mostrarDineroDeCuentas();
                }    
  
          });
            

        }
    }
      
       public class PagoServicio extends JFrame{
        public PagoServicio(){
            
            
            
            setLayout(null);
            
            barraMenu = new JMenuBar();
            setJMenuBar(barraMenu);
            
            agua = new JMenuItem("Agua");
            barraMenu.add(agua);
            
            luz= new JMenuItem("Luz");
            barraMenu.add(luz);
            
            telefono= new JMenuItem("Telefono");
            barraMenu.add(telefono);
            
            titulo = new JLabel("Pagar un total de: Q"+cb.agua[idCliente].getMonto()+" de agua");
            titulo.setBounds(20,30,250,20);
            add(titulo);
            titulo.setVisible(false);
            
            titulo1 = new JLabel("Pagar un total de: Q"+cb.luz[idCliente].getMonto()+" de luz");
            titulo1.setBounds(20,30,250,20);
            add(titulo1);
            titulo1.setVisible(false);
            
            titulo2 = new JLabel("Pagar un total de: Q"+cb.telefono[idCliente].getMonto()+" de telefono");
            titulo2.setBounds(20,30,250,20);
            add(titulo2);
            titulo2.setVisible(false);
            
            titulo3 = new JLabel("Selecciona un numero de cuenta");
            titulo3.setBounds(20,100,200,20);
            add(titulo3);
            
            comboCuenta = new JComboBox();
            comboCuenta.setBounds(20,140,200,20);
            add(comboCuenta);
            comboCuenta.addItem("Efectivo");
           // idCliente = 1;
            for(int i = 0; i < 10; i++){
                if(cc.cuentas[idCliente][i]!=null){
                   //comboCuenta2.addItem(cc.cuentas[i][0].getNumero());
                   comboCuenta.addItem(cc.cuentas[idCliente][i].getNumero());
                   
                }
             }

            aceptar = new JButton("Pagar");
            aceptar.setBounds(150,180,100,20);
            add(aceptar);
            
            
            
            comboCuenta.addItemListener(new ItemListener() {
            @Override
                public void itemStateChanged(ItemEvent e) {
                    seleccion2 = comboCuenta.getSelectedItem().toString();
                }
            });

            agua.addActionListener(new ActionListener() {
            @Override   
                public void actionPerformed(ActionEvent e){
                    titulo.setVisible(true);
                    titulo1.setVisible(false);
                    titulo2.setVisible(false);
                    eleccionServicio = 0;
                }    
  
          });
            luz.addActionListener(new ActionListener() {
            @Override   
                public void actionPerformed(ActionEvent e){
                    titulo1.setVisible(true);
                    titulo.setVisible(false);
                    titulo2.setVisible(false);  
                    eleccionServicio = 1;
                }    
  
          });
            telefono.addActionListener(new ActionListener() {
            @Override   
                public void actionPerformed(ActionEvent e){
                    titulo2.setVisible(true);
                    titulo1.setVisible(false);
                    titulo.setVisible(false);    
                    eleccionServicio = 2;
                }    
  
          });


            
            aceptar.addActionListener(new ActionListener() {
            @Override   
                public void actionPerformed(ActionEvent e){
                  //  Integer.parseInt(seleccion1);
                    
                    if(seleccion2 ==null||seleccion2.equals("")||seleccion2.equals("Efectivo")){
                        if(eleccionServicio == 0){
                            cb.agua[idCliente].setMonto(0);
                            JOptionPane.showMessageDialog(null, "Su pago se ha realizado con exito");
                        }else if(eleccionServicio == 1){
                            cb.luz[idCliente].setMonto(0);
                            JOptionPane.showMessageDialog(null, "Su pago se ha realizado con exito");
                        }else if(eleccionServicio == 2){
                            cb.telefono[idCliente].setMonto(0);
                            JOptionPane.showMessageDialog(null, "Su pago se ha realizado con exito");
                        }
                        
                    }else{
                        boolean hayDinero;
                        if(eleccionServicio == 0){
                            hayDinero = cc.retiro(Integer.parseInt(seleccion2),cb.agua[idCliente].getMonto());
                            if(hayDinero){
                                cb.agua[idCliente].setMonto(0);
                                JOptionPane.showMessageDialog(null, "Su pago se ha realizado con exito");
                            }
                        }else if(eleccionServicio == 1){
                            hayDinero = cc.retiro(Integer.parseInt(seleccion2),cb.luz[idCliente].getMonto());
                            if(hayDinero){
                                cb.luz[idCliente].setMonto(0);
                                JOptionPane.showMessageDialog(null, "Su pago se ha realizado con exito");
                            }
                        }else if(eleccionServicio == 2){
                            hayDinero = cc.retiro(Integer.parseInt(seleccion2),cb.telefono[idCliente].getMonto());
                            if(hayDinero){
                                cb.telefono[idCliente].setMonto(0);
                                JOptionPane.showMessageDialog(null, "Su pago se ha realizado con exito");
                            }
                        }else{
                            
                        }
          
                        cc.mostrarDineroDeCuentas();
                    }
                   // cc.depositar(Integer.parseInt(seleccion1),monto);
                  //  cb.depositar(idAgencia,monto);
                    
                   // if(seleccion2!=null&&retirar){
                   //  cc.retiro(Integer.parseInt(seleccion2),monto);
                       //  System.out.println(  ControladorCliente.cuentas[Integer.parseInt(seleccion1)-1][0].getDinero());
                        // System.out.println(  ControladorCliente.cuentas[Integer.parseInt(seleccion2)-1][0].getDinero());
                   // }
                    //seleccion1 =null;
                    //seleccion2=null;
                   // cc.mostrarDineroDeCuentas();
                }    
  
          });
            

        }
    }
       
    public class PagoPrestamo extends JFrame{
        public PagoPrestamo(){
            setLayout(null);
            titulo = new JLabel("Selecciona el prestamo que deseas pagar");
            titulo.setBounds(20,20,100,20);
            add(titulo);
            
            comboPrestamo = new JComboBox();
            comboPrestamo.setBounds(20,50,200,20);
            add(comboPrestamo);
            
            titulo1 = new JLabel("Selecciona numero de cuenta");
            titulo1.setBounds(20,70,100,20);
            add(titulo1);
            comboCuenta = new JComboBox();
            comboCuenta.setBounds(20,100,200,20);
            add(comboCuenta);
            
            aceptar = new JButton("Pagar");
            aceptar.setBounds(20,140,100,20);
            add(aceptar);
             
            comboPrestamo.addItem("");
            if(cb.prestamos[idCliente-1]!=null){
                   comboPrestamo.addItem(cb.prestamos[idCliente-1].getCliente().getId()+" "+cb.prestamos[idCliente-1].getCliente().getNombre()+" "+cb.prestamos[idCliente-1].getDeuda());
            }
            
            comboCuenta.addItem("Efectivo");
            for(int i = 0; i < 10; i++){
                if(cc.cuentas[idCliente][i]!=null){
                   //comboCuenta2.addItem(cc.cuentas[i][0].getNumero());
                   comboCuenta.addItem(cc.cuentas[idCliente][i].getNumero());
                   
                }
                
             }

           comboCuenta.addItemListener(new ItemListener() {
            @Override
                public void itemStateChanged(ItemEvent e) {
                    seleccion1 = comboCuenta.getSelectedItem().toString();
                }
            });
           
           aceptar.addActionListener(new ActionListener(){
               public void actionPerformed(ActionEvent e){
                   if(seleccion1.equals("Efectivo")){
                       cb.prestamos[idCliente-1].setDeuda(0);
                   }else{
                       cc.retiro(Integer.parseInt(seleccion1), cb.prestamos[idCliente-1].getDeuda());
                       cb.prestamos[idCliente-1].setDeuda(0);
                   }
               }
           });
        }
    }
    
    public class consultarSaldo extends JFrame{
        public consultarSaldo(){
            titulo = new JLabel("Selecciona un numero de cuenta");
            titulo.setBounds(20,20,250,20);
            add(titulo);
            
            comboCuenta = new JComboBox();
            comboCuenta.setBounds(20,60,200,20);
            add(comboCuenta);
            
            aceptar = new JButton("Consultar Saldo");
            aceptar.setBounds(20,100,200,20);
            add(aceptar);
            
            titulo1 = new JLabel("");
            titulo1.setBounds(20,140,250,20);
            add(titulo1);
            
            comboCuenta.addItem("");
            for(int i = 0; i < 10; i++){
                if(cc.cuentas[idCliente][i]!=null){
                   //comboCuenta2.addItem(cc.cuentas[i][0].getNumero());
                   comboCuenta.addItem(cc.cuentas[idCliente][i].getNumero());  
                }   
             }

           comboCuenta.addItemListener(new ItemListener() {
            @Override
                public void itemStateChanged(ItemEvent e) {
                    seleccion1 = comboCuenta.getSelectedItem().toString();
                }
            });            
            
           aceptar.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    cc.consultarSaldo(Integer.parseInt(seleccion1));
                }
            });
        }
    }

}