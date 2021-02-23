package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C1718gY;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.mY  reason: case insensitive filesystem */
abstract class C2143mY<V, C> extends C1718gY<V, C> {
    private List<C2285oY<V>> p;

    C2143mY(C2638tX<? extends LY<? extends V>> tXVar, boolean z) {
        super(tXVar, true, true);
        List<C2285oY<V>> i = tXVar.isEmpty() ? C2709uX.i() : CX.a(tXVar.size());
        for (int i2 = 0; i2 < tXVar.size(); i2++) {
            i.add((Object) null);
        }
        this.p = i;
    }

    /* access modifiers changed from: package-private */
    public abstract C a(List<C2285oY<V>> list);

    /* access modifiers changed from: package-private */
    public final void a(int i, V v) {
        List<C2285oY<V>> list = this.p;
        if (list != null) {
            list.set(i, new C2285oY(v));
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(C1718gY.a aVar) {
        super.a(aVar);
        this.p = null;
    }

    /* access modifiers changed from: package-private */
    public final void l() {
        List<C2285oY<V>> list = this.p;
        if (list != null) {
            a(a(list));
        }
    }
}
