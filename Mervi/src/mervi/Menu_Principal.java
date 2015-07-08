/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mervi;

/**
 *
 * @author Valentina Castrillon Gomez- Laura Cristina Marin Velez 
 * Fecha: creada mayo 23/2015
 * esta es la clase se crea el formulario de Menu 
 */


/**
 * Libreria que se ocupa de la parte grafica de la ventana 
 */
import javax.swing.*;
/**
 * Es para los eventos que ocurren en la clase 
 */
import java.awt.event.*;
/**
 * Tambien se ocupa de la parte grafica 
 */
import java.awt.*;

/*
 * Se crea la clase de Menu Principal con un JFrame(marco) y todos sus elementos
 */

public class Menu_Principal extends JFrame implements ActionListener{
    /**se crea un label para colocar la imagen
     * 
     */
	JLabel imagen;
        /**
         * Icono de estilo de la foto
         */
	Icon Foto; 
        /**
         *  asi se coloca la barra de menu
         */
	JMenuBar barraMenu= new JMenuBar ();
        /**
         *el nombre que tendra la barra de menu
         */
	JMenu Interfaces=new JMenu("Menu Principal");
        /**
         * Estos son los items que tendra la lista desplegable de la barra de menu
         */
	JMenuItem Usuarios, Productos, Proveedores, Clientes , Ventas, Compras ;
	
/**
 * codigo para la imagen
 */

Icon Gim = new ImageIcon("imagen8.jpg"); 

/**
         * Se crea el constructor donde se le ponen todas las propiedades a los JLabel, JButton, JTextField...
         */

    public Menu_Principal() { 


    setTitle("Mercado de Vinos - Menú Principal");
    setSize(600,450);
    setResizable(false);
    setBackground(Color.white);
    setVisible(true);
    setLayout(null);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(Menu_Principal.EXIT_ON_CLOSE);



    Usuarios= new JMenuItem("Usuarios");
    Productos=new JMenuItem("Productos");
    Proveedores= new JMenuItem("Proveedores");
    Clientes = new JMenuItem("Clientes");
    Ventas= new JMenuItem("Ventas");
    Compras= new JMenuItem("Compras");
    
    
 /**
 * Para addcionar los objetos al formulario
 **/

    Interfaces.add(Usuarios);
    Interfaces.add(Productos);
    Interfaces.add(Proveedores);
    Interfaces.add(Clientes);
    Interfaces.add(Ventas);
    Interfaces.add(Compras);
    

    barraMenu.add(Interfaces);
    setJMenuBar(barraMenu);
    Proveedores.addActionListener(this);
    Foto= new ImageIcon("imagen7.jpg");
    imagen = new JLabel(Foto);
	imagen.setBounds(0,0,600,450);
	getContentPane().add(imagen);


    }
    
    /**
     * Para cuando el usuaruo presione en el MenuItem Proveedores se vaya a la ventana de proveedores 
     * 
     */

    public void actionPerformed(ActionEvent event)
   	{

   	if(event.getSource()==Proveedores){
   		Proveedores pv = new  Proveedores();


   	}


   	}
}



