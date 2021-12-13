
package Model;

import java.io.InputStream;

/**
 *
 * @author saul
 */
public interface Image {
    
    public String name();
    
    public InputStream stream();
    
    public Image next();
    
    public Image prev();
    
}    