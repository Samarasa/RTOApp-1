package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import b.h.c.a.a;

public class v extends c implements Menu {

    /* renamed from: d  reason: collision with root package name */
    private final a f379d;

    public v(Context context, a aVar) {
        super(context);
        if (aVar != null) {
            this.f379d = aVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public MenuItem add(int i) {
        return a(this.f379d.add(i));
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return a(this.f379d.add(i, i2, i3, i4));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return a(this.f379d.add(i, i2, i3, charSequence));
    }

    public MenuItem add(CharSequence charSequence) {
        return a(this.f379d.add(charSequence));
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr;
        MenuItem[] menuItemArr3 = menuItemArr2 != null ? new MenuItem[menuItemArr2.length] : null;
        int addIntentOptions = this.f379d.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr3);
        if (menuItemArr3 != null) {
            int length = menuItemArr3.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr2[i5] = a(menuItemArr3[i5]);
            }
        }
        return addIntentOptions;
    }

    public SubMenu addSubMenu(int i) {
        return a(this.f379d.addSubMenu(i));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return a(this.f379d.addSubMenu(i, i2, i3, i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return a(this.f379d.addSubMenu(i, i2, i3, charSequence));
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return a(this.f379d.addSubMenu(charSequence));
    }

    public void clear() {
        b();
        this.f379d.clear();
    }

    public void close() {
        this.f379d.close();
    }

    public MenuItem findItem(int i) {
        return a(this.f379d.findItem(i));
    }

    public MenuItem getItem(int i) {
        return a(this.f379d.getItem(i));
    }

    public boolean hasVisibleItems() {
        return this.f379d.hasVisibleItems();
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f379d.isShortcutKey(i, keyEvent);
    }

    public boolean performIdentifierAction(int i, int i2) {
        return this.f379d.performIdentifierAction(i, i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.f379d.performShortcut(i, keyEvent, i2);
    }

    public void removeGroup(int i) {
        a(i);
        this.f379d.removeGroup(i);
    }

    public void removeItem(int i) {
        b(i);
        this.f379d.removeItem(i);
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        this.f379d.setGroupCheckable(i, z, z2);
    }

    public void setGroupEnabled(int i, boolean z) {
        this.f379d.setGroupEnabled(i, z);
    }

    public void setGroupVisible(int i, boolean z) {
        this.f379d.setGroupVisible(i, z);
    }

    public void setQwertyMode(boolean z) {
        this.f379d.setQwertyMode(z);
    }

    public int size() {
        return this.f379d.size();
    }
}
