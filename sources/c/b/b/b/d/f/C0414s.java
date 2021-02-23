package c.b.b.b.d.f;

import android.os.Bundle;
import c.b.b.b.d.f.Vf;

/* renamed from: c.b.b.b.d.f.s  reason: case insensitive filesystem */
final class C0414s extends Vf.a {

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ Long f4559e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ String f4560f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ String f4561g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ Bundle f4562h;
    private final /* synthetic */ boolean i;
    private final /* synthetic */ boolean j;
    private final /* synthetic */ Vf k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0414s(Vf vf, Long l, String str, String str2, Bundle bundle, boolean z, boolean z2) {
        super(vf);
        this.k = vf;
        this.f4559e = l;
        this.f4560f = str;
        this.f4561g = str2;
        this.f4562h = bundle;
        this.i = z;
        this.j = z2;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        Long l = this.f4559e;
        this.k.p.logEvent(this.f4560f, this.f4561g, this.f4562h, this.i, this.j, l == null ? this.f4320a : l.longValue());
    }
}
