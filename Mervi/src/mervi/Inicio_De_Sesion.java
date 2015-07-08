/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mervi;

/**
 *
 * @author Valentina Castrillon Gomez- Laura Cristina Marin Velez 
 * Fecha: creada mayo 23/2015
 * esta es la clase se crea el formulario de inicio de sesion 
 **/

/**
 * Libreria que se ocupa de la parte grafica de la ventana 
 **/
import javax.swing.*;
/**
 * Es para los eventos que ocurren en la clase 
 **/
import java.awt.event.*;
/**
 * Tambien se ocupa de la parte grafica 
 **/
import java.awt.*;
/**
 * Se crea la clase de incio de sesion con un JFrame(marco) y todos sus elementos
 **/
public class Inicio_De_Sesion extends JFrame implements ActionListener,KeyListener{
    
    
/**
 * Codigo para las imagenes
 **/
	Icon Ent = new ImageIcon("accept.png"); //Asi se colocan las imagenes
	Icon Sal = new ImageIcon("nooki.png");
        
        /**
         * se crea el texto del formulario de las ventanas 
         **/


	JLabel lblUsuario=new JLabel ("Usuario");
	JLabel lblContraseña=new JLabel ("Contraseña");

	JTextField txtUsuario=new JTextField();
	JPasswordField txtContraseña=new JPasswordField();

	JButton btnSalir=new JButton(Sal);
	JButton btnAceptar=new JButton(Ent);
        
        /**
         * Se crea el constructor donde se le ponen todas las propiedades a los JLabel, JButton, JTextField...
         **/

 public Inicio_De_Sesion() {

     /**
      * Nombre que se le da a la ventana 
      **/
     setTitle("Mercado de Vinos  - Inicio de sesión**");
     /**
      * para obtener todo lo que hay en la ventana 
      **/
     getContentPane().setLayout(null);
     /**
      * tamaño de la ventana
      **/
     setSize(300,250);
     /**para que no se pueda modificar la ventana
      * 
      **/
     setResizable(false);
     /**Coloco fondo ala ventana
      * 
      **/
     setBackground(Color.white);
      /**
       * Con esta opcion hago visible la ventana
       **/
     setVisible(true);
     /**Para que el formulario se quede en el centro 
      * 
      **/
     setLocationRelativeTo(null); 
     
     /**
      * Se crean los JLabel, JTextfield, JPasswordfield, JButton y JComboBox, las coordenas en el Frame y 
      * con que nombre se haran visibles
      **/

     lblUsuario.setForeground(java.awt.Color.black);
     lblContraseña.setForeground(java.awt.Color.black);

     lblUsuario.setBounds(30,30,100,20);
     txtUsuario.setBounds(100,30,100,30);
     txtUsuario.addKeyListener(this);



     lblContraseña.setBounds(30,90,100,30);
     txtContraseña.setBounds(100,90,100,30);
     txtContraseña.addKeyListener(this);

     btnAceptar.setBounds(30,150,120,30);
     btnSalir.setBounds(160,150,120,30);

	 btnSalir.setText("Salir");
	 btnAceptar.setText("Aceptar");
         
         
/**
 * Para addcionar los objetos al formulario
 **/
     this.getContentPane().add(lblUsuario);
     this.getContentPane().add(lblContraseña);
     this.getContentPane().add(txtUsuario);
     this.getContentPane().add(txtContraseña);
     this.getContentPane().add(btnSalir);
     this.getContentPane().add(btnAceptar);
     
     /**
      * Para hacer visibles los objetos 
      **/

     lblUsuario.setVisible(true);
     lblContraseña.setVisible(true);
     txtUsuario.setVisible(true);
     txtContraseña.setVisible(true);
     btnSalir.setVisible(true);
     btnAceptar.setVisible(true);

	 btnAceptar.addActionListener(this);
	 btnSalir.addActionListener(this);



   	this.repaint();

 		}

 /**
  * Se crea el KeyPressed ya que solo se utiliza un solo usuario y contraseña.
  **/
	 public void keyPressed(KeyEvent Even){

	 }
	 public void keyTyped(KeyEvent Even){
		char val=Even.getKeyChar();
	 	int tecla = (int)val;
	 	if(Even.getSource()==txtUsuario){
	 		if(tecla==10){
	 			Ingreso();
	 		}
	 	}
	 	if(Even.getSource()==txtContraseña){
	 		if(tecla==10){
	 			Ingreso();
	 		}
	 	}
	 }
 public void keyReleased(KeyEvent Even){

 }
 
 /**
  * Se asigna un usuario y una contraseña 
  * @param event 
  **/


   public void actionPerformed(ActionEvent event)
   {

	   	String nombre[]={"mervi"};
	   	String clave[]={"1400"};

	   	if(event.getSource()==btnSalir)
	   		{
	   		System.exit(0);
	   		}

	   		if(event.getSource()==btnAceptar){

   				Ingreso();
  			}
   }
/**
 * Se valida el ingeso del usuario y la contraseña si esta icorrecta o los campos estan vacios 
 **/
  		public void Ingreso(){

	   		if(txtUsuario.getText().equals("")&&txtContraseña.getText().equals(""))
	   			{
	   			JOptionPane.showMessageDialog(null,"Los Campos estan vacios");
	   			}
	   		  	else
				{
				if(txtUsuario.getText().equals("mervi")&&txtContraseña.getText().equals("1400"))
				{
				Menu_Principal Menu =new Menu_Principal();
				this.dispose();
				}
				else
				{
				JOptionPane.showMessageDialog(null,"Usuario y/o contraseña invalidos");
				}



			}

			}
}




