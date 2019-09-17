
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gerso
 */
public class MiNombre extends JFrame {
    
    JButton nombre;
    JLabel texto;
    public MiNombre(){
        
        setLayout(null);
        nombre = new JButton("nombre");
        nombre.setBounds(20,50,150,20);
        add(nombre);
        
        texto = new JLabel("Gerson");
        texto.setBounds(20,20,100,20);
        add(texto);
        texto.setVisible(false);
        
                  nombre.addActionListener(new ActionListener() {
            @Override
                public void actionPerformed(ActionEvent e) {
                    texto.setVisible(true);
                
                }
    
            });
        
        
        
    }
}
