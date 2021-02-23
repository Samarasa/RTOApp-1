package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.C0107n;
import androidx.appcompat.app.o;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.C0159i;
import c.a.a.k;
import com.google.android.gms.ads.d;
import com.google.android.gms.ads.e;
import com.google.android.gms.ads.formats.UnifiedNativeAdView;
import com.google.android.gms.ads.formats.c;
import com.google.android.gms.ads.formats.j;
import com.google.android.gms.ads.w;
import org.json.JSONObject;

public class V_DetailsActivity extends o {
    LinearLayout adView;
    CardView card_vage;
    CardView card_vchasis;
    CardView card_vclass;
    CardView card_vengin;
    CardView card_vfins;
    CardView card_vfuel;
    CardView card_viewaddress;
    CardView card_vins;
    CardView card_vmodel;
    CardView card_vnote;
    CardView card_vowner;
    CardView card_vregauth;
    CardView card_vregdate;
    CardView card_vstate;
    private ImageView eightImg;
    private ImageView fiveImg;
    private ImageView fourImg;
    Button helpButton;
    JSONObject jObjResult;
    /* access modifiers changed from: private */
    public j nativeAd;
    ImageView next;
    private ImageView nineImg;
    private ImageView oneImg;
    LinearLayout ourAppsDetails;
    ImageView previous;
    private LinearLayout rating_layout;
    ImageView search;
    private ImageView sevenImg;
    ImageView share;
    private ImageView sixImg;
    private ImageView starFive;
    private ImageView starFour;
    private ImageView starOne;
    private ImageView starThree;
    private ImageView starTwo;
    private ImageView threeImg;
    private ImageView twoImg;
    TextView vage;
    TextView vchasis;
    TextView vclass;
    TextView vengine;
    TextView vfinsValue;
    TextView vinsurance;
    TextView vmodel;
    TextView vowner;
    TextView vregauthority;
    TextView vregdate;
    TextView vregno;
    TextView vstate;
    TextView vtype;

