package com.soft.apk008;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.FrameLayout.LayoutParams;
import java.lang.reflect.Method;

public final class cy
{
  private static String a;
  private final a b;
  private boolean c;
  private boolean d;
  private boolean e;
  private boolean f;
  private View g;
  private View h;
  
  static
  {
    if (Build.VERSION.SDK_INT >= 19) {}
    try
    {
      Method localMethod = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", new Class[] { String.class });
      localMethod.setAccessible(true);
      a = (String)localMethod.invoke(null, new Object[] { "qemu.hw.mainkeys" });
      return;
    }
    catch (Throwable localThrowable)
    {
      a = null;
    }
  }
  
  public cy(Activity paramActivity)
  {
    Object localObject1 = paramActivity.getWindow();
    ViewGroup localViewGroup = (ViewGroup)((Window)localObject1).getDecorView();
    Object localObject2;
    if (Build.VERSION.SDK_INT >= 19)
    {
      localObject2 = paramActivity.getWindow();
      ((Window)localObject2).setFlags(67108864, 67108864);
      ((Window)localObject2).setFlags(134217728, 134217728);
      localObject2 = paramActivity.obtainStyledAttributes(new int[] { 16843759, 16843760 });
    }
    for (;;)
    {
      try
      {
        this.c = ((TypedArray)localObject2).getBoolean(0, false);
        this.d = ((TypedArray)localObject2).getBoolean(1, false);
        ((TypedArray)localObject2).recycle();
        localObject1 = ((Window)localObject1).getAttributes();
        if ((((WindowManager.LayoutParams)localObject1).flags & 0x4000000) != 0) {
          this.c = true;
        }
        if ((((WindowManager.LayoutParams)localObject1).flags & 0x8000000) != 0) {
          this.d = true;
        }
        this.b = new a(paramActivity, this.c, this.d, (byte)0);
        if (!this.b.c()) {
          this.d = false;
        }
        if (this.c)
        {
          this.g = new View(paramActivity);
          localObject1 = new FrameLayout.LayoutParams(-1, this.b.b());
          ((FrameLayout.LayoutParams)localObject1).gravity = 48;
          if ((this.d) && (!this.b.a())) {
            ((FrameLayout.LayoutParams)localObject1).rightMargin = this.b.e();
          }
          this.g.setLayoutParams((ViewGroup.LayoutParams)localObject1);
          this.g.setBackgroundColor(-1728053248);
          this.g.setVisibility(8);
          localViewGroup.addView(this.g);
        }
        if (this.d)
        {
          this.h = new View(paramActivity);
          if (this.b.a())
          {
            paramActivity = new FrameLayout.LayoutParams(-1, this.b.d());
            paramActivity.gravity = 80;
            this.h.setLayoutParams(paramActivity);
            this.h.setBackgroundColor(-1728053248);
            this.h.setVisibility(8);
            localViewGroup.addView(this.h);
          }
        }
        else
        {
          return;
        }
      }
      finally
      {
        ((TypedArray)localObject2).recycle();
      }
      paramActivity = new FrameLayout.LayoutParams(this.b.e(), -1);
      paramActivity.gravity = 5;
    }
  }
  
  public final void a()
  {
    this.e = true;
    if (this.c) {
      this.g.setVisibility(0);
    }
  }
  
  public final void a(int paramInt)
  {
    if (this.c) {
      this.g.setBackgroundColor(paramInt);
    }
    if (this.d) {
      this.h.setBackgroundColor(paramInt);
    }
  }
  
  public final void b()
  {
    this.f = true;
    if (this.d) {
      this.h.setVisibility(0);
    }
  }
  
  public static final class a
  {
    private final boolean a;
    private final boolean b;
    private final int c;
    private final int d;
    private final boolean e;
    private final int f;
    private final int g;
    private final boolean h;
    private final float i;
    
    private a(Activity paramActivity, boolean paramBoolean1, boolean paramBoolean2)
    {
      Object localObject1 = paramActivity.getResources();
      boolean bool1;
      Object localObject2;
      if (((Resources)localObject1).getConfiguration().orientation == 1)
      {
        bool1 = true;
        this.h = bool1;
        localObject2 = new DisplayMetrics();
        if (Build.VERSION.SDK_INT < 16) {
          break label277;
        }
        paramActivity.getWindowManager().getDefaultDisplay().getRealMetrics((DisplayMetrics)localObject2);
        label65:
        this.i = Math.min(((DisplayMetrics)localObject2).widthPixels / ((DisplayMetrics)localObject2).density, ((DisplayMetrics)localObject2).heightPixels / ((DisplayMetrics)localObject2).density);
        this.c = a((Resources)localObject1, "status_bar_height");
        if (Build.VERSION.SDK_INT < 14) {
          break label319;
        }
        localObject1 = new TypedValue();
        paramActivity.getTheme().resolveAttribute(16843499, (TypedValue)localObject1, true);
      }
      label277:
      label307:
      label313:
      label319:
      for (int j = TypedValue.complexToDimensionPixelSize(((TypedValue)localObject1).data, paramActivity.getResources().getDisplayMetrics());; j = 0)
      {
        this.d = j;
        localObject2 = paramActivity.getResources();
        if ((Build.VERSION.SDK_INT >= 14) && (a(paramActivity))) {
          if (this.h)
          {
            localObject1 = "navigation_bar_height";
            label192:
            j = a((Resources)localObject2, (String)localObject1);
            label201:
            this.f = j;
            localObject1 = paramActivity.getResources();
            if ((Build.VERSION.SDK_INT < 14) || (!a(paramActivity))) {
              break label307;
            }
            j = a((Resources)localObject1, "navigation_bar_width");
            label237:
            this.g = j;
            if (this.f <= 0) {
              break label313;
            }
          }
        }
        for (bool1 = bool2;; bool1 = false)
        {
          this.e = bool1;
          this.a = paramBoolean1;
          this.b = paramBoolean2;
          return;
          bool1 = false;
          break;
          paramActivity.getWindowManager().getDefaultDisplay().getMetrics((DisplayMetrics)localObject2);
          break label65;
          localObject1 = "navigation_bar_height_landscape";
          break label192;
          j = 0;
          break label201;
          j = 0;
          break label237;
        }
      }
    }
    
    private static int a(Resources paramResources, String paramString)
    {
      int j = 0;
      int k = paramResources.getIdentifier(paramString, "dimen", "android");
      if (k > 0) {
        j = paramResources.getDimensionPixelSize(k);
      }
      return j;
    }
    
    private static boolean a(Context paramContext)
    {
      Resources localResources = paramContext.getResources();
      int j = localResources.getIdentifier("config_showNavigationBar", "bool", "android");
      boolean bool;
      if (j != 0)
      {
        bool = localResources.getBoolean(j);
        if (!"1".equals(cy.c())) {}
      }
      while (ViewConfiguration.get(paramContext).hasPermanentMenuKey())
      {
        return false;
        if (!"0".equals(cy.c())) {
          break;
        }
        return true;
      }
      return true;
      return bool;
    }
    
    public final boolean a()
    {
      return (this.i >= 600.0F) || (this.h);
    }
    
    public final int b()
    {
      return this.c;
    }
    
    public final boolean c()
    {
      return this.e;
    }
    
    public final int d()
    {
      return this.f;
    }
    
    public final int e()
    {
      return this.g;
    }
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.apk008.cy
 * JD-Core Version:    0.7.0.1
 */