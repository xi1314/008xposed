package com.imengququ.myxposed.soft.toos.findApp;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
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
  private ListViewAdapter adapter;
  private List<App> apps = null;
  private boolean flag = false;
  private int height;
  private String[] indexStr = { "#", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" };
  private LinearLayout layoutIndex;
  private ListView listView;
  private List<App> newapps = new ArrayList();
  private ProgressDialog pro;
  private HashMap<String, Integer> selector;
  private TextView tv_show;
  
  private void setData()
  {
    this.apps = new ArrayList();
    getInstalledApps(2);
  }
  
  private void sortList(String[] paramArrayOfString)
  {
    int i = 0;
    if (i >= paramArrayOfString.length) {
      return;
    }
    int j;
    if (paramArrayOfString[i].length() != 1)
    {
      j = 0;
      label21:
      if (j < this.apps.size()) {}
    }
    for (;;)
    {
      i += 1;
      break;
      if (paramArrayOfString[i].equals(((App)this.apps.get(j)).getPinYinName()))
      {
        App localApp = new App(((App)this.apps.get(j)).getName(), ((App)this.apps.get(j)).getPinYinName(), ((App)this.apps.get(j)).getPackAgeName());
        this.newapps.add(localApp);
      }
      j += 1;
      break label21;
      this.newapps.add(new App(paramArrayOfString[i]));
    }
  }
  
  public void getIndexView()
  {
    LayoutParams localLayoutParams = new LayoutParams(-2, this.height);
    int i = 0;
    for (;;)
    {
      if (i >= this.indexStr.length) {
        return;
      }
      TextView localTextView = new TextView(this);
      localTextView.setLayoutParams(localLayoutParams);
      localTextView.setText(this.indexStr[i]);
      localTextView.setPadding(10, 0, 10, 0);
      this.layoutIndex.addView(localTextView);
      this.layoutIndex.setOnTouchListener(new OnTouchListener()
      {
        public boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
        {
          int i = (int)(paramAnonymousMotionEvent.getY() / QuickFindActivity.this.height);
          int j;
          if ((i > -1) && (i < QuickFindActivity.this.indexStr.length))
          {
            paramAnonymousView = QuickFindActivity.this.indexStr[i];
            if (QuickFindActivity.this.selector.containsKey(paramAnonymousView))
            {
              j = ((Integer)QuickFindActivity.this.selector.get(paramAnonymousView)).intValue();
              if (QuickFindActivity.this.listView.getHeaderViewsCount() <= 0) {
                break label174;
              }
              QuickFindActivity.this.listView.setSelectionFromTop(QuickFindActivity.this.listView.getHeaderViewsCount() + j, 0);
              QuickFindActivity.this.tv_show.setVisibility(0);
              QuickFindActivity.this.tv_show.setText(QuickFindActivity.this.indexStr[i]);
            }
          }
          switch (paramAnonymousMotionEvent.getAction())
          {
          }
          for (;;)
          {
            return true;
            label174:
            QuickFindActivity.this.listView.setSelectionFromTop(j, 0);
            break;
            QuickFindActivity.this.layoutIndex.setBackgroundColor(Color.parseColor("#606060"));
            continue;
            QuickFindActivity.this.layoutIndex.setBackgroundColor(Color.parseColor("#00ffffff"));
            QuickFindActivity.this.tv_show.setVisibility(8);
          }
        }
      });
      i += 1;
    }
  }
  
  public void getInstalledApps(int paramInt)
  {
    List localList = getPackageManager().getInstalledPackages(0);
    int i = 0;
    if (i >= localList.size()) {
      return;
    }
    PackageInfo localPackageInfo = (PackageInfo)localList.get(i);
    App localApp;
    if (paramInt == 2) {
      if ((localPackageInfo.applicationInfo.flags & 0x1) == 0)
      {
        localApp = new App();
        localApp.name = localPackageInfo.applicationInfo.loadLabel(getPackageManager()).toString();
        localApp.packAgeName = localPackageInfo.packageName.trim();
        this.apps.add(localApp);
      }
    }
    for (;;)
    {
      i += 1;
      break;
      if (paramInt == 1)
      {
        localApp = new App();
        localApp.name = localPackageInfo.applicationInfo.loadLabel(getPackageManager()).toString();
        localApp.packAgeName = localPackageInfo.packageName.trim();
        this.apps.add(localApp);
      }
      else if ((paramInt == 3) && ((localPackageInfo.applicationInfo.flags & 0x1) != 0))
      {
        localApp = new App();
        localApp.name = localPackageInfo.applicationInfo.loadLabel(getPackageManager()).toString();
        localApp.packAgeName = localPackageInfo.packageName.trim();
        this.apps.add(localApp);
      }
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    setContentView(2130903091);
    this.layoutIndex = ((LinearLayout)findViewById(2131230949));
    this.layoutIndex.setBackgroundColor(Color.parseColor("#00ffffff"));
    this.listView = ((ListView)findViewById(2131230947));
    this.tv_show = ((TextView)findViewById(2131230948));
    this.tv_show.setVisibility(8);
    this.pro = new ProgressDialog(this);
    this.pro.setMessage("正在加载应用列表");
    this.pro.setCancelable(false);
    this.pro.show();
    new Thread()
    {
      public void run()
      {
        QuickFindActivity.this.setData();
        String[] arrayOfString = QuickFindActivity.this.sortIndex(QuickFindActivity.this.apps);
        QuickFindActivity.this.sortList(arrayOfString);
        QuickFindActivity.this.selector = new HashMap();
        int i = 0;
        if (i >= QuickFindActivity.this.indexStr.length)
        {
          QuickFindActivity.this.runOnUiThread(new Runnable()
          {
            public void run()
            {
              QuickFindActivity.this.adapter = new ListViewAdapter(QuickFindActivity.this, QuickFindActivity.this.newapps);
              QuickFindActivity.this.listView.setAdapter(QuickFindActivity.this.adapter);
              QuickFindActivity.this.adapter.notifyDataSetChanged();
              QuickFindActivity.this.pro.cancel();
            }
          });
          return;
        }
        int j = 0;
        for (;;)
        {
          if (j >= QuickFindActivity.this.newapps.size())
          {
            i += 1;
            break;
          }
          if (((App)QuickFindActivity.this.newapps.get(j)).getName().equals(QuickFindActivity.this.indexStr[i])) {
            QuickFindActivity.this.selector.put(QuickFindActivity.this.indexStr[i], Integer.valueOf(j));
          }
          j += 1;
        }
      }
    }.start();
    this.listView.setOnItemClickListener(new OnItemClickListener()
    {
      public void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        paramAnonymousAdapterView = ((App)QuickFindActivity.this.newapps.get(paramAnonymousInt)).getName() + "_" + ((App)QuickFindActivity.this.newapps.get(paramAnonymousInt)).getPackAgeName();
        if (paramAnonymousAdapterView != null)
        {
          paramAnonymousView = new Intent();
          paramAnonymousView.putExtra("packageName", paramAnonymousAdapterView);
          QuickFindActivity.this.setResult(0, paramAnonymousView);
          QuickFindActivity.this.finish();
        }
      }
    });
  }
  
  public void onWindowFocusChanged(boolean paramBoolean)
  {
    if (!this.flag)
    {
      this.height = (this.layoutIndex.getMeasuredHeight() / this.indexStr.length);
      getIndexView();
      this.flag = true;
    }
  }
  
  public String[] sortIndex(List<App> paramList)
  {
    TreeSet localTreeSet = new TreeSet();
    Object localObject1 = paramList.iterator();
    int i;
    Object localObject2;
    if (!((Iterator)localObject1).hasNext())
    {
      localObject1 = new String[paramList.size() + localTreeSet.size()];
      i = 0;
      localObject2 = localTreeSet.iterator();
      label50:
      if (((Iterator)localObject2).hasNext()) {
        break label138;
      }
      localObject2 = new String[paramList.size()];
      i = 0;
    }
    for (;;)
    {
      if (i >= paramList.size())
      {
        System.arraycopy(localObject2, 0, localObject1, localTreeSet.size(), localObject2.length);
        Arrays.sort((Object[])localObject1, String.CASE_INSENSITIVE_ORDER);
        return localObject1;
        localTreeSet.add(StringHelper.getPinYinHeadChar(((App)((Iterator)localObject1).next()).getName()).substring(0, 1));
        break;
        label138:
        localObject1[i] = ((String)((Iterator)localObject2).next());
        i += 1;
        break label50;
      }
      ((App)paramList.get(i)).setPinYinName(StringHelper.getPingYin(((App)paramList.get(i)).getName().toString()));
      localObject2[i] = StringHelper.getPingYin(((App)paramList.get(i)).getName().toString());
      i += 1;
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008shenqi0113_downcc\ProjectSrc\smali\

 * Qualified Name:     QuickFindActivity

 * JD-Core Version:    0.7.0.1

 */