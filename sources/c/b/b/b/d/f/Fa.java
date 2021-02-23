package c.b.b.b.d.f;

import android.content.Context;
import android.content.SharedPreferences;
import b.e.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class Fa implements C0374ma {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, Fa> f4149a = new b();

    /* renamed from: b  reason: collision with root package name */
    private final SharedPreferences f4150b;

    /* renamed from: c  reason: collision with root package name */
    private final SharedPreferences.OnSharedPreferenceChangeListener f4151c = new Ea(this);

    /* renamed from: d  reason: collision with root package name */
    private final Object f4152d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private volatile Map<String, ?> f4153e;

    /* renamed from: f  reason: collision with root package name */
    private final List<C0381na> f4154f = new ArrayList();

    private Fa(SharedPreferences sharedPreferences) {
        this.f4150b = sharedPreferences;
        this.f4150b.registerOnSharedPreferenceChangeListener(this.f4151c);
    }

    static Fa a(Context context, String str) {
        Fa fa;
        SharedPreferences sharedPreferences;
        if (!((!C0347ia.a() || str.startsWith("direct_boot:")) ? true : C0347ia.a(context))) {
            return null;
        }
        synchronized (Fa.class) {
            fa = f4149a.get(str);
            if (fa == null) {
                if (str.startsWith("direct_boot:")) {
                    if (C0347ia.a()) {
                        context = context.createDeviceProtectedStorageContext();
                    }
                    sharedPreferences = context.getSharedPreferences(str.substring(12), 0);
                } else {
                    sharedPreferences = context.getSharedPreferences(str, 0);
                }
                fa = new Fa(sharedPreferences);
                f4149a.put(str, fa);
            }
        }
        return fa;
    }

    static synchronized void a() {
        synchronized (Fa.class) {
            for (Fa next : f4149a.values()) {
                next.f4150b.unregisterOnSharedPreferenceChangeListener(next.f4151c);
            }
            f4149a.clear();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(SharedPreferences sharedPreferences, String str) {
        synchronized (this.f4152d) {
            this.f4153e = null;
            C0443wa.a();
        }
        synchronized (this) {
            for (C0381na a2 : this.f4154f) {
                a2.a();
            }
        }
    }

    public final Object c(String str) {
        Map<String, ?> map = this.f4153e;
        if (map == null) {
            synchronized (this.f4152d) {
                map = this.f4153e;
                if (map == null) {
                    map = this.f4150b.getAll();
                    this.f4153e = map;
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }
}
