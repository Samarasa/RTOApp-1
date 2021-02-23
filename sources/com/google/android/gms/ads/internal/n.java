package com.google.android.gms.ads.internal;

import android.os.AsyncTask;
import com.google.android.gms.internal.ads.C1018Rk;
import com.google.android.gms.internal.ads.Qba;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

final class n extends AsyncTask<Void, Void, String> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ j f5473a;

    private n(j jVar) {
        this.f5473a = jVar;
    }

    /* synthetic */ n(j jVar, m mVar) {
        this(jVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final String doInBackground(Void... voidArr) {
        try {
            Qba unused = this.f5473a.f5470h = (Qba) this.f5473a.f5465c.get(1000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            C1018Rk.c(BuildConfig.FLAVOR, e2);
        }
        return this.f5473a.Zb();
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        if (this.f5473a.f5468f != null && str != null) {
            this.f5473a.f5468f.loadUrl(str);
        }
    }
}
