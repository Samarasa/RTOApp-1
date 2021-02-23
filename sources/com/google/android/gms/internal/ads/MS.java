package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.google.android.gms.ads.internal.util.M;
import com.google.android.gms.common.util.k;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

public final class MS {

    /* renamed from: a  reason: collision with root package name */
    public final List<C2988yS> f7843a;

    /* renamed from: b  reason: collision with root package name */
    public final DS f7844b;

    /* renamed from: c  reason: collision with root package name */
    public final List<LS> f7845c;

    private MS(JsonReader jsonReader) {
        List<C2988yS> emptyList = Collections.emptyList();
        ArrayList arrayList = new ArrayList();
        jsonReader.beginObject();
        DS ds = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if ("responses".equals(nextName)) {
                jsonReader.beginArray();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if ("ad_configs".equals(nextName2)) {
                        emptyList = new ArrayList<>();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            emptyList.add(new C2988yS(jsonReader));
                        }
                        jsonReader.endArray();
                    } else if (nextName2.equals("common")) {
                        ds = new DS(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
            } else if (nextName.equals("actions")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginObject();
                    String str = null;
                    Map<String, String> map = null;
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        if ("name".equals(nextName3)) {
                            str = jsonReader.nextString();
                        } else if ("info".equals(nextName3)) {
                            map = M.b(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    if (str != null) {
                        arrayList.add(new LS(str, map));
                    }
                    jsonReader.endObject();
                }
            }
            jsonReader.endArray();
        }
        this.f7845c = arrayList;
        this.f7843a = emptyList;
        this.f7844b = ds == null ? new DS(new JsonReader(new StringReader("{}"))) : ds;
    }

    public static MS a(Reader reader) {
        try {
            MS ms = new MS(new JsonReader(reader));
            k.a(reader);
            return ms;
        } catch (IOException | AssertionError | IllegalStateException | NumberFormatException | JSONException e2) {
            throw new CS("unable to parse ServerResponse", e2);
        } catch (Throwable th) {
            k.a(reader);
            throw th;
        }
    }
}
