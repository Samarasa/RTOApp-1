package com.google.firebase.components;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class e<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Set<Class<? super T>> f14440a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<q> f14441b;

    /* renamed from: c  reason: collision with root package name */
    private final int f14442c;

    /* renamed from: d  reason: collision with root package name */
    private final int f14443d;

    /* renamed from: e  reason: collision with root package name */
    private final i<T> f14444e;

    /* renamed from: f  reason: collision with root package name */
    private final Set<Class<?>> f14445f;

    public static class a<T> {

        /* renamed from: a  reason: collision with root package name */
        private final Set<Class<? super T>> f14446a;

        /* renamed from: b  reason: collision with root package name */
        private final Set<q> f14447b;

        /* renamed from: c  reason: collision with root package name */
        private int f14448c;

        /* renamed from: d  reason: collision with root package name */
        private int f14449d;

        /* renamed from: e  reason: collision with root package name */
        private i<T> f14450e;

        /* renamed from: f  reason: collision with root package name */
        private Set<Class<?>> f14451f;

        @SafeVarargs
        private a(Class<T> cls, Class<? super T>... clsArr) {
            this.f14446a = new HashSet();
            this.f14447b = new HashSet();
            this.f14448c = 0;
            this.f14449d = 0;
            this.f14451f = new HashSet();
            x.a(cls, "Null interface");
            this.f14446a.add(cls);
            for (Class<? super T> a2 : clsArr) {
                x.a(a2, "Null interface");
            }
            Collections.addAll(this.f14446a, clsArr);
        }

        private a<T> a(int i) {
            x.b(this.f14448c == 0, "Instantiation type has already been set.");
            this.f14448c = i;
            return this;
        }

        private void a(Class<?> cls) {
            x.a(!this.f14446a.contains(cls), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        /* access modifiers changed from: private */
        public a<T> d() {
            this.f14449d = 1;
            return this;
        }

        public a<T> a() {
            a(1);
            return this;
        }

        public a<T> a(i<T> iVar) {
            x.a(iVar, "Null factory");
            this.f14450e = iVar;
            return this;
        }

        public a<T> a(q qVar) {
            x.a(qVar, "Null dependency");
            a(qVar.a());
            this.f14447b.add(qVar);
            return this;
        }

        public e<T> b() {
            x.b(this.f14450e != null, "Missing required property: factory.");
            return new e(new HashSet(this.f14446a), new HashSet(this.f14447b), this.f14448c, this.f14449d, this.f14450e, this.f14451f);
        }

        public a<T> c() {
            a(2);
            return this;
        }
    }

    private e(Set<Class<? super T>> set, Set<q> set2, int i, int i2, i<T> iVar, Set<Class<?>> set3) {
        this.f14440a = Collections.unmodifiableSet(set);
        this.f14441b = Collections.unmodifiableSet(set2);
        this.f14442c = i;
        this.f14443d = i2;
        this.f14444e = iVar;
        this.f14445f = Collections.unmodifiableSet(set3);
    }

    public static <T> a<T> a(Class<T> cls) {
        return new a<>(cls, new Class[0]);
    }

    @SafeVarargs
    public static <T> a<T> a(Class<T> cls, Class<? super T>... clsArr) {
        return new a<>(cls, clsArr);
    }

    public static <T> e<T> a(T t, Class<T> cls) {
        a<T> b2 = b(cls);
        b2.a((i<T>) c.a((Object) t));
        return b2.b();
    }

    @SafeVarargs
    public static <T> e<T> a(T t, Class<T> cls, Class<? super T>... clsArr) {
        a<T> a2 = a(cls, clsArr);
        a2.a((i<T>) b.a((Object) t));
        return a2.b();
    }

    static /* synthetic */ Object a(Object obj, f fVar) {
        return obj;
    }

    public static <T> a<T> b(Class<T> cls) {
        a<T> a2 = a(cls);
        a unused = a2.d();
        return a2;
    }

    static /* synthetic */ Object b(Object obj, f fVar) {
        return obj;
    }

    public Set<q> a() {
        return this.f14441b;
    }

    public i<T> b() {
        return this.f14444e;
    }

    public Set<Class<? super T>> c() {
        return this.f14440a;
    }

    public Set<Class<?>> d() {
        return this.f14445f;
    }

    public boolean e() {
        return this.f14442c == 1;
    }

    public boolean f() {
        return this.f14442c == 2;
    }

    public boolean g() {
        return this.f14443d == 0;
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f14440a.toArray()) + ">{" + this.f14442c + ", type=" + this.f14443d + ", deps=" + Arrays.toString(this.f14441b.toArray()) + "}";
    }
}
