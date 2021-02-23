package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.b  reason: case insensitive filesystem */
class C0176b {

    /* renamed from: a  reason: collision with root package name */
    final C0017b f1419a;

    /* renamed from: b  reason: collision with root package name */
    final a f1420b = new a();

    /* renamed from: c  reason: collision with root package name */
    final List<View> f1421c = new ArrayList();

    /* renamed from: androidx.recyclerview.widget.b$a */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        long f1422a = 0;

        /* renamed from: b  reason: collision with root package name */
        a f1423b;

        a() {
        }

        private void b() {
            if (this.f1423b == null) {
                this.f1423b = new a();
            }
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f1422a = 0;
            a aVar = this.f1423b;
            if (aVar != null) {
                aVar.a();
            }
        }

        /* access modifiers changed from: package-private */
        public void a(int i) {
            if (i >= 64) {
                a aVar = this.f1423b;
                if (aVar != null) {
                    aVar.a(i - 64);
                    return;
                }
                return;
            }
            this.f1422a &= (1 << i) ^ -1;
        }

        /* access modifiers changed from: package-private */
        public void a(int i, boolean z) {
            if (i >= 64) {
                b();
                this.f1423b.a(i - 64, z);
                return;
            }
            boolean z2 = (this.f1422a & Long.MIN_VALUE) != 0;
            long j = (1 << i) - 1;
            long j2 = this.f1422a;
            this.f1422a = ((j2 & (j ^ -1)) << 1) | (j2 & j);
            if (z) {
                e(i);
            } else {
                a(i);
            }
            if (z2 || this.f1423b != null) {
                b();
                this.f1423b.a(0, z2);
            }
        }

        /* access modifiers changed from: package-private */
        public int b(int i) {
            a aVar = this.f1423b;
            return aVar == null ? i >= 64 ? Long.bitCount(this.f1422a) : Long.bitCount(this.f1422a & ((1 << i) - 1)) : i < 64 ? Long.bitCount(this.f1422a & ((1 << i) - 1)) : aVar.b(i - 64) + Long.bitCount(this.f1422a);
        }

        /* access modifiers changed from: package-private */
        public boolean c(int i) {
            if (i < 64) {
                return (this.f1422a & (1 << i)) != 0;
            }
            b();
            return this.f1423b.c(i - 64);
        }

        /* access modifiers changed from: package-private */
        public boolean d(int i) {
            if (i >= 64) {
                b();
                return this.f1423b.d(i - 64);
            }
            long j = 1 << i;
            boolean z = (this.f1422a & j) != 0;
            this.f1422a &= j ^ -1;
            long j2 = j - 1;
            long j3 = this.f1422a;
            this.f1422a = Long.rotateRight(j3 & (j2 ^ -1), 1) | (j3 & j2);
            a aVar = this.f1423b;
            if (aVar != null) {
                if (aVar.c(0)) {
                    e(63);
                }
                this.f1423b.d(0);
            }
            return z;
        }

        /* access modifiers changed from: package-private */
        public void e(int i) {
            if (i >= 64) {
                b();
                this.f1423b.e(i - 64);
                return;
            }
            this.f1422a |= 1 << i;
        }

