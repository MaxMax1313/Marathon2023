package day9.Task2;

public class TestFigures {

    public static double calculateRedPerimeter(Figure[] figures) {
        double Perimetr = 0;
        for (Figure s : figures) {
            if ("Red".equals(s.getColor())) {
                Perimetr += s.perimeter();
            }
        }
        return Perimetr;
    }

    public static double calculateRedArea(Figure[] figures) {
        double area = 0;
        for (Figure s : figures) {
            if ("Red".equals(s.getColor())) {
                area += s.area();
            }
        }
        return area;
    }

    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle("Red", 10, 10, 10),
                new Triangle("Green", 20, 30, 10),
                new Triangle("Red", 20, 15, 10),
                new Rectangle("Red", 10, 5),
                new Rectangle("Orange", 15, 40),
                new Circle("Red", 4),
                new Circle("Red", 10),
                new Circle("Blue", 5)
        };

        System.out.println("Сумма периметров всех красных фигур = " + calculateRedPerimeter(figures));
        System.out.println("Сумма площадей всех красных фигур = " + calculateRedArea(figures));

    }

}
