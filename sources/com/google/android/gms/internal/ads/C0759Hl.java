package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.TextureView;

@TargetApi(14)
/* renamed from: com.google.android.gms.internal.ads.Hl  reason: case insensitive filesystem */
public abstract class C0759Hl extends TextureView implements C1319am {

    /* renamed from: a  reason: collision with root package name */
    protected final C1019Rl f7196a = new C1019Rl();

    /* renamed from: b  reason: collision with root package name */
    protected final C1390bm f7197b;

    public C0759Hl(Context context) {
        super(context);
        this.f7197b = new C1390bm(context, this);
    }

    public abstract void a();

    public abstract void a(float f2, float f3);

    public abstract void a(C0681El el);

    public void a(String str, String[] strArr) {
        setVideoPath(str);
    }

    public abstract void b();

    public abstract void b(int i);

    public abstract void c();

    public void c(int i) {
    }

    public abstract void d();

    public void d(int i) {
    }

    public abstract long e();

    public void e(int i) {
    }

    public abstract String f();

    public void f(int i) {
    }

    public abstract long g();

    public void g(int i) {
    }

    public abstract int getCurrentPosition();

    public abstract int getDuration();

    public abstract long getTotalBytes();

    public abstract int getVideoHeight();

    public abstract int getVideoWidth();

    public abstract int h();

    public abstract void setVideoPath(String str);
}
