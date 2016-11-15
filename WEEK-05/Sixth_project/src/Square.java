/**
 * Created by viktor on 2016.11.16..
 */
public class Square extends Rectangle {
    public Square(){

    }

    public Square(int length){
        super(length,length);
    }

    @Override
    public double getArea()
    {
        return this.width*this.height;
    }

    @Override
    public String toString()
    {
        return String.format("Square[%d]",this.width);
    }

}
