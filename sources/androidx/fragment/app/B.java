package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.lifecycle.g;

@SuppressLint({"BanParcelableUsage"})
final class B implements Parcelable {
    public static final Parcelable.Creator<B> CREATOR = new A();

    /* renamed from: a  reason: collision with root package name */
    final String f1011a;

    /* renamed from: b  reason: collision with root package name */
    final String f1012b;

    /* renamed from: c  reason: collision with root package name */
    final boolean f1013c;

    /* renamed from: d  reason: collision with root package name */
    final int f1014d;

    /* renamed from: e  reason: collision with root package name */
    final int f1015e;

    /* renamed from: f  reason: collision with root package name */
    final String f1016f;

    /* renamed from: g  reason: collision with root package name */
    final boolean f1017g;

    /* renamed from: h  reason: collision with root package name */
    final boolean f1018h;
    final boolean i;
    final Bundle j;
    final boolean k;
    final int l;
    Bundle m;
    C0158h n;

    B(Parcel parcel) {
        this.f1011a = parcel.readString();
        this.f1012b = parcel.readString();
        boolean z = true;
        this.f1013c = parcel.readInt() != 0;
        this.f1014d = parcel.readInt();
        this.f1015e = parcel.readInt();
        this.f1016f = parcel.readString();
        this.f1017g = parcel.readInt() != 0;
        this.f1018h = parcel.readInt() != 0;
        this.i = parcel.readInt() != 0;
        this.j = parcel.readBundle();
        this.k = parcel.readInt() == 0 ? false : z;
        this.m = parcel.readBundle();
        this.l = parcel.readInt();
    }

    B(C0158h hVar) {
        this.f1011a = hVar.getClass().getName();
        this.f1012b = hVar.f1112f;
        this.f1013c = hVar.m;
        this.f1014d = hVar.v;
        this.f1015e = hVar.w;
        this.f1016f = hVar.x;
        this.f1017g = hVar.A;
        this.f1018h = hVar.l;
        this.i = hVar.z;
        this.j = hVar.f1113g;
        this.k = hVar.y;
        this.l = hVar.Q.ordinal();
    }

    public C0158h a(ClassLoader classLoader, C0162l lVar) {
        Bundle bundle;
        C0158h hVar;
        if (this.n == null) {
            Bundle bundle2 = this.j;
            if (bundle2 != null) {
                bundle2.setClassLoader(classLoader);
            }
            this.n = lVar.a(classLoader, this.f1011a);
            this.n.m(this.j);
            Bundle bundle3 = this.m;
            if (bundle3 != null) {
                bundle3.setClassLoader(classLoader);
                hVar = this.n;
                bundle = this.m;
            } else {
                hVar = this.n;
                bundle = new Bundle();
            }
            hVar.f1109c = bundle;
            C0158h hVar2 = this.n;
            hVar2.f1112f = this.f1012b;
            hVar2.m = this.f1013c;
            hVar2.o = true;
            hVar2.v = this.f1014d;
            hVar2.w = this.f1015e;
            hVar2.x = this.f1016f;
            hVar2.A = this.f1017g;
            hVar2.l = this.f1018h;
            hVar2.z = this.i;
            hVar2.y = this.k;
            hVar2.Q = g.b.values()[this.l];
            if (v.f1148c) {
                Log.v("FragmentManager", "Instantiated fragment " + this.n);
            }
        }
        return this.n;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f1011a);
        sb.append(" (");
        sb.append(this.f1012b);
        sb.append(")}:");
        if (this.f1013c) {
            sb.append(" fromLayout");
        }
        if (this.f1015e != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f1015e));
        }
        String str = this.f1016f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f1016f);
        }
        if (this.f1017g) {
            sb.append(" retainInstance");
        }
        if (this.f1018h) {
            sb.append(" removing");
        }
        if (this.i) {
            sb.append(" detached");
        }
        if (this.k) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f1011a);
        parcel.writeString(this.f1012b);
        parcel.writeInt(this.f1013c ? 1 : 0);
        parcel.writeInt(this.f1014d);
        parcel.writeInt(this.f1015e);
        parcel.writeString(this.f1016f);
        parcel.writeInt(this.f1017g ? 1 : 0);
        parcel.writeInt(this.f1018h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeBundle(this.j);
        parcel.writeInt(this.k ? 1 : 0);
        parcel.writeBundle(this.m);
        parcel.writeInt(this.l);
    }
}
