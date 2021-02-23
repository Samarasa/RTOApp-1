package com.google.android.gms.measurement.internal;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import b.h.a.a;
import com.google.android.gms.common.util.e;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.measurement.internal.i  reason: case insensitive filesystem */
public final class C3159i extends C3249zc {

    /* renamed from: c  reason: collision with root package name */
    private long f13599c;

    /* renamed from: d  reason: collision with root package name */
    private String f13600d;

    /* renamed from: e  reason: collision with root package name */
    private Boolean f13601e;

    /* renamed from: f  reason: collision with root package name */
    private AccountManager f13602f;

    /* renamed from: g  reason: collision with root package name */
    private Boolean f13603g;

    /* renamed from: h  reason: collision with root package name */
    private long f13604h;

    C3159i(C3144fc fcVar) {
        super(fcVar);
    }

    public final boolean a(Context context) {
        if (this.f13601e == null) {
            i();
            this.f13601e = false;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    packageManager.getPackageInfo("com.google.android.gms", 128);
                    this.f13601e = true;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return this.f13601e.booleanValue();
    }

    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    public final /* bridge */ /* synthetic */ C3159i d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ C3248zb e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ Context f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ Zb g() {
        return super.g();
    }

    public final /* bridge */ /* synthetic */ Bb h() {
        return super.h();
    }

    public final /* bridge */ /* synthetic */ He i() {
        return super.i();
    }

    public final /* bridge */ /* synthetic */ e j() {
        return super.j();
    }

    public final /* bridge */ /* synthetic */ se k() {
        return super.k();
    }

    public final /* bridge */ /* synthetic */ Lb l() {
        return super.l();
    }

    public final /* bridge */ /* synthetic */ Ie m() {
        return super.m();
    }

    /* access modifiers changed from: protected */
    public final boolean r() {
        Calendar instance = Calendar.getInstance();
        this.f13599c = TimeUnit.MINUTES.convert((long) (instance.get(15) + instance.get(16)), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String lowerCase = locale.getLanguage().toLowerCase(Locale.ENGLISH);
        String lowerCase2 = locale.getCountry().toLowerCase(Locale.ENGLISH);
        StringBuilder sb = new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length());
        sb.append(lowerCase);
        sb.append("-");
        sb.append(lowerCase2);
        this.f13600d = sb.toString();
        return false;
    }

    public final long t() {
        o();
        return this.f13599c;
    }

    public final String u() {
        o();
        return this.f13600d;
    }

    /* access modifiers changed from: package-private */
    public final long v() {
        c();
        return this.f13604h;
    }

    /* access modifiers changed from: package-private */
    public final void w() {
        c();
        this.f13603g = null;
        this.f13604h = 0;
    }

    /* access modifiers changed from: package-private */
    public final boolean x() {
        c();
        long a2 = j().a();
        if (a2 - this.f13604h > 86400000) {
            this.f13603g = null;
        }
        Boolean bool = this.f13603g;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (a.a(f(), "android.permission.GET_ACCOUNTS") != 0) {
            h().x().a("Permission error checking for dasher/unicorn accounts");
        } else {
            if (this.f13602f == null) {
                this.f13602f = AccountManager.get(f());
            }
            try {
                Account[] result = this.f13602f.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, (AccountManagerCallback) null, (Handler) null).getResult();
                if (result == null || result.length <= 0) {
                    Account[] result2 = this.f13602f.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, (AccountManagerCallback) null, (Handler) null).getResult();
                    if (result2 != null && result2.length > 0) {
                        this.f13603g = true;
                        this.f13604h = a2;
                        return true;
                    }
                } else {
                    this.f13603g = true;
                    this.f13604h = a2;
                    return true;
                }
            } catch (AuthenticatorException | OperationCanceledException | IOException e2) {
                h().u().a("Exception checking account types", e2);
            }
        }
        this.f13604h = a2;
        this.f13603g = false;
        return false;
    }
}
