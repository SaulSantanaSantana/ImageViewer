
package Persistence;

import Model.Image;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 *
 * @author saul
 */
public class FileImageLoader implements ImageLoader {
    
    private final File[] file;

    public FileImageLoader(File folder) {
        this.file = folder.listFiles(imageType());
    }
    
    public FileFilter imageType(){
         return (File pathname) -> pathname.getName().endsWith(".jpg"); 
    }

    @Override
    public Image load() {
        return imageAt(0);
    }

    private Image imageAt(int i) {
        
        return new Image(){
            @Override
            public String name() {
                return file[i].getName();
            }

            @Override
            public InputStream stream() {
                try{
                    return new BufferedInputStream(new FileInputStream(file[i]));
                } catch(FileNotFoundException e){
                    return null;
                }
            }

            @Override
            public Image next() {
                return i == file.length -1 ? imageAt(0) : imageAt(i+1);
            }

            @Override
            public Image prev() {
                return i == 0 ? imageAt(file.length-1) : imageAt(i-1);
            }
        };
    }

    
    
}
