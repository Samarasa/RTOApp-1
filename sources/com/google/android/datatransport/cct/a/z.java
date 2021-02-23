package com.google.android.datatransport.cct.a;

import android.util.SparseArray;
import com.google.android.datatransport.cct.a.o;

public abstract class z {

    public static abstract class a {
        public abstract a a(b bVar);

        public abstract a a(c cVar);

        public abstract z a();
    }

    public enum b {
        UNKNOWN_MOBILE_SUBTYPE(0),
        GPRS(1),
        EDGE(2),
        UMTS(3),
        CDMA(4),
        EVDO_0(5),
        EVDO_A(6),
        RTT(7),
        HSDPA(8),
        HSUPA(9),
        HSPA(10),
        IDEN(11),
        EVDO_B(12),
        LTE(13),
        EHRPD(14),
        HSPAP(15),
        GSM(16),
        TD_SCDMA(17),
        IWLAN(18),
        LTE_CA(19),
        COMBINED(100);
        
        private static final SparseArray<b> v = null;
        private final int w;

        static {
            UNKNOWN_MOBILE_SUBTYPE = new b("UNKNOWN_MOBILE_SUBTYPE", 0, 0);
            GPRS = new b("GPRS", 1, 1);
            EDGE = new b("EDGE", 2, 2);
            UMTS = new b("UMTS", 3, 3);
            CDMA = new b("CDMA", 4, 4);
            EVDO_0 = new b("EVDO_0", 5, 5);
            EVDO_A = new b("EVDO_A", 6, 6);
            RTT = new b("RTT", 7, 7);
            HSDPA = new b("HSDPA", 8, 8);
            HSUPA = new b("HSUPA", 9, 9);
            HSPA = new b("HSPA", 10, 10);
            IDEN = new b("IDEN", 11, 11);
            EVDO_B = new b("EVDO_B", 12, 12);
            LTE = new b("LTE", 13, 13);
            EHRPD = new b("EHRPD", 14, 14);
            HSPAP = new b("HSPAP", 15, 15);
            GSM = new b("GSM", 16, 16);
            TD_SCDMA = new b("TD_SCDMA", 17, 17);
            IWLAN = new b("IWLAN", 18, 18);
            LTE_CA = new b("LTE_CA", 19, 19);
            COMBINED = new b("COMBINED", 20, 100);
            b[] bVarArr = {UNKNOWN_MOBILE_SUBTYPE, GPRS, EDGE, UMTS, CDMA, EVDO_0, EVDO_A, RTT, HSDPA, HSUPA, HSPA, IDEN, EVDO_B, LTE, EHRPD, HSPAP, GSM, TD_SCDMA, IWLAN, LTE_CA, COMBINED};
            v = new SparseArray<>();
            v.put(0, UNKNOWN_MOBILE_SUBTYPE);
            v.put(1, GPRS);
            v.put(2, EDGE);
            v.put(3, UMTS);
            v.put(4, CDMA);
            v.put(5, EVDO_0);
            v.put(6, EVDO_A);
            v.put(7, RTT);
            v.put(8, HSDPA);
            v.put(9, HSUPA);
            v.put(10, HSPA);
            v.put(11, IDEN);
            v.put(12, EVDO_B);
            v.put(13, LTE);
            v.put(14, EHRPD);
            v.put(15, HSPAP);
            v.put(16, GSM);
            v.put(17, TD_SCDMA);
            v.put(18, IWLAN);
            v.put(19, LTE_CA);
        }

        private b(int i) {
            this.w = i;
        }

        public static b a(int i) {
            return v.get(i);
        }

        public int a() {
            return this.w;
        }
    }

    public enum c {
        MOBILE(0),
        WIFI(1),
        MOBILE_MMS(2),
        MOBILE_SUPL(3),
        MOBILE_DUN(4),
        MOBILE_HIPRI(5),
        WIMAX(6),
        BLUETOOTH(7),
        DUMMY(8),
        ETHERNET(9),
        MOBILE_FOTA(10),
        MOBILE_IMS(11),
        MOBILE_CBS(12),
        WIFI_P2P(13),
        MOBILE_IA(14),
        MOBILE_EMERGENCY(15),
        PROXY(16),
        VPN(17),
        NONE(-1);
        
        private static final SparseArray<c> t = null;
        private final int u;

        static {
            MOBILE = new c("MOBILE", 0, 0);
            WIFI = new c("WIFI", 1, 1);
            MOBILE_MMS = new c("MOBILE_MMS", 2, 2);
            MOBILE_SUPL = new c("MOBILE_SUPL", 3, 3);
            MOBILE_DUN = new c("MOBILE_DUN", 4, 4);
            MOBILE_HIPRI = new c("MOBILE_HIPRI", 5, 5);
            WIMAX = new c("WIMAX", 6, 6);
            BLUETOOTH = new c("BLUETOOTH", 7, 7);
            DUMMY = new c("DUMMY", 8, 8);
            ETHERNET = new c("ETHERNET", 9, 9);
            MOBILE_FOTA = new c("MOBILE_FOTA", 10, 10);
            MOBILE_IMS = new c("MOBILE_IMS", 11, 11);
            MOBILE_CBS = new c("MOBILE_CBS", 12, 12);
            WIFI_P2P = new c("WIFI_P2P", 13, 13);
            MOBILE_IA = new c("MOBILE_IA", 14, 14);
            MOBILE_EMERGENCY = new c("MOBILE_EMERGENCY", 15, 15);
            PROXY = new c("PROXY", 16, 16);
            VPN = new c("VPN", 17, 17);
            NONE = new c("NONE", 18, -1);
            c[] cVarArr = {MOBILE, WIFI, MOBILE_MMS, MOBILE_SUPL, MOBILE_DUN, MOBILE_HIPRI, WIMAX, BLUETOOTH, DUMMY, ETHERNET, MOBILE_FOTA, MOBILE_IMS, MOBILE_CBS, WIFI_P2P, MOBILE_IA, MOBILE_EMERGENCY, PROXY, VPN, NONE};
            t = new SparseArray<>();
            t.put(0, MOBILE);
            t.put(1, WIFI);
            t.put(2, MOBILE_MMS);
            t.put(3, MOBILE_SUPL);
            t.put(4, MOBILE_DUN);
            t.put(5, MOBILE_HIPRI);
            t.put(6, WIMAX);
            t.put(7, BLUETOOTH);
            t.put(8, DUMMY);
            t.put(9, ETHERNET);
            t.put(10, MOBILE_FOTA);
            t.put(11, MOBILE_IMS);
            t.put(12, MOBILE_CBS);
            t.put(13, WIFI_P2P);
            t.put(14, MOBILE_IA);
            t.put(15, MOBILE_EMERGENCY);
            t.put(16, PROXY);
            t.put(17, VPN);
            t.put(-1, NONE);
        }

        private c(int i) {
            this.u = i;
        }

        public static c a(int i) {
            return t.get(i);
        }

        public int a() {
            return this.u;
        }
    }

    public static a a() {
        return new o.a();
    }
}
