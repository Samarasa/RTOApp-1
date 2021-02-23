package c.b.d.d;

import android.content.Context;
import c.b.d.d.c;
import com.google.firebase.components.e;
import com.google.firebase.components.f;
import com.google.firebase.components.i;
import com.google.firebase.components.q;

public class b implements c {

    /* renamed from: a  reason: collision with root package name */
    private d f4926a;

    private b(Context context) {
        this.f4926a = d.a(context);
    }

    static /* synthetic */ c a(f fVar) {
        return new b((Context) fVar.a(Context.class));
    }

    public static e<c> a() {
        e.a<c> a2 = e.a(c.class);
        a2.a(q.b(Context.class));
        a2.a((i<c>) a.a());
        return a2.b();
    }

    public c.a a(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        boolean a2 = this.f4926a.a(str, currentTimeMillis);
        boolean a3 = this.f4926a.a(currentTimeMillis);
        return (!a2 || !a3) ? a3 ? c.a.GLOBAL : a2 ? c.a.SDK : c.a.NONE : c.a.COMBINED;
    }
}
