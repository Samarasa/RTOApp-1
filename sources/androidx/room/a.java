package androidx.room;

import android.content.Context;
import androidx.room.s;
import b.p.a.c;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public final c.C0042c f1510a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f1511b;

    /* renamed from: c  reason: collision with root package name */
    public final String f1512c;

    /* renamed from: d  reason: collision with root package name */
    public final s.d f1513d;

    /* renamed from: e  reason: collision with root package name */
    public final List<s.b> f1514e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f1515f;

    /* renamed from: g  reason: collision with root package name */
    public final s.c f1516g;

    /* renamed from: h  reason: collision with root package name */
    public final Executor f1517h;
    public final Executor i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    private final Set<Integer> m;

    public a(Context context, String str, c.C0042c cVar, s.d dVar, List<s.b> list, boolean z, s.c cVar2, Executor executor, Executor executor2, boolean z2, boolean z3, boolean z4, Set<Integer> set) {
        this.f1510a = cVar;
        this.f1511b = context;
        this.f1512c = str;
        this.f1513d = dVar;
        this.f1514e = list;
        this.f1515f = z;
        this.f1516g = cVar2;
        this.f1517h = executor;
        this.i = executor2;
        this.j = z2;
        this.k = z3;
        this.l = z4;
        this.m = set;
    }

    public boolean a(int i2, int i3) {
        Set<Integer> set;
        return (!(i2 > i3) || !this.l) && this.k && ((set = this.m) == null || !set.contains(Integer.valueOf(i2)));
    }
}
