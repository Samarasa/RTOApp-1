package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.p;
import java.io.InputStream;

public final class NF extends LF {
    public NF(Context context) {
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
            this.f7647a.a(new MF(this), C1252_k.f9704f);
            C1742gl<InputStream> glVar2 = this.f7647a;
            return glVar2;
        }
    }

    public final void h(Bundle bundle) {
        C1742gl<InputStream> glVar;
        ZF zf;
        synchronized (this.f7648b) {
            if (!this.f7650d) {
                this.f7650d = true;
                try {
                    this.f7652f.z().c(this.f7651e, new KF(this));
                } catch (RemoteException | IllegalArgumentException unused) {
                    glVar = this.f7647a;
                    zf = new ZF(C2351pT.INTERNAL_ERROR);
                } catch (Throwable th) {
                    p.g().a(th, "RemoteSignalsClientTask.onConnected");
                    glVar = this.f7647a;
                    zf = new ZF(C2351pT.INTERNAL_ERROR);
                }
            }
        }
        glVar.a((Throwable) zf);
    }
}
