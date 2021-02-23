package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.p;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.rN  reason: case insensitive filesystem */
final /* synthetic */ class C2486rN implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final C2557sN f11953a;

    C2486rN(C2557sN sNVar) {
        this.f11953a = sNVar;
    }

    public final Object call() {
        String str;
        String str2;
        String str3;
        p.c();
        Lna l = p.g().i().l();
        Bundle bundle = null;
        if (!(l == null || l == null || (p.g().i().i() && p.g().i().d()))) {
            if (l.d()) {
                l.a();
            }
            Fna c2 = l.c();
            if (c2 != null) {
                str2 = c2.c();
                str = c2.d();
                str3 = c2.e();
                if (str2 != null) {
                    p.g().i().c(str2);
                }
                if (str3 != null) {
                    p.g().i().d(str3);
                }
            } else {
                str2 = p.g().i().f();
                str3 = p.g().i().b();
                str = null;
            }
            Bundle bundle2 = new Bundle(1);
            if (!p.g().i().d()) {
                if (str3 == null || TextUtils.isEmpty(str3)) {
                    str3 = "no_hash";
                }
                bundle2.putString("v_fp_vertical", str3);
            }
            if (str2 != null && !p.g().i().i()) {
                bundle2.putString("fingerprint", str2);
                if (!str2.equals(str)) {
                    bundle2.putString("v_fp", str);
                }
            }
            if (!bundle2.isEmpty()) {
                bundle = bundle2;
            }
        }
        return new C2345pN(bundle);
    }
}
