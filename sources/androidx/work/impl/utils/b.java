package androidx.work.impl.utils;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.m;

class b extends c {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ m f1994b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f1995c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ boolean f1996d;

    b(m mVar, String str, boolean z) {
        this.f1994b = mVar;
        this.f1995c = str;
        this.f1996d = z;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public void b() {
        WorkDatabase g2 = this.f1994b.g();
        g2.c();
        try {
            for (String a2 : g2.r().b(this.f1995c)) {
                a(this.f1994b, a2);
            }
            g2.k();
            g2.e();
            if (this.f1996d) {
                a(this.f1994b);
            }
        } catch (Throwable th) {
            g2.e();
            throw th;
        }
    }
}
