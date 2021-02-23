package com.google.android.gms.internal.ads;

import android.content.Context;
import c.b.b.b.g.i;
import c.b.b.b.g.l;
import com.google.android.gms.internal.ads.C0588Aw;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.pV  reason: case insensitive filesystem */
public final class C2353pV {

    /* renamed from: a  reason: collision with root package name */
    private static volatile C0588Aw.c f11719a = C0588Aw.c.UNKNOWN;

    /* renamed from: b  reason: collision with root package name */
    private final Context f11720b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f11721c;

    /* renamed from: d  reason: collision with root package name */
    private final i<Woa> f11722d;

    private C2353pV(Context context, Executor executor, i<Woa> iVar) {
        this.f11720b = context;
        this.f11721c = executor;
        this.f11722d = iVar;
    }

    private final i<Boolean> a(int i, long j, Exception exc, String str, Map<String, String> map, String str2) {
        C0588Aw.a o = C0588Aw.o();
        o.a(this.f11720b.getPackageName());
        o.a(j);
        o.a(f11719a);
        if (exc != null) {
            o.b(C2142mX.a(exc));
            o.c(exc.getClass().getName());
        }
        if (str2 != null) {
            o.d(str2);
        }
        if (str != null) {
            o.e(str);
        }
        return this.f11722d.a(this.f11721c, new C2494rV(o, i));
    }

    static final /* synthetic */ Woa a(Context context) {
        return new Woa(context, "GLAS", (String) null);
    }

    public static C2353pV a(Context context, Executor executor) {
        return new C2353pV(context, executor, l.a(executor, new C2282oV(context)));
    }

    static final /* synthetic */ Boolean a(C0588Aw.a aVar, int i, i iVar) {
        boolean z;
        if (iVar.e()) {
            C1326apa a2 = ((Woa) iVar.b()).a(((C0588Aw) aVar.k()).f());
            a2.b(i);
            a2.a();
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    static void a(C0588Aw.c cVar) {
        f11719a = cVar;
    }

    public final i<Boolean> a(int i, long j) {
        return a(i, j, (Exception) null, (String) null, (Map<String, String>) null, (String) null);
    }

    public final i<Boolean> a(int i, long j, Exception exc) {
        return a(i, j, exc, (String) null, (Map<String, String>) null, (String) null);
    }

    public final i<Boolean> a(int i, long j, String str) {
        return a(i, j, (Exception) null, (String) null, (Map<String, String>) null, str);
    }

    public final i<Boolean> a(int i, long j, String str, Map<String, String> map) {
        return a(i, j, (Exception) null, str, (Map<String, String>) null, (String) null);
    }

    public final i<Boolean> a(int i, String str) {
        return a(i, 0, (Exception) null, (String) null, (Map<String, String>) null, str);
    }
}
