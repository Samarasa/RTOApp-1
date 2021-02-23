package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.graphics.drawable.a;
import b.h.c.a.b;
import b.h.j.C0196b;

/* renamed from: androidx.appcompat.view.menu.a  reason: case insensitive filesystem */
public class C0108a implements b {

    /* renamed from: a  reason: collision with root package name */
    private final int f285a;

    /* renamed from: b  reason: collision with root package name */
    private final int f286b;

    /* renamed from: c  reason: collision with root package name */
    private final int f287c;

    /* renamed from: d  reason: collision with root package name */
    private final int f288d;

    /* renamed from: e  reason: collision with root package name */
    private CharSequence f289e;

    /* renamed from: f  reason: collision with root package name */
    private CharSequence f290f;

    /* renamed from: g  reason: collision with root package name */
    private Intent f291g;

    /* renamed from: h  reason: collision with root package name */
    private char f292h;
    private int i = 4096;
    private char j;
    private int k = 4096;
    private Drawable l;
    private int m = 0;
    private Context n;
    private MenuItem.OnMenuItemClickListener o;
    private CharSequence p;
    private CharSequence q;
    private ColorStateList r = null;
    private PorterDuff.Mode s = null;
    private boolean t = false;
    private boolean u = false;
    private int v = 16;

    public C0108a(Context context, int i2, int i3, int i4, int i5, CharSequence charSequence) {
        this.n = context;
        this.f285a = i3;
        this.f286b = i2;
        this.f287c = i4;
        this.f288d = i5;
        this.f289e = charSequence;
    }

    private void b() {
        if (this.l == null) {
            return;
        }
        if (this.t || this.u) {
            this.l = a.i(this.l);
            this.l = this.l.mutate();
            if (this.t) {
                a.a(this.l, this.r);
            }
            if (this.u) {
                a.a(this.l, this.s);
            }
        }
    }

    public b a(C0196b bVar) {
        throw new UnsupportedOperationException();
    }

    public C0196b a() {
        return null;
    }

    public boolean collapseActionView() {
        return false;
    }

    public boolean expandActionView() {
        return false;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public View getActionView() {
        return null;
    }

    public int getAlphabeticModifiers() {
        return this.k;
    }

    public char getAlphabeticShortcut() {
        return this.j;
    }

    public CharSequence getContentDescription() {
        return this.p;
    }

    public int getGroupId() {
        return this.f286b;
    }

    public Drawable getIcon() {
        return this.l;
    }

    public ColorStateList getIconTintList() {
        return this.r;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.s;
    }

    public Intent getIntent() {
        return this.f291g;
    }

    public int getItemId() {
        return this.f285a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public int getNumericModifiers() {
        return this.i;
    }

    public char getNumericShortcut() {
        return this.f292h;
    }

    public int getOrder() {
        return this.f288d;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public CharSequence getTitle() {
        return this.f289e;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f290f;
        return charSequence != null ? charSequence : this.f289e;
    }

    public CharSequence getTooltipText() {
        return this.q;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isActionViewExpanded() {
        return false;
    }

    public boolean isCheckable() {
        return (this.v & 1) != 0;
    }

    public boolean isChecked() {
        return (this.v & 2) != 0;
    }

    public boolean isEnabled() {
        return (this.v & 16) != 0;
    }

    public boolean isVisible() {
        return (this.v & 8) == 0;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public b setActionView(int i2) {
        throw new UnsupportedOperationException();
    }

    public b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setAlphabeticShortcut(char c2) {
        this.j = Character.toLowerCase(c2);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c2, int i2) {
        this.j = Character.toLowerCase(c2);
        this.k = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.v = z | (this.v & true) ? 1 : 0;
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.v = (z ? 2 : 0) | (this.v & -3);
        return this;
    }

    public b setContentDescription(CharSequence charSequence) {
        this.p = charSequence;
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.v = (z ? 16 : 0) | (this.v & -17);
        return this;
    }

    public MenuItem setIcon(int i2) {
        this.m = i2;
        this.l = b.h.a.a.c(this.n, i2);
        b();
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.l = drawable;
        this.m = 0;
        b();
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.r = colorStateList;
        this.t = true;
        b();
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.s = mode;
        this.u = true;
        b();
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f291g = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c2) {
        this.f292h = c2;
        return this;
    }

    public MenuItem setNumericShortcut(char c2, int i2) {
        this.f292h = c2;
        this.i = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.o = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c2, char c3) {
        this.f292h = c2;
        this.j = Character.toLowerCase(c3);
        return this;
    }

    public MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.f292h = c2;
        this.i = KeyEvent.normalizeMetaState(i2);
        this.j = Character.toLowerCase(c3);
        this.k = KeyEvent.normalizeMetaState(i3);
        return this;
    }

    public void setShowAsAction(int i2) {
    }

    public b setShowAsActionFlags(int i2) {
        setShowAsAction(i2);
        return this;
    }

    public MenuItem setTitle(int i2) {
        this.f289e = this.n.getResources().getString(i2);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f289e = charSequence;
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f290f = charSequence;
        return this;
    }

    public b setTooltipText(CharSequence charSequence) {
        this.q = charSequence;
        return this;
    }

    public MenuItem setVisible(boolean z) {
        int i2 = 8;
        int i3 = this.v & 8;
        if (z) {
            i2 = 0;
        }
        this.v = i3 | i2;
        return this;
    }
}
