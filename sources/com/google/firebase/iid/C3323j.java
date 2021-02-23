package com.google.firebase.iid;

import android.os.Bundle;
import android.util.Log;
import c.b.b.b.g.j;

/* renamed from: com.google.firebase.iid.j  reason: case insensitive filesystem */
abstract class C3323j<T> {

    /* renamed from: a  reason: collision with root package name */
    final int f14575a;

    /* renamed from: b  reason: collision with root package name */
    final j<T> f14576b = new j<>();

    /* renamed from: c  reason: collision with root package name */
    final int f14577c;

    /* renamed from: d  reason: collision with root package name */
    final Bundle f14578d;

    C3323j(int i, int i2, Bundle bundle) {
        this.f14575a = i;
        this.f14577c = i2;
        this.f14578d = bundle;
    }

    /* access modifiers changed from: package-private */
    public abstract void a(Bundle bundle);

    /* access modifiers changed from: package-private */
    public final void a(C3322i iVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(iVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14 + String.valueOf(valueOf2).length());
            sb.append("Failing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.f14576b.a((Exception) iVar);
    }

    /* access modifiers changed from: package-private */
    public final void a(T t) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(t);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16 + String.valueOf(valueOf2).length());
            sb.append("Finishing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.f14576b.a(t);
    }

    /* access modifiers changed from: package-private */
    public abstract boolean a();

    public String toString() {
        int i = this.f14577c;
        int i2 = this.f14575a;
        boolean a2 = a();
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(i);
        sb.append(" id=");
        sb.append(i2);
        sb.append(" oneWay=");
        sb.append(a2);
        sb.append("}");
        return sb.toString();
    }
}
