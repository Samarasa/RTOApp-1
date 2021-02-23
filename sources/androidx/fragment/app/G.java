package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.H;
import b.e.b;
import java.util.ArrayList;

class G implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Q f1052a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ b f1053b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Object f1054c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ H.a f1055d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ ArrayList f1056e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ View f1057f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ C0158h f1058g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ C0158h f1059h;
    final /* synthetic */ boolean i;
    final /* synthetic */ ArrayList j;
    final /* synthetic */ Object k;
    final /* synthetic */ Rect l;

    G(Q q, b bVar, Object obj, H.a aVar, ArrayList arrayList, View view, C0158h hVar, C0158h hVar2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
        this.f1052a = q;
        this.f1053b = bVar;
        this.f1054c = obj;
        this.f1055d = aVar;
        this.f1056e = arrayList;
        this.f1057f = view;
        this.f1058g = hVar;
        this.f1059h = hVar2;
        this.i = z;
        this.j = arrayList2;
        this.k = obj2;
        this.l = rect;
    }

    public void run() {
        b<String, View> a2 = H.a(this.f1052a, (b<String, String>) this.f1053b, this.f1054c, this.f1055d);
        if (a2 != null) {
            this.f1056e.addAll(a2.values());
            this.f1056e.add(this.f1057f);
        }
        H.a(this.f1058g, this.f1059h, this.i, a2, false);
        Object obj = this.f1054c;
        if (obj != null) {
            this.f1052a.b(obj, (ArrayList<View>) this.j, (ArrayList<View>) this.f1056e);
            View a3 = H.a(a2, this.f1055d, this.k, this.i);
            if (a3 != null) {
                this.f1052a.a(a3, this.l);
            }
        }
    }
}
