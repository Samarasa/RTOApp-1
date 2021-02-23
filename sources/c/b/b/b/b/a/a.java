package c.b.b.b.b.a;

import android.util.Log;
import com.google.android.gms.common.internal.C0555k;
import java.util.Locale;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private final String f3858a;

    /* renamed from: b  reason: collision with root package name */
    private final String f3859b;

    /* renamed from: c  reason: collision with root package name */
    private final C0555k f3860c;

    /* renamed from: d  reason: collision with root package name */
    private final int f3861d;

    private a(String str, String str2) {
        this.f3859b = str2;
        this.f3858a = str;
        this.f3860c = new C0555k(str);
        int i = 2;
        while (7 >= i && !Log.isLoggable(this.f3858a, i)) {
            i++;
        }
        this.f3861d = i;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(java.lang.String r7, java.lang.String... r8) {
        /*
            r6 = this;
            int r0 = r8.length
            if (r0 != 0) goto L_0x0006
            java.lang.String r8 = ""
            goto L_0x0036
        L_0x0006:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 91
            r0.append(r1)
            int r1 = r8.length
            r2 = 0
        L_0x0012:
            if (r2 >= r1) goto L_0x0028
            r3 = r8[r2]
            int r4 = r0.length()
            r5 = 1
            if (r4 <= r5) goto L_0x0022
            java.lang.String r4 = ","
            r0.append(r4)
        L_0x0022:
            r0.append(r3)
            int r2 = r2 + 1
            goto L_0x0012
        L_0x0028:
            r8 = 93
            r0.append(r8)
            r8 = 32
            r0.append(r8)
            java.lang.String r8 = r0.toString()
        L_0x0036:
            r6.<init>((java.lang.String) r7, (java.lang.String) r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.b.b.b.a.a.<init>(java.lang.String, java.lang.String[]):void");
    }

    public void a(String str, Throwable th, Object... objArr) {
        Log.e(this.f3858a, b(str, objArr), th);
    }

    public void a(String str, Object... objArr) {
        Log.e(this.f3858a, b(str, objArr));
    }

    public void a(Throwable th) {
        Log.wtf(this.f3858a, th);
    }

    public boolean a(int i) {
        return this.f3861d <= i;
    }

    /* access modifiers changed from: protected */
    public String b(String str, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f3859b.concat(str);
    }

    public void b(String str, Throwable th, Object... objArr) {
        Log.wtf(this.f3858a, b(str, objArr), th);
    }

    public void c(String str, Object... objArr) {
        Log.i(this.f3858a, b(str, objArr));
    }

    public void d(String str, Object... objArr) {
        if (a(2)) {
            Log.v(this.f3858a, b(str, objArr));
        }
    }
}
