package androidx.work.impl;

import android.annotation.SuppressLint;
import androidx.work.ListenableWorker;
import androidx.work.h;
import androidx.work.impl.utils.a.e;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

class o implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ e f1939a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f1940b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ p f1941c;

    o(p pVar, e eVar, String str) {
        this.f1941c = pVar;
        this.f1939a = eVar;
        this.f1940b = str;
    }

    @SuppressLint({"SyntheticAccessor"})
    public void run() {
        try {
            ListenableWorker.a aVar = (ListenableWorker.a) this.f1939a.get();
            if (aVar == null) {
                h.a().b(p.f1942a, String.format("%s returned a null result. Treating it as a failure.", new Object[]{this.f1941c.f1947f.f1892e}), new Throwable[0]);
            } else {
                h.a().a(p.f1942a, String.format("%s returned a %s result.", new Object[]{this.f1941c.f1947f.f1892e, aVar}), new Throwable[0]);
                this.f1941c.f1949h = aVar;
            }
        } catch (CancellationException e2) {
            h.a().c(p.f1942a, String.format("%s was cancelled", new Object[]{this.f1940b}), e2);
        } catch (InterruptedException | ExecutionException e3) {
            h.a().b(p.f1942a, String.format("%s failed because it threw an exception/error", new Object[]{this.f1940b}), e3);
        } catch (Throwable th) {
            this.f1941c.b();
            throw th;
        }
        this.f1941c.b();
    }
}
