package c.a.a;

import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;
import c.a.a.c.b.q;
import c.a.a.g.a;
import c.a.a.g.a.h;
import c.a.a.g.b;
import c.a.a.g.c;
import c.a.a.g.d;
import c.a.a.g.e;
import c.a.a.i.i;
import java.util.ArrayList;
import java.util.List;

public class k<TranscodeType> implements Cloneable, g<k<TranscodeType>> {

    /* renamed from: a  reason: collision with root package name */
    protected static final e f3663a = new e().a(q.f3193c).a(h.LOW).a(true);

    /* renamed from: b  reason: collision with root package name */
    private final Context f3664b;

    /* renamed from: c  reason: collision with root package name */
    private final n f3665c;

    /* renamed from: d  reason: collision with root package name */
    private final Class<TranscodeType> f3666d;

    /* renamed from: e  reason: collision with root package name */
    private final e f3667e;

    /* renamed from: f  reason: collision with root package name */
    private final c f3668f;

    /* renamed from: g  reason: collision with root package name */
    private final e f3669g;

    /* renamed from: h  reason: collision with root package name */
    protected e f3670h;
    private o<?, ? super TranscodeType> i;
    private Object j;
    private List<d<TranscodeType>> k;
    private k<TranscodeType> l;
    private k<TranscodeType> m;
    private Float n;
    private boolean o = true;
    private boolean p;
    private boolean q;

    protected k(c cVar, n nVar, Class<TranscodeType> cls, Context context) {
        this.f3668f = cVar;
        this.f3665c = nVar;
        this.f3666d = cls;
        this.f3667e = nVar.d();
        this.f3664b = context;
        this.i = nVar.b(cls);
        this.f3670h = this.f3667e;
        this.f3669g = cVar.f();
    }

    private b a(h<TranscodeType> hVar, d<TranscodeType> dVar, c cVar, o<?, ? super TranscodeType> oVar, h hVar2, int i2, int i3, e eVar) {
        a aVar;
        a aVar2;
        if (this.m != null) {
            aVar2 = new a(cVar);
            aVar = aVar2;
        } else {
            aVar = null;
            aVar2 = cVar;
        }
        b b2 = b(hVar, dVar, aVar2, oVar, hVar2, i2, i3, eVar);
        if (aVar == null) {
            return b2;
        }
        int l2 = this.m.f3670h.l();
        int k2 = this.m.f3670h.k();
        if (c.a.a.i.k.b(i2, i3) && !this.m.f3670h.C()) {
            l2 = eVar.l();
            k2 = eVar.k();
        }
        k<TranscodeType> kVar = this.m;
        a aVar3 = aVar;
        aVar3.a(b2, kVar.a(hVar, dVar, (c) aVar, kVar.i, kVar.f3670h.o(), l2, k2, this.m.f3670h));
        return aVar3;
    }

    private b a(h<TranscodeType> hVar, d<TranscodeType> dVar, e eVar) {
        return a(hVar, dVar, (c) null, this.i, eVar.o(), eVar.l(), eVar.k(), eVar);
    }

    private b a(h<TranscodeType> hVar, d<TranscodeType> dVar, e eVar, c cVar, o<?, ? super TranscodeType> oVar, h hVar2, int i2, int i3) {
        Context context = this.f3664b;
        e eVar2 = this.f3669g;
        return c.a.a.g.h.a(context, eVar2, this.j, this.f3666d, eVar, i2, i3, hVar2, hVar, dVar, this.k, cVar, eVar2.c(), oVar.a());
    }

    private h a(h hVar) {
        int i2 = j.f3662b[hVar.ordinal()];
        if (i2 == 1) {
            return h.NORMAL;
        }
        if (i2 == 2) {
            return h.HIGH;
        }
        if (i2 == 3 || i2 == 4) {
            return h.IMMEDIATE;
        }
        throw new IllegalArgumentException("unknown priority: " + this.f3670h.o());
    }

    private boolean a(e eVar, b bVar) {
        return !eVar.w() && bVar.isComplete();
    }

