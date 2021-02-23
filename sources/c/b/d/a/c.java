package c.b.d.a;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.firebase.analytics.a.a;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private final a f4904a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4905b;

    /* renamed from: c  reason: collision with root package name */
    private Integer f4906c = null;

    public c(Context context, a aVar, String str) {
        this.f4904a = aVar;
        this.f4905b = str;
    }

    private a.C0086a a(b bVar) {
        a.C0086a aVar = new a.C0086a();
        aVar.f14228a = this.f4905b;
        aVar.m = bVar.b();
        aVar.f14229b = bVar.a();
        aVar.f14230c = bVar.f();
        aVar.f14231d = TextUtils.isEmpty(bVar.d()) ? null : bVar.d();
        aVar.f14232e = bVar.e();
        aVar.j = bVar.c();
        return aVar;
    }

    private ArrayList<b> a(List<b> list, Set<String> set) {
        ArrayList<b> arrayList = new ArrayList<>();
        for (b next : list) {
            if (!set.contains(next.a())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    private void a(a.C0086a aVar) {
        this.f4904a.a(aVar);
    }

    private void a(Collection<a.C0086a> collection) {
        for (a.C0086a aVar : collection) {
            a(aVar.f14229b);
        }
    }

    private ArrayList<a.C0086a> b(List<a.C0086a> list, Set<String> set) {
        ArrayList<a.C0086a> arrayList = new ArrayList<>();
        for (a.C0086a next : list) {
            if (!set.contains(next.f14229b)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    private List<a.C0086a> b() {
        return this.f4904a.b(this.f4905b, BuildConfig.FLAVOR);
    }

    private void b(List<b> list) {
        ArrayDeque arrayDeque = new ArrayDeque(b());
        int c2 = c();
        for (b next : list) {
            while (arrayDeque.size() >= c2) {
                a(((a.C0086a) arrayDeque.pollFirst()).f14229b);
            }
            a.C0086a a2 = a(next);
            a(a2);
            arrayDeque.offer(a2);
        }
    }

    private int c() {
        if (this.f4906c == null) {
            this.f4906c = Integer.valueOf(this.f4904a.g(this.f4905b));
        }
        return this.f4906c.intValue();
    }

    private static List<b> c(List<Map<String, String>> list) {
        ArrayList arrayList = new ArrayList();
        for (Map<String, String> a2 : list) {
            arrayList.add(b.a(a2));
        }
        return arrayList;
    }

    private void d() {
        if (this.f4904a == null) {
            throw new a("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
    }

    private void d(List<b> list) {
        if (list.isEmpty()) {
            a();
            return;
        }
        HashSet hashSet = new HashSet();
        for (b a2 : list) {
            hashSet.add(a2.a());
        }
        List<a.C0086a> b2 = b();
        HashSet hashSet2 = new HashSet();
        for (a.C0086a aVar : b2) {
            hashSet2.add(aVar.f14229b);
        }
        a((Collection<a.C0086a>) b(b2, hashSet));
        b(a(list, hashSet2));
    }

    public void a() {
        d();
        a((Collection<a.C0086a>) b());
    }

    /* access modifiers changed from: package-private */
    public void a(String str) {
        this.f4904a.clearConditionalUserProperty(str, (String) null, (Bundle) null);
    }

    public void a(List<Map<String, String>> list) {
        d();
        if (list != null) {
            d(c(list));
            return;
        }
        throw new IllegalArgumentException("The replacementExperiments list is null.");
    }
}
