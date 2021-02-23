package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.ha;

/* renamed from: com.google.android.gms.internal.ads.Dk  reason: case insensitive filesystem */
public final class C0654Dk {

    /* renamed from: a  reason: collision with root package name */
    private long f6617a = -1;

    /* renamed from: b  reason: collision with root package name */
    private long f6618b = -1;

    /* renamed from: c  reason: collision with root package name */
    private int f6619c = -1;

    /* renamed from: d  reason: collision with root package name */
    int f6620d = -1;

    /* renamed from: e  reason: collision with root package name */
    private long f6621e = 0;

    /* renamed from: f  reason: collision with root package name */
    private final Object f6622f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private final String f6623g;

    /* renamed from: h  reason: collision with root package name */
    private final ha f6624h;
    private int i = 0;
    private int j = 0;

    public C0654Dk(String str, ha haVar) {
        this.f6623g = str;
        this.f6624h = haVar;
    }

    private static boolean a(Context context) {
        Context b2 = C0808Ji.b(context);
        int identifier = b2.getResources().getIdentifier("Theme.Translucent", "style", "android");
        if (identifier == 0) {
            C1018Rk.c("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
        try {
            if (identifier == b2.getPackageManager().getActivityInfo(new ComponentName(b2.getPackageName(), "com.google.android.gms.ads.AdActivity"), 0).theme) {
                return true;
            }
            C1018Rk.c("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            C1018Rk.d("Fail to fetch AdActivity theme");
            C1018Rk.c("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
    }

    public final Bundle a(Context context, String str) {
        Bundle bundle;
        synchronized (this.f6622f) {
            bundle = new Bundle();
            bundle.putString("session_id", this.f6623g);
            bundle.putLong("basets", this.f6618b);
            bundle.putLong("currts", this.f6617a);
            bundle.putString("seq_num", str);
            bundle.putInt("preqs", this.f6619c);
            bundle.putInt("preqs_in_session", this.f6620d);
            bundle.putLong("time_in_session", this.f6621e);
            bundle.putInt("pclick", this.i);
            bundle.putInt("pimp", this.j);
            bundle.putBoolean("support_transparent_background", a(context));
        }
        return bundle;
    }

    public final void a() {
        synchronized (this.f6622f) {
            this.j++;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0077, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.google.android.gms.internal.ads.C2249nqa r11, long r12) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f6622f
            monitor-enter(r0)
            com.google.android.gms.ads.internal.util.ha r1 = r10.f6624h     // Catch:{ all -> 0x0078 }
            long r1 = r1.j()     // Catch:{ all -> 0x0078 }
            com.google.android.gms.common.util.e r3 = com.google.android.gms.ads.internal.p.j()     // Catch:{ all -> 0x0078 }
            long r3 = r3.a()     // Catch:{ all -> 0x0078 }
            long r5 = r10.f6618b     // Catch:{ all -> 0x0078 }
            r7 = -1
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x003f
            long r1 = r3 - r1
            com.google.android.gms.internal.ads.p<java.lang.Long> r5 = com.google.android.gms.internal.ads.F.ya     // Catch:{ all -> 0x0078 }
            com.google.android.gms.internal.ads.B r6 = com.google.android.gms.internal.ads.Qqa.e()     // Catch:{ all -> 0x0078 }
            java.lang.Object r5 = r6.a(r5)     // Catch:{ all -> 0x0078 }
            java.lang.Long r5 = (java.lang.Long) r5     // Catch:{ all -> 0x0078 }
            long r5 = r5.longValue()     // Catch:{ all -> 0x0078 }
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0033
            r1 = -1
            r10.f6620d = r1     // Catch:{ all -> 0x0078 }
            goto L_0x003b
        L_0x0033:
            com.google.android.gms.ads.internal.util.ha r1 = r10.f6624h     // Catch:{ all -> 0x0078 }
            int r1 = r1.g()     // Catch:{ all -> 0x0078 }
            r10.f6620d = r1     // Catch:{ all -> 0x0078 }
        L_0x003b:
            r10.f6618b = r12     // Catch:{ all -> 0x0078 }
            long r12 = r10.f6618b     // Catch:{ all -> 0x0078 }
        L_0x003f:
            r10.f6617a = r12     // Catch:{ all -> 0x0078 }
            r12 = 1
            if (r11 == 0) goto L_0x0055
            android.os.Bundle r13 = r11.f11536c     // Catch:{ all -> 0x0078 }
            if (r13 == 0) goto L_0x0055
            android.os.Bundle r11 = r11.f11536c     // Catch:{ all -> 0x0078 }
            java.lang.String r13 = "gw"
            r1 = 2
            int r11 = r11.getInt(r13, r1)     // Catch:{ all -> 0x0078 }
            if (r11 != r12) goto L_0x0055
            monitor-exit(r0)     // Catch:{ all -> 0x0078 }
            return
        L_0x0055:
            int r11 = r10.f6619c     // Catch:{ all -> 0x0078 }
            int r11 = r11 + r12
            r10.f6619c = r11     // Catch:{ all -> 0x0078 }
            int r11 = r10.f6620d     // Catch:{ all -> 0x0078 }
            int r11 = r11 + r12
            r10.f6620d = r11     // Catch:{ all -> 0x0078 }
            int r11 = r10.f6620d     // Catch:{ all -> 0x0078 }
            if (r11 != 0) goto L_0x006d
            r11 = 0
            r10.f6621e = r11     // Catch:{ all -> 0x0078 }
            com.google.android.gms.ads.internal.util.ha r11 = r10.f6624h     // Catch:{ all -> 0x0078 }
            r11.b((long) r3)     // Catch:{ all -> 0x0078 }
            goto L_0x0076
        L_0x006d:
            com.google.android.gms.ads.internal.util.ha r11 = r10.f6624h     // Catch:{ all -> 0x0078 }
            long r11 = r11.e()     // Catch:{ all -> 0x0078 }
            long r3 = r3 - r11
            r10.f6621e = r3     // Catch:{ all -> 0x0078 }
        L_0x0076:
            monitor-exit(r0)     // Catch:{ all -> 0x0078 }
            return
        L_0x0078:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0078 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0654Dk.a(com.google.android.gms.internal.ads.nqa, long):void");
    }

    public final void b() {
        synchronized (this.f6622f) {
            this.i++;
        }
    }
}
