package c.b.b.b.d.f;

import android.app.Activity;
import c.b.b.b.c.b;
import c.b.b.b.d.f.Vf;

/* renamed from: c.b.b.b.d.f.w  reason: case insensitive filesystem */
final class C0442w extends Vf.a {

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ Activity f4610e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ Vf.b f4611f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0442w(Vf.b bVar, Activity activity) {
        super(Vf.this);
        this.f4611f = bVar;
        this.f4610e = activity;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        Vf.this.p.onActivityStarted(b.a(this.f4610e), this.f4321b);
    }
}
