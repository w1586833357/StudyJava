package day03;

import java.util.Scanner;

public class OperationTest {
    public static void main(String[] args) {
        Operation operation = new Operation();
        Scanner scanner = new Scanner(System.in);
        int a, b;
        double c, d;
        char e;
        String f, m, n;
        System.out.println("请输入两个数:");
        a = scanner.nextInt();
        b = scanner.nextInt();
        int sum = operation.add(a, b);
        System.out.println("相加的" + operation.connect() + sum);

        System.out.println("请输入两个数:");
        c = scanner.nextDouble();
        d = scanner.nextDouble();
        double sump = operation.divide(c, d);
        System.out.println("相除的" + operation.connect() + sump);

        System.out.println("请输入一个字符:");
        f = scanner.next();
        e = f.charAt(0);
//        f = i.charAt(1);
        System.out.println(operation.connect() + e + "");

        System.out.println("请输入两个字符串:");
        m = scanner.next();
        n = scanner.next();
        System.out.println(operation.connect() + m + n);

        scanner.close();

    }
}
