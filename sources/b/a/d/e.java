package b.a.d;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.ActionBarContextView;
import b.a.d.b;
import java.lang.ref.WeakReference;

public class e extends b implements k.a {

    /* renamed from: c  reason: collision with root package name */
    private Context f2098c;

    /* renamed from: d  reason: collision with root package name */
    private ActionBarContextView f2099d;

    /* renamed from: e  reason: collision with root package name */
    private b.a f2100e;

    /* renamed from: f  reason: collision with root package name */
    private WeakReference<View> f2101f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f2102g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f2103h;
    private k i;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z) {
        this.f2098c = context;
        this.f2099d = actionBarContextView;
        this.f2100e = aVar;
        k kVar = new k(actionBarContextView.getContext());
        kVar.c(1);
        this.i = kVar;
        this.i.a((k.a) this);
        this.f2103h = z;
    }

    public void a() {
        if (!this.f2102g) {
            this.f2102g = true;
            this.f2099d.sendAccessibilityEvent(32);
            this.f2100e.a(this);
        }
    }

    public void a(int i2) {
        a((CharSequence) this.f2098c.getString(i2));
    }

    public void a(View view) {
        this.f2099d.setCustomView(view);
        this.f2101f = view != null ? new WeakReference<>(view) : null;
    }

    public void a(k kVar) {
        i();
        this.f2099d.d();
    }

    public void a(CharSequence charSequence) {
        this.f2099d.setSubtitle(charSequence);
    }

    public void a(boolean z) {
        super.a(z);
        this.f2099d.setTitleOptional(z);
    }

    public boolean a(k kVar, MenuItem menuItem) {
        return this.f2100e.a((b) this, menuItem);
    }

    public View b() {
        WeakReference<View> weakReference = this.f2101f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public void b(int i2) {
        b((CharSequence) this.f2098c.getString(i2));
    }

    public void b(CharSequence charSequence) {
        this.f2099d.setTitle(charSequence);
    }

    public Menu c() {
        return this.i;
    }

    public MenuInflater d() {
        return new g(this.f2099d.getContext());
    }

    public CharSequence e() {
        return this.f2099d.getSubtitle();
    }

    public CharSequence g() {
        return this.f2099d.getTitle();
    }

    public void i() {
        this.f2100e.b(this, this.i);
    }

    public boolean j() {
        return this.f2099d.b();
    }
}
