package c.a.a.d;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import androidx.fragment.app.C0158h;
import androidx.fragment.app.C0159i;
import c.a.a.c;
import c.a.a.n;
import java.util.HashSet;
import java.util.Set;

public class q extends C0158h {
    private final a W;
    private final o X;
    private final Set<q> Y;
    private q Z;
    private n aa;
    private C0158h ba;

    private class a implements o {
        a() {
        }

        public String toString() {
            return super.toString() + "{fragment=" + q.this + "}";
        }
    }

    public q() {
        this(new a());
    }

    @SuppressLint({"ValidFragment"})
    public q(a aVar) {
        this.X = new a();
        this.Y = new HashSet();
        this.W = aVar;
    }

    private void a(C0159i iVar) {
        ja();
        this.Z = c.a((Context) iVar).h().b(iVar);
        if (!equals(this.Z)) {
            this.Z.a(this);
        }
    }

    private void a(q qVar) {
        this.Y.add(qVar);
    }

    private void b(q qVar) {
        this.Y.remove(qVar);
    }

    private C0158h ia() {
        C0158h q = q();
        return q != null ? q : this.ba;
    }

    private void ja() {
        q qVar = this.Z;
        if (qVar != null) {
            qVar.b(this);
            this.Z = null;
        }
    }

    public void I() {
        super.I();
        this.W.a();
        ja();
    }

    public void L() {
        super.L();
        this.ba = null;
        ja();
    }

    public void O() {
        super.O();
        this.W.b();
    }

    public void P() {
        super.P();
        this.W.c();
    }

    public void a(Context context) {
        super.a(context);
        try {
            a(b());
        } catch (IllegalStateException e2) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root", e2);
            }
        }
    }

    public void a(n nVar) {
        this.aa = nVar;
    }

    /* access modifiers changed from: package-private */
    public void b(C0158h hVar) {
        this.ba = hVar;
        if (hVar != null && hVar.b() != null) {
            a(hVar.b());
        }
    }

    /* access modifiers changed from: package-private */
    public a fa() {
        return this.W;
    }

    public n ga() {
        return this.aa;
    }

    public o ha() {
        return this.X;
    }

    public String toString() {
        return super.toString() + "{parent=" + ia() + "}";
    }
}
