package com.google.android.gms.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.b.a;
import com.google.android.gms.internal.ads.C1018Rk;
import com.google.android.gms.internal.ads.C1540dqa;
import com.google.android.gms.internal.ads.csa;

class j extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    protected final csa f5670a;

    public j(Context context, int i) {
        super(context);
        this.f5670a = new csa(this, i);
    }

    public void a() {
        this.f5670a.a();
    }

    public void a(e eVar) {
        this.f5670a.a(eVar.a());
    }

    public void b() {
        this.f5670a.l();
    }

    public void c() {
        this.f5670a.m();
    }

    public c getAdListener() {
        return this.f5670a.b();
    }

    public f getAdSize() {
        return this.f5670a.c();
    }

    public String getAdUnitId() {
        return this.f5670a.e();
    }

    @Deprecated
    public String getMediationAdapterClassName() {
        return this.f5670a.g();
    }

    public u getResponseInfo() {
        return this.f5670a.i();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
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
    public void onMeasure(int i, int i2) {
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

    public void setAdListener(c cVar) {
        this.f5670a.a(cVar);
        if (cVar == null) {
            this.f5670a.a((C1540dqa) null);
            this.f5670a.a((a) null);
            return;
        }
        if (cVar instanceof C1540dqa) {
            this.f5670a.a((C1540dqa) cVar);
        }
        if (cVar instanceof a) {
            this.f5670a.a((a) cVar);
        }
    }

    public void setAdSize(f fVar) {
        this.f5670a.a(fVar);
    }

    public void setAdUnitId(String str) {
        this.f5670a.a(str);
    }

    public void setOnPaidEventListener(r rVar) {
        this.f5670a.a(rVar);
    }
}
