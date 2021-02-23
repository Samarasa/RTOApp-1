package com.google.android.gms.internal.ads;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.ads.xda  reason: case insensitive filesystem */
final class C2932xda {

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap<Ada, List<Throwable>> f12780a = new ConcurrentHashMap<>(16, 0.75f, 10);

    /* renamed from: b  reason: collision with root package name */
    private final ReferenceQueue<Throwable> f12781b = new ReferenceQueue<>();

    C2932xda() {
    }

    public final List<Throwable> a(Throwable th, boolean z) {
        while (true) {
            Reference<? extends Throwable> poll = this.f12781b.poll();
            if (poll == null) {
                break;
            }
            this.f12780a.remove(poll);
        }
        List<Throwable> list = this.f12780a.get(new Ada(th, (ReferenceQueue<Throwable>) null));
        if (!z || list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List<Throwable> putIfAbsent = this.f12780a.putIfAbsent(new Ada(th, this.f12781b), vector);
        return putIfAbsent == null ? vector : putIfAbsent;
    }
}
