package com.google.android.gms.ads.formats;

import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import c.b.b.b.c.a;
import c.b.b.b.c.b;
import com.google.android.gms.internal.ads.C1018Rk;
import com.google.android.gms.internal.ads.C2360pb;
import com.google.android.gms.internal.ads.F;
import com.google.android.gms.internal.ads.Qqa;

@Deprecated
public class d extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private final FrameLayout f5419a;

    /* renamed from: b  reason: collision with root package name */
    private final C2360pb f5420b;

    /* access modifiers changed from: protected */
    public final View a(String str) {
        try {
            a r = this.f5420b.r(str);
            if (r != null) {
                return (View) b.Q(r);
            }
            return null;
        } catch (RemoteException e2) {
            C1018Rk.b("Unable to call getAssetView on delegate", e2);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final void a(String str, View view) {
        try {
            this.f5420b.a(str, b.a(view));
        } catch (RemoteException e2) {
            C1018Rk.b("Unable to call setAssetView on delegate", e2);
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.f5419a);
    }

    public void bringChildToFront(View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.f5419a;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C2360pb pbVar;
        if (((Boolean) Qqa.e().a(F.Vb)).booleanValue() && (pbVar = this.f5420b) != null) {
            try {
                pbVar.g(b.a(motionEvent));
            } catch (RemoteException e2) {
                C1018Rk.b("Unable to call handleTouchEvent on delegate", e2);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public a getAdChoicesView() {
        View a2 = a("1098");
        if (a2 instanceof a) {
            return (a) a2;
        }
        return null;
    }

    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        C2360pb pbVar = this.f5420b;
        if (pbVar != null) {
            try {
                pbVar.a(b.a(view), i);
            } catch (RemoteException e2) {
                C1018Rk.b("Unable to call onVisibilityChanged on delegate", e2);
            }
        }
    }

    public void removeAllViews() {
        super.removeAllViews();
        super.addView(this.f5419a);
    }

    public void removeView(View view) {
        if (this.f5419a != view) {
            super.removeView(view);
        }
    }

    public void setAdChoicesView(a aVar) {
        a("1098", aVar);
    }

    public void setNativeAd(b bVar) {
        try {
            this.f5420b.e((a) bVar.a());
        } catch (RemoteException e2) {
            C1018Rk.b("Unable to call setNativeAd on delegate", e2);
        }
    }
}
