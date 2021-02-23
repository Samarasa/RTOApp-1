package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.view.View;
import b.e.d;
import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.common.internal.d  reason: case insensitive filesystem */
public final class C0548d {

    /* renamed from: a  reason: collision with root package name */
    private final Account f5948a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<Scope> f5949b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<Scope> f5950c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<com.google.android.gms.common.api.a<?>, b> f5951d;

    /* renamed from: e  reason: collision with root package name */
    private final int f5952e;

    /* renamed from: f  reason: collision with root package name */
    private final View f5953f;

    /* renamed from: g  reason: collision with root package name */
    private final String f5954g;

    /* renamed from: h  reason: collision with root package name */
    private final String f5955h;
    private final c.b.b.b.e.a i;
    private final boolean j;
    private Integer k;

    /* renamed from: com.google.android.gms.common.internal.d$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private Account f5956a;

        /* renamed from: b  reason: collision with root package name */
        private d<Scope> f5957b;

        /* renamed from: c  reason: collision with root package name */
        private Map<com.google.android.gms.common.api.a<?>, b> f5958c;

        /* renamed from: d  reason: collision with root package name */
        private int f5959d = 0;

        /* renamed from: e  reason: collision with root package name */
        private View f5960e;

        /* renamed from: f  reason: collision with root package name */
        private String f5961f;

        /* renamed from: g  reason: collision with root package name */
        private String f5962g;

        /* renamed from: h  reason: collision with root package name */
        private c.b.b.b.e.a f5963h = c.b.b.b.e.a.f4662a;
        private boolean i;

        public final a a(Account account) {
            this.f5956a = account;
            return this;
        }

        public final a a(String str) {
            this.f5962g = str;
            return this;
        }

        public final a a(Collection<Scope> collection) {
            if (this.f5957b == null) {
                this.f5957b = new d<>();
            }
            this.f5957b.addAll(collection);
            return this;
        }

        public final C0548d a() {
            return new C0548d(this.f5956a, this.f5957b, this.f5958c, this.f5959d, this.f5960e, this.f5961f, this.f5962g, this.f5963h, this.i);
        }

        public final a b(String str) {
            this.f5961f = str;
            return this;
        }
    }

    /* renamed from: com.google.android.gms.common.internal.d$b */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final Set<Scope> f5964a;
    }

    public C0548d(Account account, Set<Scope> set, Map<com.google.android.gms.common.api.a<?>, b> map, int i2, View view, String str, String str2, c.b.b.b.e.a aVar, boolean z) {
        this.f5948a = account;
        this.f5949b = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f5951d = map == null ? Collections.emptyMap() : map;
        this.f5953f = view;
        this.f5952e = i2;
        this.f5954g = str;
        this.f5955h = str2;
        this.i = aVar;
        this.j = z;
        HashSet hashSet = new HashSet(this.f5949b);
        for (b bVar : this.f5951d.values()) {
            hashSet.addAll(bVar.f5964a);
        }
        this.f5950c = Collections.unmodifiableSet(hashSet);
    }

    public final Account a() {
        return this.f5948a;
    }

    public final void a(Integer num) {
        this.k = num;
    }

    public final Account b() {
        Account account = this.f5948a;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    public final Set<Scope> c() {
        return this.f5950c;
    }

    public final Integer d() {
        return this.k;
    }

    public final String e() {
        return this.f5955h;
    }

    public final String f() {
        return this.f5954g;
    }

    public final Set<Scope> g() {
        return this.f5949b;
    }

    public final c.b.b.b.e.a h() {
        return this.i;
    }
}
