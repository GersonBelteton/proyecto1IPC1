
import javax.swing.*;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.awt.*;
import java. awt.event.*;

import java.io.*;


public class Reportes extends JFrame{
    ControladorCliente cc = new ControladorCliente();
    ControladorBanco cb = new ControladorBanco();
    ControladorEmpleado ce = new ControladorEmpleado();
     
    JEditorPane editor;
    JFileChooser selectFile;
    JButton guardar, regresar;
    JMenuBar barraMenu, barraMenu2;
    JMenu opcion;
    JMenuItem listadoCliente,listadoAgencia,listadoCajero,clientesMasDinero,sumatoriaEfectivo,
            empleadosOc, empleadosAg,clienteMasCuentas,clienteMasDeudas,montoAgencia,listadoCuenta;
    String lista="";
    public Reportes(){
        setLayout(null);
      
                            setVisible(false);
                    
                    this.setBounds(0,0,600,500);
                    this.setVisible(true);
                    this.setLocationRelativeTo(null);
                    this.setResizable(false);
                    this.setTitle("Reportes");
                    //this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        barraMenu = new JMenuBar();
        setJMenuBar(barraMenu);
        
       // barraMenu2 = new JMenuBar();
        //setJMenuBar(barraMenu2);
          regresar = new JButton("Regresar");
        barraMenu.add(regresar);
        
        opcion = new JMenu("Opciones");
        barraMenu.add(opcion);
        
      
        
        listadoCliente = new JMenuItem("Listado de Clientes");
        opcion.add(listadoCliente);
        
        listadoAgencia = new JMenuItem("Listado de Agencias");
        opcion.add(listadoAgencia);
        
        listadoCajero = new JMenuItem("Listado de Cajeros");
        opcion.add(listadoCajero);
        
        clientesMasDinero = new JMenuItem("Clientes con mas Dinero");
        opcion.add(clientesMasDinero);
        
        clienteMasCuentas = new JMenuItem("Clientes con mas Cuentas");
        opcion.add(clienteMasCuentas);
        
        empleadosOc = new JMenuItem("Empleados Oficinas");
        opcion.add(empleadosOc);
        
        empleadosAg = new JMenuItem("Empleados Agencias");
        opcion.add(empleadosAg);
        
        clienteMasDeudas = new JMenuItem("Clientes deudores");
        opcion.add(clienteMasDeudas);
        
        sumatoriaEfectivo = new JMenuItem("Efectivo de Agencias");
        opcion.add(sumatoriaEfectivo);
        
        montoAgencia = new JMenuItem("Monto de cada Agencia");
        opcion.add(montoAgencia);
        
        listadoCuenta = new JMenuItem("Listado de Cuentas");
        opcion.add(listadoCuenta);
        
        editor = new JEditorPane();
        editor.setBounds(0,0,600,400);
       // editor.setText("holaaa");
        add(editor);
        
        selectFile = new JFileChooser();
        guardar = new JButton("Generar PDF");
        guardar.setBounds(200,400,150,20);
        add(guardar);
        
        guardar.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               int opcion = selectFile.showSaveDialog(null);
               if(opcion == selectFile.APPROVE_OPTION){
                   try{
                       OutputStream salidaTexto = new FileOutputStream(selectFile.getSelectedFile());
                       Document documento = new Document();
                       PdfWriter.getInstance(documento,salidaTexto);
                       documento.open();
                       documento.add(new Paragraph(editor.getText()));
                       documento.close();
                       salidaTexto.close();
                   }catch(Exception ex){
                       
                   }
               }
           } 
        });
        
           listadoCliente.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               //editor.setText("holaaa");
               lista="";
               concatenarClientes();
                editor.setText(lista);
           } 
        });
           
           listadoAgencia.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               //editor.setText("holaaa");
               lista="";
               concatenarAgencias();
                editor.setText(lista);
           } 
        });
           
           listadoCajero.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               //editor.setText("holaaa");
               lista="";
               concatenarCajeros();
                editor.setText(lista);
           } 
        });
           
           clienteMasCuentas.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
            //System.out.println(  cc.clientes[0].getMonetaria().getDinero());
               //clientesMasDinero();
               lista="";
               int numCuentas=0;
               concatenarCuentas(numCuentas);
               editor.setText(lista);
  
               
           } 
        }); 
           
        clientesMasDinero.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                lista = "";
                ordenarDineroCuentas();
                editor.setText(lista);
            }
        });
        
        clienteMasDeudas.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                lista = "";
                ordenarDeudas();
                editor.setText(lista);
            }
        });       
        
        sumatoriaEfectivo.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                lista = "";
                sumatoriaEfectivo();
                editor.setText(lista);
            }
        });
        
        montoAgencia.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                lista = "";
                concatenarMontoAgencia();
                editor.setText(lista);
            }
        });

        listadoCuenta.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                lista="";
                concatenarCuentas();
                editor.setText(lista);
            }
        
        });
           
           empleadosOc.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
            //System.out.println(  cc.clientes[0].getMonetaria().getDinero());
               //clientesMasDinero();
               lista = "";
               concatenarEmpleadosOc();
               editor.setText(lista);
           } 
        }); 
           
           empleadosAg.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
            //System.out.println(  cc.clientes[0].getMonetaria().getDinero());
               //clientesMasDinero();
               lista = "";
               concatenarEmpleadosAg();
               editor.setText(lista);
           } 
        });
           
           regresar.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               Administrador ad = new Administrador();
                setVisible(false);
                ad.menuAdmin();
           } 
        });
    }
    
    public void concatenarClientes(){
        for(int i= 0; i<cc.clientes.length;i++){
            if(cc.clientes[i]!=null){
                lista = lista+cc.clientes[i].getId()+" "+cc.clientes[i].getNombre()+"  Direccion: "+cc.clientes[i].getDireccion()+"  Telefono: "+cc.clientes[i].getTelefono()+"\n";
            }
        }
        
    }
    
        public void concatenarAgencias(){
        for(int i= 0; i<cb.agenciasBan.length;i++){
            if(cb.agenciasBan[i]!=null){
                lista = lista+cb.agenciasBan[i].getId()+" "+cb.agenciasBan[i].getNombre()+"  Direccion: "+cb.agenciasBan[i].getDireccion()
                        +"  Telefono: "+cb.agenciasBan[i].getTelefono()+" no de Cajas: "+cb.agenciasBan[i].getNumCajas()
                        +" no de Escritorios: "+cb.agenciasBan[i].getNumEscritorios()+" Q."+cb.agenciasBan[i].getEfectivo()+"\n";
            }
        }
        
        for(int i= 0; i<cb.agenciasAuto.length;i++){
            if(cb.agenciasAuto[i]!=null){
                lista = lista+cb.agenciasAuto[i].getId()+" "+cb.agenciasAuto[i].getNombre()+"  Direccion: "+cb.agenciasAuto[i].getDireccion()
                        +"  Telefono: "+cb.agenciasAuto[i].getTelefono()+" no de Cajas: "+cb.agenciasAuto[i].getNumCajas()
                        +" no de Escritorios: "+cb.agenciasAuto[i].getNumEscritorios()+" Q."+cb.agenciasAuto[i].getEfectivo()+"\n";
            }
        }
        
        }   
        
        public void sumatoriaEfectivo(){
            double suma=0;
            for(int i = 0; i <cb.agenciasBan.length;i++){
                if(cb.agenciasBan[i]!=null){
                    suma = suma+cb.agenciasBan[i].getEfectivo();
                }
            }
            
            for(int i = 0; i <cb.agenciasAuto.length;i++){
                if(cb.agenciasAuto[i]!=null){
                    suma = suma+cb.agenciasAuto[i].getEfectivo();
                }
            }
            
            lista="El efectivo total disponible es: Q."+suma;
        }
        
        public void concatenarMontoAgencia(){
            for(int i = 0; i < cb.agenciasBan.length;i++){
                if(cb.agenciasBan[i]!=null){
                    lista = lista+cb.agenciasBan[i].getId()+" "+cb.agenciasBan[i].getNombre()+" "+cb.agenciasBan[i].getEfectivo()+"\n";
                }
            }
        }
        
    
        
        public void concatenarCajeros(){
            for(int i = 0; i < cb.cajeros.length;i++){
                if(cb.cajeros[i] !=null){
                    lista = lista+cb.cajeros[i].getId()+" "+cb.cajeros[i].getDireccion()+" "+cb.cajeros[i].getEstado2()+"  Q."+cb.cajeros[i].getEfectivo()+"\n";
                }
            }
        }
        
        public void clientesMasDinero(){
            double dinero1=0, dinero2, dinero3;
            for(int i = 0; i < cc.clientes.length; i++){
                if(cc.clientes[i]!=null){
                    if(cc.clientes[i].getMonetaria().getDinero()>dinero1){
                       dinero1= cc.clientes[i].getMonetaria().getDinero(); 
                    }
                 //  dinero1= cc.clientes[i].getMonetaria().getDinero();
                   System.out.println(dinero1);
                }
            }
        }
        
        public void concatenarEmpleadosOc(){
            for(int i = 0; i < ce.empleados.length; i++){
                if(ce.empleados[i]!=null){
                    if("Gerencia".equals(ce.empleados[i].getPuesto())||"Marketing".equals(ce.empleados[i].getPuesto())||"Informatica".equals(ce.empleados[i].getPuesto())
                            ||"Reclamos".equals(ce.empleados[i].getPuesto())||"Cobros".equals(ce.empleados[i].getPuesto())||"Finanzas".equals(ce.empleados[i].getPuesto())){
                        lista = lista+ce.empleados[i].getId()+" "+ce.empleados[i].getNombre()+" "+ce.empleados[i].getPuesto()+" \n";
                    }
                    
                 }
            }
        }
        
        public void concatenarEmpleadosAg(){
            for(int i = 0; i < ce.empleados.length; i++){
                if(ce.empleados[i]!=null){
                    if("Gerencia".equals(ce.empleados[i].getPuesto())||"Marketing".equals(ce.empleados[i].getPuesto())||"Informatica".equals(ce.empleados[i].getPuesto())
                            ||"Reclamos".equals(ce.empleados[i].getPuesto())||"Cobros".equals(ce.empleados[i].getPuesto())||"Finanzas".equals(ce.empleados[i].getPuesto())){
                        
                    }else{
                        lista = lista+ce.empleados[i].getId()+" "+ce.empleados[i].getNombre()+" "+ce.empleados[i].getPuesto()+" \n";
                    }
                    
                 }
            }
        }
        
        public void concatenarCuentas(int numCuentas){
            for(int i = 0; i<3;i++){
                if(cc.clientes[i]!=null){
                    numCuentas = cc.ContadorDeCuentas(i);
                      lista = lista+cc.clientes[i].getId()+" "+cc.clientes[i].getNombre()+" "+numCuentas+"\n";
                    {    
                }
            }
        }
    }
        
    public void concatenarCuentas(){
        for(int i = 0; i < cc.clientes.length; i++){
            if(cc.clientes[i]!=null){
                lista = lista+cc.clientes[i].getId()+" "+cc.clientes[i].getNombre()+"  numeros de cuenta:  ";
                for(int j = 0; j < cc.cuentas.length; j++){
                    if(cc.cuentas[i+1][j]!=null){
                        lista=lista+cc.cuentas[i+1][j].getNumero()+" ,";
                    }
                }
                lista=lista+"\n";
            }
        }
    }    
        
    public void ordenarDeudas(){
        double[]dinero = cc.contadorDeuda();
        double aux;
        
        for(int i = 0; i < cc.clientes.length;i++){
            for(int j = 0; j < cc.clientes.length;j++){
                if(dinero[i]>dinero[j]){
                    aux=dinero[i];
                    dinero[i]=dinero[j];
                    dinero[j]=aux;
                }
            }
        }
        concatenarDeudas(dinero);
    }    
        //aux=b    b = a   a = aux
    public void ordenarDineroCuentas(){
        double dinero[] = new double[cc.clientes.length];
        double mayor,aux;
        for(int i = 0; i < cc.clientes.length;i++){
            if(cc.clientes[i]!=null){
               dinero[i] = cc.contadorDinero(i);
            }
        }
        
        
        for(int i = 0; i<cc.clientes.length;i++){
            for(int j = 0; j<cc.clientes.length; j++){
                if(dinero[i]>dinero[j]){
                    aux = dinero[i];
                    dinero[i]= dinero[j];
                    dinero[j]= aux;
                }
            }
        }
       
        for(int i = 0; i < 3; i++){

                System.out.println(dinero[i]+" ");
        }
        concatenarDineroCuentas(dinero);
    } 
    
    public void concatenarDineroCuentas(double dinero[]){
        for(int i = 0; i <3;i++){
            if(cc.clientes[i]!= null){
                lista = lista+cc.clientes[i].getId()+" "+cc.clientes[i].getNombre()+" "+dinero[i]+"\n";
            }
        }
       
    }
    
        public void concatenarDeudas(double dinero[]){
        for(int i = 0; i <cb.prestamos.length;i++){
            if(cb.prestamos[i]!= null){
                lista=lista+cb.prestamos[i].getCliente().getNombre()+" "+dinero[i]+"\n";
                //lista = lista+cc.clientes[i].getId()+" "+cc.clientes[i].getNombre()+" "+dinero[i]+"\n";
            }
        }
       
    }
    
    
}