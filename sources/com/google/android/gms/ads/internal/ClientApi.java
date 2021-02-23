package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import c.b.b.b.c.a;
import c.b.b.b.c.b;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.t;
import com.google.android.gms.ads.internal.overlay.u;
import com.google.android.gms.ads.internal.overlay.w;
import com.google.android.gms.ads.internal.overlay.z;
import com.google.android.gms.internal.ads.C0675Ef;
import com.google.android.gms.internal.ads.C0710Fo;
import com.google.android.gms.internal.ads.C0755Hh;
import com.google.android.gms.internal.ads.C0964Pi;
import com.google.android.gms.internal.ads.C1200Yk;
import com.google.android.gms.internal.ads.C1340bA;
import com.google.android.gms.internal.ads.C1552eA;
import com.google.android.gms.internal.ads.C1755gra;
import com.google.android.gms.internal.ads.C1875ih;
import com.google.android.gms.internal.ads.C1952jk;
import com.google.android.gms.internal.ads.C1993kQ;
import com.google.android.gms.internal.ads.C2064lQ;
import com.google.android.gms.internal.ads.C2305oj;
import com.google.android.gms.internal.ads.C2360pb;
import com.google.android.gms.internal.ads.C2462qqa;
import com.google.android.gms.internal.ads.C2572sb;
import com.google.android.gms.internal.ads.C2605sra;
import com.google.android.gms.internal.ads.C2633tS;
import com.google.android.gms.internal.ads.C2868wh;
import com.google.android.gms.internal.ads.C2889wra;
import com.google.android.gms.internal.ads.F;
import com.google.android.gms.internal.ads.GK;
import com.google.android.gms.internal.ads.GR;
import com.google.android.gms.internal.ads.IK;
import com.google.android.gms.internal.ads.Qqa;
import com.google.android.gms.internal.ads.Zqa;
import java.util.HashMap;

public class ClientApi extends C2605sra {
    public final C0755Hh H(a aVar) {
        return null;
    }

    public final C2889wra M(a aVar) {
        return null;
    }

    public final C1755gra a(a aVar, C2462qqa qqa, String str, int i) {
        return new j((Context) b.Q(aVar), qqa, str, new C1200Yk(203404000, i, true, false));
    }

    public final C1755gra a(a aVar, C2462qqa qqa, String str, C0675Ef ef, int i) {
        Context context = (Context) b.Q(aVar);
        return new IK(C0710Fo.a(context, ef, i), context, qqa, str);
    }

    public final C1875ih a(a aVar, C0675Ef ef, int i) {
        return C0710Fo.a((Context) b.Q(aVar), ef, i).s();
    }

    public final Zqa b(a aVar, String str, C0675Ef ef, int i) {
        Context context = (Context) b.Q(aVar);
        return new GK(C0710Fo.a(context, ef, i), context, str);
    }

    public final C1755gra b(a aVar, C2462qqa qqa, String str, C0675Ef ef, int i) {
        Context context = (Context) b.Q(aVar);
        C0710Fo.a(context, ef, i);
        GR m = C0710Fo.a(context, ef, i).m();
        m.a(context);
        m.a(qqa);
        m.a(str);
        return m.a().a();
    }

    public final C2572sb b(a aVar, a aVar2, a aVar3) {
        return new C1340bA((View) b.Q(aVar), (HashMap) b.Q(aVar2), (HashMap) b.Q(aVar3));
    }

    public final C1755gra c(a aVar, C2462qqa qqa, String str, C0675Ef ef, int i) {
        Context context = (Context) b.Q(aVar);
        C1993kQ k = C0710Fo.a(context, ef, i).k();
        k.a(str);
        k.a(context);
        C2064lQ a2 = k.a();
        return i >= ((Integer) Qqa.e().a(F.zd)).intValue() ? a2.b() : a2.a();
    }

    public final C1952jk c(a aVar, C0675Ef ef, int i) {
        return C0710Fo.a((Context) b.Q(aVar), ef, i).r();
    }

    public final C2305oj c(a aVar, String str, C0675Ef ef, int i) {
        Context context = (Context) b.Q(aVar);
        C2633tS p = C0710Fo.a(context, ef, i).p();
        p.a(context);
        p.a(str);
        return p.a().a();
    }

    public final C0964Pi d(a aVar, C0675Ef ef, int i) {
        Context context = (Context) b.Q(aVar);
        C2633tS p = C0710Fo.a(context, ef, i).p();
        p.a(context);
        return p.a().b();
    }

    public final C2360pb d(a aVar, a aVar2) {
        return new C1552eA((FrameLayout) b.Q(aVar), (FrameLayout) b.Q(aVar2), 203404000);
    }

    public final C2889wra d(a aVar, int i) {
        return C0710Fo.a((Context) b.Q(aVar), i).g();
    }

    public final C2868wh x(a aVar) {
        Activity activity = (Activity) b.Q(aVar);
        AdOverlayInfoParcel a2 = AdOverlayInfoParcel.a(activity.getIntent());
        if (a2 == null) {
            return new t(activity);
        }
        int i = a2.k;
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? new t(activity) : new w(activity, a2) : new com.google.android.gms.ads.internal.overlay.b(activity) : new z(activity) : new u(activity);
    }
}
