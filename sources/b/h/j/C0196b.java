package b.h.j;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: b.h.j.b  reason: case insensitive filesystem */
public abstract class C0196b {

    /* renamed from: a  reason: collision with root package name */
    private final Context f2555a;

    /* renamed from: b  reason: collision with root package name */
    private a f2556b;

    /* renamed from: c  reason: collision with root package name */
    private C0037b f2557c;

    /* renamed from: b.h.j.b$a */
    public interface a {
    }

    /* renamed from: b.h.j.b$b  reason: collision with other inner class name */
    public interface C0037b {
        void onActionProviderVisibilityChanged(boolean z);
    }

    public C0196b(Context context) {
        this.f2555a = context;
    }

    public View a(MenuItem menuItem) {
        return c();
    }

    public void a(SubMenu subMenu) {
    }

    public void a(a aVar) {
        this.f2556b = aVar;
    }

    public void a(C0037b bVar) {
        if (!(this.f2557c == null || bVar == null)) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f2557c = bVar;
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return true;
    }

    public abstract View c();

    public boolean d() {
        return false;
    }

    public boolean e() {
        return false;
    }

    public void f() {
        this.f2557c = null;
        this.f2556b = null;
    }
}
