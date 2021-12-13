
package Controler;

import java.io.File;
import Model.Image;
import Persistence.FileImageLoader;

/**
 *
 * @author saul
 */
public class Main {


    public static void main(String[] args) {
        File file = new File("/home/saul/Imágenes");
        FileImageLoader imageLoader = new FileImageLoader(file);
        Image image = imageLoader.load();
        MainFrame mainFrame = new MainFrame();
        mainFrame.getImageDisplay().show(image);
    }
    
}
