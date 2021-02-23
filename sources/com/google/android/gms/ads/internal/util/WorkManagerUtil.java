package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.work.b;
import androidx.work.c;
import androidx.work.e;
import androidx.work.i;
import androidx.work.j;
import androidx.work.p;
import androidx.work.q;
import c.b.b.b.c.a;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
import com.google.android.gms.internal.ads.C1018Rk;

public class WorkManagerUtil extends K {
    private static void a(Context context) {
        try {
            p.a(context.getApplicationContext(), new b.a().a());
        } catch (IllegalStateException unused) {
        }
    }

    public final void zzap(a aVar) {
        Context context = (Context) c.b.b.b.c.b.Q(aVar);
        a(context);
        try {
            p a2 = p.a(context);
            a2.a("offline_ping_sender_work");
            c.a aVar2 = new c.a();
            aVar2.a(i.CONNECTED);
            c a3 = aVar2.a();
            j.a aVar3 = new j.a(OfflinePingSender.class);
            aVar3.a(a3);
            j.a aVar4 = aVar3;
            aVar4.a("offline_ping_sender_work");
            a2.a((q) (j) aVar4.a());
        } catch (IllegalStateException e2) {
            C1018Rk.c("Failed to instantiate WorkManager.", e2);
        }
    }

    public final boolean zzd(a aVar, String str, String str2) {
        Context context = (Context) c.b.b.b.c.b.Q(aVar);
        a(context);
        c.a aVar2 = new c.a();
        aVar2.a(i.CONNECTED);
        c a2 = aVar2.a();
        e.a aVar3 = new e.a();
        aVar3.a("uri", str);
        aVar3.a("gws_query_id", str2);
        e a3 = aVar3.a();
        j.a aVar4 = new j.a(OfflineNotificationPoster.class);
        aVar4.a(a2);
        j.a aVar5 = aVar4;
        aVar5.a(a3);
        j.a aVar6 = aVar5;
        aVar6.a("offline_notification_work");
        try {
            p.a(context).a((q) (j) aVar6.a());
            return true;
        } catch (IllegalStateException e2) {
            C1018Rk.c("Failed to instantiate WorkManager.", e2);
            return false;
        }
    }
}
