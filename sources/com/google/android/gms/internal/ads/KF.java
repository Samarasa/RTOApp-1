package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.C0511q;
import com.google.android.gms.ads.internal.util.C0513t;

public final class KF extends C2019ki {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ LF f7534a;

    protected KF(LF lf) {
        this.f7534a = lf;
    }

    public final void a(ParcelFileDescriptor parcelFileDescriptor) {
        this.f7534a.f7647a.a(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
    }

    public final void a(C0511q qVar) {
        this.f7534a.f7647a.a((Throwable) new C0513t(qVar.f5643a, qVar.f5644b));
    }
}
