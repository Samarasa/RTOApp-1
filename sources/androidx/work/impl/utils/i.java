package androidx.work.impl.utils;

import androidx.work.WorkerParameters;
import androidx.work.impl.m;

public class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private m f2017a;

    /* renamed from: b  reason: collision with root package name */
    private String f2018b;

    /* renamed from: c  reason: collision with root package name */
    private WorkerParameters.a f2019c;

    public i(m mVar, String str, WorkerParameters.a aVar) {
        this.f2017a = mVar;
        this.f2018b = str;
        this.f2019c = aVar;
    }

    public void run() {
        this.f2017a.e().a(this.f2018b, this.f2019c);
    }
}
