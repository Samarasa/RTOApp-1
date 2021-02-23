package c.b.b.b.d.f;

import android.os.Bundle;
import android.os.IInterface;
import c.b.b.b.c.a;
import java.util.Map;

/* renamed from: c.b.b.b.d.f.gf  reason: case insensitive filesystem */
public interface C0338gf extends IInterface {
    void beginAdUnitExposure(String str, long j);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void endAdUnitExposure(String str, long j);

    void generateEventId(Hf hf);

    void getAppInstanceId(Hf hf);

    void getCachedAppInstanceId(Hf hf);

    void getConditionalUserProperties(String str, String str2, Hf hf);

    void getCurrentScreenClass(Hf hf);

    void getCurrentScreenName(Hf hf);

    void getGmpAppId(Hf hf);

    void getMaxUserProperties(String str, Hf hf);

    void getTestFlag(Hf hf, int i);

    void getUserProperties(String str, String str2, boolean z, Hf hf);

    void initForTests(Map map);

    void initialize(a aVar, Tf tf, long j);

    void isDataCollectionEnabled(Hf hf);

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j);

    void logEventAndBundle(String str, String str2, Bundle bundle, Hf hf, long j);

    void logHealthData(int i, String str, a aVar, a aVar2, a aVar3);

    void onActivityCreated(a aVar, Bundle bundle, long j);

    void onActivityDestroyed(a aVar, long j);

    void onActivityPaused(a aVar, long j);

    void onActivityResumed(a aVar, long j);

    void onActivitySaveInstanceState(a aVar, Hf hf, long j);

    void onActivityStarted(a aVar, long j);

    void onActivityStopped(a aVar, long j);

    void performAction(Bundle bundle, Hf hf, long j);

    void registerOnMeasurementEventListener(Qf qf);

    void resetAnalyticsData(long j);

    void setConditionalUserProperty(Bundle bundle, long j);

    void setCurrentScreen(a aVar, String str, String str2, long j);

    void setDataCollectionEnabled(boolean z);

    void setEventInterceptor(Qf qf);

    void setInstanceIdProvider(Rf rf);

    void setMeasurementEnabled(boolean z, long j);

    void setMinimumSessionDuration(long j);

    void setSessionTimeoutDuration(long j);

    void setUserId(String str, long j);

    void setUserProperty(String str, String str2, a aVar, boolean z, long j);

    void unregisterOnMeasurementEventListener(Qf qf);
}
