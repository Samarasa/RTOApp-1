package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.common.api.i;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Qm  reason: case insensitive filesystem */
public abstract class C0994Qm implements i {

    /* renamed from: a  reason: collision with root package name */
    protected Context f8386a;

    /* renamed from: b  reason: collision with root package name */
    protected String f8387b;

    /* renamed from: c  reason: collision with root package name */
    protected WeakReference<C1175Xl> f8388c;

    public C0994Qm(C1175Xl xl) {
        this.f8386a = xl.getContext();
        this.f8387b = p.c().b(this.f8386a, xl.B().f9456a);
        this.f8388c = new WeakReference<>(xl);
    }

    /* access modifiers changed from: private */
    public final void a(String str, Map<String, String> map) {
        C1175Xl xl = (C1175Xl) this.f8388c.get();
        if (xl != null) {
            xl.a(str, (Map<String, ?>) map);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String c(java.lang.String r1) {
        /*
            int r0 = r1.hashCode()
            switch(r0) {
                case -1947652542: goto L_0x007d;
                case -1396664534: goto L_0x0072;
                case -1347010958: goto L_0x0068;
                case -918817863: goto L_0x005d;
                case -659376217: goto L_0x0053;
                case -642208130: goto L_0x0049;
                case -354048396: goto L_0x003e;
                case -32082395: goto L_0x0033;
                case 3387234: goto L_0x0029;
                case 96784904: goto L_0x001f;
                case 580119100: goto L_0x0014;
                case 725497484: goto L_0x0009;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x0087
        L_0x0009:
            java.lang.String r0 = "noCacheDir"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 7
            goto L_0x0088
        L_0x0014:
            java.lang.String r0 = "expireFailed"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 6
            goto L_0x0088
        L_0x001f:
            java.lang.String r0 = "error"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 1
            goto L_0x0088
        L_0x0029:
            java.lang.String r0 = "noop"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 4
            goto L_0x0088
        L_0x0033:
            java.lang.String r0 = "externalAbort"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 10
            goto L_0x0088
        L_0x003e:
            java.lang.String r0 = "sizeExceeded"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 11
            goto L_0x0088
        L_0x0049:
            java.lang.String r0 = "playerFailed"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 5
            goto L_0x0088
        L_0x0053:
            java.lang.String r0 = "contentLengthMissing"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 0
            goto L_0x0088
        L_0x005d:
            java.lang.String r0 = "downloadTimeout"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 9
            goto L_0x0088
        L_0x0068:
            java.lang.String r0 = "inProgress"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 2
            goto L_0x0088
        L_0x0072:
            java.lang.String r0 = "badUrl"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 8
            goto L_0x0088
        L_0x007d:
            java.lang.String r0 = "interrupted"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0087
            r1 = 3
            goto L_0x0088
        L_0x0087:
            r1 = -1
        L_0x0088:
            java.lang.String r0 = "internal"
            switch(r1) {
                case 0: goto L_0x0096;
                case 1: goto L_0x0096;
                case 2: goto L_0x0096;
                case 3: goto L_0x0096;
                case 4: goto L_0x0096;
                case 5: goto L_0x0096;
                case 6: goto L_0x0094;
                case 7: goto L_0x0094;
                case 8: goto L_0x0091;
                case 9: goto L_0x0091;
                case 10: goto L_0x008e;
                case 11: goto L_0x008e;
                default: goto L_0x008d;
            }
        L_0x008d:
            goto L_0x0096
        L_0x008e:
            java.lang.String r0 = "policy"
            goto L_0x0096
        L_0x0091:
            java.lang.String r0 = "network"
            goto L_0x0096
        L_0x0094:
            java.lang.String r0 = "io"
        L_0x0096:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0994Qm.c(java.lang.String):java.lang.String");
    }

    public void a() {
    }

    /* access modifiers changed from: protected */
    public final void a(String str, String str2, int i) {
        C0758Hk.f7186a.post(new C1124Vm(this, str, str2, i));
    }

    public final void a(String str, String str2, int i, int i2, long j, long j2, boolean z, int i3, int i4) {
        C0758Hk.f7186a.post(new C1020Rm(this, str, str2, i, i2, j, j2, z, i3, i4));
    }

    public final void a(String str, String str2, long j) {
        C0758Hk.f7186a.post(new C1098Um(this, str, str2, j));
    }

    public final void a(String str, String str2, long j, long j2, boolean z, long j3, long j4, long j5, int i, int i2) {
        Handler handler = C0758Hk.f7186a;
        C1046Sm sm = r0;
        C1046Sm sm2 = new C1046Sm(this, str, str2, j, j2, j3, j4, j5, z, i, i2);
        handler.post(sm);
    }

    public final void a(String str, String str2, String str3, String str4) {
        C0758Hk.f7186a.post(new C1176Xm(this, str, str2, str3, str4));
    }

    public abstract boolean a(String str);

    public boolean a(String str, String[] strArr) {
        return a(str);
    }

    /* access modifiers changed from: protected */
    public String b(String str) {
        return C0758Hk.a(str);
    }

    public abstract void b();

    /* access modifiers changed from: protected */
    public void b(int i) {
    }

    /* access modifiers changed from: protected */
    public void c(int i) {
    }

    /* access modifiers changed from: protected */
    public void d(int i) {
    }

    /* access modifiers changed from: protected */
    public void e(int i) {
    }
}
