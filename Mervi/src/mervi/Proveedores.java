/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mervi;


/**
 *
 * @author Valentina Castrillon Gomez- Laura Cristina Marin Velez 
 * Fecha: creada mayo 23/2015
 * esta es la clase se crea el formulario de proveedores  
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
import javax.swing.table.DefaultTableModel;

/**
 * Se crea la clase de proveedores  con un JFrame(marco) y todos sus elementos
 **/

public class Proveedores extends JFrame implements ActionListener,KeyListener{

    
    /**Codigo para las imagenes
     * 
     **/

	Icon Ent = new ImageIcon("crear.jpg"); 
	Icon Bus = new ImageIcon("buscar.jpg"); 
	Icon Act = new ImageIcon("actualizar.jpg"); 
	Icon des = new ImageIcon("deshabilitar.jpg");
        
        /**
         * Declarar los objetos de Jlabel, jtextfield, Jpasswordfield, RadioButton  y JComboBox
         **/
        

	JLabel lblMensaje,lblTipodeidentificacion, lblNumerodeidentificacion, lblNombre,
	lblApellido, lblNombredeusuario, lblContraseña, lblTelefono,
	lblCelular, lblDireccion, lblEmail, lblGenero, lblBarrio, lblEstado,
	lblFechadenacimiento, lblFechadeingreso, lblOcupacion, lblDia, lblMes, lblAño, lblDia2, lblMes2, lblAño2;

	JTextField txtNumerodeidentificacion, txtNombre, txtApellido, txtNombredeusuario,
	txtTelefono, txtCelular, txtDireccion, txtEmail, txtBarrio,txtOcupacion;

	JPasswordField txtContraseña;
	JRadioButton JrMasculino,JrFemenino;
	ButtonGroup Genero;
	JButton Crear, Buscar, Actualizar, Eliminar;
        
/**
 * crear tabla
 */
	JTable TablaProveedores; 
        /**
         *Modelo tabla
         **/
	DefaultTableModel dtm; 
        /**
         *panel para la tabla
         */
	JScrollPane tablapanel; 
        /**
         *estructura interna de la tabla
         */
	Object [][] datos = new Object [1][20];
	Object [] Columnas = {"Nombre","Apellido","Numerodeidentificacion","Tipodeidentificacion",
							 "Nombredeusuario", "Telefono","Celular", "Direccion", "Email", "Genero",
							  "Barrio", "Estado","Dia", "Mes", "Año","Ocupacion",  "Dia2", "Mes2", "Año2"}; //Numero de columnas

	String Mat[][];
	int i=0;
	int numReg=0;
	String Dia1,Mes1,Año1;


	JComboBox CoTipodeidentificacion, CoEstado, CoDia, CoMes, CoAño, CoDia2, CoMes2, CoAño2;
        
        /**
         * Se crea el constructor donde se le ponen todas las propiedades a los JLabel, JButton, JTextField...
         */

