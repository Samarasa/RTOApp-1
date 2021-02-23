package com.hs.rtovehicledetail.vahan.vehicleregistrationdetails.rtoapp;

public class VehicleInfoHandler {
    private static final VehicleInfoHandler ourInstance = new VehicleInfoHandler();
    public String VScrapingCookies;
    public String VScrapingKeys;
    public String VScrapingUrl;
    public String VahanScraping;
    public String covidSearch;
    public String eChallanDL;
    public String eChallanRC;
    private boolean fb_interstitial;
    private boolean fb_native;
    public String keyOurServer;
    public String keyOurServerURL;
    private String mparivahanLockSalt;
    private String mparivahanURL;
    public String obvheader;
    int old_vownerId;
    private String ourApp1Link;
    public String ourApp1LinkIn;
    public String ourApp1LinkSlide;
    private String ourApp1icon;
    public String ourApp1iconIn;
    public String ourApp1iconSlide;
    private String ourApp2Link;
    public String ourApp2LinkIn;
    public String ourApp2LinkSlide;
    private String ourApp2icon;
    public String ourApp2iconIn;
    public String ourApp2iconSlide;
    private String ourApp3Link;
    public String ourApp3LinkIn;
    public String ourApp3LinkSlide;
    private String ourApp3icon;
    public String ourApp3iconIn;
    public String ourApp3iconSlide;
    private String ourApp4Link;
    public String ourApp4LinkIn;
    public String ourApp4LinkSlide;
    private String ourApp4icon;
    public String ourApp4iconIn;
    public String ourApp4iconSlide;
    private String ourApp5Link;
    public String ourApp5LinkIn;
    public String ourApp5LinkSlide;
    private String ourApp5icon;
    public String ourApp5iconIn;
    public String ourApp5iconSlide;
    private String ourApp6Link;
    public String ourApp6LinkIn;
    public String ourApp6LinkSlide;
    private String ourApp6icon;
    public String ourApp6iconIn;
    public String ourApp6iconSlide;
    private String ourApp7Link;
    public String ourApp7LinkIn;
    public String ourApp7LinkSlide;
    private String ourApp7icon;
    public String ourApp7iconIn;
    public String ourApp7iconSlide;
    private String ourApp8Link;
    public String ourApp8LinkIn;
    public String ourApp8LinkSlide;
    private String ourApp8icon;
    public String ourApp8iconIn;
    public String ourApp8iconSlide;
    private String ourApp9Link;
    public String ourApp9LinkIn;
    public String ourApp9LinkSlide;
    private String ourApp9icon = BuildConfig.FLAVOR;
    public String ourApp9iconIn;
    public String ourApp9iconSlide;
    public String resaleSelection;
    public String resaleValue;
    public String showEChallan;
    public String showResale;
    private String storeInDB;
    private String storeInDBUrl;
    public String vaccineParam;
    public String vaccineSearch;
    public String vaccineUrl;
    int vchasisId;
    int vclassId;
    int vengineId;
    int vinsuranceId;
    int vmodelId;
    int vownerId;
    int vregDateId;
    int vregNoId;
    int vtypeId;

    private VehicleInfoHandler() {
    }

    public static VehicleInfoHandler getInstance() {
        return ourInstance;
    }

    public String getCovidSearch() {
        return this.covidSearch;
    }

    public String getKeyOurServer() {
        return this.keyOurServer;
    }

    public String getKeyOurServerURL() {
        return this.keyOurServerURL;
    }

    public String getMparivahanLockSalt() {
        return this.mparivahanLockSalt;
    }

    public String getMparivahanURL() {
        return this.mparivahanURL;
    }

    public String getObvheader() {
        return this.obvheader;
    }

    public int getOld_vownerId() {
        return this.old_vownerId;
    }

    public String getOurApp1Link() {
        return this.ourApp1Link;
    }

    public String getOurApp1LinkIn() {
        return this.ourApp1LinkIn;
    }

    public String getOurApp1LinkSlide() {
        return this.ourApp1LinkSlide;
    }

    public String getOurApp1icon() {
        return this.ourApp1icon;
    }

    public String getOurApp1iconIn() {
        return this.ourApp1iconIn;
    }

    public String getOurApp1iconSlide() {
        return this.ourApp1iconSlide;
    }

    public String getOurApp2Link() {
        return this.ourApp2Link;
    }

    public String getOurApp2LinkIn() {
        return this.ourApp2LinkIn;
    }

    public String getOurApp2LinkSlide() {
        return this.ourApp2LinkSlide;
    }

