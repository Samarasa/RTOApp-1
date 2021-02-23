package c.b.b.c.o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import c.b.b.c.n.a;
import c.b.b.c.o.k;
import java.util.List;

class j extends k.f {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ List f4868b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Matrix f4869c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ k f4870d;

    j(k kVar, List list, Matrix matrix) {
        this.f4870d = kVar;
        this.f4868b = list;
        this.f4869c = matrix;
    }

    public void a(Matrix matrix, a aVar, int i, Canvas canvas) {
        for (k.f a2 : this.f4868b) {
            a2.a(this.f4869c, aVar, i, canvas);
        }
    }
}
