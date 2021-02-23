package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.internal.C0554j;
import java.util.HashMap;
import java.util.Map;

final class J implements ServiceConnection, L {

    /* renamed from: a  reason: collision with root package name */
    private final Map<ServiceConnection, ServiceConnection> f5907a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private int f5908b = 2;

    /* renamed from: c  reason: collision with root package name */
    private boolean f5909c;

    /* renamed from: d  reason: collision with root package name */
    private IBinder f5910d;

    /* renamed from: e  reason: collision with root package name */
    private final C0554j.a f5911e;

    /* renamed from: f  reason: collision with root package name */
    private ComponentName f5912f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ H f5913g;

    public J(H h2, C0554j.a aVar) {
        this.f5913g = h2;
        this.f5911e = aVar;
    }

    public final void a(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f5907a.put(serviceConnection, serviceConnection2);
    }

    public final void a(ServiceConnection serviceConnection, String str) {
        this.f5907a.remove(serviceConnection);
    }

    public final void a(String str) {
        this.f5908b = 3;
        this.f5909c = this.f5913g.f5904g.a(this.f5913g.f5902e, str, this.f5911e.a(this.f5913g.f5902e), this, this.f5911e.c());
        if (this.f5909c) {
            this.f5913g.f5903f.sendMessageDelayed(this.f5913g.f5903f.obtainMessage(1, this.f5911e), this.f5913g.i);
            return;
        }
        this.f5908b = 2;
        try {
            this.f5913g.f5904g.a(this.f5913g.f5902e, this);
        } catch (IllegalArgumentException unused) {
        }
    }

    public final boolean a() {
        return this.f5909c;
    }

    public final boolean a(ServiceConnection serviceConnection) {
        return this.f5907a.containsKey(serviceConnection);
    }

    public final int b() {
        return this.f5908b;
    }

    public final void b(String str) {
        this.f5913g.f5903f.removeMessages(1, this.f5911e);
        this.f5913g.f5904g.a(this.f5913g.f5902e, this);
        this.f5909c = false;
        this.f5908b = 2;
    }

    public final boolean c() {
        return this.f5907a.isEmpty();
    }

    public final IBinder d() {
        return this.f5910d;
    }

    public final ComponentName e() {
        return this.f5912f;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f5913g.f5901d) {
            this.f5913g.f5903f.removeMessages(1, this.f5911e);
            this.f5910d = iBinder;
            this.f5912f = componentName;
            for (ServiceConnection onServiceConnected : this.f5907a.values()) {
                onServiceConnected.onServiceConnected(componentName, iBinder);
            }
            this.f5908b = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f5913g.f5901d) {
            this.f5913g.f5903f.removeMessages(1, this.f5911e);
            this.f5910d = null;
            this.f5912f = componentName;
            for (ServiceConnection onServiceDisconnected : this.f5907a.values()) {
                onServiceDisconnected.onServiceDisconnected(componentName);
            }
            this.f5908b = 2;
        }
    }
}
