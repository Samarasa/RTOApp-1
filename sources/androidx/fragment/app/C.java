package androidx.fragment.app;

import androidx.lifecycle.g;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

public abstract class C {

    /* renamed from: a  reason: collision with root package name */
    ArrayList<a> f1019a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    int f1020b;

    /* renamed from: c  reason: collision with root package name */
    int f1021c;

    /* renamed from: d  reason: collision with root package name */
    int f1022d;

    /* renamed from: e  reason: collision with root package name */
    int f1023e;

    /* renamed from: f  reason: collision with root package name */
    int f1024f;

    /* renamed from: g  reason: collision with root package name */
    int f1025g;

    /* renamed from: h  reason: collision with root package name */
    boolean f1026h;
    boolean i = true;
    String j;
    int k;
    CharSequence l;
    int m;
    CharSequence n;
    ArrayList<String> o;
    ArrayList<String> p;
    boolean q = false;
    ArrayList<Runnable> r;

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        int f1027a;

        /* renamed from: b  reason: collision with root package name */
        C0158h f1028b;

        /* renamed from: c  reason: collision with root package name */
        int f1029c;

        /* renamed from: d  reason: collision with root package name */
        int f1030d;

        /* renamed from: e  reason: collision with root package name */
        int f1031e;

        /* renamed from: f  reason: collision with root package name */
        int f1032f;

        /* renamed from: g  reason: collision with root package name */
        g.b f1033g;

        /* renamed from: h  reason: collision with root package name */
        g.b f1034h;

        a() {
        }

        a(int i, C0158h hVar) {
            this.f1027a = i;
            this.f1028b = hVar;
            g.b bVar = g.b.RESUMED;
            this.f1033g = bVar;
            this.f1034h = bVar;
        }
    }

    public abstract int a();

    public C a(C0158h hVar) {
        a(new a(3, hVar));
        return this;
    }

    public C a(C0158h hVar, String str) {
        a(0, hVar, str, 1);
        return this;
    }

    /* access modifiers changed from: package-private */
    public void a(int i2, C0158h hVar, String str, int i3) {
        Class<?> cls = hVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str2 = hVar.x;
            if (str2 == null || str.equals(str2)) {
                hVar.x = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + hVar + ": was " + hVar.x + " now " + str);
            }
        }
        if (i2 != 0) {
            if (i2 != -1) {
                int i4 = hVar.v;
                if (i4 == 0 || i4 == i2) {
                    hVar.v = i2;
                    hVar.w = i2;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + hVar + ": was " + hVar.v + " now " + i2);
                }
            } else {
                throw new IllegalArgumentException("Can't add fragment " + hVar + " with tag " + str + " to container view with no id");
            }
        }
        a(new a(i3, hVar));
    }

    /* access modifiers changed from: package-private */
    public void a(a aVar) {
        this.f1019a.add(aVar);
        aVar.f1029c = this.f1020b;
        aVar.f1030d = this.f1021c;
        aVar.f1031e = this.f1022d;
        aVar.f1032f = this.f1023e;
    }

    public abstract int b();
}
