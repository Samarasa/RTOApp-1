package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.C0524d;
import com.google.android.gms.common.api.internal.C0530j;
import com.google.android.gms.common.internal.C0547c;
import com.google.android.gms.common.internal.C0548d;
import com.google.android.gms.common.internal.C0557m;
import com.google.android.gms.common.internal.C0563t;
import java.util.Set;

public final class a<O extends d> {

    /* renamed from: a  reason: collision with root package name */
    private final C0073a<?, O> f5763a;

    /* renamed from: b  reason: collision with root package name */
    private final i<?, O> f5764b = null;

    /* renamed from: c  reason: collision with root package name */
    private final g<?> f5765c;

    /* renamed from: d  reason: collision with root package name */
    private final j<?> f5766d;

    /* renamed from: e  reason: collision with root package name */
    private final String f5767e;

    /* renamed from: com.google.android.gms.common.api.a$a  reason: collision with other inner class name */
    public static abstract class C0073a<T extends f, O> extends e<T, O> {
        @Deprecated
        public T a(Context context, Looper looper, C0548d dVar, O o, f.a aVar, f.b bVar) {
            return a(context, looper, dVar, o, (C0524d) aVar, (C0530j) bVar);
        }

        public T a(Context context, Looper looper, C0548d dVar, O o, C0524d dVar2, C0530j jVar) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    public interface b {
    }

    public static class c<C extends b> {
    }

    public interface d {

        /* renamed from: com.google.android.gms.common.api.a$d$a  reason: collision with other inner class name */
        public interface C0074a extends c, C0075d {
            Account a();
        }

        public interface b extends c {
            GoogleSignInAccount b();
        }

        public interface c extends d {
        }

        /* renamed from: com.google.android.gms.common.api.a$d$d  reason: collision with other inner class name */
        public interface C0075d extends d {
        }

        public interface e extends c, C0075d {
        }
    }

    public static abstract class e<T extends b, O> {
    }

    public interface f extends b {
        void a(C0547c.C0077c cVar);

        void a(C0547c.e eVar);

        void a(C0557m mVar, Set<Scope> set);

        Set<Scope> b();

        boolean c();

        String d();

        void e();

        boolean f();

        int g();

        c.b.b.b.b.d[] h();

        boolean i();

        boolean isConnected();
    }

    public static final class g<C extends f> extends c<C> {
    }

    public interface h<T extends IInterface> extends b {
        T a(IBinder iBinder);

        void a(int i, T t);

        String j();

        String k();
    }

    public static abstract class i<T extends h<? extends IInterface>, O> extends e<T, O> {
    }

    public static final class j<C extends h<? extends IInterface>> extends c<C> {
    }

    public <C extends f> a(String str, C0073a<C, O> aVar, g<C> gVar) {
        C0563t.a(aVar, (Object) "Cannot construct an Api with a null ClientBuilder");
        C0563t.a(gVar, (Object) "Cannot construct an Api with a null ClientKey");
        this.f5767e = str;
        this.f5763a = aVar;
        this.f5765c = gVar;
        this.f5766d = null;
    }

    public final String a() {
        return this.f5767e;
    }

    public final C0073a<?, O> b() {
        C0563t.b(this.f5763a != null, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return this.f5763a;
    }
}
