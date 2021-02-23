package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.o;
import com.google.android.material.snackbar.Snackbar;

public class WebCustom extends o {
    @SuppressLint({"StaticFieldLeak"})
    static WebCustom webInstance;
    WebView searchWeb;
    String vehicleNum;
    TextView webLoad;

    public class CustomBrowser extends WebViewClient {
        boolean flag = false;

        public CustomBrowser() {
        }

        @JavascriptInterface
        public void displayToast(String str) {
            System.out.println(str);
            Toast.makeText(WebCustom.this, str, 0).show();
        }

        @JavascriptInterface
        public void makeToast(String str) {
            System.out.println(str);
            WebCustom.this.finish();
        }

        public void onPageFinished(WebView webView, String str) {
            WebCustom.this.webLoad.setVisibility(8);
            WebCustom.this.searchWeb.setVisibility(0);
            super.onPageFinished(webView, str);
            WebView webView2 = WebCustom.this.searchWeb;
            if (webView2 != null) {
                webView2.loadUrl("javascript:try{document.getElementsByClassName('container')[0].style.display = \"none\";document.getElementsByClassName('top-navigation-section')[0].style.display = \"none\";document.getElementsByClassName('navbar-header')[0].style.display = \"none\";document.getElementsByClassName('container')[1].style.display = \"none\";document.getElementsByClassName('ui-panel')[0].style.display = \"none\";document.getElementsByClassName('header-main')[0].style.display = \"none\";document.getElementsByClassName('header-main')[1].style.display = \"none\";document.getElementsByClassName('vahan-footer-section')[0].style.display = \"none\";document.getElementsByClassName('ui-panel-titlebar')[0].style.display = \"none\";document.getElementsByClassName('ui-button-text')[0].style.display = \"none\";document.getElementById('resultPanel').style.visibility = \"hidden\";document.getElementById('regn_no1_exact').value = HTMLOUT.setVehicleNum(); var style = document.createElement('style');\n  style.innerHTML = `\n  #regn_no1_exact, #txt_ALPHA_NUMERIC {\n  border-radius: 20px;\n  background: linear-gradient(to right, #00AD9F , #44D081) !important;\n  border: none;\n  height: 43px;\n  width: 250px !important;\n  color: white !important;\n  font-size: 20px;\n  padding: 20px !important;\n  margin-bottom: 25px !important;  }\n  .ui-blockui-content{\n    display:none !important;\n  }.ui-commandlink{\n    font-size: 2em;\n    vertical-align: sub;\n}\n.bottom-space-5{\n    margin-bottom: 20px !important;\n}\n.ui-panel-border{\n    width: 280px;\n    margin: 0 auto;\n    text-align: center !important;\n}#resultPanel{\ndisplay:none !important;\n}#userMessages{\ndisplay:none !important;\n}.ui-panel-box-shadow {\n  \tborder: none !important;\n  \tbox-shadow: none !important;\n  }.ui-button-text-only {\n  border-radius: 50%;\n  padding: 10px;\n  background: #FAAC3C !important;\n  color: white;  height: 50px;\n  width: 50px;\n  text-align: center;\n  font-size: 18px;\n  border: none !important;  outline: none !important;}.ui-button-text-only:focus {\n  border-radius: 50%;\n  padding: 10px;\n  background: #FAAC3C !important;\n  color: white;  height: 50px;\n  width: 50px;\n  text-align: center;\n  font-size: 18px;\n  border: none !important;  outline: none !important;}.ui-widget-overlay{\n    background: none !important;\n  }.ui-panel-titlebar {\n  \tborder: none !important;\n  }.ui-panel-border, .ui-panel-titlebar {\n  \tborder-bottom: none !important;\n  }.left-position {\n  \tborder-left: none !important;\n  \tborder-right: none !important;\n  }  `;\n  document.head.appendChild(style);var mydiv = document.getElementsByClassName(\"ui-button-text-only\")[0];\nvar aTag = document.createElement('span');\naTag.setAttribute('class',\"glyphicon glyphicon-search\");\nmydiv.appendChild(aTag);$('.ui-button-text-only').click(function(){ HTMLOUT.showLoading();setTimeout(function () {\n var divM = document.getElementById(\"userMessages\").childNodes.length; if(divM>0){var span_Text = document.getElementsByClassName('ui-messages-info-summary')[0].innerHTML;\nHTMLOUT.displayToast(span_Text);}}, 1000);document.getElementById('resultPanel').style.visibility = \"hidden\";var interval;interval = window.setInterval(function(){\n var div = document.getElementById(\"resultPanel\").childNodes.length; if(div>0){document.getElementById('rcDetailsPanel').style.visibility = \"hidden\";clearInterval(interval);var text ='{\"vehicle\": [{ ';    $('.table-width-four tr').each(function(row, tr){    text+='\"'+ $(tr).find('td:eq(0)').text().trim() + '\":\"'    + $(tr).find('td:eq(1)').text().trim() + '\",'    +'\"'+ $(tr).find('td:eq(2)').text().trim() + '\":\"'    + $(tr).find('td:eq(3)').text().trim() + '\",'});\nvar text2 = text.substring(0, text.length - 1);text2+='}]}';HTMLOUT.makeToast(text2);}}, 3000);});setTimeout(function(){ window.HTMLOUT.processHTML('<html><body><table>'+getElementsByTagName('body').innerHTML+'</table></body></html>'); },2000);}catch(e){};javascript:window.HTMLOUT.processHTML('<html>'+document.getElementsByTagName('html')[0].innerHTML+'</html>');");
            }
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            WebCustom.this.webLoad.setVisibility(0);
            WebCustom.this.searchWeb.setVisibility(8);
            super.onPageStarted(webView, str, bitmap);
        }

