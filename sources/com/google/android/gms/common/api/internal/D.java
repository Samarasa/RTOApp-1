package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C0525e;
import com.google.android.gms.common.util.m;

public abstract class D {

    /* renamed from: a  reason: collision with root package name */
    private final int f5800a;

    public D(int i) {
        this.f5800a = i;
    }

    /* access modifiers changed from: private */
    public static Status b(RemoteException remoteException) {
        StringBuilder sb = new StringBuilder();
        if (m.b() && (remoteException instanceof TransactionTooLargeException)) {
            sb.append("TransactionTooLargeException: ");
        }
        sb.append(remoteException.getLocalizedMessage());
        return new Status(8, sb.toString());
    }

    public abstract void a(Status status);

    public abstract void a(U u, boolean z);

    public abstract void a(C0525e.a<?> aVar);

    public abstract void a(RuntimeException runtimeException);
}
