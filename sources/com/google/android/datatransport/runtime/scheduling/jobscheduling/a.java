package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
import c.b.b.a.a.c.a.C0248d;
import c.b.b.a.a.p;

public class a implements t {

    /* renamed from: a  reason: collision with root package name */
    private final Context f5281a;

    /* renamed from: b  reason: collision with root package name */
    private final C0248d f5282b;

    /* renamed from: c  reason: collision with root package name */
    private AlarmManager f5283c;

    /* renamed from: d  reason: collision with root package name */
    private final h f5284d;

    /* renamed from: e  reason: collision with root package name */
    private final c.b.b.a.a.e.a f5285e;

    a(Context context, C0248d dVar, AlarmManager alarmManager, c.b.b.a.a.e.a aVar, h hVar) {
        this.f5281a = context;
        this.f5282b = dVar;
        this.f5283c = alarmManager;
        this.f5285e = aVar;
        this.f5284d = hVar;
    }

    public a(Context context, C0248d dVar, c.b.b.a.a.e.a aVar, h hVar) {
        this(context, dVar, (AlarmManager) context.getSystemService("alarm"), aVar, hVar);
    }

    public void a(p pVar, int i) {
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter("backendName", pVar.b());
        builder.appendQueryParameter("priority", String.valueOf(c.b.b.a.a.f.a.a(pVar.d())));
        if (pVar.c() != null) {
            builder.appendQueryParameter("extras", Base64.encodeToString(pVar.c(), 0));
        }
        Intent intent = new Intent(this.f5281a, AlarmManagerSchedulerBroadcastReceiver.class);
        intent.setData(builder.build());
        intent.putExtra("attemptNumber", i);
        if (a(intent)) {
            c.b.b.a.a.a.a.a("AlarmManagerScheduler", "Upload for context %s is already scheduled. Returning...", (Object) pVar);
            return;
        }
        long b2 = this.f5282b.b(pVar);
        long a2 = this.f5284d.a(pVar.d(), b2, i);
        c.b.b.a.a.a.a.a("AlarmManagerScheduler", "Scheduling upload for context %s in %dms(Backend next call timestamp %d). Attempt %d", pVar, Long.valueOf(a2), Long.valueOf(b2), Integer.valueOf(i));
        this.f5283c.set(3, this.f5285e.a() + a2, PendingIntent.getBroadcast(this.f5281a, 0, intent, 0));
    }

    /* access modifiers changed from: package-private */
    public boolean a(Intent intent) {
        return PendingIntent.getBroadcast(this.f5281a, 0, intent, 536870912) != null;
    }
}
