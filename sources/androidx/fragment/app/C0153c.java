package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.C;
import androidx.lifecycle.g;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.fragment.app.c  reason: case insensitive filesystem */
final class C0153c implements Parcelable {
    public static final Parcelable.Creator<C0153c> CREATOR = new C0152b();

    /* renamed from: a  reason: collision with root package name */
    final int[] f1096a;

    /* renamed from: b  reason: collision with root package name */
    final ArrayList<String> f1097b;

    /* renamed from: c  reason: collision with root package name */
    final int[] f1098c;

    /* renamed from: d  reason: collision with root package name */
    final int[] f1099d;

    /* renamed from: e  reason: collision with root package name */
    final int f1100e;

    /* renamed from: f  reason: collision with root package name */
    final int f1101f;

    /* renamed from: g  reason: collision with root package name */
    final String f1102g;

    /* renamed from: h  reason: collision with root package name */
    final int f1103h;
    final int i;
    final CharSequence j;
    final int k;
    final CharSequence l;
    final ArrayList<String> m;
    final ArrayList<String> n;
    final boolean o;

    public C0153c(Parcel parcel) {
        this.f1096a = parcel.createIntArray();
        this.f1097b = parcel.createStringArrayList();
        this.f1098c = parcel.createIntArray();
        this.f1099d = parcel.createIntArray();
        this.f1100e = parcel.readInt();
        this.f1101f = parcel.readInt();
        this.f1102g = parcel.readString();
        this.f1103h = parcel.readInt();
        this.i = parcel.readInt();
        this.j = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.k = parcel.readInt();
        this.l = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.m = parcel.createStringArrayList();
        this.n = parcel.createStringArrayList();
        this.o = parcel.readInt() != 0;
    }

    public C0153c(C0151a aVar) {
        int size = aVar.f1019a.size();
        this.f1096a = new int[(size * 5)];
        if (aVar.f1026h) {
            this.f1097b = new ArrayList<>(size);
            this.f1098c = new int[size];
            this.f1099d = new int[size];
            int i2 = 0;
            int i3 = 0;
            while (i2 < size) {
                C.a aVar2 = aVar.f1019a.get(i2);
                int i4 = i3 + 1;
                this.f1096a[i3] = aVar2.f1027a;
                ArrayList<String> arrayList = this.f1097b;
                C0158h hVar = aVar2.f1028b;
                arrayList.add(hVar != null ? hVar.f1112f : null);
                int[] iArr = this.f1096a;
                int i5 = i4 + 1;
                iArr[i4] = aVar2.f1029c;
                int i6 = i5 + 1;
                iArr[i5] = aVar2.f1030d;
                int i7 = i6 + 1;
                iArr[i6] = aVar2.f1031e;
                iArr[i7] = aVar2.f1032f;
                this.f1098c[i2] = aVar2.f1033g.ordinal();
                this.f1099d[i2] = aVar2.f1034h.ordinal();
                i2++;
                i3 = i7 + 1;
            }
            this.f1100e = aVar.f1024f;
            this.f1101f = aVar.f1025g;
            this.f1102g = aVar.j;
            this.f1103h = aVar.u;
            this.i = aVar.k;
            this.j = aVar.l;
            this.k = aVar.m;
            this.l = aVar.n;
            this.m = aVar.o;
            this.n = aVar.p;
            this.o = aVar.q;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public C0151a a(v vVar) {
        C0151a aVar = new C0151a(vVar);
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.f1096a.length) {
            C.a aVar2 = new C.a();
            int i4 = i2 + 1;
            aVar2.f1027a = this.f1096a[i2];
            if (v.f1148c) {
                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i3 + " base fragment #" + this.f1096a[i4]);
            }
            String str = this.f1097b.get(i3);
            aVar2.f1028b = str != null ? vVar.j.get(str) : null;
            aVar2.f1033g = g.b.values()[this.f1098c[i3]];
            aVar2.f1034h = g.b.values()[this.f1099d[i3]];
            int[] iArr = this.f1096a;
            int i5 = i4 + 1;
            aVar2.f1029c = iArr[i4];
            int i6 = i5 + 1;
            aVar2.f1030d = iArr[i5];
            int i7 = i6 + 1;
            aVar2.f1031e = iArr[i6];
            aVar2.f1032f = iArr[i7];
            aVar.f1020b = aVar2.f1029c;
            aVar.f1021c = aVar2.f1030d;
            aVar.f1022d = aVar2.f1031e;
            aVar.f1023e = aVar2.f1032f;
            aVar.a(aVar2);
            i3++;
            i2 = i7 + 1;
        }
        aVar.f1024f = this.f1100e;
        aVar.f1025g = this.f1101f;
        aVar.j = this.f1102g;
        aVar.u = this.f1103h;
        aVar.f1026h = true;
        aVar.k = this.i;
        aVar.l = this.j;
        aVar.m = this.k;
        aVar.n = this.l;
        aVar.o = this.m;
        aVar.p = this.n;
        aVar.q = this.o;
        aVar.a(1);
        return aVar;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeIntArray(this.f1096a);
        parcel.writeStringList(this.f1097b);
        parcel.writeIntArray(this.f1098c);
        parcel.writeIntArray(this.f1099d);
        parcel.writeInt(this.f1100e);
        parcel.writeInt(this.f1101f);
        parcel.writeString(this.f1102g);
        parcel.writeInt(this.f1103h);
        parcel.writeInt(this.i);
        TextUtils.writeToParcel(this.j, parcel, 0);
        parcel.writeInt(this.k);
        TextUtils.writeToParcel(this.l, parcel, 0);
        parcel.writeStringList(this.m);
        parcel.writeStringList(this.n);
        parcel.writeInt(this.o ? 1 : 0);
    }
}
