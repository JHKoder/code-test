package enumTest.enumMapInitialization;

import enumTest.enumMapInitialization.dto.User;
import enumTest.enumMapInitialization.enums.A;
import enumTest.enumMapInitialization.enums.B;
import enumTest.enumMapInitialization.enums.C;
import enumTest.enumMapInitialization.role.Role;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        long time = System.currentTimeMillis();
        User userB = new User("", Role.USER, B.init());
        User userA = new User("", Role.USER, A.init());
        User userC = new User("", Role.USER, C.init());
        testA(1);
        testB(1);

        System.out.println();
        System.out.println(" ============= 테스트 ===============");
        System.out.println();


        int count = Integer.MAX_VALUE;
        testA(count);
        System.out.println(" ");
        testB(count);
//        testB(count);
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
        for (int i = 0; i < count; i++) {
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
        reportPerformanceFor(" C after ", time);

    }


    private static void reportPerformanceFor(String msg, long refTime) {

        long nanoTime = System.nanoTime();
        double mem = usedMemory()
                / (1024.0 * 1024.0);
        System.out.println(msg + " (" + "nanoTime :" + (double) nanoTime / 1000000000 + " , " + mem + " MB) ");

    }

    private static long usedMemory() {
        Runtime rt = Runtime.getRuntime();
        return rt.totalMemory() - rt.freeMemory();
    }

}