    public String getOurApp2icon() {
        return this.ourApp2icon;
    }

    public String getOurApp2iconIn() {
        return this.ourApp2iconIn;
    }

    public String getOurApp2iconSlide() {
        return this.ourApp2iconSlide;
    }

    public String getOurApp3Link() {
        return this.ourApp3Link;
    }

    public String getOurApp3LinkIn() {
        return this.ourApp3LinkIn;
    }

    public String getOurApp3LinkSlide() {
        return this.ourApp3LinkSlide;
    }

    public String getOurApp3icon() {
        return this.ourApp3icon;
    }

    public String getOurApp3iconIn() {
        return this.ourApp3iconIn;
    }

    public String getOurApp3iconSlide() {
        return this.ourApp3iconSlide;
    }

    public String getOurApp4Link() {
        return this.ourApp4Link;
    }

    public String getOurApp4LinkIn() {
        return this.ourApp4LinkIn;
    }

    public String getOurApp4LinkSlide() {
        return this.ourApp4LinkSlide;
    }

    public String getOurApp4icon() {
        return this.ourApp4icon;
    }

    public String getOurApp4iconIn() {
        return this.ourApp4iconIn;
    }

    public String getOurApp4iconSlide() {
        return this.ourApp4iconSlide;
    }

    public String getOurApp5Link() {
        return this.ourApp5Link;
    }

    public String getOurApp5LinkIn() {
        return this.ourApp5LinkIn;
    }

    public String getOurApp5LinkSlide() {
        return this.ourApp5LinkSlide;
    }

    public String getOurApp5icon() {
        return this.ourApp5icon;
    }

    public String getOurApp5iconIn() {
        return this.ourApp5iconIn;
    }

    public String getOurApp5iconSlide() {
        return this.ourApp5iconSlide;
    }

    public String getOurApp6Link() {
        return this.ourApp6Link;
    }

    public String getOurApp6LinkIn() {
        return this.ourApp6LinkIn;
    }

    public String getOurApp6LinkSlide() {
        return this.ourApp6LinkSlide;
    }

    public String getOurApp6icon() {
        return this.ourApp6icon;
    }

    public String getOurApp6iconIn() {
        return this.ourApp6iconIn;
    }

    public String getOurApp6iconSlide() {
        return this.ourApp6iconSlide;
    }

    public String getOurApp7Link() {
        return this.ourApp7Link;
    }

    public String getOurApp7LinkIn() {
        return this.ourApp7LinkIn;
    }

    public String getOurApp7LinkSlide() {
        return this.ourApp7LinkSlide;
    }

    public String getOurApp7icon() {
        return this.ourApp7icon;
    }

    public String getOurApp7iconIn() {
        return this.ourApp7iconIn;
    }

    public String getOurApp7iconSlide() {
        return this.ourApp7iconSlide;
    }

    public String getOurApp8Link() {
        return this.ourApp8Link;
    }

    public String getOurApp8LinkIn() {
        return this.ourApp8LinkIn;
    }

    public String getOurApp8LinkSlide() {
        return this.ourApp8LinkSlide;
    }

    public String getOurApp8icon() {
        return this.ourApp8icon;
    }

    public String getOurApp8iconIn() {
        return this.ourApp8iconIn;
    }

    public String getOurApp8iconSlide() {
        return this.ourApp8iconSlide;
    }

    public String getOurApp9Link() {
        return this.ourApp9Link;
    }

    public String getOurApp9LinkIn() {
        return this.ourApp9LinkIn;
    }

    public String getOurApp9LinkSlide() {
        return this.ourApp9LinkSlide;
    }

    public String getOurApp9icon() {
        return this.ourApp9icon;
    }

    public String getOurApp9iconIn() {
        return this.ourApp9iconIn;
    }

    public String getOurApp9iconSlide() {
        return this.ourApp9iconSlide;
    }

    public String getResaleSelection() {
        return this.resaleSelection;
    }

    public String getResaleValue() {
        return this.resaleValue;
    }

    public String getShowEChallan() {
        return this.showEChallan;
    }

    public String getShowResale() {
        return this.showResale;
    }

    public String getStoreInDB() {
        return this.storeInDB;
    }

    public String getStoreInDBUrl() {
        return this.storeInDBUrl;
    }

    public String getVScrapingCookies() {
        return this.VScrapingCookies;
    }

    public String getVScrapingKeys() {
        return this.VScrapingKeys;
    }

    public String getVScrapingUrl() {
        return this.VScrapingUrl;
    }

