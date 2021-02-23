package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.google.android.gms.internal.ads.yx  reason: case insensitive filesystem */
public final class C3037yx extends C0874Lw<C2739una> implements C2739una {

    /* renamed from: b  reason: collision with root package name */
    private Map<View, C2456qna> f13004b = new WeakHashMap(1);

    /* renamed from: c  reason: collision with root package name */
    private final Context f13005c;

    /* renamed from: d  reason: collision with root package name */
    private final C2988yS f13006d;

    public C3037yx(Context context, Set<C3108zx<C2739una>> set, C2988yS ySVar) {
        super(set);
        this.f13005c = context;
        this.f13006d = ySVar;
    }

    public final synchronized void a(View view) {
        C2456qna qna = this.f13004b.get(view);
        if (qna == null) {
            qna = new C2456qna(this.f13005c, view);
            qna.a((C2739una) this);
            this.f13004b.put(view, qna);
        }
        if (this.f13006d != null && this.f13006d.R) {
            if (((Boolean) Qqa.e().a(F.eb)).booleanValue()) {
                qna.a(((Long) Qqa.e().a(F.db)).longValue());
                return;
            }
        }
        qna.a();
    }

    public final synchronized void a(C2810vna vna) {
        a(new C0693Ex(vna));
    }

    public final synchronized void b(View view) {
        if (this.f13004b.containsKey(view)) {
            this.f13004b.get(view).b((C2739una) this);
            this.f13004b.remove(view);
        }
    }
}
