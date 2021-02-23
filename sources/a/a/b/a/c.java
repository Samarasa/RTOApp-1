package a.a.b.a;

import a.a.b.a.a;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new b();

    /* renamed from: a  reason: collision with root package name */
    final boolean f3a = false;

    /* renamed from: b  reason: collision with root package name */
    final Handler f4b = null;

    /* renamed from: c  reason: collision with root package name */
    a f5c;

    class a extends a.C0002a {
        a() {
        }

        public void a(int i, Bundle bundle) {
            c cVar = c.this;
            Handler handler = cVar.f4b;
            if (handler != null) {
                handler.post(new b(i, bundle));
            } else {
                cVar.a(i, bundle);
            }
        }
    }

    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final int f7a;

        /* renamed from: b  reason: collision with root package name */
        final Bundle f8b;

        b(int i, Bundle bundle) {
            this.f7a = i;
            this.f8b = bundle;
        }

        public void run() {
            c.this.a(this.f7a, this.f8b);
        }
    }

    c(Parcel parcel) {
        this.f5c = a.C0002a.a(parcel.readStrongBinder());
    }

    /* access modifiers changed from: protected */
    public void a(int i, Bundle bundle) {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.f5c == null) {
                this.f5c = new a();
            }
            parcel.writeStrongBinder(this.f5c.asBinder());
        }
    }
}
