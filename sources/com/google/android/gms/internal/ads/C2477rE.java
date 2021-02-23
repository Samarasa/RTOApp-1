package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import com.google.android.gms.common.util.e;
import java.io.IOException;
import java.io.StringWriter;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.rE  reason: case insensitive filesystem */
public final class C2477rE {

    /* renamed from: a  reason: collision with root package name */
    private final e f11940a;

    public C2477rE(e eVar) {
        this.f11940a = eVar;
    }

    public final void a(List<Object> list, String str, String str2, Object... objArr) {
        if (C0644Da.f6572a.a().booleanValue()) {
            long a2 = this.f11940a.a();
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            try {
                jsonWriter.beginObject();
                jsonWriter.name("timestamp").value(a2);
                jsonWriter.name("source").value(str);
                jsonWriter.name("event").value(str2);
                jsonWriter.name("components").beginArray();
                for (Object obj : list) {
                    jsonWriter.value(obj.toString());
                }
                jsonWriter.endArray();
                jsonWriter.name("params").beginArray();
                int length = objArr.length;
                for (int i = 0; i < length; i++) {
                    Object obj2 = objArr[i];
                    jsonWriter.value(obj2 != null ? obj2.toString() : null);
                }
                jsonWriter.endArray();
                jsonWriter.endObject();
                jsonWriter.flush();
                jsonWriter.close();
            } catch (IOException e2) {
                C1018Rk.b("unable to log", e2);
            }
            String valueOf = String.valueOf(stringWriter.toString());
            C1018Rk.c(valueOf.length() != 0 ? "AD-DBG ".concat(valueOf) : new String("AD-DBG "));
        }
    }
}
