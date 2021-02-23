package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import b.h.j.C0195a;
import b.h.j.a.c;

public class G extends C0195a {

    /* renamed from: d  reason: collision with root package name */
    final RecyclerView f1272d;

    /* renamed from: e  reason: collision with root package name */
    final C0195a f1273e = new a(this);

    public static class a extends C0195a {

        /* renamed from: d  reason: collision with root package name */
        final G f1274d;

        public a(G g2) {
            this.f1274d = g2;
        }

        public void a(View view, c cVar) {
            super.a(view, cVar);
            if (!this.f1274d.c() && this.f1274d.f1272d.getLayoutManager() != null) {
                this.f1274d.f1272d.getLayoutManager().a(view, cVar);
            }
        }

        public boolean a(View view, int i, Bundle bundle) {
            if (super.a(view, i, bundle)) {
                return true;
            }
            if (this.f1274d.c() || this.f1274d.f1272d.getLayoutManager() == null) {
                return false;
            }
            return this.f1274d.f1272d.getLayoutManager().a(view, i, bundle);
        }
    }

    public G(RecyclerView recyclerView) {
        this.f1272d = recyclerView;
    }

    public void a(View view, c cVar) {
        super.a(view, cVar);
        if (!c() && this.f1272d.getLayoutManager() != null) {
            this.f1272d.getLayoutManager().a(cVar);
        }
    }

    public boolean a(View view, int i, Bundle bundle) {
        if (super.a(view, i, bundle)) {
            return true;
        }
        if (c() || this.f1272d.getLayoutManager() == null) {
            return false;
        }
        return this.f1272d.getLayoutManager().a(i, bundle);
    }

    public C0195a b() {
        return this.f1273e;
    }

    public void b(View view, AccessibilityEvent accessibilityEvent) {
        super.b(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !c()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().a(accessibilityEvent);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean c() {
        return this.f1272d.j();
    }
}
