package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.o;
import androidx.fragment.app.C0159i;
import c.a.a.k;
import com.google.android.gms.ads.d;
import com.google.android.gms.ads.e;
import com.google.android.gms.ads.formats.UnifiedNativeAdView;
import com.google.android.gms.ads.formats.c;
import com.google.android.gms.ads.formats.j;
import com.google.android.gms.ads.w;

public class ExitApp extends o {
    LinearLayout adView;
    ImageView eightImg;
    Button exit;
    ImageView fiveImg;
    ImageView fourImg;
    /* access modifiers changed from: private */
    public j nativeAd;
    ImageView nineImg;
    ImageView oneImg;
    LinearLayout ourApps;
    Button rate_us;
    ImageView sevenImg;
    ImageView sixImg;
    ImageView threeImg;
    ImageView twoImg;
    TextView view_all;

    private void refreshAd() {
        d.a aVar = new d.a((Context) this, getString(R.string.admob_native_id));
        aVar.a((j.a) new j.a() {
            public void onUnifiedNativeAdLoaded(j jVar) {
                if (ExitApp.this.nativeAd != null) {
                    ExitApp.this.nativeAd.a();
                }
                j unused = ExitApp.this.nativeAd = jVar;
                FrameLayout frameLayout = (FrameLayout) ExitApp.this.findViewById(R.id.ad_exit);
                UnifiedNativeAdView unifiedNativeAdView = (UnifiedNativeAdView) ExitApp.this.getLayoutInflater().inflate(R.layout.ad_unified, (ViewGroup) null);
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

    /* access modifiers changed from: package-private */
    public void loadOurApps() {
        if (VehicleInfoHandler.getInstance().getOurApp1Link() != null && VehicleInfoHandler.getInstance().getOurApp2Link() != null && VehicleInfoHandler.getInstance().getOurApp3Link() != null && VehicleInfoHandler.getInstance().getOurApp4Link() != null && VehicleInfoHandler.getInstance().getOurApp5Link() != null && VehicleInfoHandler.getInstance().getOurApp6Link() != null && VehicleInfoHandler.getInstance().getOurApp7Link() != null && VehicleInfoHandler.getInstance().getOurApp8Link() != null && VehicleInfoHandler.getInstance().getOurApp9Link() != null && VehicleInfoHandler.getInstance().getOurApp1icon() != null && VehicleInfoHandler.getInstance().getOurApp2icon() != null && VehicleInfoHandler.getInstance().getOurApp3icon() != null && VehicleInfoHandler.getInstance().getOurApp4icon() != null && VehicleInfoHandler.getInstance().getOurApp5icon() != null && VehicleInfoHandler.getInstance().getOurApp6icon() != null && VehicleInfoHandler.getInstance().getOurApp7icon() != null && VehicleInfoHandler.getInstance().getOurApp8icon() != null && VehicleInfoHandler.getInstance().getOurApp9icon() != null) {
            c.a.a.g.e a2 = new c.a.a.g.e().b((int) R.drawable.loading).a((int) R.drawable.ic_error_outline_black_24dp);
            if (!VehicleInfoHandler.getInstance().getOurApp1Link().equals(BuildConfig.FLAVOR)) {
                this.oneImg = (ImageView) findViewById(R.id.one);
                k<Drawable> a3 = c.a.a.c.a((C0159i) this).a(VehicleInfoHandler.getInstance().getOurApp1icon());
                a3.a(a2);
                a3.a(this.oneImg);
                ImageView imageView = this.oneImg;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    this.oneImg.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View view) {
                            ExitApp.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(VehicleInfoHandler.getInstance().getOurApp1Link())));
                        }
                    });
                }
            }
            if (!VehicleInfoHandler.getInstance().getOurApp2Link().equals(BuildConfig.FLAVOR)) {
                this.twoImg = (ImageView) findViewById(R.id.two);
                k<Drawable> a4 = c.a.a.c.a((C0159i) this).a(VehicleInfoHandler.getInstance().getOurApp2icon());
                a4.a(a2);
                a4.a(this.twoImg);
                ImageView imageView2 = this.twoImg;
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                    this.twoImg.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View view) {
                            ExitApp.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(VehicleInfoHandler.getInstance().getOurApp2Link())));
                        }
                    });
                }
            }
            if (!VehicleInfoHandler.getInstance().getOurApp3Link().equals(BuildConfig.FLAVOR)) {
                this.threeImg = (ImageView) findViewById(R.id.three);
                k<Drawable> a5 = c.a.a.c.a((C0159i) this).a(VehicleInfoHandler.getInstance().getOurApp3icon());
                a5.a(a2);
                a5.a(this.threeImg);
                ImageView imageView3 = this.threeImg;
                if (imageView3 != null) {
                    imageView3.setVisibility(0);
                    this.threeImg.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View view) {
                            ExitApp.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(VehicleInfoHandler.getInstance().getOurApp3Link())));
                        }
                    });
                }
            }
            if (!VehicleInfoHandler.getInstance().getOurApp4Link().equals(BuildConfig.FLAVOR)) {
                this.fourImg = (ImageView) findViewById(R.id.four);
                k<Drawable> a6 = c.a.a.c.a((C0159i) this).a(VehicleInfoHandler.getInstance().getOurApp4icon());
                a6.a(a2);
                a6.a(this.fourImg);
                ImageView imageView4 = this.fourImg;
                if (imageView4 != null) {
                    imageView4.setVisibility(0);
                    this.fourImg.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View view) {
                            ExitApp.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(VehicleInfoHandler.getInstance().getOurApp4Link())));
                        }
                    });
                }
            }
            if (!VehicleInfoHandler.getInstance().getOurApp5Link().equals(BuildConfig.FLAVOR)) {
                this.fiveImg = (ImageView) findViewById(R.id.five);
                k<Drawable> a7 = c.a.a.c.a((C0159i) this).a(VehicleInfoHandler.getInstance().getOurApp5icon());
                a7.a(a2);
                a7.a(this.fiveImg);
                ImageView imageView5 = this.fiveImg;
                if (imageView5 != null) {
                    imageView5.setVisibility(0);
                    this.fiveImg.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View view) {
                            ExitApp.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(VehicleInfoHandler.getInstance().getOurApp5Link())));
                        }
                    });
                }
            }
            if (!VehicleInfoHandler.getInstance().getOurApp6Link().equals(BuildConfig.FLAVOR)) {
                this.sixImg = (ImageView) findViewById(R.id.six);
                k<Drawable> a8 = c.a.a.c.a((C0159i) this).a(VehicleInfoHandler.getInstance().getOurApp6icon());
                a8.a(a2);
                a8.a(this.sixImg);
                ImageView imageView6 = this.sixImg;
                if (imageView6 != null) {
                    imageView6.setVisibility(0);
                    this.sixImg.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View view) {
                            ExitApp.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(VehicleInfoHandler.getInstance().getOurApp6Link())));
                        }
                    });
                }
            }
            if (!VehicleInfoHandler.getInstance().getOurApp7Link().equals(BuildConfig.FLAVOR)) {
                this.sevenImg = (ImageView) findViewById(R.id.seven);
                k<Drawable> a9 = c.a.a.c.a((C0159i) this).a(VehicleInfoHandler.getInstance().getOurApp7icon());
                a9.a(a2);
                a9.a(this.sevenImg);
                ImageView imageView7 = this.sevenImg;
                if (imageView7 != null) {
                    imageView7.setVisibility(0);
                    this.sevenImg.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View view) {
                            ExitApp.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(VehicleInfoHandler.getInstance().getOurApp7Link())));
                        }
                    });
                }
            }
            if (!VehicleInfoHandler.getInstance().getOurApp8Link().equals(BuildConfig.FLAVOR)) {
                this.eightImg = (ImageView) findViewById(R.id.eight);
                k<Drawable> a10 = c.a.a.c.a((C0159i) this).a(VehicleInfoHandler.getInstance().getOurApp8icon());
                a10.a(a2);
                a10.a(this.eightImg);
                ImageView imageView8 = this.eightImg;
                if (imageView8 != null) {
                    imageView8.setVisibility(0);
                    this.eightImg.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View view) {
                            ExitApp.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(VehicleInfoHandler.getInstance().getOurApp8Link())));
                        }
                    });
                }
            }
            if (!VehicleInfoHandler.getInstance().getOurApp9Link().equals(BuildConfig.FLAVOR)) {
                this.nineImg = (ImageView) findViewById(R.id.nine);
                k<Drawable> a11 = c.a.a.c.a((C0159i) this).a(VehicleInfoHandler.getInstance().getOurApp9icon());
                a11.a(a2);
                a11.a(this.nineImg);
                ImageView imageView9 = this.nineImg;
                if (imageView9 != null) {
                    imageView9.setVisibility(0);
                    this.nineImg.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View view) {
                            ExitApp.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(VehicleInfoHandler.getInstance().getOurApp9Link())));
                        }
                    });
                }
            }
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_exit_app);
        this.ourApps = (LinearLayout) findViewById(R.id.our_apps);
        this.rate_us = (Button) findViewById(R.id.rate_us);
        this.rate_us.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ExitApp.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + ExitApp.this.getApplication().getPackageName())));
            }
        });
        this.view_all = (TextView) findViewById(R.id.view_all);
        this.view_all.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ExitApp.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/developer?id=Hangover+Studios")));
            }
        });
        this.exit = (Button) findViewById(R.id.exit);
        this.exit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ExitApp.this.finish();
            }
        });
        if (PreferenceManager.getDefaultSharedPreferences(this).getString("deeku_showOurAppIcons", BuildConfig.FLAVOR).equals("true")) {
            this.ourApps.setVisibility(0);
            loadOurApps();
        } else {
            this.ourApps.setVisibility(8);
        }
        if (PreferenceManager.getDefaultSharedPreferences(this).getString("showNativeAD", BuildConfig.FLAVOR).equals("true")) {
            String string = PreferenceManager.getDefaultSharedPreferences(this).getString("AdRotationPolicyNative", BuildConfig.FLAVOR);
            String string2 = PreferenceManager.getDefaultSharedPreferences(this).getString("NativeOnlyFB", BuildConfig.FLAVOR);
            String string3 = PreferenceManager.getDefaultSharedPreferences(this).getString("NativeOnlyGoogle", BuildConfig.FLAVOR);
            if (string.equals("true")) {
                if (VehicleInfoHandler.getInstance() != null) {
                    if (!VehicleInfoHandler.getInstance().isFb_native()) {
                        refreshAd();
                    }
                    VehicleInfoHandler.getInstance().setFb_native(!VehicleInfoHandler.getInstance().isFb_native());
                }
            } else if (!string2.equals("true") && string3.equals("true")) {
                refreshAd();
            }
        }
    }
}
