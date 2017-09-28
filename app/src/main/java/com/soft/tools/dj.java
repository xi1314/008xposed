package com.soft.tools;

import android.app.Activity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.soft.apk008.HistoryActivity;
import com.soft.apk008.StartActivity;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public final class dj
{
  String a = "";
  private LinearLayout b;
  private View c;
  private View d;
  private View e;
  private View f;
  
  public static void a(Activity paramActivity, int paramInt)
  {
    Object localObject2 = (ArrayList)a.a.get(HistoryActivity.a);
    Object localObject1 = localObject2;
    if (localObject2 == null) {
      localObject1 = new ArrayList();
    }
    localObject1 = (HashMap)((ArrayList)localObject1).get(paramInt);
    if (localObject1 != null) {
      localObject1 = ((HashMap)localObject1).entrySet().iterator();
    }
    for (;;)
    {
      if (!((Iterator)localObject1).hasNext())
      {
        PoseHelper008.saveData();
        Toast.makeText(paramActivity, "设置数据:" + PoseHelper008.valueMap.getStringfrommap("getDeviceId") + "成功", 0).show();
        return;
      }
      Object localObject3 = (Map.Entry)((Iterator)localObject1).next();
      localObject2 = (String)((Map.Entry)localObject3).getKey();
      localObject3 = (String)((Map.Entry)localObject3).getValue();
      PoseHelper008.valueMap.putkey((String)localObject2, localObject3);
    }
  }
  
  public final void a(Activity paramActivity)
  {
    this.b = ((LinearLayout)paramActivity.findViewById(2131362149));
    if (StartActivity.h.indexOf("quickToolQuick") < 0) {
      this.b.setVisibility(8);
    }
    this.c = paramActivity.findViewById(2131362151);
    this.d = paramActivity.findViewById(2131362152);
    this.e = paramActivity.findViewById(2131362153);
    this.f = paramActivity.findViewById(2131362154);
    paramActivity = new dk(this, paramActivity);
    this.c.setOnClickListener(paramActivity);
    this.d.setOnClickListener(paramActivity);
    this.e.setOnClickListener(paramActivity);
    this.f.setOnClickListener(paramActivity);
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.dj

 * JD-Core Version:    0.7.0.1

 */