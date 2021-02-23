package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.oa;
import java.util.regex.Pattern;

public final class UD implements C2892wu, C0872Lu, C3107zw, C1540dqa {

    /* renamed from: a  reason: collision with root package name */
    private final Context f8860a;

    /* renamed from: b  reason: collision with root package name */
    private final C1642fT f8861b;

    /* renamed from: c  reason: collision with root package name */
    private final C1627fE f8862c;

    /* renamed from: d  reason: collision with root package name */
    private final OS f8863d;

    /* renamed from: e  reason: collision with root package name */
    private final C2988yS f8864e;

    /* renamed from: f  reason: collision with root package name */
    private final C1701gH f8865f;

    /* renamed from: g  reason: collision with root package name */
    private Boolean f8866g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f8867h = ((Boolean) Qqa.e().a(F.af)).booleanValue();

    public UD(Context context, C1642fT fTVar, C1627fE fEVar, OS os, C2988yS ySVar, C1701gH gHVar) {
        this.f8860a = context;
        this.f8861b = fTVar;
        this.f8862c = fEVar;
        this.f8863d = os;
        this.f8864e = ySVar;
        this.f8865f = gHVar;
    }

    private final boolean K() {
        if (this.f8866g == null) {
            synchronized (this) {
                if (this.f8866g == null) {
                    C2331p pVar = F.nb;
                    p.c();
                    this.f8866g = Boolean.valueOf(a((String) Qqa.e().a(pVar), oa.n(this.f8860a)));
                }
            }
        }
        return this.f8866g.booleanValue();
    }

    private final C1556eE a(String str) {
        C1556eE a2 = this.f8862c.a();
        a2.a(this.f8863d.f8088b.f7844b);
        a2.a(this.f8864e);
        a2.a("action", str);
        if (!this.f8864e.s.isEmpty()) {
            a2.a("ancn", this.f8864e.s.get(0));
        }
        if (this.f8864e.ea) {
            p.c();
            a2.a("device_connectivity", oa.p(this.f8860a) ? "online" : "offline");
            a2.a("event_timestamp", String.valueOf(p.j().a()));
            a2.a("offline_ad", "1");
        }
        return a2;
    }

    private final void a(C1556eE eEVar) {
        if (this.f8864e.ea) {
            this.f8865f.a(new C2197nH(p.j().a(), this.f8863d.f8088b.f7844b.f6547b, eEVar.b(), C1489dH.f10122b));
            return;
        }
        eEVar.a();
    }

    private static boolean a(String str, String str2) {
        if (!(str == null || str2 == null)) {
            try {
                return Pattern.matches(str, str2);
            } catch (RuntimeException e2) {
                p.g().a((Throwable) e2, "CsiActionsListener.isPatternMatched");
            }
        }
        return false;
    }

    public final void H() {
        if (K()) {
            a("adapter_shown").a();
        }
    }

    public final void I() {
        if (K() || this.f8864e.ea) {
            a(a("impression"));
        }
    }

    public final void J() {
        if (K()) {
            a("adapter_impression").a();
        }
    }

    public final void L() {
        if (this.f8867h) {
            C1556eE a2 = a("ifts");
            a2.a("reason", "blocked");
            a2.a();
        }
    }

    public final void a(C0954Oy oy) {
        if (this.f8867h) {
            C1556eE a2 = a("ifts");
            a2.a("reason", "exception");
            if (!TextUtils.isEmpty(oy.getMessage())) {
                a2.a("msg", oy.getMessage());
            }
            a2.a();
        }
    }

    public final void b(C1824hqa hqa) {
        C1824hqa hqa2;
        if (this.f8867h) {
            C1556eE a2 = a("ifts");
            a2.a("reason", "adapter");
            int i = hqa.f10744a;
            String str = hqa.f10745b;
            if (hqa.f10746c.equals("com.google.android.gms.ads") && (hqa2 = hqa.f10747d) != null && !hqa2.f10746c.equals("com.google.android.gms.ads")) {
                C1824hqa hqa3 = hqa.f10747d;
                i = hqa3.f10744a;
                str = hqa3.f10745b;
            }
            if (i >= 0) {
                a2.a("arec", String.valueOf(i));
            }
            String a3 = this.f8861b.a(str);
            if (a3 != null) {
                a2.a("areec", a3);
            }
            a2.a();
        }
    }

    public final void onAdClicked() {
        if (this.f8864e.ea) {
            a(a("click"));
        }
    }
}