    public String getVaccineParam() {
        return this.vaccineParam;
    }

    public String getVaccineSearch() {
        return this.vaccineSearch;
    }

    public String getVaccineUrl() {
        return this.vaccineUrl;
    }

    public String getVahanScraping() {
        return this.VahanScraping;
    }

    public int getVchasisId() {
        return this.vchasisId;
    }

    public int getVclassId() {
        return this.vclassId;
    }

    public int getVengineId() {
        return this.vengineId;
    }

    public int getVinsuranceId() {
        return this.vinsuranceId;
    }

    public int getVmodelId() {
        return this.vmodelId;
    }

    public int getVownerId() {
        return this.vownerId;
    }

    public int getVregDateId() {
        return this.vregDateId;
    }

    public int getVregNoId() {
        return this.vregNoId;
    }

    public int getVtypeId() {
        return this.vtypeId;
    }

    public String geteChallanDL() {
        return this.eChallanDL;
    }

    public String geteChallanRC() {
        return this.eChallanRC;
    }

    public boolean isFb_interstitial() {
        return this.fb_interstitial;
    }

    public boolean isFb_native() {
        return this.fb_native;
    }

    public void setCovidSearch(String str) {
        this.covidSearch = str;
    }

    public void setFb_interstitial(boolean z) {
        this.fb_interstitial = z;
    }

    public void setFb_native(boolean z) {
        this.fb_native = z;
    }

    public void setKeyOurServer(String str) {
        this.keyOurServer = str;
    }

    public void setKeyOurServerURL(String str) {
        this.keyOurServerURL = str;
    }

    public void setMparivahanLockSalt(String str) {
        this.mparivahanLockSalt = str;
    }

    public void setMparivahanURL(String str) {
        this.mparivahanURL = str;
    }

    public void setObvheader(String str) {
        this.obvheader = str;
    }

    public void setOld_vownerId(int i) {
        this.old_vownerId = i;
    }

    public void setOurApp1Link(String str) {
        this.ourApp1Link = str;
    }

    public void setOurApp1LinkIn(String str) {
        this.ourApp1LinkIn = str;
    }

    public void setOurApp1LinkSlide(String str) {
        this.ourApp1LinkSlide = str;
    }

    public void setOurApp1icon(String str) {
        this.ourApp1icon = str;
    }

    public void setOurApp1iconIn(String str) {
        this.ourApp1iconIn = str;
    }

    public void setOurApp1iconSlide(String str) {
        this.ourApp1iconSlide = str;
    }

    public void setOurApp2Link(String str) {
        this.ourApp2Link = str;
    }

    public void setOurApp2LinkIn(String str) {
        this.ourApp2LinkIn = str;
    }

    public void setOurApp2LinkSlide(String str) {
        this.ourApp2LinkSlide = str;
    }

    public void setOurApp2icon(String str) {
        this.ourApp2icon = str;
    }

    public void setOurApp2iconIn(String str) {
        this.ourApp2iconIn = str;
    }

    public void setOurApp2iconSlide(String str) {
        this.ourApp2iconSlide = str;
    }

    public void setOurApp3Link(String str) {
        this.ourApp3Link = str;
    }

    public void setOurApp3LinkIn(String str) {
        this.ourApp3LinkIn = str;
    }

    public void setOurApp3LinkSlide(String str) {
        this.ourApp3LinkSlide = str;
    }

    public void setOurApp3icon(String str) {
        this.ourApp3icon = str;
    }

    public void setOurApp3iconIn(String str) {
        this.ourApp3iconIn = str;
    }

    public void setOurApp3iconSlide(String str) {
        this.ourApp3iconSlide = str;
    }

    public void setOurApp4Link(String str) {
        this.ourApp4Link = str;
    }

    public void setOurApp4LinkIn(String str) {
        this.ourApp4LinkIn = str;
    }

    public void setOurApp4LinkSlide(String str) {
        this.ourApp4LinkSlide = str;
    }

    public void setOurApp4icon(String str) {
        this.ourApp4icon = str;
    }

    public void setOurApp4iconIn(String str) {
        this.ourApp4iconIn = str;
    }

    public void setOurApp4iconSlide(String str) {
        this.ourApp4iconSlide = str;
    }

    public void setOurApp5Link(String str) {
        this.ourApp5Link = str;
    }

    public void setOurApp5LinkIn(String str) {
        this.ourApp5LinkIn = str;
    }

    public void setOurApp5LinkSlide(String str) {
        this.ourApp5LinkSlide = str;
    }

