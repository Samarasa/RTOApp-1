package c.b.b.b.d.f;

import android.content.Context;
import android.os.Bundle;
import c.b.b.b.d.f.Vf;

/* renamed from: c.b.b.b.d.f.b  reason: case insensitive filesystem */
final class C0297b extends Vf.a {

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ String f4371e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ String f4372f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ Context f4373g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ Bundle f4374h;
    private final /* synthetic */ Vf i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C0297b(Vf vf, String str, String str2, Context context, Bundle bundle) {
        super(vf);
        this.i = vf;
        this.f4371e = str;
        this.f4372f = str2;
        this.f4373g = context;
        this.f4374h = bundle;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0072, code lost:
        if (r4 < r3) goto L_0x0074;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0054 A[Catch:{ Exception -> 0x009e }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0060 A[Catch:{ Exception -> 0x009e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r14 = this;
            r0 = 0
            r1 = 1
            c.b.b.b.d.f.Vf r2 = r14.i     // Catch:{ Exception -> 0x009e }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x009e }
            r3.<init>()     // Catch:{ Exception -> 0x009e }
            java.util.List unused = r2.l = r3     // Catch:{ Exception -> 0x009e }
            c.b.b.b.d.f.Vf r2 = r14.i     // Catch:{ Exception -> 0x009e }
            java.lang.String r3 = r14.f4371e     // Catch:{ Exception -> 0x009e }
            java.lang.String r4 = r14.f4372f     // Catch:{ Exception -> 0x009e }
            boolean r2 = c.b.b.b.d.f.Vf.b(r3, r4)     // Catch:{ Exception -> 0x009e }
            r3 = 0
            if (r2 == 0) goto L_0x0027
            java.lang.String r3 = r14.f4372f     // Catch:{ Exception -> 0x009e }
            java.lang.String r2 = r14.f4371e     // Catch:{ Exception -> 0x009e }
            c.b.b.b.d.f.Vf r4 = r14.i     // Catch:{ Exception -> 0x009e }
            java.lang.String r4 = r4.f4319h     // Catch:{ Exception -> 0x009e }
            r10 = r2
            r11 = r3
            r9 = r4
            goto L_0x002a
        L_0x0027:
            r9 = r3
            r10 = r9
            r11 = r10
        L_0x002a:
            android.content.Context r2 = r14.f4373g     // Catch:{ Exception -> 0x009e }
            c.b.b.b.d.f.Vf.i(r2)     // Catch:{ Exception -> 0x009e }
            java.lang.Boolean r2 = c.b.b.b.d.f.Vf.f4314c     // Catch:{ Exception -> 0x009e }
            boolean r2 = r2.booleanValue()     // Catch:{ Exception -> 0x009e }
            if (r2 != 0) goto L_0x003e
            if (r10 == 0) goto L_0x003c
            goto L_0x003e
        L_0x003c:
            r2 = 0
            goto L_0x003f
        L_0x003e:
            r2 = 1
        L_0x003f:
            c.b.b.b.d.f.Vf r3 = r14.i     // Catch:{ Exception -> 0x009e }
            c.b.b.b.d.f.Vf r4 = r14.i     // Catch:{ Exception -> 0x009e }
            android.content.Context r5 = r14.f4373g     // Catch:{ Exception -> 0x009e }
            c.b.b.b.d.f.gf r4 = r4.a((android.content.Context) r5, (boolean) r2)     // Catch:{ Exception -> 0x009e }
            c.b.b.b.d.f.C0338gf unused = r3.p = r4     // Catch:{ Exception -> 0x009e }
            c.b.b.b.d.f.Vf r3 = r14.i     // Catch:{ Exception -> 0x009e }
            c.b.b.b.d.f.gf r3 = r3.p     // Catch:{ Exception -> 0x009e }
            if (r3 != 0) goto L_0x0060
            c.b.b.b.d.f.Vf r2 = r14.i     // Catch:{ Exception -> 0x009e }
            java.lang.String r2 = r2.f4319h     // Catch:{ Exception -> 0x009e }
            java.lang.String r3 = "Failed to connect to measurement client."
            android.util.Log.w(r2, r3)     // Catch:{ Exception -> 0x009e }
            return
        L_0x0060:
            android.content.Context r3 = r14.f4373g     // Catch:{ Exception -> 0x009e }
            int r3 = c.b.b.b.d.f.Vf.h(r3)     // Catch:{ Exception -> 0x009e }
            android.content.Context r4 = r14.f4373g     // Catch:{ Exception -> 0x009e }
            int r4 = c.b.b.b.d.f.Vf.g(r4)     // Catch:{ Exception -> 0x009e }
            if (r2 == 0) goto L_0x0079
            int r2 = java.lang.Math.max(r3, r4)     // Catch:{ Exception -> 0x009e }
            if (r4 >= r3) goto L_0x0076
        L_0x0074:
            r3 = 1
            goto L_0x0077
        L_0x0076:
            r3 = 0
        L_0x0077:
            r8 = r3
            goto L_0x0081
        L_0x0079:
            if (r3 <= 0) goto L_0x007d
            r2 = r3
            goto L_0x007e
        L_0x007d:
            r2 = r4
        L_0x007e:
            if (r3 <= 0) goto L_0x0076
            goto L_0x0074
        L_0x0081:
            c.b.b.b.d.f.Tf r13 = new c.b.b.b.d.f.Tf     // Catch:{ Exception -> 0x009e }
            r4 = 19000(0x4a38, double:9.3872E-320)
            long r6 = (long) r2     // Catch:{ Exception -> 0x009e }
            android.os.Bundle r12 = r14.f4374h     // Catch:{ Exception -> 0x009e }
            r3 = r13
            r3.<init>(r4, r6, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x009e }
            c.b.b.b.d.f.Vf r2 = r14.i     // Catch:{ Exception -> 0x009e }
            c.b.b.b.d.f.gf r2 = r2.p     // Catch:{ Exception -> 0x009e }
            android.content.Context r3 = r14.f4373g     // Catch:{ Exception -> 0x009e }
            c.b.b.b.c.a r3 = c.b.b.b.c.b.a(r3)     // Catch:{ Exception -> 0x009e }
            long r4 = r14.f4320a     // Catch:{ Exception -> 0x009e }
            r2.initialize(r3, r13, r4)     // Catch:{ Exception -> 0x009e }
            return
        L_0x009e:
            r2 = move-exception
            c.b.b.b.d.f.Vf r3 = r14.i
            r3.a((java.lang.Exception) r2, (boolean) r1, (boolean) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.b.b.d.f.C0297b.a():void");
    }
}
