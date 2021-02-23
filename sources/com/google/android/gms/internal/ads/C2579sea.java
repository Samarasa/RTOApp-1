package com.google.android.gms.internal.ads;

import java.lang.reflect.Type;

/* renamed from: com.google.android.gms.internal.ads.sea  reason: case insensitive filesystem */
public enum C2579sea {
    DOUBLE(0, C2721uea.SCALAR, Kea.DOUBLE),
    FLOAT(1, C2721uea.SCALAR, Kea.FLOAT),
    INT64(2, C2721uea.SCALAR, Kea.LONG),
    UINT64(3, C2721uea.SCALAR, Kea.LONG),
    INT32(4, C2721uea.SCALAR, Kea.INT),
    FIXED64(5, C2721uea.SCALAR, Kea.LONG),
    FIXED32(6, C2721uea.SCALAR, Kea.INT),
    BOOL(7, C2721uea.SCALAR, Kea.BOOLEAN),
    STRING(8, C2721uea.SCALAR, Kea.STRING),
    MESSAGE(9, C2721uea.SCALAR, Kea.MESSAGE),
    BYTES(10, C2721uea.SCALAR, Kea.BYTE_STRING),
    UINT32(11, C2721uea.SCALAR, Kea.INT),
    ENUM(12, C2721uea.SCALAR, Kea.ENUM),
    SFIXED32(13, C2721uea.SCALAR, Kea.INT),
    SFIXED64(14, C2721uea.SCALAR, Kea.LONG),
    SINT32(15, C2721uea.SCALAR, Kea.INT),
    SINT64(16, C2721uea.SCALAR, Kea.LONG),
    GROUP(17, C2721uea.SCALAR, Kea.MESSAGE),
    DOUBLE_LIST(18, C2721uea.VECTOR, Kea.DOUBLE),
    FLOAT_LIST(19, C2721uea.VECTOR, Kea.FLOAT),
    INT64_LIST(20, C2721uea.VECTOR, Kea.LONG),
    UINT64_LIST(21, C2721uea.VECTOR, Kea.LONG),
    INT32_LIST(22, C2721uea.VECTOR, Kea.INT),
    FIXED64_LIST(23, C2721uea.VECTOR, Kea.LONG),
    FIXED32_LIST(24, C2721uea.VECTOR, Kea.INT),
    BOOL_LIST(25, C2721uea.VECTOR, Kea.BOOLEAN),
    STRING_LIST(26, C2721uea.VECTOR, Kea.STRING),
    MESSAGE_LIST(27, C2721uea.VECTOR, Kea.MESSAGE),
    BYTES_LIST(28, C2721uea.VECTOR, Kea.BYTE_STRING),
    UINT32_LIST(29, C2721uea.VECTOR, Kea.INT),
    ENUM_LIST(30, C2721uea.VECTOR, Kea.ENUM),
    SFIXED32_LIST(31, C2721uea.VECTOR, Kea.INT),
    SFIXED64_LIST(32, C2721uea.VECTOR, Kea.LONG),
    SINT32_LIST(33, C2721uea.VECTOR, Kea.INT),
    SINT64_LIST(34, C2721uea.VECTOR, Kea.LONG),
    DOUBLE_LIST_PACKED(35, C2721uea.PACKED_VECTOR, Kea.DOUBLE),
    FLOAT_LIST_PACKED(36, C2721uea.PACKED_VECTOR, Kea.FLOAT),
    INT64_LIST_PACKED(37, C2721uea.PACKED_VECTOR, Kea.LONG),
    UINT64_LIST_PACKED(38, C2721uea.PACKED_VECTOR, Kea.LONG),
    INT32_LIST_PACKED(39, C2721uea.PACKED_VECTOR, Kea.INT),
    FIXED64_LIST_PACKED(40, C2721uea.PACKED_VECTOR, Kea.LONG),
    FIXED32_LIST_PACKED(41, C2721uea.PACKED_VECTOR, Kea.INT),
    BOOL_LIST_PACKED(42, C2721uea.PACKED_VECTOR, Kea.BOOLEAN),
    UINT32_LIST_PACKED(43, C2721uea.PACKED_VECTOR, Kea.INT),
    ENUM_LIST_PACKED(44, C2721uea.PACKED_VECTOR, Kea.ENUM),
    SFIXED32_LIST_PACKED(45, C2721uea.PACKED_VECTOR, Kea.INT),
    SFIXED64_LIST_PACKED(46, C2721uea.PACKED_VECTOR, Kea.LONG),
    SINT32_LIST_PACKED(47, C2721uea.PACKED_VECTOR, Kea.INT),
    SINT64_LIST_PACKED(48, C2721uea.PACKED_VECTOR, Kea.LONG),
    GROUP_LIST(49, C2721uea.VECTOR, Kea.MESSAGE),
    MAP(50, C2721uea.MAP, Kea.VOID);
    
    private static final C2579sea[] Z = null;
    private static final Type[] aa = null;
    private final Kea ca;
    private final int da;
    private final C2721uea ea;
    private final Class<?> fa;
    private final boolean ga;

    static {
        int i;
        aa = new Type[0];
        C2579sea[] values = values();
        Z = new C2579sea[values.length];
        for (C2579sea sea : values) {
            Z[sea.da] = sea;
        }
    }

    private C2579sea(int i, C2721uea uea, Kea kea) {
        int i2;
        this.da = i;
        this.ea = uea;
        this.ca = kea;
        int i3 = C2508rea.f11997a[uea.ordinal()];
        this.fa = (i3 == 1 || i3 == 2) ? kea.a() : null;
        boolean z = false;
        if (!(uea != C2721uea.SCALAR || (i2 = C2508rea.f11998b[kea.ordinal()]) == 1 || i2 == 2 || i2 == 3)) {
            z = true;
        }
        this.ga = z;
    }

    public final int a() {
        return this.da;
    }
}
