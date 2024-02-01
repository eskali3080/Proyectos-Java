/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerjava;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


/**
 *
 * @author Instructor
 */
public class Imgfondo extends JPanel {
    public Imgfondo(){
       JLabel etiqueta = new JLabel("Esto es una etiqueta");
       add(etiqueta);
       JTextField texto = new JTextField(10);
       add(texto);
       
    }
    @Override
    public void paint(Graphics g){
    ImageIcon imagen= new ImageIcon(getClass() .getResource("/IMG/nature.jpg"));
    g.drawImage(imagen.getImage(),0,0,getWidth(),getHeight(),this);
    
    setOpaque(false);
    super.paint(g);
    }
    public static void main (String[] args){
    JFrame ventana = new JFrame ("Imagen de Fondo");
    Imgfondo fondo= new Imgfondo();
    ventana. setContentPane (fondo) ;
    ventana. setSize (600,600);
    ventana.setVisible(true);
    ventana. setLocationRelativeTo(null);
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
            
} 
    

    

