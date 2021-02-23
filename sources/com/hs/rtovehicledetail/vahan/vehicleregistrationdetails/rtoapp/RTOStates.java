package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.app.C0094a;
import androidx.appcompat.app.o;
import androidx.recyclerview.widget.C0185k;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.e;
import com.google.android.gms.ads.formats.j;
import com.google.android.gms.ads.h;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RTOStates extends o {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private StateAdapter StatesAdapter;
    private FrameLayout adContainerView;
    LinearLayout adView;
    private h adViewbanner;
    LinearLayout fb_banner_container_rto_states;
    private ImageView goBack;
    private j nativeAd;
    private RecyclerView rtoStates;
    private List<StateBean> staesList = new ArrayList();
    private String[] stateNames = {"Andhra Pradesh", "Arunachal Pradesh", "Assam", "Bihar", "Chhattisgarh", "Goa", "Gujarat", "Haryana", "Himachal Pradesh", "Jammu & Kashmir", "Jharkhand", "Karnataka", "Kerala", "Madhya Pradesh", "Maharashtra", "Manipur", "Meghalaya", "Mizoram", "Nagaland", "Odisha (Orissa)", "Punjab", "Rajasthan", "Sikkim", "Tamil Nadu", "Telangana", "Tripura", "Uttar Pradesh", "Uttarakhand", "West Bengal", "Andaman and Nicobar Islands", "Chandigarh", "Dadra and Nagar Haveli", "Daman and Diu", "Lakshadweep", "Delhi", "Puducherry (Pondicherry)"};

    public RTOStates() {
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

    private void setMyAdapter() {
        this.StatesAdapter = new StateAdapter(this.staesList, this);
        this.rtoStates.setLayoutManager(new GridLayoutManager(this, 1));
        this.rtoStates.setItemAnimator(new C0185k());
        this.rtoStates.setAdapter(this.StatesAdapter);
    }

    public void onBackPressed() {
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_rtostates);
        ((C0094a) Objects.requireNonNull(getSupportActionBar())).d(true);
        setTitle("RTO Codes");
        this.rtoStates = (RecyclerView) findViewById(R.id.rto_states);
        for (String stateBean : this.stateNames) {
            this.staesList.add(new StateBean(stateBean));
        }
        setMyAdapter();
        this.fb_banner_container_rto_states = (LinearLayout) findViewById(R.id.fb_banner_rto_state);
        this.adContainerView = (FrameLayout) findViewById(R.id.ad_view_rto_state);
        boolean showAdMobBanner = DataHandler.showAdMobBanner(this);
        if (PreferenceManager.getDefaultSharedPreferences(this).getString("ShowBanner", "false").equals("true") && showAdMobBanner) {
            this.adContainerView.post(new Runnable() {
                public void run() {
                    RTOStates.this.loadBanner();
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
