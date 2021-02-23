package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Base64;
import android.util.Log;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.C0094a;
import androidx.appcompat.app.o;
import androidx.recyclerview.widget.C0185k;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.c;
import com.google.android.gms.ads.d;
import com.google.android.gms.ads.e;
import com.google.android.gms.ads.formats.j;
import com.google.android.gms.ads.h;
import g.A;
import g.E;
import g.H;
import g.J;
import g.x;
import java.io.IOException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

public class VehicleModels extends o {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int NUMBER_OF_AD_MOB_ADS = 1;
    private FrameLayout adContainerView;
    boolean adLoaded;
    /* access modifiers changed from: private */
    public d adLoader;
    LinearLayout adView;
    private h adViewbanner;
    boolean dataLoaded;
    LinearLayout fb_banner_container_models;
    private ImageView goBack;
    private TextView loadingModels;
    /* access modifiers changed from: private */
    public List<j> mNativeAds = new ArrayList();
    private RecyclerView modelList;
    private TextView modelName;
    private VehicleModelsAdapter modelsAdapter;
    /* access modifiers changed from: private */
    public List<Object> modelsBean = new ArrayList();
    private j nativeAd;
    private LinearLayout searchBox;
    private EditText searchModel;
    /* access modifiers changed from: private */
    public List<Object> tmodelsBean = new ArrayList();

    private void getModels(String str, final String str2) {
        MainActivity mainActivity = MainActivity.mObj;
        final String returnADIDCount = mainActivity != null ? mainActivity.returnADIDCount() : BuildConfig.FLAVOR;
        String str3 = null;
        try {
            str3 = new String(Base64.encode(("brnad_type:" + str2 + "~brnad_id:" + str).getBytes(), 0), "UTF-8");
        } catch (UnsupportedEncodingException e2) {
            e2.printStackTrace();
        }
        final String replaceAll = MainActivity.insertPeriodically(str3.replaceAll("\n", BuildConfig.FLAVOR), "a", 1).replaceAll("\n", BuildConfig.FLAVOR);
        new AsyncTask<Void, Integer, String>() {
            /* access modifiers changed from: protected */
            public String doInBackground(Void... voidArr) {
                x.a aVar = new x.a();
                aVar.a("cookie", replaceAll);
                aVar.a("auth", returnADIDCount);
                x a2 = aVar.a();
                E.a aVar2 = new E.a();
                aVar2.a(30, TimeUnit.SECONDS);
                aVar2.c(30, TimeUnit.SECONDS);
                aVar2.b(90, TimeUnit.SECONDS);
                E a3 = aVar2.a();
                A.a i = A.c(PreferenceManager.getDefaultSharedPreferences(VehicleModels.this).getString("api_rto_models", BuildConfig.FLAVOR)).i();
                H.a aVar3 = new H.a();
                aVar3.b(i.a().toString());
                aVar3.a((J) a2);
                try {
                    return a3.a(aVar3.a()).execute().a().t().toString();
                } catch (IOException e2) {
                    e2.printStackTrace();
                    return BuildConfig.FLAVOR;
                }
            }

            /* access modifiers changed from: protected */
            public void onPostExecute(String str) {
                String str2;
                String str3 = "1";
                super.onPostExecute(str);
                try {
                    JSONObject jSONObject = new JSONObject(new String(str));
                    if (jSONObject.getString("status").equals(str3)) {
                        JSONArray jSONArray = jSONObject.getJSONArray("brandModelsList");
                        int i = 0;
                        while (i < jSONArray.length()) {
                            if (str2.equals(str3)) {
                                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                                List access$100 = VehicleModels.this.modelsBean;
                                VehicleModelsBean vehicleModelsBean = r8;
                                VehicleModelsBean vehicleModelsBean2 = new VehicleModelsBean(jSONObject2.getString("cbm_name"), jSONObject2.getString("cbm_id"), jSONObject2.getString("cmm_main_image_link"), jSONObject2.getString("cbm_cb_id"), jSONObject2.getString("cbm_price"), jSONObject2.getString("cbm_horse_power"), jSONObject2.getString("cbm_mileage"), jSONObject2.getString("cbm_fuel_type"), str2);
                                access$100.add(vehicleModelsBean);
                                str2 = str3;
                            } else {
                                JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                                List access$1002 = VehicleModels.this.modelsBean;
                                str2 = str3;
                                VehicleModelsBean vehicleModelsBean3 = r7;
                                VehicleModelsBean vehicleModelsBean4 = new VehicleModelsBean(jSONObject3.getString("bbm_name"), jSONObject3.getString("bbm_id"), jSONObject3.getString("cmm_main_image_link"), jSONObject3.getString("bbm_bb_id"), jSONObject3.getString("bbm_price"), jSONObject3.getString("bbm_horse_power"), jSONObject3.getString("bbm_mileage"), jSONObject3.getString("bbm_fuel_type"), str2);
                                access$1002.add(vehicleModelsBean3);
                            }
                            i++;
                            str3 = str2;
                        }
                        List unused = VehicleModels.this.tmodelsBean = VehicleModels.this.modelsBean;
                        VehicleModels.this.dataLoaded = true;
                        VehicleModels.this.placeAdsInAdapter();
                    }
                } catch (Exception e2) {
                    PrintStream printStream = System.out;
                    printStream.println("e" + e2);
                    Toast.makeText(VehicleModels.this, "Try another model", 0).show();
                    VehicleModels.this.finish();
                }
            }

            /* access modifiers changed from: protected */
            public void onPreExecute() {
                super.onPreExecute();
            }
        }.execute(new Void[0]);
    }

