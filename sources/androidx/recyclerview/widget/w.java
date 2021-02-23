package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public abstract class w {

    /* renamed from: a  reason: collision with root package name */
    protected final RecyclerView.i f1501a;

    /* renamed from: b  reason: collision with root package name */
    private int f1502b;

    /* renamed from: c  reason: collision with root package name */
    final Rect f1503c;

    private w(RecyclerView.i iVar) {
        this.f1502b = Integer.MIN_VALUE;
        this.f1503c = new Rect();
        this.f1501a = iVar;
    }

    /* synthetic */ w(RecyclerView.i iVar, u uVar) {
        this(iVar);
    }

    public static w a(RecyclerView.i iVar) {
        return new u(iVar);
    }

    public static w a(RecyclerView.i iVar, int i) {
        if (i == 0) {
            return a(iVar);
        }
        if (i == 1) {
            return b(iVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static w b(RecyclerView.i iVar) {
        return new v(iVar);
    }

    public abstract int a();

    public abstract int a(View view);

    public abstract void a(int i);

    public abstract int b();

    public abstract int b(View view);

    public abstract int c();

    public abstract int c(View view);

    public abstract int d();

    public abstract int d(View view);

    public abstract int e();

    public abstract int e(View view);

    public abstract int f();

    public abstract int f(View view);

    public abstract int g();

    public int h() {
        if (Integer.MIN_VALUE == this.f1502b) {
            return 0;
        }
        return g() - this.f1502b;
    }

    public void i() {
        this.f1502b = g();
    }
}
