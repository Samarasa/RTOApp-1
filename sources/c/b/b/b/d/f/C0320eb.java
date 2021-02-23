package c.b.b.b.d.f;

import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: c.b.b.b.d.f.eb  reason: case insensitive filesystem */
public abstract class C0320eb implements Serializable, Iterable<Byte> {

    /* renamed from: a  reason: collision with root package name */
    public static final C0320eb f4416a = new C0389ob(Nb.f4243c);

    /* renamed from: b  reason: collision with root package name */
    private static final C0361kb f4417b = (C0299bb.a() ? new C0409rb((C0341hb) null) : new C0348ib((C0341hb) null));

    /* renamed from: c  reason: collision with root package name */
    private static final Comparator<C0320eb> f4418c = new C0334gb();

    /* renamed from: d  reason: collision with root package name */
    private int f4419d = 0;

    C0320eb() {
    }

    public static C0320eb a(String str) {
        return new C0389ob(str.getBytes(Nb.f4241a));
    }

    public static C0320eb a(byte[] bArr, int i, int i2) {
        b(i, i + i2, bArr.length);
        return new C0389ob(f4417b.a(bArr, i, i2));
    }

    /* access modifiers changed from: private */
    public static int b(byte b2) {
        return b2 & 255;
    }

    static int b(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        } else {
            StringBuilder sb3 = new StringBuilder(37);
            sb3.append("End index: ");
            sb3.append(i2);
            sb3.append(" >= ");
            sb3.append(i3);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }

    static C0375mb h(int i) {
        return new C0375mb(i, (C0341hb) null);
    }

    public abstract byte a(int i);

    public abstract int a();

    /* access modifiers changed from: protected */
    public abstract int a(int i, int i2, int i3);

    public abstract C0320eb a(int i, int i2);

    /* access modifiers changed from: protected */
    public abstract String a(Charset charset);

    /* access modifiers changed from: package-private */
    public abstract void a(C0327fb fbVar);

    /* access modifiers changed from: package-private */
    public abstract byte b(int i);

    public final String b() {
        return a() == 0 ? BuildConfig.FLAVOR : a(Nb.f4241a);
    }

    public abstract boolean c();

    /* access modifiers changed from: protected */
    public final int d() {
        return this.f4419d;
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.f4419d;
        if (i == 0) {
            int a2 = a();
            i = a(a2, 0, a2);
            if (i == 0) {
                i = 1;
            }
            this.f4419d = i;
        }
        return i;
    }

    public /* synthetic */ Iterator iterator() {
        return new C0341hb(this);
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(a());
        objArr[2] = a() <= 50 ? Xc.a(this) : String.valueOf(Xc.a(a(0, 47))).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }
}
