package androidx.work.impl.b.b;

import android.content.Context;
import androidx.work.impl.utils.b.a;

public class i {

    /* renamed from: a  reason: collision with root package name */
    private static i f1778a;

    /* renamed from: b  reason: collision with root package name */
    private a f1779b;

    /* renamed from: c  reason: collision with root package name */
    private b f1780c;

    /* renamed from: d  reason: collision with root package name */
    private g f1781d;

    /* renamed from: e  reason: collision with root package name */
    private h f1782e;

    private i(Context context, a aVar) {
        Context applicationContext = context.getApplicationContext();
        this.f1779b = new a(applicationContext, aVar);
        this.f1780c = new b(applicationContext, aVar);
        this.f1781d = new g(applicationContext, aVar);
        this.f1782e = new h(applicationContext, aVar);
    }

    public static synchronized i a(Context context, a aVar) {
        i iVar;
        synchronized (i.class) {
            if (f1778a == null) {
                f1778a = new i(context, aVar);
            }
            iVar = f1778a;
        }
        return iVar;
    }

    public a a() {
        return this.f1779b;
    }

    public b b() {
        return this.f1780c;
    }

    public g c() {
        return this.f1781d;
    }

    public h d() {
        return this.f1782e;
    }
}
