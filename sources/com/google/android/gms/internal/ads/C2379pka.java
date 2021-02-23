package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.pka  reason: case insensitive filesystem */
class C2379pka {
    public static final int A = Tma.c("sidx");
    public static final int Aa = Tma.c("udta");
    public static final int B = Tma.c("moov");
    public static final int Ba = Tma.c("meta");
    public static final int C = Tma.c("mvhd");
    public static final int Ca = Tma.c("ilst");
    public static final int D = Tma.c("trak");
    public static final int Da = Tma.c("mean");
    public static final int E = Tma.c("mdia");
    public static final int Ea = Tma.c("name");
    public static final int F = Tma.c("minf");
    public static final int Fa = Tma.c("data");
    public static final int G = Tma.c("stbl");
    public static final int Ga = Tma.c("emsg");
    public static final int H = Tma.c("avcC");
    public static final int Ha = Tma.c("st3d");
    public static final int I = Tma.c("hvcC");
    public static final int Ia = Tma.c("sv3d");
    public static final int J = Tma.c("esds");
    public static final int Ja = Tma.c("proj");
    public static final int K = Tma.c("moof");
    public static final int Ka = Tma.c("vp08");
    public static final int L = Tma.c("traf");
    public static final int La = Tma.c("vp09");
    public static final int M = Tma.c("mvex");
    public static final int Ma = Tma.c("vpcC");
    public static final int N = Tma.c("mehd");
    public static final int Na = Tma.c("camm");
    public static final int O = Tma.c("tkhd");
    public static final int Oa = Tma.c("alac");
    public static final int P = Tma.c("edts");
    public static final int Q = Tma.c("elst");
    public static final int R = Tma.c("mdhd");
    public static final int S = Tma.c("hdlr");
    public static final int T = Tma.c("stsd");
    public static final int U = Tma.c("pssh");
    public static final int V = Tma.c("sinf");
    public static final int W = Tma.c("schm");
    public static final int X = Tma.c("schi");
    public static final int Y = Tma.c("tenc");
    public static final int Z = Tma.c("encv");

    /* renamed from: a  reason: collision with root package name */
    public static final int f11744a = Tma.c("ftyp");
    public static final int aa = Tma.c("enca");

    /* renamed from: b  reason: collision with root package name */
    public static final int f11745b = Tma.c("avc1");
    public static final int ba = Tma.c("frma");

    /* renamed from: c  reason: collision with root package name */
    public static final int f11746c = Tma.c("avc3");
    public static final int ca = Tma.c("saiz");

    /* renamed from: d  reason: collision with root package name */
    public static final int f11747d = Tma.c("hvc1");
    public static final int da = Tma.c("saio");

    /* renamed from: e  reason: collision with root package name */
    public static final int f11748e = Tma.c("hev1");
    public static final int ea = Tma.c("sbgp");

    /* renamed from: f  reason: collision with root package name */
    public static final int f11749f = Tma.c("s263");
    public static final int fa = Tma.c("sgpd");

    /* renamed from: g  reason: collision with root package name */
    public static final int f11750g = Tma.c("d263");
    public static final int ga = Tma.c("uuid");

    /* renamed from: h  reason: collision with root package name */
    public static final int f11751h = Tma.c("mdat");
    public static final int ha = Tma.c("senc");
    public static final int i = Tma.c("mp4a");
    public static final int ia = Tma.c("pasp");
    public static final int j = Tma.c(".mp3");
    public static final int ja = Tma.c("TTML");
    public static final int k = Tma.c("wave");
    private static final int ka = Tma.c("vmhd");
    public static final int l = Tma.c("lpcm");
    public static final int la = Tma.c("mp4v");
    public static final int m = Tma.c("sowt");
    public static final int ma = Tma.c("stts");
    public static final int n = Tma.c("ac-3");
    public static final int na = Tma.c("stss");
    public static final int o = Tma.c("dac3");
    public static final int oa = Tma.c("ctts");
    public static final int p = Tma.c("ec-3");
    public static final int pa = Tma.c("stsc");
    public static final int q = Tma.c("dec3");
    public static final int qa = Tma.c("stsz");
    public static final int r = Tma.c("dtsc");
    public static final int ra = Tma.c("stz2");
    public static final int s = Tma.c("dtsh");
    public static final int sa = Tma.c("stco");
    public static final int t = Tma.c("dtsl");
    public static final int ta = Tma.c("co64");
    public static final int u = Tma.c("dtse");
    public static final int ua = Tma.c("tx3g");
    public static final int v = Tma.c("ddts");
    public static final int va = Tma.c("wvtt");
    public static final int w = Tma.c("tfdt");
    public static final int wa = Tma.c("stpp");
    public static final int x = Tma.c("tfhd");
    public static final int xa = Tma.c("c608");
    public static final int y = Tma.c("trex");
    public static final int ya = Tma.c("samr");
    public static final int z = Tma.c("trun");
    public static final int za = Tma.c("sawb");
    public final int Pa;

    public C2379pka(int i2) {
        this.Pa = i2;
    }

    public static int a(int i2) {
        return (i2 >> 24) & 255;
    }

    public static int b(int i2) {
        return i2 & 16777215;
    }

    public static String c(int i2) {
        StringBuilder sb = new StringBuilder(4);
        sb.append((char) (i2 >>> 24));
        sb.append((char) ((i2 >> 16) & 255));
        sb.append((char) ((i2 >> 8) & 255));
        sb.append((char) (i2 & 255));
        return sb.toString();
    }

    public String toString() {
        return c(this.Pa);
    }
}
