package com.google.android.gms.ads.formats;

import android.os.RemoteException;
import android.view.View;
import c.b.b.b.c.a;
import com.google.android.gms.internal.ads.C1018Rk;
import com.google.android.gms.internal.ads.C2572sb;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static WeakHashMap<View, e> f5421a = new WeakHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private C2572sb f5422b;

    /* renamed from: c  reason: collision with root package name */
    private WeakReference<View> f5423c;

    private final void a(a aVar) {
        WeakReference<View> weakReference = this.f5423c;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view == null) {
            C1018Rk.d("NativeAdViewHolder.setNativeAd containerView doesn't exist, returning");
            return;
        }
        if (!f5421a.containsKey(view)) {
            f5421a.put(view, this);
        }
        C2572sb sbVar = this.f5422b;
        if (sbVar != null) {
            try {
                sbVar.e(aVar);
            } catch (RemoteException e2) {
                C1018Rk.b("Unable to call setNativeAd on delegate", e2);
            }
        }
    }

    public final void a(b bVar) {
        a((a) bVar.a());
    }

    public final void a(j jVar) {
        a((a) jVar.l());
    }
}
