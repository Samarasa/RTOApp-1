package androidx.work.impl.b.a;

import android.content.Context;
import android.os.Build;
import androidx.work.h;
import androidx.work.impl.b.b;
import androidx.work.impl.b.b.i;
import androidx.work.impl.c.o;
import androidx.work.impl.utils.b.a;

public class f extends c<b> {

    /* renamed from: e  reason: collision with root package name */
    private static final String f1758e = h.a("NetworkNotRoamingCtrlr");

    public f(Context context, a aVar) {
        super(i.a(context, aVar).c());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean b(b bVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            return !bVar.a() || !bVar.c();
        }
        h.a().a(f1758e, "Not-roaming network constraint is not supported before API 24, only checking for connected state.", new Throwable[0]);
        return !bVar.a();
    }

    /* access modifiers changed from: package-private */
    public boolean a(o oVar) {
        return oVar.l.b() == androidx.work.i.NOT_ROAMING;
    }
}
