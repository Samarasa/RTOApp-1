package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

import android.os.AsyncTask;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Base64;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.C0094a;
import androidx.appcompat.app.o;
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
import se.emilsjolander.stickylistheaders.ExpandableStickyListHeadersListView;
import se.emilsjolander.stickylistheaders.m;
import se.emilsjolander.stickylistheaders.q;

public class VehicleFeatures extends o {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private FrameLayout adContainerView;
    private h adViewbanner;
    /* access modifiers changed from: private */
    public ExpandableStickyListHeadersListView expandableStickyList;
    LinearLayout fb_banner_container_features;
    /* access modifiers changed from: private */
    public List<FeaturesBean> featureList = new ArrayList();
    private ImageView goBack;
    /* access modifiers changed from: private */
    public TextView loadingFeatures;
    /* access modifiers changed from: private */
    public m stickyListHeadersAdapter;
    private TextView variantName;

    private void getVariantFeatures(String str, String str2, String str3, String str4) {
        MainActivity mainActivity = MainActivity.mObj;
        final String returnADIDCount = mainActivity != null ? mainActivity.returnADIDCount() : BuildConfig.FLAVOR;
        String str5 = null;
        try {
            str5 = new String(Base64.encode(("brnad_type:" + str3 + "~brnad_model_id:" + str2 + "~brnad_id:" + str + "~brnad_variant_id:" + str4).getBytes(), 0), "UTF-8");
        } catch (UnsupportedEncodingException e2) {
            e2.printStackTrace();
        }
        final String replaceAll = MainActivity.insertPeriodically(str5.replaceAll("\n", BuildConfig.FLAVOR), "a", 1).replaceAll("\n", BuildConfig.FLAVOR);
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
                A.a i = A.c(PreferenceManager.getDefaultSharedPreferences(VehicleFeatures.this).getString("api_rto_variants_fet", BuildConfig.FLAVOR)).i();
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
                        JSONArray jSONArray = jSONObject.getJSONArray("brandsVarientsFeaturesList");
                        if (jSONArray.length() > 0) {
                            for (int i = 0; i < jSONArray.length(); i++) {
                                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                                JSONArray jSONArray2 = jSONObject.getJSONObject("brandsFeatureValList").getJSONArray(jSONObject2.getString("cfs_ftrsp_head"));
                                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                                    JSONObject jSONObject3 = jSONArray2.getJSONObject(i2);
                                    VehicleFeatures.this.featureList.add(new FeaturesBean(jSONObject2.getString("cfs_ftrsp_head"), jSONObject3.getString("cfv_ftrsp_label"), jSONObject3.getString("cfv_ftrsp_value")));
                                }
                            }
                            m unused = VehicleFeatures.this.stickyListHeadersAdapter = new FeaturesAdapter(VehicleFeatures.this, VehicleFeatures.this.featureList);
                            VehicleFeatures.this.expandableStickyList.setAdapter(VehicleFeatures.this.stickyListHeadersAdapter);
                            VehicleFeatures.this.expandableStickyList.setOnHeaderClickListener(new q.c() {
                                public void onHeaderClick(q qVar, View view, int i, long j, boolean z) {
                                    int i2;
                                    ImageView imageView;
                                    if (VehicleFeatures.this.expandableStickyList.c(j)) {
                                        VehicleFeatures.this.expandableStickyList.b(j);
                                        imageView = (ImageView) view.findViewById(R.id.view_ic);
                                        i2 = R.drawable.ic_remove_black_24dp;
                                    } else {
                                        VehicleFeatures.this.expandableStickyList.a(j);
                                        imageView = (ImageView) view.findViewById(R.id.view_ic);
                                        i2 = R.drawable.ic_add_black_24dp;
                                    }
                                    imageView.setImageResource(i2);
                                }
                            });
                            for (int i3 = 1; i3 < VehicleFeatures.this.featureList.size(); i3++) {
                                if (!VehicleFeatures.this.expandableStickyList.c(VehicleFeatures.this.stickyListHeadersAdapter.getHeaderId(i3))) {
                                    VehicleFeatures.this.expandableStickyList.a(VehicleFeatures.this.stickyListHeadersAdapter.getHeaderId(i3));
                                }
                            }
                            VehicleFeatures.this.loadingFeatures.setVisibility(8);
                            VehicleFeatures.this.expandableStickyList.setVisibility(0);
                            return;
                        }
                        Toast.makeText(VehicleFeatures.this, "Features Not found", 0).show();
                        VehicleFeatures.this.finish();
                    }
                } catch (Exception e2) {
                    PrintStream printStream = System.out;
                    printStream.println("e" + e2);
                    Toast.makeText(VehicleFeatures.this, "Try another one", 0).show();
                    VehicleFeatures.this.finish();
                }
            }

            /* access modifiers changed from: protected */
            public void onPreExecute() {
                super.onPreExecute();
            }
        }.execute(new Void[0]);
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
        DataHandler.showAd(this);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_vehicle_features);
        ((C0094a) Objects.requireNonNull(getSupportActionBar())).d(true);
        this.expandableStickyList = (ExpandableStickyListHeadersListView) findViewById(R.id.expandableStickyListHeadersListView);
        this.loadingFeatures = (TextView) findViewById(R.id.loading_features);
        String stringExtra = getIntent().getStringExtra("bID");
        String stringExtra2 = getIntent().getStringExtra("mID");
        String stringExtra3 = getIntent().getStringExtra("vehType");
        String stringExtra4 = getIntent().getStringExtra("vID");
        setTitle(getIntent().getStringExtra("vName"));
        getVariantFeatures(stringExtra, stringExtra2, stringExtra3, stringExtra4);
        this.fb_banner_container_features = (LinearLayout) findViewById(R.id.fb_banner_features);
        this.adContainerView = (FrameLayout) findViewById(R.id.ad_view_features);
        boolean showAdMobBanner = DataHandler.showAdMobBanner(this);
        if (PreferenceManager.getDefaultSharedPreferences(this).getString("ShowBanner", "false").equals("true") && showAdMobBanner) {
            this.adContainerView.post(new Runnable() {
                public void run() {
                    VehicleFeatures.this.loadBanner();
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
