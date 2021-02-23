package androidx.work;

import android.net.Network;
import android.net.Uri;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

public final class WorkerParameters {

    /* renamed from: a  reason: collision with root package name */
    private UUID f1680a;

    /* renamed from: b  reason: collision with root package name */
    private e f1681b;

    /* renamed from: c  reason: collision with root package name */
    private Set<String> f1682c;

    /* renamed from: d  reason: collision with root package name */
    private a f1683d;

    /* renamed from: e  reason: collision with root package name */
    private int f1684e;

    /* renamed from: f  reason: collision with root package name */
    private Executor f1685f;

    /* renamed from: g  reason: collision with root package name */
    private androidx.work.impl.utils.b.a f1686g;

    /* renamed from: h  reason: collision with root package name */
    private t f1687h;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public List<String> f1688a = Collections.emptyList();

        /* renamed from: b  reason: collision with root package name */
        public List<Uri> f1689b = Collections.emptyList();

        /* renamed from: c  reason: collision with root package name */
        public Network f1690c;
    }

    public WorkerParameters(UUID uuid, e eVar, Collection<String> collection, a aVar, int i, Executor executor, androidx.work.impl.utils.b.a aVar2, t tVar) {
        this.f1680a = uuid;
        this.f1681b = eVar;
        this.f1682c = new HashSet(collection);
        this.f1683d = aVar;
        this.f1684e = i;
        this.f1685f = executor;
        this.f1686g = aVar2;
        this.f1687h = tVar;
    }

    public Executor a() {
        return this.f1685f;
    }

    public UUID b() {
        return this.f1680a;
    }

    public e c() {
        return this.f1681b;
    }

    public Network d() {
        return this.f1683d.f1690c;
    }

    public int e() {
        return this.f1684e;
    }

    public Set<String> f() {
        return this.f1682c;
    }

    public androidx.work.impl.utils.b.a g() {
        return this.f1686g;
    }

    public List<String> h() {
        return this.f1683d.f1688a;
    }

    public List<Uri> i() {
        return this.f1683d.f1689b;
    }

    public t j() {
        return this.f1687h;
    }
}
