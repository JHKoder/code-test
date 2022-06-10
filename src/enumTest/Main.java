package enumTest;

import enumTest.dto.User;
import enumTest.enums.enumMapInitialization.A;
import enumTest.enums.enumMapInitialization.C;
import enumTest.role.Role;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        long time = System.currentTimeMillis();
        reportPerformanceFor(" ", time);
        User userc = new User("A", Role.USER, C.init());
        reportPerformanceFor(" ", time);


        reportPerformanceFor(" ", time);
        User usera = new User("A", Role.USER, A.init());
        reportPerformanceFor(" ", time);

        System.out.println();
        System.out.println();

        int count = Integer.MAX_VALUE;
        testA(count);
        System.out.println(" ");
        testB(count);


        try {
            System.in.read();
            System.out.println("end");
        } catch (IOException e) {
            System.out.println("end");
            e.printStackTrace();
        }

        System.out.println("end");
    }

    public static void testA(int count) {

        long time = System.currentTimeMillis();

        reportPerformanceFor(" A before", time);
        for (int i = 0; i < 100; i++) {
            User userA = new User("A", Role.USER, A.init());
            userA.next();
        }

       reportPerformanceFor(" A after", time);
    }

    public static void testB(int count) {

        long time = System.currentTimeMillis();

        reportPerformanceFor(" C before", time);
        for (int i = 0; i < count; i++) {
            User userC = new User("C", Role.USER, C.init());
            userC.next();

        }
        reportPerformanceFor(" C after", time);

    }


    private static void reportPerformanceFor(String msg, long refTime) {

        long nanoTime = System.nanoTime();
        double mem = usedMemory()
            / (1024.0 * 1024.0);
        System.out.println(msg + " (" + "nanoTime :" + (double)nanoTime/ 1000000000  + " , " + mem + "MB) ");

    }

    private static long usedMemory() {
        Runtime rt = Runtime.getRuntime();
        return rt.totalMemory() - rt.freeMemory();
    }

}
