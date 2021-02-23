package b.a.d;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.p;
import androidx.appcompat.view.menu.v;
import b.a.d.b;
import b.e.i;
import java.util.ArrayList;

public class f extends ActionMode {

    /* renamed from: a  reason: collision with root package name */
    final Context f2104a;

    /* renamed from: b  reason: collision with root package name */
    final b f2105b;

    public static class a implements b.a {

        /* renamed from: a  reason: collision with root package name */
        final ActionMode.Callback f2106a;

        /* renamed from: b  reason: collision with root package name */
        final Context f2107b;

        /* renamed from: c  reason: collision with root package name */
        final ArrayList<f> f2108c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        final i<Menu, Menu> f2109d = new i<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f2107b = context;
            this.f2106a = callback;
        }

        private Menu a(Menu menu) {
            Menu menu2 = this.f2109d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            v vVar = new v(this.f2107b, (b.h.c.a.a) menu);
            this.f2109d.put(menu, vVar);
            return vVar;
        }

        public void a(b bVar) {
            this.f2106a.onDestroyActionMode(b(bVar));
        }

        public boolean a(b bVar, Menu menu) {
            return this.f2106a.onCreateActionMode(b(bVar), a(menu));
        }

        public boolean a(b bVar, MenuItem menuItem) {
            return this.f2106a.onActionItemClicked(b(bVar), new p(this.f2107b, (b.h.c.a.b) menuItem));
        }

        public ActionMode b(b bVar) {
            int size = this.f2108c.size();
            for (int i = 0; i < size; i++) {
                f fVar = this.f2108c.get(i);
                if (fVar != null && fVar.f2105b == bVar) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.f2107b, bVar);
            this.f2108c.add(fVar2);
            return fVar2;
        }

        public boolean b(b bVar, Menu menu) {
            return this.f2106a.onPrepareActionMode(b(bVar), a(menu));
        }
    }

    public f(Context context, b bVar) {
        this.f2104a = context;
        this.f2105b = bVar;
    }

    public void finish() {
        this.f2105b.a();
    }

    public View getCustomView() {
        return this.f2105b.b();
    }

    public Menu getMenu() {
        return new v(this.f2104a, (b.h.c.a.a) this.f2105b.c());
    }

    public MenuInflater getMenuInflater() {
        return this.f2105b.d();
    }

    public CharSequence getSubtitle() {
        return this.f2105b.e();
    }

    public Object getTag() {
        return this.f2105b.f();
    }

    public CharSequence getTitle() {
        return this.f2105b.g();
    }

    public boolean getTitleOptionalHint() {
        return this.f2105b.h();
    }

    public void invalidate() {
        this.f2105b.i();
    }

    public boolean isTitleOptional() {
        return this.f2105b.j();
    }

    public void setCustomView(View view) {
        this.f2105b.a(view);
    }

    public void setSubtitle(int i) {
        this.f2105b.a(i);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f2105b.a(charSequence);
    }

    public void setTag(Object obj) {
        this.f2105b.a(obj);
    }

    public void setTitle(int i) {
        this.f2105b.b(i);
    }

    public void setTitle(CharSequence charSequence) {
        this.f2105b.b(charSequence);
    }

    public void setTitleOptionalHint(boolean z) {
        this.f2105b.a(z);
    }
}
