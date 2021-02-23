package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import c.b.b.a.a.f.a;
import c.b.b.a.a.p;
import c.b.b.a.a.u;

public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    static /* synthetic */ void a() {
    }

    public void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        u.a(context);
        p.a a2 = p.a();
        a2.a(queryParameter);
        a2.a(a.a(intValue));
        if (queryParameter2 != null) {
            a2.a(Base64.decode(queryParameter2, 0));
        }
        u.a().b().a(a2.a(), i, b.a());
    }
}
