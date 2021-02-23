package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.ViewGroup;
import android.view.Window;
import java.util.Set;

public final class BN implements JO<C2912xN> {

    /* renamed from: a  reason: collision with root package name */
    private final PY f6275a;

    /* renamed from: b  reason: collision with root package name */
    private final ViewGroup f6276b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f6277c;

    /* renamed from: d  reason: collision with root package name */
    private final Set<String> f6278d;

    public BN(PY py, ViewGroup viewGroup, Context context, Set<String> set) {
        this.f6275a = py;
        this.f6278d = set;
        this.f6276b = viewGroup;
        this.f6277c = context;
    }

    private static Boolean a(Activity activity) {
        Window window = activity.getWindow();
        boolean z = true;
        if (window != null && (window.getAttributes().flags & 16777216) != 0) {
            return true;
        }
        try {
            if ((activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).flags & 512) == 0) {
                z = false;
            }
            return Boolean.valueOf(z);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final LY<C2912xN> a() {
        return this.f6275a.a(new AN(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ C2912xN b() {
        if (((Boolean) Qqa.e().a(F.je)).booleanValue() && this.f6276b != null && this.f6278d.contains("banner")) {
            return new C2912xN(Boolean.valueOf(this.f6276b.isHardwareAccelerated()));
        }
        if (((Boolean) Qqa.e().a(F.ke)).booleanValue() && this.f6278d.contains("native")) {
            Context context = this.f6277c;
            if (context instanceof Activity) {
                return new C2912xN(a((Activity) context));
            }
        }
        return new C2912xN((Boolean) null);
    }
}
