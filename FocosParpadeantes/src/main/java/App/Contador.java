
package App;
import java.awt.Color;
import javax.swing.JPanel;


public class Contador extends JPanel implements Runnable {
    private volatile boolean corriendo = false;
    private final int retardo;
    private Thread hilo;
    private Color colorActual = Color.BLACK;

    public Contador(int retardo) {
        this.retardo = retardo;
        setBackground(colorActual);
    }

    public void iniciar() {
        if (hilo == null || !hilo.isAlive()) {
            corriendo = true;
            hilo = new Thread(this);
            hilo.start();
        }
    }

    public void reiniciar() {
        corriendo = false;
        colorActual = Color.BLACK;
        setBackground(colorActual);
        hilo = null;
    }

    @Override
    public void run() {
        while (corriendo) {
            // Alternar el color
            colorActual = (colorActual == Color.BLACK) ? Color.RED : Color.BLACK;

            // Actualizar el color en el hilo de Swing
            setBackground(colorActual);

            try {
                Thread.sleep(retardo);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}