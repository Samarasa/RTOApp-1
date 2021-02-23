package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.internal.ads.C0675Ef;
import com.google.android.gms.internal.ads.C0701Ff;
import com.google.android.gms.internal.ads.C1875ih;
import com.google.android.gms.internal.ads.Qqa;

public class OfflinePingSender extends Worker {

    /* renamed from: f  reason: collision with root package name */
    private final C1875ih f5476f;

    public OfflinePingSender(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f5476f = Qqa.b().a(context, (C0675Ef) new C0701Ff());
    }

    public ListenableWorker.a doWork() {
        try {
            this.f5476f.Za();
            return ListenableWorker.a.c();
        } catch (RemoteException unused) {
            return ListenableWorker.a.a();
        }
    }
}
