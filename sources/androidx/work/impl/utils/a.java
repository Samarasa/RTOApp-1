package androidx.work.impl.utils;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.m;

class a extends c {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ m f1963b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f1964c;

    a(m mVar, String str) {
        this.f1963b = mVar;
        this.f1964c = str;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public void b() {
        WorkDatabase g2 = this.f1963b.g();
        g2.c();
        try {
            for (String a2 : g2.r().f(this.f1964c)) {
                a(this.f1963b, a2);
            }
            g2.k();
            g2.e();
            a(this.f1963b);
        } catch (Throwable th) {
            g2.e();
            throw th;
        }
    }
}
