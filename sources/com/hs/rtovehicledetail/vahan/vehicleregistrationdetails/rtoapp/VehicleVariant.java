package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

import android.os.AsyncTask;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Base64;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.C0094a;
import androidx.appcompat.app.o;
import androidx.fragment.app.C0159i;
import androidx.recyclerview.widget.C0185k;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c.a.a.c;
import com.google.android.gms.ads.e;
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

public class VehicleVariant extends o {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private FrameLayout adContainerView;
    private h adViewbanner;
    /* access modifiers changed from: private */
    public ColorsAdapter colorAdapter;
    /* access modifiers changed from: private */
    public List<ColorsBean> colorsBean = new ArrayList();
    private LinearLayout colorsLay;
    /* access modifiers changed from: private */
    public RecyclerView colorsList;
    LinearLayout fb_banner_container_variant;
    private ImageView goBack;
    /* access modifiers changed from: private */
    public ImageView imageVariant;
    /* access modifiers changed from: private */
    public TextView loadingVariants;
    /* access modifiers changed from: private */
    public TextView nameVariant;
    /* access modifiers changed from: private */
    public TextView priceVariant;
    /* access modifiers changed from: private */
    public VehicleVariantAdapter variantAdapter;
    /* access modifiers changed from: private */
    public List<VehicleVariantBean> variantBean = new ArrayList();
    private TextView variantBname;
    /* access modifiers changed from: private */
    public LinearLayout variantLay;
    /* access modifiers changed from: private */
    public RecyclerView variantList;

