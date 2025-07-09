package GUI;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import javax.swing.JButton;

public class APP {
   public static void main(String[] args) {
       JFrame ventana = new JFrame("Barbaro");
       JPanel panel = new JPanel();
       ventana.setSize(700, 700);
       //ventana.setLayout(null);
       ventana.setLocationRelativeTo(null);
       ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);      
       panel.setLayout(null);
       
//       
       Boton boton = new Boton();
       panel.add(boton);
       ventana.add(panel);
       ventana.setVisible(true); 
   }
   
   
}
class Boton extends JButton{

    public Boton() {
        super();
        this.setText("Jairo");
        this.setBounds(100,100,100,25);
        configuracion();
    }

    private void configuracion() {
        this.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                System.exit(0);
            }
        });
    }
    
}