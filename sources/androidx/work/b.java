package androidx.work;

import android.os.Build;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f1694a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f1695b;

    /* renamed from: c  reason: collision with root package name */
    private final t f1696c;

    /* renamed from: d  reason: collision with root package name */
    private final int f1697d;

    /* renamed from: e  reason: collision with root package name */
    private final int f1698e;

    /* renamed from: f  reason: collision with root package name */
    private final int f1699f;

    /* renamed from: g  reason: collision with root package name */
    private final int f1700g;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        Executor f1701a;

        /* renamed from: b  reason: collision with root package name */
        t f1702b;

        /* renamed from: c  reason: collision with root package name */
        Executor f1703c;

        /* renamed from: d  reason: collision with root package name */
        int f1704d = 4;

        /* renamed from: e  reason: collision with root package name */
        int f1705e = 0;

        /* renamed from: f  reason: collision with root package name */
        int f1706f = Integer.MAX_VALUE;

        /* renamed from: g  reason: collision with root package name */
        int f1707g = 20;

        public b a() {
            return new b(this);
        }
    }

    /* renamed from: androidx.work.b$b  reason: collision with other inner class name */
    public interface C0023b {
        b a();
    }

    b(a aVar) {
        Executor executor = aVar.f1701a;
        this.f1694a = executor == null ? h() : executor;
        Executor executor2 = aVar.f1703c;
        this.f1695b = executor2 == null ? h() : executor2;
        t tVar = aVar.f1702b;
        this.f1696c = tVar == null ? t.a() : tVar;
        this.f1697d = aVar.f1704d;
        this.f1698e = aVar.f1705e;
        this.f1699f = aVar.f1706f;
        this.f1700g = aVar.f1707g;
    }

    private Executor h() {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)));
    }

    public Executor a() {
        return this.f1694a;
    }

    public int b() {
        return this.f1699f;
    }

    public int c() {
        return Build.VERSION.SDK_INT == 23 ? this.f1700g / 2 : this.f1700g;
    }

    public int d() {
        return this.f1698e;
    }

    public int e() {
        return this.f1697d;
    }

    public Executor f() {
        return this.f1695b;
    }

    public t g() {
        return this.f1696c;
    }
}