    public void setOurApp5icon(String str) {
        this.ourApp5icon = str;
    }

    public void setOurApp5iconIn(String str) {
        this.ourApp5iconIn = str;
    }

    public void setOurApp5iconSlide(String str) {
        this.ourApp5iconSlide = str;
    }

    public void setOurApp6Link(String str) {
        this.ourApp6Link = str;
    }

    public void setOurApp6LinkIn(String str) {
        this.ourApp6LinkIn = str;
    }

    public void setOurApp6LinkSlide(String str) {
        this.ourApp6LinkSlide = str;
    }

    public void setOurApp6icon(String str) {
        this.ourApp6icon = str;
    }

    public void setOurApp6iconIn(String str) {
        this.ourApp6iconIn = str;
    }

    public void setOurApp6iconSlide(String str) {
        this.ourApp6iconSlide = str;
    }

    public void setOurApp7Link(String str) {
        this.ourApp7Link = str;
    }

    public void setOurApp7LinkIn(String str) {
        this.ourApp7LinkIn = str;
    }

    public void setOurApp7LinkSlide(String str) {
        this.ourApp7LinkSlide = str;
    }

    public void setOurApp7icon(String str) {
        this.ourApp7icon = str;
    }

    public void setOurApp7iconIn(String str) {
        this.ourApp7iconIn = str;
    }

    public void setOurApp7iconSlide(String str) {
        this.ourApp7iconSlide = str;
    }

    public void setOurApp8Link(String str) {
        this.ourApp8Link = str;
    }

    public void setOurApp8LinkIn(String str) {
        this.ourApp8LinkIn = str;
    }

    public void setOurApp8LinkSlide(String str) {
        this.ourApp8LinkSlide = str;
    }

    public void setOurApp8icon(String str) {
        this.ourApp8icon = str;
    }

    public void setOurApp8iconIn(String str) {
        this.ourApp8iconIn = str;
    }

    public void setOurApp8iconSlide(String str) {
        this.ourApp8iconSlide = str;
    }

    public void setOurApp9Link(String str) {
        this.ourApp9Link = str;
    }

    public void setOurApp9LinkIn(String str) {
        this.ourApp9LinkIn = str;
    }

    public void setOurApp9LinkSlide(String str) {
        this.ourApp9LinkSlide = str;
    }

    public void setOurApp9icon(String str) {
        this.ourApp9icon = str;
    }

    public void setOurApp9iconIn(String str) {
        this.ourApp9iconIn = str;
    }

    public void setOurApp9iconSlide(String str) {
        this.ourApp9iconSlide = str;
    }

    public void setResaleSelection(String str) {
        this.resaleSelection = str;
    }

    public void setResaleValue(String str) {
        this.resaleValue = str;
    }

    public void setShowEChallan(String str) {
        this.showEChallan = str;
    }

    public void setShowResale(String str) {
        this.showResale = str;
    }

    public void setStoreInDB(String str) {
        this.storeInDB = str;
    }

    public void setStoreInDBUrl(String str) {
        this.storeInDBUrl = str;
    }

    public void setVScrapingCookies(String str) {
        this.VScrapingCookies = str;
    }

    public void setVScrapingKeys(String str) {
        this.VScrapingKeys = str;
    }

    public void setVScrapingUrl(String str) {
        this.VScrapingUrl = str;
    }

    public void setVaccineParam(String str) {
        this.vaccineParam = str;
    }

    public void setVaccineSearch(String str) {
        this.vaccineSearch = str;
    }

    public void setVaccineUrl(String str) {
        this.vaccineUrl = str;
    }

    public void setVahanScraping(String str) {
        this.VahanScraping = str;
    }

    public void setVchasisId(int i) {
        this.vchasisId = i;
    }

    public void setVclassId(int i) {
        this.vclassId = i;
    }

    public void setVengineId(int i) {
        this.vengineId = i;
    }

    public void setVinsuranceId(int i) {
        this.vinsuranceId = i;
    }

    public void setVmodelId(int i) {
        this.vmodelId = i;
    }

    public void setVownerId(int i) {
        this.vownerId = i;
    }

    public void setVregDateId(int i) {
        this.vregDateId = i;
    }

    public void setVregNoId(int i) {
        this.vregNoId = i;
    }

    public void setVtypeId(int i) {
        this.vtypeId = i;
    }

    public void seteChallanDL(String str) {
        this.eChallanDL = str;
    }

    public void seteChallanRC(String str) {
        this.eChallanRC = str;
    }
}
