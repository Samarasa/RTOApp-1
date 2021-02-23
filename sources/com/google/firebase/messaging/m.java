package com.google.firebase.messaging;

import c.b.b.a.b;
import c.b.b.a.g;
import c.b.d.e;
import com.google.android.datatransport.cct.a;
import com.google.firebase.components.f;
import com.google.firebase.components.i;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;

final /* synthetic */ class m implements i {

    /* renamed from: a  reason: collision with root package name */
    static final i f14662a = new m();

    private m() {
    }

    public final Object a(f fVar) {
        e eVar = (e) fVar.a(e.class);
        FirebaseInstanceId firebaseInstanceId = (FirebaseInstanceId) fVar.a(FirebaseInstanceId.class);
        g gVar = (g) fVar.a(g.class);
        if (gVar == null || !a.f5158f.a().contains(b.a("json"))) {
            gVar = new FirebaseMessagingRegistrar.a();
        }
        return new FirebaseMessaging(eVar, firebaseInstanceId, gVar);
    }
}
