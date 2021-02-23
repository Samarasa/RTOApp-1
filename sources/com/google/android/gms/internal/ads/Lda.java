package com.google.android.gms.internal.ads;

import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

public abstract class Lda implements Serializable, Iterable<Byte> {

    /* renamed from: a  reason: collision with root package name */
    public static final Lda f7691a = new Wda(Aea.f6147c);

    /* renamed from: b  reason: collision with root package name */
    private static final Sda f7692b = (Ida.a() ? new Yda((Oda) null) : new Pda((Oda) null));

    /* renamed from: c  reason: collision with root package name */
    private static final Comparator<Lda> f7693c = new Nda();

    /* renamed from: d  reason: collision with root package name */
    private int f7694d = 0;

    Lda() {
    }

    public static Lda a(InputStream inputStream) {
        ArrayList arrayList = new ArrayList();
        int i = 256;
        while (true) {
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                int read = inputStream.read(bArr, i2, i - i2);
                if (read == -1) {
                    break;
                }
                i2 += read;
            }
            Lda a2 = i2 == 0 ? null : a(bArr, 0, i2);
            if (a2 == null) {
                return a((Iterable<Lda>) arrayList);
            }
            arrayList.add(a2);
            i = Math.min(i << 1, 8192);
        }
    }

    public static Lda a(Iterable<Lda> iterable) {
        int i;
        if (!(iterable instanceof Collection)) {
            i = 0;
            Iterator<Lda> it = iterable.iterator();
            while (it.hasNext()) {
                it.next();
                i++;
            }
        } else {
            i = ((Collection) iterable).size();
        }
        return i == 0 ? f7691a : a(iterable.iterator(), i);
    }

    public static Lda a(String str) {
        return new Wda(str.getBytes(Aea.f6145a));
    }

    private static Lda a(Iterator<Lda> it, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", new Object[]{Integer.valueOf(i)}));
        } else if (i == 1) {
            return it.next();
        } else {
            int i2 = i >>> 1;
            Lda a2 = a(it, i2);
            Lda a3 = a(it, i - i2);
            if (Integer.MAX_VALUE - a2.size() >= a3.size()) {
                return C3078zfa.a(a2, a3);
            }
            int size = a2.size();
            int size2 = a3.size();
            StringBuilder sb = new StringBuilder(53);
            sb.append("ByteString would be too long: ");
            sb.append(size);
            sb.append("+");
            sb.append(size2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public static Lda a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    public static Lda a(byte[] bArr, int i, int i2) {
        c(i, i + i2, bArr.length);
        return new Wda(f7692b.a(bArr, i, i2));
    }

    /* access modifiers changed from: private */
    public static int b(byte b2) {
        return b2 & 255;
    }

    static Lda b(byte[] bArr) {
        return new Wda(bArr);
    }

    static void b(int i, int i2) {
        if (((i2 - (i + 1)) | i) >= 0) {
            return;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(22);
            sb.append("Index < 0: ");
            sb.append(i);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Index > length: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(i2);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    static int c(int i, int i2, int i3) {
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

    public static Zda h() {
        return new Zda(128);
    }

    static Uda l(int i) {
        return new Uda(i, (Oda) null);
    }

    /* access modifiers changed from: protected */
    public abstract int a(int i, int i2, int i3);

    public abstract Lda a(int i, int i2);

    /* access modifiers changed from: protected */
    public abstract String a(Charset charset);

    /* access modifiers changed from: package-private */
    public abstract void a(Mda mda);

    @Deprecated
    public final void a(byte[] bArr, int i, int i2, int i3) {
        c(i, i + i3, size());
        c(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            b(bArr, i, i2, i3);
        }
    }

    /* access modifiers changed from: protected */
    public abstract int b(int i, int i2, int i3);

    /* access modifiers changed from: protected */
    public abstract void b(byte[] bArr, int i, int i2, int i3);

    public final byte[] c() {
        int size = size();
        if (size == 0) {
            return Aea.f6147c;
        }
        byte[] bArr = new byte[size];
        b(bArr, 0, 0, size);
        return bArr;
    }

    /* renamed from: d */
    public Vda iterator() {
        return new Oda(this);
    }

    public final String e() {
        return size() == 0 ? BuildConfig.FLAVOR : a(Aea.f6145a);
    }

    public abstract boolean equals(Object obj);

    public abstract boolean f();

    public abstract C1304aea g();

    public final int hashCode() {
        int i = this.f7694d;
        if (i == 0) {
            int size = size();
            i = b(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.f7694d = i;
        }
        return i;
    }

    /* access modifiers changed from: protected */
    public abstract int i();

    public final boolean isEmpty() {
        return size() == 0;
    }

    public abstract byte j(int i);

    /* access modifiers changed from: protected */
    public abstract boolean j();

    /* access modifiers changed from: package-private */
    public abstract byte k(int i);

    /* access modifiers changed from: protected */
    public final int k() {
        return this.f7694d;
    }

    public abstract int size();

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(size());
        objArr[2] = size() <= 50 ? Rfa.a(this) : String.valueOf(Rfa.a(a(0, 47))).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }
}
