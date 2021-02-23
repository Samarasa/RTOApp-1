package c.b.b.b.d.f;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.util.Log;
import b.h.a.b;

/* renamed from: c.b.b.b.d.f.ra  reason: case insensitive filesystem */
final class C0408ra implements C0374ma {

    /* renamed from: a  reason: collision with root package name */
    private static C0408ra f4545a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f4546b;

    /* renamed from: c  reason: collision with root package name */
    private final ContentObserver f4547c;

    private C0408ra() {
        this.f4546b = null;
        this.f4547c = null;
    }

    private C0408ra(Context context) {
        this.f4546b = context;
        this.f4547c = new C0422ta(this, (Handler) null);
        context.getContentResolver().registerContentObserver(C0333ga.f4438a, true, this.f4547c);
    }

    static C0408ra a(Context context) {
        C0408ra raVar;
        synchronized (C0408ra.class) {
            if (f4545a == null) {
                f4545a = b.a(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new C0408ra(context) : new C0408ra();
            }
            raVar = f4545a;
        }
        return raVar;
    }

    static synchronized void a() {
        synchronized (C0408ra.class) {
            if (!(f4545a == null || f4545a.f4546b == null || f4545a.f4547c == null)) {
                f4545a.f4546b.getContentResolver().unregisterContentObserver(f4545a.f4547c);
            }
            f4545a = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final String c(String str) {
        if (this.f4546b == null) {
            return null;
        }
        try {
            return (String) C0395pa.a(new C0402qa(this, str));
        } catch (IllegalStateException | SecurityException e2) {
            String valueOf = String.valueOf(str);
            Log.e("GservicesLoader", valueOf.length() != 0 ? "Unable to read GServices for: ".concat(valueOf) : new String("Unable to read GServices for: "), e2);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ String a(String str) {
        return C0333ga.a(this.f4546b.getContentResolver(), str, (String) null);
    }
}
