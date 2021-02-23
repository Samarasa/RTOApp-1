package c.a.a;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import c.a.a.c.b.a.b;
import c.a.a.c.b.s;
import c.a.a.g.a.i;
import java.util.Map;

public class e extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    static final o<?, ?> f3538a = new b();

    /* renamed from: b  reason: collision with root package name */
    private final Handler f3539b = new Handler(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    private final b f3540c;

    /* renamed from: d  reason: collision with root package name */
    private final i f3541d;

    /* renamed from: e  reason: collision with root package name */
    private final c.a.a.g.a.e f3542e;

    /* renamed from: f  reason: collision with root package name */
    private final c.a.a.g.e f3543f;

    /* renamed from: g  reason: collision with root package name */
    private final Map<Class<?>, o<?, ?>> f3544g;

    /* renamed from: h  reason: collision with root package name */
    private final s f3545h;
    private final int i;

    public e(Context context, b bVar, i iVar, c.a.a.g.a.e eVar, c.a.a.g.e eVar2, Map<Class<?>, o<?, ?>> map, s sVar, int i2) {
        super(context.getApplicationContext());
        this.f3540c = bVar;
        this.f3541d = iVar;
        this.f3542e = eVar;
        this.f3543f = eVar2;
        this.f3544g = map;
        this.f3545h = sVar;
        this.i = i2;
    }

    public b a() {
        return this.f3540c;
    }

    public <X> i<ImageView, X> a(ImageView imageView, Class<X> cls) {
        return this.f3542e.a(imageView, cls);
    }

    public <T> o<?, T> a(Class<T> cls) {
        o<?, T> oVar = this.f3544g.get(cls);
        if (oVar == null) {
            for (Map.Entry next : this.f3544g.entrySet()) {
                if (((Class) next.getKey()).isAssignableFrom(cls)) {
                    oVar = (o) next.getValue();
                }
            }
        }
        return oVar == null ? f3538a : oVar;
    }

    public c.a.a.g.e b() {
        return this.f3543f;
    }

    public s c() {
        return this.f3545h;
    }

    public int d() {
        return this.i;
    }

    public i e() {
        return this.f3541d;
    }
}
