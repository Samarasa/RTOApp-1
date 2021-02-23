package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import c.b.b.b.d.f.La;
import com.google.android.gms.common.stats.a;

final class Tb implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ La f13418a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ ServiceConnection f13419b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Ub f13420c;

    Tb(Ub ub, La la, ServiceConnection serviceConnection) {
        this.f13420c = ub;
        this.f13418a = la;
        this.f13419b = serviceConnection;
    }

    public final void run() {
        Db t;
        String str;
        Ub ub = this.f13420c;
        Rb rb = ub.f13431b;
        String a2 = ub.f13430a;
        La la = this.f13418a;
        ServiceConnection serviceConnection = this.f13419b;
        Bundle a3 = rb.a(a2, la);
        rb.f13402a.g().c();
        if (a3 != null) {
            long j = a3.getLong("install_begin_timestamp_seconds", 0) * 1000;
            if (j == 0) {
                t = rb.f13402a.h().t();
                str = "Service response is missing Install Referrer install timestamp";
            } else {
                String string = a3.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    t = rb.f13402a.h().t();
                    str = "No referrer defined in install referrer response";
                } else {
                    rb.f13402a.h().B().a("InstallReferrer API result", string);
                    se v = rb.f13402a.v();
                    String valueOf = String.valueOf(string);
                    Bundle a4 = v.a(Uri.parse(valueOf.length() != 0 ? "?".concat(valueOf) : new String("?")));
                    if (a4 == null) {
                        t = rb.f13402a.h().t();
                        str = "No campaign params defined in install referrer result";
                    } else {
                        String string2 = a4.getString("medium");
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j2 = a3.getLong("referrer_click_timestamp_seconds", 0) * 1000;
                            if (j2 == 0) {
                                t = rb.f13402a.h().t();
                                str = "Install Referrer is missing click timestamp for ad campaign";
                            } else {
                                a4.putLong("click_timestamp", j2);
                            }
                        }
                        if (j == rb.f13402a.p().l.a()) {
                            rb.f13402a.i();
                            t = rb.f13402a.h().B();
                            str = "Campaign has already been logged";
                        } else {
                            rb.f13402a.p().l.a(j);
                            rb.f13402a.i();
                            rb.f13402a.h().B().a("Logging Install Referrer campaign from sdk with ", "referrer API");
                            a4.putString("_cis", "referrer API");
                            rb.f13402a.u().a("auto", "_cmp", a4);
                        }
                    }
                }
            }
            t.a(str);
        }
        if (serviceConnection != null) {
            a.a().a(rb.f13402a.f(), serviceConnection);
        }
    }
}
