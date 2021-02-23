package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import b.h.a.a.h;

public class Aa {

    /* renamed from: a  reason: collision with root package name */
    private final Context f390a;

    /* renamed from: b  reason: collision with root package name */
    private final TypedArray f391b;

    /* renamed from: c  reason: collision with root package name */
    private TypedValue f392c;

    private Aa(Context context, TypedArray typedArray) {
        this.f390a = context;
        this.f391b = typedArray;
    }

    public static Aa a(Context context, int i, int[] iArr) {
        return new Aa(context, context.obtainStyledAttributes(i, iArr));
    }

    public static Aa a(Context context, AttributeSet attributeSet, int[] iArr) {
        return new Aa(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static Aa a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new Aa(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public float a(int i, float f2) {
        return this.f391b.getFloat(i, f2);
    }

    public int a(int i, int i2) {
        return this.f391b.getColor(i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        r0 = b.a.a.a.a.a(r2.f390a, (r0 = r2.f391b.getResourceId(r3, 0)));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.res.ColorStateList a(int r3) {
        /*
            r2 = this;
            android.content.res.TypedArray r0 = r2.f391b
            boolean r0 = r0.hasValue(r3)
            if (r0 == 0) goto L_0x001a
            android.content.res.TypedArray r0 = r2.f391b
            r1 = 0
            int r0 = r0.getResourceId(r3, r1)
            if (r0 == 0) goto L_0x001a
            android.content.Context r1 = r2.f390a
            android.content.res.ColorStateList r0 = b.a.a.a.a.a(r1, r0)
            if (r0 == 0) goto L_0x001a
            return r0
        L_0x001a:
            android.content.res.TypedArray r0 = r2.f391b
            android.content.res.ColorStateList r3 = r0.getColorStateList(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Aa.a(int):android.content.res.ColorStateList");
    }

    public Typeface a(int i, int i2, h.a aVar) {
        int resourceId = this.f391b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f392c == null) {
            this.f392c = new TypedValue();
        }
        return h.a(this.f390a, resourceId, this.f392c, i2, aVar);
    }

    public void a() {
        this.f391b.recycle();
    }

    public boolean a(int i, boolean z) {
        return this.f391b.getBoolean(i, z);
    }

    public int b(int i, int i2) {
        return this.f391b.getDimensionPixelOffset(i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r2.f391b.getResourceId(r3, 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.drawable.Drawable b(int r3) {
        /*
            r2 = this;
            android.content.res.TypedArray r0 = r2.f391b
            boolean r0 = r0.hasValue(r3)
            if (r0 == 0) goto L_0x0018
            android.content.res.TypedArray r0 = r2.f391b
            r1 = 0
            int r0 = r0.getResourceId(r3, r1)
            if (r0 == 0) goto L_0x0018
            android.content.Context r3 = r2.f390a
            android.graphics.drawable.Drawable r3 = b.a.a.a.a.b(r3, r0)
            return r3
        L_0x0018:
            android.content.res.TypedArray r0 = r2.f391b
            android.graphics.drawable.Drawable r3 = r0.getDrawable(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Aa.b(int):android.graphics.drawable.Drawable");
    }

    public int c(int i, int i2) {
        return this.f391b.getDimensionPixelSize(i, i2);
    }

    public Drawable c(int i) {
        int resourceId;
        if (!this.f391b.hasValue(i) || (resourceId = this.f391b.getResourceId(i, 0)) == 0) {
            return null;
        }
        return C0142q.b().a(this.f390a, resourceId, true);
    }

    public int d(int i, int i2) {
        return this.f391b.getInt(i, i2);
    }

    public String d(int i) {
        return this.f391b.getString(i);
    }

    public int e(int i, int i2) {
        return this.f391b.getInteger(i, i2);
    }

    public CharSequence e(int i) {
        return this.f391b.getText(i);
    }

    public int f(int i, int i2) {
        return this.f391b.getLayoutDimension(i, i2);
    }

    public CharSequence[] f(int i) {
        return this.f391b.getTextArray(i);
    }

    public int g(int i, int i2) {
        return this.f391b.getResourceId(i, i2);
    }

    public boolean g(int i) {
        return this.f391b.hasValue(i);
    }
}