        public void onReceivedSslError(WebView webView, final SslErrorHandler sslErrorHandler, SslError sslError) {
            AlertDialog.Builder builder = new AlertDialog.Builder(WebCustom.webInstance);
            builder.setMessage("Web server ssl certificate is untrusted. Do you want to continue anyway?");
            builder.setPositiveButton("continue", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    sslErrorHandler.proceed();
                }
            });
            builder.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    sslErrorHandler.cancel();
                    WebCustom.this.finish();
                }
            });
            builder.create().show();
        }

        @JavascriptInterface
        public String setVehicleNum() {
            String str = WebCustom.this.vehicleNum;
            return (str == null || str.equals(BuildConfig.FLAVOR)) ? BuildConfig.FLAVOR : WebCustom.this.vehicleNum;
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            webView.loadUrl(str);
            return true;
        }

        @JavascriptInterface
        public void showLoading() {
            Snackbar a2 = Snackbar.a(WebCustom.this.findViewById(16908290), "Please wait searching.", 0);
            a2.a("CLOSE", new View.OnClickListener() {
                public void onClick(View view) {
                }
            });
            a2.e(WebCustom.this.getResources().getColor(17170454));
            a2.k();
        }
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"JavascriptInterface", "SetJavaScriptEnabled"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_web_custom);
        this.searchWeb = (WebView) findViewById(R.id.search_web);
        this.webLoad = (TextView) findViewById(R.id.web_load);
        webInstance = this;
        if (getIntent().hasExtra("vNum")) {
            this.vehicleNum = getIntent().getStringExtra("vNum");
        }
        getWindow().setFeatureInt(2, -1);
        this.searchWeb.getSettings().setBuiltInZoomControls(true);
        this.searchWeb.setWebViewClient(new CustomBrowser());
        this.searchWeb.getSettings().setLoadsImagesAutomatically(true);
        this.searchWeb.getSettings().setUseWideViewPort(true);
        this.searchWeb.getSettings().setJavaScriptEnabled(true);
        this.searchWeb.getSettings().setDomStorageEnabled(true);
        this.searchWeb.getSettings().setLoadWithOverviewMode(true);
        this.searchWeb.setScrollBarStyle(0);
        this.searchWeb.addJavascriptInterface(new CustomBrowser(), "HTMLOUT");
        this.searchWeb.loadUrl("https://vahan.nic.in/nrservices/faces/user/searchstatus.xhtml");
    }
}
