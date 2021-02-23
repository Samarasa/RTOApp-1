package androidx.room;

import b.p.a.d;
import b.p.a.e;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class v implements e, d {

    /* renamed from: a  reason: collision with root package name */
    static final TreeMap<Integer, v> f1609a = new TreeMap<>();

    /* renamed from: b  reason: collision with root package name */
    private volatile String f1610b;

    /* renamed from: c  reason: collision with root package name */
    final long[] f1611c;

    /* renamed from: d  reason: collision with root package name */
    final double[] f1612d;

    /* renamed from: e  reason: collision with root package name */
    final String[] f1613e;

    /* renamed from: f  reason: collision with root package name */
    final byte[][] f1614f;

    /* renamed from: g  reason: collision with root package name */
    private final int[] f1615g;

    /* renamed from: h  reason: collision with root package name */
    final int f1616h;
    int i;

    private v(int i2) {
        this.f1616h = i2;
        int i3 = i2 + 1;
        this.f1615g = new int[i3];
        this.f1611c = new long[i3];
        this.f1612d = new double[i3];
        this.f1613e = new String[i3];
        this.f1614f = new byte[i3][];
    }

    public static v a(String str, int i2) {
        synchronized (f1609a) {
            Map.Entry<Integer, v> ceilingEntry = f1609a.ceilingEntry(Integer.valueOf(i2));
            if (ceilingEntry != null) {
                f1609a.remove(ceilingEntry.getKey());
                v value = ceilingEntry.getValue();
                value.b(str, i2);
                return value;
            }
            v vVar = new v(i2);
            vVar.b(str, i2);
            return vVar;
        }
    }

    private static void e() {
        if (f1609a.size() > 15) {
            int size = f1609a.size() - 10;
            Iterator<Integer> it = f1609a.descendingKeySet().iterator();
            while (true) {
                int i2 = size - 1;
                if (size > 0) {
                    it.next();
                    it.remove();
                    size = i2;
                } else {
                    return;
                }
            }
        }
    }

    public String a() {
        return this.f1610b;
    }

    public void a(int i2) {
        this.f1615g[i2] = 1;
    }

    public void a(int i2, double d2) {
        this.f1615g[i2] = 3;
        this.f1612d[i2] = d2;
    }

    public void a(int i2, long j) {
        this.f1615g[i2] = 2;
        this.f1611c[i2] = j;
    }

    public void a(int i2, String str) {
        this.f1615g[i2] = 4;
        this.f1613e[i2] = str;
    }

    public void a(int i2, byte[] bArr) {
        this.f1615g[i2] = 5;
        this.f1614f[i2] = bArr;
    }

    public void a(d dVar) {
        for (int i2 = 1; i2 <= this.i; i2++) {
            int i3 = this.f1615g[i2];
            if (i3 == 1) {
                dVar.a(i2);
            } else if (i3 == 2) {
                dVar.a(i2, this.f1611c[i2]);
            } else if (i3 == 3) {
                dVar.a(i2, this.f1612d[i2]);
            } else if (i3 == 4) {
                dVar.a(i2, this.f1613e[i2]);
            } else if (i3 == 5) {
                dVar.a(i2, this.f1614f[i2]);
            }
        }
    }

    public void b() {
        synchronized (f1609a) {
            f1609a.put(Integer.valueOf(this.f1616h), this);
            e();
        }
    }

    /* access modifiers changed from: package-private */
    public void b(String str, int i2) {
        this.f1610b = str;
        this.i = i2;
    }

    public void close() {
    }
}
