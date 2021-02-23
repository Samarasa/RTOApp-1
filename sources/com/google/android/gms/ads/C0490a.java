package com.google.android.gms.ads;

import android.os.IBinder;
import com.google.android.gms.internal.ads.C1824hqa;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.ads.a  reason: case insensitive filesystem */
public class C0490a {

    /* renamed from: a  reason: collision with root package name */
    private final int f5347a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5348b;

    /* renamed from: c  reason: collision with root package name */
    private final String f5349c;

    /* renamed from: d  reason: collision with root package name */
    private final C0490a f5350d;

    public C0490a(int i, String str, String str2) {
        this.f5347a = i;
        this.f5348b = str;
        this.f5349c = str2;
        this.f5350d = null;
    }

    public C0490a(int i, String str, String str2, C0490a aVar) {
        this.f5347a = i;
        this.f5348b = str;
        this.f5349c = str2;
        this.f5350d = aVar;
    }

    public int a() {
        return this.f5347a;
    }

    public String b() {
        return this.f5349c;
    }

    public String c() {
        return this.f5348b;
    }

    public final C1824hqa d() {
        C0490a aVar = this.f5350d;
        return new C1824hqa(this.f5347a, this.f5348b, this.f5349c, aVar == null ? null : new C1824hqa(aVar.f5347a, aVar.f5348b, aVar.f5349c, (C1824hqa) null, (IBinder) null), (IBinder) null);
    }

    public JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Code", this.f5347a);
        jSONObject.put("Message", this.f5348b);
        jSONObject.put("Domain", this.f5349c);
        C0490a aVar = this.f5350d;
        jSONObject.put("Cause", aVar == null ? "null" : aVar.e());
        return jSONObject;
    }

    public String toString() {
        try {
            return e().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
