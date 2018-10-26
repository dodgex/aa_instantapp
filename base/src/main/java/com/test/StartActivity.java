package com.test;

import android.support.v7.app.AppCompatActivity;

import org.androidannotations.annotations.EActivity;


@EActivity(resName = "activity_start")
public class StartActivity extends AppCompatActivity {


	@Override
	public void onPause() {
		super.onPause();
	}

	@Override
	public void onBackPressed() {
		super.onBackPressed();
	}
}
