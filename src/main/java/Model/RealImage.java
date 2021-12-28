/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.InputStream;

/**
 *
 * @author saul
 */
public class RealImage implements Image {
    
    final private String name;
    final private InputStream stream;

    public RealImage(String name, InputStream stream) {
        this.name = name;
        this.stream = stream;
    }
    

    @Override
    public String name() {
        return name;
    }

    @Override
    public InputStream stream() {
        return stream;
    }
    
}
