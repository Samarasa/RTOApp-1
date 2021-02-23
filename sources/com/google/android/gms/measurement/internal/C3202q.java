package com.google.android.gms.measurement.internal;

import android.content.Context;
import c.b.b.b.d.f.C0340ha;
import c.b.b.b.d.f.C0450xa;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.measurement.internal.q  reason: case insensitive filesystem */
public final class C3202q {
    public static C3204qb<Long> A = a("measurement.upload.stale_data_deletion_interval", 86400000L, 86400000L, J.f13312a);
    public static C3204qb<Boolean> Aa = a("measurement.sdk.collection.last_deep_link_referrer_campaign", false, false, Qa.f13389a);
    public static C3204qb<Long> B = a("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, M.f13346a);
    public static C3204qb<Boolean> Ba = a("measurement.sdk.collection.last_gclid_from_referrer", false, false, Ta.f13417a);
    public static C3204qb<Long> C = a("measurement.upload.initial_upload_delay_time", 15000L, 15000L, L.f13332a);
    public static C3204qb<Boolean> Ca = a("measurement.sdk.collection.worker_thread_referrer", true, true, Sa.f13406a);
    public static C3204qb<Long> D = a("measurement.upload.retry_time", 1800000L, 1800000L, O.f13371a);
    public static C3204qb<Boolean> Da = a("measurement.upload.file_lock_state_check", false, false, Va.f13439a);
    public static C3204qb<Integer> E = a("measurement.upload.retry_count", 6, 6, N.f13360a);
    public static C3204qb<Boolean> Ea = a("measurement.sampling.calculate_bundle_timestamp_before_sampling", true, true, Ua.f13429a);
    public static C3204qb<Long> F = a("measurement.upload.max_queue_time", 2419200000L, 2419200000L, Q.f13388a);
    public static C3204qb<Boolean> Fa = a("measurement.ga.ga_app_id", false, false, Wa.f13452a);
    public static C3204qb<Integer> G = a("measurement.lifetimevalue.max_currency_tracked", 4, 4, T.f13416a);
    public static C3204qb<Boolean> Ga = a("measurement.lifecycle.app_backgrounded_tracking", false, false, Za.f13475a);
    public static C3204qb<Integer> H = a("measurement.audience.filter_result_max_count", 200, 200, S.f13405a);
    public static C3204qb<Boolean> Ha = a("measurement.lifecycle.app_in_background_parameter", false, false, Ya.f13464a);
    public static C3204qb<Long> I = a("measurement.service_client.idle_disconnect_millis", 5000L, 5000L, V.f13438a);
    public static C3204qb<Boolean> Ia = a("measurement.integration.disable_firebase_instance_id", false, false, C3113ab.f13499a);
    public static C3204qb<Boolean> J = a("measurement.test.boolean_flag", false, false, U.f13428a);
    public static C3204qb<Boolean> Ja = a("measurement.lifecycle.app_backgrounded_engagement", false, false, _a.f13485a);
    public static C3204qb<String> K = a("measurement.test.string_flag", "---", "---", X.f13458a);
    public static C3204qb<Boolean> Ka = a("measurement.service.fix_gmp_version", false, false, C3125cb.f13527a);
    public static C3204qb<Long> L = a("measurement.test.long_flag", -1L, -1L, W.f13451a);
    public static C3204qb<Boolean> La = a("measurement.collection.service.update_with_analytics_fix", false, false, C3119bb.f13507a);
    public static C3204qb<Integer> M = a("measurement.test.int_flag", -2, -2, Z.f13474a);
    public static C3204qb<Boolean> Ma = a("measurement.service.disable_install_state_reporting", false, false, C3143fb.f13562a);
    public static C3204qb<Double> N;
    public static C3204qb<Boolean> Na = a("measurement.service.use_appinfo_modified", false, false, C3131db.f13542a);
    public static C3204qb<Integer> O = a("measurement.experiment.max_ids", 50, 50, C3118ba.f13506a);
    private static C3204qb<Boolean> Oa = a("measurement.upload.dsid_reflection_failure_logging", true, true, C3155hb.f13595a);
    public static C3204qb<Boolean> P = a("measurement.validation.internal_limits_internal_event_params", false, false, C3112aa.f13498a);
    public static C3204qb<Boolean> Pa = a("measurement.client.firebase_feature_rollout.v1.enable", true, true, C3167jb.f13613a);
    public static C3204qb<Boolean> Q = a("measurement.referrer.enable_logging_install_referrer_cmp_from_apk", false, false, C3124ca.f13526a);
    public static C3204qb<Boolean> Qa = a("measurement.client.sessions.check_on_reset_and_enable", false, false, C3161ib.f13606a);
    public static C3204qb<Boolean> R = a("measurement.client.sessions.session_id_enabled", true, true, C3148ga.f13580a);
    public static C3204qb<Boolean> Ra = a("measurement.config.string.always_update_disk_on_set", false, false, C3179lb.f13661a);
    public static C3204qb<Boolean> S = a("measurement.service.sessions.session_number_enabled", true, true, C3142fa.f13561a);
    public static C3204qb<Boolean> Sa = a("measurement.scheduler.task_thread.cleanup_on_exit", false, false, C3173kb.f13632a);
    public static C3204qb<Boolean> T = a("measurement.client.sessions.background_sessions_enabled", true, true, C3160ia.f13605a);
    public static C3204qb<Boolean> Ta = a("measurement.upload.file_truncate_fix", false, false, C3189nb.f13683a);
    public static C3204qb<Boolean> U = a("measurement.client.sessions.remove_expired_session_properties_enabled", true, true, C3154ha.f13594a);
    public static C3204qb<Boolean> Ua = a("measurement.lifecycle.app_background_timestamp_when_backgrounded", true, true, C3184mb.f13670a);
    public static C3204qb<Boolean> V = a("measurement.service.sessions.session_number_backfill_enabled", true, true, C3172ka.f13631a);
    public static C3204qb<Boolean> W = a("measurement.service.sessions.remove_disabled_session_number", true, true, C3166ja.f13612a);
    public static C3204qb<Boolean> X = a("measurement.client.sessions.start_session_before_view_screen", true, true, C3183ma.f13669a);
    public static C3204qb<Boolean> Y = a("measurement.client.sessions.check_on_startup", true, true, C3178la.f13660a);
    public static C3204qb<Boolean> Z = a("measurement.collection.firebase_global_collection_flag_enabled", true, true, C3193oa.f13700a);
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static List<C3204qb<?>> f13716a = Collections.synchronizedList(new ArrayList());
    public static C3204qb<Boolean> aa = a("measurement.collection.efficient_engagement_reporting_enabled", false, false, C3203qa.f13724a);

    /* renamed from: b  reason: collision with root package name */
    private static Set<C3204qb<?>> f13717b = Collections.synchronizedSet(new HashSet());
    public static C3204qb<Boolean> ba = a("measurement.collection.redundant_engagement_removal_enabled", false, false, C3198pa.f13710a);

    /* renamed from: c  reason: collision with root package name */
    public static C3204qb<Boolean> f13718c = a("measurement.upload_dsid_enabled", true, true, C3216t.f13765a);
    public static C3204qb<Boolean> ca = a("measurement.personalized_ads_signals_collection_enabled", true, true, C3212sa.f13755a);

    /* renamed from: d  reason: collision with root package name */
    public static C3204qb<Long> f13719d = a("measurement.ad_id_cache_time", 10000L, 10000L, C3211s.f13754a);
    public static C3204qb<Boolean> da = a("measurement.personalized_ads_property_translation_enabled", true, true, C3207ra.f13740a);

    /* renamed from: e  reason: collision with root package name */
    public static C3204qb<Long> f13720e = a("measurement.monitoring.sample_period_millis", 86400000L, 86400000L, G.f13259a);
    public static C3204qb<Boolean> ea = a("measurement.upload.disable_is_uploader", true, true, C3222ua.f13780a);

    /* renamed from: f  reason: collision with root package name */
    public static C3204qb<Long> f13721f = a("measurement.config.cache_time", 86400000L, 3600000L, P.f13376a);
    public static C3204qb<Boolean> fa = a("measurement.experiment.enable_experiment_reporting", true, true, C3217ta.f13766a);

    /* renamed from: g  reason: collision with root package name */
    public static C3204qb<String> f13722g = a("measurement.config.url_scheme", "https", "https", C3136ea.f13547a);
    public static C3204qb<Boolean> ga = a("measurement.collection.log_event_and_bundle_v2", true, true, C3232wa.f13805a);

    /* renamed from: h  reason: collision with root package name */
    public static C3204qb<String> f13723h = a("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", C3188na.f13682a);
    public static C3204qb<Boolean> ha = a("measurement.quality.checksum", false, false, (C3194ob) null);
    public static C3204qb<Integer> i = a("measurement.upload.max_bundles", 100, 100, Aa.f13156a);
    public static C3204qb<Boolean> ia = a("measurement.module.collection.conditionally_omit_admob_app_id", true, true, C3227va.f13797a);
    public static C3204qb<Integer> j = a("measurement.upload.max_batch_size", 65536, 65536, Ka.f13322a);
    public static C3204qb<Boolean> ja = a("measurement.sdk.dynamite.use_dynamite2", false, false, C3242ya.f13831a);
    public static C3204qb<Integer> k = a("measurement.upload.max_bundle_size", 65536, 65536, Xa.f13459a);
    public static C3204qb<Boolean> ka = a("measurement.sdk.dynamite.allow_remote_dynamite", false, false, C3237xa.f13813a);
    public static C3204qb<Integer> l = a("measurement.upload.max_events_per_bundle", 1000, 1000, C3149gb.f13581a);
    public static C3204qb<Boolean> la = a("measurement.sdk.collection.validate_param_names_alphabetical", false, false, C3247za.f13837a);
    public static C3204qb<Integer> m = a("measurement.upload.max_events_per_day", 100000, 100000, C3226v.f13796a);
    public static C3204qb<Boolean> ma = a("measurement.collection.event_safelist", true, true, Ca.f13200a);
    public static C3204qb<Integer> n = a("measurement.upload.max_error_events_per_day", 1000, 1000, C3221u.f13779a);
    public static C3204qb<Boolean> na = a("measurement.service.audience.scoped_filters_v27", false, false, Ba.f13188a);
    public static C3204qb<Integer> o = a("measurement.upload.max_public_events_per_day", 50000, 50000, C3236x.f13812a);
    public static C3204qb<Boolean> oa = a("measurement.service.audience.session_scoped_event_aggregates", false, false, Fa.f13244a);
    public static C3204qb<Integer> p = a("measurement.upload.max_conversions_per_day", 500, 500, C3231w.f13804a);
    public static C3204qb<Boolean> pa = a("measurement.service.audience.session_scoped_user_engagement", false, false, Da.f13213a);
    public static C3204qb<Integer> q = a("measurement.upload.max_realtime_events_per_day", 10, 10, C3246z.f13836a);
    public static C3204qb<Boolean> qa = a("measurement.service.audience.scoped_engagement_removal_when_session_expired", true, true, Ha.f13276a);
    public static C3204qb<Integer> r = a("measurement.store.max_stored_events_per_app", 100000, 100000, C3241y.f13830a);
    public static C3204qb<Boolean> ra = a("measurement.client.audience.scoped_engagement_removal_when_session_expired", true, true, Ga.f13260a);
    public static C3204qb<String> s = a("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", C.f13199a);
    public static C3204qb<Boolean> sa = a("measurement.service.audience.remove_disabled_session_scoped_user_engagement", false, false, Ja.f13313a);
    public static C3204qb<Long> t = a("measurement.upload.backoff_period", 43200000L, 43200000L, A.f13155a);
    public static C3204qb<Boolean> ta = a("measurement.service.audience.use_bundle_timestamp_for_property_filters", false, false, Ia.f13294a);
    public static C3204qb<Long> u = a("measurement.upload.window_interval", 3600000L, 3600000L, E.f13230a);
    public static C3204qb<Boolean> ua = a("measurement.service.audience.fix_prepending_previous_sequence_timestamp", false, false, La.f13333a);
    public static C3204qb<Long> v = a("measurement.upload.interval", 3600000L, 3600000L, D.f13212a);
    private static C3204qb<Boolean> va = a("measurement.service.audience.invalidate_config_cache_after_app_unisntall", false, false, Na.f13361a);
    public static C3204qb<Long> w = a("measurement.upload.realtime_upload_interval", 10000L, 10000L, F.f13243a);
    public static C3204qb<Boolean> wa = a("measurement.service.audience.fix_skip_audience_with_failed_filters", true, true, Ma.f13347a);
    public static C3204qb<Long> x = a("measurement.upload.debug_upload_interval", 1000L, 1000L, I.f13293a);
    public static C3204qb<Boolean> xa = a("measurement.sdk.collection.retrieve_deeplink_from_bow_2", true, true, Pa.f13377a);
    public static C3204qb<Long> y = a("measurement.upload.minimum_delay", 500L, 500L, H.f13275a);
    public static C3204qb<Boolean> ya = a("measurement.app_launch.event_ordering_fix", false, false, Oa.f13372a);
    public static C3204qb<Long> z = a("measurement.alarm_manager.minimum_interval", 60000L, 60000L, K.f13321a);
    public static C3204qb<Boolean> za = a("measurement.sdk.collection.last_deep_link_referrer", false, false, Ra.f13401a);

    static {
        Double valueOf = Double.valueOf(-3.0d);
        N = a("measurement.test.double_flag", valueOf, valueOf, Y.f13463a);
    }

    private static <V> C3204qb<V> a(String str, V v2, V v3, C3194ob<V> obVar) {
        C3204qb qbVar = new C3204qb(str, v2, v3, obVar);
        f13716a.add(qbVar);
        return qbVar;
    }

    public static Map<String, String> a(Context context) {
        C0340ha a2 = C0340ha.a(context.getContentResolver(), C0450xa.a("com.google.android.gms.measurement"));
        return a2 == null ? Collections.emptyMap() : a2.a();
    }
}