    private <Y extends h<TranscodeType>> Y b(Y y, d<TranscodeType> dVar, e eVar) {
        c.a.a.i.k.a();
        i.a(y);
        if (this.p) {
            eVar.a();
            b a2 = a(y, dVar, eVar);
            b a3 = y.a();
            if (!a2.a(a3) || a(eVar, a3)) {
                this.f3665c.a((h<?>) y);
                y.a(a2);
                this.f3665c.a(y, a2);
                return y;
            }
            a2.a();
            i.a(a3);
            if (!a3.isRunning()) {
                a3.f();
            }
            return y;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    private b b(h<TranscodeType> hVar, d<TranscodeType> dVar, c cVar, o<?, ? super TranscodeType> oVar, h hVar2, int i2, int i3, e eVar) {
        c cVar2 = cVar;
        h hVar3 = hVar2;
        k<TranscodeType> kVar = this.l;
        if (kVar != null) {
            if (!this.q) {
                o<?, ? super TranscodeType> oVar2 = kVar.o ? oVar : kVar.i;
                h o2 = this.l.f3670h.x() ? this.l.f3670h.o() : a(hVar3);
                int l2 = this.l.f3670h.l();
                int k2 = this.l.f3670h.k();
                if (c.a.a.i.k.b(i2, i3) && !this.l.f3670h.C()) {
                    l2 = eVar.l();
                    k2 = eVar.k();
                }
                c.a.a.g.i iVar = new c.a.a.g.i(cVar2);
                b a2 = a(hVar, dVar, eVar, (c) iVar, oVar, hVar2, i2, i3);
                this.q = true;
                k<TranscodeType> kVar2 = this.l;
                c.a.a.g.i iVar2 = iVar;
                b a3 = kVar2.a(hVar, dVar, (c) iVar, oVar2, o2, l2, k2, kVar2.f3670h);
                this.q = false;
                iVar2.a(a2, a3);
                return iVar2;
            }
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        } else if (this.n == null) {
            return a(hVar, dVar, eVar, cVar, oVar, hVar2, i2, i3);
        } else {
            c.a.a.g.i iVar3 = new c.a.a.g.i(cVar2);
            d<TranscodeType> dVar2 = dVar;
            c.a.a.g.i iVar4 = iVar3;
            o<?, ? super TranscodeType> oVar3 = oVar;
            int i4 = i2;
            int i5 = i3;
            iVar3.a(a(hVar, dVar2, eVar, (c) iVar4, oVar3, hVar2, i4, i5), a(hVar, dVar2, eVar.clone().a(this.n.floatValue()), (c) iVar4, oVar3, a(hVar3), i4, i5));
            return iVar3;
        }
    }

    private k<TranscodeType> b(Object obj) {
        this.j = obj;
        this.p = true;
        return this;
    }

    public <Y extends h<TranscodeType>> Y a(Y y) {
        a(y, (d) null);
        return y;
    }

    /* access modifiers changed from: package-private */
    public <Y extends h<TranscodeType>> Y a(Y y, d<TranscodeType> dVar) {
        b(y, dVar, a());
        return y;
    }

    public c.a.a.g.a.i<ImageView, TranscodeType> a(ImageView imageView) {
        c.a.a.i.k.a();
        i.a(imageView);
        e eVar = this.f3670h;
        if (!eVar.B() && eVar.z() && imageView.getScaleType() != null) {
            switch (j.f3661a[imageView.getScaleType().ordinal()]) {
                case 1:
                    eVar = eVar.clone().E();
                    break;
                case 2:
                case 6:
                    eVar = eVar.clone().F();
                    break;
                case 3:
                case 4:
                case 5:
                    eVar = eVar.clone().G();
                    break;
            }
        }
        c.a.a.g.a.i<ImageView, TranscodeType> a2 = this.f3669g.a(imageView, this.f3666d);
        b(a2, (d) null, eVar);
        return a2;
    }

    /* access modifiers changed from: protected */
    public e a() {
        e eVar = this.f3667e;
        e eVar2 = this.f3670h;
        return eVar == eVar2 ? eVar2.clone() : eVar2;
    }

    public k<TranscodeType> a(Uri uri) {
        b((Object) uri);
        return this;
    }

    public k<TranscodeType> a(d<TranscodeType> dVar) {
        if (dVar != null) {
            if (this.k == null) {
                this.k = new ArrayList();
            }
            this.k.add(dVar);
        }
        return this;
    }

    public k<TranscodeType> a(e eVar) {
        i.a(eVar);
        this.f3670h = a().a(eVar);
        return this;
    }

    public k<TranscodeType> a(Integer num) {
        b((Object) num);
        a(e.b(c.a.a.h.a.a(this.f3664b)));
        return this;
    }

    public k<TranscodeType> a(Object obj) {
        b(obj);
        return this;
    }

    public k<TranscodeType> a(String str) {
        b((Object) str);
        return this;
    }

    public k<TranscodeType> b(d<TranscodeType> dVar) {
        this.k = null;
        a(dVar);
        return this;
    }

    public k<TranscodeType> clone() {
        try {
            k<TranscodeType> kVar = (k) super.clone();
            kVar.f3670h = kVar.f3670h.clone();
            kVar.i = kVar.i.clone();
            return kVar;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }
}
