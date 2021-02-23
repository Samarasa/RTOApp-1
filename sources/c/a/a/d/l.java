package c.a.a.d;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import c.a.a.c;
import c.a.a.n;
import java.util.HashSet;
import java.util.Set;

@Deprecated
public class l extends Fragment {

    /* renamed from: a  reason: collision with root package name */
    private final a f3518a;

    /* renamed from: b  reason: collision with root package name */
    private final o f3519b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<l> f3520c;

    /* renamed from: d  reason: collision with root package name */
    private n f3521d;

    /* renamed from: e  reason: collision with root package name */
    private l f3522e;

    /* renamed from: f  reason: collision with root package name */
    private Fragment f3523f;

    private class a implements o {
        a() {
        }

        public String toString() {
            return super.toString() + "{fragment=" + l.this + "}";
        }
    }

    public l() {
        this(new a());
    }

    @SuppressLint({"ValidFragment"})
    l(a aVar) {
        this.f3519b = new a();
        this.f3520c = new HashSet();
        this.f3518a = aVar;
    }

    private void a(Activity activity) {
        e();
        this.f3522e = c.a((Context) activity).h().b(activity);
        if (!equals(this.f3522e)) {
            this.f3522e.a(this);
        }
    }

    private void a(l lVar) {
        this.f3520c.add(lVar);
    }

    private void b(l lVar) {
        this.f3520c.remove(lVar);
    }

    @TargetApi(17)
    private Fragment d() {
        Fragment parentFragment = Build.VERSION.SDK_INT >= 17 ? getParentFragment() : null;
        return parentFragment != null ? parentFragment : this.f3523f;
    }

    private void e() {
        l lVar = this.f3522e;
        if (lVar != null) {
            lVar.b(this);
            this.f3522e = null;
        }
    }

    /* access modifiers changed from: package-private */
    public a a() {
        return this.f3518a;
    }

    /* access modifiers changed from: package-private */
    public void a(Fragment fragment) {
        this.f3523f = fragment;
        if (fragment != null && fragment.getActivity() != null) {
            a(fragment.getActivity());
        }
    }

    public void a(n nVar) {
        this.f3521d = nVar;
    }

    public n b() {
        return this.f3521d;
    }

    public o c() {
        return this.f3519b;
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            a(activity);
        } catch (IllegalStateException e2) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e2);
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.f3518a.a();
        e();
    }

    public void onDetach() {
        super.onDetach();
        e();
    }

    public void onStart() {
        super.onStart();
        this.f3518a.b();
    }

    public void onStop() {
        super.onStop();
        this.f3518a.c();
    }

    public String toString() {
        return super.toString() + "{parent=" + d() + "}";
    }
}
