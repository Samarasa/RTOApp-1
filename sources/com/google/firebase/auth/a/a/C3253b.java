package com.google.firebase.auth.a.a;

import c.b.b.b.b.a.a;
import c.b.b.b.g.i;
import c.b.b.b.g.l;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.e;
import com.google.firebase.auth.a.a.C3255d;
import java.util.concurrent.Future;

/* renamed from: com.google.firebase.auth.a.a.b  reason: case insensitive filesystem */
public abstract class C3253b<T extends C3255d> {

    /* renamed from: a  reason: collision with root package name */
    private static a f14300a = new a("BiChannelGoogleApi", "FirebaseAuth: ");

    /* renamed from: b  reason: collision with root package name */
    private C3252a<T> f14301b;

    private final e<T> a(String str) {
        C3252a c2 = c();
        if (c2.f14298c.c(str)) {
            a aVar = f14300a;
            String valueOf = String.valueOf(c2.f14297b);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 43);
            sb.append("getGoogleApiForMethod() returned Fallback: ");
            sb.append(valueOf);
            aVar.c(sb.toString(), new Object[0]);
            return c2.f14297b;
        }
        a aVar2 = f14300a;
        String valueOf2 = String.valueOf(c2.f14296a);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 38);
        sb2.append("getGoogleApiForMethod() returned Gms: ");
        sb2.append(valueOf2);
        aVar2.c(sb2.toString(), new Object[0]);
        return c2.f14296a;
    }

    private static <ResultT> i<ResultT> b() {
        return l.a((Exception) O.a(new Status(17499, "Unable to connect to GoogleApi instance - Google Play Services may be unavailable")));
    }

    private final C3252a<T> c() {
        C3252a<T> aVar;
        synchronized (this) {
            if (this.f14301b == null) {
                try {
                    this.f14301b = (C3252a) a().get();
                } catch (Exception e2) {
                    String valueOf = String.valueOf(e2.getMessage());
                    throw new RuntimeException(valueOf.length() != 0 ? "There was an error while initializing the connection to Google Play Services: ".concat(valueOf) : new String("There was an error while initializing the connection to Google Play Services: "));
                }
            }
            aVar = this.f14301b;
        }
        return aVar;
    }

    public final <ResultT, A extends a.b> i<ResultT> a(C3256e<A, ResultT> eVar) {
        e a2 = a(eVar.a());
        if (a2 == null) {
            return b();
        }
        if (((C3255d) a2.c()).f14313a) {
            eVar.e();
        }
        return a2.a(eVar.b());
    }

    /* access modifiers changed from: package-private */
    public abstract Future<C3252a<T>> a();

    public final <ResultT, A extends a.b> i<ResultT> b(C3256e<A, ResultT> eVar) {
        e a2 = a(eVar.a());
        if (a2 == null) {
            return b();
        }
        if (((C3255d) a2.c()).f14313a) {
            eVar.e();
        }
        return a2.b(eVar.b());
    }
}
