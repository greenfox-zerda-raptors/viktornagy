/**
 * Created by viktor on 2016.11.15..
 */
public class Block extends Rectangle {

    public Block(){
        super();
        this.length=1;
    }

    public Block(int width, int height, int length) {
        super(width, height);
        this.length=length;
    }

    public int getLength(){
        return this.length;
    }

    public void setLength(int length) {
        this.length=length;
    }

    public double getVolume(){
        return this.width*this.height*this.length;
    }

    public String toString()
    {
        return String.format("Width: %d Height:%d Length: %d ",this.width,this.height,this.length);
    }

    int length;
}
