package service;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import b.n.a.b;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.StartActivity;
import org.json.JSONException;
import org.json.JSONObject;
import util.d;

public class MyFirebaseMessagingService extends FirebaseMessagingService {

    /* renamed from: g  reason: collision with root package name */
    private static final String f15636g = "MyFirebaseMessagingService";

    /* renamed from: h  reason: collision with root package name */
    private d f15637h;

    private void a(Context context, String str, String str2, String str3, Intent intent) {
        this.f15637h = new d(context);
        intent.setFlags(268468224);
        this.f15637h.a(str, str2, str3, intent);
    }

    private void a(Context context, String str, String str2, String str3, Intent intent, String str4) {
        this.f15637h = new d(context);
        intent.setFlags(268468224);
        this.f15637h.a(str, str2, str3, intent, str4);
    }

    private void a(JSONObject jSONObject) {
        String str;
        StringBuilder sb;
        String str2;
        String str3 = f15636g;
        Log.e(str3, "push json: " + jSONObject.toString());
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            String string = jSONObject2.getString("title");
            String string2 = jSONObject2.getString("message");
            boolean z = jSONObject2.getBoolean("is_background");
            String string3 = jSONObject2.getString("image");
            String string4 = jSONObject2.getString("timestamp");
            JSONObject jSONObject3 = jSONObject2.getJSONObject("payload");
            String str4 = f15636g;
            Log.e(str4, "title: " + string);
            String str5 = f15636g;
            Log.e(str5, "message: " + string2);
            String str6 = f15636g;
            Log.e(str6, "isBackground: " + z);
            String str7 = f15636g;
            Log.e(str7, "payload: " + jSONObject3.toString());
            String str8 = f15636g;
            Log.e(str8, "imageUrl: " + string3);
            String str9 = f15636g;
            Log.e(str9, "timestamp: " + string4);
            if (!d.a(getApplicationContext())) {
                Intent intent = new Intent("pushNotification");
                intent.putExtra("message", string2);
                b.a((Context) this).a(intent);
                new d(getApplicationContext()).a();
                return;
            }
            Intent intent2 = new Intent(getApplicationContext(), StartActivity.class);
            intent2.putExtra("message", string2);
            if (TextUtils.isEmpty(string3)) {
                a(getApplicationContext(), string, string2, string4, intent2);
                return;
            }
            a(getApplicationContext(), string, string2, string4, intent2, string3);
        } catch (JSONException e2) {
            str2 = f15636g;
            sb = new StringBuilder();
            sb.append("Json Exception: ");
            str = e2.getMessage();
            sb.append(str);
            Log.e(str2, sb.toString());
        } catch (Exception e3) {
            str2 = f15636g;
            sb = new StringBuilder();
            sb.append("Exception: ");
            str = e3.getMessage();
            sb.append(str);
            Log.e(str2, sb.toString());
        }
    }

    private void c(String str) {
        if (!d.a(getApplicationContext())) {
            Intent intent = new Intent("pushNotification");
            intent.putExtra("message", str);
            b.a((Context) this).a(intent);
            new d(getApplicationContext()).a();
        }
    }

    public void a(com.google.firebase.messaging.b bVar) {
        String str = f15636g;
        Log.e(str, "From: " + bVar.h());
        if (bVar != null) {
            if (bVar.i() != null) {
                String str2 = f15636g;
                Log.e(str2, "Notification Body: " + bVar.i().a());
                c(bVar.i().a());
            }
            if (bVar.g().size() > 0) {
                String str3 = f15636g;
                Log.e(str3, "Data Payload: " + bVar.g().toString());
                try {
                    a(new JSONObject(bVar.g().toString()));
                } catch (Exception e2) {
                    String str4 = f15636g;
                    Log.e(str4, "Exception: " + e2.getMessage());
                }
            }
        }
    }
}
