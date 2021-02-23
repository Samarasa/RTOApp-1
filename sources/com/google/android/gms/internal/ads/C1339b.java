package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.C0936Og;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.b  reason: case insensitive filesystem */
public abstract class C1339b<T> implements Comparable<C1339b<T>> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C0936Og.a f9864a;

    /* renamed from: b  reason: collision with root package name */
    private final int f9865b;

    /* renamed from: c  reason: collision with root package name */
    private final String f9866c;

    /* renamed from: d  reason: collision with root package name */
    private final int f9867d;

    /* renamed from: e  reason: collision with root package name */
    private final Object f9868e;

    /* renamed from: f  reason: collision with root package name */
    private C1218Zc f9869f;

    /* renamed from: g  reason: collision with root package name */
    private Integer f9870g;

    /* renamed from: h  reason: collision with root package name */
    private C1439cb f9871h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private C2793vf m;
    private C3019yla n;
    private C1366ba o;

    public C1339b(int i2, String str, C1218Zc zc) {
        Uri parse;
        String host;
        this.f9864a = C0936Og.a.f8126a ? new C0936Og.a() : null;
        this.f9868e = new Object();
        this.i = true;
        int i3 = 0;
        this.j = false;
        this.k = false;
        this.l = false;
        this.n = null;
        this.f9865b = i2;
        this.f9866c = str;
        this.f9869f = zc;
        this.m = new _ma();
        if (!(TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null || (host = parse.getHost()) == null)) {
            i3 = host.hashCode();
        }
        this.f9867d = i3;
    }

    public final C1339b<?> a(C1439cb cbVar) {
        this.f9871h = cbVar;
        return this;
    }

    public final C1339b<?> a(C3019yla yla) {
        this.n = yla;
        return this;
    }

    /* access modifiers changed from: protected */
    public abstract C3073zd<T> a(Ara ara);

    public Map<String, String> a() {
        return Collections.emptyMap();
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        C1439cb cbVar = this.f9871h;
        if (cbVar != null) {
            cbVar.a(this, i2);
        }
    }

    public final void a(C1143Wf wf) {
        C1218Zc zc;
        synchronized (this.f9868e) {
            zc = this.f9869f;
        }
        if (zc != null) {
            zc.a(wf);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(C1366ba baVar) {
        synchronized (this.f9868e) {
            this.o = baVar;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(C3073zd<?> zdVar) {
        C1366ba baVar;
        synchronized (this.f9868e) {
            baVar = this.o;
        }
        if (baVar != null) {
            baVar.a(this, zdVar);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a(T t);

    public final void a(String str) {
        if (C0936Og.a.f8126a) {
            this.f9864a.a(str, Thread.currentThread().getId());
        }
    }

    public final C1339b<?> b(int i2) {
        this.f9870g = Integer.valueOf(i2);
        return this;
    }

    /* access modifiers changed from: package-private */
    public final void b(String str) {
        C1439cb cbVar = this.f9871h;
        if (cbVar != null) {
            cbVar.b(this);
        }
        if (C0936Og.a.f8126a) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new C0618Ca(this, str, id));
                return;
            }
            this.f9864a.a(str, id);
            this.f9864a.a(toString());
        }
    }

    public final int c() {
        return this.f9865b;
    }

    public /* synthetic */ int compareTo(Object obj) {
        C1339b bVar = (C1339b) obj;
        C0593Bb bb = C0593Bb.NORMAL;
        return bb == bb ? this.f9870g.intValue() - bVar.f9870g.intValue() : bb.ordinal() - bb.ordinal();
    }

    public final String d() {
        return this.f9866c;
    }

    public final int e() {
        return this.f9867d;
    }

    public final boolean m() {
        synchronized (this.f9868e) {
        }
        return false;
    }

    public final String n() {
        String str = this.f9866c;
        int i2 = this.f9865b;
        if (i2 == 0 || i2 == -1) {
            return str;
        }
        String num = Integer.toString(i2);
        StringBuilder sb = new StringBuilder(String.valueOf(num).length() + 1 + String.valueOf(str).length());
        sb.append(num);
        sb.append('-');
        sb.append(str);
        return sb.toString();
    }

    public final C3019yla o() {
        return this.n;
    }

    public byte[] p() {
        return null;
    }

    public final boolean q() {
        return this.i;
    }

    public final int r() {
        return this.m.b();
    }

    public final C2793vf s() {
        return this.m;
    }

    public final void t() {
        synchronized (this.f9868e) {
            this.k = true;
        }
    }

    public String toString() {
        String valueOf = String.valueOf(Integer.toHexString(this.f9867d));
        String concat = valueOf.length() != 0 ? "0x".concat(valueOf) : new String("0x");
        m();
        String str = this.f9866c;
        String valueOf2 = String.valueOf(C0593Bb.NORMAL);
        String valueOf3 = String.valueOf(this.f9870g);
        StringBuilder sb = new StringBuilder("[ ] ".length() + 3 + String.valueOf(str).length() + String.valueOf(concat).length() + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("[ ] ");
        sb.append(str);
        sb.append(" ");
        sb.append(concat);
        sb.append(" ");
        sb.append(valueOf2);
        sb.append(" ");
        sb.append(valueOf3);
        return sb.toString();
    }

    public final boolean u() {
        boolean z;
        synchronized (this.f9868e) {
            z = this.k;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    public final void v() {
        C1366ba baVar;
        synchronized (this.f9868e) {
            baVar = this.o;
        }
        if (baVar != null) {
            baVar.a(this);
        }
    }
}
