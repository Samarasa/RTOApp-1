package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.C1766hB;
import java.util.concurrent.Callable;

public final class Pha implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final C2869wha f8237a;

    /* renamed from: b  reason: collision with root package name */
    private final C1766hB.a f8238b;

    public Pha(C2869wha wha, C1766hB.a aVar) {
        this.f8237a = wha;
        this.f8238b = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Void call() {
        if (this.f8237a.n() != null) {
            this.f8237a.n().get();
        }
        C1766hB m = this.f8237a.m();
        if (m == null) {
            return null;
        }
        try {
            synchronized (this.f8238b) {
                C1766hB.a aVar = this.f8238b;
                byte[] f2 = m.f();
                aVar.a(f2, 0, f2.length, C2012kea.b());
            }
            return null;
        } catch (Iea unused) {
            return null;
        }
    }
}
