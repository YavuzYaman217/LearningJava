package Examples;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int height, int width) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    public int Area(int height,int width){
        return (height * width)/2;
    }
    public int Perimeter(int height,int width){
        double hypotenuse = Math.sqrt(height*height + width*width);
        return (int)(hypotenuse + width + height);
    }
}