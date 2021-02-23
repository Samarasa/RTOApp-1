package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;

class Wda extends Xda {

    /* renamed from: e  reason: collision with root package name */
    protected final byte[] f9150e;

    Wda(byte[] bArr) {
        if (bArr != null) {
            this.f9150e = bArr;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: protected */
    public final int a(int i, int i2, int i3) {
        int l = l() + i2;
        return C1521dga.a(i, this.f9150e, l, i3 + l);
    }

    public final Lda a(int i, int i2) {
        int c2 = Lda.c(i, i2, size());
        return c2 == 0 ? Lda.f7691a : new Tda(this.f9150e, l() + i, c2);
    }

    /* access modifiers changed from: protected */
    public final String a(Charset charset) {
        return new String(this.f9150e, l(), size(), charset);
    }

    /* access modifiers changed from: package-private */
    public final void a(Mda mda) {
        mda.a(this.f9150e, l(), size());
    }

    /* access modifiers changed from: package-private */
    public final boolean a(Lda lda, int i, int i2) {
        if (i2 <= lda.size()) {
            int i3 = i + i2;
            if (i3 > lda.size()) {
                int size = lda.size();
                StringBuilder sb = new StringBuilder(59);
                sb.append("Ran off end of other: ");
                sb.append(i);
                sb.append(", ");
                sb.append(i2);
                sb.append(", ");
                sb.append(size);
                throw new IllegalArgumentException(sb.toString());
            } else if (!(lda instanceof Wda)) {
                return lda.a(i, i3).equals(a(0, i2));
            } else {
                Wda wda = (Wda) lda;
                byte[] bArr = this.f9150e;
                byte[] bArr2 = wda.f9150e;
                int l = l() + i2;
                int l2 = l();
                int l3 = wda.l() + i;
                while (l2 < l) {
                    if (bArr[l2] != bArr2[l3]) {
                        return false;
                    }
                    l2++;
                    l3++;
                }
                return true;
            }
        } else {
            int size2 = size();
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Length too large: ");
            sb2.append(i2);
            sb2.append(size2);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* access modifiers changed from: protected */
    public final int b(int i, int i2, int i3) {
        return Aea.a(i, this.f9150e, l() + i2, i3);
    }

    /* access modifiers changed from: protected */
    public void b(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f9150e, i, bArr, i2, i3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Lda) || size() != ((Lda) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof Wda)) {
            return obj.equals(this);
        }
        Wda wda = (Wda) obj;
        int k = k();
        int k2 = wda.k();
        if (k == 0 || k2 == 0 || k == k2) {
            return a((Lda) wda, 0, size());
        }
        return false;
    }

    public final boolean f() {
        int l = l();
        return C1521dga.a(this.f9150e, l, size() + l);
    }

    public final C1304aea g() {
        return C1304aea.a(this.f9150e, l(), size(), true);
    }

    public byte j(int i) {
        return this.f9150e[i];
    }

    /* access modifiers changed from: package-private */
    public byte k(int i) {
        return this.f9150e[i];
    }

    /* access modifiers changed from: protected */
    public int l() {
        return 0;
    }

    public int size() {
        return this.f9150e.length;
    }
}
