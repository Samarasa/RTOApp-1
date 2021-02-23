package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.common.internal.a.a;
import com.google.android.gms.common.internal.a.c;
import com.google.android.gms.common.internal.a.d;
import com.google.android.gms.common.util.k;
import java.io.DataInputStream;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.mi  reason: case insensitive filesystem */
public final class C2161mi extends a {
    public static final Parcelable.Creator<C2161mi> CREATOR = new C2303oi();

    /* renamed from: a  reason: collision with root package name */
    private ParcelFileDescriptor f11348a;

    /* renamed from: b  reason: collision with root package name */
    private Parcelable f11349b = null;

    /* renamed from: c  reason: collision with root package name */
    private boolean f11350c = true;

    public C2161mi(ParcelFileDescriptor parcelFileDescriptor) {
        this.f11348a = parcelFileDescriptor;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0038  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final /* synthetic */ void a(java.io.OutputStream r3, byte[] r4) {
        /*
            r0 = 0
            java.io.DataOutputStream r1 = new java.io.DataOutputStream     // Catch:{ IOException -> 0x0019 }
            r1.<init>(r3)     // Catch:{ IOException -> 0x0019 }
            int r0 = r4.length     // Catch:{ IOException -> 0x0014, all -> 0x0011 }
            r1.writeInt(r0)     // Catch:{ IOException -> 0x0014, all -> 0x0011 }
            r1.write(r4)     // Catch:{ IOException -> 0x0014, all -> 0x0011 }
            com.google.android.gms.common.util.k.a(r1)
            return
        L_0x0011:
            r4 = move-exception
            r0 = r1
            goto L_0x0032
        L_0x0014:
            r4 = move-exception
            r0 = r1
            goto L_0x001a
        L_0x0017:
            r4 = move-exception
            goto L_0x0032
        L_0x0019:
            r4 = move-exception
        L_0x001a:
            java.lang.String r1 = "Error transporting the ad response"
            com.google.android.gms.internal.ads.C1018Rk.b(r1, r4)     // Catch:{ all -> 0x0017 }
            com.google.android.gms.internal.ads.wk r1 = com.google.android.gms.ads.internal.p.g()     // Catch:{ all -> 0x0017 }
            java.lang.String r2 = "LargeParcelTeleporter.pipeData.1"
            r1.a((java.lang.Throwable) r4, (java.lang.String) r2)     // Catch:{ all -> 0x0017 }
            if (r0 != 0) goto L_0x002e
            com.google.android.gms.common.util.k.a(r3)
            return
        L_0x002e:
            com.google.android.gms.common.util.k.a(r0)
            return
        L_0x0032:
            if (r0 != 0) goto L_0x0038
            com.google.android.gms.common.util.k.a(r3)
            goto L_0x003b
        L_0x0038:
            com.google.android.gms.common.util.k.a(r0)
        L_0x003b:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2161mi.a(java.io.OutputStream, byte[]):void");
    }

    private static <T> ParcelFileDescriptor b(byte[] bArr) {
        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream;
        try {
            ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
            autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(createPipe[1]);
            try {
                C1252_k.f9699a.execute(new C2374pi(autoCloseOutputStream, bArr));
                return createPipe[0];
            } catch (IOException e2) {
                e = e2;
                C1018Rk.b("Error transporting the ad response", e);
                p.g().a((Throwable) e, "LargeParcelTeleporter.pipeData.2");
                k.a(autoCloseOutputStream);
                return null;
            }
        } catch (IOException e3) {
            e = e3;
            autoCloseOutputStream = null;
            C1018Rk.b("Error transporting the ad response", e);
            p.g().a((Throwable) e, "LargeParcelTeleporter.pipeData.2");
            k.a(autoCloseOutputStream);
            return null;
        }
    }

    /* JADX INFO: finally extract failed */
    private final ParcelFileDescriptor g() {
        if (this.f11348a == null) {
            Parcel obtain = Parcel.obtain();
            try {
                this.f11349b.writeToParcel(obtain, 0);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                this.f11348a = b(marshall);
            } catch (Throwable th) {
                obtain.recycle();
                throw th;
            }
        }
        return this.f11348a;
    }

    /* JADX INFO: finally extract failed */
    public final <T extends d> T a(Parcelable.Creator<T> creator) {
        if (this.f11350c) {
            ParcelFileDescriptor parcelFileDescriptor = this.f11348a;
            if (parcelFileDescriptor == null) {
                C1018Rk.b("File descriptor is empty, returning null.");
                return null;
            }
            DataInputStream dataInputStream = new DataInputStream(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
            try {
                byte[] bArr = new byte[dataInputStream.readInt()];
                dataInputStream.readFully(bArr, 0, bArr.length);
                k.a(dataInputStream);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.unmarshall(bArr, 0, bArr.length);
                    obtain.setDataPosition(0);
                    this.f11349b = (Parcelable) creator.createFromParcel(obtain);
                    obtain.recycle();
                    this.f11350c = false;
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            } catch (IOException e2) {
                C1018Rk.b("Could not read from parcel file descriptor", e2);
                k.a(dataInputStream);
                return null;
            } catch (Throwable th2) {
                k.a(dataInputStream);
                throw th2;
            }
        }
        return (d) this.f11349b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        g();
        int a2 = c.a(parcel);
        c.a(parcel, 2, (Parcelable) this.f11348a, i, false);
        c.a(parcel, a2);
    }
}
