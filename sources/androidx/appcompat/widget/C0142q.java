package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.C0117da;

/* renamed from: androidx.appcompat.widget.q  reason: case insensitive filesystem */
public final class C0142q {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final PorterDuff.Mode f697a = PorterDuff.Mode.SRC_IN;

    /* renamed from: b  reason: collision with root package name */
    private static C0142q f698b;

    /* renamed from: c  reason: collision with root package name */
    private C0117da f699c;

    public static synchronized PorterDuffColorFilter a(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter a2;
        synchronized (C0142q.class) {
            a2 = C0117da.a(i, mode);
        }
        return a2;
    }

    static void a(Drawable drawable, ya yaVar, int[] iArr) {
        C0117da.a(drawable, yaVar, iArr);
    }

    public static synchronized C0142q b() {
        C0142q qVar;
        synchronized (C0142q.class) {
            if (f698b == null) {
                c();
            }
            qVar = f698b;
        }
        return qVar;
    }

    public static synchronized void c() {
        synchronized (C0142q.class) {
            if (f698b == null) {
                f698b = new C0142q();
                f698b.f699c = C0117da.a();
                f698b.f699c.a((C0117da.e) new C0140p());
            }
        }
    }

    public synchronized Drawable a(Context context, int i) {
        return this.f699c.a(context, i);
    }

    /* access modifiers changed from: package-private */
    public synchronized Drawable a(Context context, int i, boolean z) {
        return this.f699c.a(context, i, z);
    }

    public synchronized void a(Context context) {
        this.f699c.a(context);
    }

    /* access modifiers changed from: package-private */
    public synchronized ColorStateList b(Context context, int i) {
        return this.f699c.b(context, i);
    }
}
