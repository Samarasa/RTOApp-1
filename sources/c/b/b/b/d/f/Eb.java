package c.b.b.b.d.f;

import java.lang.reflect.Type;

public enum Eb {
    DOUBLE(0, Gb.SCALAR, Yb.DOUBLE),
    FLOAT(1, Gb.SCALAR, Yb.FLOAT),
    INT64(2, Gb.SCALAR, Yb.LONG),
    UINT64(3, Gb.SCALAR, Yb.LONG),
    INT32(4, Gb.SCALAR, Yb.INT),
    FIXED64(5, Gb.SCALAR, Yb.LONG),
    FIXED32(6, Gb.SCALAR, Yb.INT),
    BOOL(7, Gb.SCALAR, Yb.BOOLEAN),
    STRING(8, Gb.SCALAR, Yb.STRING),
    MESSAGE(9, Gb.SCALAR, Yb.MESSAGE),
    BYTES(10, Gb.SCALAR, Yb.BYTE_STRING),
    UINT32(11, Gb.SCALAR, Yb.INT),
    ENUM(12, Gb.SCALAR, Yb.ENUM),
    SFIXED32(13, Gb.SCALAR, Yb.INT),
    SFIXED64(14, Gb.SCALAR, Yb.LONG),
    SINT32(15, Gb.SCALAR, Yb.INT),
    SINT64(16, Gb.SCALAR, Yb.LONG),
    GROUP(17, Gb.SCALAR, Yb.MESSAGE),
    DOUBLE_LIST(18, Gb.VECTOR, Yb.DOUBLE),
    FLOAT_LIST(19, Gb.VECTOR, Yb.FLOAT),
    INT64_LIST(20, Gb.VECTOR, Yb.LONG),
    UINT64_LIST(21, Gb.VECTOR, Yb.LONG),
    INT32_LIST(22, Gb.VECTOR, Yb.INT),
    FIXED64_LIST(23, Gb.VECTOR, Yb.LONG),
    FIXED32_LIST(24, Gb.VECTOR, Yb.INT),
    BOOL_LIST(25, Gb.VECTOR, Yb.BOOLEAN),
    STRING_LIST(26, Gb.VECTOR, Yb.STRING),
    MESSAGE_LIST(27, Gb.VECTOR, Yb.MESSAGE),
    BYTES_LIST(28, Gb.VECTOR, Yb.BYTE_STRING),
    UINT32_LIST(29, Gb.VECTOR, Yb.INT),
    ENUM_LIST(30, Gb.VECTOR, Yb.ENUM),
    SFIXED32_LIST(31, Gb.VECTOR, Yb.INT),
    SFIXED64_LIST(32, Gb.VECTOR, Yb.LONG),
    SINT32_LIST(33, Gb.VECTOR, Yb.INT),
    SINT64_LIST(34, Gb.VECTOR, Yb.LONG),
    DOUBLE_LIST_PACKED(35, Gb.PACKED_VECTOR, Yb.DOUBLE),
    FLOAT_LIST_PACKED(36, Gb.PACKED_VECTOR, Yb.FLOAT),
    INT64_LIST_PACKED(37, Gb.PACKED_VECTOR, Yb.LONG),
    UINT64_LIST_PACKED(38, Gb.PACKED_VECTOR, Yb.LONG),
    INT32_LIST_PACKED(39, Gb.PACKED_VECTOR, Yb.INT),
    FIXED64_LIST_PACKED(40, Gb.PACKED_VECTOR, Yb.LONG),
    FIXED32_LIST_PACKED(41, Gb.PACKED_VECTOR, Yb.INT),
    BOOL_LIST_PACKED(42, Gb.PACKED_VECTOR, Yb.BOOLEAN),
    UINT32_LIST_PACKED(43, Gb.PACKED_VECTOR, Yb.INT),
    ENUM_LIST_PACKED(44, Gb.PACKED_VECTOR, Yb.ENUM),
    SFIXED32_LIST_PACKED(45, Gb.PACKED_VECTOR, Yb.INT),
    SFIXED64_LIST_PACKED(46, Gb.PACKED_VECTOR, Yb.LONG),
    SINT32_LIST_PACKED(47, Gb.PACKED_VECTOR, Yb.INT),
    SINT64_LIST_PACKED(48, Gb.PACKED_VECTOR, Yb.LONG),
    GROUP_LIST(49, Gb.VECTOR, Yb.MESSAGE),
    MAP(50, Gb.MAP, Yb.VOID);
    
    private static final Eb[] Z = null;
    private static final Type[] aa = null;
    private final Yb ca;
    private final int da;
    private final Gb ea;
    private final Class<?> fa;
    private final boolean ga;

    static {
        int i;
        aa = new Type[0];
        Eb[] values = values();
        Z = new Eb[values.length];
        for (Eb eb : values) {
            Z[eb.da] = eb;
        }
    }

    private Eb(int i, Gb gb, Yb yb) {
        int i2;
        this.da = i;
        this.ea = gb;
        this.ca = yb;
        int i3 = Ib.f4182a[gb.ordinal()];
        this.fa = (i3 == 1 || i3 == 2) ? yb.a() : null;
        boolean z = false;
        if (!(gb != Gb.SCALAR || (i2 = Ib.f4183b[yb.ordinal()]) == 1 || i2 == 2 || i2 == 3)) {
            z = true;
        }
        this.ga = z;
    }

    public final int a() {
        return this.da;
    }
}
