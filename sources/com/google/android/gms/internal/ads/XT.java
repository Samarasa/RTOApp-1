package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

public final class XT {

    /* renamed from: a  reason: collision with root package name */
    private HashMap<PT, _T<? extends C3103zs>> f9241a = new HashMap<>();

    public final <AdT extends C3103zs> _T<AdT> a(PT pt, Context context, GT gt, C1856iU<AdT> iUVar) {
        _T<AdT> _t = this.f9241a.get(pt);
        if (_t != null) {
            return _t;
        }
        MT mt = new MT(QT.a(pt, context));
        _T<AdT> _t2 = new _T<>(mt, new C1289aU(mt, gt, iUVar));
        this.f9241a.put(pt, _t2);
        return _t2;
    }
}
