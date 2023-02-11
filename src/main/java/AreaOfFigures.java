import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figure = scanner.nextLine();
        double area = 0;

        if (figure.equals("square")) {
            Double a = Double.parseDouble(scanner.nextLine());
            area = a * a;
        } else if (figure.equals("rectangle")) {
            Double a = Double.parseDouble(scanner.nextLine());
            Double b = Double.parseDouble(scanner.nextLine());
            area = a * b;
        } else if (figure.equals("circle")) {
            Double r = Double.parseDouble(scanner.nextLine());
            area = Math.PI * r * r;
        } else if (figure.equals("triangle")) {
            Double a = Double.parseDouble(scanner.nextLine());
            Double h = Double.parseDouble(scanner.nextLine());
            area = a * h / 2;
        }
        System.out.printf("%.3f", area);
    }
}
