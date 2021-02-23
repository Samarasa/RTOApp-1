package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import c.b.b.b.b.C0254b;
import com.google.android.gms.ads.internal.p;
import java.io.InputStream;

public final class OF extends LF {

    /* renamed from: g  reason: collision with root package name */
    private String f8058g;

    /* renamed from: h  reason: collision with root package name */
    private int f8059h = UF.f8872a;

    public OF(Context context) {
        this.f7652f = new C1223Zh(context, p.q().b(), this, this);
    }

    public final LY<InputStream> a(C2515ri riVar) {
        synchronized (this.f7648b) {
            if (this.f8059h != UF.f8872a && this.f8059h != UF.f8873b) {
                LY<InputStream> a2 = DY.a((Throwable) new ZF(C2351pT.INVALID_REQUEST));
                return a2;
            } else if (this.f7649c) {
                C1742gl<InputStream> glVar = this.f7647a;
                return glVar;
            } else {
                this.f8059h = UF.f8873b;
                this.f7649c = true;
                this.f7651e = riVar;
                this.f7652f.j();
                this.f7647a.a(new SF(this), C1252_k.f9704f);
                C1742gl<InputStream> glVar2 = this.f7647a;
                return glVar2;
            }
        }
    }

    public final LY<InputStream> a(String str) {
        synchronized (this.f7648b) {
            if (this.f8059h != UF.f8872a && this.f8059h != UF.f8874c) {
                LY<InputStream> a2 = DY.a((Throwable) new ZF(C2351pT.INVALID_REQUEST));
                return a2;
            } else if (this.f7649c) {
                C1742gl<InputStream> glVar = this.f7647a;
                return glVar;
            } else {
                this.f8059h = UF.f8874c;
                this.f7649c = true;
                this.f8058g = str;
                this.f7652f.j();
                this.f7647a.a(new QF(this), C1252_k.f9704f);
                C1742gl<InputStream> glVar2 = this.f7647a;
                return glVar2;
            }
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
                    if (this.f8059h == UF.f8873b) {
                        this.f7652f.z().b(this.f7651e, new KF(this));
                    } else if (this.f8059h == UF.f8874c) {
                        this.f7652f.z().a(this.f8058g, (C2090li) new KF(this));
                    } else {
                        this.f7647a.a((Throwable) new ZF(C2351pT.INTERNAL_ERROR));
                    }
                } catch (RemoteException | IllegalArgumentException unused) {
                    glVar = this.f7647a;
                    zf = new ZF(C2351pT.INTERNAL_ERROR);
                    glVar.a((Throwable) zf);
                } catch (Throwable th) {
                    p.g().a(th, "RemoteUrlAndCacheKeyClientTask.onConnected");
                    glVar = this.f7647a;
                    zf = new ZF(C2351pT.INTERNAL_ERROR);
                    glVar.a((Throwable) zf);
                }
            }
        }
    }
}
