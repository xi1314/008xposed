package com.lishu.levitate;

import android.app.Application;
import android.app.Service;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.IBinder;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.Button;
import android.widget.LinearLayout;

public class FloatWindow
  extends Service
{
  LinearLayout a;
  WindowManager.LayoutParams b;
  WindowManager c;
  Button d;
  private boolean e = false;
  private boolean f = false;
  private float g = 0.0F;
  private float h = 0.0F;
  private float i = 0.0F;
  private float j = 0.0F;
  private float k = 0.0F;
  
  private String a(String paramString)
  {
    return getSharedPreferences("008", 0).getString(paramString, "");
  }
  
  private void a(String paramString1, String paramString2)
  {
    getSharedPreferences("008", 0).edit().putString(paramString1, paramString2).commit();
  }
  
  private void b()
  {
    float f1 = this.b.x;
    float f2 = this.b.y;
    a("lastX", f1);
    a("lastY", f2);
  }
  
  public final void a()
  {
    new a(getApplication());
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    return null;
  }
  
  public void onCreate()
  {
    super.onCreate();
    Log.i("FloatWindow", "oncreat");
    this.b = new WindowManager.LayoutParams();
    Object localObject = getApplication();
    getApplication();
    this.c = ((WindowManager)((Application)localObject).getSystemService("window"));
    Log.i("FloatWindow", "mWindowManager--->" + this.c);
    this.b.type = 2002;
    this.b.format = 1;
    this.b.flags = 8;
    this.b.gravity = 51;
    this.b.x = 0;
    this.b.y = 0;
    localObject = a("lastX");
    String str = a("lastY");
    if ((((String)localObject).length() > 0) && (str.length() > 0))
    {
      this.b.x = ((int)Float.parseFloat((String)localObject));
      this.b.y = ((int)Float.parseFloat(str));
    }
    this.b.width = -2;
    this.b.height = -2;
    this.a = ((LinearLayout)LayoutInflater.from(getApplication()).inflate(2130903042, null));
    this.c.addView(this.a, this.b);
    this.d = ((Button)this.a.findViewById(2131361801));
    this.a.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
    Log.i("FloatWindow", "Width/2--->" + this.d.getMeasuredWidth() / 2);
    Log.i("FloatWindow", "Height/2--->" + this.d.getMeasuredHeight() / 2);
    this.d.setOnTouchListener(new w(this));
  }
  
  public void onDestroy()
  {
    b();
    Intent localIntent = new Intent();
    localIntent.setClass(this, FloatWindow.class);
    startService(localIntent);
    super.onDestroy();
    if (this.a != null) {
      this.c.removeView(this.a);
    }
  }
  
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    return 0;
  }
}


