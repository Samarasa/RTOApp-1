package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import c.b.b.b.c.a;

/* renamed from: com.google.android.gms.internal.ads.rra  reason: case insensitive filesystem */
public final class C2534rra extends C2446qia implements C2393pra {
    C2534rra(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C1755gra a(c.b.b.b.c.a r2, com.google.android.gms.internal.ads.C2462qqa r3, java.lang.String r4, int r5) {
        /*
            r1 = this;
            android.os.Parcel r0 = r1.c()
            com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r0, (android.os.IInterface) r2)
            com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r0, (android.os.Parcelable) r3)
            r0.writeString(r4)
            r0.writeInt(r5)
            r2 = 10
            android.os.Parcel r2 = r1.a(r2, r0)
            android.os.IBinder r3 = r2.readStrongBinder()
            if (r3 != 0) goto L_0x001e
            r3 = 0
            goto L_0x0032
        L_0x001e:
            java.lang.String r4 = "com.google.android.gms.ads.internal.client.IAdManager"
            android.os.IInterface r4 = r3.queryLocalInterface(r4)
            boolean r5 = r4 instanceof com.google.android.gms.internal.ads.C1755gra
            if (r5 == 0) goto L_0x002c
            r3 = r4
            com.google.android.gms.internal.ads.gra r3 = (com.google.android.gms.internal.ads.C1755gra) r3
            goto L_0x0032
        L_0x002c:
            com.google.android.gms.internal.ads.ira r4 = new com.google.android.gms.internal.ads.ira
            r4.<init>(r3)
            r3 = r4
        L_0x0032:
            r2.recycle()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2534rra.a(c.b.b.b.c.a, com.google.android.gms.internal.ads.qqa, java.lang.String, int):com.google.android.gms.internal.ads.gra");
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C1755gra a(c.b.b.b.c.a r2, com.google.android.gms.internal.ads.C2462qqa r3, java.lang.String r4, com.google.android.gms.internal.ads.C0675Ef r5, int r6) {
        /*
            r1 = this;
            android.os.Parcel r0 = r1.c()
            com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r0, (android.os.IInterface) r2)
            com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r0, (android.os.Parcelable) r3)
            r0.writeString(r4)
            com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r0, (android.os.IInterface) r5)
            r0.writeInt(r6)
            r2 = 1
            android.os.Parcel r2 = r1.a(r2, r0)
            android.os.IBinder r3 = r2.readStrongBinder()
            if (r3 != 0) goto L_0x0020
            r3 = 0
            goto L_0x0034
        L_0x0020:
            java.lang.String r4 = "com.google.android.gms.ads.internal.client.IAdManager"
            android.os.IInterface r4 = r3.queryLocalInterface(r4)
            boolean r5 = r4 instanceof com.google.android.gms.internal.ads.C1755gra
            if (r5 == 0) goto L_0x002e
            r3 = r4
            com.google.android.gms.internal.ads.gra r3 = (com.google.android.gms.internal.ads.C1755gra) r3
            goto L_0x0034
        L_0x002e:
            com.google.android.gms.internal.ads.ira r4 = new com.google.android.gms.internal.ads.ira
            r4.<init>(r3)
            r3 = r4
        L_0x0034:
            r2.recycle()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2534rra.a(c.b.b.b.c.a, com.google.android.gms.internal.ads.qqa, java.lang.String, com.google.android.gms.internal.ads.Ef, int):com.google.android.gms.internal.ads.gra");
    }

    public final C1875ih a(a aVar, C0675Ef ef, int i) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) aVar);
        C2516ria.a(c2, (IInterface) ef);
        c2.writeInt(i);
        Parcel a2 = a(15, c2);
        C1875ih a3 = C2088lh.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.Zqa b(c.b.b.b.c.a r2, java.lang.String r3, com.google.android.gms.internal.ads.C0675Ef r4, int r5) {
        /*
            r1 = this;
            android.os.Parcel r0 = r1.c()
            com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r0, (android.os.IInterface) r2)
            r0.writeString(r3)
            com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r0, (android.os.IInterface) r4)
            r0.writeInt(r5)
            r2 = 3
            android.os.Parcel r2 = r1.a(r2, r0)
            android.os.IBinder r3 = r2.readStrongBinder()
            if (r3 != 0) goto L_0x001d
            r3 = 0
            goto L_0x0031
        L_0x001d:
            java.lang.String r4 = "com.google.android.gms.ads.internal.client.IAdLoaderBuilder"
            android.os.IInterface r4 = r3.queryLocalInterface(r4)
            boolean r5 = r4 instanceof com.google.android.gms.internal.ads.Zqa
            if (r5 == 0) goto L_0x002b
            r3 = r4
            com.google.android.gms.internal.ads.Zqa r3 = (com.google.android.gms.internal.ads.Zqa) r3
            goto L_0x0031
        L_0x002b:
            com.google.android.gms.internal.ads.bra r4 = new com.google.android.gms.internal.ads.bra
            r4.<init>(r3)
            r3 = r4
        L_0x0031:
            r2.recycle()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2534rra.b(c.b.b.b.c.a, java.lang.String, com.google.android.gms.internal.ads.Ef, int):com.google.android.gms.internal.ads.Zqa");
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C1755gra b(c.b.b.b.c.a r2, com.google.android.gms.internal.ads.C2462qqa r3, java.lang.String r4, com.google.android.gms.internal.ads.C0675Ef r5, int r6) {
        /*
            r1 = this;
            android.os.Parcel r0 = r1.c()
            com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r0, (android.os.IInterface) r2)
            com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r0, (android.os.Parcelable) r3)
            r0.writeString(r4)
            com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r0, (android.os.IInterface) r5)
            r0.writeInt(r6)
            r2 = 2
            android.os.Parcel r2 = r1.a(r2, r0)
            android.os.IBinder r3 = r2.readStrongBinder()
            if (r3 != 0) goto L_0x0020
            r3 = 0
            goto L_0x0034
        L_0x0020:
            java.lang.String r4 = "com.google.android.gms.ads.internal.client.IAdManager"
            android.os.IInterface r4 = r3.queryLocalInterface(r4)
            boolean r5 = r4 instanceof com.google.android.gms.internal.ads.C1755gra
            if (r5 == 0) goto L_0x002e
            r3 = r4
            com.google.android.gms.internal.ads.gra r3 = (com.google.android.gms.internal.ads.C1755gra) r3
            goto L_0x0034
        L_0x002e:
            com.google.android.gms.internal.ads.ira r4 = new com.google.android.gms.internal.ads.ira
            r4.<init>(r3)
            r3 = r4
        L_0x0034:
            r2.recycle()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2534rra.b(c.b.b.b.c.a, com.google.android.gms.internal.ads.qqa, java.lang.String, com.google.android.gms.internal.ads.Ef, int):com.google.android.gms.internal.ads.gra");
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C1755gra c(c.b.b.b.c.a r2, com.google.android.gms.internal.ads.C2462qqa r3, java.lang.String r4, com.google.android.gms.internal.ads.C0675Ef r5, int r6) {
        /*
            r1 = this;
            android.os.Parcel r0 = r1.c()
            com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r0, (android.os.IInterface) r2)
            com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r0, (android.os.Parcelable) r3)
            r0.writeString(r4)
            com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r0, (android.os.IInterface) r5)
            r0.writeInt(r6)
            r2 = 13
            android.os.Parcel r2 = r1.a(r2, r0)
            android.os.IBinder r3 = r2.readStrongBinder()
            if (r3 != 0) goto L_0x0021
            r3 = 0
            goto L_0x0035
        L_0x0021:
            java.lang.String r4 = "com.google.android.gms.ads.internal.client.IAdManager"
            android.os.IInterface r4 = r3.queryLocalInterface(r4)
            boolean r5 = r4 instanceof com.google.android.gms.internal.ads.C1755gra
            if (r5 == 0) goto L_0x002f
            r3 = r4
            com.google.android.gms.internal.ads.gra r3 = (com.google.android.gms.internal.ads.C1755gra) r3
            goto L_0x0035
        L_0x002f:
            com.google.android.gms.internal.ads.ira r4 = new com.google.android.gms.internal.ads.ira
            r4.<init>(r3)
            r3 = r4
        L_0x0035:
            r2.recycle()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2534rra.c(c.b.b.b.c.a, com.google.android.gms.internal.ads.qqa, java.lang.String, com.google.android.gms.internal.ads.Ef, int):com.google.android.gms.internal.ads.gra");
    }

    public final C0964Pi d(a aVar, C0675Ef ef, int i) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) aVar);
        C2516ria.a(c2, (IInterface) ef);
        c2.writeInt(i);
        Parcel a2 = a(6, c2);
        C0964Pi a3 = C1042Si.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    public final C2360pb d(a aVar, a aVar2) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) aVar);
        C2516ria.a(c2, (IInterface) aVar2);
        Parcel a2 = a(5, c2);
        C2360pb a3 = C2289ob.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.C2889wra d(c.b.b.b.c.a r3, int r4) {
        /*
            r2 = this;
            android.os.Parcel r0 = r2.c()
            com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r0, (android.os.IInterface) r3)
            r0.writeInt(r4)
            r3 = 9
            android.os.Parcel r3 = r2.a(r3, r0)
            android.os.IBinder r4 = r3.readStrongBinder()
            if (r4 != 0) goto L_0x0018
            r4 = 0
            goto L_0x002c
        L_0x0018:
            java.lang.String r0 = "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager"
            android.os.IInterface r0 = r4.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.C2889wra
            if (r1 == 0) goto L_0x0026
            r4 = r0
            com.google.android.gms.internal.ads.wra r4 = (com.google.android.gms.internal.ads.C2889wra) r4
            goto L_0x002c
        L_0x0026:
            com.google.android.gms.internal.ads.yra r0 = new com.google.android.gms.internal.ads.yra
            r0.<init>(r4)
            r4 = r0
        L_0x002c:
            r3.recycle()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2534rra.d(c.b.b.b.c.a, int):com.google.android.gms.internal.ads.wra");
    }

    public final C2868wh x(a aVar) {
        Parcel c2 = c();
        C2516ria.a(c2, (IInterface) aVar);
        Parcel a2 = a(8, c2);
        C2868wh a3 = C2797vh.a(a2.readStrongBinder());
        a2.recycle();
        return a3;
    }
}
