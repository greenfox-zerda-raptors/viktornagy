/**
 * Created by viktor on 2016.11.15..
 */

public class Rectangle {
    public Rectangle(){
        this.width=1;
        this.height=1;
    }
public Rectangle(int width, int height) {
    this.width=width;
    this.height=height;
}

public double getArea() {
    return this.height*this.width;
}


public int getWidth() {
    return this.width;
}

public int getHeight() {
    return  this.height;
}

public void setWidth(int width) {
    this.width=width;
}

public void setHeight(int height) {
        this.height=height;
    }




    int width;
    int height;

}
