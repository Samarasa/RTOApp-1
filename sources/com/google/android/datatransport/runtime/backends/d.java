package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import c.b.b.a.a.e.a;

final class d extends i {

    /* renamed from: a  reason: collision with root package name */
    private final Context f5260a;

    /* renamed from: b  reason: collision with root package name */
    private final a f5261b;

    /* renamed from: c  reason: collision with root package name */
    private final a f5262c;

    /* renamed from: d  reason: collision with root package name */
    private final String f5263d;

    d(Context context, a aVar, a aVar2, String str) {
        if (context != null) {
            this.f5260a = context;
            if (aVar != null) {
                this.f5261b = aVar;
                if (aVar2 != null) {
                    this.f5262c = aVar2;
                    if (str != null) {
                        this.f5263d = str;
                        return;
                    }
                    throw new NullPointerException("Null backendName");
                }
                throw new NullPointerException("Null monotonicClock");
            }
            throw new NullPointerException("Null wallClock");
        }
        throw new NullPointerException("Null applicationContext");
    }

    public Context a() {
        return this.f5260a;
    }

    public String b() {
        return this.f5263d;
    }

    public a c() {
        return this.f5262c;
    }

    public a d() {
        return this.f5261b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f5260a.equals(iVar.a()) && this.f5261b.equals(iVar.d()) && this.f5262c.equals(iVar.c()) && this.f5263d.equals(iVar.b());
    }

    public int hashCode() {
        return ((((((this.f5260a.hashCode() ^ 1000003) * 1000003) ^ this.f5261b.hashCode()) * 1000003) ^ this.f5262c.hashCode()) * 1000003) ^ this.f5263d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f5260a + ", wallClock=" + this.f5261b + ", monotonicClock=" + this.f5262c + ", backendName=" + this.f5263d + "}";
    }
}
