package com.google.firebase.iid;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* renamed from: com.google.firebase.iid.x  reason: case insensitive filesystem */
final class C3336x implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final long f14613a;

    /* renamed from: b  reason: collision with root package name */
    private final PowerManager.WakeLock f14614b = ((PowerManager) a().getSystemService("power")).newWakeLock(1, "fiid-sync");

    /* renamed from: c  reason: collision with root package name */
    private final FirebaseInstanceId f14615c;

    /* renamed from: d  reason: collision with root package name */
    private final C3338z f14616d;

    C3336x(FirebaseInstanceId firebaseInstanceId, C3324k kVar, C3338z zVar, long j) {
        this.f14615c = firebaseInstanceId;
        this.f14616d = zVar;
        this.f14613a = j;
        this.f14614b.setReferenceCounted(false);
    }

    private final boolean c() {
        String str;
        C3333u e2 = this.f14615c.e();
        if (!this.f14615c.a(e2)) {
            return true;
        }
        try {
            String f2 = this.f14615c.f();
            if (f2 == null) {
                Log.e("FirebaseInstanceId", "Token retrieval failed: null");
                return false;
            }
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "Token successfully retrieved");
            }
            if ((e2 == null || (e2 != null && !f2.equals(e2.f14605b))) && "[DEFAULT]".equals(this.f14615c.d().d())) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String valueOf = String.valueOf(this.f14615c.d().d());
                    Log.d("FirebaseInstanceId", valueOf.length() != 0 ? "Invoking onNewToken for app: ".concat(valueOf) : new String("Invoking onNewToken for app: "));
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", f2);
                Context a2 = a();
                Intent intent2 = new Intent(a2, FirebaseInstanceIdReceiver.class);
                intent2.setAction("com.google.firebase.MESSAGING_EVENT");
                intent2.putExtra("wrapped_intent", intent);
                a2.sendBroadcast(intent2);
            }
            return true;
        } catch (IOException e3) {
            if ("SERVICE_NOT_AVAILABLE".equals(e3.getMessage()) || "INTERNAL_SERVER_ERROR".equals(e3.getMessage())) {
                str = "Token retrieval failed without exception message. Will retry token retrieval";
                Log.w("FirebaseInstanceId", str);
                return false;
            } else if (e3.getMessage() == null) {
                String message = e3.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 52);
                sb.append("Token retrieval failed: ");
                sb.append(message);
                sb.append(". Will retry token retrieval");
                str = sb.toString();
                Log.w("FirebaseInstanceId", str);
                return false;
            } else {
                throw e3;
            }
        } catch (SecurityException unused) {
            str = "Token retrieval failed with SecurityException. Will retry token retrieval";
            Log.w("FirebaseInstanceId", str);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final Context a() {
        return this.f14615c.d().b();
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        ConnectivityManager connectivityManager = (ConnectivityManager) a().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @SuppressLint({"Wakelock"})
    public final void run() {
        if (C3331s.a().a(a())) {
            this.f14614b.acquire();
        }
        try {
            this.f14615c.a(true);
            if (!this.f14615c.i()) {
                this.f14615c.a(false);
                if (C3331s.a().a(a())) {
                    this.f14614b.release();
                }
            } else if (!C3331s.a().b(a()) || b()) {
                if (!c() || !this.f14616d.a(this.f14615c)) {
                    this.f14615c.a(this.f14613a);
                } else {
                    this.f14615c.a(false);
                }
                if (!C3331s.a().a(a())) {
                    return;
                }
                this.f14614b.release();
            } else {
                new C3335w(this).a();
                if (C3331s.a().a(a())) {
                    this.f14614b.release();
                }
            }
        } catch (IOException e2) {
            String message = e2.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 93);
            sb.append("Topic sync or token retrieval failed on hard failure exceptions: ");
            sb.append(message);
            sb.append(". Won't retry the operation.");
            Log.e("FirebaseInstanceId", sb.toString());
            this.f14615c.a(false);
            if (!C3331s.a().a(a())) {
            }
        } catch (Throwable th) {
            if (C3331s.a().a(a())) {
                this.f14614b.release();
            }
            throw th;
        }
    }
}
