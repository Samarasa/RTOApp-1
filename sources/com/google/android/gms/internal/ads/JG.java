package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.Executor;

public final class JG {

    /* renamed from: a  reason: collision with root package name */
    private final HG f7384a;

    /* renamed from: b  reason: collision with root package name */
    private final PY f7385b;

    public JG(HG hg, PY py) {
        this.f7384a = hg;
        this.f7385b = py;
    }

    public final void a(BU<SQLiteDatabase, Void> bu) {
        PY py = this.f7385b;
        HG hg = this.f7384a;
        hg.getClass();
        DY.a(py.a(MG.a(hg)), new LG(this, bu), (Executor) this.f7385b);
    }
}
