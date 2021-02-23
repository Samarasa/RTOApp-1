package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import b.h.c.a.c;

class B extends v implements SubMenu {

    /* renamed from: e  reason: collision with root package name */
    private final c f273e;

    B(Context context, c cVar) {
        super(context, cVar);
        this.f273e = cVar;
    }

    public void clearHeader() {
        this.f273e.clearHeader();
    }

    public MenuItem getItem() {
        return a(this.f273e.getItem());
    }

    public SubMenu setHeaderIcon(int i) {
        this.f273e.setHeaderIcon(i);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f273e.setHeaderIcon(drawable);
        return this;
    }

    public SubMenu setHeaderTitle(int i) {
        this.f273e.setHeaderTitle(i);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f273e.setHeaderTitle(charSequence);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        this.f273e.setHeaderView(view);
        return this;
    }

    public SubMenu setIcon(int i) {
        this.f273e.setIcon(i);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f273e.setIcon(drawable);
        return this;
    }
}
