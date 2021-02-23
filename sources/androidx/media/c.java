package androidx.media;

import java.util.Arrays;

class c implements a {

    /* renamed from: a  reason: collision with root package name */
    int f1263a = 0;

    /* renamed from: b  reason: collision with root package name */
    int f1264b = 0;

    /* renamed from: c  reason: collision with root package name */
    int f1265c = 0;

    /* renamed from: d  reason: collision with root package name */
    int f1266d = -1;

    c() {
    }

    public int a() {
        return this.f1264b;
    }

    public int b() {
        int i = this.f1265c;
        int c2 = c();
        if (c2 == 6) {
            i |= 4;
        } else if (c2 == 7) {
            i |= 1;
        }
        return i & 273;
    }

    public int c() {
        int i = this.f1266d;
        return i != -1 ? i : AudioAttributesCompat.a(false, this.f1265c, this.f1263a);
    }

    public int d() {
        return this.f1263a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f1264b == cVar.a() && this.f1265c == cVar.b() && this.f1263a == cVar.d() && this.f1266d == cVar.f1266d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1264b), Integer.valueOf(this.f1265c), Integer.valueOf(this.f1263a), Integer.valueOf(this.f1266d)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f1266d != -1) {
            sb.append(" stream=");
            sb.append(this.f1266d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.a(this.f1263a));
        sb.append(" content=");
        sb.append(this.f1264b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f1265c).toUpperCase());
        return sb.toString();
    }
}
