package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.formats.i;

public final class GK extends C1472cra {

    /* renamed from: a  reason: collision with root package name */
    private final Context f7005a;

    /* renamed from: b  reason: collision with root package name */
    private final C0710Fo f7006b;

    /* renamed from: c  reason: collision with root package name */
    private final US f7007c = new US();

    /* renamed from: d  reason: collision with root package name */
    private final C1111Uz f7008d = new C1111Uz();

    /* renamed from: e  reason: collision with root package name */
    private Tqa f7009e;

    public GK(C0710Fo fo, Context context, String str) {
        this.f7006b = fo;
        this.f7007c.a(str);
        this.f7005a = context;
    }

    public final Yqa Bb() {
        C1059Sz a2 = this.f7008d.a();
        this.f7007c.a(a2.f());
        this.f7007c.b(a2.g());
        US us = this.f7007c;
        if (us.f() == null) {
            us.a(C2462qqa.g());
        }
        return new FK(this.f7005a, this.f7006b, this.f7007c, a2, this.f7009e);
    }

    public final void a(i iVar) {
        this.f7007c.a(iVar);
    }

    public final void a(C0853Lb lb) {
        this.f7008d.a(lb);
    }

    public final void a(C0855Ld ld) {
        this.f7007c.a(ld);
    }

    public final void a(C0879Mb mb) {
        this.f7008d.a(mb);
    }

    public final void a(C1037Sd sd) {
        this.f7008d.a(sd);
    }

    public final void a(Tqa tqa) {
        this.f7009e = tqa;
    }

    public final void a(C1217Zb zb, C2462qqa qqa) {
        this.f7008d.a(zb);
        this.f7007c.a(qqa);
    }

    public final void a(C1243_b _bVar) {
        this.f7008d.a(_bVar);
    }

    public final void a(C1368bb bbVar) {
        this.f7007c.a(bbVar);
    }

    public final void a(C2747ura ura) {
        this.f7007c.a(ura);
    }

    public final void a(String str, C1035Sb sb, C1009Rb rb) {
        this.f7008d.a(str, sb, rb);
    }
}
