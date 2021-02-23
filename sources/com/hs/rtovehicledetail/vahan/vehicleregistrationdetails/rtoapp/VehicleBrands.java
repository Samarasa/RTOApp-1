package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

import android.content.Context;
import android.os.AsyncTask;
import android.preference.PreferenceManager;
import android.util.Base64;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.o;
import androidx.recyclerview.widget.C0185k;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b.h.j.y;
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
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

public class VehicleBrands extends o {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int NUMBER_OF_AD_MOB_ADS = 1;
    private FrameLayout adContainerView;
    boolean adLoaded;
    /* access modifiers changed from: private */
    public d adLoader;
    LinearLayout adView;
    private h adViewbanner;
    private TextView brandName;
    private VehicleBrandsAdapter brandsAdapter;
    /* access modifiers changed from: private */
    public List<Object> brandsBean = new ArrayList();
    private RecyclerView brandsList;
    boolean dataLoaded;
    LinearLayout fb_banner_container_brands;
    private ImageView goBack;
    private TextView loadingBrands;
    /* access modifiers changed from: private */
    public List<j> mNativeAds = new ArrayList();
    private j nativeAd;

    private void getBrands(final String str) {
        MainActivity mainActivity = MainActivity.mObj;
        final String returnADIDCount = mainActivity != null ? mainActivity.returnADIDCount() : BuildConfig.FLAVOR;
        String str2 = null;
        try {
            str2 = new String(Base64.encode(("brnad_type:" + str).getBytes(), 0), "UTF-8");
        } catch (UnsupportedEncodingException e2) {
            e2.printStackTrace();
        }
        final String replaceAll = MainActivity.insertPeriodically(str2.replaceAll("\n", BuildConfig.FLAVOR), "a", 1).replaceAll("\n", BuildConfig.FLAVOR);
        new AsyncTask<Void, Integer, String>() {
            J body;

            {
                x.a aVar = new x.a();
                aVar.a("cookie", replaceAll);
                aVar.a("auth", returnADIDCount);
                this.body = aVar.a();
            }

            /* access modifiers changed from: protected */
            public String doInBackground(Void... voidArr) {
                E.a aVar = new E.a();
                aVar.a(30, TimeUnit.SECONDS);
                aVar.c(30, TimeUnit.SECONDS);
                aVar.b(90, TimeUnit.SECONDS);
                E a2 = aVar.a();
                A.a i = A.c(PreferenceManager.getDefaultSharedPreferences(VehicleBrands.this).getString("api_rto_brand", BuildConfig.FLAVOR)).i();
                H.a aVar2 = new H.a();
                aVar2.b(i.a().toString());
                aVar2.a(this.body);
                try {
                    return a2.a(aVar2.a()).execute().a().t().toString();
                } catch (IOException e2) {
                    e2.printStackTrace();
                    return BuildConfig.FLAVOR;
                }
            }

            /* access modifiers changed from: protected */
            public void onPostExecute(String str) {
                List access$100;
                VehicleBrandsBean vehicleBrandsBean;
                super.onPostExecute(str);
                try {
                    JSONObject jSONObject = new JSONObject(new String(str));
                    if (jSONObject.getString("status").equals("1")) {
                        JSONArray jSONArray = jSONObject.getJSONArray("brandsList");
                        for (int i = 0; i < jSONArray.length(); i++) {
                            String str2 = str;
                            char c2 = 65535;
                            switch (str2.hashCode()) {
                                case 49:
                                    if (str2.equals("1")) {
                                        c2 = 1;
                                        break;
                                    }
                                    break;
                                case 50:
                                    if (str2.equals("2")) {
                                        c2 = 0;
                                        break;
                                    }
                                    break;
                                case 51:
                                    if (str2.equals("3")) {
                                        c2 = 2;
                                        break;
                                    }
                                    break;
                            }
                            if (c2 != 0) {
                                if (c2 == 1) {
                                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                                    VehicleBrands.this.brandsBean.add(new VehicleBrandsBean(jSONObject2.getString("cb_name"), jSONObject2.getString("cb_id"), jSONObject2.getString("cb_image"), str));
                                } else if (c2 == 2) {
                                    JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                                    access$100 = VehicleBrands.this.brandsBean;
                                    vehicleBrandsBean = new VehicleBrandsBean(jSONObject3.getString("bb_name"), jSONObject3.getString("bb_id"), jSONObject3.getString("bb_image"), str);
                                }
                            } else {
                                JSONObject jSONObject4 = jSONArray.getJSONObject(i);
                                access$100 = VehicleBrands.this.brandsBean;
                                vehicleBrandsBean = new VehicleBrandsBean(jSONObject4.getString("bb_name"), jSONObject4.getString("bb_id"), jSONObject4.getString("bb_image"), str);
                            }
                            access$100.add(vehicleBrandsBean);
                        }
                        if (VehicleBrands.this.brandsBean.size() > 0) {
                            VehicleBrands.this.dataLoaded = true;
                            VehicleBrands.this.placeAdsInAdapter();
                            return;
                        }
                        VehicleBrands.this.finish();
                    }
                } catch (Exception e2) {
                    PrintStream printStream = System.out;
                    printStream.println("e" + e2);
                    Toast.makeText(VehicleBrands.this, "Try another brand", 0).show();
                    VehicleBrands.this.finish();
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
                VehicleBrands.this.mNativeAds.add(jVar);
                if (!VehicleBrands.this.adLoader.a()) {
                    VehicleBrands vehicleBrands = VehicleBrands.this;
                    vehicleBrands.adLoaded = true;
                    vehicleBrands.placeAdsInAdapter();
                }
            }
        });
        aVar.a((c) new c() {
            public void onAdFailedToLoad(int i) {
                Log.e("MainActivity", "The previous native ad failed to load. Attempting to load another.");
                if (!VehicleBrands.this.adLoader.a()) {
                    VehicleBrands vehicleBrands = VehicleBrands.this;
                    vehicleBrands.adLoaded = true;
                    vehicleBrands.placeAdsInAdapter();
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
            if (this.brandsBean.size() > 0 && this.mNativeAds.size() > 0) {
                this.brandsBean.add(6, this.mNativeAds.get(0));
            }
            this.brandsAdapter = new VehicleBrandsAdapter(this, this.brandsBean);
            GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
            gridLayoutManager.a((GridLayoutManager.c) new GridLayoutManager.c() {
                public int getSpanSize(int i) {
                    return VehicleBrands.this.brandsBean.get(i) instanceof j ? 2 : 1;
                }
            });
            this.brandsList.setLayoutManager(gridLayoutManager);
            this.brandsList.setItemAnimator(new C0185k());
            this.brandsList.setAdapter(this.brandsAdapter);
            y.c((View) this.brandsList, false);
            this.loadingBrands.setVisibility(8);
            this.brandsList.setVisibility(0);
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r7) {
        /*
            r6 = this;
            super.onCreate(r7)
            r7 = 2131558458(0x7f0d003a, float:1.8742232E38)
            r6.setContentView((int) r7)
            androidx.appcompat.app.a r7 = r6.getSupportActionBar()
            java.lang.Object r7 = java.util.Objects.requireNonNull(r7)
            androidx.appcompat.app.a r7 = (androidx.appcompat.app.C0094a) r7
            r0 = 1
            r7.d(r0)
            r7 = 2131361909(0x7f0a0075, float:1.8343584E38)
            android.view.View r7 = r6.findViewById(r7)
            androidx.recyclerview.widget.RecyclerView r7 = (androidx.recyclerview.widget.RecyclerView) r7
            r6.brandsList = r7
            r7 = 2131362145(0x7f0a0161, float:1.8344062E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r6.loadingBrands = r7
            android.content.Intent r7 = r6.getIntent()
            java.lang.String r1 = "type"
            java.lang.String r7 = r7.getStringExtra(r1)
            java.lang.String r1 = "1"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L_0x0045
            java.lang.String r1 = "Cars"
        L_0x0041:
            r6.setTitle(r1)
            goto L_0x005b
        L_0x0045:
            java.lang.String r1 = "2"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L_0x0050
            java.lang.String r1 = "Bikes"
            goto L_0x0041
        L_0x0050:
            java.lang.String r1 = "3"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L_0x005b
            java.lang.String r1 = "Scooty"
            goto L_0x0041
        L_0x005b:
            java.lang.String r1 = ""
            boolean r2 = r7.equals(r1)
            if (r2 != 0) goto L_0x0067
            r6.getBrands(r7)
            goto L_0x006a
        L_0x0067:
            r6.finish()
        L_0x006a:
            android.content.SharedPreferences r7 = android.preference.PreferenceManager.getDefaultSharedPreferences(r6)
            java.lang.String r2 = "showNativeAD"
            java.lang.String r7 = r7.getString(r2, r1)
            java.lang.String r2 = "true"
            boolean r7 = r7.equals(r2)
            if (r7 == 0) goto L_0x00d6
            android.content.SharedPreferences r7 = android.preference.PreferenceManager.getDefaultSharedPreferences(r6)
            java.lang.String r3 = "AdRotationPolicyNative"
            java.lang.String r7 = r7.getString(r3, r1)
            android.content.SharedPreferences r3 = android.preference.PreferenceManager.getDefaultSharedPreferences(r6)
            java.lang.String r4 = "NativeOnlyFB"
            java.lang.String r3 = r3.getString(r4, r1)
            android.content.SharedPreferences r4 = android.preference.PreferenceManager.getDefaultSharedPreferences(r6)
            java.lang.String r5 = "NativeOnlyGoogle"
            java.lang.String r1 = r4.getString(r5, r1)
            boolean r7 = r7.equals(r2)
            if (r7 == 0) goto L_0x00c5
            com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.VehicleInfoHandler r7 = com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.VehicleInfoHandler.getInstance()
            if (r7 == 0) goto L_0x00db
            com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.VehicleInfoHandler r7 = com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.VehicleInfoHandler.getInstance()
            boolean r7 = r7.isFb_native()
            if (r7 == 0) goto L_0x00b1
            goto L_0x00b4
        L_0x00b1:
            r6.loadAdMobNativeAds()
        L_0x00b4:
            com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.VehicleInfoHandler r7 = com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.VehicleInfoHandler.getInstance()
            com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.VehicleInfoHandler r1 = com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.VehicleInfoHandler.getInstance()
            boolean r1 = r1.isFb_native()
            r0 = r0 ^ r1
            r7.setFb_native(r0)
            goto L_0x00db
        L_0x00c5:
            boolean r7 = r3.equals(r2)
            if (r7 == 0) goto L_0x00cc
            goto L_0x00db
        L_0x00cc:
            boolean r7 = r1.equals(r2)
            if (r7 == 0) goto L_0x00db
            r6.loadAdMobNativeAds()
            goto L_0x00db
        L_0x00d6:
            r6.adLoaded = r0
            r6.placeAdsInAdapter()
        L_0x00db:
            r7 = 2131362052(0x7f0a0104, float:1.8343874E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            r6.fb_banner_container_brands = r7
            r7 = 2131361877(0x7f0a0055, float:1.8343519E38)
            android.view.View r7 = r6.findViewById(r7)
            android.widget.FrameLayout r7 = (android.widget.FrameLayout) r7
            r6.adContainerView = r7
            boolean r7 = com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.DataHandler.showAdMobBanner(r6)
            android.content.SharedPreferences r0 = android.preference.PreferenceManager.getDefaultSharedPreferences(r6)
            java.lang.String r1 = "ShowBanner"
            java.lang.String r3 = "false"
            java.lang.String r0 = r0.getString(r1, r3)
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0113
            if (r7 == 0) goto L_0x0113
            android.widget.FrameLayout r7 = r6.adContainerView
            com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.VehicleBrands$1 r0 = new com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.VehicleBrands$1
            r0.<init>()
            r7.post(r0)
        L_0x0113:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.VehicleBrands.onCreate(android.os.Bundle):void");
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
