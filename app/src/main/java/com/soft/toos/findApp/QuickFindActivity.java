package com.soft.toos.findApp;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class QuickFindActivity
  extends Activity
{
  private HashMap a;
  private LinearLayout b;
  private ListView c;
  private TextView d;
  private b e;
  private String[] f = { "#", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };
  private List g = null;
  private List h = new ArrayList();
  private int i;
  private boolean j = false;
  private ProgressDialog k;
  
  private void a()
  {
    List localList = getPackageManager().getInstalledPackages(0);
    int m = 0;
    for (;;)
    {
      if (m >= localList.size()) {
        return;
      }
      PackageInfo localPackageInfo = (PackageInfo)localList.get(m);
      if ((localPackageInfo.applicationInfo.flags & 0x1) == 0)
      {
        a locala = new a();
        locala.a = localPackageInfo.applicationInfo.loadLabel(getPackageManager()).toString();
        locala.c = localPackageInfo.packageName.trim();
        this.g.add(locala);
      }
      m += 1;
    }
  }
  
  public static String[] a(List paramList)
  {
    TreeSet localTreeSet = new TreeSet();
    Object localObject1 = paramList.iterator();
    Object localObject2;
    int m;
    if (!((Iterator)localObject1).hasNext())
    {
      localObject1 = new String[paramList.size() + localTreeSet.size()];
      localObject2 = localTreeSet.iterator();
      m = 0;
      label47:
      if (((Iterator)localObject2).hasNext()) {
        break label131;
      }
      localObject2 = new String[paramList.size()];
      m = 0;
    }
    for (;;)
    {
      if (m >= paramList.size())
      {
        System.arraycopy(localObject2, 0, localObject1, localTreeSet.size(), localObject2.length);
        Arrays.sort((Object[])localObject1, String.CASE_INSENSITIVE_ORDER);
        return localObject1;
        localTreeSet.add(g.b(((a)((Iterator)localObject1).next()).a).substring(0, 1));
        break;
        label131:
        localObject1[m] = ((String)((Iterator)localObject2).next());
        m += 1;
        break label47;
      }
      ((a)paramList.get(m)).b = g.a(((a)paramList.get(m)).a.toString());
      localObject2[m] = g.a(((a)paramList.get(m)).a.toString());
      m += 1;
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    setContentView(2130903133);
    this.b = ((LinearLayout)findViewById(2131362225));
    this.b.setBackgroundColor(Color.parseColor("#00ffffff"));
    this.c = ((ListView)findViewById(2131362223));
    this.d = ((TextView)findViewById(2131362224));
    this.d.setVisibility(8);
    this.k = new ProgressDialog(this);
    this.k.setMessage("正在加载应用列表");
    this.k.setCancelable(false);
    this.k.show();
    new c(this).start();
    this.c.setOnItemClickListener(new e(this));
  }
  
  public void onWindowFocusChanged(boolean paramBoolean)
  {
    LinearLayout.LayoutParams localLayoutParams;
    int m;
    if (!this.j)
    {
      this.i = (this.b.getMeasuredHeight() / this.f.length);
      localLayoutParams = new LinearLayout.LayoutParams(-2, this.i);
      m = 0;
    }
    for (;;)
    {
      if (m >= this.f.length)
      {
        this.j = true;
        return;
      }
      TextView localTextView = new TextView(this);
      localTextView.setLayoutParams(localLayoutParams);
      localTextView.setText(this.f[m]);
      localTextView.setPadding(10, 0, 10, 0);
      this.b.addView(localTextView);
      this.b.setOnTouchListener(new f(this));
      m += 1;
    }
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.toos.findApp.QuickFindActivity
 * JD-Core Version:    0.7.0.1
 */