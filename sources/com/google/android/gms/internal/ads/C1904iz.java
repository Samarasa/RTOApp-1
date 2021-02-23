package com.google.android.gms.internal.ads;

import android.view.ViewGroup;
import com.google.android.gms.internal.ads.C1616eu;

/* renamed from: com.google.android.gms.internal.ads.iz  reason: case insensitive filesystem */
public final class C1904iz implements Xga<C0584As<C0583Ar>> {

    /* renamed from: a  reason: collision with root package name */
    private final C1876iha<C0710Fo> f10869a;

    /* renamed from: b  reason: collision with root package name */
    private final C1876iha<C1616eu.a> f10870b;

    /* renamed from: c  reason: collision with root package name */
    private final C1876iha<C1004Qw> f10871c;

    /* renamed from: d  reason: collision with root package name */
    private final C1876iha<C1136Vy> f10872d;

    /* renamed from: e  reason: collision with root package name */
    private final C1876iha<C0587Av> f10873e;

    public C1904iz(C1876iha<C0710Fo> iha, C1876iha<C1616eu.a> iha2, C1876iha<C1004Qw> iha3, C1876iha<C1136Vy> iha4, C1876iha<C0587Av> iha5) {
        this.f10869a = iha;
        this.f10870b = iha2;
        this.f10871c = iha3;
        this.f10872d = iha4;
        this.f10873e = iha5;
    }

    public final /* synthetic */ Object get() {
        C1129Vr h2 = this.f10869a.get().h();
        h2.f(this.f10870b.get().a());
        h2.d(this.f10871c.get());
        h2.a(this.f10872d.get());
        h2.b(new C2058lK((C1508da) null));
        h2.a(new C2535rs(this.f10873e.get()));
        h2.a(new C2746ur((ViewGroup) null));
        C0584As<C0583Ar> c2 = h2.e().c();
        C1452cha.a(c2, "Cannot return null from a non-@Nullable @Provides method");
        return c2;
    }
}
