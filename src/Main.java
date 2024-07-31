import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Part 1
        System.out.println("Задание 1");
        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        double[] x = {1.57, 7.654, 9.986};
        char[] s = {'A', 'B', 'C', 'D', 'E', 'F'};
        System.out.println();

        // Part 2
        System.out.println("Задание 2");
        if (a.length > 0) {
            System.out.print(a[0]);
        }
        for (int i = 1; i < a.length; i++) {
            System.out.print(", " + a[i]);
        }
        System.out.println();

        if (x.length > 0) {
            System.out.print(x[0]);
        }
        for (int i = 1; i < x.length; i++) {
            System.out.print(", " + x[i]);
        }
        System.out.println();

        if (s.length > 0) {
            System.out.print(s[0]);
        }
        for (int i = 1; i < s.length; i++) {
            System.out.print(", " + s[i]);
        }
        System.out.println();
        System.out.println();

        // Part 3
        System.out.println("Задание 3");
        if (a.length > 0) {
            System.out.print(a[a.length - 1]);
        }
        for (int i = a.length - 2; i >= 0; i--) {
            System.out.print(", " + a[i]);
        }
        System.out.println();

        if (x.length > 0) {
            System.out.print(x[x.length - 1]);
        }
        for (int i = x.length - 2; i >= 0; i--) {
            System.out.print(", " + x[i]);
        }
        System.out.println();

        if (s.length > 0) {
            System.out.print(s[s.length - 1]);
        }
        for (int i = s.length - 2; i >= 0; i--) {
            System.out.print(", " + s[i]);
        }
        System.out.println();
        System.out.println();

        // Part 4
        System.out.println("Задание 4");
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                a[i]++;
            }
        }
        System.out.println(Arrays.toString(a));

    }
}