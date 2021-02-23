package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.work.ListenableWorker;
import androidx.work.impl.utils.a.e;
import c.b.c.a.a.a;

public abstract class Worker extends ListenableWorker {

    /* renamed from: e  reason: collision with root package name */
    e<ListenableWorker.a> f1679e;

    @SuppressLint({"BanKeepAnnotation"})
    @Keep
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract ListenableWorker.a doWork();

    public final a<ListenableWorker.a> startWork() {
        this.f1679e = e.d();
        getBackgroundExecutor().execute(new r(this));
        return this.f1679e;
    }
}
