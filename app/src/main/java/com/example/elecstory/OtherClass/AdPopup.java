package com.example.elecstory.OtherClass;

import android.app.Activity;
import android.app.Dialog;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.elecstory.R;

import java.util.ArrayList;
import java.util.List;

public class AdPopup extends Dialog {

    protected Activity activity;
    protected Button button1;
    protected Button button2;
    protected TextView TitleAdPopup;
    protected TextView TimeAfkAdPopup;
    protected TextView NumberWinAdPopup;
    protected ImageView ImageAd;
    protected String TitleAd;
    protected String TimeAfkAd;
    protected String NumberWinAd;

    public AdPopup(Activity activity) {
        super(activity, R.style.Theme_AppCompat_DayNight_Dialog);
        setContentView(R.layout.ad_popup);

        this.activity = activity;

        this.button1 = findViewById(R.id.WatchAds);
        this.button2 = findViewById(R.id.CloseAdsWindows);

        this.TitleAdPopup = findViewById(R.id.TitleAdPopup);
        this.TimeAfkAdPopup = findViewById(R.id.TimeAfk);
        this.NumberWinAdPopup = findViewById(R.id.NumberEarnedAd);

        this.ImageAd = findViewById(R.id.ImageAds);

        this.TitleAd = "Text";
        this.TimeAfkAd = "Text";
        this.NumberWinAd = "Text";
    }

    public void build(){
        show();
        TitleAdPopup.setText(TitleAd);
        TimeAfkAdPopup.setText(TimeAfkAd);
        NumberWinAdPopup.setText(NumberWinAd);
    }

    public Button getButton2() {
        return button2;
    }

    public void setButton2(Button button2) {
        this.button2 = button2;
    }

    public ImageView getImageAd() {
        return ImageAd;
    }

    public void setImageAd(ImageView imageAd) {
        ImageAd = imageAd;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public Button getButton1() {
        return button1;
    }

    public void setButton1(Button button1) {
        this.button1 = button1;
    }

    public TextView getTitleAdPopup() {
        return TitleAdPopup;
    }

    public void setTitleAdPopup(TextView titleAdPopup) {
        TitleAdPopup = titleAdPopup;
    }

    public TextView getTimeAfkAdPopup() {
        return TimeAfkAdPopup;
    }

    public void setTimeAfkAdPopup(TextView timeAfkAdPopup) {
        TimeAfkAdPopup = timeAfkAdPopup;
    }

    public TextView getNumberWinAdPopup() {
        return NumberWinAdPopup;
    }

    public void setNumberWinAdPopup(TextView numberWinAdPopup) {
        NumberWinAdPopup = numberWinAdPopup;
    }

    public String getTitleAd() {
        return TitleAd;
    }

    public void setTitleAd(String titleAd) {
        TitleAd = titleAd;
    }

    public String getTimeAfkAd() {
        return TimeAfkAd;
    }

    public void setTimeAfkAd(String timeAfkAd) {
        TimeAfkAd = timeAfkAd;
    }

    public String getNumberWinAd() {
        return NumberWinAd;
    }

    public void setNumberWinAd(String numberWinAd) {
        NumberWinAd = numberWinAd;
    }
}