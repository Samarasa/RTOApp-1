package com.google.android.gms.ads;

import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class t {

    /* renamed from: a  reason: collision with root package name */
    public static final List<String> f5718a = Arrays.asList(new String[]{"MA", "T", "PG", "G"});

    /* renamed from: b  reason: collision with root package name */
    private final int f5719b;

    /* renamed from: c  reason: collision with root package name */
    private final int f5720c;

    /* renamed from: d  reason: collision with root package name */
    private final String f5721d;

    /* renamed from: e  reason: collision with root package name */
    private final List<String> f5722e;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private int f5723a = -1;

        /* renamed from: b  reason: collision with root package name */
        private int f5724b = -1;

        /* renamed from: c  reason: collision with root package name */
        private String f5725c = null;

        /* renamed from: d  reason: collision with root package name */
        private final List<String> f5726d = new ArrayList();

        public t a() {
            return new t(this.f5723a, this.f5724b, this.f5725c, this.f5726d);
        }
    }

    private t(int i, int i2, String str, List<String> list) {
        this.f5719b = i;
        this.f5720c = i2;
        this.f5721d = str;
        this.f5722e = list;
    }

    public String a() {
        String str = this.f5721d;
        return str == null ? BuildConfig.FLAVOR : str;
    }

    public int b() {
        return this.f5719b;
    }

    public int c() {
        return this.f5720c;
    }

    public List<String> d() {
        return new ArrayList(this.f5722e);
    }
}
