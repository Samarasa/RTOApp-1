package androidx.appcompat.widget;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import b.h.a.a.h;
import java.lang.ref.WeakReference;

class L extends h.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f477a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f478b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ WeakReference f479c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ M f480d;

    L(M m, int i, int i2, WeakReference weakReference) {
        this.f480d = m;
        this.f477a = i;
        this.f478b = i2;
        this.f479c = weakReference;
    }

    public void a(int i) {
    }

    public void a(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.f477a) != -1) {
            typeface = Typeface.create(typeface, i, (this.f478b & 2) != 0);
        }
        this.f480d.a((WeakReference<TextView>) this.f479c, typeface);
    }
}
