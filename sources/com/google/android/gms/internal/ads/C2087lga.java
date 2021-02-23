package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.lga  reason: case insensitive filesystem */
public enum C2087lga {
    DOUBLE(C2300oga.DOUBLE, 1),
    FLOAT(C2300oga.FLOAT, 5),
    INT64(C2300oga.LONG, 0),
    UINT64(C2300oga.LONG, 0),
    INT32(C2300oga.INT, 0),
    FIXED64(C2300oga.LONG, 1),
    FIXED32(C2300oga.INT, 5),
    BOOL(C2300oga.BOOLEAN, 0),
    STRING(C2300oga.STRING, 2),
    GROUP(C2300oga.MESSAGE, 3),
    MESSAGE(C2300oga.MESSAGE, 2),
    BYTES(C2300oga.BYTE_STRING, 2),
    UINT32(C2300oga.INT, 0),
    ENUM(C2300oga.ENUM, 0),
    SFIXED32(C2300oga.INT, 5),
    SFIXED64(C2300oga.LONG, 1),
    SINT32(C2300oga.INT, 0),
    SINT64(C2300oga.LONG, 0);
    
    private final C2300oga t;
    private final int u;

    private C2087lga(C2300oga oga, int i) {
        this.t = oga;
        this.u = i;
    }
}
