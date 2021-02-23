package com.google.android.gms.ads.formats;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.ads.o;
import com.google.android.gms.internal.ads.C1164Xa;
import com.google.android.gms.internal.ads.C1216Za;

public class MediaView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private o f5397a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f5398b;

    /* renamed from: c  reason: collision with root package name */
    private C1164Xa f5399c;

    /* renamed from: d  reason: collision with root package name */
    private ImageView.ScaleType f5400d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f5401e;

    /* renamed from: f  reason: collision with root package name */
    private C1216Za f5402f;

    public MediaView(Context context) {
        super(context);
    }

    public MediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MediaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @TargetApi(21)
    public MediaView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* access modifiers changed from: protected */
    public final synchronized void a(C1164Xa xa) {
        this.f5399c = xa;
        if (this.f5398b) {
            xa.a(this.f5397a);
        }
    }

    /* access modifiers changed from: protected */
    public final synchronized void a(C1216Za za) {
        this.f5402f = za;
        if (this.f5401e) {
            za.a(this.f5400d);
        }
    }

    public void setImageScaleType(ImageView.ScaleType scaleType) {
        this.f5401e = true;
        this.f5400d = scaleType;
        C1216Za za = this.f5402f;
        if (za != null) {
            za.a(this.f5400d);
        }
    }

    public void setMediaContent(o oVar) {
        this.f5398b = true;
        this.f5397a = oVar;
        C1164Xa xa = this.f5399c;
        if (xa != null) {
            xa.a(oVar);
        }
    }
}
