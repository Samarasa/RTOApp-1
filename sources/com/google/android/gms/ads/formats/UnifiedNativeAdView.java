package com.google.android.gms.ads.formats;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c.b.b.b.c.a;
import c.b.b.b.c.b;
import com.google.android.gms.ads.o;
import com.google.android.gms.common.internal.C0563t;
import com.google.android.gms.internal.ads.C1018Rk;
import com.google.android.gms.internal.ads.C1164Xa;
import com.google.android.gms.internal.ads.C1216Za;
import com.google.android.gms.internal.ads.C1793hb;
import com.google.android.gms.internal.ads.C2360pb;
import com.google.android.gms.internal.ads.F;
import com.google.android.gms.internal.ads.Qqa;
import com.google.android.gms.internal.ads.lsa;

public final class UnifiedNativeAdView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private final FrameLayout f5403a;

    /* renamed from: b  reason: collision with root package name */
    private final C2360pb f5404b = a();

    public UnifiedNativeAdView(Context context) {
        super(context);
        this.f5403a = a(context);
    }

    public UnifiedNativeAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5403a = a(context);
    }

    public UnifiedNativeAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5403a = a(context);
    }

    @TargetApi(21)
    public UnifiedNativeAdView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f5403a = a(context);
    }

    private final View a(String str) {
        try {
            a r = this.f5404b.r(str);
            if (r != null) {
                return (View) b.Q(r);
            }
            return null;
        } catch (RemoteException e2) {
            C1018Rk.b("Unable to call getAssetView on delegate", e2);
            return null;
        }
    }

    private final FrameLayout a(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        return frameLayout;
    }

    private final C2360pb a() {
        C0563t.a(this.f5403a, (Object) "createDelegate must be called after overlayFrame has been created");
        if (isInEditMode()) {
            return null;
        }
        return Qqa.b().a(this.f5403a.getContext(), (FrameLayout) this, this.f5403a);
    }

    private final void a(String str, View view) {
        try {
            this.f5404b.a(str, b.a(view));
        } catch (RemoteException e2) {
            C1018Rk.b("Unable to call setAssetView on delegate", e2);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(ImageView.ScaleType scaleType) {
        if (scaleType != null) {
            try {
                this.f5404b.u(b.a(scaleType));
            } catch (RemoteException e2) {
                C1018Rk.b("Unable to call setMediaViewImageScaleType on delegate", e2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(o oVar) {
        try {
            if (oVar instanceof lsa) {
                this.f5404b.a(((lsa) oVar).a());
            } else if (oVar == null) {
                this.f5404b.a((C1793hb) null);
            } else {
                C1018Rk.a("Use MediaContent provided by UnifiedNativeAd.getMediaContent");
            }
        } catch (RemoteException e2) {
            C1018Rk.b("Unable to call setMediaContent on delegate", e2);
        }
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        super.bringChildToFront(this.f5403a);
    }

    public final void bringChildToFront(View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.f5403a;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C2360pb pbVar;
        if (((Boolean) Qqa.e().a(F.Vb)).booleanValue() && (pbVar = this.f5404b) != null) {
            try {
                pbVar.g(b.a(motionEvent));
            } catch (RemoteException e2) {
                C1018Rk.b("Unable to call handleTouchEvent on delegate", e2);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final a getAdChoicesView() {
        View a2 = a("3011");
        if (a2 instanceof a) {
            return (a) a2;
        }
        return null;
    }

    public final View getAdvertiserView() {
        return a("3005");
    }

    public final View getBodyView() {
        return a("3004");
    }

    public final View getCallToActionView() {
        return a("3002");
    }

    public final View getHeadlineView() {
        return a("3001");
    }

    public final View getIconView() {
        return a("3003");
    }

    public final View getImageView() {
        return a("3008");
    }

    public final MediaView getMediaView() {
        View a2 = a("3010");
        if (a2 instanceof MediaView) {
            return (MediaView) a2;
        }
        if (a2 == null) {
            return null;
        }
        C1018Rk.a("View is not an instance of MediaView");
        return null;
    }

    public final View getPriceView() {
        return a("3007");
    }

    public final View getStarRatingView() {
        return a("3009");
    }

    public final View getStoreView() {
        return a("3006");
    }

    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        C2360pb pbVar = this.f5404b;
        if (pbVar != null) {
            try {
                pbVar.a(b.a(view), i);
            } catch (RemoteException e2) {
                C1018Rk.b("Unable to call onVisibilityChanged on delegate", e2);
            }
        }
    }

    public final void removeAllViews() {
        super.removeAllViews();
        super.addView(this.f5403a);
    }

    public final void removeView(View view) {
        if (this.f5403a != view) {
            super.removeView(view);
        }
    }

    public final void setAdChoicesView(a aVar) {
        a("3011", aVar);
    }

    public final void setAdvertiserView(View view) {
        a("3005", view);
    }

    public final void setBodyView(View view) {
        a("3004", view);
    }

    public final void setCallToActionView(View view) {
        a("3002", view);
    }

    public final void setClickConfirmingView(View view) {
        try {
            this.f5404b.c(b.a(view));
        } catch (RemoteException e2) {
            C1018Rk.b("Unable to call setClickConfirmingView on delegate", e2);
        }
    }

    public final void setHeadlineView(View view) {
        a("3001", view);
    }

    public final void setIconView(View view) {
        a("3003", view);
    }

    public final void setImageView(View view) {
        a("3008", view);
    }

    public final void setMediaView(MediaView mediaView) {
        a("3010", mediaView);
        if (mediaView != null) {
            mediaView.a((C1164Xa) new m(this));
            mediaView.a((C1216Za) new n(this));
        }
    }

    public final void setNativeAd(j jVar) {
        try {
            this.f5404b.e((a) jVar.l());
        } catch (RemoteException e2) {
            C1018Rk.b("Unable to call setNativeAd on delegate", e2);
        }
    }

    public final void setPriceView(View view) {
        a("3007", view);
    }

    public final void setStarRatingView(View view) {
        a("3009", view);
    }

    public final void setStoreView(View view) {
        a("3006", view);
    }
}
