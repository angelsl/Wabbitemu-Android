package com.Revsoft.Wabbitemu.activity;

import android.app.Activity;
import android.os.Bundle;

import com.Revsoft.Wabbitemu.R;
import com.Revsoft.Wabbitemu.utils.AdUtils;
import com.Revsoft.Wabbitemu.utils.ViewUtils;
import com.google.android.gms.ads.AdView;

public class SettingsActivity extends Activity {
	@Override
	protected void onCreate(final Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setTitle(R.string.settings);
		setContentView(R.layout.settings);
		AdUtils.loadAd(getResources(), ViewUtils.findViewById(this, R.id.adView, AdView.class));
	}
}