	 public Proveedores() {
	    super("Mercado de Vinos - Proveedores");
	    setSize(1230,600);
	    setResizable(false);
	    setBackground(Color.white);
	    setVisible(true);
	    setLocationRelativeTo(null);//PA Q SE PONGA EN LA MITAD
	    setLayout(null);


		/**
                 * Se crea el tamaño y ubicacion de los JLabel que se declararon 
                 */
		Mat= new String	[100] [20];

		lblMensaje= new JLabel("Los campos que contengan * se deben llenar obligatoriamente");
	    lblMensaje.setBounds(20,260,400,25);
	    getContentPane().add(lblMensaje);


	    lblNombre = new JLabel("*Nombre");
	    lblNombre.setBounds(20,20,70,25);
	    getContentPane().add(lblNombre);

	    lblApellido = new JLabel("*Apellido");
	    lblApellido.setBounds(20,50,70,25);
	    getContentPane().add(lblApellido);

	    lblTipodeidentificacion = new JLabel("Tipo de identificación");
	    lblTipodeidentificacion.setBounds(20,110,160,25);
	    getContentPane().add(lblTipodeidentificacion);

	    lblNumerodeidentificacion = new JLabel("*Numero de identificación");
	    lblNumerodeidentificacion.setBounds(20,80,160,25);
	    getContentPane().add(lblNumerodeidentificacion);

	    lblNombredeusuario = new JLabel("*Nombre de usuario");
	    lblNombredeusuario.setBounds(20,140,120,25);
	    getContentPane().add(lblNombredeusuario);


	    lblContraseña = new JLabel("Contraseña");
	    lblContraseña.setBounds(20,170,70,25);
	    getContentPane().add(lblContraseña);

	    lblTelefono = new JLabel("Telefono");
	    lblTelefono.setBounds(20,200,70,25);
	    getContentPane().add(lblTelefono);

	    lblCelular = new JLabel("Celular");
	    lblCelular.setBounds(20,230,70,25);
	    getContentPane().add(lblCelular);

	    lblDireccion = new JLabel("Dirección");
	    lblDireccion.setBounds(420,20,70,25);
	    getContentPane().add(lblDireccion);

	    lblEmail = new JLabel("Email");
	    lblEmail.setBounds(420,50,70,25);
	    getContentPane().add(lblEmail);

	    lblGenero = new JLabel("*Género");
	    lblGenero.setBounds(420,80,70,25);
	    getContentPane().add(lblGenero);

	   	lblBarrio = new JLabel("Barrio");
	    lblBarrio.setBounds(420,110,70,25);
	    getContentPane().add(lblBarrio);

	    lblEstado = new JLabel("*Estado");
	    lblEstado.setBounds(420,140,70,25);
	    getContentPane().add(lblEstado);


	    lblFechadeingreso = new JLabel("Fecha de ingreso:");
	    lblFechadeingreso.setBounds(420,170,120,25);
	    getContentPane().add(lblFechadeingreso);

	    lblOcupacion = new JLabel("Ocupación");
	    lblOcupacion.setBounds(420,200,70,25);
	    getContentPane().add(lblOcupacion);

		lblFechadenacimiento = new JLabel("Fecha de nacimiento:");
	    lblFechadenacimiento.setBounds(420,230,250,25);
	    getContentPane().add(lblFechadenacimiento);

	    lblDia = new JLabel("Día");
	    lblDia.setBounds(550,230,70,25);
	    getContentPane().add(lblDia);

	    lblMes = new JLabel("Mes");
	    lblMes.setBounds(650,230,70,25);
	    getContentPane().add(lblMes);

	    lblAño = new JLabel("Año");
	    lblAño.setBounds(800,230,70,25);
	    getContentPane().add(lblAño);

	    lblDia2=new JLabel("Día");
	    lblDia2.setBounds(550,170,70,25);
	    getContentPane().add(lblDia2);

	    lblMes2=new JLabel("Mes");
	    lblMes2.setBounds(650,170,70,25);
	    getContentPane().add(lblMes2);

	    lblAño2=new JLabel("Año");
	    lblAño2.setBounds(800,170,70,25);
	    getContentPane().add(lblAño2);




	/**
                 * Se crea el tamaño y ubicacion de los JTextField(cuadros de texto)  que se declararon 
                 */

	 	txtNumerodeidentificacion = new JTextField();
	    txtNumerodeidentificacion.setBounds(170,80,200,25);
	    getContentPane().add(txtNumerodeidentificacion);

	    txtNombre = new JTextField();
	    txtNombre.setBounds(170,20,200,25);
	    getContentPane().add(txtNombre);

		txtApellido = new JTextField();
	    txtApellido.setBounds(170,50,200,25);
	    getContentPane().add(txtApellido);


	    txtNombredeusuario = new JTextField();
	    txtNombredeusuario.setBounds(170,140,200,25);
	    getContentPane().add(txtNombredeusuario);

	    txtContraseña = new JPasswordField();
	    txtContraseña.setBounds(170,170,200,25);
	    getContentPane().add(txtContraseña);

	    txtTelefono = new JTextField();
	    txtTelefono.setBounds(170,200,200,25);
	    getContentPane().add(txtTelefono);

	    txtCelular = new JTextField();
	    txtCelular.setBounds(170,230,200,25);
	    getContentPane().add(txtCelular);

	    txtDireccion = new JTextField();
	    txtDireccion.setBounds(500,20,200,25);
	    getContentPane().add(txtDireccion);

	    txtEmail = new JTextField();
	    txtEmail.setBounds(500,50,200,25);
	    getContentPane().add(txtEmail);

	    txtBarrio = new JTextField();
	    txtBarrio.setBounds(500,110,200,25);
	    getContentPane().add(txtBarrio);

	    txtOcupacion = new JTextField();
	    txtOcupacion.setBounds(500,200,200,25);
	    getContentPane().add(txtOcupacion);




            /**
             * Se Crean los JRadioButton 
             */
		

	    JrMasculino = new JRadioButton("Hombre");
	    JrMasculino.setBounds(500,80,70,25);
	    getContentPane().add(JrMasculino);

	    JrFemenino = new JRadioButton("Mujer");
	    JrFemenino.setBounds(580,80,70,25);
	    getContentPane().add(JrFemenino);


	    Genero = new ButtonGroup();
	    Genero.add(JrFemenino);
	    Genero.add(JrMasculino);






	    /**
            * Se crean las listas desplegables, con su ubicacion  y tamaño 
            */

	    CoTipodeidentificacion = new JComboBox();
	    CoTipodeidentificacion.setBounds(170,110,120,25);
	    
	    CoTipodeidentificacion.addItem("CC");
	    getContentPane().add(CoTipodeidentificacion);


	    CoEstado = new JComboBox();
	    CoEstado.setBounds(500,140,120,25);
	    CoEstado.addItem("Activo");
	    CoEstado.addItem("Inactivo");
	    getContentPane().add(CoEstado);

	    CoDia= new JComboBox();
	    CoDia.setBounds(585,230,40,25);
	    getContentPane().add(CoDia);

	    CoMes = new JComboBox();
	    CoMes.setBounds(680,230,100,25);
	    CoMes.addItem("Enero");
	    CoMes.addItem("Febrero");
	    CoMes.addItem("Marzo");
	    CoMes.addItem("Abril");
	    CoMes.addItem("Mayo");
	    CoMes.addItem("Junio");
	    CoMes.addItem("Julio");
	    CoMes.addItem("Agosto");
	    CoMes.addItem("Septiembre");
	    CoMes.addItem("Octubre");
	    CoMes.addItem("Noviembre");
	    CoMes.addItem("Diciembre");
	    getContentPane().add(CoMes);

	    CoAño = new JComboBox();
	    CoAño.setBounds(830,230,70,25);
	    getContentPane().add(CoAño);

	    CoDia2= new JComboBox();
	    CoDia2.setBounds(585,170,40,25);
	    LlenarDias();
	    getContentPane().add(CoDia2);

	    CoMes2 = new JComboBox();
	    CoMes2.setBounds(680,170,100,25);
	    CoMes2.addItem("Enero");
	    CoMes2.addItem("Febrero");
	    CoMes2.addItem("Marzo");
	    CoMes2.addItem("Abril");
	    CoMes2.addItem("Mayo");
	    CoMes2.addItem("Junio");
	    CoMes2.addItem("Julio");
	    CoMes2.addItem("Agosto");
	    CoMes2.addItem("Septiembre");
	    CoMes2.addItem("Octubre");
	    CoMes2.addItem("Noviembre");
	    CoMes2.addItem("Diciembre");
	    getContentPane().add(CoMes2);

	    CoAño2 = new JComboBox();
	    CoAño2.setBounds(830,170,70,25);
	    getContentPane().add(CoAño2);
		    LlenarAños();


	    /**
             * se cran los botones con sus dimensiones y ubicacion en la ventana 
             */
		Crear= new JButton(Ent);
		Crear.setText("Crear");
		Crear.setBounds(100,500,120,30);//x,y,ancho,largo
		getContentPane().add(Crear);
		Crear.addActionListener(this);

		Buscar= new JButton(Bus);
		Buscar.setText("Buscar");
		Buscar.setBounds(400,500,150,30);//x,y,ancho,largo
		getContentPane().add(Buscar);
		Buscar.addActionListener(this);

		Actualizar= new JButton(Act);
		Actualizar.setText("Actualizar");
		Actualizar.setBounds(700,500,190,30);//x,y,ancho,largo
		getContentPane().add(Actualizar);
		Actualizar.addActionListener(this);
		Actualizar.setEnabled(false);


		Eliminar= new JButton(des);
		Eliminar.setText("Deshabilitar");
		Eliminar.setBounds(1000,500,150,30);//x,y,ancho,largo
		getContentPane().add(Eliminar);
		Eliminar.addActionListener(this);
		Eliminar.setEnabled(false);

		dtm = new DefaultTableModel(datos,Columnas);// forma de la tabla
		TablaProveedores = new JTable(dtm); // indican el modelo de la tabla
		tablapanel = new JScrollPane(TablaProveedores);

		TablaProveedores. setModel(dtm);
		tablapanel.setBounds(10,310,1200,300);
		tablapanel.setVisible(true);
		tablapanel.setEnabled(false);
		getContentPane().add(tablapanel);

		txtNombre.addKeyListener(this);
		txtApellido.addKeyListener(this);
		txtOcupacion.addKeyListener(this);
		txtTelefono.addKeyListener(this);
		txtCelular.addKeyListener(this);
		txtNumerodeidentificacion.addKeyListener(this);


		this.repaint();

		 }

