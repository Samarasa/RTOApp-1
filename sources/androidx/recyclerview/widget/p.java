package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

final class p implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    static final ThreadLocal<p> f1477a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    static Comparator<b> f1478b = new o();

    /* renamed from: c  reason: collision with root package name */
    ArrayList<RecyclerView> f1479c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    long f1480d;

    /* renamed from: e  reason: collision with root package name */
    long f1481e;

    /* renamed from: f  reason: collision with root package name */
    private ArrayList<b> f1482f = new ArrayList<>();

    @SuppressLint({"VisibleForTests"})
    static class a implements RecyclerView.i.a {

        /* renamed from: a  reason: collision with root package name */
        int f1483a;

        /* renamed from: b  reason: collision with root package name */
        int f1484b;

        /* renamed from: c  reason: collision with root package name */
        int[] f1485c;

        /* renamed from: d  reason: collision with root package name */
        int f1486d;

        a() {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            int[] iArr = this.f1485c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f1486d = 0;
        }

        public void a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (i2 >= 0) {
                int i3 = this.f1486d * 2;
                int[] iArr = this.f1485c;
                if (iArr == null) {
                    this.f1485c = new int[4];
                    Arrays.fill(this.f1485c, -1);
                } else if (i3 >= iArr.length) {
                    this.f1485c = new int[(i3 * 2)];
                    System.arraycopy(iArr, 0, this.f1485c, 0, iArr.length);
                }
                int[] iArr2 = this.f1485c;
                iArr2[i3] = i;
                iArr2[i3 + 1] = i2;
                this.f1486d++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }

        /* access modifiers changed from: package-private */
        public void a(RecyclerView recyclerView, boolean z) {
            this.f1486d = 0;
            int[] iArr = this.f1485c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.i iVar = recyclerView.w;
            if (recyclerView.v != null && iVar != null && iVar.v()) {
                if (z) {
                    if (!recyclerView.n.c()) {
                        iVar.a(recyclerView.v.getItemCount(), (RecyclerView.i.a) this);
                    }
                } else if (!recyclerView.j()) {
                    iVar.a(this.f1483a, this.f1484b, recyclerView.ra, (RecyclerView.i.a) this);
                }
                int i = this.f1486d;
                if (i > iVar.m) {
                    iVar.m = i;
                    iVar.n = z;
                    recyclerView.l.j();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public boolean a(int i) {
            if (this.f1485c != null) {
                int i2 = this.f1486d * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.f1485c[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public void b(int i, int i2) {
            this.f1483a = i;
            this.f1484b = i2;
        }
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        public boolean f1487a;

        /* renamed from: b  reason: collision with root package name */
        public int f1488b;

        /* renamed from: c  reason: collision with root package name */
        public int f1489c;

        /* renamed from: d  reason: collision with root package name */
        public RecyclerView f1490d;

        /* renamed from: e  reason: collision with root package name */
        public int f1491e;

        b() {
        }

        public void a() {
            this.f1487a = false;
            this.f1488b = 0;
            this.f1489c = 0;
            this.f1490d = null;
            this.f1491e = 0;
        }
    }

    p() {
    }

    private RecyclerView.x a(RecyclerView recyclerView, int i, long j) {
        if (a(recyclerView, i)) {
            return null;
        }
        RecyclerView.p pVar = recyclerView.l;
        try {
            recyclerView.q();
            RecyclerView.x a2 = pVar.a(i, false, j);
            if (a2 != null) {
                if (!a2.isBound() || a2.isInvalid()) {
                    pVar.a(a2, false);
                } else {
                    pVar.b(a2.itemView);
                }
            }
            return a2;
        } finally {
            recyclerView.a(false);
        }
    }

    private void a() {
        b bVar;
        int size = this.f1479c.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView = this.f1479c.get(i2);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.qa.a(recyclerView, false);
                i += recyclerView.qa.f1486d;
            }
        }
        this.f1482f.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView2 = this.f1479c.get(i4);
            if (recyclerView2.getWindowVisibility() == 0) {
                a aVar = recyclerView2.qa;
                int abs = Math.abs(aVar.f1483a) + Math.abs(aVar.f1484b);
                int i5 = i3;
                for (int i6 = 0; i6 < aVar.f1486d * 2; i6 += 2) {
                    if (i5 >= this.f1482f.size()) {
                        bVar = new b();
                        this.f1482f.add(bVar);
                    } else {
                        bVar = this.f1482f.get(i5);
                    }
                    int i7 = aVar.f1485c[i6 + 1];
                    bVar.f1487a = i7 <= abs;
                    bVar.f1488b = abs;
                    bVar.f1489c = i7;
                    bVar.f1490d = recyclerView2;
                    bVar.f1491e = aVar.f1485c[i6];
                    i5++;
                }
                i3 = i5;
            }
        }
        Collections.sort(this.f1482f, f1478b);
    }

    private void a(RecyclerView recyclerView, long j) {
        if (recyclerView != null) {
            if (recyclerView.N && recyclerView.o.b() != 0) {
                recyclerView.t();
            }
            a aVar = recyclerView.qa;
            aVar.a(recyclerView, true);
            if (aVar.f1486d != 0) {
                try {
                    b.h.f.a.a("RV Nested Prefetch");
                    recyclerView.ra.a(recyclerView.v);
                    for (int i = 0; i < aVar.f1486d * 2; i += 2) {
                        a(recyclerView, aVar.f1485c[i], j);
                    }
                } finally {
                    b.h.f.a.a();
                }
            }
        }
    }

    private void a(b bVar, long j) {
        RecyclerView.x a2 = a(bVar.f1490d, bVar.f1491e, bVar.f1487a ? Long.MAX_VALUE : j);
        if (a2 != null && a2.mNestedRecyclerView != null && a2.isBound() && !a2.isInvalid()) {
            a((RecyclerView) a2.mNestedRecyclerView.get(), j);
        }
    }

    static boolean a(RecyclerView recyclerView, int i) {
        int b2 = recyclerView.o.b();
        for (int i2 = 0; i2 < b2; i2++) {
            RecyclerView.x g2 = RecyclerView.g(recyclerView.o.d(i2));
            if (g2.mPosition == i && !g2.isInvalid()) {
                return true;
            }
        }
        return false;
    }

    private void b(long j) {
        int i = 0;
        while (i < this.f1482f.size()) {
            b bVar = this.f1482f.get(i);
            if (bVar.f1490d != null) {
                a(bVar, j);
                bVar.a();
                i++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(long j) {
        a();
        b(j);
    }

    public void a(RecyclerView recyclerView) {
        this.f1479c.add(recyclerView);
    }

    /* access modifiers changed from: package-private */
    public void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.f1480d == 0) {
            this.f1480d = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.qa.b(i, i2);
    }

    public void b(RecyclerView recyclerView) {
        this.f1479c.remove(recyclerView);
    }

    public void run() {
        try {
            b.h.f.a.a("RV Prefetch");
            if (!this.f1479c.isEmpty()) {
                int size = this.f1479c.size();
                long j = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = this.f1479c.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    a(TimeUnit.MILLISECONDS.toNanos(j) + this.f1481e);
                    this.f1480d = 0;
                    b.h.f.a.a();
                }
            }
        } finally {
            this.f1480d = 0;
            b.h.f.a.a();
        }
    }
}
