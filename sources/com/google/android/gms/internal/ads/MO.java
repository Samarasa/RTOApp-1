package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.p;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Executor;

public final class MO<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Set<JO<? extends KO<T>>> f7834a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f7835b;

    public MO(Executor executor, Set<JO<? extends KO<T>>> set) {
        this.f7835b = executor;
        this.f7834a = set;
    }

    public final LY<T> a(T t) {
        ArrayList arrayList = new ArrayList(this.f7834a.size());
        for (JO next : this.f7834a) {
            LY a2 = next.a();
            if (C0644Da.f6572a.a().booleanValue()) {
                a2.a(new LO(next, p.j().b()), C1252_k.f9704f);
            }
            arrayList.add(a2);
        }
        return DY.c(arrayList).a(new OO(arrayList, t), this.f7835b);
    }
}
