package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaFormat;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class Lia implements Parcelable {
    public static final Parcelable.Creator<Lia> CREATOR = new Oia();
    private int A;

    /* renamed from: a  reason: collision with root package name */
    private final String f7707a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7708b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7709c;

    /* renamed from: d  reason: collision with root package name */
    private final C1389bla f7710d;

    /* renamed from: e  reason: collision with root package name */
    public final String f7711e;

    /* renamed from: f  reason: collision with root package name */
    public final String f7712f;

    /* renamed from: g  reason: collision with root package name */
    public final int f7713g;

    /* renamed from: h  reason: collision with root package name */
    public final List<byte[]> f7714h;
    public final Lja i;
    public final int j;
    public final int k;
    public final float l;
    public final int m;
    public final float n;
    private final int o;
    private final byte[] p;
    private final Uma q;
    public final int r;
    public final int s;
    public final int t;
    private final int u;
    private final int v;
    public final long w;
    public final int x;
    public final String y;
    private final int z;

    Lia(Parcel parcel) {
        this.f7707a = parcel.readString();
        this.f7711e = parcel.readString();
        this.f7712f = parcel.readString();
        this.f7709c = parcel.readString();
        this.f7708b = parcel.readInt();
        this.f7713g = parcel.readInt();
        this.j = parcel.readInt();
        this.k = parcel.readInt();
        this.l = parcel.readFloat();
        this.m = parcel.readInt();
        this.n = parcel.readFloat();
        this.p = parcel.readInt() != 0 ? parcel.createByteArray() : null;
        this.o = parcel.readInt();
        this.q = (Uma) parcel.readParcelable(Uma.class.getClassLoader());
        this.r = parcel.readInt();
        this.s = parcel.readInt();
        this.t = parcel.readInt();
        this.u = parcel.readInt();
        this.v = parcel.readInt();
        this.x = parcel.readInt();
        this.y = parcel.readString();
        this.z = parcel.readInt();
        this.w = parcel.readLong();
        int readInt = parcel.readInt();
        this.f7714h = new ArrayList(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            this.f7714h.add(parcel.createByteArray());
        }
        this.i = (Lja) parcel.readParcelable(Lja.class.getClassLoader());
        this.f7710d = (C1389bla) parcel.readParcelable(C1389bla.class.getClassLoader());
    }

    private Lia(String str, String str2, String str3, String str4, int i2, int i3, int i4, int i5, float f2, int i6, float f3, byte[] bArr, int i7, Uma uma, int i8, int i9, int i10, int i11, int i12, int i13, String str5, int i14, long j2, List<byte[]> list, Lja lja, C1389bla bla) {
        this.f7707a = str;
        this.f7711e = str2;
        this.f7712f = str3;
        this.f7709c = str4;
        this.f7708b = i2;
        this.f7713g = i3;
        this.j = i4;
        this.k = i5;
        this.l = f2;
        this.m = i6;
        this.n = f3;
        this.p = bArr;
        this.o = i7;
        this.q = uma;
        this.r = i8;
        this.s = i9;
        this.t = i10;
        this.u = i11;
        this.v = i12;
        this.x = i13;
        this.y = str5;
        this.z = i14;
        this.w = j2;
        this.f7714h = list == null ? Collections.emptyList() : list;
        this.i = lja;
        this.f7710d = bla;
    }

    public static Lia a(String str, String str2, long j2) {
        return new Lia((String) null, (String) null, str2, (String) null, -1, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (Uma) null, -1, -1, -1, -1, -1, 0, (String) null, -1, Long.MAX_VALUE, (List<byte[]>) null, (Lja) null, (C1389bla) null);
    }

    public static Lia a(String str, String str2, String str3, int i2, int i3, int i4, int i5, float f2, List<byte[]> list, int i6, float f3, byte[] bArr, int i7, Uma uma, Lja lja) {
        return new Lia(str, (String) null, str2, (String) null, -1, i3, i4, i5, -1.0f, i6, f3, bArr, i7, uma, -1, -1, -1, -1, -1, 0, (String) null, -1, Long.MAX_VALUE, list, lja, (C1389bla) null);
    }

    public static Lia a(String str, String str2, String str3, int i2, int i3, int i4, int i5, int i6, List<byte[]> list, Lja lja, int i7, String str4) {
        return new Lia(str, (String) null, str2, (String) null, -1, i3, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (Uma) null, i4, i5, i6, -1, -1, i7, str4, -1, Long.MAX_VALUE, list, lja, (C1389bla) null);
    }

    public static Lia a(String str, String str2, String str3, int i2, int i3, int i4, int i5, List<byte[]> list, Lja lja, int i6, String str4) {
        return a(str, str2, (String) null, -1, -1, i4, i5, -1, (List<byte[]>) null, lja, 0, str4);
    }

    public static Lia a(String str, String str2, String str3, int i2, int i3, String str4, int i4, Lja lja, long j2, List<byte[]> list) {
        return new Lia(str, (String) null, str2, (String) null, -1, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (Uma) null, -1, -1, -1, -1, -1, i3, str4, -1, j2, list, lja, (C1389bla) null);
    }

    public static Lia a(String str, String str2, String str3, int i2, int i3, String str4, Lja lja) {
        return a(str, str2, (String) null, -1, i3, str4, -1, lja, Long.MAX_VALUE, Collections.emptyList());
    }

    public static Lia a(String str, String str2, String str3, int i2, Lja lja) {
        return new Lia(str, (String) null, str2, (String) null, -1, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (Uma) null, -1, -1, -1, -1, -1, 0, (String) null, -1, Long.MAX_VALUE, (List<byte[]>) null, lja, (C1389bla) null);
    }

    public static Lia a(String str, String str2, String str3, int i2, List<byte[]> list, String str4, Lja lja) {
        return new Lia(str, (String) null, str2, (String) null, -1, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (Uma) null, -1, -1, -1, -1, -1, 0, str4, -1, Long.MAX_VALUE, list, lja, (C1389bla) null);
    }

    @TargetApi(16)
    private static void a(MediaFormat mediaFormat, String str, int i2) {
        if (i2 != -1) {
            mediaFormat.setInteger(str, i2);
        }
    }

    public final int a() {
        int i2;
        int i3 = this.j;
        if (i3 == -1 || (i2 = this.k) == -1) {
            return -1;
        }
        return i3 * i2;
    }

    public final Lia a(int i2) {
        String str = this.f7707a;
        return new Lia(str, this.f7711e, this.f7712f, this.f7709c, this.f7708b, i2, this.j, this.k, this.l, this.m, this.n, this.p, this.o, this.q, this.r, this.s, this.t, this.u, this.v, this.x, this.y, this.z, this.w, this.f7714h, this.i, this.f7710d);
    }

    public final Lia a(int i2, int i3) {
        String str = this.f7707a;
        return new Lia(str, this.f7711e, this.f7712f, this.f7709c, this.f7708b, this.f7713g, this.j, this.k, this.l, this.m, this.n, this.p, this.o, this.q, this.r, this.s, this.t, i2, i3, this.x, this.y, this.z, this.w, this.f7714h, this.i, this.f7710d);
    }

    public final Lia a(long j2) {
        return new Lia(this.f7707a, this.f7711e, this.f7712f, this.f7709c, this.f7708b, this.f7713g, this.j, this.k, this.l, this.m, this.n, this.p, this.o, this.q, this.r, this.s, this.t, this.u, this.v, this.x, this.y, this.z, j2, this.f7714h, this.i, this.f7710d);
    }

    public final Lia a(Lja lja) {
        String str = this.f7707a;
        return new Lia(str, this.f7711e, this.f7712f, this.f7709c, this.f7708b, this.f7713g, this.j, this.k, this.l, this.m, this.n, this.p, this.o, this.q, this.r, this.s, this.t, this.u, this.v, this.x, this.y, this.z, this.w, this.f7714h, lja, this.f7710d);
    }

    public final Lia a(C1389bla bla) {
        String str = this.f7707a;
        return new Lia(str, this.f7711e, this.f7712f, this.f7709c, this.f7708b, this.f7713g, this.j, this.k, this.l, this.m, this.n, this.p, this.o, this.q, this.r, this.s, this.t, this.u, this.v, this.x, this.y, this.z, this.w, this.f7714h, this.i, bla);
    }

    @SuppressLint({"InlinedApi"})
    @TargetApi(16)
    public final MediaFormat b() {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", this.f7712f);
        String str = this.y;
        if (str != null) {
            mediaFormat.setString("language", str);
        }
        a(mediaFormat, "max-input-size", this.f7713g);
        a(mediaFormat, "width", this.j);
        a(mediaFormat, "height", this.k);
        float f2 = this.l;
        if (f2 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f2);
        }
        a(mediaFormat, "rotation-degrees", this.m);
        a(mediaFormat, "channel-count", this.r);
        a(mediaFormat, "sample-rate", this.s);
        a(mediaFormat, "encoder-delay", this.u);
        a(mediaFormat, "encoder-padding", this.v);
        for (int i2 = 0; i2 < this.f7714h.size(); i2++) {
            StringBuilder sb = new StringBuilder(15);
            sb.append("csd-");
            sb.append(i2);
            mediaFormat.setByteBuffer(sb.toString(), ByteBuffer.wrap(this.f7714h.get(i2)));
        }
        Uma uma = this.q;
        if (uma != null) {
            a(mediaFormat, "color-transfer", uma.f8954c);
            a(mediaFormat, "color-standard", uma.f8952a);
            a(mediaFormat, "color-range", uma.f8953b);
            byte[] bArr = uma.f8955d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        return mediaFormat;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Lia.class == obj.getClass()) {
            Lia lia = (Lia) obj;
            if (this.f7708b == lia.f7708b && this.f7713g == lia.f7713g && this.j == lia.j && this.k == lia.k && this.l == lia.l && this.m == lia.m && this.n == lia.n && this.o == lia.o && this.r == lia.r && this.s == lia.s && this.t == lia.t && this.u == lia.u && this.v == lia.v && this.w == lia.w && this.x == lia.x && Tma.a((Object) this.f7707a, (Object) lia.f7707a) && Tma.a((Object) this.y, (Object) lia.y) && this.z == lia.z && Tma.a((Object) this.f7711e, (Object) lia.f7711e) && Tma.a((Object) this.f7712f, (Object) lia.f7712f) && Tma.a((Object) this.f7709c, (Object) lia.f7709c) && Tma.a((Object) this.i, (Object) lia.i) && Tma.a((Object) this.f7710d, (Object) lia.f7710d) && Tma.a((Object) this.q, (Object) lia.q) && Arrays.equals(this.p, lia.p) && this.f7714h.size() == lia.f7714h.size()) {
                for (int i2 = 0; i2 < this.f7714h.size(); i2++) {
                    if (!Arrays.equals(this.f7714h.get(i2), lia.f7714h.get(i2))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.A == 0) {
            String str = this.f7707a;
            int i2 = 0;
            int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
            String str2 = this.f7711e;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f7712f;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f7709c;
            int hashCode4 = (((((((((((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.f7708b) * 31) + this.j) * 31) + this.k) * 31) + this.r) * 31) + this.s) * 31;
            String str5 = this.y;
            int hashCode5 = (((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.z) * 31;
            Lja lja = this.i;
            int hashCode6 = (hashCode5 + (lja == null ? 0 : lja.hashCode())) * 31;
            C1389bla bla = this.f7710d;
            if (bla != null) {
                i2 = bla.hashCode();
            }
            this.A = hashCode6 + i2;
        }
        return this.A;
    }

    public final String toString() {
        String str = this.f7707a;
        String str2 = this.f7711e;
        String str3 = this.f7712f;
        int i2 = this.f7708b;
        String str4 = this.y;
        int i3 = this.j;
        int i4 = this.k;
        float f2 = this.l;
        int i5 = this.r;
        int i6 = this.s;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 100 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append("Format(");
        sb.append(str);
        sb.append(", ");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(i2);
        sb.append(", ");
        sb.append(str4);
        sb.append(", [");
        sb.append(i3);
        sb.append(", ");
        sb.append(i4);
        sb.append(", ");
        sb.append(f2);
        sb.append("], [");
        sb.append(i5);
        sb.append(", ");
        sb.append(i6);
        sb.append("])");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f7707a);
        parcel.writeString(this.f7711e);
        parcel.writeString(this.f7712f);
        parcel.writeString(this.f7709c);
        parcel.writeInt(this.f7708b);
        parcel.writeInt(this.f7713g);
        parcel.writeInt(this.j);
        parcel.writeInt(this.k);
        parcel.writeFloat(this.l);
        parcel.writeInt(this.m);
        parcel.writeFloat(this.n);
        parcel.writeInt(this.p != null ? 1 : 0);
        byte[] bArr = this.p;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.o);
        parcel.writeParcelable(this.q, i2);
        parcel.writeInt(this.r);
        parcel.writeInt(this.s);
        parcel.writeInt(this.t);
        parcel.writeInt(this.u);
        parcel.writeInt(this.v);
        parcel.writeInt(this.x);
        parcel.writeString(this.y);
        parcel.writeInt(this.z);
        parcel.writeLong(this.w);
        int size = this.f7714h.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            parcel.writeByteArray(this.f7714h.get(i3));
        }
        parcel.writeParcelable(this.i, 0);
        parcel.writeParcelable(this.f7710d, 0);
    }
}
