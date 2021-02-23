package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.io.IOException;

final /* synthetic */ class Moa implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final Noa f7902a;

    /* renamed from: b  reason: collision with root package name */
    private final Coa f7903b;

    /* renamed from: c  reason: collision with root package name */
    private final Foa f7904c;

    /* renamed from: d  reason: collision with root package name */
    private final C1742gl f7905d;

    Moa(Noa noa, Coa coa, Foa foa, C1742gl glVar) {
        this.f7902a = noa;
        this.f7903b = coa;
        this.f7904c = foa;
        this.f7905d = glVar;
    }

    public final void run() {
        Noa noa = this.f7902a;
        Coa coa = this.f7903b;
        Foa foa = this.f7904c;
        C1742gl glVar = this.f7905d;
        try {
            Goa z = coa.z();
            Aoa c2 = coa.A() ? z.c(foa) : z.b(foa);
            if (!c2.g()) {
                glVar.a((Throwable) new RuntimeException("No entry contents."));
                noa.f8026c.a();
                return;
            }
            Ooa ooa = new Ooa(noa, c2.h(), 1);
            int read = ooa.read();
            if (read != -1) {
                ooa.unread(read);
                glVar.a(Toa.a(ooa, c2.i(), c2.l(), c2.k(), c2.j()));
                return;
            }
            throw new IOException("Unable to read from cache.");
        } catch (RemoteException | IOException e2) {
            C1018Rk.b("Unable to obtain a cache service instance.", e2);
            glVar.a(e2);
            noa.f8026c.a();
        }
    }
}
