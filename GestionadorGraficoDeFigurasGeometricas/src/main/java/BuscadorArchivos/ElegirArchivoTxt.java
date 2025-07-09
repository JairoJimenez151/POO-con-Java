package BuscadorArchivos;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;

public class ElegirArchivoTxt {

    public ElegirArchivoTxt() {
    }

    public String seleccionarArchivoTxt() {
        JFileChooser fileChooser = new JFileChooser();

        // Filtro para mostrar solo archivos .txt
        FileNameExtensionFilter filtroTxt = new FileNameExtensionFilter("Archivos de texto (.txt)", "txt");
        fileChooser.setFileFilter(filtroTxt);

        // Mostrar el cuadro de diálogo para seleccionar archivo
        int resultado = fileChooser.showOpenDialog(null);

        if (resultado == JFileChooser.APPROVE_OPTION) {
            File archivoSeleccionado = fileChooser.getSelectedFile();
            return archivoSeleccionado.getAbsolutePath();
        } else {
            return null; 
        }
    }
}

