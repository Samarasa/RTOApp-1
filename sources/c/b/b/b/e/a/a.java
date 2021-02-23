package c.b.b.b.e.a;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import c.b.b.b.b.j;
import c.b.b.b.e.d;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.C0547c;
import com.google.android.gms.common.internal.C0548d;
import com.google.android.gms.common.internal.C0552h;
import com.google.android.gms.common.internal.C0563t;
import com.google.android.gms.common.internal.C0564u;

public class a extends C0552h<f> implements d {
    private final boolean H;
    private final C0548d I;
    private final Bundle J;
    private Integer K;

    private a(Context context, Looper looper, boolean z, C0548d dVar, Bundle bundle, f.a aVar, f.b bVar) {
        super(context, looper, 44, dVar, aVar, bVar);
        this.H = true;
        this.I = dVar;
        this.J = bundle;
        this.K = dVar.d();
    }

    public a(Context context, Looper looper, boolean z, C0548d dVar, c.b.b.b.e.a aVar, f.a aVar2, f.b bVar) {
        this(context, looper, true, dVar, a(dVar), aVar2, bVar);
    }

    public static Bundle a(C0548d dVar) {
        c.b.b.b.e.a h2 = dVar.h();
        Integer d2 = dVar.d();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", dVar.a());
        if (d2 != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", d2.intValue());
        }
        if (h2 != null) {
            bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", h2.h());
            bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", h2.g());
            bundle.putString("com.google.android.gms.signin.internal.serverClientId", h2.e());
            bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
            bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", h2.f());
            bundle.putString("com.google.android.gms.signin.internal.hostedDomain", h2.b());
            bundle.putString("com.google.android.gms.signin.internal.logSessionId", h2.c());
            bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", h2.i());
            if (h2.a() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.authApiSignInModuleVersion", h2.a().longValue());
            }
            if (h2.d() != null) {
                bundle.putLong("com.google.android.gms.signin.internal.realClientLibraryVersion", h2.d().longValue());
            }
        }
        return bundle;
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof f ? (f) queryLocalInterface : new h(iBinder);
    }

    public final void a(d dVar) {
        C0563t.a(dVar, (Object) "Expecting a valid ISignInCallbacks");
        try {
            Account b2 = this.I.b();
            GoogleSignInAccount googleSignInAccount = null;
            if ("<<default account>>".equals(b2.name)) {
                googleSignInAccount = com.google.android.gms.auth.api.signin.a.a.a(p()).a();
            }
            ((f) t()).a(new j(new C0564u(b2, this.K.intValue(), googleSignInAccount)), dVar);
        } catch (RemoteException e2) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                dVar.a(new l(8));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e2);
            }
        }
    }

    public final void connect() {
        a((C0547c.C0077c) new C0547c.d());
    }

    public int g() {
        return j.f3888a;
    }

    public boolean i() {
        return this.H;
    }

    /* access modifiers changed from: protected */
    public Bundle q() {
        if (!p().getPackageName().equals(this.I.f())) {
            this.J.putString("com.google.android.gms.signin.internal.realClientPackageName", this.I.f());
        }
        return this.J;
    }

    /* access modifiers changed from: protected */
    public String u() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    /* access modifiers changed from: protected */
    public String v() {
        return "com.google.android.gms.signin.service.START";
    }
}