    private void loadAdMobNativeAds() {
        d.a aVar = new d.a((Context) this, getString(R.string.admob_native_id));
        aVar.a((j.a) new j.a() {
            public void onUnifiedNativeAdLoaded(j jVar) {
                VehicleModels.this.mNativeAds.add(jVar);
                if (!VehicleModels.this.adLoader.a()) {
                    VehicleModels vehicleModels = VehicleModels.this;
                    vehicleModels.adLoaded = true;
                    vehicleModels.placeAdsInAdapter();
                }
            }
        });
        aVar.a((c) new c() {
            public void onAdFailedToLoad(int i) {
                Log.e("MainActivity", "The previous native ad failed to load. Attempting to load another.");
                if (!VehicleModels.this.adLoader.a()) {
                    VehicleModels vehicleModels = VehicleModels.this;
                    vehicleModels.adLoaded = true;
                    vehicleModels.placeAdsInAdapter();
                }
            }
        });
        this.adLoader = aVar.a();
        this.adLoader.a(new e.a().a(), 1);
    }

    /* access modifiers changed from: private */
    public void loadBanner() {
        this.adViewbanner = new h(this);
        this.adViewbanner.setAdUnitId(getString(R.string.admob_banner_id));
        this.adContainerView.removeAllViews();
        this.adContainerView.addView(this.adViewbanner);
        this.adViewbanner.setAdSize(DataHandler.getAdSize(this, this.adContainerView));
        e.a aVar = new e.a();
        aVar.b("B3EEABB8EE11C2BE770B684D95219ECB");
        this.adViewbanner.a(aVar.a());
    }

