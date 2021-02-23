package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.f;
import com.google.android.gms.ads.internal.p;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.Eo  reason: case insensitive filesystem */
public class C0684Eo {

    /* renamed from: a  reason: collision with root package name */
    private final C1200Yk f6757a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f6758b;

    /* renamed from: c  reason: collision with root package name */
    private final WeakReference<Context> f6759c;

    /* renamed from: com.google.android.gms.internal.ads.Eo$a */
    public static class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public C1200Yk f6760a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public Context f6761b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public WeakReference<Context> f6762c;

        public final a a(Context context) {
            this.f6762c = new WeakReference<>(context);
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f6761b = context;
            return this;
        }

        public final a a(C1200Yk yk) {
            this.f6760a = yk;
            return this;
        }
    }

    private C0684Eo(a aVar) {
        this.f6757a = aVar.f6760a;
        this.f6758b = aVar.f6761b;
        this.f6759c = aVar.f6762c;
    }

    /* access modifiers changed from: package-private */
    public final Context a() {
        return this.f6758b;
    }

    /* access modifiers changed from: package-private */
    public final WeakReference<Context> b() {
        return this.f6759c;
    }

    /* access modifiers changed from: package-private */
    public final C1200Yk c() {
        return this.f6757a;
    }

    /* access modifiers changed from: package-private */
    public final String d() {
        return p.c().b(this.f6758b, this.f6757a.f9456a);
    }

    public final Qba e() {
        return new Qba(new f(this.f6758b, this.f6757a));
    }
}
