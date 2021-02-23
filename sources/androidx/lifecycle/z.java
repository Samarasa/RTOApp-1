package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import androidx.lifecycle.g;

public class z extends Fragment {

    /* renamed from: a  reason: collision with root package name */
    private a f1257a;

    interface a {
        void m();

        void onCreate();

        void onResume();
    }

    static z a(Activity activity) {
        return (z) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
    }

    private void a(g.a aVar) {
        Activity activity = getActivity();
        if (activity instanceof n) {
            ((n) activity).getLifecycle().b(aVar);
        } else if (activity instanceof k) {
            g lifecycle = ((k) activity).getLifecycle();
            if (lifecycle instanceof m) {
                ((m) lifecycle).b(aVar);
            }
        }
    }

    public static void b(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new z(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    private void b(a aVar) {
        if (aVar != null) {
            aVar.onCreate();
        }
    }

    private void c(a aVar) {
        if (aVar != null) {
            aVar.onResume();
        }
    }

    private void d(a aVar) {
        if (aVar != null) {
            aVar.m();
        }
    }

    /* access modifiers changed from: package-private */
    public void a(a aVar) {
        this.f1257a = aVar;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        b(this.f1257a);
        a(g.a.ON_CREATE);
    }

    public void onDestroy() {
        super.onDestroy();
        a(g.a.ON_DESTROY);
        this.f1257a = null;
    }

    public void onPause() {
        super.onPause();
        a(g.a.ON_PAUSE);
    }

    public void onResume() {
        super.onResume();
        c(this.f1257a);
        a(g.a.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        d(this.f1257a);
        a(g.a.ON_START);
    }

    public void onStop() {
        super.onStop();
        a(g.a.ON_STOP);
    }
}
