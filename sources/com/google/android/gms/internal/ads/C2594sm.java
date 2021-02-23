package com.google.android.gms.internal.ads;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* renamed from: com.google.android.gms.internal.ads.sm  reason: case insensitive filesystem */
public final class C2594sm {
    private static long a(String str) {
        try {
            return b("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e2) {
            if ("0".equals(str) || "-1".equals(str)) {
                C0936Og.c("Unable to parse dateStr: %s, falling back to 0", str);
                return 0;
            }
            C0936Og.a(e2, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0;
        }
    }

    public static C3019yla a(Ara ara) {
        boolean z;
        long j;
        long j2;
        long j3;
        long j4;
        Ara ara2 = ara;
        long currentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = ara2.f6213c;
        if (map == null) {
            return null;
        }
        String str = map.get("Date");
        long a2 = str != null ? a(str) : 0;
        String str2 = map.get("Cache-Control");
        int i = 0;
        if (str2 != null) {
            String[] split = str2.split(",", 0);
            j2 = 0;
            int i2 = 0;
            j = 0;
            while (i < split.length) {
                String trim = split[i].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j2 = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    i2 = 1;
                }
                i++;
            }
            i = i2;
            z = true;
        } else {
            j2 = 0;
            j = 0;
            z = false;
        }
        String str3 = map.get("Expires");
        long a3 = str3 != null ? a(str3) : 0;
        String str4 = map.get("Last-Modified");
        long a4 = str4 != null ? a(str4) : 0;
        String str5 = map.get("ETag");
        if (z) {
            j4 = currentTimeMillis + (j2 * 1000);
            if (i == 0) {
                Long.signum(j);
                j3 = (j * 1000) + j4;
                C3019yla yla = new C3019yla();
                yla.f12970a = ara2.f6212b;
                yla.f12971b = str5;
                yla.f12975f = j4;
                yla.f12974e = j3;
                yla.f12972c = a2;
                yla.f12973d = a4;
                yla.f12976g = map;
                yla.f12977h = ara2.f6214d;
                return yla;
            }
        } else if (a2 <= 0 || a3 < a2) {
            j4 = 0;
        } else {
            j3 = (a3 - a2) + currentTimeMillis;
            j4 = j3;
            C3019yla yla2 = new C3019yla();
            yla2.f12970a = ara2.f6212b;
            yla2.f12971b = str5;
            yla2.f12975f = j4;
            yla2.f12974e = j3;
            yla2.f12972c = a2;
            yla2.f12973d = a4;
            yla2.f12976g = map;
            yla2.f12977h = ara2.f6214d;
            return yla2;
        }
        j3 = j4;
        C3019yla yla22 = new C3019yla();
        yla22.f12970a = ara2.f6212b;
        yla22.f12971b = str5;
        yla22.f12975f = j4;
        yla22.f12974e = j3;
        yla22.f12972c = a2;
        yla22.f12973d = a4;
        yla22.f12976g = map;
        yla22.f12977h = ara2.f6214d;
        return yla22;
    }

    static String a(long j) {
        return b("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j));
    }

    private static SimpleDateFormat b(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}
