package androidx.appcompat.widget;

import android.view.View;
import android.view.Window;
import androidx.appcompat.view.menu.C0108a;

class Fa implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    final C0108a f453a = new C0108a(this.f454b.f463a.getContext(), 0, 16908332, 0, 0, this.f454b.i);

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Ha f454b;

    Fa(Ha ha) {
        this.f454b = ha;
    }

    public void onClick(View view) {
        Ha ha = this.f454b;
        Window.Callback callback = ha.l;
        if (callback != null && ha.m) {
            callback.onMenuItemSelected(0, this.f453a);
        }
    }
}
