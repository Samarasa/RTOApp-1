package com.google.firebase.auth.a.a;

import c.b.b.b.g.j;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C0563t;
import com.google.firebase.auth.C3277b;
import com.google.firebase.auth.FirebaseAuth;

public final class ka<ResultT, CallbackT> implements ca<ResultT> {

    /* renamed from: a  reason: collision with root package name */
    private final ba<ResultT, CallbackT> f14327a;

    /* renamed from: b  reason: collision with root package name */
    private final j<ResultT> f14328b;

    public ka(ba<ResultT, CallbackT> baVar, j<ResultT> jVar) {
        this.f14327a = baVar;
        this.f14328b = jVar;
    }

    public final void a(ResultT resultt, Status status) {
        C0563t.a(this.f14328b, (Object) "completion source cannot be null");
        if (status != null) {
            ba<ResultT, CallbackT> baVar = this.f14327a;
            if (baVar.s != null) {
                j<ResultT> jVar = this.f14328b;
                FirebaseAuth instance = FirebaseAuth.getInstance(baVar.f14304c);
                ba<ResultT, CallbackT> baVar2 = this.f14327a;
                jVar.a((Exception) O.a(instance, baVar2.s, ("reauthenticateWithCredential".equals(baVar2.a()) || "reauthenticateWithCredentialWithData".equals(this.f14327a.a())) ? this.f14327a.f14305d : null));
                return;
            }
            C3277b bVar = baVar.p;
            if (bVar != null) {
                this.f14328b.a((Exception) O.a(status, bVar, baVar.q, baVar.r));
            } else {
                this.f14328b.a((Exception) O.a(status));
            }
        } else {
            this.f14328b.a(resultt);
        }
    }
}
