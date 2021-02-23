package b.h.g;

import android.content.Context;
import android.graphics.Typeface;
import b.h.g.f;
import java.util.concurrent.Callable;

class b implements Callable<f.c> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f2425a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a f2426b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f2427c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f2428d;

    b(Context context, a aVar, int i, String str) {
        this.f2425a = context;
        this.f2426b = aVar;
        this.f2427c = i;
        this.f2428d = str;
    }

    public f.c call() {
        f.c a2 = f.a(this.f2425a, this.f2426b, this.f2427c);
        Typeface typeface = a2.f2444a;
        if (typeface != null) {
            f.f2432a.a(this.f2428d, typeface);
        }
        return a2;
    }
}
