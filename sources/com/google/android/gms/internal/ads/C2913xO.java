package com.google.android.gms.internal.ads;

import android.content.Context;
import c.b.b.b.b.c.c;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.oa;
import com.google.android.gms.ads.internal.util.wa;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* renamed from: com.google.android.gms.internal.ads.xO  reason: case insensitive filesystem */
public final class C2913xO implements JO<C2700uO> {

    /* renamed from: a  reason: collision with root package name */
    private final PY f12757a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f12758b;

    /* renamed from: c  reason: collision with root package name */
    private final C1200Yk f12759c;

    public C2913xO(PY py, Context context, C1200Yk yk) {
        this.f12757a = py;
        this.f12758b = context;
        this.f12759c = yk;
    }

    public final LY<C2700uO> a() {
        return this.f12757a.a(new C2842wO(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ C2700uO b() {
        boolean a2 = c.a(this.f12758b).a();
        p.c();
        boolean j = oa.j(this.f12758b);
        String str = this.f12759c.f9456a;
        p.e();
        boolean c2 = wa.c();
        p.c();
        return new C2700uO(a2, j, str, c2, oa.h(this.f12758b), DynamiteModule.b(this.f12758b, ModuleDescriptor.MODULE_ID), DynamiteModule.a(this.f12758b, ModuleDescriptor.MODULE_ID));
    }
}
