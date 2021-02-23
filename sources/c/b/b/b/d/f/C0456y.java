package c.b.b.b.d.f;

import android.app.Activity;
import c.b.b.b.c.b;
import c.b.b.b.d.f.Vf;

/* renamed from: c.b.b.b.d.f.y  reason: case insensitive filesystem */
final class C0456y extends Vf.a {

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ Activity f4634e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ Vf.b f4635f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0456y(Vf.b bVar, Activity activity) {
        super(Vf.this);
        this.f4635f = bVar;
        this.f4634e = activity;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        Vf.this.p.onActivityPaused(b.a(this.f4634e), this.f4321b);
    }
}