    /* access modifiers changed from: private */
    public void placeAdsInAdapter() {
        if (this.adLoaded && this.dataLoaded) {
            if (this.modelsBean.size() > 3 && this.mNativeAds.size() > 0) {
                this.modelsBean.add(3, this.mNativeAds.get(0));
            }
            this.modelsAdapter = new VehicleModelsAdapter(this, this.modelsBean);
            GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 1);
            gridLayoutManager.a((GridLayoutManager.c) new GridLayoutManager.c() {
                public int getSpanSize(int i) {
                    if (VehicleModels.this.modelsBean.size() <= i || (VehicleModels.this.modelsBean.get(i) instanceof j)) {
                    }
                    return 1;
                }
            });
            this.modelList.setLayoutManager(gridLayoutManager);
            this.modelList.setItemAnimator(new C0185k());
            this.modelList.setAdapter(this.modelsAdapter);
            this.loadingModels.setVisibility(8);
            this.modelList.setVisibility(0);
            this.searchBox.setVisibility(0);
        }
    }

    /* access modifiers changed from: package-private */
    public void filter(String str) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.tmodelsBean.size(); i++) {
            Object obj = this.tmodelsBean.get(i);
            if (obj instanceof VehicleModelsBean) {
                VehicleModelsBean vehicleModelsBean = (VehicleModelsBean) obj;
                if (vehicleModelsBean.getModel_name().toLowerCase().contains(str)) {
                    arrayList.add(vehicleModelsBean);
                }
            }
        }
        updateList(arrayList);
    }

    public void onBackPressed() {
        super.onBackPressed();
        DataHandler.showAd(this);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_vehicle_models);
        ((C0094a) Objects.requireNonNull(getSupportActionBar())).d(true);
        setTitle("Vehicle Models");
        this.modelList = (RecyclerView) findViewById(R.id.models_recycler);
        this.loadingModels = (TextView) findViewById(R.id.loading_models);
        this.modelName = (TextView) findViewById(R.id.model_name);
        this.searchModel = (EditText) findViewById(R.id.search_model);
        this.searchBox = (LinearLayout) findViewById(R.id.search_box);
        this.searchModel.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable editable) {
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                VehicleModels.this.filter(charSequence.toString());
            }
        });
        String stringExtra = getIntent().getStringExtra("type");
        String stringExtra2 = getIntent().getStringExtra("vehicleType");
        String stringExtra3 = getIntent().getStringExtra("bname");
        setTitle(stringExtra3);
        this.modelName.setText(stringExtra3);
        if (stringExtra.equals(BuildConfig.FLAVOR) || stringExtra2.equals(BuildConfig.FLAVOR)) {
            finish();
        } else {
            getModels(stringExtra, stringExtra2);
        }
        if (PreferenceManager.getDefaultSharedPreferences(this).getString("showNativeAD", BuildConfig.FLAVOR).equals("true")) {
            String string = PreferenceManager.getDefaultSharedPreferences(this).getString("AdRotationPolicyNative", BuildConfig.FLAVOR);
            String string2 = PreferenceManager.getDefaultSharedPreferences(this).getString("NativeOnlyFB", BuildConfig.FLAVOR);
            String string3 = PreferenceManager.getDefaultSharedPreferences(this).getString("NativeOnlyGoogle", BuildConfig.FLAVOR);
            if (string.equals("true")) {
                if (VehicleInfoHandler.getInstance() != null) {
                    if (!VehicleInfoHandler.getInstance().isFb_native()) {
                        loadAdMobNativeAds();
                    }
                    VehicleInfoHandler.getInstance().setFb_native(true ^ VehicleInfoHandler.getInstance().isFb_native());
                }
            } else if (!string2.equals("true") && string3.equals("true")) {
                loadAdMobNativeAds();
            }
        }
        this.fb_banner_container_models = (LinearLayout) findViewById(R.id.fb_banner_models);
        this.adContainerView = (FrameLayout) findViewById(R.id.ad_view_models);
        boolean showAdMobBanner = DataHandler.showAdMobBanner(this);
        if (PreferenceManager.getDefaultSharedPreferences(this).getString("ShowBanner", "false").equals("true") && showAdMobBanner) {
            this.adContainerView.post(new Runnable() {
                public void run() {
                    VehicleModels.this.loadBanner();
                }
            });
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public void updateList(List<Object> list) {
        this.modelsBean = list;
        this.modelsAdapter = new VehicleModelsAdapter(this, this.modelsBean);
        this.modelList.setLayoutManager(new LinearLayoutManager(this));
        this.modelList.setItemAnimator(new C0185k());
        this.modelList.setAdapter(this.modelsAdapter);
    }
}
