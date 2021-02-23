package com.google.android.gms.common.stats;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.util.Log;
import c.b.b.b.d.c.k;
import c.b.b.b.d.c.l;
import com.google.android.gms.common.internal.L;
import com.google.android.gms.common.util.d;
import java.util.concurrent.ConcurrentHashMap;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f6016a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static volatile a f6017b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f6018c = false;

    /* renamed from: d  reason: collision with root package name */
    private static l<Boolean> f6019d = k.a(e.f6032a);

    /* renamed from: e  reason: collision with root package name */
    private ConcurrentHashMap<ServiceConnection, ServiceConnection> f6020e = new ConcurrentHashMap<>();

    private a() {
    }

    public static a a() {
        if (f6017b == null) {
            synchronized (f6016a) {
                if (f6017b == null) {
                    f6017b = new a();
                }
            }
        }
        return f6017b;
    }

    @SuppressLint({"UntrackedBindService"})
    private final boolean a(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, boolean z) {
        ComponentName component = intent.getComponent();
        if (component == null ? false : d.a(context, component.getPackageName())) {
            Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
            return false;
        } else if (!a(serviceConnection)) {
            return context.bindService(intent, serviceConnection, i);
        } else {
            ServiceConnection putIfAbsent = this.f6020e.putIfAbsent(serviceConnection, serviceConnection);
            if (!(putIfAbsent == null || serviceConnection == putIfAbsent)) {
                Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", new Object[]{serviceConnection, str, intent.getAction()}));
            }
            try {
                boolean bindService = context.bindService(intent, serviceConnection, i);
                return !bindService ? bindService : bindService;
            } finally {
                this.f6020e.remove(serviceConnection, serviceConnection);
            }
        }
    }

    private static boolean a(ServiceConnection serviceConnection) {
        return f6019d.a().booleanValue() && !(serviceConnection instanceof L);
    }

    @SuppressLint({"UntrackedBindService"})
    private static void b(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException e2) {
            Log.w("ConnectionTracker", "Exception thrown while unbinding", e2);
        }
    }

    static final /* synthetic */ boolean b() {
        return false;
    }

    @SuppressLint({"UntrackedBindService"})
    public void a(Context context, ServiceConnection serviceConnection) {
        if (!a(serviceConnection) || !this.f6020e.containsKey(serviceConnection)) {
            b(context, serviceConnection);
            return;
        }
        try {
            b(context, this.f6020e.get(serviceConnection));
        } finally {
            this.f6020e.remove(serviceConnection);
        }
    }

    public boolean a(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        return a(context, context.getClass().getName(), intent, serviceConnection, i);
    }

    public final boolean a(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i) {
        return a(context, str, intent, serviceConnection, i, true);
    }
}
