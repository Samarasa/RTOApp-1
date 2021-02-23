package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.c;
import com.google.android.gms.ads.formats.f;
import com.google.android.gms.ads.formats.g;
import com.google.android.gms.ads.formats.h;
import com.google.android.gms.ads.formats.j;
import com.google.android.gms.common.internal.C0563t;
import com.google.android.gms.internal.ads.C0675Ef;
import com.google.android.gms.internal.ads.C0701Ff;
import com.google.android.gms.internal.ads.C0853Lb;
import com.google.android.gms.internal.ads.C0879Mb;
import com.google.android.gms.internal.ads.C1018Rk;
import com.google.android.gms.internal.ads.C1243_b;
import com.google.android.gms.internal.ads.C1368bb;
import com.google.android.gms.internal.ads.C1965jqa;
import com.google.android.gms.internal.ads.C2320oqa;
import com.google.android.gms.internal.ads.C2433qc;
import com.google.android.gms.internal.ads.C2645tc;
import com.google.android.gms.internal.ads.C2716uc;
import com.google.android.gms.internal.ads.C2787vc;
import com.google.android.gms.internal.ads.Qqa;
import com.google.android.gms.internal.ads.Tqa;
import com.google.android.gms.internal.ads.Yqa;
import com.google.android.gms.internal.ads.Zqa;
import com.google.android.gms.internal.ads.asa;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private final C2320oqa f5373a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f5374b;

    /* renamed from: c  reason: collision with root package name */
    private final Yqa f5375c;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final Context f5376a;

        /* renamed from: b  reason: collision with root package name */
        private final Zqa f5377b;

        private a(Context context, Zqa zqa) {
            this.f5376a = context;
            this.f5377b = zqa;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public a(Context context, String str) {
            this(context, Qqa.b().a(context, str, (C0675Ef) new C0701Ff()));
            C0563t.a(context, (Object) "context cannot be null");
        }

        public a a(c cVar) {
            try {
                this.f5377b.a((Tqa) new C1965jqa(cVar));
            } catch (RemoteException e2) {
                C1018Rk.c("Failed to set AdListener.", e2);
            }
            return this;
        }

        public a a(c cVar) {
            try {
                this.f5377b.a(new C1368bb(cVar));
            } catch (RemoteException e2) {
                C1018Rk.c("Failed to specify native ad options", e2);
            }
            return this;
        }

        @Deprecated
        public a a(f.a aVar) {
            try {
                this.f5377b.a((C0853Lb) new C2716uc(aVar));
            } catch (RemoteException e2) {
                C1018Rk.c("Failed to add app install ad listener", e2);
            }
            return this;
        }

        @Deprecated
        public a a(g.a aVar) {
            try {
                this.f5377b.a((C0879Mb) new C2645tc(aVar));
            } catch (RemoteException e2) {
                C1018Rk.c("Failed to add content ad listener", e2);
            }
            return this;
        }

        public a a(j.a aVar) {
            try {
                this.f5377b.a((C1243_b) new C2787vc(aVar));
            } catch (RemoteException e2) {
                C1018Rk.c("Failed to add google native ad listener", e2);
            }
            return this;
        }

        public a a(String str, h.b bVar, h.a aVar) {
            C2433qc qcVar = new C2433qc(bVar, aVar);
            try {
                this.f5377b.a(str, qcVar.a(), qcVar.b());
            } catch (RemoteException e2) {
                C1018Rk.c("Failed to add custom template ad listener", e2);
            }
            return this;
        }

        public d a() {
            try {
                return new d(this.f5376a, this.f5377b.Bb());
            } catch (RemoteException e2) {
                C1018Rk.b("Failed to build AdLoader.", e2);
                return null;
            }
        }
    }

    d(Context context, Yqa yqa) {
        this(context, yqa, C2320oqa.f11645a);
    }

    private d(Context context, Yqa yqa, C2320oqa oqa) {
        this.f5374b = context;
        this.f5375c = yqa;
        this.f5373a = oqa;
    }

    private final void a(asa asa) {
        try {
            this.f5375c.b(C2320oqa.a(this.f5374b, asa));
        } catch (RemoteException e2) {
            C1018Rk.b("Failed to load ad.", e2);
        }
    }

    public void a(e eVar) {
        a(eVar.a());
    }

    public void a(e eVar, int i) {
        try {
            this.f5375c.a(C2320oqa.a(this.f5374b, eVar.a()), i);
        } catch (RemoteException e2) {
            C1018Rk.b("Failed to load ads.", e2);
        }
    }

    public boolean a() {
        try {
            return this.f5375c.q();
        } catch (RemoteException e2) {
            C1018Rk.c("Failed to check if ad is loading.", e2);
            return false;
        }
    }
}
