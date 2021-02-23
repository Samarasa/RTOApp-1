package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;

/* renamed from: com.google.android.gms.internal.ads.hna  reason: case insensitive filesystem */
final class C1818hna implements Handler.Callback, Choreographer.FrameCallback {

    /* renamed from: a  reason: collision with root package name */
    private static final C1818hna f10726a = new C1818hna();

    /* renamed from: b  reason: collision with root package name */
    public volatile long f10727b;

    /* renamed from: c  reason: collision with root package name */
    private final Handler f10728c;

    /* renamed from: d  reason: collision with root package name */
    private final HandlerThread f10729d = new HandlerThread("ChoreographerOwner:Handler");

    /* renamed from: e  reason: collision with root package name */
    private Choreographer f10730e;

    /* renamed from: f  reason: collision with root package name */
    private int f10731f;

    private C1818hna() {
        this.f10729d.start();
        this.f10728c = new Handler(this.f10729d.getLooper(), this);
        this.f10728c.sendEmptyMessage(0);
    }

    public static C1818hna b() {
        return f10726a;
    }

    public final void a() {
        this.f10728c.sendEmptyMessage(2);
    }

    public final void c() {
        this.f10728c.sendEmptyMessage(1);
    }

    public final void doFrame(long j) {
        this.f10727b = j;
        this.f10730e.postFrameCallbackDelayed(this, 500);
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            this.f10730e = Choreographer.getInstance();
            return true;
        } else if (i == 1) {
            this.f10731f++;
            if (this.f10731f == 1) {
                this.f10730e.postFrameCallback(this);
            }
            return true;
        } else if (i != 2) {
            return false;
        } else {
            this.f10731f--;
            if (this.f10731f == 0) {
                this.f10730e.removeFrameCallback(this);
                this.f10727b = 0;
            }
            return true;
        }
    }
}
