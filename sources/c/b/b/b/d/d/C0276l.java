package c.b.b.b.d.d;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: c.b.b.b.d.d.l  reason: case insensitive filesystem */
public final class C0276l {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C0262d f4012a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f4013b;

    /* renamed from: c  reason: collision with root package name */
    private final C0281q f4014c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final int f4015d;

    private C0276l(C0281q qVar) {
        this(qVar, false, C0270h.f4003b, Integer.MAX_VALUE);
    }

    private C0276l(C0281q qVar, boolean z, C0262d dVar, int i) {
        this.f4014c = qVar;
        this.f4013b = false;
        this.f4012a = dVar;
        this.f4015d = Integer.MAX_VALUE;
    }

    public static C0276l a(char c2) {
        C0266f fVar = new C0266f('.');
        C0277m.a(fVar);
        return new C0276l(new C0279o(fVar));
    }

    public final List<String> a(CharSequence charSequence) {
        C0277m.a(charSequence);
        Iterator<String> a2 = this.f4014c.a(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (a2.hasNext()) {
            arrayList.add(a2.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
