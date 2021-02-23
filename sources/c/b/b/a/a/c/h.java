package c.b.b.a.a.c;

import android.content.Context;
import android.os.Build;
import c.b.b.a.a.c.a.C0248d;
import c.b.b.a.a.e.a;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.f;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.t;

public abstract class h {
    static t a(Context context, C0248d dVar, com.google.android.datatransport.runtime.scheduling.jobscheduling.h hVar, a aVar) {
        return Build.VERSION.SDK_INT >= 21 ? new f(context, dVar, hVar) : new com.google.android.datatransport.runtime.scheduling.jobscheduling.a(context, dVar, aVar, hVar);
    }
}
