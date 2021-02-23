package g.a;

import java.util.concurrent.ThreadFactory;

class d implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f15008a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f15009b;

    d(String str, boolean z) {
        this.f15008a = str;
        this.f15009b = z;
    }

    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f15008a);
        thread.setDaemon(this.f15009b);
        return thread;
    }
}
