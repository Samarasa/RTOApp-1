package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;
import b.e.b;

class F implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C0158h f1044a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ C0158h f1045b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f1046c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ b f1047d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ View f1048e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ Q f1049f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ Rect f1050g;

    F(C0158h hVar, C0158h hVar2, boolean z, b bVar, View view, Q q, Rect rect) {
        this.f1044a = hVar;
        this.f1045b = hVar2;
        this.f1046c = z;
        this.f1047d = bVar;
        this.f1048e = view;
        this.f1049f = q;
        this.f1050g = rect;
    }

    public void run() {
        H.a(this.f1044a, this.f1045b, this.f1046c, (b<String, View>) this.f1047d, false);
        View view = this.f1048e;
        if (view != null) {
            this.f1049f.a(view, this.f1050g);
        }
    }
}
