package androidx.recyclerview.widget;

import android.view.View;

class M {

    /* renamed from: a  reason: collision with root package name */
    final b f1299a;

    /* renamed from: b  reason: collision with root package name */
    a f1300b = new a();

    static class a {

        /* renamed from: a  reason: collision with root package name */
        int f1301a = 0;

        /* renamed from: b  reason: collision with root package name */
        int f1302b;

        /* renamed from: c  reason: collision with root package name */
        int f1303c;

        /* renamed from: d  reason: collision with root package name */
        int f1304d;

        /* renamed from: e  reason: collision with root package name */
        int f1305e;

        a() {
        }

        /* access modifiers changed from: package-private */
        public int a(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }

        /* access modifiers changed from: package-private */
        public void a(int i) {
            this.f1301a = i | this.f1301a;
        }

        /* access modifiers changed from: package-private */
        public void a(int i, int i2, int i3, int i4) {
            this.f1302b = i;
            this.f1303c = i2;
            this.f1304d = i3;
            this.f1305e = i4;
        }

        /* access modifiers changed from: package-private */
        public boolean a() {
            int i = this.f1301a;
            if ((i & 7) != 0 && (i & (a(this.f1304d, this.f1302b) << 0)) == 0) {
                return false;
            }
            int i2 = this.f1301a;
            if ((i2 & 112) != 0 && (i2 & (a(this.f1304d, this.f1303c) << 4)) == 0) {
                return false;
            }
            int i3 = this.f1301a;
            if ((i3 & 1792) != 0 && (i3 & (a(this.f1305e, this.f1302b) << 8)) == 0) {
                return false;
            }
            int i4 = this.f1301a;
            return (i4 & 28672) == 0 || (i4 & (a(this.f1305e, this.f1303c) << 12)) != 0;
        }

        /* access modifiers changed from: package-private */
        public void b() {
            this.f1301a = 0;
        }
    }

    interface b {
        int a();

        int a(View view);

        View a(int i);

        int b();

        int b(View view);
    }

    M(b bVar) {
        this.f1299a = bVar;
    }

    /* access modifiers changed from: package-private */
    public View a(int i, int i2, int i3, int i4) {
        int a2 = this.f1299a.a();
        int b2 = this.f1299a.b();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View a3 = this.f1299a.a(i);
            this.f1300b.a(a2, b2, this.f1299a.a(a3), this.f1299a.b(a3));
            if (i3 != 0) {
                this.f1300b.b();
                this.f1300b.a(i3);
                if (this.f1300b.a()) {
                    return a3;
                }
            }
            if (i4 != 0) {
                this.f1300b.b();
                this.f1300b.a(i4);
                if (this.f1300b.a()) {
                    view = a3;
                }
            }
            i += i5;
        }
        return view;
    }

    /* access modifiers changed from: package-private */
    public boolean a(View view, int i) {
        this.f1300b.a(this.f1299a.a(), this.f1299a.b(), this.f1299a.a(view), this.f1299a.b(view));
        if (i == 0) {
            return false;
        }
        this.f1300b.b();
        this.f1300b.a(i);
        return this.f1300b.a();
    }
}
