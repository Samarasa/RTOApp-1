package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.eha  reason: case insensitive filesystem */
public final class C1593eha<T> implements Xga<Set<T>> {

    /* renamed from: a  reason: collision with root package name */
    private static final Xga<Set<Object>> f10294a = _ga.a(Collections.emptySet());

    /* renamed from: b  reason: collision with root package name */
    private final List<C1876iha<T>> f10295b;

    /* renamed from: c  reason: collision with root package name */
    private final List<C1876iha<Collection<T>>> f10296c;

    private C1593eha(List<C1876iha<T>> list, List<C1876iha<Collection<T>>> list2) {
        this.f10295b = list;
        this.f10296c = list2;
    }

    public static <T> C1735gha<T> a(int i, int i2) {
        return new C1735gha<>(i, i2);
    }

    public final /* synthetic */ Object get() {
        int size = this.f10295b.size();
        ArrayList arrayList = new ArrayList(this.f10296c.size());
        int size2 = this.f10296c.size();
        int i = size;
        for (int i2 = 0; i2 < size2; i2++) {
            Collection collection = (Collection) this.f10296c.get(i2).get();
            i += collection.size();
            arrayList.add(collection);
        }
        HashSet b2 = Wga.b(i);
        int size3 = this.f10295b.size();
        for (int i3 = 0; i3 < size3; i3++) {
            Object obj = this.f10295b.get(i3).get();
            C1452cha.a(obj);
            b2.add(obj);
        }
        int size4 = arrayList.size();
        for (int i4 = 0; i4 < size4; i4++) {
            for (Object next : (Collection) arrayList.get(i4)) {
                C1452cha.a(next);
                b2.add(next);
            }
        }
        return Collections.unmodifiableSet(b2);
    }
}
