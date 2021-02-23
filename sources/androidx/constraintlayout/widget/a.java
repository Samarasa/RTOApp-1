package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import b.f.a.a.b;

public class a extends b {

    /* renamed from: g  reason: collision with root package name */
    private int f795g;

    /* renamed from: h  reason: collision with root package name */
    private int f796h;
    private b i;

    public a(Context context) {
        super(context);
        super.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    public void a(AttributeSet attributeSet) {
        super.a(attributeSet);
        this.i = new b();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == i.ConstraintLayout_Layout_barrierDirection) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == i.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.i.c(obtainStyledAttributes.getBoolean(index, true));
                }
            }
        }
        this.f800d = this.i;
        a();
    }

    public int getType() {
        return this.f795g;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.i.c(z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        if (r6 == 6) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003a, code lost:
        if (r6 == 6) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (r6 == 6) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setType(int r6) {
        /*
            r5 = this;
            r5.f795g = r6
            r5.f796h = r6
            int r6 = android.os.Build.VERSION.SDK_INT
            r0 = 6
            r1 = 5
            r2 = 0
            r3 = 1
            r4 = 17
            if (r6 >= r4) goto L_0x001a
            int r6 = r5.f795g
            if (r6 != r1) goto L_0x0015
        L_0x0012:
            r5.f796h = r2
            goto L_0x003d
        L_0x0015:
            if (r6 != r0) goto L_0x003d
        L_0x0017:
            r5.f796h = r3
            goto L_0x003d
        L_0x001a:
            android.content.res.Resources r6 = r5.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
            int r6 = r6.getLayoutDirection()
            if (r3 != r6) goto L_0x002a
            r6 = 1
            goto L_0x002b
        L_0x002a:
            r6 = 0
        L_0x002b:
            if (r6 == 0) goto L_0x0035
            int r6 = r5.f795g
            if (r6 != r1) goto L_0x0032
            goto L_0x0017
        L_0x0032:
            if (r6 != r0) goto L_0x003d
            goto L_0x0012
        L_0x0035:
            int r6 = r5.f795g
            if (r6 != r1) goto L_0x003a
            goto L_0x0012
        L_0x003a:
            if (r6 != r0) goto L_0x003d
            goto L_0x0017
        L_0x003d:
            b.f.a.a.b r6 = r5.i
            int r0 = r5.f796h
            r6.t(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.a.setType(int):void");
    }
}