    public void actionPerformed(ActionEvent event)
   	{
		if(event.getSource()==Crear){  //Crear
			String Sexo="",Fecha;

			if(JrFemenino.isSelected()){
				Sexo="Femenino";
			}if(JrMasculino.isSelected()){
				Sexo="Masculino";
			}

			if(txtNumerodeidentificacion.getText().equals("")||txtNombre.getText().equals("")
				||txtApellido.getText().equals("")||txtNombredeusuario.getText().equals("")||Sexo.equals(""))
			{
					JOptionPane.showMessageDialog(this,"No pueden haber campos vacios");
			}else{
				if(Verificar()){
					JOptionPane.showMessageDialog(null,"Ya existe el usuario");
				}else{

                                    /**
                                     * Ubicacion de los datos en la Matriz 
                                     */


			Mat[i][0]=txtNombre.getText();
			Mat[i][1]=txtApellido.getText();
			Mat[i][2]=txtNumerodeidentificacion.getText();		//ASI SE LLENAN LOS CUADROS DE TEXTO
			Mat[i][3]=(String)CoTipodeidentificacion.getSelectedItem().toString();
			Mat[i][4]=txtNombredeusuario.getText();
			Mat[i][5]=txtTelefono.getText();
			Mat[i][6]=txtCelular.getText();
			Mat[i][7]=txtDireccion.getText();
			Mat[i][8]=txtEmail.getText();
			Mat[i][9]=Sexo;
			Mat[i][10]=txtBarrio.getText();//ASI SE LLENAN  UN COMBOBOX

			Mat[i][11]=(String)CoEstado.getSelectedItem().toString();
			Mat[i][12]=(String)CoDia.getSelectedItem().toString();
			Mat[i][13]=(String)CoMes.getSelectedItem().toString();
			Mat[i][14]=(String)CoAño.getSelectedItem().toString();
			Mat[i][15]=txtOcupacion.getText();

			Mat[i][16]=(String)CoDia2.getSelectedItem().toString();
			Mat[i][17]=(String)CoMes2.getSelectedItem().toString();
			Mat[i][18]=(String)CoAño2.getSelectedItem().toString();


			numReg++;
			i++;

                        /*
                         * Limpiar los cuadros de texto al guardar la informacion en la matriz 
                         */
			Limpiar();
			JOptionPane.showMessageDialog(this,"Datos Guardados con exito");

			LlenarTabla(Mat,i);
			Crear.setEnabled(true);
			}	}
		}
                /**
                 * Boton Buscar 
                 */

		if(event.getSource()==Buscar){ 
			Buscar();

		}
			if(event.getSource()==Eliminar){
				eliminar();
				Limpiar();
				Crear.setEnabled(true);
				Eliminar.setEnabled(false);
				Actualizar.setEnabled(false);
			}
                        /**
                         * Boton Actualizar 
                         */

		    if(event.getSource()==Actualizar) //comienza actualizar
	{
	if(Verificar())
	{
			int i=VerificarFila();
                        
                        

/*
 * la tabla de proveedores y los set 
 */
            TablaProveedores.setValueAt(txtNombre.getText(),i,0);
            TablaProveedores.setValueAt(txtApellido.getText(),i,1);
            TablaProveedores.setValueAt(txtNumerodeidentificacion.getText(),i,2);
            TablaProveedores.setValueAt(CoTipodeidentificacion.getSelectedItem(),i,3);
            TablaProveedores.setValueAt(txtTelefono.getText(),i,4);
           TablaProveedores.setValueAt(txtCelular.getText(),i,5);
            TablaProveedores.setValueAt(txtDireccion.getText(),i,6);
            TablaProveedores.setValueAt(txtEmail.getText(),i,7);
	        TablaProveedores.setValueAt(txtBarrio.getText(),i,9);
	        TablaProveedores.setValueAt(CoEstado.getSelectedItem(),i,10);
	        TablaProveedores.setValueAt(txtOcupacion.getText(),i,14);

/**
 * si se guardan corretamente se muestra el mensaje 
 */


	JOptionPane.showMessageDialog(null,"Los datos se han modificado sactisfactoriamente");
	}
else
	{
	JOptionPane.showMessageDialog(null,"No se pudo modificar la clave");
    }


  }

   	}

