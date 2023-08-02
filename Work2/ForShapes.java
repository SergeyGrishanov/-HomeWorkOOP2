package Work2;

public class ForShapes implements IFigure {

    private double height;
    private double width;
    

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public double getHeight() {
        return height;
    }

        ForShapes(double width, double height) {
            this.width = width;
            this.height = height;
        }
    
        ForShapes() {
            width = height = 0.0;
        }
    
        void showDem() {
            System.out.println("Ширина и Высота: " + width + " и "+ height);
        }
    }
    
    class Rectangle extends ForShapes {
        private String style;
        Rectangle(double width, double height, String style) {
            super(width, height);
            this.style = style;
        }
        
    
        double calculateArea() {
            return (getHeight() * getWidth());
        }

        double calculatePerimeter() {
            return ((getHeight() + getWidth()) * 2);
        }

        void showStyle() {
            System.out.println("Прямоугольник: " + style);
        }
    }
