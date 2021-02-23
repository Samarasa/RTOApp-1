package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

import android.content.Context;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.appcompat.app.C0094a;
import androidx.appcompat.app.o;
import androidx.recyclerview.widget.C0185k;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.d;
import com.google.android.gms.ads.e;
import com.google.android.gms.ads.formats.UnifiedNativeAdView;
import com.google.android.gms.ads.formats.c;
import com.google.android.gms.ads.formats.j;
import com.google.android.gms.ads.w;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class CelebrityCars extends o {
    LinearLayout adView;
    RecyclerView celebCars;
    private List<CelebrityCarsBean> celebCarsList = new ArrayList();
    /* access modifiers changed from: private */
    public j nativeAd;
    CelebrityCarsAdapter rcelebCarsAdapter;

    private void refreshAd() {
        d.a aVar = new d.a((Context) this, getString(R.string.admob_native_id));
        aVar.a((j.a) new j.a() {
            public void onUnifiedNativeAdLoaded(j jVar) {
                if (CelebrityCars.this.nativeAd != null) {
                    CelebrityCars.this.nativeAd.a();
                }
                j unused = CelebrityCars.this.nativeAd = jVar;
                FrameLayout frameLayout = (FrameLayout) CelebrityCars.this.findViewById(R.id.ad_celebrity);
                UnifiedNativeAdView unifiedNativeAdView = (UnifiedNativeAdView) CelebrityCars.this.getLayoutInflater().inflate(R.layout.ad_unified, (ViewGroup) null);
                MainActivity.populateUnifiedNativeAdView(jVar, unifiedNativeAdView);
                frameLayout.removeAllViews();
                frameLayout.addView(unifiedNativeAdView);
            }
        });
        w.a aVar2 = new w.a();
        aVar2.a(true);
        w a2 = aVar2.a();
        c.a aVar3 = new c.a();
        aVar3.a(a2);
        aVar.a(aVar3.a());
        aVar.a((com.google.android.gms.ads.c) new com.google.android.gms.ads.c() {
            public void onAdFailedToLoad(int i) {
            }
        });
        aVar.a().a(new e.a().a());
    }

    public void onBackPressed() {
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_celebrity_cars);
        ((C0094a) Objects.requireNonNull(getSupportActionBar())).d(true);
        setTitle("Celebrity Vehicle Details");
        this.celebCars = (RecyclerView) findViewById(R.id.celeb_cars);
        String str = MainActivity.celebCars;
        if (str == null || str.equals(BuildConfig.FLAVOR)) {
            Toast.makeText(this, "Wait few seconds", 0).show();
            finish();
        } else {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.length() > 0) {
                    JSONArray jSONArray = jSONObject.getJSONArray("data");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject2 = (JSONObject) jSONArray.get(i);
                        JSONArray jSONArray2 = jSONObject2.getJSONArray("info");
                        if (jSONArray2.length() > 0) {
                            JSONObject jSONObject3 = jSONArray2.getJSONObject(0);
                            List<CelebrityCarsBean> list = this.celebCarsList;
                            String string = jSONObject3.getString("registration_no");
                            String string2 = jSONObject2.getString("owner_name");
                            String string3 = jSONObject3.getString("fuel_type");
                            String string4 = jSONObject3.getString("vehicle_class");
                            String string5 = jSONObject3.getString("maker_model");
                            String string6 = jSONObject3.getString("registration_date");
                            String string7 = jSONObject3.getString("registering_authority");
                            CelebrityCarsBean celebrityCarsBean = r9;
                            CelebrityCarsBean celebrityCarsBean2 = new CelebrityCarsBean(string, string2, string3, string4, "Not Available", string5, string6, "Not Available", "Not Available", string7);
                            list.add(celebrityCarsBean);
                        }
                    }
                    this.rcelebCarsAdapter = new CelebrityCarsAdapter(this.celebCarsList, this);
                    this.celebCars.setLayoutManager(new LinearLayoutManager(this));
                    this.celebCars.setItemAnimator(new C0185k());
                    this.celebCars.setAdapter(this.rcelebCarsAdapter);
                } else {
                    finish();
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        if (PreferenceManager.getDefaultSharedPreferences(this).getString("showNativeAD", BuildConfig.FLAVOR).equals("true")) {
            String string8 = PreferenceManager.getDefaultSharedPreferences(this).getString("AdRotationPolicyNative", BuildConfig.FLAVOR);
            String string9 = PreferenceManager.getDefaultSharedPreferences(this).getString("NativeOnlyFB", BuildConfig.FLAVOR);
            String string10 = PreferenceManager.getDefaultSharedPreferences(this).getString("NativeOnlyGoogle", BuildConfig.FLAVOR);
            if (string8.equals("true")) {
                if (VehicleInfoHandler.getInstance() != null) {
                    if (!VehicleInfoHandler.getInstance().isFb_native()) {
                        refreshAd();
                    }
                    VehicleInfoHandler.getInstance().setFb_native(true ^ VehicleInfoHandler.getInstance().isFb_native());
                }
            } else if (!string9.equals("true") && string10.equals("true")) {
                refreshAd();
            }
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
