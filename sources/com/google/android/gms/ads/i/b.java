package com.google.android.gms.ads.i;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.c;
import com.google.android.gms.ads.f;
import com.google.android.gms.internal.ads.C1018Rk;
import com.google.android.gms.internal.ads.csa;

public final class b extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    private final csa f5434a;

    public final c getAdListener() {
        return this.f5434a.b();
    }

    public final f getAdSize() {
        return this.f5434a.c();
    }

    public final String getAdUnitId() {
        return this.f5434a.e();
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
        this.f5434a.a(cVar);
    }

    public final void setAdSize(f fVar) {
        this.f5434a.a(fVar);
    }

    public final void setAdUnitId(String str) {
        this.f5434a.a(str);
    }
}
