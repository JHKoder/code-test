package enumTest.enums.enumMapInitialization;

import java.util.EnumMap;
import java.util.Map;

public enum B implements ABC {
    ACCEPT,
    INSTRUCT,
    DEPARTURE,
    FINAL_DELIVERY,
    NONE_TRACKING;


    public B next(){
        return sequenceB.get(this);
    }

    public static B init() {
        return B.ACCEPT;
    }

    private static EnumMap<B, B> B() {
        return (EnumMap<B, B>)
                Map.of(
                        ACCEPT, INSTRUCT,
                        INSTRUCT, DEPARTURE,
                        DEPARTURE, FINAL_DELIVERY,
                        FINAL_DELIVERY, NONE_TRACKING
                );
    }

    private static final EnumMap<B, B> sequenceB = new EnumMap<>(B.class);

}
