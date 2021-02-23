package c.a.a.c.b.b;

import android.annotation.SuppressLint;
import c.a.a.c.b.F;
import c.a.a.c.b.b.i;
import c.a.a.i.f;

public class h extends f<c.a.a.c.h, F<?>> implements i {

    /* renamed from: e  reason: collision with root package name */
    private i.a f3088e;

    public h(long j) {
        super(j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int b(F<?> f2) {
        return f2 == null ? super.b(null) : f2.b();
    }

    public /* bridge */ /* synthetic */ F a(c.a.a.c.h hVar) {
        return (F) super.c(hVar);
    }

    public /* bridge */ /* synthetic */ F a(c.a.a.c.h hVar, F f2) {
        return (F) super.b(hVar, f2);
    }

    @SuppressLint({"InlinedApi"})
    public void a(int i) {
        if (i >= 40) {
            a();
        } else if (i >= 20 || i == 15) {
            a(b() / 2);
        }
    }

    public void a(i.a aVar) {
        this.f3088e = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void a(c.a.a.c.h hVar, F<?> f2) {
        i.a aVar = this.f3088e;
        if (aVar != null && f2 != null) {
            aVar.a(f2);
        }
    }
}
