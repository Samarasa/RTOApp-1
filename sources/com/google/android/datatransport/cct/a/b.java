package com.google.android.datatransport.cct.a;

import android.util.SparseArray;

public enum b {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: g  reason: collision with root package name */
    private static final SparseArray<b> f5167g = null;

    static {
        DEFAULT = new b("DEFAULT", 0, 0);
        UNMETERED_ONLY = new b("UNMETERED_ONLY", 1, 1);
        UNMETERED_OR_DAILY = new b("UNMETERED_OR_DAILY", 2, 2);
        FAST_IF_RADIO_AWAKE = new b("FAST_IF_RADIO_AWAKE", 3, 3);
        NEVER = new b("NEVER", 4, 4);
        UNRECOGNIZED = new b("UNRECOGNIZED", 5, -1);
        b[] bVarArr = {DEFAULT, UNMETERED_ONLY, UNMETERED_OR_DAILY, FAST_IF_RADIO_AWAKE, NEVER, UNRECOGNIZED};
        f5167g = new SparseArray<>();
        f5167g.put(0, DEFAULT);
        f5167g.put(1, UNMETERED_ONLY);
        f5167g.put(2, UNMETERED_OR_DAILY);
        f5167g.put(3, FAST_IF_RADIO_AWAKE);
        f5167g.put(4, NEVER);
        f5167g.put(-1, UNRECOGNIZED);
    }

    private b(int i) {
    }
}
