package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

final /* synthetic */ class OO implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final List f8076a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f8077b;

    OO(List list, Object obj) {
        this.f8076a = list;
        this.f8077b = obj;
    }

    public final Object call() {
        List<LY> list = this.f8076a;
        Object obj = this.f8077b;
        for (LY ly : list) {
            KO ko = (KO) ly.get();
            if (ko != null) {
                ko.a(obj);
            }
        }
        return obj;
    }
}
