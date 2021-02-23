package com.google.android.gms.measurement.a;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import c.b.b.b.d.f.Vf;
import java.util.List;
import java.util.Map;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private final Vf f13154a;

    public a(Vf vf) {
        this.f13154a = vf;
    }

    public static a a(Context context, String str, String str2, String str3, Bundle bundle) {
        return Vf.a(context, str, str2, str3, bundle).a();
    }

    public long a() {
        return this.f13154a.d();
    }

    public List<Bundle> a(String str, String str2) {
        return this.f13154a.a(str, str2);
    }

    public Map<String, Object> a(String str, String str2, boolean z) {
        return this.f13154a.a(str, str2, z);
    }

    public void a(Activity activity, String str, String str2) {
        this.f13154a.a(activity, str, str2);
    }

    public void a(Bundle bundle) {
        this.f13154a.a(bundle, false);
    }

    public void a(String str) {
        this.f13154a.a(str);
    }

    public void a(String str, String str2, Bundle bundle) {
        this.f13154a.b(str, str2, bundle);
    }

    public void a(String str, String str2, Object obj) {
        this.f13154a.a(str, str2, obj);
    }

    public Bundle b(Bundle bundle) {
        return this.f13154a.a(bundle, true);
    }

    public String b() {
        return this.f13154a.g();
    }

    public void b(String str) {
        this.f13154a.b(str);
    }

    public void b(String str, String str2, Bundle bundle) {
        this.f13154a.a(str, str2, bundle);
    }

    public int c(String str) {
        return this.f13154a.c(str);
    }

    public String c() {
        return this.f13154a.c();
    }

    public void c(Bundle bundle) {
        this.f13154a.a(bundle);
    }

    public String d() {
        return this.f13154a.f();
    }

    public String e() {
        return this.f13154a.e();
    }

    public String f() {
        return this.f13154a.b();
    }
}
