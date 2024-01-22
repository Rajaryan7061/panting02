package com.example.painting;
import android.graphics.Path;
public class stoke {

    public int color;


    public int strokeWidth;


    // represent the path drawn
       public Path path;

    // constructor to initialise the attributes
    public stoke(int color, int strokeWidth, Path path) {
        this.color = color;
        this.strokeWidth = strokeWidth;
        this.path = path;
    }
}
