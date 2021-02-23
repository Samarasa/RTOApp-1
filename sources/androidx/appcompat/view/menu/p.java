package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import b.h.j.C0196b;
import java.lang.reflect.Method;

public class p extends c implements MenuItem {

    /* renamed from: d  reason: collision with root package name */
    private final b.h.c.a.b f358d;

    /* renamed from: e  reason: collision with root package name */
    private Method f359e;

    private class a extends C0196b {

        /* renamed from: d  reason: collision with root package name */
        final ActionProvider f360d;

        a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f360d = actionProvider;
        }

        public void a(SubMenu subMenu) {
            this.f360d.onPrepareSubMenu(p.this.a(subMenu));
        }

        public boolean a() {
            return this.f360d.hasSubMenu();
        }

        public View c() {
            return this.f360d.onCreateActionView();
        }

        public boolean d() {
            return this.f360d.onPerformDefaultAction();
        }
    }

    private class b extends a implements ActionProvider.VisibilityListener {

        /* renamed from: f  reason: collision with root package name */
        private C0196b.C0037b f362f;

        b(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        public View a(MenuItem menuItem) {
            return this.f360d.onCreateActionView(menuItem);
        }

        public void a(C0196b.C0037b bVar) {
            this.f362f = bVar;
            this.f360d.setVisibilityListener(bVar != null ? this : null);
        }

        public boolean b() {
            return this.f360d.isVisible();
        }

        public boolean e() {
            return this.f360d.overridesItemVisibility();
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            C0196b.C0037b bVar = this.f362f;
            if (bVar != null) {
                bVar.onActionProviderVisibilityChanged(z);
            }
        }
    }

    static class c extends FrameLayout implements b.a.d.c {

        /* renamed from: a  reason: collision with root package name */
        final CollapsibleActionView f364a;

        c(View view) {
            super(view.getContext());
            this.f364a = (CollapsibleActionView) view;
            addView(view);
        }

        /* access modifiers changed from: package-private */
        public View a() {
            return (View) this.f364a;
        }

        public void onActionViewCollapsed() {
            this.f364a.onActionViewCollapsed();
        }

        public void onActionViewExpanded() {
            this.f364a.onActionViewExpanded();
        }
    }

    private class d implements MenuItem.OnActionExpandListener {

        /* renamed from: a  reason: collision with root package name */
        private final MenuItem.OnActionExpandListener f365a;

        d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f365a = onActionExpandListener;
        }

        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f365a.onMenuItemActionCollapse(p.this.a(menuItem));
        }

        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f365a.onMenuItemActionExpand(p.this.a(menuItem));
        }
    }

    private class e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a  reason: collision with root package name */
        private final MenuItem.OnMenuItemClickListener f367a;

        e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f367a = onMenuItemClickListener;
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f367a.onMenuItemClick(p.this.a(menuItem));
        }
    }

    public p(Context context, b.h.c.a.b bVar) {
        super(context);
        if (bVar != null) {
            this.f358d = bVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public void a(boolean z) {
        try {
            if (this.f359e == null) {
                this.f359e = this.f358d.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
            }
            this.f359e.invoke(this.f358d, new Object[]{Boolean.valueOf(z)});
        } catch (Exception e2) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
        }
    }

    public boolean collapseActionView() {
        return this.f358d.collapseActionView();
    }

    public boolean expandActionView() {
        return this.f358d.expandActionView();
    }

    public ActionProvider getActionProvider() {
        C0196b a2 = this.f358d.a();
        if (a2 instanceof a) {
            return ((a) a2).f360d;
        }
        return null;
    }

    public View getActionView() {
        View actionView = this.f358d.getActionView();
        return actionView instanceof c ? ((c) actionView).a() : actionView;
    }

    public int getAlphabeticModifiers() {
        return this.f358d.getAlphabeticModifiers();
    }

    public char getAlphabeticShortcut() {
        return this.f358d.getAlphabeticShortcut();
    }

    public CharSequence getContentDescription() {
        return this.f358d.getContentDescription();
    }

    public int getGroupId() {
        return this.f358d.getGroupId();
    }

    public Drawable getIcon() {
        return this.f358d.getIcon();
    }

    public ColorStateList getIconTintList() {
        return this.f358d.getIconTintList();
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f358d.getIconTintMode();
    }

    public Intent getIntent() {
        return this.f358d.getIntent();
    }

    public int getItemId() {
        return this.f358d.getItemId();
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f358d.getMenuInfo();
    }

    public int getNumericModifiers() {
        return this.f358d.getNumericModifiers();
    }

    public char getNumericShortcut() {
        return this.f358d.getNumericShortcut();
    }

    public int getOrder() {
        return this.f358d.getOrder();
    }

    public SubMenu getSubMenu() {
        return a(this.f358d.getSubMenu());
    }

    public CharSequence getTitle() {
        return this.f358d.getTitle();
    }

    public CharSequence getTitleCondensed() {
        return this.f358d.getTitleCondensed();
    }

    public CharSequence getTooltipText() {
        return this.f358d.getTooltipText();
    }

    public boolean hasSubMenu() {
        return this.f358d.hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return this.f358d.isActionViewExpanded();
    }

    public boolean isCheckable() {
        return this.f358d.isCheckable();
    }

    public boolean isChecked() {
        return this.f358d.isChecked();
    }

    public boolean isEnabled() {
        return this.f358d.isEnabled();
    }

    public boolean isVisible() {
        return this.f358d.isVisible();
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        C0196b bVar = Build.VERSION.SDK_INT >= 16 ? new b(this.f301a, actionProvider) : new a(this.f301a, actionProvider);
        b.h.c.a.b bVar2 = this.f358d;
        if (actionProvider == null) {
            bVar = null;
        }
        bVar2.a(bVar);
        return this;
    }

    public MenuItem setActionView(int i) {
        this.f358d.setActionView(i);
        View actionView = this.f358d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f358d.setActionView((View) new c(actionView));
        }
        return this;
    }

    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new c(view);
        }
        this.f358d.setActionView(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c2) {
        this.f358d.setAlphabeticShortcut(c2);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c2, int i) {
        this.f358d.setAlphabeticShortcut(c2, i);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.f358d.setCheckable(z);
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.f358d.setChecked(z);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f358d.setContentDescription(charSequence);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f358d.setEnabled(z);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f358d.setIcon(i);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f358d.setIcon(drawable);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f358d.setIconTintList(colorStateList);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f358d.setIconTintMode(mode);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f358d.setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c2) {
        this.f358d.setNumericShortcut(c2);
        return this;
    }

    public MenuItem setNumericShortcut(char c2, int i) {
        this.f358d.setNumericShortcut(c2, i);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f358d.setOnActionExpandListener(onActionExpandListener != null ? new d(onActionExpandListener) : null);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f358d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new e(onMenuItemClickListener) : null);
        return this;
    }

    public MenuItem setShortcut(char c2, char c3) {
        this.f358d.setShortcut(c2, c3);
        return this;
    }

    public MenuItem setShortcut(char c2, char c3, int i, int i2) {
        this.f358d.setShortcut(c2, c3, i, i2);
        return this;
    }

    public void setShowAsAction(int i) {
        this.f358d.setShowAsAction(i);
    }

    public MenuItem setShowAsActionFlags(int i) {
        this.f358d.setShowAsActionFlags(i);
        return this;
    }

    public MenuItem setTitle(int i) {
        this.f358d.setTitle(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f358d.setTitle(charSequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f358d.setTitleCondensed(charSequence);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f358d.setTooltipText(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        return this.f358d.setVisible(z);
    }
}
