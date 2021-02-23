package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.Gb  reason: case insensitive filesystem */
public abstract class C0723Gb extends C2587sia implements C0749Hb {
    public C0723Gb() {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    public static C0749Hb a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
        return queryLocalInterface instanceof C0749Hb ? (C0749Hb) queryLocalInterface : new C0801Jb(iBinder);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0050, code lost:
        r3.writeNoException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006c, code lost:
        r3.writeNoException();
        com.google.android.gms.internal.ads.C2516ria.a(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007b, code lost:
        r3.writeNoException();
        r3.writeString(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0030, code lost:
        r3.writeNoException();
        com.google.android.gms.internal.ads.C2516ria.a(r3, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) {
        /*
            r0 = this;
            switch(r1) {
                case 1: goto L_0x0073;
                case 2: goto L_0x0064;
                case 3: goto L_0x0059;
                case 4: goto L_0x0054;
                case 5: goto L_0x0049;
                case 6: goto L_0x0045;
                case 7: goto L_0x0040;
                case 8: goto L_0x003c;
                case 9: goto L_0x0037;
                case 10: goto L_0x0024;
                case 11: goto L_0x001f;
                case 12: goto L_0x001a;
                case 13: goto L_0x0015;
                case 14: goto L_0x0009;
                case 15: goto L_0x0005;
                default: goto L_0x0003;
            }
        L_0x0003:
            r1 = 0
            return r1
        L_0x0005:
            r0.bb()
            goto L_0x0050
        L_0x0009:
            android.os.IBinder r1 = r2.readStrongBinder()
            c.b.b.b.c.a r1 = c.b.b.b.c.a.C0060a.a(r1)
            r0.q(r1)
            goto L_0x0050
        L_0x0015:
            boolean r1 = r0.nb()
            goto L_0x0030
        L_0x001a:
            boolean r1 = r0.Ab()
            goto L_0x0030
        L_0x001f:
            c.b.b.b.c.a r1 = r0.B()
            goto L_0x006c
        L_0x0024:
            android.os.IBinder r1 = r2.readStrongBinder()
            c.b.b.b.c.a r1 = c.b.b.b.c.a.C0060a.a(r1)
            boolean r1 = r0.w(r1)
        L_0x0030:
            r3.writeNoException()
            com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r3, (boolean) r1)
            goto L_0x0081
        L_0x0037:
            c.b.b.b.c.a r1 = r0.Mb()
            goto L_0x006c
        L_0x003c:
            r0.destroy()
            goto L_0x0050
        L_0x0040:
            com.google.android.gms.internal.ads.Sra r1 = r0.getVideoController()
            goto L_0x006c
        L_0x0045:
            r0.z()
            goto L_0x0050
        L_0x0049:
            java.lang.String r1 = r2.readString()
            r0.p(r1)
        L_0x0050:
            r3.writeNoException()
            goto L_0x0081
        L_0x0054:
            java.lang.String r1 = r0.W()
            goto L_0x007b
        L_0x0059:
            java.util.List r1 = r0.jb()
            r3.writeNoException()
            r3.writeStringList(r1)
            goto L_0x0081
        L_0x0064:
            java.lang.String r1 = r2.readString()
            com.google.android.gms.internal.ads.lb r1 = r0.y(r1)
        L_0x006c:
            r3.writeNoException()
            com.google.android.gms.internal.ads.C2516ria.a((android.os.Parcel) r3, (android.os.IInterface) r1)
            goto L_0x0081
        L_0x0073:
            java.lang.String r1 = r2.readString()
            java.lang.String r1 = r0.l(r1)
        L_0x007b:
            r3.writeNoException()
            r3.writeString(r1)
        L_0x0081:
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0723Gb.a(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
