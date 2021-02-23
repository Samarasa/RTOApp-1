package c.b.e;

import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: c.b.e.e  reason: case insensitive filesystem */
public abstract class C0480e implements Iterable<Byte>, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public static final C0480e f5007a = new f(C0488m.f5056c);

    /* renamed from: b  reason: collision with root package name */
    private static final c f5008b;

    /* renamed from: c  reason: collision with root package name */
    private int f5009c = 0;

    /* renamed from: c.b.e.e$a */
    private static final class a implements c {
        private a() {
        }

        /* synthetic */ a(C0479d dVar) {
            this();
        }

        public byte[] a(byte[] bArr, int i, int i2) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }
    }

    /* renamed from: c.b.e.e$b */
    private static final class b extends f {

        /* renamed from: e  reason: collision with root package name */
        private final int f5010e;

        /* renamed from: f  reason: collision with root package name */
        private final int f5011f;

        b(byte[] bArr, int i, int i2) {
            super(bArr);
            C0480e.a(i, i + i2, bArr.length);
            this.f5010e = i;
            this.f5011f = i2;
        }

        /* access modifiers changed from: protected */
        public int e() {
            return this.f5010e;
        }

        public byte j(int i) {
            C0480e.a(i, size());
            return this.f5012d[this.f5010e + i];
        }

        public int size() {
            return this.f5011f;
        }
    }

    /* renamed from: c.b.e.e$c */
    private interface c {
        byte[] a(byte[] bArr, int i, int i2);
    }

    /* renamed from: c.b.e.e$d */
    public interface d extends Iterator<Byte> {
    }

    /* renamed from: c.b.e.e$e  reason: collision with other inner class name */
    static abstract class C0067e extends C0480e {
        C0067e() {
        }

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return C0480e.super.iterator();
        }
    }

    /* renamed from: c.b.e.e$f */
    private static class f extends C0067e {

        /* renamed from: d  reason: collision with root package name */
        protected final byte[] f5012d;

        f(byte[] bArr) {
            this.f5012d = bArr;
        }

        /* access modifiers changed from: package-private */
        public final boolean a(C0480e eVar, int i, int i2) {
            if (i2 <= eVar.size()) {
                int i3 = i + i2;
                if (i3 > eVar.size()) {
                    throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + eVar.size());
                } else if (!(eVar instanceof f)) {
                    return eVar.b(i, i3).equals(b(0, i2));
                } else {
                    f fVar = (f) eVar;
                    byte[] bArr = this.f5012d;
                    byte[] bArr2 = fVar.f5012d;
                    int e2 = e() + i2;
                    int e3 = e();
                    int e4 = fVar.e() + i;
                    while (e3 < e2) {
                        if (bArr[e3] != bArr2[e4]) {
                            return false;
                        }
                        e3++;
                        e4++;
                    }
                    return true;
                }
            } else {
                throw new IllegalArgumentException("Length too large: " + i2 + size());
            }
        }

        /* access modifiers changed from: protected */
        public final int b(int i, int i2, int i3) {
            return C0488m.a(i, this.f5012d, e() + i2, i3);
        }

        public final C0480e b(int i, int i2) {
            int a2 = C0480e.a(i, i2, size());
            return a2 == 0 ? C0480e.f5007a : new b(this.f5012d, e() + i, a2);
        }

        /* access modifiers changed from: protected */
        public final String b(Charset charset) {
            return new String(this.f5012d, e(), size(), charset);
        }

        public final C0481f c() {
            return C0481f.a(this.f5012d, e(), size(), true);
        }

        /* access modifiers changed from: protected */
        public int e() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0480e) || size() != ((C0480e) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof f)) {
                return obj.equals(this);
            }
            f fVar = (f) obj;
            int d2 = d();
            int d3 = fVar.d();
            if (d2 == 0 || d3 == 0 || d2 == d3) {
                return a(fVar, 0, size());
            }
            return false;
        }

        public byte j(int i) {
            return this.f5012d[i];
        }

        public int size() {
            return this.f5012d.length;
        }
    }

    /* renamed from: c.b.e.e$g */
    private static final class g implements c {
        private g() {
        }

        /* synthetic */ g(C0479d dVar) {
            this();
        }

        public byte[] a(byte[] bArr, int i, int i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }
    }

    static {
        boolean z = true;
        try {
            Class.forName("android.content.Context");
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        f5008b = z ? new g((C0479d) null) : new a((C0479d) null);
    }

    C0480e() {
    }

    static int a(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i + " < 0");
        } else if (i2 < i) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i + ", " + i2);
        } else {
            throw new IndexOutOfBoundsException("End index: " + i2 + " >= " + i3);
        }
    }

    public static C0480e a(String str) {
        return new f(str.getBytes(C0488m.f5054a));
    }

    static C0480e a(byte[] bArr) {
        return new f(bArr);
    }

    public static C0480e a(byte[] bArr, int i, int i2) {
        return new f(f5008b.a(bArr, i, i2));
    }

    static void a(int i, int i2) {
        if (((i2 - (i + 1)) | i) >= 0) {
            return;
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
    }

    static C0480e b(byte[] bArr, int i, int i2) {
        return new b(bArr, i, i2);
    }

    public final String a(Charset charset) {
        return size() == 0 ? BuildConfig.FLAVOR : b(charset);
    }

    /* access modifiers changed from: protected */
    public abstract int b(int i, int i2, int i3);

    public abstract C0480e b(int i, int i2);

    /* access modifiers changed from: protected */
    public abstract String b(Charset charset);

    public abstract C0481f c();

    /* access modifiers changed from: protected */
    public final int d() {
        return this.f5009c;
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.f5009c;
        if (i == 0) {
            int size = size();
            i = b(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.f5009c = i;
        }
        return i;
    }

    public final d iterator() {
        return new C0479d(this);
    }

    public abstract byte j(int i);

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size())});
    }
}