   	public void LlenarDias(){
   		int k;
   		for(k=1;k<=31;k++){
   			CoDia.addItem(k);
   			CoDia2.addItem(k);
   		}
   	}

   	public void LlenarAños(){
   		for(int k=2012;k>=1905;k--){
   			CoAño.addItem(k);
   			CoAño2.addItem(k);
   		}
   	}

   	public void LlenarTabla(String mat[][],int i){
   		int k;
   		int j;
   		Object [][] datos = new Object [i][20];//estructura interna de la tabal
   		for(j=0;j<i;j++){

   		for (k = 0; k<19; k++) {
   			datos[j][k]= mat[j][k];
   			dtm = new DefaultTableModel(datos,Columnas);
   			TablaProveedores.setModel(dtm);
   		}
   		}

   	}
        /**
         * Para validar si se ingresan letras o numeros 
         * @param e 
         */

   	public void keyTyped(KeyEvent e) {
        //System.out.println("tiped");
        char caracter = e.getKeyChar(); // para leer el caracter correspondiente a la tecla
        int numero = (int) (caracter);
     if (e.getSource() == txtNombre) {
			if (Character.isDigit(caracter) == true)
                        {
                 	e.consume();

                 }
    }
    if (e.getSource() == txtApellido) {
			if (Character.isDigit(caracter) == true)
                        {
                 	e.consume();

                 }
    }
    if (e.getSource() == txtOcupacion) {
			if (Character.isDigit(caracter) == true)
                        {
                 	e.consume();

                 }
    }

    if (e.getSource() == txtTelefono) {
			if (((caracter < '0') || (caracter > '9')) )
                        {
					e.consume();

                 }
    }

    if (e.getSource() == txtCelular) {
			if (((caracter < '0') || (caracter > '9')) )
                        {
					e.consume();

                 }
    }

    if (e.getSource() == txtNumerodeidentificacion) {
			if (((caracter < '0') || (caracter > '9')) )
                        {
					e.consume();

                 }
    }



   	}

