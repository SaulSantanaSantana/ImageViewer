package Persistence;

import Model.Image;

/**
 *
 * @author saul
 */
public interface ImageLoader {
    
    public Image load();
    
    public Image next();
    public Image prev();
    
}
