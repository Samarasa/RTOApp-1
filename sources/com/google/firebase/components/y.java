package com.google.firebase.components;

import c.b.d.c.c;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

final class y extends a {

    /* renamed from: a  reason: collision with root package name */
    private final Set<Class<?>> f14481a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<Class<?>> f14482b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<Class<?>> f14483c;

    /* renamed from: d  reason: collision with root package name */
    private final Set<Class<?>> f14484d;

    /* renamed from: e  reason: collision with root package name */
    private final Set<Class<?>> f14485e;

    /* renamed from: f  reason: collision with root package name */
    private final f f14486f;

    private static class a implements c {

        /* renamed from: a  reason: collision with root package name */
        private final Set<Class<?>> f14487a;

        /* renamed from: b  reason: collision with root package name */
        private final c f14488b;

        public a(Set<Class<?>> set, c cVar) {
            this.f14487a = set;
            this.f14488b = cVar;
        }
    }

    y(e<?> eVar, f fVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        for (q next : eVar.a()) {
            if (next.b()) {
                if (next.d()) {
                    hashSet3.add(next.a());
                } else {
                    hashSet.add(next.a());
                }
            } else if (next.d()) {
                hashSet4.add(next.a());
            } else {
                hashSet2.add(next.a());
            }
        }
        if (!eVar.d().isEmpty()) {
            hashSet.add(c.class);
        }
        this.f14481a = Collections.unmodifiableSet(hashSet);
        this.f14482b = Collections.unmodifiableSet(hashSet2);
        this.f14483c = Collections.unmodifiableSet(hashSet3);
        this.f14484d = Collections.unmodifiableSet(hashSet4);
        this.f14485e = eVar.d();
        this.f14486f = fVar;
    }

    public <T> T a(Class<T> cls) {
        if (this.f14481a.contains(cls)) {
            T a2 = this.f14486f.a(cls);
            return !cls.equals(c.class) ? a2 : new a(this.f14485e, (c) a2);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency %s.", new Object[]{cls}));
    }

    public <T> c.b.d.e.a<T> b(Class<T> cls) {
        if (this.f14482b.contains(cls)) {
            return this.f14486f.b(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Provider<%s>.", new Object[]{cls}));
    }

    public <T> c.b.d.e.a<Set<T>> c(Class<T> cls) {
        if (this.f14484d.contains(cls)) {
            return this.f14486f.c(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", new Object[]{cls}));
    }

    public <T> Set<T> d(Class<T> cls) {
        if (this.f14483c.contains(cls)) {
            return this.f14486f.d(cls);
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Set<%s>.", new Object[]{cls}));
    }
}
