package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

final class Oda extends Qda {

    /* renamed from: a  reason: collision with root package name */
    private int f8117a = 0;

    /* renamed from: b  reason: collision with root package name */
    private final int f8118b = this.f8119c.size();

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Lda f8119c;

    Oda(Lda lda) {
        this.f8119c = lda;
    }

    public final boolean hasNext() {
        return this.f8117a < this.f8118b;
    }

    public final byte nextByte() {
        int i = this.f8117a;
        if (i < this.f8118b) {
            this.f8117a = i + 1;
            return this.f8119c.k(i);
        }
        throw new NoSuchElementException();
    }
}
