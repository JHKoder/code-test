package enumTest.enums.enumMapInitialization;

import java.util.EnumMap;

public enum A implements ABC {
    ACCEPT,
    INSTRUCT,
    DEPARTURE,
    FINAL_DELIVERY,
    NONE_TRACKING;

    public A next() {
        return sequenceA.get(this);
    }

    private static void A() {
        sequenceA.put(ACCEPT, INSTRUCT);
        sequenceA.put(INSTRUCT, DEPARTURE);
        sequenceA.put(DEPARTURE, FINAL_DELIVERY);
        sequenceA.put(FINAL_DELIVERY, NONE_TRACKING);
    }


    public static A init() {
        A();
        return A.ACCEPT;
    }

    private static final EnumMap<A, A> sequenceA =
            new EnumMap<>(A.class);

}
