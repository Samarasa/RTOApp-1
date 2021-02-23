package androidx.work.impl.b.a;

import android.content.Context;
import android.os.Build;
import androidx.work.impl.b.b;
import androidx.work.impl.b.b.i;
import androidx.work.impl.c.o;
import androidx.work.impl.utils.b.a;

public class d extends c<b> {
    public d(Context context, a aVar) {
        super(i.a(context, aVar).c());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean b(b bVar) {
        return Build.VERSION.SDK_INT >= 26 ? !bVar.a() || !bVar.d() : !bVar.a();
    }

    /* access modifiers changed from: package-private */
    public boolean a(o oVar) {
        return oVar.l.b() == androidx.work.i.CONNECTED;
    }
}
