package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.webkit.JavascriptInterface;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.o;
import java.io.PrintStream;

public class WebActivity extends o {
    public static WebActivity mWebviewObj;
    String mobileNo = BuildConfig.FLAVOR;
    String v1;
    String v2;
    WebView webView = null;

    private class MyBrowser extends WebViewClient {
        boolean flag;
        ProgressDialog prDialog;

        private MyBrowser() {
            this.flag = false;
        }

        public void onPageFinished(WebView webView, String str) {
            ProgressDialog progressDialog = this.prDialog;
            if (progressDialog != null && progressDialog.isShowing()) {
                this.prDialog.dismiss();
            }
            super.onPageFinished(webView, str);
            PreferenceManager.getDefaultSharedPreferences(WebActivity.this).getString("deeku_webViewURL", BuildConfig.FLAVOR);
            WebView webView2 = WebActivity.this.webView;
            if (webView2 != null) {
                webView2.loadUrl("javascript:try{document.getElementById(\"header-logo-section\").setAttribute(\"style\",\"display:none;\");document.getElementById(\"form_rcdl:tf_reg_no1\").value='" + WebActivity.this.v1 + "';document.getElementById(\"form_rcdl:tf_reg_no2\").setAttribute(\"type\",\"number\");document.getElementById(\"form_rcdl:tf_reg_no2\").value='" + WebActivity.this.v2 + "';document.getElementById(\"form_rcdl:tf_Mobile\").setAttribute(\"type\",\"number\");document.getElementById(\"form_rcdl:tf_Mobile\").value='" + WebActivity.this.mobileNo + "';document.getElementById(\"form_rcdl:rest_bt\").setAttribute(\"style\",\"display:none;\");setTimeout(function(){ window.HTMLOUT.processHTML('<html><body><table>'+getElementsByTagName('body').innerHTML+'</table></body></html>'); },2000);}catch(e){};javascript:window.HTMLOUT.processHTML('<html>'+document.getElementsByTagName('html')[0].innerHTML+'</html>');");
            }
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            this.prDialog = ProgressDialog.show(WebActivity.this, (CharSequence) null, "loading, please wait...");
            super.onPageStarted(webView, str, bitmap);
        }

        public void onReceivedSslError(WebView webView, final SslErrorHandler sslErrorHandler, SslError sslError) {
            AlertDialog.Builder builder = new AlertDialog.Builder(WebActivity.mWebviewObj);
            builder.setMessage("Web server ssl certificate is untrusted. Do you want to continue anyway?");
            builder.setPositiveButton("continue", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    sslErrorHandler.proceed();
                }
            });
            builder.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    sslErrorHandler.cancel();
                    WebActivity.this.finish();
                }
            });
            builder.create().show();
        }

        @JavascriptInterface
        public void processHTML(String str) {
            PrintStream printStream = System.out;
            printStream.println("html" + str);
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            webView.loadUrl(str);
            return true;
        }

        @JavascriptInterface
        public void showHTML(String str) {
            PrintStream printStream = System.out;
            printStream.println("html" + str);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_web);
        mWebviewObj = this;
        this.v1 = getIntent().getStringExtra("FIRST");
        this.v2 = getIntent().getStringExtra("SECOND");
        this.webView = (WebView) findViewById(R.id.webView);
        this.webView.getSettings().setBuiltInZoomControls(true);
        this.webView.setWebViewClient(new MyBrowser());
        this.webView.getSettings().setLoadsImagesAutomatically(true);
        this.webView.getSettings().setLoadWithOverviewMode(true);
        this.webView.getSettings().setUseWideViewPort(true);
        this.webView.getSettings().setJavaScriptEnabled(true);
        this.webView.setScrollBarStyle(0);
        this.webView.addJavascriptInterface(new MyBrowser(), "HTMLOUT");
        this.webView.loadUrl(PreferenceManager.getDefaultSharedPreferences(this).getString("deeku_webViewURL", BuildConfig.FLAVOR));
    }
}
