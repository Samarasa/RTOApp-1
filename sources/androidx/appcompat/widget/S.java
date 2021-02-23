package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.t;
import b.h.j.E;

public interface S {
    E a(int i, long j);

    void a(int i);

    void a(Drawable drawable);

    void a(Menu menu, t.a aVar);

    void a(t.a aVar, k.a aVar2);

    void a(C0125ha haVar);

    void a(boolean z);

    boolean a();

    void b();

    void b(int i);

    void b(boolean z);

    void c(int i);

    boolean c();

    void collapseActionView();

    void d(int i);

    boolean d();

    boolean e();

    boolean f();

    void g();

    Context getContext();

    CharSequence getTitle();

    boolean h();

    Menu i();

    int j();

    ViewGroup k();

    int l();

    void m();

    void n();

    void setIcon(int i);

    void setIcon(Drawable drawable);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);
}