    public void keyPressed(KeyEvent e) {
    }

    public void keyReleased(KeyEvent e) {
    }

   	public static void main (String[] args) {
   		Proveedores pv = new Proveedores();
	}
/**
 * Se busca por el documento de proveedor 
 */
	public void Buscar(){ // Aqui empieza el buscar
		String Doc,Sexo;
		int z=0;
		Doc= JOptionPane.showInputDialog("Ingrese el documento a buscar");
		while(z<TablaProveedores.getRowCount() && !TablaProveedores.getValueAt(z,2).toString().equals(Doc)){
			z++;
		}
		if(z<i){
			txtNombre.setText(TablaProveedores.getValueAt(z,0).toString());
			txtApellido.setText(TablaProveedores.getValueAt(z,1).toString());
			txtNumerodeidentificacion.setText(TablaProveedores.getValueAt(z,2).toString());
			CoTipodeidentificacion.setSelectedItem(TablaProveedores.getValueAt(z,3).toString());
			txtNombredeusuario.setText(TablaProveedores.getValueAt(z,4).toString());
			txtTelefono.setText(TablaProveedores.getValueAt(z,5).toString());

			txtCelular.setText(TablaProveedores.getValueAt(z,6).toString());
			txtDireccion.setText(TablaProveedores.getValueAt(z,7).toString());//ESTTO ES ESTO
			txtEmail.setText(Mat[z][8]);//TERMINAR DE HACER ESTO
			txtBarrio.setText(Mat[z][10]);

			CoEstado.setSelectedItem(Mat[z][11]);
			CoDia.setSelectedItem(Integer.parseInt(Mat[z][12]));
			CoMes.setSelectedItem(Mat[z][13]);
			CoAño.setSelectedItem(Integer.parseInt(Mat[z][14]));
			txtOcupacion.setText(Mat[z][15]);
			CoDia2.setSelectedItem(Integer.parseInt(Mat[z][16]));
			CoMes2.setSelectedItem(Mat[z][17]);
			CoAño2.setSelectedItem(Integer.parseInt(Mat[z][18]));

			Sexo=Mat[z][9];
			if(Sexo=="Masculino"){
				JrMasculino.doClick();
			}
			if(Sexo=="Femenino"){
				JrFemenino.doClick();
			}
			//ACUERDESE DE HACE LO ANTERIOR

			Crear.setEnabled(false);
			Actualizar.setEnabled(true);
			Eliminar.setEnabled(true);

		}else{
			JOptionPane.showMessageDialog(null,"No se encontro");
			Crear.setEnabled(true);
		}
	}

