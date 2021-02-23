package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.E;
import b.h.i.g;

/* renamed from: androidx.fragment.app.k  reason: case insensitive filesystem */
public class C0161k {

    /* renamed from: a  reason: collision with root package name */
    private final C0163m<?> f1124a;

    private C0161k(C0163m<?> mVar) {
        this.f1124a = mVar;
    }

    public static C0161k a(C0163m<?> mVar) {
        g.a(mVar, "callbacks == null");
        return new C0161k(mVar);
    }

    public View a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f1124a.f1130e.onCreateView(view, str, context, attributeSet);
    }

    public C0158h a(String str) {
        return this.f1124a.f1130e.b(str);
    }

    public void a() {
        this.f1124a.f1130e.e();
    }

    public void a(Configuration configuration) {
        this.f1124a.f1130e.a(configuration);
    }

    public void a(Parcelable parcelable) {
        C0163m<?> mVar = this.f1124a;
        if (mVar instanceof E) {
            mVar.f1130e.a(parcelable);
            return;
        }
        throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
    }

    public void a(Menu menu) {
        this.f1124a.f1130e.a(menu);
    }

    public void a(C0158h hVar) {
        C0163m<?> mVar = this.f1124a;
        mVar.f1130e.a((C0163m) mVar, (C0160j) mVar, hVar);
    }

    public void a(boolean z) {
        this.f1124a.f1130e.a(z);
    }

    public boolean a(Menu menu, MenuInflater menuInflater) {
        return this.f1124a.f1130e.a(menu, menuInflater);
    }

    public boolean a(MenuItem menuItem) {
        return this.f1124a.f1130e.a(menuItem);
    }

    public void b() {
        this.f1124a.f1130e.f();
    }

    public void b(boolean z) {
        this.f1124a.f1130e.b(z);
    }

    public boolean b(Menu menu) {
        return this.f1124a.f1130e.b(menu);
    }

    public boolean b(MenuItem menuItem) {
        return this.f1124a.f1130e.b(menuItem);
    }

    public void c() {
        this.f1124a.f1130e.g();
    }

    public void d() {
        this.f1124a.f1130e.i();
    }

    public void e() {
        this.f1124a.f1130e.j();
    }

    public void f() {
        this.f1124a.f1130e.k();
    }

    public void g() {
        this.f1124a.f1130e.l();
    }

    public void h() {
        this.f1124a.f1130e.m();
    }

    public boolean i() {
        return this.f1124a.f1130e.o();
    }

    public C0164n j() {
        return this.f1124a.f1130e;
    }

    public void k() {
        this.f1124a.f1130e.u();
    }

    public Parcelable l() {
        return this.f1124a.f1130e.w();
    }
}