    private void getVariants(String str, String str2, String str3, String str4) {
        MainActivity mainActivity = MainActivity.mObj;
        final String returnADIDCount = mainActivity != null ? mainActivity.returnADIDCount() : BuildConfig.FLAVOR;
        String str5 = null;
        try {
            str5 = new String(Base64.encode(("brnad_type:" + str3 + "~brnad_model_id:" + str2 + "~brnad_id:" + str).getBytes(), 0), "UTF-8");
        } catch (UnsupportedEncodingException e2) {
            e2.printStackTrace();
        }
        final String replaceAll = MainActivity.insertPeriodically(str5.replaceAll("\n", BuildConfig.FLAVOR), "a", 1).replaceAll("\n", BuildConfig.FLAVOR);
        final String str6 = str4;
        final String str7 = str;
        final String str8 = str3;
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
                A.a i = A.c(PreferenceManager.getDefaultSharedPreferences(VehicleVariant.this).getString("api_rto_variants", BuildConfig.FLAVOR)).i();
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
                super.onPostExecute(str);
                try {
                    JSONObject jSONObject = new JSONObject(new String(str));
                    if (jSONObject.getString("status").equals("1")) {
                        JSONArray jSONArray = jSONObject.getJSONArray("brandsVarientsList");
                        JSONObject jSONObject2 = jSONObject.getJSONArray("brandsMainsList").getJSONObject(0);
                        VehicleVariant.this.priceVariant.setText(jSONObject2.getString("cmm_main_price").replaceAll("\n", BuildConfig.FLAVOR));
                        VehicleVariant.this.nameVariant.setText(str6);
                        c.a((C0159i) VehicleVariant.this).a(jSONObject2.getString("cmm_main_image_link")).a(VehicleVariant.this.imageVariant);
                        JSONArray jSONArray2 = jSONObject.getJSONArray("brandsColorsList");
                        for (int i = 0; i < jSONArray2.length(); i++) {
                            JSONObject jSONObject3 = jSONArray2.getJSONObject(i);
                            VehicleVariant.this.colorsBean.add(new ColorsBean(jSONObject3.getString("cmc_id"), jSONObject3.getString("cmc_cbm_id"), jSONObject3.getString("cmc_color_name"), jSONObject3.getString("cmc_color_code")));
                        }
                        ColorsAdapter unused = VehicleVariant.this.colorAdapter = new ColorsAdapter(VehicleVariant.this.colorsBean, VehicleVariant.this);
                        VehicleVariant.this.colorsList.setLayoutManager(new LinearLayoutManager(VehicleVariant.this, 0, false));
                        VehicleVariant.this.colorsList.setItemAnimator(new C0185k());
                        VehicleVariant.this.colorsList.setAdapter(VehicleVariant.this.colorAdapter);
                        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                            JSONObject jSONObject4 = jSONArray.getJSONObject(i2);
                            List access$700 = VehicleVariant.this.variantBean;
                            String string = jSONObject4.getString("cmv_name");
                            String string2 = jSONObject4.getString("cmv_id");
                            String string3 = jSONObject4.getString("cmv_cbm_id");
                            String str2 = str7;
                            String string4 = jSONObject4.getString("cmv_price");
                            String string5 = jSONObject4.getString("cmv_engine");
                            String string6 = jSONObject4.getString("cmv_mileage");
                            String string7 = jSONObject4.getString("cmv_fuel_type");
                            String string8 = jSONObject4.getString("cmv_ftrs");
                            VehicleVariantBean vehicleVariantBean = r6;
                            VehicleVariantBean vehicleVariantBean2 = new VehicleVariantBean(string, string2, string3, str2, string4, string5, string6, string7, string8, jSONObject4.getString("cmv_bspace"), str8);
                            access$700.add(vehicleVariantBean);
                        }
                        VehicleVariantAdapter unused2 = VehicleVariant.this.variantAdapter = new VehicleVariantAdapter(VehicleVariant.this.variantBean, VehicleVariant.this);
                        VehicleVariant.this.variantList.setLayoutManager(new LinearLayoutManager(VehicleVariant.this, 0, false));
                        VehicleVariant.this.variantList.setItemAnimator(new C0185k());
                        VehicleVariant.this.variantList.setAdapter(VehicleVariant.this.variantAdapter);
                        VehicleVariant.this.loadingVariants.setVisibility(8);
                        VehicleVariant.this.variantLay.setVisibility(0);
                        VehicleVariant.this.variantList.setVisibility(0);
                    }
                } catch (Exception e2) {
                    PrintStream printStream = System.out;
                    printStream.println("e" + e2);
                    Toast.makeText(VehicleVariant.this, "Try another variant", 0).show();
                    VehicleVariant.this.finish();
                }
            }

            /* access modifiers changed from: protected */
            public void onPreExecute() {
                super.onPreExecute();
            }
        }.execute(new Void[0]);
    }

    private void initMyView() {
        this.variantList = (RecyclerView) findViewById(R.id.variants_recycler);
        this.nameVariant = (TextView) findViewById(R.id.name_variant);
        this.priceVariant = (TextView) findViewById(R.id.price_variant);
        this.imageVariant = (ImageView) findViewById(R.id.image_variant);
        this.colorsLay = (LinearLayout) findViewById(R.id.colors_lay);
        this.variantLay = (LinearLayout) findViewById(R.id.variant_lay);
        this.loadingVariants = (TextView) findViewById(R.id.loading_variants);
        this.colorsList = (RecyclerView) findViewById(R.id.colors_recycler);
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

    public void onBackPressed() {
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_vehicle_variant);
        ((C0094a) Objects.requireNonNull(getSupportActionBar())).d(true);
        initMyView();
        String stringExtra = getIntent().getStringExtra("bID");
        String stringExtra2 = getIntent().getStringExtra("mID");
        String stringExtra3 = getIntent().getStringExtra("vtype");
        String stringExtra4 = getIntent().getStringExtra("name");
        setTitle(stringExtra4);
        getVariants(stringExtra, stringExtra2, stringExtra3, stringExtra4);
        this.fb_banner_container_variant = (LinearLayout) findViewById(R.id.fb_banner_variant);
        this.adContainerView = (FrameLayout) findViewById(R.id.ad_view_variant);
        boolean showAdMobBanner = DataHandler.showAdMobBanner(this);
        if (PreferenceManager.getDefaultSharedPreferences(this).getString("ShowBanner", "false").equals("true") && showAdMobBanner) {
            this.adContainerView.post(new Runnable() {
                public void run() {
                    VehicleVariant.this.loadBanner();
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
}
