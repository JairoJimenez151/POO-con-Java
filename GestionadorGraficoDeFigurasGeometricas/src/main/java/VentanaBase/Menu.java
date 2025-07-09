package VentanaBase;

import BuscadorArchivos.ElegirArchivoTxt;
import Componentes.Boton;
import javax.swing.*;
import static Funcionalidades.Medidas.USP;
import static Funcionalidades.Creacion.*;
import static Funcionalidades.Visualizacion.*;
import static Funcionalidades.Modificacion.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;

        
public class Menu  extends JFrame{
    
    private Boton[] botones;
    private JPanel panelPrincipal;
    private JPanel panelControl;
    private JLabel ruta;
    private ElegirArchivoTxt selector;
    public Menu(){
        ///Definiendo ventana
        setSize(30*USP, 28*USP);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setUndecorated(true);   
        setLocationRelativeTo(null);
        this.botones = new Boton[6];
        this.panelPrincipal = new JPanel();
        this.panelControl = new JPanel();
        this.ruta = new JLabel();
        this.selector = new ElegirArchivoTxt();
        initComponet();
    }
   private void initComponet(){

      ///////////////////////////////////////////////////
      panelPrincipal.setLayout(null); //Desactivo para organizar yo mismo la diistriibuccion de los componentes
      initPanelControl();
      initRuta();
      initBotones();     
//      panelPrincipal.setBackground(Color.blue);
      panelPrincipal.setOpaque(true);
      add(panelPrincipal); //Agrego panelPrincipal a la ventana
   }
   