        public String toString() {
            if (this.f1423b == null) {
                return Long.toBinaryString(this.f1422a);
            }
            return this.f1423b.toString() + "xx" + Long.toBinaryString(this.f1422a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.b$b  reason: collision with other inner class name */
    interface C0017b {
        int a();

        View a(int i);

        void a(View view);

        void a(View view, int i);

        void a(View view, int i, ViewGroup.LayoutParams layoutParams);

        int b(View view);

        void b();

        void b(int i);

        RecyclerView.x c(View view);

        void c(int i);

        void d(View view);
    }

    C0176b(C0017b bVar) {
        this.f1419a = bVar;
    }

    private int f(int i) {
        if (i < 0) {
            return -1;
        }
        int a2 = this.f1419a.a();
        int i2 = i;
        while (i2 < a2) {
            int b2 = i - (i2 - this.f1420b.b(i2));
            if (b2 == 0) {
                while (this.f1420b.c(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += b2;
        }
        return -1;
    }

    private void g(View view) {
        this.f1421c.add(view);
        this.f1419a.a(view);
    }

    private boolean h(View view) {
        if (!this.f1421c.remove(view)) {
            return false;
        }
        this.f1419a.d(view);
        return true;
    }

    /* access modifiers changed from: package-private */
    public int a() {
        return this.f1419a.a() - this.f1421c.size();
    }

    /* access modifiers changed from: package-private */
    public void a(int i) {
        int f2 = f(i);
        this.f1420b.d(f2);
        this.f1419a.b(f2);
    }

    /* access modifiers changed from: package-private */
    public void a(View view) {
        int b2 = this.f1419a.b(view);
        if (b2 >= 0) {
            this.f1420b.e(b2);
            g(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    /* access modifiers changed from: package-private */
    public void a(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int a2 = i < 0 ? this.f1419a.a() : f(i);
        this.f1420b.a(a2, z);
        if (z) {
            g(view);
        }
        this.f1419a.a(view, a2, layoutParams);
    }

    /* access modifiers changed from: package-private */
    public void a(View view, int i, boolean z) {
        int a2 = i < 0 ? this.f1419a.a() : f(i);
        this.f1420b.a(a2, z);
        if (z) {
            g(view);
        }
        this.f1419a.a(view, a2);
    }

    /* access modifiers changed from: package-private */
    public void a(View view, boolean z) {
        a(view, -1, z);
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.f1419a.a();
    }

    /* access modifiers changed from: package-private */
    public int b(View view) {
        int b2 = this.f1419a.b(view);
        if (b2 != -1 && !this.f1420b.c(b2)) {
            return b2 - this.f1420b.b(b2);
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public View b(int i) {
        int size = this.f1421c.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.f1421c.get(i2);
            RecyclerView.x c2 = this.f1419a.c(view);
            if (c2.getLayoutPosition() == i && !c2.isInvalid() && !c2.isRemoved()) {
                return view;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public View c(int i) {
        return this.f1419a.a(f(i));
    }

    /* access modifiers changed from: package-private */
    public void c() {
        this.f1420b.a();
        for (int size = this.f1421c.size() - 1; size >= 0; size--) {
            this.f1419a.d(this.f1421c.get(size));
            this.f1421c.remove(size);
        }
        this.f1419a.b();
    }

    /* access modifiers changed from: package-private */
    public boolean c(View view) {
        return this.f1421c.contains(view);
    }

    /* access modifiers changed from: package-private */
    public View d(int i) {
        return this.f1419a.a(i);
    }

    /* access modifiers changed from: package-private */
    public void d(View view) {
        int b2 = this.f1419a.b(view);
        if (b2 >= 0) {
            if (this.f1420b.d(b2)) {
                h(view);
            }
            this.f1419a.c(b2);
        }
    }

    /* access modifiers changed from: package-private */
    public void e(int i) {
        int f2 = f(i);
        View a2 = this.f1419a.a(f2);
        if (a2 != null) {
            if (this.f1420b.d(f2)) {
                h(a2);
            }
            this.f1419a.c(f2);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean e(View view) {
        int b2 = this.f1419a.b(view);
        if (b2 == -1) {
            h(view);
            return true;
        } else if (!this.f1420b.c(b2)) {
            return false;
        } else {
            this.f1420b.d(b2);
            h(view);
            this.f1419a.c(b2);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public void f(View view) {
        int b2 = this.f1419a.b(view);
        if (b2 < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        } else if (this.f1420b.c(b2)) {
            this.f1420b.a(b2);
            h(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.f1420b.toString() + ", hidden list:" + this.f1421c.size();
    }
}