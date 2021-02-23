package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import b.e.b;
import b.h.a.a;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.io.File;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.google.firebase.iid.v  reason: case insensitive filesystem */
final class C3334v {

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f14608a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f14609b;

    /* renamed from: c  reason: collision with root package name */
    private final W f14610c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, Y> f14611d;

    public C3334v(Context context) {
        this(context, new W());
    }

    private C3334v(Context context, W w) {
        this.f14611d = new b();
        this.f14609b = context;
        this.f14608a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f14610c = w;
        File file = new File(a.b(this.f14609b), "com.google.android.gms.appid-no-backup");
        if (!file.exists()) {
            try {
                if (file.createNewFile() && !c()) {
                    Log.i("FirebaseInstanceId", "App restored, clearing state");
                    b();
                    FirebaseInstanceId.b().h();
                }
            } catch (IOException e2) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String valueOf = String.valueOf(e2.getMessage());
                    Log.d("FirebaseInstanceId", valueOf.length() != 0 ? "Error creating file in no backup dir: ".concat(valueOf) : new String("Error creating file in no backup dir: "));
                }
            }
        }
    }

    static String a(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("|S|");
        sb.append(str2);
        return sb.toString();
    }

    private static String b(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 4 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append("|T|");
        sb.append(str2);
        sb.append("|");
        sb.append(str3);
        return sb.toString();
    }

    private final synchronized boolean c() {
        return this.f14608a.getAll().isEmpty();
    }

    public final synchronized C3333u a(String str, String str2, String str3) {
        return C3333u.a(this.f14608a.getString(b(str, str2, str3), (String) null));
    }

    public final synchronized String a() {
        return this.f14608a.getString("topic_operation_queue", BuildConfig.FLAVOR);
    }

    public final synchronized void a(String str) {
        this.f14608a.edit().putString("topic_operation_queue", str).apply();
    }

    public final synchronized void a(String str, String str2, String str3, String str4, String str5) {
        String a2 = C3333u.a(str4, str5, System.currentTimeMillis());
        if (a2 != null) {
            SharedPreferences.Editor edit = this.f14608a.edit();
            edit.putString(b(str, str2, str3), a2);
            edit.commit();
        }
    }

    public final synchronized Y b(String str) {
        Y y;
        Y y2 = this.f14611d.get(str);
        if (y2 != null) {
            return y2;
        }
        try {
            y = this.f14610c.a(this.f14609b, str);
        } catch (Z unused) {
            Log.w("FirebaseInstanceId", "Stored data is corrupt, generating new identity");
            FirebaseInstanceId.b().h();
            y = this.f14610c.b(this.f14609b, str);
        }
        this.f14611d.put(str, y);
        return y;
    }

    public final synchronized void b() {
        this.f14611d.clear();
        W.a(this.f14609b);
        this.f14608a.edit().clear().commit();
    }

    public final synchronized void c(String str) {
        String concat = String.valueOf(str).concat("|T|");
        SharedPreferences.Editor edit = this.f14608a.edit();
        for (String next : this.f14608a.getAll().keySet()) {
            if (next.startsWith(concat)) {
                edit.remove(next);
            }
        }
        edit.commit();
    }
}
