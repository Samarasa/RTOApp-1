package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

import android.content.Context;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.C0094a;
import androidx.appcompat.app.o;
import androidx.recyclerview.widget.C0185k;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.c;
import com.google.android.gms.ads.d;
import com.google.android.gms.ads.e;
import com.google.android.gms.ads.formats.j;
import com.google.android.gms.ads.h;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CautionarySignals extends o {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int NUMBER_OF_AD_MOB_ADS = 1;
    private FrameLayout adContainerView;
    boolean adLoaded;
    /* access modifiers changed from: private */
    public d adLoader;
    LinearLayout adView;
    private h adViewBanner1;
    CautionAdapter cautionAdapter;
    /* access modifiers changed from: private */
    public List<Object> cautionList = new ArrayList();
    private String[] cautionary = {"Right hand curve", "Left hand curve", "Right hair pin bend", "Left hair pin bend", "Right reverse bend", "Left reverse bend", "Steep ascent", "Steep descent", "Quary side or river bank", "Overhead cable", "Narrow road ahead", "Road wideness ahead", "Narrow Bridge", "Slippery Road", "Loose Gravel", "Cycle Crossing", "Pedestrian Crossing", "School ahead", "Men at work", "Cattle", "Falling Rocks", "Ferry", "Cross Road", "Gap in Median", "Side Road Right", "Side Road Left", "Y-Intersection", "Y-Intersection", "Y-Intersection", "T-Intersection", "Staggered Intersection", "Staggered Intersection", "Major road ahead", "Major road ahead", "Roundabout", BuildConfig.FLAVOR, "Dangerous Dip", "Hump or rough road", "Barrier ahead", "Start of dual carriageway", "End of dual carriageway", "Reduced carriageway", "Reduced carriageway", "Two way operation", "Traffic diversion", "Traffic signals", "Lane closure", BuildConfig.FLAVOR, "Lane closure", "Runway", "Series of bends", "Sudden side wind", "Rumble strip", "Speed breaker", "Unguarded railway crossing 200 meters", "Unguarded railway crossing 50-100 meters", "Guarded railway crossing 200 meters", "Guarded railway crossing 50-100 meters"};
    boolean dataLoaded;
    private String[] drivingRules = {"Signal for Left turn~1", "Signal for right turn~2", "Signal for stopping~3", "Signal for slowing down~4", "Signal for allowing overtaking~5"};
    LinearLayout fb_banner_container_cautionary_signal;
    ImageView goBack;
    private String[] informatory = {"Advanced direction sign~1", "Destination sign~2", "Re-assurance sign~3", "Direction sign~4", "Place identification~5", "Park this Side~15", "Petrol Pump~7", "Hospital~8", "Eating Place~10", "Light Refreshment~11", "No through road~12", "No through side road~13", "First aid post~14", "Public telephone~6", "Parking both sides~16", "Parking lot Bikes~17", "Parking lot Auto~19", "Parking lot Taxis~19", "Parking lot Cycles~18"};
    private TextView loadingSignals;
    /* access modifiers changed from: private */
    public List<j> mNativeAds = new ArrayList();
    private String[] mandatory = {"No Entry~2", "One Way~3", "One Way~4", "No Way in Both Directions~5", "All vehicles prohibited~6", "Trucks prohibited~7", "Cycles prohibited~8", "Horns prohibited~9", "Carts prohibited~10", "Bullock carts prohibited~11", "Tongas prohibited~12", "Hand carts prohibited~13", "Pedestrians prohibited~14", "Right turn prohibited~15", "Left turn prohibited~16", "U-turn prohibited~17", "Overtaking prohibited~18", "No Parking~19", "No stopping~20", "Speed Limit~21", "Width Limit~22", "Height Limit~23", "Length Limit~24", "Load Limit~25", "Axle load Limit~26", "Buses only~27", "Restriction ends sign~28", "Compulsory cycle track~29", "Compulsory sound track~30", "Compulsory keep left~31", "Compulsory turn left~32", "Compulsory turn right~33", "Compulsory ahead or turn right~34", "Compulsory ahead or turn left~35", "Compulsory ahead~36", "Slip road ahead~37", "Main road ahead~38", "Stop~39", "Give way~40"};
    private j nativeAd;
    private String[] trafficS = {"Stop~1", "Be Alert~2", "Go~3", "Steady Green Arrow Signal~4", "Flashing Red Signal~5"};
    RecyclerView trafficSignals;
    TextView typeOfSignals;

    public CautionarySignals() {
    }

    private void loadAdMobNativeAds() {
        d.a aVar = new d.a((Context) this, getString(R.string.admob_native_id));
        aVar.a((j.a) new j.a() {
            public void onUnifiedNativeAdLoaded(j jVar) {
                CautionarySignals.this.mNativeAds.add(jVar);
                if (!CautionarySignals.this.adLoader.a()) {
                    CautionarySignals cautionarySignals = CautionarySignals.this;
                    cautionarySignals.adLoaded = true;
                    cautionarySignals.placeAdsInAdapter();
                }
            }
        });
        aVar.a((c) new c() {
            public void onAdFailedToLoad(int i) {
                Log.e("MainActivity", "The previous native ad failed to load. Attempting to load another.");
                if (!CautionarySignals.this.adLoader.a()) {
                    CautionarySignals cautionarySignals = CautionarySignals.this;
                    cautionarySignals.adLoaded = true;
                    cautionarySignals.placeAdsInAdapter();
                }
            }
        });
        this.adLoader = aVar.a();
        this.adLoader.a(new e.a().a(), 1);
    }

    /* access modifiers changed from: private */
    public void loadBanner() {
        this.adViewBanner1 = new h(this);
        this.adViewBanner1.setAdUnitId(getString(R.string.admob_banner_id));
        this.adContainerView.removeAllViews();
        this.adContainerView.addView(this.adViewBanner1);
        this.adViewBanner1.setAdSize(DataHandler.getAdSize(this, this.adContainerView));
        e.a aVar = new e.a();
        aVar.b("B3EEABB8EE11C2BE770B684D95219ECB");
        this.adViewBanner1.a(aVar.a());
    }

    /* access modifiers changed from: private */
    public void placeAdsInAdapter() {
        if (this.adLoaded && this.dataLoaded) {
            if (this.cautionList.size() > 0 && this.mNativeAds.size() > 0) {
                this.cautionList.add(6, this.mNativeAds.get(0));
            }
            this.cautionAdapter = new CautionAdapter(this, this.cautionList);
            GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
            gridLayoutManager.a((GridLayoutManager.c) new GridLayoutManager.c() {
                public int getSpanSize(int i) {
                    return CautionarySignals.this.cautionList.get(i) instanceof j ? 2 : 1;
                }
            });
            this.trafficSignals.setLayoutManager(gridLayoutManager);
            this.trafficSignals.setItemAnimator(new C0185k());
            this.trafficSignals.setAdapter(this.cautionAdapter);
            this.loadingSignals.setVisibility(8);
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
        DataHandler.showAd(this);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        boolean z;
        boolean z2;
        VehicleInfoHandler vehicleInfoHandler;
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_cautionary_signals);
        char c2 = 1;
        ((C0094a) Objects.requireNonNull(getSupportActionBar())).d(true);
        this.loadingSignals = (TextView) findViewById(R.id.loading_signals);
        this.trafficSignals = (RecyclerView) findViewById(R.id.traffic_signals);
        String stringExtra = getIntent().getStringExtra("type");
        int i = 0;
        if (stringExtra.equals("caution")) {
            setTitle("Cautionary Signals");
            while (true) {
                String[] strArr = this.cautionary;
                if (i >= strArr.length) {
                    break;
                }
                if (!(i == 35 || i == 47)) {
                    this.cautionList.add(new CautionBean(strArr[i], PreferenceManager.getDefaultSharedPreferences(this).getString("api_rto_signals", BuildConfig.FLAVOR) + "cautionary" + (i + 1) + ".png"));
                }
                i++;
            }
        } else if (stringExtra.equals("mandatory")) {
            setTitle("Mandatory Signals");
            String[] strArr2 = this.mandatory;
            int length = strArr2.length;
            int i2 = 0;
            while (i2 < length) {
                String str = strArr2[i2];
                this.cautionList.add(new CautionBean(str.split("~")[i], PreferenceManager.getDefaultSharedPreferences(this).getString("api_rto_signals", BuildConfig.FLAVOR) + "traffic" + str.split("~")[1] + ".png"));
                i2++;
                i = 0;
            }
        } else if (stringExtra.equals("informatory")) {
            setTitle("Informatory Signals");
            for (String str2 : this.informatory) {
                this.cautionList.add(new CautionBean(str2.split("~")[0], PreferenceManager.getDefaultSharedPreferences(this).getString("api_rto_signals", BuildConfig.FLAVOR) + "info" + str2.split("~")[1] + ".png"));
            }
        } else if (stringExtra.equals("traffic")) {
            setTitle("Traffic Signals");
            String[] strArr3 = this.trafficS;
            int length2 = strArr3.length;
            int i3 = 0;
            while (i3 < length2) {
                String str3 = strArr3[i3];
                if (str3.split("~")[c2].equals("5")) {
                    this.cautionList.add(new CautionBean(str3.split("~")[0], PreferenceManager.getDefaultSharedPreferences(this).getString("api_rto_signals", BuildConfig.FLAVOR) + "traffics" + str3.split("~")[c2] + ".png"));
                } else {
                    this.cautionList.add(new CautionBean(str3.split("~")[0], PreferenceManager.getDefaultSharedPreferences(this).getString("api_rto_signals", BuildConfig.FLAVOR) + "traffics" + str3.split("~")[1] + ".jpg"));
                }
                i3++;
                c2 = 1;
            }
            for (String str4 : this.drivingRules) {
                this.cautionList.add(new CautionBean(str4.split("~")[0], PreferenceManager.getDefaultSharedPreferences(this).getString("api_rto_signals", BuildConfig.FLAVOR) + "driver" + str4.split("~")[1] + ".jpg"));
            }
        }
        if (this.cautionList.size() > 0) {
            this.dataLoaded = true;
            placeAdsInAdapter();
        }
        if (PreferenceManager.getDefaultSharedPreferences(this).getString("showNativeAD", BuildConfig.FLAVOR).equals("true")) {
            String string = PreferenceManager.getDefaultSharedPreferences(this).getString("AdRotationPolicyNative", BuildConfig.FLAVOR);
            String string2 = PreferenceManager.getDefaultSharedPreferences(this).getString("NativeOnlyFB", BuildConfig.FLAVOR);
            String string3 = PreferenceManager.getDefaultSharedPreferences(this).getString("NativeOnlyGoogle", BuildConfig.FLAVOR);
            if (string.equals("true")) {
                if (VehicleInfoHandler.getInstance() != null) {
                    if (VehicleInfoHandler.getInstance().isFb_native()) {
                        vehicleInfoHandler = VehicleInfoHandler.getInstance();
                        z2 = VehicleInfoHandler.getInstance().isFb_native();
                        z = true;
                    } else {
                        z = true;
                        loadAdMobNativeAds();
                        vehicleInfoHandler = VehicleInfoHandler.getInstance();
                        z2 = VehicleInfoHandler.getInstance().isFb_native();
                    }
                    vehicleInfoHandler.setFb_native(z2 ^ z);
                }
            } else if (!string2.equals("true") && string3.equals("true")) {
                loadAdMobNativeAds();
            }
        } else {
            this.adLoaded = true;
            placeAdsInAdapter();
        }
        this.fb_banner_container_cautionary_signal = (LinearLayout) findViewById(R.id.fb_banner_cautionary_signal);
        this.adContainerView = (FrameLayout) findViewById(R.id.ad_view_cautionary);
        boolean showAdMobBanner = DataHandler.showAdMobBanner(this);
        if (PreferenceManager.getDefaultSharedPreferences(this).getString("ShowBanner", "false").equals("true") && showAdMobBanner) {
            this.adContainerView.post(new Runnable() {
                public void run() {
                    CautionarySignals.this.loadBanner();
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
