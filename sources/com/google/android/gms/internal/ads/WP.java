package com.google.android.gms.internal.ads;

import java.util.HashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

public final class WP implements Xga<MO<JSONObject>> {
    public static MO<JSONObject> a(C2236nk nkVar, Object obj, C1497dP dPVar, FP fp, Qga<XO> qga, Qga<C1780hP> qga2, Qga<C2063lP> qga3, Qga<C2488rP> qga4, Qga<AP> qga5, Qga<GP> qga6, Qga<KP> qga7, Qga<YP> qga8, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        HashSet hashSet = new HashSet();
        hashSet.add((C2843wP) obj);
        hashSet.add(dPVar);
        hashSet.add(fp);
        if (((Boolean) Qqa.e().a(F.Yd)).booleanValue()) {
            hashSet.add(qga.get());
        }
        if (((Boolean) Qqa.e().a(F.Zd)).booleanValue()) {
            hashSet.add(qga2.get());
        }
        if (((Boolean) Qqa.e().a(F._d)).booleanValue()) {
            hashSet.add(qga3.get());
        }
        if (((Boolean) Qqa.e().a(F.ae)).booleanValue()) {
            hashSet.add(qga4.get());
        }
        if (((Boolean) Qqa.e().a(F.ee)).booleanValue()) {
            hashSet.add(new XN(qga6.get(), ((Long) Qqa.e().a(F.uc)).longValue(), scheduledExecutorService));
        }
        if (((Boolean) Qqa.e().a(F.ge)).booleanValue()) {
            hashSet.add(qga7.get());
        }
        if (((Boolean) Qqa.e().a(F.he)).booleanValue()) {
            hashSet.add(qga8.get());
        }
        MO<JSONObject> mo = new MO<>(executor, hashSet);
        C1452cha.a(mo, "Cannot return null from a non-@Nullable @Provides method");
        return mo;
    }
}
