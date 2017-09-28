package com.soft.datasim.set;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ScrollView;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;

public class SimSetActivity
  extends Activity
{
  private LinearLayout linearLayout;
  
  private Button a(String text)
  {
    Button localButton = new Button(this);
    localButton.setText(text);
    LayoutParams layoutparams = new LinearLayout.LayoutParams(-1, -2);
    this.linearLayout.addView(localButton, layoutparams);
    return localButton;
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    PoseHelper008.saveDataToFile("fresh", "true");
    super.onCreate(paramBundle);
    this.linearLayout = new LinearLayout(this);
    this.linearLayout.setOrientation(1);
    new ScrollView(this).addView(this.linearLayout);
    a("账号模拟");
    a("蓝牙模拟");
    a("GLImpl模拟");
    a("程序与进程模拟");
    a("信号强度模拟");
  }
}

