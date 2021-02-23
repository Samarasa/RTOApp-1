package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.api.a;

public class w<T extends IInterface> extends C0552h<T> {
    private final a.h<T> H;

    /* access modifiers changed from: protected */
    public T a(IBinder iBinder) {
        return this.H.a(iBinder);
    }

    /* access modifiers changed from: protected */
    public void a(int i, T t) {
        this.H.a(i, t);
    }

    /* access modifiers changed from: protected */
    public String u() {
        return this.H.j();
    }

    /* access modifiers changed from: protected */
    public String v() {
        return this.H.k();
    }

    public a.h<T> z() {
        return this.H;
    }
}
