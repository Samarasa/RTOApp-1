package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.util.JsonWriter;
import com.google.android.gms.common.util.c;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.h;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* renamed from: com.google.android.gms.internal.ads.Kk  reason: case insensitive filesystem */
public final class C0836Kk {

    /* renamed from: a  reason: collision with root package name */
    private static Object f7592a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static boolean f7593b = false;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f7594c = false;

    /* renamed from: d  reason: collision with root package name */
    private static e f7595d = h.d();

    /* renamed from: e  reason: collision with root package name */
    private static final Set<String> f7596e = new HashSet(Arrays.asList(new String[0]));

    /* renamed from: f  reason: collision with root package name */
    private final List<String> f7597f;

    public C0836Kk() {
        this((String) null);
    }

    public C0836Kk(String str) {
        List<String> list;
        if (!a()) {
            list = new ArrayList<>();
        } else {
            String[] strArr = new String[1];
            String valueOf = String.valueOf(UUID.randomUUID().toString());
            strArr[0] = valueOf.length() != 0 ? "network_request_".concat(valueOf) : new String("network_request_");
            list = Arrays.asList(strArr);
        }
        this.f7597f = list;
    }

    static final /* synthetic */ void a(int i, Map map, JsonWriter jsonWriter) {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("code").value((long) i);
        jsonWriter.endObject();
        a(jsonWriter, (Map<String, ?>) map);
        jsonWriter.endObject();
    }

    private static void a(JsonWriter jsonWriter, Map<String, ?> map) {
        if (map != null) {
            jsonWriter.name("headers").beginArray();
            Iterator<Map.Entry<String, ?>> it = map.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry next = it.next();
                String str = (String) next.getKey();
                if (!f7596e.contains(str)) {
                    if (!(next.getValue() instanceof List)) {
                        if (!(next.getValue() instanceof String)) {
                            C1018Rk.b("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                            break;
                        }
                        jsonWriter.beginObject();
                        jsonWriter.name("name").value(str);
                        jsonWriter.name("value").value((String) next.getValue());
                        jsonWriter.endObject();
                    } else {
                        for (String value : (List) next.getValue()) {
                            jsonWriter.beginObject();
                            jsonWriter.name("name").value(str);
                            jsonWriter.name("value").value(value);
                            jsonWriter.endObject();
                        }
                    }
                }
            }
            jsonWriter.endArray();
        }
    }

    static final /* synthetic */ void a(String str, JsonWriter jsonWriter) {
        jsonWriter.name("params").beginObject();
        if (str != null) {
            jsonWriter.name("error_description").value(str);
        }
        jsonWriter.endObject();
    }

    private final void a(String str, C1044Sk sk) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(f7595d.a());
            jsonWriter.name("event").value(str);
            jsonWriter.name("components").beginArray();
            for (String value : this.f7597f) {
                jsonWriter.value(value);
            }
            jsonWriter.endArray();
            sk.a(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e2) {
            C1018Rk.b("unable to log", e2);
        }
        c(stringWriter.toString());
    }

    static final /* synthetic */ void a(String str, String str2, Map map, byte[] bArr, JsonWriter jsonWriter) {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        jsonWriter.name("uri").value(str);
        jsonWriter.name("verb").value(str2);
        jsonWriter.endObject();
        a(jsonWriter, (Map<String, ?>) map);
        if (bArr != null) {
            jsonWriter.name("body").value(c.a(bArr));
        }
        jsonWriter.endObject();
    }

    public static void a(boolean z) {
        synchronized (f7592a) {
            f7593b = true;
            f7594c = z;
        }
    }

    static final /* synthetic */ void a(byte[] bArr, JsonWriter jsonWriter) {
        String str;
        jsonWriter.name("params").beginObject();
        int length = bArr.length;
        String a2 = c.a(bArr);
        if (length < 10000) {
            str = "body";
        } else {
            a2 = C0758Hk.a(a2);
            if (a2 != null) {
                str = "bodydigest";
            }
            jsonWriter.name("bodylength").value((long) length);
            jsonWriter.endObject();
        }
        jsonWriter.name(str).value(a2);
        jsonWriter.name("bodylength").value((long) length);
        jsonWriter.endObject();
    }

    public static boolean a() {
        boolean z;
        synchronized (f7592a) {
            z = f7593b && f7594c;
        }
        return z;
    }

    public static boolean a(Context context) {
        if (Build.VERSION.SDK_INT < 17 || !C2996ya.f12926a.a().booleanValue()) {
            return false;
        }
        try {
            return Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0;
        } catch (Exception e2) {
            C1018Rk.c("Fail to determine debug setting.", e2);
            return false;
        }
    }

    public static void b() {
        synchronized (f7592a) {
            f7593b = false;
            f7594c = false;
            C1018Rk.d("Ad debug logging enablement is out of date.");
        }
    }

    private final void b(String str) {
        a("onNetworkRequestError", (C1044Sk) new C0940Ok(str));
    }

    private final void b(String str, String str2, Map<String, ?> map, byte[] bArr) {
        a("onNetworkRequest", (C1044Sk) new C0914Nk(str, str2, map, bArr));
    }

    private final void b(Map<String, ?> map, int i) {
        a("onNetworkResponse", (C1044Sk) new C0888Mk(i, map));
    }

    private static synchronized void c(String str) {
        synchronized (C0836Kk.class) {
            C1018Rk.c("GMA Debug BEGIN");
            int i = 0;
            while (i < str.length()) {
                int i2 = i + 4000;
                String valueOf = String.valueOf(str.substring(i, Math.min(i2, str.length())));
                C1018Rk.c(valueOf.length() != 0 ? "GMA Debug CONTENT ".concat(valueOf) : new String("GMA Debug CONTENT "));
                i = i2;
            }
            C1018Rk.c("GMA Debug FINISH");
        }
    }

    public static boolean c() {
        boolean z;
        synchronized (f7592a) {
            z = f7593b;
        }
        return z;
    }

    public final void a(String str) {
        if (a() && str != null) {
            a(str.getBytes());
        }
    }

    public final void a(String str, String str2, Map<String, ?> map, byte[] bArr) {
        if (a()) {
            b(str, str2, map, bArr);
        }
    }

    public final void a(HttpURLConnection httpURLConnection, int i) {
        if (a()) {
            String str = null;
            b(httpURLConnection.getHeaderFields() == null ? null : new HashMap(httpURLConnection.getHeaderFields()), i);
            if (i < 200 || i >= 300) {
                try {
                    str = httpURLConnection.getResponseMessage();
                } catch (IOException e2) {
                    String valueOf = String.valueOf(e2.getMessage());
                    C1018Rk.d(valueOf.length() != 0 ? "Can not get error message from error HttpURLConnection\n".concat(valueOf) : new String("Can not get error message from error HttpURLConnection\n"));
                }
                b(str);
            }
        }
    }

    public final void a(HttpURLConnection httpURLConnection, byte[] bArr) {
        if (a()) {
            b(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), httpURLConnection.getRequestProperties() == null ? null : new HashMap(httpURLConnection.getRequestProperties()), bArr);
        }
    }

    public final void a(Map<String, ?> map, int i) {
        if (a()) {
            b(map, i);
            if (i < 200 || i >= 300) {
                b((String) null);
            }
        }
    }

    public final void a(byte[] bArr) {
        a("onNetworkResponseBody", (C1044Sk) new C0966Pk(bArr));
    }
}
