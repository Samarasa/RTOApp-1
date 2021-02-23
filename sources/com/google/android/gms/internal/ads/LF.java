package com.google.android.gms.internal.ads;

import android.os.Binder;
import c.b.b.b.b.C0254b;
import com.google.android.gms.common.internal.C0547c;
import java.io.InputStream;

public abstract class LF implements C0547c.a, C0547c.b {

    /* renamed from: a  reason: collision with root package name */
    protected final C1742gl<InputStream> f7647a = new C1742gl<>();

    /* renamed from: b  reason: collision with root package name */
    protected final Object f7648b = new Object();

    /* renamed from: c  reason: collision with root package name */
    protected boolean f7649c = false;

    /* renamed from: d  reason: collision with root package name */
    protected boolean f7650d = false;

    /* renamed from: e  reason: collision with root package name */
    protected C2515ri f7651e;

    /* renamed from: f  reason: collision with root package name */
    protected C1223Zh f7652f;

    /* access modifiers changed from: protected */
    public final void a() {
        synchronized (this.f7648b) {
            this.f7650d = true;
            if (this.f7652f.isConnected() || this.f7652f.c()) {
                this.f7652f.e();
            }
            Binder.flushPendingCommands();
        }
    }

    public void a(C0254b bVar) {
        C1018Rk.a("Disconnected from remote ad request service.");
        this.f7647a.a((Throwable) new ZF(C2351pT.INTERNAL_ERROR));
    }

    public void d(int i) {
        C1018Rk.a("Cannot connect to remote service, fallback to local instance.");
    }
}
