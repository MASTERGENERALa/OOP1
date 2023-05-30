package First;
import java.util.Scanner;

public class main {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Введіть довжину першої сторони: ");
    double side1 = scanner.nextDouble();

    System.out.print("Введіть довжину другої сторони: ");
    double side2 = scanner.nextDouble();

    Rectangle rectangle = new Rectangle();
    double area = rectangle.areaCalculator(side1, side2);
    double perimeter = rectangle.perimeterCalculator(side1, side2);

    System.out.println("Площа прямокутника: " + area);
    System.out.println("Периметр прямокутника: " + perimeter);
    }
}
