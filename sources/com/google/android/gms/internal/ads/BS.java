package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.util.ArrayList;
import java.util.List;

public final class BS {

    /* renamed from: a  reason: collision with root package name */
    public final int f6284a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6285b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f6286c;

    public BS(int i, int i2, boolean z) {
        this.f6284a = i;
        this.f6285b = i2;
        this.f6286c = z;
    }

    static List<BS> a(JsonReader jsonReader) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            jsonReader.beginObject();
            int i = 0;
            int i2 = 0;
            boolean z = false;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if ("width".equals(nextName)) {
                    i = jsonReader.nextInt();
                } else if ("height".equals(nextName)) {
                    i2 = jsonReader.nextInt();
                } else if ("is_fluid_height".equals(nextName)) {
                    z = jsonReader.nextBoolean();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            arrayList.add(new BS(i, i2, z));
        }
        jsonReader.endArray();
        return arrayList;
    }
}
