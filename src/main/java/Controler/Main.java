
package Controler;

import java.io.File;
import Model.Image;
import Persistence.FileImageLoader;
import javax.swing.JOptionPane;

/**
 *
 * @author saul
 */
public class Main {


    public static void main(String[] args) {
        File file = new File("/home/saul/Imágenes");
        FileImageLoader imageLoader = new FileImageLoader(file);

        Image image = imageLoader.load();
        
        
        if(image != null){
            MainFrame mainFrame = new MainFrame(imageLoader);
            mainFrame.getImageDisplay().show(image);
        }else{
            System.out.println("No se han encontrado imágenes");
            JOptionPane.showMessageDialog(null,"No se han encontrado imagenes");
        }

    }
    
}
