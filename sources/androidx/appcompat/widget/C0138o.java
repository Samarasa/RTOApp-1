package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import androidx.core.graphics.drawable.a;
import androidx.core.widget.c;

/* renamed from: androidx.appcompat.widget.o  reason: case insensitive filesystem */
class C0138o {

    /* renamed from: a  reason: collision with root package name */
    private final CompoundButton f683a;

    /* renamed from: b  reason: collision with root package name */
    private ColorStateList f684b = null;

    /* renamed from: c  reason: collision with root package name */
    private PorterDuff.Mode f685c = null;

    /* renamed from: d  reason: collision with root package name */
    private boolean f686d = false;

    /* renamed from: e  reason: collision with root package name */
    private boolean f687e = false;

    /* renamed from: f  reason: collision with root package name */
    private boolean f688f;

    C0138o(CompoundButton compoundButton) {
        this.f683a = compoundButton;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = androidx.core.widget.c.a(r2.f683a);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int a(int r3) {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 17
            if (r0 >= r1) goto L_0x0013
            android.widget.CompoundButton r0 = r2.f683a
            android.graphics.drawable.Drawable r0 = androidx.core.widget.c.a(r0)
            if (r0 == 0) goto L_0x0013
            int r0 = r0.getIntrinsicWidth()
            int r3 = r3 + r0
        L_0x0013:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0138o.a(int):int");
    }

    /* access modifiers changed from: package-private */
    public void a() {
        Drawable a2 = c.a(this.f683a);
        if (a2 == null) {
            return;
        }
        if (this.f686d || this.f687e) {
            Drawable mutate = a.i(a2).mutate();
            if (this.f686d) {
                a.a(mutate, this.f684b);
            }
            if (this.f687e) {
                a.a(mutate, this.f685c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f683a.getDrawableState());
            }
            this.f683a.setButtonDrawable(mutate);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(ColorStateList colorStateList) {
        this.f684b = colorStateList;
        this.f686d = true;
        a();
    }

    /* access modifiers changed from: package-private */
    public void a(PorterDuff.Mode mode) {
        this.f685c = mode;
        this.f687e = true;
        a();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031 A[SYNTHETIC, Splitter:B:12:0x0031] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0058 A[Catch:{ all -> 0x0080 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006b A[Catch:{ all -> 0x0080 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.util.AttributeSet r4, int r5) {
        /*
            r3 = this;
            android.widget.CompoundButton r0 = r3.f683a
            android.content.Context r0 = r0.getContext()
            int[] r1 = b.a.j.CompoundButton
            r2 = 0
            android.content.res.TypedArray r4 = r0.obtainStyledAttributes(r4, r1, r5, r2)
            int r5 = b.a.j.CompoundButton_buttonCompat     // Catch:{ all -> 0x0080 }
            boolean r5 = r4.hasValue(r5)     // Catch:{ all -> 0x0080 }
            if (r5 == 0) goto L_0x002e
            int r5 = b.a.j.CompoundButton_buttonCompat     // Catch:{ all -> 0x0080 }
            int r5 = r4.getResourceId(r5, r2)     // Catch:{ all -> 0x0080 }
            if (r5 == 0) goto L_0x002e
            android.widget.CompoundButton r0 = r3.f683a     // Catch:{ NotFoundException -> 0x002e }
            android.widget.CompoundButton r1 = r3.f683a     // Catch:{ NotFoundException -> 0x002e }
            android.content.Context r1 = r1.getContext()     // Catch:{ NotFoundException -> 0x002e }
            android.graphics.drawable.Drawable r5 = b.a.a.a.a.b(r1, r5)     // Catch:{ NotFoundException -> 0x002e }
            r0.setButtonDrawable(r5)     // Catch:{ NotFoundException -> 0x002e }
            r5 = 1
            goto L_0x002f
        L_0x002e:
            r5 = 0
        L_0x002f:
            if (r5 != 0) goto L_0x0050
            int r5 = b.a.j.CompoundButton_android_button     // Catch:{ all -> 0x0080 }
            boolean r5 = r4.hasValue(r5)     // Catch:{ all -> 0x0080 }
            if (r5 == 0) goto L_0x0050
            int r5 = b.a.j.CompoundButton_android_button     // Catch:{ all -> 0x0080 }
            int r5 = r4.getResourceId(r5, r2)     // Catch:{ all -> 0x0080 }
            if (r5 == 0) goto L_0x0050
            android.widget.CompoundButton r0 = r3.f683a     // Catch:{ all -> 0x0080 }
            android.widget.CompoundButton r1 = r3.f683a     // Catch:{ all -> 0x0080 }
            android.content.Context r1 = r1.getContext()     // Catch:{ all -> 0x0080 }
            android.graphics.drawable.Drawable r5 = b.a.a.a.a.b(r1, r5)     // Catch:{ all -> 0x0080 }
            r0.setButtonDrawable(r5)     // Catch:{ all -> 0x0080 }
        L_0x0050:
            int r5 = b.a.j.CompoundButton_buttonTint     // Catch:{ all -> 0x0080 }
            boolean r5 = r4.hasValue(r5)     // Catch:{ all -> 0x0080 }
            if (r5 == 0) goto L_0x0063
            android.widget.CompoundButton r5 = r3.f683a     // Catch:{ all -> 0x0080 }
            int r0 = b.a.j.CompoundButton_buttonTint     // Catch:{ all -> 0x0080 }
            android.content.res.ColorStateList r0 = r4.getColorStateList(r0)     // Catch:{ all -> 0x0080 }
            androidx.core.widget.c.a((android.widget.CompoundButton) r5, (android.content.res.ColorStateList) r0)     // Catch:{ all -> 0x0080 }
        L_0x0063:
            int r5 = b.a.j.CompoundButton_buttonTintMode     // Catch:{ all -> 0x0080 }
            boolean r5 = r4.hasValue(r5)     // Catch:{ all -> 0x0080 }
            if (r5 == 0) goto L_0x007c
            android.widget.CompoundButton r5 = r3.f683a     // Catch:{ all -> 0x0080 }
            int r0 = b.a.j.CompoundButton_buttonTintMode     // Catch:{ all -> 0x0080 }
            r1 = -1
            int r0 = r4.getInt(r0, r1)     // Catch:{ all -> 0x0080 }
            r1 = 0
            android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.T.a(r0, r1)     // Catch:{ all -> 0x0080 }
            androidx.core.widget.c.a((android.widget.CompoundButton) r5, (android.graphics.PorterDuff.Mode) r0)     // Catch:{ all -> 0x0080 }
        L_0x007c:
            r4.recycle()
            return
        L_0x0080:
            r5 = move-exception
            r4.recycle()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0138o.a(android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: package-private */
    public ColorStateList b() {
        return this.f684b;
    }

    /* access modifiers changed from: package-private */
    public PorterDuff.Mode c() {
        return this.f685c;
    }

    /* access modifiers changed from: package-private */
    public void d() {
        if (this.f688f) {
            this.f688f = false;
            return;
        }
        this.f688f = true;
        a();
    }
}
