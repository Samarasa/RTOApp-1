package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.C0096c;
import androidx.appcompat.widget.Toolbar;
import b.a.d.b;
import b.e.d;
import java.lang.ref.WeakReference;
import java.util.Iterator;

public abstract class q {

    /* renamed from: a  reason: collision with root package name */
    private static int f233a = -100;

    /* renamed from: b  reason: collision with root package name */
    private static final d<WeakReference<q>> f234b = new d<>();

    /* renamed from: c  reason: collision with root package name */
    private static final Object f235c = new Object();

    q() {
    }

    public static int a() {
        return f233a;
    }

    public static q a(Activity activity, p pVar) {
        return new z(activity, pVar);
    }

    public static q a(Dialog dialog, p pVar) {
        return new z(dialog, pVar);
    }

    static void a(q qVar) {
        synchronized (f235c) {
            c(qVar);
            f234b.add(new WeakReference(qVar));
        }
    }

    static void b(q qVar) {
        synchronized (f235c) {
            c(qVar);
        }
    }

    private static void c(q qVar) {
        synchronized (f235c) {
            Iterator<WeakReference<q>> it = f234b.iterator();
            while (it.hasNext()) {
                q qVar2 = (q) it.next().get();
                if (qVar2 == qVar || qVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    public abstract <T extends View> T a(int i);

    public abstract b a(b.a aVar);

    public void a(Context context) {
    }

    public abstract void a(Configuration configuration);

    public abstract void a(Bundle bundle);

    public abstract void a(View view);

    public abstract void a(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void a(Toolbar toolbar);

    public abstract void a(CharSequence charSequence);

    public abstract C0096c.a b();

    public abstract void b(Bundle bundle);

    public abstract void b(View view, ViewGroup.LayoutParams layoutParams);

    public abstract boolean b(int i);

    public int c() {
        return -100;
    }

    public abstract void c(int i);

    public abstract void c(Bundle bundle);

    public abstract MenuInflater d();

    public void d(int i) {
    }

    public abstract C0094a e();

    public abstract void f();

    public abstract void g();

    public abstract void h();

    public abstract void i();

    public abstract void j();

    public abstract void k();
}
