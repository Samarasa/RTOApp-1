package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;

class E implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Object f1036a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Q f1037b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ View f1038c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ C0158h f1039d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ ArrayList f1040e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ ArrayList f1041f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ ArrayList f1042g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ Object f1043h;

    E(Object obj, Q q, View view, C0158h hVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
        this.f1036a = obj;
        this.f1037b = q;
        this.f1038c = view;
        this.f1039d = hVar;
        this.f1040e = arrayList;
        this.f1041f = arrayList2;
        this.f1042g = arrayList3;
        this.f1043h = obj2;
    }

    public void run() {
        Object obj = this.f1036a;
        if (obj != null) {
            this.f1037b.b(obj, this.f1038c);
            this.f1041f.addAll(H.a(this.f1037b, this.f1036a, this.f1039d, (ArrayList<View>) this.f1040e, this.f1038c));
        }
        if (this.f1042g != null) {
            if (this.f1043h != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.f1038c);
                this.f1037b.a(this.f1043h, (ArrayList<View>) this.f1042g, (ArrayList<View>) arrayList);
            }
            this.f1042g.clear();
            this.f1042g.add(this.f1038c);
        }
    }
}
