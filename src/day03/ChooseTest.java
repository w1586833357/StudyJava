package day03;

import java.util.Scanner;

public class ChooseTest {

    public static void main(String[] args) {
        Operation operation = new Operation();
        Scanner scanner = new Scanner(System.in);
        int a, b;
        double c, d;

        for (int i = 0; i < 3; i++) {
            System.out.println("请输入两个数:");
            if (scanner.hasNextInt()) {
                a = scanner.nextInt();
                b = scanner.nextInt();
                int sum = operation.add(a, b);
                System.out.println("相加的" + operation.connect() + sum);
            } else {
                System.out.println("请输入两个数!");
                scanner.next();
                System.out.println("请重新输入两个数!");
            }

            System.out.println("请输入两个小数:");
            if (scanner.hasNextDouble()) {
                c = scanner.nextDouble();
                d = scanner.nextDouble();
                double sump = operation.divide(c, d);
                System.out.println("相除的" + operation.connect() + sump);
            } else {
                System.out.println("请输入两个小数!");
            }
        }

        scanner.close();
<<<<<<< HEAD
        
//        if (boolean){}
//        if (boolean){}else{}
//        if (boolean){}else if(boolean){}
//        if (boolean){}else if(boolean){}else{}
=======
>>>>>>> 872657cc4c422fd09c4f55586f12da247b8af0e2
    }
}
