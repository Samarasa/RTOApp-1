package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class LifecycleCallback {

    /* renamed from: a  reason: collision with root package name */
    protected final C0528h f5815a;

    protected LifecycleCallback(C0528h hVar) {
        this.f5815a = hVar;
    }

    public static C0528h a(Activity activity) {
        return a(new C0527g(activity));
    }

    protected static C0528h a(C0527g gVar) {
        if (gVar.c()) {
            return X.a(gVar.b());
        }
        if (gVar.d()) {
            return W.a(gVar.a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    @Keep
    private static C0528h getChimeraLifecycleFragmentImpl(C0527g gVar) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    public void a() {
    }

    public void a(int i, int i2, Intent intent) {
    }

    public void a(Bundle bundle) {
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public void b() {
    }

    public void b(Bundle bundle) {
    }

    public void c() {
    }

    public void d() {
    }
}