	public boolean Verificar(){
		String Ver;
		int z=0;
		boolean res;
		Ver=txtNumerodeidentificacion.getText();
		while(z<i  && !Ver.equals(Mat[z][2])){
			z++;
		}
		if(z<i){
			res=true;
		}else{
			res=false;
		}
		return res;

	}

	public int VerificarFila(){
		String Ver;
		int z=0;
		boolean res;
		Ver=txtNumerodeidentificacion.getText();
		while(z<i  && !Ver.equals(Mat[z][2])){
			z++;
		}
		return z;

	}

	public void eliminar(){ // Este es el deshabilitar
		for(int w=0;w<TablaProveedores.getRowCount();w++)
  				{
  					if(TablaProveedores.getValueAt(w,2).toString().equals(txtNumerodeidentificacion.getText()))
  					{
  						dtm.removeRow(w);
  					}
  				}


	}

	public void Limpiar(){
		txtNumerodeidentificacion.setText("");
			txtNombre.setText("");
			txtApellido.setText("");
			txtNombredeusuario.setText("");
			txtTelefono.setText("");
			txtCelular.setText("");
			txtDireccion.setText("");
			txtEmail.setText("");
			txtBarrio.setText("");
			txtOcupacion.setText("");
			txtContraseña.setText("");

			CoTipodeidentificacion.setSelectedIndex(0);
			CoEstado.setSelectedIndex(0);
			CoDia.setSelectedIndex(0);
			CoMes.setSelectedIndex(0);
			CoAño.setSelectedIndex(0);
			CoDia2.setSelectedIndex(0);
			CoMes2.setSelectedIndex(0);
			CoAño2.setSelectedIndex(0);

			Genero.clearSelection();
	}



}








