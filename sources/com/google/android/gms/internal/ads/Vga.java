package com.google.android.gms.internal.ads;

public final class Vga<T> implements Xga<T> {

    /* renamed from: a  reason: collision with root package name */
    private C1876iha<T> f9064a;

    public static <T> void a(C1876iha<T> iha, C1876iha<T> iha2) {
        C1452cha.a(iha2);
        Vga vga = (Vga) iha;
        if (vga.f9064a == null) {
            vga.f9064a = iha2;
            return;
        }
        throw new IllegalStateException();
    }

    public final T get() {
        C1876iha<T> iha = this.f9064a;
        if (iha != null) {
            return iha.get();
        }
        throw new IllegalStateException();
    }
}
