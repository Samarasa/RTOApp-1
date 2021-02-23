package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

class r {

    /* renamed from: a  reason: collision with root package name */
    boolean f1492a = true;

    /* renamed from: b  reason: collision with root package name */
    int f1493b;

    /* renamed from: c  reason: collision with root package name */
    int f1494c;

    /* renamed from: d  reason: collision with root package name */
    int f1495d;

    /* renamed from: e  reason: collision with root package name */
    int f1496e;

    /* renamed from: f  reason: collision with root package name */
    int f1497f = 0;

    /* renamed from: g  reason: collision with root package name */
    int f1498g = 0;

    /* renamed from: h  reason: collision with root package name */
    boolean f1499h;
    boolean i;

    r() {
    }

    /* access modifiers changed from: package-private */
    public View a(RecyclerView.p pVar) {
        View d2 = pVar.d(this.f1494c);
        this.f1494c += this.f1495d;
        return d2;
    }

    /* access modifiers changed from: package-private */
    public boolean a(RecyclerView.u uVar) {
        int i2 = this.f1494c;
        return i2 >= 0 && i2 < uVar.a();
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f1493b + ", mCurrentPosition=" + this.f1494c + ", mItemDirection=" + this.f1495d + ", mLayoutDirection=" + this.f1496e + ", mStartLine=" + this.f1497f + ", mEndLine=" + this.f1498g + '}';
    }
}
