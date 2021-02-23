package com.google.firebase.remoteconfig.internal;

import java.util.Date;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class h {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final Date f14736a = new Date(0);

    /* renamed from: b  reason: collision with root package name */
    private JSONObject f14737b;

    /* renamed from: c  reason: collision with root package name */
    private JSONObject f14738c;

    /* renamed from: d  reason: collision with root package name */
    private Date f14739d;

    /* renamed from: e  reason: collision with root package name */
    private JSONArray f14740e;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private JSONObject f14741a;

        /* renamed from: b  reason: collision with root package name */
        private Date f14742b;

        /* renamed from: c  reason: collision with root package name */
        private JSONArray f14743c;

        private a() {
            this.f14741a = new JSONObject();
            this.f14742b = h.f14736a;
            this.f14743c = new JSONArray();
        }

        public a a(Date date) {
            this.f14742b = date;
            return this;
        }

        public a a(Map<String, String> map) {
            this.f14741a = new JSONObject(map);
            return this;
        }

        public a a(JSONArray jSONArray) {
            try {
                this.f14743c = new JSONArray(jSONArray.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public a a(JSONObject jSONObject) {
            try {
                this.f14741a = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public h a() {
            return new h(this.f14741a, this.f14742b, this.f14743c);
        }
    }

    private h(JSONObject jSONObject, Date date, JSONArray jSONArray) {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("configs_key", jSONObject);
        jSONObject2.put("fetch_time_key", date.getTime());
        jSONObject2.put("abt_experiments_key", jSONArray);
        this.f14738c = jSONObject;
        this.f14739d = date;
        this.f14740e = jSONArray;
        this.f14737b = jSONObject2;
    }

    static h a(JSONObject jSONObject) {
        return new h(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"));
    }

    public static a e() {
        return new a();
    }

    public JSONArray b() {
        return this.f14740e;
    }

    public JSONObject c() {
        return this.f14738c;
    }

    public Date d() {
        return this.f14739d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        return this.f14737b.toString().equals(((h) obj).toString());
    }

    public int hashCode() {
        return this.f14737b.hashCode();
    }

    public String toString() {
        return this.f14737b.toString();
    }
}
