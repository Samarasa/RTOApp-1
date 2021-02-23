package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.C0511q;
import com.google.android.gms.ads.internal.util.fa;

/* renamed from: com.google.android.gms.internal.ads.yG  reason: case insensitive filesystem */
final class C2976yG implements AY<ParcelFileDescriptor> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C2090li f12889a;

    C2976yG(C2054lG lGVar, C2090li liVar) {
        this.f12889a = liVar;
    }

    public final /* synthetic */ void a(Object obj) {
        try {
            this.f12889a.a((ParcelFileDescriptor) obj);
        } catch (RemoteException e2) {
            fa.e("Service can't call client", e2);
        }
    }

    public final void a(Throwable th) {
        try {
            this.f12889a.a(C0511q.a(th));
        } catch (RemoteException e2) {
            fa.e("Service can't call client", e2);
        }
    }
}
