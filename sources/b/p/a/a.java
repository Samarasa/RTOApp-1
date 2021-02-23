package b.p.a;

public final class a implements e {

    /* renamed from: a  reason: collision with root package name */
    private final String f2651a;

    /* renamed from: b  reason: collision with root package name */
    private final Object[] f2652b;

    public a(String str) {
        this(str, (Object[]) null);
    }

    public a(String str, Object[] objArr) {
        this.f2651a = str;
        this.f2652b = objArr;
    }

    private static void a(d dVar, int i, Object obj) {
        long j;
        int byteValue;
        double doubleValue;
        if (obj == null) {
            dVar.a(i);
        } else if (obj instanceof byte[]) {
            dVar.a(i, (byte[]) obj);
        } else {
            if (obj instanceof Float) {
                doubleValue = (double) ((Float) obj).floatValue();
            } else if (obj instanceof Double) {
                doubleValue = ((Double) obj).doubleValue();
            } else {
                if (obj instanceof Long) {
                    j = ((Long) obj).longValue();
                } else {
                    if (obj instanceof Integer) {
                        byteValue = ((Integer) obj).intValue();
                    } else if (obj instanceof Short) {
                        byteValue = ((Short) obj).shortValue();
                    } else if (obj instanceof Byte) {
                        byteValue = ((Byte) obj).byteValue();
                    } else if (obj instanceof String) {
                        dVar.a(i, (String) obj);
                        return;
                    } else if (obj instanceof Boolean) {
                        j = ((Boolean) obj).booleanValue() ? 1 : 0;
                    } else {
                        throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: null, byte[], float, double, long, int, short, byte," + " string");
                    }
                    j = (long) byteValue;
                }
                dVar.a(i, j);
                return;
            }
            dVar.a(i, doubleValue);
        }
    }

    public static void a(d dVar, Object[] objArr) {
        if (objArr != null) {
            int length = objArr.length;
            int i = 0;
            while (i < length) {
                Object obj = objArr[i];
                i++;
                a(dVar, i, obj);
            }
        }
    }

    public String a() {
        return this.f2651a;
    }

    public void a(d dVar) {
        a(dVar, this.f2652b);
    }
}
