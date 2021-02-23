package c.b.b.a.a;

import c.b.b.a.b;
import java.util.Arrays;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    private final b f3828a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f3829b;

    public k(b bVar, byte[] bArr) {
        if (bVar == null) {
            throw new NullPointerException("encoding is null");
        } else if (bArr != null) {
            this.f3828a = bVar;
            this.f3829b = bArr;
        } else {
            throw new NullPointerException("bytes is null");
        }
    }

    public byte[] a() {
        return this.f3829b;
    }

    public b b() {
        return this.f3828a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (!this.f3828a.equals(kVar.f3828a)) {
            return false;
        }
        return Arrays.equals(this.f3829b, kVar.f3829b);
    }

    public int hashCode() {
        return ((this.f3828a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f3829b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f3828a + ", bytes=[...]}";
    }
}
