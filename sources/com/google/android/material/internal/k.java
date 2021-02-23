package com.google.android.material.internal;

import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.view.menu.t;

class k implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ l f14079a;

    k(l lVar) {
        this.f14079a = lVar;
    }

    public void onClick(View view) {
        boolean z = true;
        this.f14079a.b(true);
        o itemData = ((NavigationMenuItemView) view).getItemData();
        l lVar = this.f14079a;
        boolean a2 = lVar.f14083d.a((MenuItem) itemData, (t) lVar, 0);
        if (itemData == null || !itemData.isCheckable() || !a2) {
            z = false;
        } else {
            this.f14079a.f14085f.a(itemData);
        }
        this.f14079a.b(false);
        if (z) {
            this.f14079a.a(false);
        }
    }
}
