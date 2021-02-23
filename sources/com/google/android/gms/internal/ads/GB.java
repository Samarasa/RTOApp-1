package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import c.b.b.b.c.a;
import c.b.b.b.c.b;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.oa;
import com.google.android.gms.common.internal.C0563t;
import java.util.Collections;

public final class GB extends C0881Md implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, C1112Va {

    /* renamed from: a  reason: collision with root package name */
    private View f6980a;

    /* renamed from: b  reason: collision with root package name */
    private Sra f6981b;

    /* renamed from: c  reason: collision with root package name */
    private C3110zz f6982c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f6983d = false;

    /* renamed from: e  reason: collision with root package name */
    private boolean f6984e = false;

    public GB(C3110zz zzVar, C0877Lz lz) {
        this.f6980a = lz.s();
        this.f6981b = lz.n();
        this.f6982c = zzVar;
        if (lz.t() != null) {
            lz.t().a((C1112Va) this);
        }
    }

    private final void _b() {
        View view = this.f6980a;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f6980a);
            }
        }
    }

    private static void a(C0933Od od, int i) {
        try {
            od.j(i);
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
        }
    }

    private final void ac() {
        View view;
        C3110zz zzVar = this.f6982c;
        if (zzVar != null && (view = this.f6980a) != null) {
            zzVar.a(view, Collections.emptyMap(), Collections.emptyMap(), C3110zz.d(this.f6980a));
        }
    }

    public final void C(a aVar) {
        C0563t.a("#008 Must be called on the main UI thread.");
        a(aVar, (C0933Od) new IB(this));
    }

    public final void Xb() {
        oa.f5628a.post(new JB(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void Zb() {
        try {
            destroy();
        } catch (RemoteException e2) {
            C1018Rk.d("#007 Could not call remote method.", e2);
        }
    }

    public final void a(a aVar, C0933Od od) {
        C0563t.a("#008 Must be called on the main UI thread.");
        if (this.f6983d) {
            C1018Rk.b("Instream ad can not be shown after destroy().");
            a(od, 2);
        } else if (this.f6980a == null || this.f6981b == null) {
            String str = this.f6980a == null ? "can not get video view." : "can not get video controller.";
            C1018Rk.b(str.length() != 0 ? "Instream internal error: ".concat(str) : new String("Instream internal error: "));
            a(od, 0);
        } else if (this.f6984e) {
            C1018Rk.b("Instream ad should not be used again.");
            a(od, 1);
        } else {
            this.f6984e = true;
            _b();
            ((ViewGroup) b.Q(aVar)).addView(this.f6980a, new ViewGroup.LayoutParams(-1, -1));
            p.z();
            C2309ol.a(this.f6980a, (ViewTreeObserver.OnGlobalLayoutListener) this);
            p.z();
            C2309ol.a(this.f6980a, (ViewTreeObserver.OnScrollChangedListener) this);
            ac();
            try {
                od.Wa();
            } catch (RemoteException e2) {
                C1018Rk.d("#007 Could not call remote method.", e2);
            }
        }
    }

    public final void destroy() {
        C0563t.a("#008 Must be called on the main UI thread.");
        _b();
        C3110zz zzVar = this.f6982c;
        if (zzVar != null) {
            zzVar.a();
        }
        this.f6982c = null;
        this.f6980a = null;
        this.f6981b = null;
        this.f6983d = true;
    }

    public final Sra getVideoController() {
        C0563t.a("#008 Must be called on the main UI thread.");
        if (!this.f6983d) {
            return this.f6981b;
        }
        C1018Rk.b("getVideoController: Instream ad should not be used after destroyed");
        return null;
    }

    public final C1793hb ja() {
        C0563t.a("#008 Must be called on the main UI thread.");
        if (this.f6983d) {
            C1018Rk.b("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        C3110zz zzVar = this.f6982c;
        if (zzVar == null || zzVar.m() == null) {
            return null;
        }
        return this.f6982c.m().a();
    }

    public final void onGlobalLayout() {
        ac();
    }

    public final void onScrollChanged() {
        ac();
    }
}
