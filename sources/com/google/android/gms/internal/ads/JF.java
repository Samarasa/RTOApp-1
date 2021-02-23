package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import c.b.b.b.b.C0254b;
import com.google.android.gms.ads.internal.p;
import java.io.InputStream;

public final class JF extends LF {
    public JF(Context context) {
        this.f7652f = new C1223Zh(context, p.q().b(), this, this);
    }

    public final LY<InputStream> a(C2515ri riVar) {
        synchronized (this.f7648b) {
            if (this.f7649c) {
                C1742gl<InputStream> glVar = this.f7647a;
                return glVar;
            }
            this.f7649c = true;
            this.f7651e = riVar;
            this.f7652f.j();
            this.f7647a.a(new IF(this), C1252_k.f9704f);
            C1742gl<InputStream> glVar2 = this.f7647a;
            return glVar2;
        }
    }

    public final void a(C0254b bVar) {
        C1018Rk.a("Cannot connect to remote service, fallback to local instance.");
        this.f7647a.a((Throwable) new ZF(C2351pT.INTERNAL_ERROR));
    }

    public final void h(Bundle bundle) {
        C1742gl<InputStream> glVar;
        ZF zf;
        synchronized (this.f7648b) {
            if (!this.f7650d) {
                this.f7650d = true;
                try {
                    this.f7652f.z().a(this.f7651e, (C2090li) new KF(this));
                } catch (RemoteException | IllegalArgumentException unused) {
                    glVar = this.f7647a;
                    zf = new ZF(C2351pT.INTERNAL_ERROR);
                } catch (Throwable th) {
                    p.g().a(th, "RemoteAdRequestClientTask.onConnected");
                    glVar = this.f7647a;
                    zf = new ZF(C2351pT.INTERNAL_ERROR);
                }
            }
        }
        glVar.a((Throwable) zf);
    }
}
