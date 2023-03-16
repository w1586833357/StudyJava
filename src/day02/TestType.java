package day02;

import java.util.Scanner;

public class TestType {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DataType dataType = new DataType();

        Type type = new Type();

        System.out.println("Byte类型");
        //byte scope -2^7~2^7-1

        System.out.println("Short类型");
        //short scope -2^15~2^15-1

        System.out.println("Int类型");
        //int scope -2^31~2^31-1
        dataType.setB(1);
        int a = dataType.getB();

        System.out.println("Long类型");
        //long scope -2^63~2^63-1
        dataType.setD(10000000000L);
        long b = dataType.getD();

        System.out.println("Double类型");
        // double precision fifteen;
        dataType.setE(25.123);
        double c = dataType.getE();

        System.out.println("Float类型");
        //float precision seven;
        dataType.setF(25.123f);
        float d = dataType.getF();

        System.out.println("Char类型");
        //scope 0~65535
        dataType.setG('A');
        char e = dataType.getG();//65
        dataType.setG('a');
        char f = dataType.getG();//97
        dataType.setG('0');
        char g = dataType.getG();//48

        System.out.println("Boolean类型");
        //boolean true/false
        dataType.setH(true);
        boolean m = dataType.isH();//判断条件 符合条件
        dataType.setH(false);
        boolean n = dataType.isH();//判断条件 不符合条件

    }
}
