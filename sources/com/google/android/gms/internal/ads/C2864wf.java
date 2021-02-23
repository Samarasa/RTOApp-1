package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import c.b.b.b.c.b;
import com.google.android.gms.measurement.a.a;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.wf  reason: case insensitive filesystem */
public final class C2864wf extends C3095zo {

    /* renamed from: a  reason: collision with root package name */
    private final a f12649a;

    C2864wf(a aVar) {
        this.f12649a = aVar;
    }

    public final void C(String str) {
        this.f12649a.b(str);
    }

    public final String Ra() {
        return this.f12649a.c();
    }

    public final long Xa() {
        return this.f12649a.a();
    }

    public final String Ya() {
        return this.f12649a.e();
    }

    public final Map a(String str, String str2, boolean z) {
        return this.f12649a.a(str, str2, z);
    }

    public final void a(String str, String str2, c.b.b.b.c.a aVar) {
        this.f12649a.a(str, str2, aVar != null ? b.Q(aVar) : null);
    }

    public final List b(String str, String str2) {
        return this.f12649a.a(str, str2);
    }

    public final void b(c.b.b.b.c.a aVar, String str, String str2) {
        this.f12649a.a(aVar != null ? (Activity) b.Q(aVar) : null, str, str2);
    }

    public final void b(String str, String str2, Bundle bundle) {
        this.f12649a.b(str, str2, bundle);
    }

    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.f12649a.a(str, str2, bundle);
    }

    public final int g(String str) {
        return this.f12649a.c(str);
    }

    public final void i(Bundle bundle) {
        this.f12649a.a(bundle);
    }

    public final Bundle j(Bundle bundle) {
        return this.f12649a.b(bundle);
    }

    public final void l(Bundle bundle) {
        this.f12649a.c(bundle);
    }

    public final String sb() {
        return this.f12649a.b();
    }

    public final String tb() {
        return this.f12649a.f();
    }

    public final void w(String str) {
        this.f12649a.a(str);
    }

    public final String zb() {
        return this.f12649a.d();
    }
}
