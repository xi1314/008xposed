package com.soft.tools;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.a.a.Map;
import com.a.a.maputils;

import de.robv.android.xposed.mods.tutorial.PoseHelper008;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HideProgressActivity
  extends Activity
{
  public HashMap a = new HashMap();
  private EditText b;
  private ArrayList c;
  private ViewGroup d;
  private Map e;
  private Map f;
  private CheckBox g;
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramIntent != null)
    {
      paramIntent = paramIntent.getStringExtra("packageName");
      if (paramIntent != null) {
        this.b.setText(paramIntent);
      }
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903095);
    paramBundle = (Button)findViewById(2131362082);
    this.d = ((ViewGroup)findViewById(2131362084));
    this.b = ((EditText)findViewById(2131362081));
    this.g = ((CheckBox)findViewById(2131362083));
    paramBundle.setOnClickListener(new bl(this));
    this.e = maputils.getmap(PoseHelper008.getFileData("hideProgess"));
    if (this.e == null) {
      this.e = new Map();
    }
    Object localObject1;
    int i;
    if (this.e.get("appArray") == null)
    {
      this.f = new Map();
      this.e.putkey("appArray", this.f);
      paramBundle = new ArrayList();
      localObject1 = getPackageManager().getInstalledPackages(0);
      i = 0;
      label159:
      if (i < ((List)localObject1).size()) {
        break label331;
      }
      localObject1 = paramBundle.iterator();
      i = 0;
      if (((Iterator)localObject1).hasNext()) {
        break label433;
      }
      this.c = paramBundle;
      paramBundle = this.c.iterator();
    }
    for (;;)
    {
      if (!paramBundle.hasNext())
      {
        if (this.e.get("hide_target") != null)
        {
          paramBundle = this.e.get("hide_target");
          this.b.setText(paramBundle);
        }
        this.g.setChecked(false);
        if ((this.e.get("ifOpen") != null) && (this.e.get("ifOpen").equals("true"))) {
          this.g.setChecked(true);
        }
        return;
        this.f = ((Map)this.e.get("appArray"));
        break;
        label331:
        localObject2 = (PackageInfo)((List)localObject1).get(i);
        if ((((PackageInfo)localObject2).applicationInfo.flags & 0x1) == 0)
        {
          localObject3 = new a();
          a.a((a)localObject3, ((PackageInfo)localObject2).applicationInfo.loadLabel(getPackageManager()).toString());
          a.b((a)localObject3, ((PackageInfo)localObject2).packageName);
          a.c((a)localObject3, ((PackageInfo)localObject2).versionName);
          a.a((a)localObject3, ((PackageInfo)localObject2).versionCode);
          paramBundle.add(localObject3);
        }
        i += 1;
        break label159;
        label433:
        localObject2 = (a)((Iterator)localObject1).next();
        long l2;
        int j;
        if (a.a.j(a.b((a)localObject2)) != null)
        {
          l2 = Long.parseLong(a.a.j(a.b((a)localObject2)));
          localObject3 = paramBundle.iterator();
          j = 0;
        }
        for (;;)
        {
          if (!((Iterator)localObject3).hasNext()) {}
          for (;;)
          {
            i += 1;
            break;
            localObject4 = (a)((Iterator)localObject3).next();
            long l1 = 0L;
            if (a.a.j(a.b((a)localObject4)) != null) {
              l1 = Long.parseLong(a.a.j(a.b((a)localObject4)));
            }
            if (l2 <= l1) {
              break label572;
            }
            paramBundle.set(j, localObject2);
            paramBundle.set(i, localObject4);
          }
          label572:
          j += 1;
        }
      }
      localObject1 = (a)paramBundle.next();
      Object localObject2 = a.a((a)localObject1);
      Object localObject3 = new CheckBox(this);
      ((CheckBox)localObject3).setText((CharSequence)localObject2);
      Object localObject4 = new LinearLayout.LayoutParams(-1, -2);
      this.d.addView((View)localObject3, (ViewGroup.LayoutParams)localObject4);
      ((CheckBox)localObject3).setTag(localObject1);
      this.a.put(localObject2, localObject3);
      if (this.f.get(a.b((a)localObject1)) != null) {
        ((CheckBox)localObject3).setChecked(true);
      }
    }
  }
  
  protected void onDestroy()
  {
    Object localObject1 = this.a.entrySet();
    this.e.putkey("hide_target", this.b.getText());
    if (this.g.isChecked())
    {
      this.e.putkey("ifOpen", "true");
      this.f.clear();
      localObject1 = ((Set)localObject1).iterator();
    }
    for (;;)
    {
      if (!((Iterator)localObject1).hasNext())
      {
        PoseHelper008.saveDataToFile("hideProgess", maputils.creatmap(this.e));
        super.onDestroy();
        return;
        this.e.putkey("ifOpen", "false");
        break;
      }
      Object localObject2 = (Map.Entry)((Iterator)localObject1).next();
      ((Map.Entry)localObject2).getKey();
      localObject2 = (CheckBox)((Map.Entry)localObject2).getValue();
      if (((CheckBox)localObject2).isChecked())
      {
        localObject2 = (a)((CheckBox)localObject2).getTag();
        this.f.putkey(a.b((a)localObject2), a.a((a)localObject2));
      }
    }
  }
  
  final class a
  {
    private String b = "";
    private String c = "";
    private String d = "";
    private int e = 0;
    
    a() {}
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.HideProgressActivity

 * JD-Core Version:    0.7.0.1

 */