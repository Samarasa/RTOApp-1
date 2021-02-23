package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import b.h.i.g;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: androidx.fragment.app.m  reason: case insensitive filesystem */
public abstract class C0163m<E> extends C0160j {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f1126a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f1127b;

    /* renamed from: c  reason: collision with root package name */
    private final Handler f1128c;

    /* renamed from: d  reason: collision with root package name */
    private final int f1129d;

    /* renamed from: e  reason: collision with root package name */
    final v f1130e;

    C0163m(Activity activity, Context context, Handler handler, int i) {
        this.f1130e = new v();
        this.f1126a = activity;
        g.a(context, "context == null");
        this.f1127b = context;
        g.a(handler, "handler == null");
        this.f1128c = handler;
        this.f1129d = i;
    }

    C0163m(C0159i iVar) {
        this(iVar, iVar, new Handler(), 0);
    }

    public View a(int i) {
        return null;
    }

    /* access modifiers changed from: package-private */
    public void a(C0158h hVar) {
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public boolean a() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public Activity b() {
        return this.f1126a;
    }

    public boolean b(C0158h hVar) {
        return true;
    }

    /* access modifiers changed from: package-private */
    public Context c() {
        return this.f1127b;
    }

    /* access modifiers changed from: package-private */
    public Handler d() {
        return this.f1128c;
    }

    public LayoutInflater e() {
        return LayoutInflater.from(this.f1127b);
    }

    public int f() {
        return this.f1129d;
    }

    public boolean g() {
        return true;
    }

    public void h() {
    }
}