   private void initBotones(){
       String nombreBotones[] = {"Cargar archivo","Imprimir","Actualizar","Buscar","Eliminar","Salir"}; //Nombre de cada boton
       Dimension dimensionBoton = new Dimension(8*USP, 2*USP);
       for(int i = 0; i <this.botones.length; i++){
           botones[i] = new Boton(nombreBotones[i],dimensionBoton);
       }
       ////////////////Defino las acciones particulares de cada boton
       botones[0].addMouseListener(new MouseAdapter(){  //Carga
           @Override
           public void mousePressed(MouseEvent e){
               String RUTA = selector.seleccionarArchivoTxt();
               doCrearFiguras(RUTA);
               ruta.setText(RUTA);
           }
       });
       botones[1].addMouseListener(new MouseAdapter(){  ///Impresion
           @Override
           public void mousePressed(MouseEvent e){
               JTextArea texto = new JTextArea();
               texto.setEditable(false);
               texto.setLineWrap(true);             // Habilita el salto de línea automático
               texto.setWrapStyleWord(true);       // Corta el texto por palabras completas, no por letras
               for (int i = 0; i < figuras.size(); i++) {
                    texto.append(figuras.get(i).toString()+"\n");
               }
               JScrollPane scroll = new JScrollPane(texto);
               scroll.setSize(panelControl.getWidth(), panelControl.getHeight());
               panelControl.removeAll();//Limpio el panel
               panelControl.setLayout(new BorderLayout());
               panelControl.add(scroll,BorderLayout.CENTER);
               panelControl.revalidate();
               panelControl.repaint();
               
               texto.setCaretPosition(0);
           }
       });      
       botones[2].addMouseListener(new MouseAdapter(){  //Actualiza
           @Override
           public void mousePressed(MouseEvent e){
               panelControl.removeAll();
               panelControl.setLayout(null);
                JLabel IDintroducido = new JLabel("ID: ");/// 
               IDintroducido.setBounds(2*USP, 2*USP, 3*USP, 2*USP);
               JLabel aviso = new JLabel("ENTER para continuar");///
               aviso.setBounds(7*USP, 5*USP, 7*USP, USP);
               JTextArea vista = new JTextArea();///
               vista.setBounds(2*USP, 8*USP, 12*USP, 3*USP);
               JTextField barraBusqueda = new JTextField(); ///////////////
               barraBusqueda.setBounds(7*USP, 2*USP, 7*USP, 2*USP); 
               barraBusqueda.addKeyListener(new KeyAdapter(){ 
                   @Override
                   public void keyPressed(KeyEvent t){
                       if(t.getKeyCode() == KeyEvent.VK_ENTER){
                           if(!barraBusqueda.getText().equals("") ){
                                vista.setText(doMostrarInfo(barraBusqueda.getText())); 
                                if(!vista.getText().equals("Figura no encontrada") || !vista.equals("Digite un ID")){
                                    doModificarDatosFigura(getPosicionFigura(barraBusqueda.getText()),getPanelControl(), vista);
                                   
                                }                             
                           }
                                else{ vista.setText("Digite un ID");}
                       }
                   }
               });
               
               panelControl.add(IDintroducido);
               panelControl.add(aviso);
               panelControl.add(barraBusqueda);
               panelControl.add(vista);
               panelControl.revalidate();
               panelControl.repaint();
           }
       });
       botones[3].addMouseListener(new MouseAdapter(){  ///Buscar
           @Override
           public void mousePressed(MouseEvent e){
               panelControl.removeAll();
               panelControl.setLayout(null);
               JLabel IDintroducido = new JLabel("ID: ");/// 
               IDintroducido.setBounds(2*USP, 2*USP, 3*USP, 2*USP);
               JLabel aviso = new JLabel("ENTER para continuar");///
               aviso.setBounds(7*USP, 5*USP, 7*USP, USP);
               JTextArea vista = new JTextArea();///
               vista.setBounds(2*USP, 9*USP, 12*USP, 5*USP);
               JTextField barraBusqueda = new JTextField(); ///////////////
               barraBusqueda.setBounds(7*USP, 2*USP, 7*USP, 2*USP);
               barraBusqueda.addKeyListener(new KeyAdapter(){ 
                   @Override
                   public void keyPressed(KeyEvent t){
                       if(t.getKeyCode() == KeyEvent.VK_ENTER)
                           if(!barraBusqueda.getText().equals(""))
                                vista.setText(doMostrarInfo(barraBusqueda.getText()));
                           else vista.setText("Digite un ID");
                   }
               });

               panelControl.add(IDintroducido);
               panelControl.add(aviso);
               panelControl.add(barraBusqueda);
               panelControl.add(vista);
               panelControl.revalidate();
               panelControl.repaint();
           }
       });
       botones[4].addMouseListener(new MouseAdapter(){  //Eliminar
           @Override
           public void mousePressed(MouseEvent e){
               panelControl.removeAll();
               panelControl.setLayout(null);
               JLabel IDintroducido = new JLabel("ID: ");/// 
               IDintroducido.setBounds(2*USP, 2*USP, 3*USP, 2*USP);
               JLabel aviso = new JLabel("ENTER para continuar");///
               aviso.setBounds(7*USP, 5*USP, 7*USP, USP);
               JTextArea vista = new JTextArea();///
               vista.setBounds(2*USP, 9*USP, 12*USP, 5*USP);
               JTextField barraBusqueda = new JTextField(); ///////////////
               barraBusqueda.setBounds(7*USP, 2*USP, 7*USP, 2*USP);
               barraBusqueda.addKeyListener(new KeyAdapter(){ 
                   @Override
                   public void keyPressed(KeyEvent t){
                       if(t.getKeyCode() == KeyEvent.VK_ENTER)
                           if(!barraBusqueda.getText().equals(""))
                                vista.setText(doMostrarInfo(barraBusqueda.getText()));
                           else vista.setText("Digite un ID");
                   }
               });
               Boton borrar = new Boton("Eliminar",new Dimension(9*USP, 2*USP));
               borrar.setLocation(5*USP, 17*USP);
               borrar.addMouseListener(new MouseAdapter(){
                    @Override
                    public void  mousePressed(MouseEvent e) {
                        if(!vista.getText().equals("") || !vista.getText().equals("Figura no encontrada") || !vista.equals("Digite un ID"))
                            figuras.remove(getPosicionFigura(barraBusqueda.getText()));
                       
                        vista.setText("Figura Eliminada");
                    }
               });
               panelControl.add(IDintroducido);
               panelControl.add(aviso);
               panelControl.add(barraBusqueda);
               panelControl.add(vista);
               panelControl.add(borrar);
               panelControl.revalidate();
               panelControl.repaint();
           }
       });
       
       botones[5].addMouseListener(new MouseAdapter(){  //Salir
           @Override
           public void mousePressed(MouseEvent e){
               System.exit(0);
           }
       });
       //////////////Boton de Guardado
       Boton Guardar = new Boton("\u21E9", new Dimension(2*USP,2*USP));
       Guardar.setLocation(9*USP, 2*USP);
       Guardar.addMouseListener(new MouseAdapter() {
           @Override
           public void mousePressed(MouseEvent e){
  
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(ruta.getText(), false))) {
            for (int i = 0; i < figuras.size(); i++) {
                escritor.write(figuras.get(i).toString());
                escritor.flush(); // Asegura que todo se escriba en disco
            }
        } catch (IOException f) {
            f.printStackTrace();
        }
    }
       });
       for (int i = 0; i< botones.length;i++) {
           //Ubico los botones
           botones[i].setLocation(USP, USP*(2+4*i));
           panelPrincipal.add(botones[i]);
       }
       panelPrincipal.add(Guardar);
   }   
   private void initPanelControl(){
       panelControl.setBounds(12*USP, 2*USP,16*USP, 22*USP);
       //panelControl.setBackground(Color.GREEN);
       panelControl.setOpaque(true);
       panelPrincipal.add(panelControl);
   }
   private void initRuta(){
       ruta.setBounds(0, 26*USP, 30*USP, 2*USP);
       ruta.setText("RUTA NULA");
       ruta.setFocusable(true);
       ruta.setBackground(Color.red);
       ruta.setOpaque(true);
       panelPrincipal.add(ruta);
   }
/////////////////////////////////////////////
    /// @return /
    public Boton[] getBotones() {
        return botones;
    }

    public void setBotones(Boton[] botones) {
        this.botones = botones;
    }

    public JPanel getPanelPrincipal() {
        return panelPrincipal;
    }

    public void setPanelPrincipal(JPanel panelPrincipal) {
        this.panelPrincipal = panelPrincipal;
    }

    public JPanel getPanelControl() {
        return panelControl;
    }

    public void setPanelControl(JPanel panelControl) {
        this.panelControl = panelControl;
    }

    public JLabel getRuta() {
        return ruta;
    }

    public void setRuta(JLabel ruta) {
        this.ruta = ruta;
    }

    public ElegirArchivoTxt getSelector() {
        return selector;
    }

    public void setSelector(ElegirArchivoTxt selector) {
        this.selector = selector;
    }
}
