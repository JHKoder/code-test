package enumTest.enumMapInitialization.enums;

import java.util.EnumMap;

public enum C implements ABC {

    ACCEPT,
    INSTRUCT,
    DEPARTURE,
    FINAL_DELIVERY,
    NONE_TRACKING;


    public C next() {
        return sequenceC.get(this);
    }

    public static C init() {
        return C.ACCEPT;
    }

    private static EnumMap<C, C> C() {
        EnumMap<C, C> map = new EnumMap<>(C.class);

        map.put(ACCEPT, INSTRUCT);
        map.put(INSTRUCT, DEPARTURE);
        map.put(DEPARTURE, FINAL_DELIVERY);
        map.put(FINAL_DELIVERY, NONE_TRACKING);

        return map;
    }

    private static final EnumMap<C, C> sequenceC = C();

}
