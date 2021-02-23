package com.google.firebase.iid;

import android.os.Build;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

public class K implements Parcelable {
    public static final Parcelable.Creator<K> CREATOR = new J();

    /* renamed from: a  reason: collision with root package name */
    private Messenger f14521a;

    /* renamed from: b  reason: collision with root package name */
    private U f14522b;

    public static final class a extends ClassLoader {
        /* access modifiers changed from: protected */
        public final Class<?> loadClass(String str, boolean z) {
            if (!"com.google.android.gms.iid.MessengerCompat".equals(str)) {
                return super.loadClass(str, z);
            }
            if (!FirebaseInstanceId.g()) {
                return K.class;
            }
            Log.d("FirebaseInstanceId", "Using renamed FirebaseIidMessengerCompat class");
            return K.class;
        }
    }

    public K(IBinder iBinder) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f14521a = new Messenger(iBinder);
        } else {
            this.f14522b = new X(iBinder);
        }
    }

    private final IBinder a() {
        Messenger messenger = this.f14521a;
        return messenger != null ? messenger.getBinder() : this.f14522b.asBinder();
    }

    public final void a(Message message) {
        Messenger messenger = this.f14521a;
        if (messenger != null) {
            messenger.send(message);
        } else {
            this.f14522b.a(message);
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return a().equals(((K) obj).a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        return a().hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.f14521a;
        parcel.writeStrongBinder(messenger != null ? messenger.getBinder() : this.f14522b.asBinder());
    }
}
