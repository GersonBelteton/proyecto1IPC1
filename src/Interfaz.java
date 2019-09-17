
import javax.swing.*;
import java.awt.event.*;


public class Interfaz extends JFrame{
    JButton btnTransaccion, btnEmpleados, btnAdministrativo, btnReportes;
    JLabel titulo;
    
    ControladorCliente cc = new ControladorCliente();
    
    public Interfaz(){

        setLayout(null);
        titulo = new JLabel("Banco del Exterior");
        titulo.setBounds(10,10,400,10);
        add(titulo);
        botones();
        

   
    }
    

    public void botones(){
        btnTransaccion = new JButton("Transacción");
        btnTransaccion.setBounds(10,40,270,20);
        add(btnTransaccion);
        btnTransaccion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("hola");
                Transaccion T = new Transaccion();
                T.setBounds(0,0,600,300);
                T.setLocationRelativeTo(null);
                T.setVisible(true);
                setVisible(false);
                T.setResizable(false);
                T.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });
            
       
        boolean pass = false;
        btnAdministrativo = new JButton("Administrador");
        btnAdministrativo.setBounds(10,70,270,20);
        add(btnAdministrativo);
        btnAdministrativo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                Administrador A = new Administrador();
               
                A.setBounds(0,0,300,300);
                A.setLocationRelativeTo(null);
                A.setVisible(true);
                setVisible(false);
                A.setResizable(false);
                A.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               // A.contraseña(pass);
               
            }
        });
        

        

        
    }
    



    
}
