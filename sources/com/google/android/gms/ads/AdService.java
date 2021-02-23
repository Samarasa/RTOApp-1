package com.google.android.gms.ads;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C0675Ef;
import com.google.android.gms.internal.ads.C0701Ff;
import com.google.android.gms.internal.ads.C1018Rk;
import com.google.android.gms.internal.ads.Qqa;

public class AdService extends IntentService {
    public AdService() {
        super("AdService");
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        try {
            Qqa.b().a((Context) this, (C0675Ef) new C0701Ff()).a(intent);
        } catch (RemoteException e2) {
            String valueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50);
            sb.append("RemoteException calling handleNotificationIntent: ");
            sb.append(valueOf);
            C1018Rk.b(sb.toString());
        }
    }
}
