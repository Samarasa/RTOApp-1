package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import c.b.b.b.c.a;
import com.google.android.gms.ads.formats.b;
import com.google.android.gms.ads.formats.g;
import com.google.android.gms.ads.v;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Eb  reason: case insensitive filesystem */
public final class C0671Eb extends g {

    /* renamed from: a  reason: collision with root package name */
    private final C0645Db f6712a;

    /* renamed from: b  reason: collision with root package name */
    private final List<b.C0072b> f6713b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final C2147mb f6714c;

    /* renamed from: d  reason: collision with root package name */
    private final v f6715d = new v();

    /* renamed from: e  reason: collision with root package name */
    private final b.a f6716e;

    /* JADX WARNING: type inference failed for: r3v3, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0078 A[Catch:{ RemoteException -> 0x0085 }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C0671Eb(com.google.android.gms.internal.ads.C0645Db r6) {
        /*
            r5 = this;
            java.lang.String r0 = ""
            r5.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.f6713b = r1
            com.google.android.gms.ads.v r1 = new com.google.android.gms.ads.v
            r1.<init>()
            r5.f6715d = r1
            r5.f6712a = r6
            r6 = 0
            com.google.android.gms.internal.ads.Db r1 = r5.f6712a     // Catch:{ RemoteException -> 0x0057 }
            java.util.List r1 = r1.y()     // Catch:{ RemoteException -> 0x0057 }
            if (r1 == 0) goto L_0x005b
            java.util.Iterator r1 = r1.iterator()     // Catch:{ RemoteException -> 0x0057 }
        L_0x0022:
            boolean r2 = r1.hasNext()     // Catch:{ RemoteException -> 0x0057 }
            if (r2 == 0) goto L_0x005b
            java.lang.Object r2 = r1.next()     // Catch:{ RemoteException -> 0x0057 }
            boolean r3 = r2 instanceof android.os.IBinder     // Catch:{ RemoteException -> 0x0057 }
            if (r3 == 0) goto L_0x0049
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch:{ RemoteException -> 0x0057 }
            if (r2 == 0) goto L_0x0049
            java.lang.String r3 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)     // Catch:{ RemoteException -> 0x0057 }
            boolean r4 = r3 instanceof com.google.android.gms.internal.ads.C2076lb     // Catch:{ RemoteException -> 0x0057 }
            if (r4 == 0) goto L_0x0042
            r2 = r3
            com.google.android.gms.internal.ads.lb r2 = (com.google.android.gms.internal.ads.C2076lb) r2     // Catch:{ RemoteException -> 0x0057 }
            goto L_0x004a
        L_0x0042:
            com.google.android.gms.internal.ads.nb r3 = new com.google.android.gms.internal.ads.nb     // Catch:{ RemoteException -> 0x0057 }
            r3.<init>(r2)     // Catch:{ RemoteException -> 0x0057 }
            r2 = r3
            goto L_0x004a
        L_0x0049:
            r2 = r6
        L_0x004a:
            if (r2 == 0) goto L_0x0022
            java.util.List<com.google.android.gms.ads.formats.b$b> r3 = r5.f6713b     // Catch:{ RemoteException -> 0x0057 }
            com.google.android.gms.internal.ads.mb r4 = new com.google.android.gms.internal.ads.mb     // Catch:{ RemoteException -> 0x0057 }
            r4.<init>(r2)     // Catch:{ RemoteException -> 0x0057 }
            r3.add(r4)     // Catch:{ RemoteException -> 0x0057 }
            goto L_0x0022
        L_0x0057:
            r1 = move-exception
            com.google.android.gms.internal.ads.C1018Rk.b(r0, r1)
        L_0x005b:
            com.google.android.gms.internal.ads.Db r1 = r5.f6712a     // Catch:{ RemoteException -> 0x0069 }
            com.google.android.gms.internal.ads.lb r1 = r1.ra()     // Catch:{ RemoteException -> 0x0069 }
            if (r1 == 0) goto L_0x006d
            com.google.android.gms.internal.ads.mb r2 = new com.google.android.gms.internal.ads.mb     // Catch:{ RemoteException -> 0x0069 }
            r2.<init>(r1)     // Catch:{ RemoteException -> 0x0069 }
            goto L_0x006e
        L_0x0069:
            r1 = move-exception
            com.google.android.gms.internal.ads.C1018Rk.b(r0, r1)
        L_0x006d:
            r2 = r6
        L_0x006e:
            r5.f6714c = r2
            com.google.android.gms.internal.ads.Db r1 = r5.f6712a     // Catch:{ RemoteException -> 0x0085 }
            com.google.android.gms.internal.ads.eb r1 = r1.x()     // Catch:{ RemoteException -> 0x0085 }
            if (r1 == 0) goto L_0x0089
            com.google.android.gms.internal.ads.fb r1 = new com.google.android.gms.internal.ads.fb     // Catch:{ RemoteException -> 0x0085 }
            com.google.android.gms.internal.ads.Db r2 = r5.f6712a     // Catch:{ RemoteException -> 0x0085 }
            com.google.android.gms.internal.ads.eb r2 = r2.x()     // Catch:{ RemoteException -> 0x0085 }
            r1.<init>(r2)     // Catch:{ RemoteException -> 0x0085 }
            r6 = r1
            goto L_0x0089
        L_0x0085:
            r1 = move-exception
            com.google.android.gms.internal.ads.C1018Rk.b(r0, r1)
        L_0x0089:
            r5.f6716e = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0671Eb.<init>(com.google.android.gms.internal.ads.Db):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public final a a() {
        try {
            return this.f6712a.B();
        } catch (RemoteException e2) {
            C1018Rk.b(BuildConfig.FLAVOR, e2);
            return null;
        }
    }

    public final CharSequence b() {
        try {
            return this.f6712a.R();
        } catch (RemoteException e2) {
            C1018Rk.b(BuildConfig.FLAVOR, e2);
            return null;
        }
    }

    public final CharSequence c() {
        try {
            return this.f6712a.v();
        } catch (RemoteException e2) {
            C1018Rk.b(BuildConfig.FLAVOR, e2);
            return null;
        }
    }

    public final CharSequence d() {
        try {
            return this.f6712a.s();
        } catch (RemoteException e2) {
            C1018Rk.b(BuildConfig.FLAVOR, e2);
            return null;
        }
    }

    public final CharSequence e() {
        try {
            return this.f6712a.r();
        } catch (RemoteException e2) {
            C1018Rk.b(BuildConfig.FLAVOR, e2);
            return null;
        }
    }

    public final List<b.C0072b> f() {
        return this.f6713b;
    }

    public final b.C0072b g() {
        return this.f6714c;
    }

    public final v h() {
        try {
            if (this.f6712a.getVideoController() != null) {
                this.f6715d.a(this.f6712a.getVideoController());
            }
        } catch (RemoteException e2) {
            C1018Rk.b("Exception occurred while getting video controller", e2);
        }
        return this.f6715d;
    }
}
