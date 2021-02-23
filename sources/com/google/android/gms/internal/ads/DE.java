package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.b.a;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.fa;
import java.util.Collections;
import java.util.List;

public final class DE implements a, C2608su, C2963xu, C0872Lu, C0950Ou, C1900iv, C0795Iv, C1290aV, C1540dqa {

    /* renamed from: a  reason: collision with root package name */
    private final List<Object> f6507a;

    /* renamed from: b  reason: collision with root package name */
    private final C2477rE f6508b;

    /* renamed from: c  reason: collision with root package name */
    private long f6509c;

    public DE(C2477rE rEVar, C0710Fo fo) {
        this.f6508b = rEVar;
        this.f6507a = Collections.singletonList(fo);
    }

    private final void a(Class<?> cls, String str, Object... objArr) {
        C2477rE rEVar = this.f6508b;
        List<Object> list = this.f6507a;
        String valueOf = String.valueOf(cls.getSimpleName());
        rEVar.a(list, valueOf.length() != 0 ? "Event-".concat(valueOf) : new String("Event-"), str, objArr);
    }

    public final void H() {
        long b2 = p.j().b() - this.f6509c;
        StringBuilder sb = new StringBuilder(41);
        sb.append("Ad Request Latency : ");
        sb.append(b2);
        fa.f(sb.toString());
        a((Class<?>) C1900iv.class, "onAdLoaded", new Object[0]);
    }

    public final void I() {
        a((Class<?>) C0872Lu.class, "onAdImpression", new Object[0]);
    }

    public final void K() {
        a((Class<?>) C2608su.class, "onRewardedVideoStarted", new Object[0]);
    }

    public final void L() {
        a((Class<?>) C2608su.class, "onRewardedVideoCompleted", new Object[0]);
    }

    public final void M() {
        a((Class<?>) C2608su.class, "onAdOpened", new Object[0]);
    }

    public final void N() {
        a((Class<?>) C2608su.class, "onAdLeftApplication", new Object[0]);
    }

    public final void O() {
        a((Class<?>) C2608su.class, "onAdClosed", new Object[0]);
    }

    public final void a(C0886Mi mi, String str, String str2) {
        a((Class<?>) C2608su.class, "onRewarded", mi, str, str2);
    }

    public final void a(OS os) {
    }

    public final void a(SU su, String str) {
        a((Class<?>) TU.class, "onTaskCreated", str);
    }

    public final void a(SU su, String str, Throwable th) {
        a((Class<?>) TU.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    public final void a(C1824hqa hqa) {
        a((Class<?>) C2963xu.class, "onAdFailedToLoad", Integer.valueOf(hqa.f10744a), hqa.f10745b, hqa.f10746c);
    }

    public final void a(C2515ri riVar) {
        this.f6509c = p.j().b();
        a((Class<?>) C0795Iv.class, "onAdRequest", new Object[0]);
    }

    public final void a(String str, String str2) {
        a((Class<?>) a.class, "onAppEvent", str, str2);
    }

    public final void b(Context context) {
        a((Class<?>) C0950Ou.class, "onResume", context);
    }

    public final void b(SU su, String str) {
        a((Class<?>) TU.class, "onTaskStarted", str);
    }

    public final void c(Context context) {
        a((Class<?>) C0950Ou.class, "onDestroy", context);
    }

    public final void c(SU su, String str) {
        a((Class<?>) TU.class, "onTaskSucceeded", str);
    }

    public final void d(Context context) {
        a((Class<?>) C0950Ou.class, "onPause", context);
    }

    public final void onAdClicked() {
        a((Class<?>) C1540dqa.class, "onAdClicked", new Object[0]);
    }
}
