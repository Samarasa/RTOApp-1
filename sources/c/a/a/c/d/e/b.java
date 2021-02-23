package c.a.a.c.d.e;

import android.graphics.Bitmap;
import c.a.a.b.a;
import c.a.a.c.b.a.e;

public final class b implements a.C0045a {

    /* renamed from: a  reason: collision with root package name */
    private final e f3443a;

    /* renamed from: b  reason: collision with root package name */
    private final c.a.a.c.b.a.b f3444b;

    public b(e eVar, c.a.a.c.b.a.b bVar) {
        this.f3443a = eVar;
        this.f3444b = bVar;
    }

    public Bitmap a(int i, int i2, Bitmap.Config config) {
        return this.f3443a.b(i, i2, config);
    }

    public void a(Bitmap bitmap) {
        this.f3443a.a(bitmap);
    }

    public void a(byte[] bArr) {
        c.a.a.c.b.a.b bVar = this.f3444b;
        if (bVar != null) {
            bVar.put(bArr);
        }
    }

    public void a(int[] iArr) {
        c.a.a.c.b.a.b bVar = this.f3444b;
        if (bVar != null) {
            bVar.put(iArr);
        }
    }

    public int[] a(int i) {
        c.a.a.c.b.a.b bVar = this.f3444b;
        return bVar == null ? new int[i] : (int[]) bVar.b(i, int[].class);
    }

    public byte[] b(int i) {
        c.a.a.c.b.a.b bVar = this.f3444b;
        return bVar == null ? new byte[i] : (byte[]) bVar.b(i, byte[].class);
    }
}
