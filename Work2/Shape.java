package Work2;

public class Shape {
public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4.0, 10.1, "Синий");
        Rectangle r2 = new Rectangle(3.0, 25.0, "Красный");

        System.out.println("Информация о 'r1'.");
        r1.showStyle();
        r1.showDem();
        System.out.println("Площадь = " + r1.calculateArea());
        System.out.println("Периметр = " + r1.calculatePerimeter());
        System.out.println();
        
        System.out.println("Информация о 'r2'.");
        r2.showStyle();
        r2.showDem();
        System.out.println("Площадь = " + r2.calculateArea());
        System.out.println("Периметр = " + r2.calculatePerimeter());
    }
}
