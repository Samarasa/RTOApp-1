package c.b.d.a;

import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.BuildConfig;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f4896a = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};

    /* renamed from: b  reason: collision with root package name */
    static final DateFormat f4897b = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* renamed from: c  reason: collision with root package name */
    private final String f4898c;

    /* renamed from: d  reason: collision with root package name */
    private final String f4899d;

    /* renamed from: e  reason: collision with root package name */
    private final String f4900e;

    /* renamed from: f  reason: collision with root package name */
    private final Date f4901f;

    /* renamed from: g  reason: collision with root package name */
    private final long f4902g;

    /* renamed from: h  reason: collision with root package name */
    private final long f4903h;

    b(String str, String str2, String str3, Date date, long j, long j2) {
        this.f4898c = str;
        this.f4899d = str2;
        this.f4900e = str3;
        this.f4901f = date;
        this.f4902g = j;
        this.f4903h = j2;
    }

    static b a(Map<String, String> map) {
        b(map);
        try {
            return new b(map.get("experimentId"), map.get("variantId"), map.containsKey("triggerEvent") ? map.get("triggerEvent") : BuildConfig.FLAVOR, f4897b.parse(map.get("experimentStartTime")), Long.parseLong(map.get("triggerTimeoutMillis")), Long.parseLong(map.get("timeToLiveMillis")));
        } catch (ParseException e2) {
            throw new a("Could not process experiment: parsing experiment start time failed.", e2);
        } catch (NumberFormatException e3) {
            throw new a("Could not process experiment: one of the durations could not be converted into a long.", e3);
        }
    }

    private static void b(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        for (String str : f4896a) {
            if (!map.containsKey(str)) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new a(String.format("The following keys are missing from the experiment info map: %s", new Object[]{arrayList}));
        }
    }

    /* access modifiers changed from: package-private */
    public String a() {
        return this.f4898c;
    }

    /* access modifiers changed from: package-private */
    public long b() {
        return this.f4901f.getTime();
    }

    /* access modifiers changed from: package-private */
    public long c() {
        return this.f4903h;
    }

    /* access modifiers changed from: package-private */
    public String d() {
        return this.f4900e;
    }

    /* access modifiers changed from: package-private */
    public long e() {
        return this.f4902g;
    }

    /* access modifiers changed from: package-private */
    public String f() {
        return this.f4899d;
    }
}
