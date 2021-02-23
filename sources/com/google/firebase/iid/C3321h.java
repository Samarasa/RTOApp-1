package com.google.firebase.iid;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: com.google.firebase.iid.h  reason: case insensitive filesystem */
final class C3321h {

    /* renamed from: a  reason: collision with root package name */
    private final Messenger f14572a;

    /* renamed from: b  reason: collision with root package name */
    private final K f14573b;

    C3321h(IBinder iBinder) {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f14572a = new Messenger(iBinder);
            this.f14573b = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.f14573b = new K(iBinder);
            this.f14572a = null;
        } else {
            String valueOf = String.valueOf(interfaceDescriptor);
            Log.w("MessengerIpcClient", valueOf.length() != 0 ? "Invalid interface descriptor: ".concat(valueOf) : new String("Invalid interface descriptor: "));
            throw new RemoteException();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Message message) {
        Messenger messenger = this.f14572a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        K k = this.f14573b;
        if (k != null) {
            k.a(message);
            return;
        }
        throw new IllegalStateException("Both messengers are null");
    }
}
