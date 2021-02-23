package c.b.b.b.d.f;

/* renamed from: c.b.b.b.d.f.rd  reason: case insensitive filesystem */
public enum C0411rd {
    DOUBLE(C0432ud.DOUBLE, 1),
    FLOAT(C0432ud.FLOAT, 5),
    INT64(C0432ud.LONG, 0),
    UINT64(C0432ud.LONG, 0),
    INT32(C0432ud.INT, 0),
    FIXED64(C0432ud.LONG, 1),
    FIXED32(C0432ud.INT, 5),
    BOOL(C0432ud.BOOLEAN, 0),
    STRING(C0432ud.STRING, 2),
    GROUP(C0432ud.MESSAGE, 3),
    MESSAGE(C0432ud.MESSAGE, 2),
    BYTES(C0432ud.BYTE_STRING, 2),
    UINT32(C0432ud.INT, 0),
    ENUM(C0432ud.ENUM, 0),
    SFIXED32(C0432ud.INT, 5),
    SFIXED64(C0432ud.LONG, 1),
    SINT32(C0432ud.INT, 0),
    SINT64(C0432ud.LONG, 0);
    
    private final C0432ud t;
    private final int u;

    private C0411rd(C0432ud udVar, int i) {
        this.t = udVar;
        this.u = i;
    }
}
