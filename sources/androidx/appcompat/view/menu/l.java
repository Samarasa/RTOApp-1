package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.C0107n;
import androidx.appcompat.view.menu.t;
import b.a.g;

class l implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, t.a {

    /* renamed from: a  reason: collision with root package name */
    private k f345a;

    /* renamed from: b  reason: collision with root package name */
    private C0107n f346b;

    /* renamed from: c  reason: collision with root package name */
    i f347c;

    /* renamed from: d  reason: collision with root package name */
    private t.a f348d;

    public l(k kVar) {
        this.f345a = kVar;
    }

    public void a() {
        C0107n nVar = this.f346b;
        if (nVar != null) {
            nVar.dismiss();
        }
    }

    public void a(IBinder iBinder) {
        k kVar = this.f345a;
        C0107n.a aVar = new C0107n.a(kVar.e());
        this.f347c = new i(aVar.b(), g.abc_list_menu_item_layout);
        this.f347c.a((t.a) this);
        this.f345a.a((t) this.f347c);
        aVar.a(this.f347c.c(), (DialogInterface.OnClickListener) this);
        View i = kVar.i();
        if (i != null) {
            aVar.a(i);
        } else {
            aVar.a(kVar.g());
            aVar.b(kVar.h());
        }
        aVar.a((DialogInterface.OnKeyListener) this);
        this.f346b = aVar.a();
        this.f346b.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f346b.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f346b.show();
    }

    public void a(k kVar, boolean z) {
        if (z || kVar == this.f345a) {
            a();
        }
        t.a aVar = this.f348d;
        if (aVar != null) {
            aVar.a(kVar, z);
        }
    }

    public boolean a(k kVar) {
        t.a aVar = this.f348d;
        if (aVar != null) {
            return aVar.a(kVar);
        }
        return false;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f345a.a((MenuItem) (o) this.f347c.c().getItem(i), 0);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.f347c.a(this.f345a, true);
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f346b.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f346b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f345a.a(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f345a.performShortcut(i, keyEvent, 0);
    }
}
