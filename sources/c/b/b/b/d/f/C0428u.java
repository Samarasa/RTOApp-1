package c.b.b.b.d.f;

import android.app.Activity;
import android.os.Bundle;
import c.b.b.b.c.b;
import c.b.b.b.d.f.Vf;

/* renamed from: c.b.b.b.d.f.u  reason: case insensitive filesystem */
final class C0428u extends Vf.a {

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ Activity f4583e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ Bundle f4584f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ Vf.b f4585g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0428u(Vf.b bVar, Activity activity, Bundle bundle) {
        super(Vf.this);
        this.f4585g = bVar;
        this.f4583e = activity;
        this.f4584f = bundle;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        Vf.this.p.onActivityCreated(b.a(this.f4583e), this.f4584f, this.f4321b);
    }
}
