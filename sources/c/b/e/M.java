package c.b.e;

import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;

public final class M {

    /* renamed from: a  reason: collision with root package name */
    static final int f4981a = a(1, 3);

    /* renamed from: b  reason: collision with root package name */
    static final int f4982b = a(1, 4);

    /* renamed from: c  reason: collision with root package name */
    static final int f4983c = a(2, 0);

    /* renamed from: d  reason: collision with root package name */
    static final int f4984d = a(3, 2);

    public enum a {
        DOUBLE(b.DOUBLE, 1),
        FLOAT(b.FLOAT, 5),
        INT64(b.LONG, 0),
        UINT64(b.LONG, 0),
        INT32(b.INT, 0),
        FIXED64(b.LONG, 1),
        FIXED32(b.INT, 5),
        BOOL(b.BOOLEAN, 0),
        STRING(b.STRING, 2),
        GROUP(b.MESSAGE, 3),
        MESSAGE(b.MESSAGE, 2),
        BYTES(b.BYTE_STRING, 2),
        UINT32(b.INT, 0),
        ENUM(b.ENUM, 0),
        SFIXED32(b.INT, 5),
        SFIXED64(b.LONG, 1),
        SINT32(b.INT, 0),
        SINT64(b.LONG, 0);
        
        private final b t;
        private final int u;

        private a(b bVar, int i) {
            this.t = bVar;
            this.u = i;
        }

        public b a() {
            return this.t;
        }
    }

    public enum b {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(false),
        STRING(BuildConfig.FLAVOR),
        BYTE_STRING(C0480e.f5007a),
        ENUM((String) null),
        MESSAGE((String) null);
        
        private final Object k;

        private b(Object obj) {
            this.k = obj;
        }
    }

    public static int a(int i) {
        return i >>> 3;
    }

    static int a(int i, int i2) {
        return (i << 3) | i2;
    }

    public static int b(int i) {
        return i & 7;
    }
}
