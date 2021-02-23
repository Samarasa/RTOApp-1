package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.C0563t;
import com.google.android.gms.common.util.e;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.zb  reason: case insensitive filesystem */
public final class C3248zb extends C3249zc {

    /* renamed from: c  reason: collision with root package name */
    private static final AtomicReference<String[]> f13838c = new AtomicReference<>();

    /* renamed from: d  reason: collision with root package name */
    private static final AtomicReference<String[]> f13839d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    private static final AtomicReference<String[]> f13840e = new AtomicReference<>();

    C3248zb(C3144fc fcVar) {
        super(fcVar);
    }

    private final String a(C3187n nVar) {
        if (nVar == null) {
            return null;
        }
        return !t() ? nVar.toString() : a(nVar.b());
    }

    private static String a(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        String str2;
        C0563t.a(strArr);
        C0563t.a(strArr2);
        C0563t.a(atomicReference);
        C0563t.a(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (se.c(str, strArr[i])) {
                synchronized (atomicReference) {
                    String[] strArr3 = atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    if (strArr3[i] == null) {
                        strArr3[i] = strArr2[i] + "(" + strArr[i] + ")";
                    }
                    str2 = strArr3[i];
                }
                return str2;
            }
        }
        return str;
    }

    private final boolean t() {
        i();
        return this.f13807a.y() && this.f13807a.h().a(3);
    }

    /* access modifiers changed from: protected */
    public final String a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!t()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        for (String str : bundle.keySet()) {
            sb.append(sb.length() != 0 ? ", " : "Bundle[{");
            sb.append(b(str));
            sb.append("=");
            sb.append(bundle.get(str));
        }
        sb.append("}]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public final String a(C3177l lVar) {
        if (lVar == null) {
            return null;
        }
        if (!t()) {
            return lVar.toString();
        }
        return "Event{appId='" + lVar.f13654a + "', name='" + a(lVar.f13655b) + "', params=" + a(lVar.f13659f) + "}";
    }

    /* access modifiers changed from: protected */
    public final String a(C3192o oVar) {
        if (oVar == null) {
            return null;
        }
        if (!t()) {
            return oVar.toString();
        }
        return "origin=" + oVar.f13698c + ",name=" + a(oVar.f13696a) + ",params=" + a(oVar.f13697b);
    }

    /* access modifiers changed from: protected */
    public final String a(String str) {
        if (str == null) {
            return null;
        }
        return !t() ? str : a(str, Ac.f13164b, Ac.f13163a, f13838c);
    }

    /* access modifiers changed from: protected */
    public final String b(String str) {
        if (str == null) {
            return null;
        }
        return !t() ? str : a(str, Dc.f13219b, Dc.f13218a, f13839d);
    }

    /* access modifiers changed from: protected */
    public final String c(String str) {
        if (str == null) {
            return null;
        }
        if (!t()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return a(str, Cc.f13203b, Cc.f13202a, f13840e);
        }
        return "experiment_id" + "(" + str + ")";
    }

    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    public final /* bridge */ /* synthetic */ C3159i d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ C3248zb e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ Context f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ Zb g() {
        return super.g();
    }

    public final /* bridge */ /* synthetic */ Bb h() {
        return super.h();
    }

    public final /* bridge */ /* synthetic */ He i() {
        return super.i();
    }

    public final /* bridge */ /* synthetic */ e j() {
        return super.j();
    }

    public final /* bridge */ /* synthetic */ se k() {
        return super.k();
    }

    public final /* bridge */ /* synthetic */ Lb l() {
        return super.l();
    }

    public final /* bridge */ /* synthetic */ Ie m() {
        return super.m();
    }

    /* access modifiers changed from: protected */
    public final boolean r() {
        return false;
    }
}
