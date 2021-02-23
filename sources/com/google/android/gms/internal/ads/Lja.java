package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

public final class Lja implements Parcelable, Comparator<a> {
    public static final Parcelable.Creator<Lja> CREATOR = new Kja();

    /* renamed from: a  reason: collision with root package name */
    private final a[] f7715a;

    /* renamed from: b  reason: collision with root package name */
    private int f7716b;

    /* renamed from: c  reason: collision with root package name */
    public final int f7717c;

    public static final class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new Mja();

        /* renamed from: a  reason: collision with root package name */
        private int f7718a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final UUID f7719b;

        /* renamed from: c  reason: collision with root package name */
        private final String f7720c;

        /* renamed from: d  reason: collision with root package name */
        private final byte[] f7721d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f7722e;

        a(Parcel parcel) {
            this.f7719b = new UUID(parcel.readLong(), parcel.readLong());
            this.f7720c = parcel.readString();
            this.f7721d = parcel.createByteArray();
            this.f7722e = parcel.readByte() != 0;
        }

        public a(UUID uuid, String str, byte[] bArr) {
            this(uuid, str, bArr, false);
        }

        private a(UUID uuid, String str, byte[] bArr, boolean z) {
            Cma.a(uuid);
            this.f7719b = uuid;
            Cma.a(str);
            this.f7720c = str;
            Cma.a(bArr);
            this.f7721d = bArr;
            this.f7722e = false;
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            a aVar = (a) obj;
            return this.f7720c.equals(aVar.f7720c) && Tma.a((Object) this.f7719b, (Object) aVar.f7719b) && Arrays.equals(this.f7721d, aVar.f7721d);
        }

        public final int hashCode() {
            if (this.f7718a == 0) {
                this.f7718a = (((this.f7719b.hashCode() * 31) + this.f7720c.hashCode()) * 31) + Arrays.hashCode(this.f7721d);
            }
            return this.f7718a;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f7719b.getMostSignificantBits());
            parcel.writeLong(this.f7719b.getLeastSignificantBits());
            parcel.writeString(this.f7720c);
            parcel.writeByteArray(this.f7721d);
            parcel.writeByte(this.f7722e ? (byte) 1 : 0);
        }
    }

    Lja(Parcel parcel) {
        this.f7715a = (a[]) parcel.createTypedArray(a.CREATOR);
        this.f7717c = this.f7715a.length;
    }

    public Lja(List<a> list) {
        this(false, (a[]) list.toArray(new a[list.size()]));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: com.google.android.gms.internal.ads.Lja$a[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private Lja(boolean r3, com.google.android.gms.internal.ads.Lja.a... r4) {
        /*
            r2 = this;
            r2.<init>()
            if (r3 == 0) goto L_0x000c
            java.lang.Object r3 = r4.clone()
            r4 = r3
            com.google.android.gms.internal.ads.Lja$a[] r4 = (com.google.android.gms.internal.ads.Lja.a[]) r4
        L_0x000c:
            java.util.Arrays.sort(r4, r2)
            r3 = 1
        L_0x0010:
            int r0 = r4.length
            if (r3 >= r0) goto L_0x0055
            int r0 = r3 + -1
            r0 = r4[r0]
            java.util.UUID r0 = r0.f7719b
            r1 = r4[r3]
            java.util.UUID r1 = r1.f7719b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x002a
            int r3 = r3 + 1
            goto L_0x0010
        L_0x002a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r3 = r4[r3]
            java.util.UUID r3 = r3.f7719b
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = java.lang.String.valueOf(r3)
            int r4 = r4.length()
            int r4 = r4 + 25
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r4)
            java.lang.String r4 = "Duplicate data for uuid: "
            r1.append(r4)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L_0x0055:
            r2.f7715a = r4
            int r3 = r4.length
            r2.f7717c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.Lja.<init>(boolean, com.google.android.gms.internal.ads.Lja$a[]):void");
    }

    public Lja(a... aVarArr) {
        this(true, aVarArr);
    }

    public final a a(int i) {
        return this.f7715a[i];
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        a aVar = (a) obj;
        a aVar2 = (a) obj2;
        return C2942xia.f12812b.equals(aVar.f7719b) ? C2942xia.f12812b.equals(aVar2.f7719b) ? 0 : 1 : aVar.f7719b.compareTo(aVar2.f7719b);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Lja.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f7715a, ((Lja) obj).f7715a);
    }

    public final int hashCode() {
        if (this.f7716b == 0) {
            this.f7716b = Arrays.hashCode(this.f7715a);
        }
        return this.f7716b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.f7715a, 0);
    }
}
