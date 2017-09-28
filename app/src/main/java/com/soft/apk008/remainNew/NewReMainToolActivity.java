package com.soft.apk008.remainNew;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.soft.apk008.StartActivity;
import com.soft.apk008.WebMessageActivity;

public class NewReMainToolActivity
  extends Activity
  implements View.OnClickListener
{
  private static TextView a;
  private static ProgressBar b;
  private static Activity c;
  private Button d;
  private Button e;
  private Button f;
  private Button g;
  private Button h;
  private View i;
  private BroadcastReceiver j = new ad(this);
  
  public static void a(String paramString)
  {
    if (a != null) {
      a.setText(paramString);
    }
  }
  
  public static void a(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    paramString1 = "模式：" + paramString1 + "，当前分类：" + paramString2;
    if (a != null) {
      a.setText(paramString1);
    }
    if (b != null)
    {
      b.setMax(paramInt2);
      b.setProgress(paramInt1);
    }
  }
  
  public void onClick(View paramView)
  {
    if (paramView.equals(this.d)) {
      NewReMainActivity.b(this);
    }
    do
    {
      return;
      if (paramView.equals(this.e))
      {
        NewReMainActivity.c(this);
        return;
      }
      if (paramView.equals(this.f))
      {
        paramView = new Intent();
        paramView.setClass(this, NewReMainActivity.class);
        startActivity(paramView);
        return;
      }
      if (paramView.equals(this.g))
      {
        NewReMainActivity.a(this);
        return;
      }
    } while (!paramView.equals(this.h));
    NewReMainActivity.d(this);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903066);
    c = this;
    a = (TextView)findViewById(2131361923);
    b = (ProgressBar)findViewById(2131361924);
    this.d = ((Button)findViewById(2131361925));
    this.e = ((Button)findViewById(2131361926));
    this.f = ((Button)findViewById(2131361928));
    this.g = ((Button)findViewById(2131361929));
    this.h = ((Button)findViewById(2131361927));
    this.i = findViewById(2131361930);
    this.d.setOnClickListener(this);
    this.e.setOnClickListener(this);
    this.f.setOnClickListener(this);
    this.g.setOnClickListener(this);
    this.h.setOnClickListener(this);
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(2131296274, paramMenu);
    return true;
  }
  
  protected void onDestroy()
  {
    unregisterReceiver(this.j);
    super.onDestroy();
    c = null;
    a = null;
    b = null;
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == 2131362306)
    {
      Intent localIntent = new Intent();
      localIntent.setClass(this, WebMessageActivity.class);
      localIntent.putExtra("url", StartActivity.b + "/phone/ContentAction.action?action=newremain_help");
      startActivity(localIntent);
    }
    return super.onOptionsItemSelected(paramMenuItem);
  }
  
  protected void onStart()
  {
    super.onStart();
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("PROGRESS_CHANGE");
    registerReceiver(this.j, localIntentFilter);
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.apk008.remainNew.NewReMainToolActivity
 * JD-Core Version:    0.7.0.1
 */