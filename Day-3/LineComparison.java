import java.util.Scanner;

class Line {
    int x1, y1, x2, y2;

    public Line(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double length() {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}

public class LineComparison {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter coordinates for Line 1:");
        Line l1 = new Line(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());

        System.out.println("Enter coordinates for Line 2:");
        Line l2 = new Line(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());

        double len1 = l1.length();
        double len2 = l2.length();

        System.out.println("Length of Line 1: " + len1);
        System.out.println("Length of Line 2: " + len2);

        // UC2: Equality
        if (Double.valueOf(len1).equals(len2)) {
            System.out.println("Lines are equal");
        } else {
            System.out.println("Lines are NOT equal");
        }

        // UC3: Compare
        int result = Double.compare(len1, len2);

        if (result == 0)
            System.out.println("Lines are equal");
        else if (result > 0)
            System.out.println("Line 1 is longer");
        else
            System.out.println("Line 2 is longer");
    }
}
