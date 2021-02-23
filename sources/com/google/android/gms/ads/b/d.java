package com.google.android.gms.ads.b;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.c;
import com.google.android.gms.ads.f;
import com.google.android.gms.ads.k;
import com.google.android.gms.ads.u;
import com.google.android.gms.ads.v;
import com.google.android.gms.ads.w;
import com.google.android.gms.internal.ads.C1018Rk;
import com.google.android.gms.internal.ads.csa;

public final class d extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    private final csa f5356a;

    public final c getAdListener() {
        return this.f5356a.b();
    }

    public final f getAdSize() {
        return this.f5356a.c();
    }

    public final f[] getAdSizes() {
        return this.f5356a.d();
    }

    public final String getAdUnitId() {
        return this.f5356a.e();
    }

    public final a getAppEventListener() {
        return this.f5356a.f();
    }

    @Deprecated
    public final String getMediationAdapterClassName() {
        return this.f5356a.g();
    }

    public final c getOnCustomRenderedAdLoadedListener() {
        return this.f5356a.h();
    }

    public final u getResponseInfo() {
        return this.f5356a.i();
    }

    public final v getVideoController() {
        return this.f5356a.j();
    }

    public final w getVideoOptions() {
        return this.f5356a.k();
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null && childAt.getVisibility() != 8) {
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i5 = ((i3 - i) - measuredWidth) / 2;
            int i6 = ((i4 - i2) - measuredHeight) / 2;
            childAt.layout(i5, i6, measuredWidth + i5, measuredHeight + i6);
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4 = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            f fVar = null;
            try {
                fVar = getAdSize();
            } catch (NullPointerException e2) {
                C1018Rk.b("Unable to retrieve ad size.", e2);
            }
            if (fVar != null) {
                Context context = getContext();
                int b2 = fVar.b(context);
                i3 = fVar.a(context);
                i4 = b2;
            } else {
                i3 = 0;
            }
        } else {
            measureChild(childAt, i, i2);
            i4 = childAt.getMeasuredWidth();
            i3 = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(i4, getSuggestedMinimumWidth()), i), View.resolveSize(Math.max(i3, getSuggestedMinimumHeight()), i2));
    }

    public final void setAdListener(c cVar) {
        this.f5356a.a(cVar);
    }

    public final void setAdSizes(f... fVarArr) {
        if (fVarArr == null || fVarArr.length <= 0) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.f5356a.b(fVarArr);
    }

    public final void setAdUnitId(String str) {
        this.f5356a.a(str);
    }

    public final void setAppEventListener(a aVar) {
        this.f5356a.a(aVar);
    }

    @Deprecated
    public final void setCorrelator(k kVar) {
    }

    public final void setManualImpressionsEnabled(boolean z) {
        this.f5356a.a(z);
    }

    public final void setOnCustomRenderedAdLoadedListener(c cVar) {
        this.f5356a.a(cVar);
    }

    public final void setVideoOptions(w wVar) {
        this.f5356a.a(wVar);
    }
}
