package c.a.a.c.d.b;

import c.a.a.c.b.F;
import c.a.a.i.i;

public class b implements F<byte[]> {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f3431a;

    public b(byte[] bArr) {
        i.a(bArr);
        this.f3431a = bArr;
    }

    public void a() {
    }

    public int b() {
        return this.f3431a.length;
    }

    public Class<byte[]> c() {
        return byte[].class;
    }

    public byte[] get() {
        return this.f3431a;
    }
}
