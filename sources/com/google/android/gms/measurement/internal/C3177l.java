package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C0563t;
import java.util.Iterator;

/* renamed from: com.google.android.gms.measurement.internal.l  reason: case insensitive filesystem */
public final class C3177l {

    /* renamed from: a  reason: collision with root package name */
    final String f13654a;

    /* renamed from: b  reason: collision with root package name */
    final String f13655b;

    /* renamed from: c  reason: collision with root package name */
    private final String f13656c;

    /* renamed from: d  reason: collision with root package name */
    final long f13657d;

    /* renamed from: e  reason: collision with root package name */
    final long f13658e;

    /* renamed from: f  reason: collision with root package name */
    final C3187n f13659f;

    C3177l(C3144fc fcVar, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        C3187n nVar;
        C0563t.b(str2);
        C0563t.b(str3);
        this.f13654a = str2;
        this.f13655b = str3;
        this.f13656c = TextUtils.isEmpty(str) ? null : str;
        this.f13657d = j;
        this.f13658e = j2;
        long j3 = this.f13658e;
        if (j3 != 0 && j3 > this.f13657d) {
            fcVar.h().w().a("Event created with reverse previous/current timestamps. appId", Bb.a(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            nVar = new C3187n(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String str4 = (String) it.next();
                if (str4 == null) {
                    fcVar.h().t().a("Param name can't be null");
                } else {
                    Object a2 = fcVar.v().a(str4, bundle2.get(str4));
                    if (a2 == null) {
                        fcVar.h().w().a("Param value can't be null", fcVar.w().b(str4));
                    } else {
                        fcVar.v().a(bundle2, str4, a2);
                    }
                }
                it.remove();
            }
            nVar = new C3187n(bundle2);
        }
        this.f13659f = nVar;
    }

    private C3177l(C3144fc fcVar, String str, String str2, String str3, long j, long j2, C3187n nVar) {
        C0563t.b(str2);
        C0563t.b(str3);
        C0563t.a(nVar);
        this.f13654a = str2;
        this.f13655b = str3;
        this.f13656c = TextUtils.isEmpty(str) ? null : str;
        this.f13657d = j;
        this.f13658e = j2;
        long j3 = this.f13658e;
        if (j3 != 0 && j3 > this.f13657d) {
            fcVar.h().w().a("Event created with reverse previous/current timestamps. appId, name", Bb.a(str2), Bb.a(str3));
        }
        this.f13659f = nVar;
    }

    /* access modifiers changed from: package-private */
    public final C3177l a(C3144fc fcVar, long j) {
        return new C3177l(fcVar, this.f13656c, this.f13654a, this.f13655b, this.f13657d, j, this.f13659f);
    }

    public final String toString() {
        String str = this.f13654a;
        String str2 = this.f13655b;
        String valueOf = String.valueOf(this.f13659f);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("Event{appId='");
        sb.append(str);
        sb.append("', name='");
        sb.append(str2);
        sb.append("', params=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }
}
