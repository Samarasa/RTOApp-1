package c.a.a.c.c;

import c.a.a.c.c.C0241c;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* renamed from: c.a.a.c.c.d  reason: case insensitive filesystem */
class C0242d implements C0241c.b<InputStream> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C0241c.d f3285a;

    C0242d(C0241c.d dVar) {
        this.f3285a = dVar;
    }

    public InputStream a(byte[] bArr) {
        return new ByteArrayInputStream(bArr);
    }

    public Class<InputStream> a() {
        return InputStream.class;
    }
}
