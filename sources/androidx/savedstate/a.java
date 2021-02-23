package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.g;
import java.util.Map;

@SuppressLint({"RestrictedApi"})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private b.b.a.b.b<String, b> f1627a = new b.b.a.b.b<>();

    /* renamed from: b  reason: collision with root package name */
    private Bundle f1628b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f1629c;

    /* renamed from: d  reason: collision with root package name */
    boolean f1630d = true;

    /* renamed from: androidx.savedstate.a$a  reason: collision with other inner class name */
    public interface C0021a {
        void a(c cVar);
    }

    public interface b {
        Bundle a();
    }

    a() {
    }

    public Bundle a(String str) {
        if (this.f1629c) {
            Bundle bundle = this.f1628b;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            this.f1628b.remove(str);
            if (this.f1628b.isEmpty()) {
                this.f1628b = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    /* access modifiers changed from: package-private */
    public void a(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f1628b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        b.b.a.b.b<K, V>.d d2 = this.f1627a.d();
        while (d2.hasNext()) {
            Map.Entry entry = (Map.Entry) d2.next();
            bundle2.putBundle((String) entry.getKey(), ((b) entry.getValue()).a());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    /* access modifiers changed from: package-private */
    public void a(g gVar, Bundle bundle) {
        if (!this.f1629c) {
            if (bundle != null) {
                this.f1628b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            }
            gVar.a(new SavedStateRegistry$1(this));
            this.f1629c = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already restored.");
    }
}
