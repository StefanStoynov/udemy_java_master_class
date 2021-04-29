package section_6.wall_area;

public class Wall {
    private double width;
    private double height;

    public Wall(){
    }
    public Wall(double width,double height){
        setWidth(width);
        setHeight(height);
    }
    public void setWidth(double width){
        if (width < 0){
            this.width = 0.0;
            return;
        }
        this.width = width;
    }

    public void setHeight(double height){
        if (height < 0){
            this.height = 0.0;
            return;
        }
        this.height = height;
    }

    public double getWidth (){
        return this.width;
    }

    public double getHeight(){
        return this.height;
    }

    public double getArea(){
        return this.height * this.width;
    }

}
