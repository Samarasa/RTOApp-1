package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.internal.C0554j;

final class I implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ H f5906a;

    private I(H h2) {
        this.f5906a = h2;
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            synchronized (this.f5906a.f5901d) {
                C0554j.a aVar = (C0554j.a) message.obj;
                J j = (J) this.f5906a.f5901d.get(aVar);
                if (j != null && j.c()) {
                    if (j.a()) {
                        j.b("GmsClientSupervisor");
                    }
                    this.f5906a.f5901d.remove(aVar);
                }
            }
            return true;
        } else if (i != 1) {
            return false;
        } else {
            synchronized (this.f5906a.f5901d) {
                C0554j.a aVar2 = (C0554j.a) message.obj;
                J j2 = (J) this.f5906a.f5901d.get(aVar2);
                if (j2 != null && j2.b() == 3) {
                    String valueOf = String.valueOf(aVar2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(valueOf);
                    Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                    ComponentName e2 = j2.e();
                    if (e2 == null) {
                        e2 = aVar2.b();
                    }
                    if (e2 == null) {
                        String a2 = aVar2.a();
                        C0563t.a(a2);
                        e2 = new ComponentName(a2, "unknown");
                    }
                    j2.onServiceDisconnected(e2);
                }
            }
            return true;
        }
    }
}
