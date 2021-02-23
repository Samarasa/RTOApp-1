package c.b.b.b.d.f;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Handler;
import android.os.StrictMode;
import android.util.Log;
import b.e.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: c.b.b.b.d.f.ha  reason: case insensitive filesystem */
public final class C0340ha implements C0374ma {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<Uri, C0340ha> f4459a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f4460b = {"key", "value"};

    /* renamed from: c  reason: collision with root package name */
    private final ContentResolver f4461c;

    /* renamed from: d  reason: collision with root package name */
    private final Uri f4462d;

    /* renamed from: e  reason: collision with root package name */
    private final ContentObserver f4463e = new C0353ja(this, (Handler) null);

    /* renamed from: f  reason: collision with root package name */
    private final Object f4464f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private volatile Map<String, String> f4465g;

    /* renamed from: h  reason: collision with root package name */
    private final List<C0381na> f4466h = new ArrayList();

    private C0340ha(ContentResolver contentResolver, Uri uri) {
        this.f4461c = contentResolver;
        this.f4462d = uri;
        contentResolver.registerContentObserver(uri, false, this.f4463e);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:2|3|(5:5|6|7|8|9)|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0018 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static c.b.b.b.d.f.C0340ha a(android.content.ContentResolver r3, android.net.Uri r4) {
        /*
            java.lang.Class<c.b.b.b.d.f.ha> r0 = c.b.b.b.d.f.C0340ha.class
            monitor-enter(r0)
            java.util.Map<android.net.Uri, c.b.b.b.d.f.ha> r1 = f4459a     // Catch:{ all -> 0x001a }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x001a }
            c.b.b.b.d.f.ha r1 = (c.b.b.b.d.f.C0340ha) r1     // Catch:{ all -> 0x001a }
            if (r1 != 0) goto L_0x0018
            c.b.b.b.d.f.ha r2 = new c.b.b.b.d.f.ha     // Catch:{ SecurityException -> 0x0018 }
            r2.<init>(r3, r4)     // Catch:{ SecurityException -> 0x0018 }
            java.util.Map<android.net.Uri, c.b.b.b.d.f.ha> r3 = f4459a     // Catch:{ SecurityException -> 0x0017 }
            r3.put(r4, r2)     // Catch:{ SecurityException -> 0x0017 }
        L_0x0017:
            r1 = r2
        L_0x0018:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r1
        L_0x001a:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.b.b.d.f.C0340ha.a(android.content.ContentResolver, android.net.Uri):c.b.b.b.d.f.ha");
    }

    static synchronized void c() {
        synchronized (C0340ha.class) {
            for (C0340ha next : f4459a.values()) {
                next.f4461c.unregisterContentObserver(next.f4463e);
            }
            f4459a.clear();
        }
    }

    /* JADX INFO: finally extract failed */
    private final Map<String, String> e() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            Map<String, String> map = (Map) C0395pa.a(new C0367la(this));
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return map;
        } catch (SQLiteException | IllegalStateException | SecurityException unused) {
            Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return null;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    public final Map<String, String> a() {
        Map<String, String> map = this.f4465g;
        if (map == null) {
            synchronized (this.f4464f) {
                map = this.f4465g;
                if (map == null) {
                    map = e();
                    this.f4465g = map;
                }
            }
        }
        return map != null ? map : Collections.emptyMap();
    }

    public final void b() {
        synchronized (this.f4464f) {
            this.f4465g = null;
            C0443wa.a();
        }
        synchronized (this) {
            for (C0381na a2 : this.f4466h) {
                a2.a();
            }
        }
    }

    public final /* synthetic */ Object c(String str) {
        return a().get(str);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Map d() {
        Cursor query = this.f4461c.query(this.f4462d, f4460b, (String) null, (String[]) null, (String) null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            Map bVar = count <= 256 ? new b(count) : new HashMap(count, 1.0f);
            while (query.moveToNext()) {
                bVar.put(query.getString(0), query.getString(1));
            }
            query.close();
            return bVar;
        } finally {
            query.close();
        }
    }
}
