package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.common.util.a;
import com.google.android.gms.common.util.j;
import com.google.firebase.remoteconfig.f;
import com.google.firebase.remoteconfig.g;
import com.google.firebase.remoteconfig.internal.h;
import com.google.firebase.remoteconfig.internal.l;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ConfigFetchHttpClient {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f14715a = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: b  reason: collision with root package name */
    private final Context f14716b;

    /* renamed from: c  reason: collision with root package name */
    private final String f14717c;

    /* renamed from: d  reason: collision with root package name */
    private final String f14718d;

    /* renamed from: e  reason: collision with root package name */
    private final String f14719e;

    /* renamed from: f  reason: collision with root package name */
    private final String f14720f;

    /* renamed from: g  reason: collision with root package name */
    private final long f14721g;

    /* renamed from: h  reason: collision with root package name */
    private final long f14722h;

    public ConfigFetchHttpClient(Context context, String str, String str2, String str3, long j, long j2) {
        this.f14716b = context;
        this.f14717c = str;
        this.f14718d = str2;
        this.f14719e = a(str);
        this.f14720f = str3;
        this.f14721g = j;
        this.f14722h = j2;
    }

    private static h a(JSONObject jSONObject, Date date) {
        JSONObject jSONObject2;
        try {
            h.a e2 = h.e();
            e2.a(date);
            JSONArray jSONArray = null;
            try {
                jSONObject2 = jSONObject.getJSONObject("entries");
            } catch (JSONException unused) {
                jSONObject2 = null;
            }
            if (jSONObject2 != null) {
                e2.a(jSONObject2);
            }
            try {
                jSONArray = jSONObject.getJSONArray("experimentDescriptions");
            } catch (JSONException unused2) {
            }
            if (jSONArray != null) {
                e2.a(jSONArray);
            }
            return e2.a();
        } catch (JSONException e3) {
            throw new f("Fetch failed: fetch response could not be parsed.", e3);
        }
    }

    private static String a(String str) {
        Matcher matcher = f14715a.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    private String a(String str, String str2) {
        return String.format("https://firebaseremoteconfig.googleapis.com/v1/projects/%s/namespaces/%s:fetch", new Object[]{str, str2});
    }

    private JSONObject a(String str, String str2, Map<String, String> map) {
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("appInstanceId", str);
            hashMap.put("appInstanceIdToken", str2);
            hashMap.put("appId", this.f14717c);
            Locale locale = this.f14716b.getResources().getConfiguration().locale;
            hashMap.put("countryCode", locale.getCountry());
            hashMap.put("languageCode", locale.toString());
            hashMap.put("platformVersion", Integer.toString(Build.VERSION.SDK_INT));
            hashMap.put("timeZone", TimeZone.getDefault().getID());
            try {
                PackageInfo packageInfo = this.f14716b.getPackageManager().getPackageInfo(this.f14716b.getPackageName(), 0);
                if (packageInfo != null) {
                    hashMap.put("appVersion", packageInfo.versionName);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            hashMap.put("packageName", this.f14716b.getPackageName());
            hashMap.put("sdkVersion", "19.1.0");
            hashMap.put("analyticsUserProperties", new JSONObject(map));
            return new JSONObject(hashMap);
        }
        throw new f("Fetch failed: Firebase instance id is null.");
    }

    private JSONObject a(URLConnection uRLConnection) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(uRLConnection.getInputStream(), "utf-8"));
        StringBuilder sb = new StringBuilder();
        while (true) {
            int read = bufferedReader.read();
            if (read == -1) {
                return new JSONObject(sb.toString());
            }
            sb.append((char) read);
        }
    }

    private void a(HttpURLConnection httpURLConnection) {
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.f14718d);
        httpURLConnection.setRequestProperty("X-Android-Package", this.f14716b.getPackageName());
        httpURLConnection.setRequestProperty("X-Android-Cert", b());
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
    }

    private void a(HttpURLConnection httpURLConnection, String str, Map<String, String> map) {
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setConnectTimeout((int) TimeUnit.SECONDS.toMillis(this.f14721g));
        httpURLConnection.setReadTimeout((int) TimeUnit.SECONDS.toMillis(this.f14722h));
        httpURLConnection.setRequestProperty("If-None-Match", str);
        a(httpURLConnection);
        a(httpURLConnection, map);
    }

    private void a(HttpURLConnection httpURLConnection, Map<String, String> map) {
        for (Map.Entry next : map.entrySet()) {
            httpURLConnection.setRequestProperty((String) next.getKey(), (String) next.getValue());
        }
    }

    private void a(HttpURLConnection httpURLConnection, byte[] bArr) {
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    private boolean a(JSONObject jSONObject) {
        try {
            return !jSONObject.get("state").equals("NO_CHANGE");
        } catch (JSONException unused) {
            return true;
        }
    }

    private String b() {
        try {
            byte[] a2 = a.a(this.f14716b, this.f14716b.getPackageName());
            if (a2 != null) {
                return j.a(a2, false);
            }
            Log.e("FirebaseRemoteConfig", "Could not get fingerprint hash for package: " + this.f14716b.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("FirebaseRemoteConfig", "No such package: " + this.f14716b.getPackageName(), e2);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public HttpURLConnection a() {
        try {
            return (HttpURLConnection) new URL(a(this.f14719e, this.f14720f)).openConnection();
        } catch (IOException e2) {
            throw new g(e2.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    @Keep
    public l.a fetch(HttpURLConnection httpURLConnection, String str, String str2, Map<String, String> map, String str3, Map<String, String> map2, Date date) {
        a(httpURLConnection, str3, map2);
        try {
            a(httpURLConnection, a(str, str2, map).toString().getBytes("utf-8"));
            httpURLConnection.connect();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                String headerField = httpURLConnection.getHeaderField("ETag");
                JSONObject a2 = a((URLConnection) httpURLConnection);
                httpURLConnection.disconnect();
                try {
                    httpURLConnection.getInputStream().close();
                } catch (IOException unused) {
                }
                return !a(a2) ? l.a.a(date) : l.a.a(a(a2, date), headerField);
            }
            throw new com.google.firebase.remoteconfig.j(responseCode, httpURLConnection.getResponseMessage());
        } catch (IOException | JSONException e2) {
            throw new f("The client had an error while calling the backend!", e2);
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            try {
                httpURLConnection.getInputStream().close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }
}