    /* access modifiers changed from: private */
    public void openFeedback() {
        C0107n.a aVar = new C0107n.a(this);
        aVar.b((int) R.string.send_us_feedback);
        aVar.a((int) R.string.share_experience_with_us);
        aVar.b((int) R.string.ok, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intent = new Intent("android.intent.action.SENDTO", Uri.fromParts("mailto", "hangoverstudios.mobile@gmail.com", (String) null));
                intent.putExtra("android.intent.extra.SUBJECT", "Subject:Feedback");
                intent.putExtra("android.intent.extra.TEXT", "Body");
                V_DetailsActivity.this.startActivity(Intent.createChooser(intent, "Send email..."));
                DataHandler.getInstance();
                DataHandler.setRatingDone(V_DetailsActivity.this);
            }
        });
        aVar.a((int) R.string.cancel, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        aVar.c();
    }

    /* access modifiers changed from: private */
    public void ratingPlaystore() {
        DataHandler.getInstance();
        DataHandler.setRatingDone(this);
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + getPackageName())));
    }

    private void refreshAd() {
        d.a aVar = new d.a((Context) this, getString(R.string.admob_native_id));
        aVar.a((j.a) new j.a() {
            public void onUnifiedNativeAdLoaded(j jVar) {
                if (V_DetailsActivity.this.nativeAd != null) {
                    V_DetailsActivity.this.nativeAd.a();
                }
                j unused = V_DetailsActivity.this.nativeAd = jVar;
                FrameLayout frameLayout = (FrameLayout) V_DetailsActivity.this.findViewById(R.id.ad_details);
                UnifiedNativeAdView unifiedNativeAdView = (UnifiedNativeAdView) V_DetailsActivity.this.getLayoutInflater().inflate(R.layout.ad_unified, (ViewGroup) null);
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

    private void showOurReating() {
        if (!getIntent().hasExtra("from")) {
            DataHandler.showAd(this);
        } else if (getIntent().getStringExtra("from").equals("search") && !DataHandler.isRatingDone(this)) {
            startActivity(new Intent(this, RatingActivity.class));
        }
    }

    /* access modifiers changed from: package-private */
    public void loadOurApps() {
        if (VehicleInfoHandler.getInstance().getOurApp1Link() != null && VehicleInfoHandler.getInstance().getOurApp2Link() != null && VehicleInfoHandler.getInstance().getOurApp3Link() != null && VehicleInfoHandler.getInstance().getOurApp4Link() != null && VehicleInfoHandler.getInstance().getOurApp5Link() != null && VehicleInfoHandler.getInstance().getOurApp6Link() != null && VehicleInfoHandler.getInstance().getOurApp7Link() != null && VehicleInfoHandler.getInstance().getOurApp8Link() != null && VehicleInfoHandler.getInstance().getOurApp9Link() != null && VehicleInfoHandler.getInstance().getOurApp1icon() != null && VehicleInfoHandler.getInstance().getOurApp2icon() != null && VehicleInfoHandler.getInstance().getOurApp3icon() != null && VehicleInfoHandler.getInstance().getOurApp4icon() != null && VehicleInfoHandler.getInstance().getOurApp5icon() != null && VehicleInfoHandler.getInstance().getOurApp6icon() != null && VehicleInfoHandler.getInstance().getOurApp7icon() != null && VehicleInfoHandler.getInstance().getOurApp8icon() != null && VehicleInfoHandler.getInstance().getOurApp9icon() != null) {
            c.a.a.g.e a2 = new c.a.a.g.e().b((int) R.drawable.loading).a((int) R.drawable.ic_error_outline_black_24dp);
            if (!VehicleInfoHandler.getInstance().getOurApp1Link().equals(BuildConfig.FLAVOR)) {
                this.oneImg = (ImageView) findViewById(R.id.s_one);
                k<Drawable> a3 = c.a.a.c.a((C0159i) this).a(VehicleInfoHandler.getInstance().getOurApp1icon());
                a3.a(a2);
                a3.a(this.oneImg);
                ImageView imageView = this.oneImg;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    this.oneImg.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View view) {
                            V_DetailsActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(VehicleInfoHandler.getInstance().getOurApp1Link())));
                        }
                    });
                }
            }
            if (!VehicleInfoHandler.getInstance().getOurApp2Link().equals(BuildConfig.FLAVOR)) {
                this.twoImg = (ImageView) findViewById(R.id.s_two);
                k<Drawable> a4 = c.a.a.c.a((C0159i) this).a(VehicleInfoHandler.getInstance().getOurApp2icon());
                a4.a(a2);
                a4.a(this.twoImg);
                ImageView imageView2 = this.twoImg;
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                    this.twoImg.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View view) {
                            V_DetailsActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(VehicleInfoHandler.getInstance().getOurApp2Link())));
                        }
                    });
                }
            }
            if (!VehicleInfoHandler.getInstance().getOurApp3Link().equals(BuildConfig.FLAVOR)) {
                this.threeImg = (ImageView) findViewById(R.id.s_three);
                k<Drawable> a5 = c.a.a.c.a((C0159i) this).a(VehicleInfoHandler.getInstance().getOurApp3icon());
                a5.a(a2);
                a5.a(this.threeImg);
                ImageView imageView3 = this.threeImg;
                if (imageView3 != null) {
                    imageView3.setVisibility(0);
                    this.threeImg.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View view) {
                            V_DetailsActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(VehicleInfoHandler.getInstance().getOurApp3Link())));
                        }
                    });
                }
            }
            if (!VehicleInfoHandler.getInstance().getOurApp4Link().equals(BuildConfig.FLAVOR)) {
                this.fourImg = (ImageView) findViewById(R.id.s_four);
                k<Drawable> a6 = c.a.a.c.a((C0159i) this).a(VehicleInfoHandler.getInstance().getOurApp4icon());
                a6.a(a2);
                a6.a(this.fourImg);
                ImageView imageView4 = this.fourImg;
                if (imageView4 != null) {
                    imageView4.setVisibility(0);
                    this.fourImg.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View view) {
                            V_DetailsActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(VehicleInfoHandler.getInstance().getOurApp4Link())));
                        }
                    });
                }
            }
            if (!VehicleInfoHandler.getInstance().getOurApp5Link().equals(BuildConfig.FLAVOR)) {
                this.fiveImg = (ImageView) findViewById(R.id.s_five);
                k<Drawable> a7 = c.a.a.c.a((C0159i) this).a(VehicleInfoHandler.getInstance().getOurApp5icon());
                a7.a(a2);
                a7.a(this.fiveImg);
                ImageView imageView5 = this.fiveImg;
                if (imageView5 != null) {
                    imageView5.setVisibility(0);
                    this.fiveImg.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View view) {
                            V_DetailsActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(VehicleInfoHandler.getInstance().getOurApp5Link())));
                        }
                    });
                }
            }
            if (!VehicleInfoHandler.getInstance().getOurApp6Link().equals(BuildConfig.FLAVOR)) {
                this.sixImg = (ImageView) findViewById(R.id.s_six);
                k<Drawable> a8 = c.a.a.c.a((C0159i) this).a(VehicleInfoHandler.getInstance().getOurApp6icon());
                a8.a(a2);
                a8.a(this.sixImg);
                ImageView imageView6 = this.sixImg;
                if (imageView6 != null) {
                    imageView6.setVisibility(0);
                    this.sixImg.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View view) {
                            V_DetailsActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(VehicleInfoHandler.getInstance().getOurApp6Link())));
                        }
                    });
                }
            }
            if (!VehicleInfoHandler.getInstance().getOurApp7Link().equals(BuildConfig.FLAVOR)) {
                this.sevenImg = (ImageView) findViewById(R.id.s_seven);
                k<Drawable> a9 = c.a.a.c.a((C0159i) this).a(VehicleInfoHandler.getInstance().getOurApp7icon());
                a9.a(a2);
                a9.a(this.sevenImg);
                ImageView imageView7 = this.sevenImg;
                if (imageView7 != null) {
                    imageView7.setVisibility(0);
                    this.sevenImg.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View view) {
                            V_DetailsActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(VehicleInfoHandler.getInstance().getOurApp7Link())));
                        }
                    });
                }
            }
            if (!VehicleInfoHandler.getInstance().getOurApp8Link().equals(BuildConfig.FLAVOR)) {
                this.eightImg = (ImageView) findViewById(R.id.s_eight);
                k<Drawable> a10 = c.a.a.c.a((C0159i) this).a(VehicleInfoHandler.getInstance().getOurApp8icon());
                a10.a(a2);
                a10.a(this.eightImg);
                ImageView imageView8 = this.eightImg;
                if (imageView8 != null) {
                    imageView8.setVisibility(0);
                    this.eightImg.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View view) {
                            V_DetailsActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(VehicleInfoHandler.getInstance().getOurApp8Link())));
                        }
                    });
                }
            }
            if (!VehicleInfoHandler.getInstance().getOurApp9Link().equals(BuildConfig.FLAVOR)) {
                this.nineImg = (ImageView) findViewById(R.id.s_nine);
                k<Drawable> a11 = c.a.a.c.a((C0159i) this).a(VehicleInfoHandler.getInstance().getOurApp9icon());
                a11.a(a2);
                a11.a(this.nineImg);
                ImageView imageView9 = this.nineImg;
                if (imageView9 != null) {
                    imageView9.setVisibility(0);
                    this.nineImg.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View view) {
                            V_DetailsActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(VehicleInfoHandler.getInstance().getOurApp9Link())));
                        }
                    });
                }
            }
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
        DataHandler.showAd(this);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x02d7 A[Catch:{ JSONException -> 0x0432 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x030b A[Catch:{ JSONException -> 0x0432 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0316 A[Catch:{ JSONException -> 0x0432 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x034a A[Catch:{ JSONException -> 0x0432 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0355 A[Catch:{ JSONException -> 0x0432 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0389 A[Catch:{ JSONException -> 0x0432 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x03a7 A[Catch:{ JSONException -> 0x0432 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x03b0 A[Catch:{ JSONException -> 0x0432 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x03c5 A[Catch:{ JSONException -> 0x0432 }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x046d  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x04e0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r12) {
        /*
            r11 = this;
            java.lang.String r0 = "reg_no"
            java.lang.String r1 = "vfinance"
            java.lang.String r2 = "vinsurance"
            java.lang.String r3 = "vstate"
            java.lang.String r4 = "vage"
            java.lang.String r5 = "true"
            super.onCreate(r12)
            r12 = 2131558452(0x7f0d0034, float:1.874222E38)
            r11.setContentView((int) r12)
            androidx.appcompat.app.a r12 = r11.getSupportActionBar()
            java.lang.Object r12 = java.util.Objects.requireNonNull(r12)
            androidx.appcompat.app.a r12 = (androidx.appcompat.app.C0094a) r12
            r6 = 1
            r12.d(r6)
            r12 = 2131362289(0x7f0a01f1, float:1.8344354E38)
            android.view.View r12 = r11.findViewById(r12)
            android.widget.LinearLayout r12 = (android.widget.LinearLayout) r12
            r11.rating_layout = r12
            r12 = 2131362406(0x7f0a0266, float:1.8344592E38)
            android.view.View r12 = r11.findViewById(r12)
            android.widget.ImageView r12 = (android.widget.ImageView) r12
            r11.starOne = r12
            r12 = 2131362408(0x7f0a0268, float:1.8344596E38)
            android.view.View r12 = r11.findViewById(r12)
            android.widget.ImageView r12 = (android.widget.ImageView) r12
            r11.starTwo = r12
            r12 = 2131362407(0x7f0a0267, float:1.8344594E38)
            android.view.View r12 = r11.findViewById(r12)
            android.widget.ImageView r12 = (android.widget.ImageView) r12
            r11.starThree = r12
            r12 = 2131362405(0x7f0a0265, float:1.834459E38)
            android.view.View r12 = r11.findViewById(r12)
            android.widget.ImageView r12 = (android.widget.ImageView) r12
            r11.starFour = r12
            r12 = 2131362404(0x7f0a0264, float:1.8344588E38)
            android.view.View r12 = r11.findViewById(r12)
            android.widget.ImageView r12 = (android.widget.ImageView) r12
            r11.starFive = r12
            android.widget.ImageView r12 = r11.starFive
            com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.V_DetailsActivity$1 r7 = new com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.V_DetailsActivity$1
            r7.<init>()
            r12.setOnClickListener(r7)
            android.widget.ImageView r12 = r11.starFour
            com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.V_DetailsActivity$2 r7 = new com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.V_DetailsActivity$2
            r7.<init>()
            r12.setOnClickListener(r7)
            android.widget.ImageView r12 = r11.starThree
            com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.V_DetailsActivity$3 r7 = new com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.V_DetailsActivity$3
            r7.<init>()
            r12.setOnClickListener(r7)
            android.widget.ImageView r12 = r11.starTwo
            com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.V_DetailsActivity$4 r7 = new com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.V_DetailsActivity$4
            r7.<init>()
            r12.setOnClickListener(r7)
            android.widget.ImageView r12 = r11.starOne
            com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.V_DetailsActivity$5 r7 = new com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.V_DetailsActivity$5
            r7.<init>()
            r12.setOnClickListener(r7)
            com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.DataHandler.getInstance()
            boolean r12 = com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.DataHandler.isRatingDone(r11)
            r7 = 0
            r8 = 8
            if (r12 != 0) goto L_0x00a9
            android.widget.LinearLayout r12 = r11.rating_layout
            r12.setVisibility(r7)
            goto L_0x00ae
        L_0x00a9:
            android.widget.LinearLayout r12 = r11.rating_layout
            r12.setVisibility(r8)
        L_0x00ae:
            r12 = 2131362374(0x7f0a0246, float:1.8344527E38)
            android.view.View r12 = r11.findViewById(r12)
            android.widget.ImageView r12 = (android.widget.ImageView) r12
            r11.share = r12
            r12 = 2131362351(0x7f0a022f, float:1.834448E38)
            android.view.View r12 = r11.findViewById(r12)
            android.widget.ImageView r12 = (android.widget.ImageView) r12
            r11.search = r12
            r12 = 2131362213(0x7f0a01a5, float:1.83442E38)
            android.view.View r12 = r11.findViewById(r12)
            android.widget.ImageView r12 = (android.widget.ImageView) r12
            r11.next = r12
            r12 = 2131362258(0x7f0a01d2, float:1.8344292E38)
            android.view.View r12 = r11.findViewById(r12)
            android.widget.ImageView r12 = (android.widget.ImageView) r12
            r11.previous = r12
            r12 = 2131361946(0x7f0a009a, float:1.8343659E38)
            android.view.View r12 = r11.findViewById(r12)
            androidx.cardview.widget.CardView r12 = (androidx.cardview.widget.CardView) r12
            r11.card_vowner = r12
            r12 = 2131361929(0x7f0a0089, float:1.8343624E38)
            android.view.View r12 = r11.findViewById(r12)
            androidx.cardview.widget.CardView r12 = (androidx.cardview.widget.CardView) r12
            r11.card_vage = r12
            r12 = 2131361944(0x7f0a0098, float:1.8343655E38)
            android.view.View r12 = r11.findViewById(r12)
            androidx.cardview.widget.CardView r12 = (androidx.cardview.widget.CardView) r12
            r11.card_vmodel = r12
            r12 = 2131361942(0x7f0a0096, float:1.834365E38)
            android.view.View r12 = r11.findViewById(r12)
            androidx.cardview.widget.CardView r12 = (androidx.cardview.widget.CardView) r12
            r11.card_viewaddress = r12
            r12 = 2131361949(0x7f0a009d, float:1.8343665E38)
            android.view.View r12 = r11.findViewById(r12)
            androidx.cardview.widget.CardView r12 = (androidx.cardview.widget.CardView) r12
            r11.card_vstate = r12
            r12 = 2131361934(0x7f0a008e, float:1.8343634E38)
            android.view.View r12 = r11.findViewById(r12)
            androidx.cardview.widget.CardView r12 = (androidx.cardview.widget.CardView) r12
            r11.card_vfuel = r12
            r12 = 2131361931(0x7f0a008b, float:1.8343628E38)
            android.view.View r9 = r11.findViewById(r12)
            androidx.cardview.widget.CardView r9 = (androidx.cardview.widget.CardView) r9
            r11.card_vclass = r9
            android.view.View r12 = r11.findViewById(r12)
            androidx.cardview.widget.CardView r12 = (androidx.cardview.widget.CardView) r12
            r11.card_vclass = r12
            r12 = 2131361948(0x7f0a009c, float:1.8343663E38)
            android.view.View r12 = r11.findViewById(r12)
            androidx.cardview.widget.CardView r12 = (androidx.cardview.widget.CardView) r12
            r11.card_vregdate = r12
            r12 = 2131361932(0x7f0a008c, float:1.834363E38)
            android.view.View r12 = r11.findViewById(r12)
            androidx.cardview.widget.CardView r12 = (androidx.cardview.widget.CardView) r12
            r11.card_vengin = r12
            r12 = 2131361930(0x7f0a008a, float:1.8343626E38)
            android.view.View r12 = r11.findViewById(r12)
            androidx.cardview.widget.CardView r12 = (androidx.cardview.widget.CardView) r12
            r11.card_vchasis = r12
            r12 = 2131361945(0x7f0a0099, float:1.8343657E38)
            android.view.View r12 = r11.findViewById(r12)
            androidx.cardview.widget.CardView r12 = (androidx.cardview.widget.CardView) r12
            r11.card_vnote = r12
            r12 = 2131361933(0x7f0a008d, float:1.8343632E38)
            android.view.View r12 = r11.findViewById(r12)
            androidx.cardview.widget.CardView r12 = (androidx.cardview.widget.CardView) r12
            r11.card_vfins = r12
            r12 = 2131361947(0x7f0a009b, float:1.834366E38)
            android.view.View r12 = r11.findViewById(r12)
            androidx.cardview.widget.CardView r12 = (androidx.cardview.widget.CardView) r12
            r11.card_vregauth = r12
            r12 = 2131361943(0x7f0a0097, float:1.8343653E38)
            android.view.View r12 = r11.findViewById(r12)
            androidx.cardview.widget.CardView r12 = (androidx.cardview.widget.CardView) r12
            r11.card_vins = r12
            r12 = 2131362243(0x7f0a01c3, float:1.8344261E38)
            android.view.View r12 = r11.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r11.vowner = r12
            r12 = 2131362299(0x7f0a01fb, float:1.8344375E38)
            android.view.View r12 = r11.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r11.vregauthority = r12
            r12 = 2131362301(0x7f0a01fd, float:1.8344379E38)
            android.view.View r12 = r11.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r11.vregdate = r12
            r12 = 2131362156(0x7f0a016c, float:1.8344085E38)
            android.view.View r12 = r11.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r11.vmodel = r12
            r12 = 2131362492(0x7f0a02bc, float:1.8344766E38)
            android.view.View r12 = r11.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r11.vclass = r12
            r12 = 2131362092(0x7f0a012c, float:1.8343955E38)
            android.view.View r12 = r11.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r11.vtype = r12
            r12 = 2131361977(0x7f0a00b9, float:1.8343722E38)
            android.view.View r12 = r11.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r11.vchasis = r12
            r12 = 2131362039(0x7f0a00f7, float:1.8343847E38)
            android.view.View r12 = r11.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r11.vengine = r12
            r12 = 2131362485(0x7f0a02b5, float:1.8344752E38)
            android.view.View r12 = r11.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r11.vage = r12
            r12 = 2131362505(0x7f0a02c9, float:1.8344792E38)
            android.view.View r12 = r11.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r11.vstate = r12
            r12 = 2131362502(0x7f0a02c6, float:1.8344786E38)
            android.view.View r12 = r11.findViewById(r12)
            android.widget.TextView r12 = (android.widget.TextView) r12
            r11.vinsurance = r12
            java.lang.String r12 = ""
            com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.V_SearchActivity.fancyNumber = r12
            r9 = 2131362496(0x7f0a02c0, float:1.8344774E38)
            android.view.View r9 = r11.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r11.vfinsValue = r9
            android.content.Intent r9 = r11.getIntent()     // Catch:{ JSONException -> 0x0432 }
            java.lang.String r10 = "jObj"
            java.lang.String r9 = r9.getStringExtra(r10)     // Catch:{ JSONException -> 0x0432 }
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0432 }
            r10.<init>(r9)     // Catch:{ JSONException -> 0x0432 }
            r11.jObjResult = r10     // Catch:{ JSONException -> 0x0432 }
            org.json.JSONObject r9 = r11.jObjResult     // Catch:{ JSONException -> 0x0432 }
            java.lang.String r9 = r9.getString(r0)     // Catch:{ JSONException -> 0x0432 }
            r11.setTitle(r9)     // Catch:{ JSONException -> 0x0432 }
            org.json.JSONObject r9 = r11.jObjResult     // Catch:{ JSONException -> 0x0432 }
            java.lang.String r0 = r9.getString(r0)     // Catch:{ JSONException -> 0x0432 }
            com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.V_SearchActivity.vehicleNo = r0     // Catch:{ JSONException -> 0x0432 }
            android.widget.TextView r0 = r11.vowner     // Catch:{ JSONException -> 0x0432 }
            org.json.JSONObject r9 = r11.jObjResult     // Catch:{ JSONException -> 0x0432 }
            java.lang.String r10 = "owner_name"
            java.lang.String r9 = r9.getString(r10)     // Catch:{ JSONException -> 0x0432 }
            r0.setText(r9)     // Catch:{ JSONException -> 0x0432 }
            android.widget.TextView r0 = r11.vregauthority     // Catch:{ JSONException -> 0x0432 }
            org.json.JSONObject r9 = r11.jObjResult     // Catch:{ JSONException -> 0x0432 }
            java.lang.String r10 = "reg_at"
            java.lang.String r9 = r9.getString(r10)     // Catch:{ JSONException -> 0x0432 }
            r0.setText(r9)     // Catch:{ JSONException -> 0x0432 }
            android.widget.TextView r0 = r11.vregdate     // Catch:{ JSONException -> 0x0432 }
            org.json.JSONObject r9 = r11.jObjResult     // Catch:{ JSONException -> 0x0432 }
            java.lang.String r10 = "reg_date"
            java.lang.String r9 = r9.getString(r10)     // Catch:{ JSONException -> 0x0432 }
            r0.setText(r9)     // Catch:{ JSONException -> 0x0432 }
            android.widget.TextView r0 = r11.vmodel     // Catch:{ JSONException -> 0x0432 }
            org.json.JSONObject r9 = r11.jObjResult     // Catch:{ JSONException -> 0x0432 }
            java.lang.String r10 = "maker_model"
            java.lang.String r9 = r9.getString(r10)     // Catch:{ JSONException -> 0x0432 }
            r0.setText(r9)     // Catch:{ JSONException -> 0x0432 }
            android.widget.TextView r0 = r11.vclass     // Catch:{ JSONException -> 0x0432 }
            org.json.JSONObject r9 = r11.jObjResult     // Catch:{ JSONException -> 0x0432 }
            java.lang.String r10 = "vehicle_class"
            java.lang.String r9 = r9.getString(r10)     // Catch:{ JSONException -> 0x0432 }
            r0.setText(r9)     // Catch:{ JSONException -> 0x0432 }
            android.widget.TextView r0 = r11.vtype     // Catch:{ JSONException -> 0x0432 }
            org.json.JSONObject r9 = r11.jObjResult     // Catch:{ JSONException -> 0x0432 }
            java.lang.String r10 = "fuel_type"
            java.lang.String r9 = r9.getString(r10)     // Catch:{ JSONException -> 0x0432 }
            r0.setText(r9)     // Catch:{ JSONException -> 0x0432 }
            android.widget.TextView r0 = r11.vchasis     // Catch:{ JSONException -> 0x0432 }
            org.json.JSONObject r9 = r11.jObjResult     // Catch:{ JSONException -> 0x0432 }
            java.lang.String r10 = "chasi_no"
            java.lang.String r9 = r9.getString(r10)     // Catch:{ JSONException -> 0x0432 }
            r0.setText(r9)     // Catch:{ JSONException -> 0x0432 }
            android.widget.TextView r0 = r11.vengine     // Catch:{ JSONException -> 0x0432 }
            org.json.JSONObject r9 = r11.jObjResult     // Catch:{ JSONException -> 0x0432 }
            java.lang.String r10 = "engine_no"
            java.lang.String r9 = r9.getString(r10)     // Catch:{ JSONException -> 0x0432 }
            r0.setText(r9)     // Catch:{ JSONException -> 0x0432 }
            org.json.JSONObject r0 = r11.jObjResult     // Catch:{ JSONException -> 0x0432 }
            boolean r0 = r0.has(r4)     // Catch:{ JSONException -> 0x0432 }
            java.lang.String r9 = " "
            if (r0 == 0) goto L_0x02cc
            org.json.JSONObject r0 = r11.jObjResult     // Catch:{ JSONException -> 0x0432 }
            java.lang.String r0 = r0.getString(r4)     // Catch:{ JSONException -> 0x0432 }
            if (r0 == 0) goto L_0x02c9
            android.widget.TextView r0 = r11.vage     // Catch:{ JSONException -> 0x0432 }
            org.json.JSONObject r10 = r11.jObjResult     // Catch:{ JSONException -> 0x0432 }
            java.lang.String r10 = r10.getString(r4)     // Catch:{ JSONException -> 0x0432 }
            r0.setText(r10)     // Catch:{ JSONException -> 0x0432 }
            org.json.JSONObject r0 = r11.jObjResult     // Catch:{ JSONException -> 0x0432 }
            java.lang.String r0 = r0.getString(r4)     // Catch:{ JSONException -> 0x0432 }
            boolean r0 = r0.equals(r12)     // Catch:{ JSONException -> 0x0432 }
            if (r0 != 0) goto L_0x02c3
            org.json.JSONObject r0 = r11.jObjResult     // Catch:{ JSONException -> 0x0432 }
            java.lang.String r0 = r0.getString(r4)     // Catch:{ JSONException -> 0x0432 }
            boolean r0 = r0.equals(r9)     // Catch:{ JSONException -> 0x0432 }
            if (r0 == 0) goto L_0x02cf
        L_0x02c3:
            androidx.cardview.widget.CardView r0 = r11.card_vage     // Catch:{ JSONException -> 0x0432 }
        L_0x02c5:
            r0.setVisibility(r8)     // Catch:{ JSONException -> 0x0432 }
            goto L_0x02cf
        L_0x02c9:
            androidx.cardview.widget.CardView r0 = r11.card_vage     // Catch:{ JSONException -> 0x0432 }
            goto L_0x02c5
        L_0x02cc:
            androidx.cardview.widget.CardView r0 = r11.card_vage     // Catch:{ JSONException -> 0x0432 }
            goto L_0x02c5
        L_0x02cf:
            org.json.JSONObject r0 = r11.jObjResult     // Catch:{ JSONException -> 0x0432 }
            boolean r0 = r0.has(r3)     // Catch:{ JSONException -> 0x0432 }
            if (r0 == 0) goto L_0x030b
            org.json.JSONObject r0 = r11.jObjResult     // Catch:{ JSONException -> 0x0432 }
            java.lang.String r0 = r0.getString(r3)     // Catch:{ JSONException -> 0x0432 }
            if (r0 == 0) goto L_0x0308
            android.widget.TextView r0 = r11.vstate     // Catch:{ JSONException -> 0x0432 }
            org.json.JSONObject r4 = r11.jObjResult     // Catch:{ JSONException -> 0x0432 }
            java.lang.String r4 = r4.getString(r3)     // Catch:{ JSONException -> 0x0432 }
            r0.setText(r4)     // Catch:{ JSONException -> 0x0432 }
            org.json.JSONObject r0 = r11.jObjResult     // Catch:{ JSONException -> 0x0432 }
            java.lang.String r0 = r0.getString(r3)     // Catch:{ JSONException -> 0x0432 }
            boolean r0 = r0.equals(r12)     // Catch:{ JSONException -> 0x0432 }
            if (r0 != 0) goto L_0x0302
            org.json.JSONObject r0 = r11.jObjResult     // Catch:{ JSONException -> 0x0432 }
            java.lang.String r0 = r0.getString(r3)     // Catch:{ JSONException -> 0x0432 }
            boolean r0 = r0.equals(r9)     // Catch:{ JSONException -> 0x0432 }
            if (r0 == 0) goto L_0x030e
        L_0x0302:
            androidx.cardview.widget.CardView r0 = r11.card_vstate     // Catch:{ JSONException -> 0x0432 }
        L_0x0304:
            r0.setVisibility(r8)     // Catch:{ JSONException -> 0x0432 }
            goto L_0x030e
        L_0x0308:
            androidx.cardview.widget.CardView r0 = r11.card_vstate     // Catch:{ JSONException -> 0x0432 }
            goto L_0x0304
        L_0x030b:
            androidx.cardview.widget.CardView r0 = r11.card_vstate     // Catch:{ JSONException -> 0x0432 }
            goto L_0x0304
        L_0x030e:
            org.json.JSONObject r0 = r11.jObjResult     // Catch:{ JSONException -> 0x0432 }
            boolean r0 = r0.has(r2)     // Catch:{ JSONException -> 0x0432 }
            if (r0 == 0) goto L_0x034a
            org.json.JSONObject r0 = r11.jObjResult     // Catch:{ JSONException -> 0x0432 }
            java.lang.String r0 = r0.getString(r2)     // Catch:{ JSONException -> 0x0432 }
            if (r0 == 0) goto L_0x0347
            android.widget.TextView r0 = r11.vinsurance     // Catch:{ JSONException -> 0x0432 }
            org.json.JSONObject r3 = r11.jObjResult     // Catch:{ JSONException -> 0x0432 }
            java.lang.String r3 = r3.getString(r2)     // Catch:{ JSONException -> 0x0432 }
            r0.setText(r3)     // Catch:{ JSONException -> 0x0432 }
            org.json.JSONObject r0 = r11.jObjResult     // Catch:{ JSONException -> 0x0432 }
            java.lang.String r0 = r0.getString(r2)     // Catch:{ JSONException -> 0x0432 }
            boolean r0 = r0.equals(r12)     // Catch:{ JSONException -> 0x0432 }
            if (r0 != 0) goto L_0x0341
            org.json.JSONObject r0 = r11.jObjResult     // Catch:{ JSONException -> 0x0432 }
            java.lang.String r0 = r0.getString(r2)     // Catch:{ JSONException -> 0x0432 }
            boolean r0 = r0.equals(r9)     // Catch:{ JSONException -> 0x0432 }
            if (r0 == 0) goto L_0x034d
        L_0x0341:
            androidx.cardview.widget.CardView r0 = r11.card_vins     // Catch:{ JSONException -> 0x0432 }
        L_0x0343:
            r0.setVisibility(r8)     // Catch:{ JSONException -> 0x0432 }
            goto L_0x034d
        L_0x0347:
            androidx.cardview.widget.CardView r0 = r11.card_vins     // Catch:{ JSONException -> 0x0432 }
            goto L_0x0343
        L_0x034a:
            androidx.cardview.widget.CardView r0 = r11.card_vins     // Catch:{ JSONException -> 0x0432 }
            goto L_0x0343
        L_0x034d:
            org.json.JSONObject r0 = r11.jObjResult     // Catch:{ JSONException -> 0x0432 }
            boolean r0 = r0.has(r1)     // Catch:{ JSONException -> 0x0432 }
            if (r0 == 0) goto L_0x0389
            org.json.JSONObject r0 = r11.jObjResult     // Catch:{ JSONException -> 0x0432 }
            java.lang.String r0 = r0.getString(r1)     // Catch:{ JSONException -> 0x0432 }
            if (r0 == 0) goto L_0x0386
            android.widget.TextView r0 = r11.vfinsValue     // Catch:{ JSONException -> 0x0432 }
            org.json.JSONObject r2 = r11.jObjResult     // Catch:{ JSONException -> 0x0432 }
            java.lang.String r2 = r2.getString(r1)     // Catch:{ JSONException -> 0x0432 }
            r0.setText(r2)     // Catch:{ JSONException -> 0x0432 }
            org.json.JSONObject r0 = r11.jObjResult     // Catch:{ JSONException -> 0x0432 }
            java.lang.String r0 = r0.getString(r1)     // Catch:{ JSONException -> 0x0432 }
            boolean r0 = r0.equals(r12)     // Catch:{ JSONException -> 0x0432 }
            if (r0 != 0) goto L_0x0380
            org.json.JSONObject r0 = r11.jObjResult     // Catch:{ JSONException -> 0x0432 }
            java.lang.String r0 = r0.getString(r1)     // Catch:{ JSONException -> 0x0432 }
            boolean r0 = r0.equals(r9)     // Catch:{ JSONException -> 0x0432 }
            if (r0 == 0) goto L_0x038c
        L_0x0380:
            androidx.cardview.widget.CardView r0 = r11.card_vfins     // Catch:{ JSONException -> 0x0432 }
        L_0x0382:
            r0.setVisibility(r8)     // Catch:{ JSONException -> 0x0432 }
            goto L_0x038c
        L_0x0386:
            androidx.cardview.widget.CardView r0 = r11.card_vfins     // Catch:{ JSONException -> 0x0432 }
            goto L_0x0382
        L_0x0389:
            androidx.cardview.widget.CardView r0 = r11.card_vfins     // Catch:{ JSONException -> 0x0432 }
            goto L_0x0382
        L_0x038c:
            r0 = 2131362236(0x7f0a01bc, float:1.8344247E38)
            android.view.View r0 = r11.findViewById(r0)     // Catch:{ JSONException -> 0x0432 }
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0     // Catch:{ JSONException -> 0x0432 }
            r11.ourAppsDetails = r0     // Catch:{ JSONException -> 0x0432 }
            android.content.SharedPreferences r0 = android.preference.PreferenceManager.getDefaultSharedPreferences(r11)     // Catch:{ JSONException -> 0x0432 }
            java.lang.String r1 = "deeku_showOurAppIcons"
            java.lang.String r0 = r0.getString(r1, r12)     // Catch:{ JSONException -> 0x0432 }
            boolean r0 = r0.equals(r5)     // Catch:{ JSONException -> 0x0432 }
            if (r0 == 0) goto L_0x03b0
            android.widget.LinearLayout r0 = r11.ourAppsDetails     // Catch:{ JSONException -> 0x0432 }
            r0.setVisibility(r7)     // Catch:{ JSONException -> 0x0432 }
            r11.loadOurApps()     // Catch:{ JSONException -> 0x0432 }
            goto L_0x03b5
        L_0x03b0:
            android.widget.LinearLayout r0 = r11.ourAppsDetails     // Catch:{ JSONException -> 0x0432 }
            r0.setVisibility(r8)     // Catch:{ JSONException -> 0x0432 }
        L_0x03b5:
            android.content.SharedPreferences r0 = android.preference.PreferenceManager.getDefaultSharedPreferences(r11)     // Catch:{ JSONException -> 0x0432 }
            java.lang.String r1 = "showNativeAD"
            java.lang.String r0 = r0.getString(r1, r12)     // Catch:{ JSONException -> 0x0432 }
            boolean r0 = r0.equals(r5)     // Catch:{ JSONException -> 0x0432 }
            if (r0 == 0) goto L_0x0436
            android.content.SharedPreferences r0 = android.preference.PreferenceManager.getDefaultSharedPreferences(r11)     // Catch:{ JSONException -> 0x0432 }
            java.lang.String r1 = "AdRotationPolicyNative"
            java.lang.String r0 = r0.getString(r1, r12)     // Catch:{ JSONException -> 0x0432 }
            android.content.SharedPreferences r1 = android.preference.PreferenceManager.getDefaultSharedPreferences(r11)     // Catch:{ JSONException -> 0x0432 }
            java.lang.String r2 = "NativeOnlyFB"
            java.lang.String r1 = r1.getString(r2, r12)     // Catch:{ JSONException -> 0x0432 }
            android.content.SharedPreferences r2 = android.preference.PreferenceManager.getDefaultSharedPreferences(r11)     // Catch:{ JSONException -> 0x0432 }
            java.lang.String r3 = "NativeOnlyGoogle"
            java.lang.String r12 = r2.getString(r3, r12)     // Catch:{ JSONException -> 0x0432 }
            boolean r0 = r0.equals(r5)     // Catch:{ JSONException -> 0x0432 }
            if (r0 == 0) goto L_0x0421
            com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.VehicleInfoHandler r12 = com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.VehicleInfoHandler.getInstance()     // Catch:{ JSONException -> 0x0432 }
            if (r12 == 0) goto L_0x0436
            com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.VehicleInfoHandler r12 = com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.VehicleInfoHandler.getInstance()     // Catch:{ JSONException -> 0x0432 }
            boolean r12 = r12.isFb_native()     // Catch:{ JSONException -> 0x0432 }
            if (r12 == 0) goto L_0x040d
            com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.VehicleInfoHandler r12 = com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.VehicleInfoHandler.getInstance()     // Catch:{ JSONException -> 0x0432 }
            com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.VehicleInfoHandler r0 = com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.VehicleInfoHandler.getInstance()     // Catch:{ JSONException -> 0x0432 }
            boolean r0 = r0.isFb_native()     // Catch:{ JSONException -> 0x0432 }
            if (r0 != 0) goto L_0x0408
            goto L_0x0409
        L_0x0408:
            r6 = 0
        L_0x0409:
            r12.setFb_native(r6)     // Catch:{ JSONException -> 0x0432 }
            goto L_0x0436
        L_0x040d:
            r11.refreshAd()     // Catch:{ JSONException -> 0x0432 }
            com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.VehicleInfoHandler r12 = com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.VehicleInfoHandler.getInstance()     // Catch:{ JSONException -> 0x0432 }
            com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.VehicleInfoHandler r0 = com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.VehicleInfoHandler.getInstance()     // Catch:{ JSONException -> 0x0432 }
            boolean r0 = r0.isFb_native()     // Catch:{ JSONException -> 0x0432 }
            if (r0 != 0) goto L_0x041f
            goto L_0x0409
        L_0x041f:
            r6 = 0
            goto L_0x0409
        L_0x0421:
            boolean r0 = r1.equals(r5)     // Catch:{ JSONException -> 0x0432 }
            if (r0 == 0) goto L_0x0428
            goto L_0x0436
        L_0x0428:
            boolean r12 = r12.equals(r5)     // Catch:{ JSONException -> 0x0432 }
            if (r12 == 0) goto L_0x0436
            r11.refreshAd()     // Catch:{ JSONException -> 0x0432 }
            goto L_0x0436
        L_0x0432:
            r12 = move-exception
            r12.printStackTrace()
        L_0x0436:
            android.widget.ImageView r12 = r11.share
            com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.V_DetailsActivity$6 r0 = new com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.V_DetailsActivity$6
            r0.<init>()
            r12.setOnClickListener(r0)
            android.widget.ImageView r12 = r11.search
            com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.V_DetailsActivity$7 r0 = new com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.V_DetailsActivity$7
            r0.<init>()
            r12.setOnClickListener(r0)
            android.widget.ImageView r12 = r11.next
            com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.V_DetailsActivity$8 r0 = new com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.V_DetailsActivity$8
            r0.<init>()
            r12.setOnClickListener(r0)
            android.widget.ImageView r12 = r11.previous
            com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.V_DetailsActivity$9 r0 = new com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.V_DetailsActivity$9
            r0.<init>()
            r12.setOnClickListener(r0)
            r12 = 2131362304(0x7f0a0200, float:1.8344385E38)
            android.view.View r12 = r11.findViewById(r12)
            android.widget.Button r12 = (android.widget.Button) r12
            r11.helpButton = r12
            android.widget.Button r12 = r11.helpButton
            if (r12 == 0) goto L_0x0475
            com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.V_DetailsActivity$10 r0 = new com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.V_DetailsActivity$10
            r0.<init>()
            r12.setOnClickListener(r0)
        L_0x0475:
            android.content.Intent r12 = r11.getIntent()
            java.lang.String r0 = "showFin"
            boolean r12 = r12.hasExtra(r0)
            if (r12 == 0) goto L_0x04c6
            android.content.Intent r12 = r11.getIntent()
            java.lang.String r12 = r12.getStringExtra(r0)
            boolean r12 = r12.equals(r5)
            if (r12 == 0) goto L_0x04c6
            androidx.cardview.widget.CardView r12 = r11.card_vfins
            r12.setVisibility(r7)
            androidx.cardview.widget.CardView r12 = r11.card_viewaddress
            r12.setVisibility(r8)
            androidx.cardview.widget.CardView r12 = r11.card_vage
            r12.setVisibility(r8)
            androidx.cardview.widget.CardView r12 = r11.card_vmodel
            r12.setVisibility(r8)
            androidx.cardview.widget.CardView r12 = r11.card_vstate
            r12.setVisibility(r8)
            androidx.cardview.widget.CardView r12 = r11.card_vclass
            r12.setVisibility(r8)
            androidx.cardview.widget.CardView r12 = r11.card_vfuel
            r12.setVisibility(r8)
            androidx.cardview.widget.CardView r12 = r11.card_vengin
            r12.setVisibility(r8)
            androidx.cardview.widget.CardView r12 = r11.card_vchasis
            r12.setVisibility(r8)
            androidx.cardview.widget.CardView r12 = r11.card_vregauth
            r12.setVisibility(r8)
            androidx.cardview.widget.CardView r12 = r11.card_vins
            r12.setVisibility(r8)
        L_0x04c6:
            android.content.Intent r12 = r11.getIntent()
            java.lang.String r0 = "showIns"
            boolean r12 = r12.hasExtra(r0)
            if (r12 == 0) goto L_0x0517
            android.content.Intent r12 = r11.getIntent()
            java.lang.String r12 = r12.getStringExtra(r0)
            boolean r12 = r12.equals(r5)
            if (r12 == 0) goto L_0x0517
            androidx.cardview.widget.CardView r12 = r11.card_vfins
            r12.setVisibility(r8)
            androidx.cardview.widget.CardView r12 = r11.card_viewaddress
            r12.setVisibility(r8)
            androidx.cardview.widget.CardView r12 = r11.card_vage
            r12.setVisibility(r8)
            androidx.cardview.widget.CardView r12 = r11.card_vmodel
            r12.setVisibility(r8)
            androidx.cardview.widget.CardView r12 = r11.card_vstate
            r12.setVisibility(r8)
            androidx.cardview.widget.CardView r12 = r11.card_vclass
            r12.setVisibility(r8)
            androidx.cardview.widget.CardView r12 = r11.card_vfuel
            r12.setVisibility(r8)
            androidx.cardview.widget.CardView r12 = r11.card_vengin
            r12.setVisibility(r8)
            androidx.cardview.widget.CardView r12 = r11.card_vchasis
            r12.setVisibility(r8)
            androidx.cardview.widget.CardView r12 = r11.card_vregauth
            r12.setVisibility(r8)
            androidx.cardview.widget.CardView r12 = r11.card_vins
            r12.setVisibility(r7)
        L_0x0517:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp.V_DetailsActivity.onCreate(android.os.Bundle):void");
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
