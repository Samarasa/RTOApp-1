package com.google.android.gms.internal.ads;

import android.util.Log;
import com.google.android.gms.internal.ads.C1389bla;

final class Jka {
    private static final int A = Tma.c("sosn");
    private static final int B = Tma.c("tvsh");
    private static final int C = Tma.c("----");
    private static final String[] D = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};

    /* renamed from: a  reason: collision with root package name */
    private static final int f7473a = Tma.c("nam");

    /* renamed from: b  reason: collision with root package name */
    private static final int f7474b = Tma.c("trk");

    /* renamed from: c  reason: collision with root package name */
    private static final int f7475c = Tma.c("cmt");

    /* renamed from: d  reason: collision with root package name */
    private static final int f7476d = Tma.c("day");

    /* renamed from: e  reason: collision with root package name */
    private static final int f7477e = Tma.c("ART");

    /* renamed from: f  reason: collision with root package name */
    private static final int f7478f = Tma.c("too");

    /* renamed from: g  reason: collision with root package name */
    private static final int f7479g = Tma.c("alb");

    /* renamed from: h  reason: collision with root package name */
    private static final int f7480h = Tma.c("com");
    private static final int i = Tma.c("wrt");
    private static final int j = Tma.c("lyr");
    private static final int k = Tma.c("gen");
    private static final int l = Tma.c("covr");
    private static final int m = Tma.c("gnre");
    private static final int n = Tma.c("grp");
    private static final int o = Tma.c("disk");
    private static final int p = Tma.c("trkn");
    private static final int q = Tma.c("tmpo");
    private static final int r = Tma.c("cpil");
    private static final int s = Tma.c("aART");
    private static final int t = Tma.c("sonm");
    private static final int u = Tma.c("soal");
    private static final int v = Tma.c("soar");
    private static final int w = Tma.c("soaa");
    private static final int x = Tma.c("soco");
    private static final int y = Tma.c("rtng");
    private static final int z = Tma.c("pgap");

    public static C1389bla.a a(Nma nma) {
        String str;
        C2097lla lla;
        int b2 = nma.b() + nma.d();
        int d2 = nma.d();
        int i2 = d2 >>> 24;
        C1884ila ila = null;
        if (i2 == 169 || i2 == 65533) {
            int i3 = 16777215 & d2;
            if (i3 == f7475c) {
                int d3 = nma.d();
                if (nma.d() == C2379pka.Fa) {
                    nma.d(8);
                    String e2 = nma.e(d3 - 16);
                    ila = new C1814hla("und", e2, e2);
                } else {
                    String valueOf = String.valueOf(C2379pka.c(d2));
                    Log.w("MetadataUtil", valueOf.length() != 0 ? "Failed to parse comment attribute: ".concat(valueOf) : new String("Failed to parse comment attribute: "));
                }
                nma.c(b2);
                return ila;
            }
            if (i3 != f7473a) {
                if (i3 != f7474b) {
                    if (i3 != f7480h) {
                        if (i3 != i) {
                            if (i3 == f7476d) {
                                C2097lla a2 = a(d2, "TDRC", nma);
                                nma.c(b2);
                                return a2;
                            } else if (i3 == f7477e) {
                                C2097lla a3 = a(d2, "TPE1", nma);
                                nma.c(b2);
                                return a3;
                            } else if (i3 == f7478f) {
                                C2097lla a4 = a(d2, "TSSE", nma);
                                nma.c(b2);
                                return a4;
                            } else if (i3 == f7479g) {
                                C2097lla a5 = a(d2, "TALB", nma);
                                nma.c(b2);
                                return a5;
                            } else if (i3 == j) {
                                C2097lla a6 = a(d2, "USLT", nma);
                                nma.c(b2);
                                return a6;
                            } else if (i3 == k) {
                                C2097lla a7 = a(d2, "TCON", nma);
                                nma.c(b2);
                                return a7;
                            } else if (i3 == n) {
                                C2097lla a8 = a(d2, "TIT1", nma);
                                nma.c(b2);
                                return a8;
                            }
                        }
                    }
                    C2097lla a9 = a(d2, "TCOM", nma);
                    nma.c(b2);
                    return a9;
                }
            }
            C2097lla a10 = a(d2, "TIT2", nma);
            nma.c(b2);
            return a10;
        }
        try {
            if (d2 == m) {
                int b3 = b(nma);
                String str2 = (b3 <= 0 || b3 > D.length) ? null : D[b3 - 1];
                if (str2 != null) {
                    lla = new C2097lla("TCON", (String) null, str2);
                } else {
                    Log.w("MetadataUtil", "Failed to parse standard genre code");
                    lla = null;
                }
                return lla;
            } else if (d2 == o) {
                C2097lla b4 = b(d2, "TPOS", nma);
                nma.c(b2);
                return b4;
            } else if (d2 == p) {
                C2097lla b5 = b(d2, "TRCK", nma);
                nma.c(b2);
                return b5;
            } else if (d2 == q) {
                C1884ila a11 = a(d2, "TBPM", nma, true, false);
                nma.c(b2);
                return a11;
            } else if (d2 == r) {
                C1884ila a12 = a(d2, "TCMP", nma, true, true);
                nma.c(b2);
                return a12;
            } else if (d2 == l) {
                int d4 = nma.d();
                if (nma.d() == C2379pka.Fa) {
                    int b6 = C2379pka.b(nma.d());
                    String str3 = b6 == 13 ? "image/jpeg" : b6 == 14 ? "image/png" : null;
                    if (str3 == null) {
                        StringBuilder sb = new StringBuilder(41);
                        sb.append("Unrecognized cover art flags: ");
                        sb.append(b6);
                        str = sb.toString();
                    } else {
                        nma.d(4);
                        byte[] bArr = new byte[(d4 - 16)];
                        nma.a(bArr, 0, bArr.length);
                        ila = new C1672fla(str3, (String) null, 3, bArr);
                        nma.c(b2);
                        return ila;
                    }
                } else {
                    str = "Failed to parse cover art attribute";
                }
                Log.w("MetadataUtil", str);
                nma.c(b2);
                return ila;
            } else if (d2 == s) {
                C2097lla a13 = a(d2, "TPE2", nma);
                nma.c(b2);
                return a13;
            } else if (d2 == t) {
                C2097lla a14 = a(d2, "TSOT", nma);
                nma.c(b2);
                return a14;
            } else if (d2 == u) {
                C2097lla a15 = a(d2, "TSO2", nma);
                nma.c(b2);
                return a15;
            } else if (d2 == v) {
                C2097lla a16 = a(d2, "TSOA", nma);
                nma.c(b2);
                return a16;
            } else if (d2 == w) {
                C2097lla a17 = a(d2, "TSOP", nma);
                nma.c(b2);
                return a17;
            } else if (d2 == x) {
                C2097lla a18 = a(d2, "TSOC", nma);
                nma.c(b2);
                return a18;
            } else if (d2 == y) {
                C1884ila a19 = a(d2, "ITUNESADVISORY", nma, false, false);
                nma.c(b2);
                return a19;
            } else if (d2 == z) {
                C1884ila a20 = a(d2, "ITUNESGAPLESS", nma, false, true);
                nma.c(b2);
                return a20;
            } else if (d2 == A) {
                C2097lla a21 = a(d2, "TVSHOWSORT", nma);
                nma.c(b2);
                return a21;
            } else if (d2 == B) {
                C2097lla a22 = a(d2, "TVSHOW", nma);
                nma.c(b2);
                return a22;
            } else if (d2 == C) {
                String str4 = null;
                String str5 = null;
                int i4 = -1;
                int i5 = -1;
                while (nma.b() < b2) {
                    int b7 = nma.b();
                    int d5 = nma.d();
                    int d6 = nma.d();
                    nma.d(4);
                    if (d6 == C2379pka.Da) {
                        str4 = nma.e(d5 - 12);
                    } else if (d6 == C2379pka.Ea) {
                        str5 = nma.e(d5 - 12);
                    } else {
                        if (d6 == C2379pka.Fa) {
                            i4 = b7;
                            i5 = d5;
                        }
                        nma.d(d5 - 12);
                    }
                }
                if ("com.apple.iTunes".equals(str4) && "iTunSMPB".equals(str5)) {
                    if (i4 != -1) {
                        nma.c(i4);
                        nma.d(16);
                        ila = new C1814hla("und", str5, nma.e(i5 - 16));
                    }
                }
                nma.c(b2);
                return ila;
            }
        } finally {
            nma.c(b2);
        }
        String valueOf2 = String.valueOf(C2379pka.c(d2));
        Log.d("MetadataUtil", valueOf2.length() != 0 ? "Skipped unknown metadata entry: ".concat(valueOf2) : new String("Skipped unknown metadata entry: "));
        nma.c(b2);
        return null;
    }

    private static C1884ila a(int i2, String str, Nma nma, boolean z2, boolean z3) {
        int b2 = b(nma);
        if (z3) {
            b2 = Math.min(1, b2);
        }
        if (b2 >= 0) {
            return z2 ? new C2097lla(str, (String) null, Integer.toString(b2)) : new C1814hla("und", str, Integer.toString(b2));
        }
        String valueOf = String.valueOf(C2379pka.c(i2));
        Log.w("MetadataUtil", valueOf.length() != 0 ? "Failed to parse uint8 attribute: ".concat(valueOf) : new String("Failed to parse uint8 attribute: "));
        return null;
    }

    private static C2097lla a(int i2, String str, Nma nma) {
        int d2 = nma.d();
        if (nma.d() == C2379pka.Fa) {
            nma.d(8);
            return new C2097lla(str, (String) null, nma.e(d2 - 16));
        }
        String valueOf = String.valueOf(C2379pka.c(i2));
        Log.w("MetadataUtil", valueOf.length() != 0 ? "Failed to parse text attribute: ".concat(valueOf) : new String("Failed to parse text attribute: "));
        return null;
    }

    private static int b(Nma nma) {
        nma.d(4);
        if (nma.d() == C2379pka.Fa) {
            nma.d(8);
            return nma.g();
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    private static C2097lla b(int i2, String str, Nma nma) {
        int d2 = nma.d();
        if (nma.d() == C2379pka.Fa && d2 >= 22) {
            nma.d(10);
            int h2 = nma.h();
            if (h2 > 0) {
                StringBuilder sb = new StringBuilder(11);
                sb.append(h2);
                String sb2 = sb.toString();
                int h3 = nma.h();
                if (h3 > 0) {
                    String valueOf = String.valueOf(sb2);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 12);
                    sb3.append(valueOf);
                    sb3.append("/");
                    sb3.append(h3);
                    sb2 = sb3.toString();
                }
                return new C2097lla(str, (String) null, sb2);
            }
        }
        String valueOf2 = String.valueOf(C2379pka.c(i2));
        Log.w("MetadataUtil", valueOf2.length() != 0 ? "Failed to parse index/count attribute: ".concat(valueOf2) : new String("Failed to parse index/count attribute: "));
        return null;
    }
}
