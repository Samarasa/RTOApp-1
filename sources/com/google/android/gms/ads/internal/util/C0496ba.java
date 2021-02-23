package com.google.android.gms.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.internal.ads.F;
import com.google.android.gms.internal.ads.Qqa;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.ads.internal.util.ba  reason: case insensitive filesystem */
public final class C0496ba {

    /* renamed from: a  reason: collision with root package name */
    private final BroadcastReceiver f5567a = new C0494aa(this);

    /* renamed from: b  reason: collision with root package name */
    private final Map<BroadcastReceiver, IntentFilter> f5568b = new WeakHashMap();

    /* renamed from: c  reason: collision with root package name */
    private boolean f5569c = false;

    /* renamed from: d  reason: collision with root package name */
    private boolean f5570d;

    /* renamed from: e  reason: collision with root package name */
    private Context f5571e;

    /* access modifiers changed from: private */
    public final synchronized void a(Context context, Intent intent) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : this.f5568b.entrySet()) {
            if (((IntentFilter) next.getValue()).hasAction(intent.getAction())) {
                arrayList.add((BroadcastReceiver) next.getKey());
            }
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((BroadcastReceiver) obj).onReceive(context, intent);
        }
    }

    public final synchronized void a(Context context) {
        if (!this.f5569c) {
            this.f5571e = context.getApplicationContext();
            if (this.f5571e == null) {
                this.f5571e = context;
            }
            F.a(this.f5571e);
            this.f5570d = ((Boolean) Qqa.e().a(F.nc)).booleanValue();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.f5571e.registerReceiver(this.f5567a, intentFilter);
            this.f5569c = true;
        }
    }

    public final synchronized void a(Context context, BroadcastReceiver broadcastReceiver) {
        if (this.f5570d) {
            this.f5568b.remove(broadcastReceiver);
        } else {
            context.unregisterReceiver(broadcastReceiver);
        }
    }

    public final synchronized void a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (this.f5570d) {
            this.f5568b.put(broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter);
        }
    }
}
