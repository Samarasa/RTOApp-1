package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;

final class Bfa {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayDeque<Lda> f6334a;

    private Bfa() {
        this.f6334a = new ArrayDeque<>();
    }

    /* synthetic */ Bfa(C3007yfa yfa) {
        this();
    }

    private static int a(int i) {
        int binarySearch = Arrays.binarySearch(C3078zfa.f13088e, i);
        return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
    }

    /* access modifiers changed from: private */
    public final Lda a(Lda lda, Lda lda2) {
        a(lda);
        a(lda2);
        Lda pop = this.f6334a.pop();
        while (!this.f6334a.isEmpty()) {
            pop = new C3078zfa(this.f6334a.pop(), pop, (C3007yfa) null);
        }
        return pop;
    }

    private final void a(Lda lda) {
        while (!lda.j()) {
            if (lda instanceof C3078zfa) {
                C3078zfa zfa = (C3078zfa) lda;
                a(zfa.f13090g);
                lda = zfa.f13091h;
            } else {
                String valueOf = String.valueOf(lda.getClass());
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
                sb.append("Has a new type of ByteString been created? Found ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        int a2 = a(lda.size());
        int m = C3078zfa.m(a2 + 1);
        if (this.f6334a.isEmpty() || this.f6334a.peek().size() >= m) {
            this.f6334a.push(lda);
            return;
        }
        int m2 = C3078zfa.m(a2);
        Lda pop = this.f6334a.pop();
        while (!this.f6334a.isEmpty() && this.f6334a.peek().size() < m2) {
            pop = new C3078zfa(this.f6334a.pop(), pop, (C3007yfa) null);
        }
        C3078zfa zfa2 = new C3078zfa(pop, lda, (C3007yfa) null);
        while (!this.f6334a.isEmpty() && this.f6334a.peek().size() < C3078zfa.m(a(zfa2.size()) + 1)) {
            zfa2 = new C3078zfa(this.f6334a.pop(), zfa2, (C3007yfa) null);
        }
        this.f6334a.push(zfa2);
    }
}
