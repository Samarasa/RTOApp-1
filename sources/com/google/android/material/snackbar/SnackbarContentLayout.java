package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import b.h.j.y;
import c.b.b.c.b;
import c.b.b.c.f;
import c.b.b.c.f.a;
import c.b.b.c.k;

public class SnackbarContentLayout extends LinearLayout implements r {

    /* renamed from: a  reason: collision with root package name */
    private TextView f14152a;

    /* renamed from: b  reason: collision with root package name */
    private Button f14153b;

    /* renamed from: c  reason: collision with root package name */
    private int f14154c;

    /* renamed from: d  reason: collision with root package name */
    private int f14155d;

    public SnackbarContentLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.SnackbarLayout);
        this.f14154c = obtainStyledAttributes.getDimensionPixelSize(k.SnackbarLayout_android_maxWidth, -1);
        this.f14155d = obtainStyledAttributes.getDimensionPixelSize(k.SnackbarLayout_maxActionInlineWidth, -1);
        obtainStyledAttributes.recycle();
    }

    private static void a(View view, int i, int i2) {
        if (y.C(view)) {
            y.a(view, y.q(view), i, y.p(view), i2);
        } else {
            view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), i2);
        }
    }

    private boolean a(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f14152a.getPaddingTop() == i2 && this.f14152a.getPaddingBottom() == i3) {
            return z;
        }
        a((View) this.f14152a, i2, i3);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void a(float f2) {
        if (f2 != 1.0f) {
            this.f14153b.setTextColor(a.a(a.a((View) this, b.colorSurface), this.f14153b.getCurrentTextColor(), f2));
        }
    }

    public void a(int i, int i2) {
        this.f14152a.setAlpha(0.0f);
        long j = (long) i2;
        long j2 = (long) i;
        this.f14152a.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        if (this.f14153b.getVisibility() == 0) {
            this.f14153b.setAlpha(0.0f);
            this.f14153b.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        }
    }

    public void b(int i, int i2) {
        this.f14152a.setAlpha(1.0f);
        long j = (long) i2;
        long j2 = (long) i;
        this.f14152a.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
        if (this.f14153b.getVisibility() == 0) {
            this.f14153b.setAlpha(1.0f);
            this.f14153b.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
        }
    }

    public Button getActionView() {
        return this.f14153b;
    }

    public TextView getMessageView() {
        return this.f14152a;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f14152a = (TextView) findViewById(f.snackbar_text);
        this.f14153b = (Button) findViewById(f.snackbar_action);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        if (a(1, r0, r0 - r1) != false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005e, code lost:
        if (a(0, r0, r0) != false) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.f14154c
            if (r0 <= 0) goto L_0x0018
            int r0 = r7.getMeasuredWidth()
            int r1 = r7.f14154c
            if (r0 <= r1) goto L_0x0018
            r8 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            super.onMeasure(r8, r9)
        L_0x0018:
            android.content.res.Resources r0 = r7.getResources()
            int r1 = c.b.b.c.d.design_snackbar_padding_vertical_2lines
            int r0 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r1 = r7.getResources()
            int r2 = c.b.b.c.d.design_snackbar_padding_vertical
            int r1 = r1.getDimensionPixelSize(r2)
            android.widget.TextView r2 = r7.f14152a
            android.text.Layout r2 = r2.getLayout()
            int r2 = r2.getLineCount()
            r3 = 0
            r4 = 1
            if (r2 <= r4) goto L_0x003c
            r2 = 1
            goto L_0x003d
        L_0x003c:
            r2 = 0
        L_0x003d:
            if (r2 == 0) goto L_0x0056
            int r5 = r7.f14155d
            if (r5 <= 0) goto L_0x0056
            android.widget.Button r5 = r7.f14153b
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.f14155d
            if (r5 <= r6) goto L_0x0056
            int r1 = r0 - r1
            boolean r0 = r7.a((int) r4, (int) r0, (int) r1)
            if (r0 == 0) goto L_0x0061
            goto L_0x0062
        L_0x0056:
            if (r2 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r0 = r1
        L_0x005a:
            boolean r0 = r7.a((int) r3, (int) r0, (int) r0)
            if (r0 == 0) goto L_0x0061
            goto L_0x0062
        L_0x0061:
            r4 = 0
        L_0x0062:
            if (r4 == 0) goto L_0x0067
            super.onMeasure(r8, r9)
        L_0x0067:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }
}
