package com.utils.folderChoose;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FSExplorer
  extends Activity
  implements AdapterView.OnItemClickListener
{
  public static HashMap e = new HashMap();
  ListView a = null;
  String b = "/";
  List c = new ArrayList();
  View.OnClickListener d = new clicklistener(this);
  private String f;
  private View g;
  private View h;
  private a i;
  private boolean j = true;
  
  private void a(String paramString)
  {
    setTitle("文件浏览器 > " + paramString);
    if (!this.j) {}
    for (this.c = b(paramString);; this.c = c(paramString))
    {
      this.i.notifyDataSetChanged();
      this.a.setSelection(0);
      return;
    }
  }
  
  private List b(String paramString)
  {
    paramString = new File(paramString).listFiles();
    ArrayList localArrayList = new ArrayList();
    HashMap localHashMap1 = new HashMap();
    localHashMap1.put("name", "/");
    localHashMap1.put("img", Integer.valueOf(2130837588));
    localHashMap1.put("path", "根目录");
    localArrayList.add(localHashMap1);
    localHashMap1 = new HashMap();
    localHashMap1.put("name", "..");
    localHashMap1.put("img", Integer.valueOf(2130837587));
    localHashMap1.put("path", "上层目录");
    localArrayList.add(localHashMap1);
    int k;
    if ((paramString != null) && (paramString.length > 0))
    {
      int m = paramString.length;
      k = 0;
      if (k < m) {}
    }
    else
    {
      return localArrayList;
    }
    localHashMap1 = paramString[k];
    HashMap localHashMap2 = new HashMap();
    if (localHashMap1.isDirectory()) {
      localHashMap2.put("img", Integer.valueOf(2130837584));
    }
    for (;;)
    {
      localHashMap2.put("name", localHashMap1.getName());
      localHashMap2.put("path", localHashMap1.getPath());
      localArrayList.add(localHashMap2);
      k += 1;
      break;
      if (this.f.equals("file")) {
        localHashMap2.put("img", Integer.valueOf(2130837585));
      }
    }
  }
  
  private List c(String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    if (new File(paramString).canRead()) {
      localObject1 = b(paramString);
    }
    Object localObject2;
    int m;
    int k;
    do
    {
      do
      {
        do
        {
          return localObject1;
          localObject1 = new HashMap();
          ((Map)localObject1).put("name", "/");
          ((Map)localObject1).put("img", Integer.valueOf(2130837588));
          ((Map)localObject1).put("path", "根目录");
          localArrayList.add(localObject1);
          localObject1 = new HashMap();
          ((Map)localObject1).put("name", "..");
          ((Map)localObject1).put("img", Integer.valueOf(2130837587));
          ((Map)localObject1).put("path", "上层目录");
          localArrayList.add(localObject1);
          localObject2 = h.a("ls " + paramString, true).trim();
          localObject1 = localArrayList;
        } while (((String)localObject2).length() == 0);
        localObject1 = localArrayList;
      } while (paramString.equals(localObject2));
      localObject2 = ((String)localObject2).split("\n");
      m = localObject2.length;
      k = 0;
      localObject1 = localArrayList;
    } while (k >= m);
    Object localObject1 = localObject2[k];
    String str = paramString + File.separator + (String)localObject1;
    HashMap localHashMap;
    if (new File(str).isDirectory())
    {
      localHashMap = new HashMap();
      localHashMap.put("img", Integer.valueOf(2130837584));
      localHashMap.put("name", localObject1);
      localHashMap.put("path", str);
      localArrayList.add(localHashMap);
    }
    for (;;)
    {
      k += 1;
      break;
      localHashMap = new HashMap();
      if (this.f.equals("file")) {
        localHashMap.put("img", Integer.valueOf(2130837585));
      }
      localHashMap.put("name", localObject1);
      localHashMap.put("path", str);
      localArrayList.add(localHashMap);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903142);
    setTitle("文件浏览器");
    this.f = getIntent().getStringExtra("kind");
    if (this.f == null) {
      this.f = "file";
    }
    this.j = getIntent().getBooleanExtra("su", false);
    this.a = ((ListView)findViewById(2131362259));
    this.a.setOnItemClickListener(this);
    this.i = new a();
    a(this.b);
    this.g = findViewById(2131362260);
    this.h = findViewById(2131362261);
    this.g.setOnClickListener(this.d);
    this.h.setOnClickListener(this.d);
    this.i = new a();
    e.clear();
    this.a.setAdapter(this.i);
  }
  
  public void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    Log.i("FSExplorer", "item clicked! [" + paramInt + "]");
    if (paramInt == 0)
    {
      this.b = "/";
      a(this.b);
    }
    do
    {
      return;
      if (paramInt == 1)
      {
        paramAdapterView = new File(this.b).getParentFile();
        if (paramAdapterView == null)
        {
          Toast.makeText(this, "已经是根目录", 0).show();
          a(this.b);
          return;
        }
        this.b = paramAdapterView.getAbsolutePath();
        a(this.b);
        return;
      }
      this.b = ((String)((Map)this.c.get(paramInt)).get("path"));
    } while (!new File(this.b).isDirectory());
    a(this.b);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    return true;
  }
  
  final class a
    extends BaseAdapter
  {
    a() {}
    
    public final int getCount()
    {
      return FSExplorer.this.c.size();
    }
    
    public final Object getItem(int paramInt)
    {
      return null;
    }
    
    public final long getItemId(int paramInt)
    {
      return 0L;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      paramViewGroup = paramView;
      if (paramView == null) {
        paramViewGroup = LayoutInflater.from(FSExplorer.this).inflate(2130903143, null);
      }
      paramView = (ImageView)paramViewGroup.findViewById(2131362264);
      TextView localTextView1 = (TextView)paramViewGroup.findViewById(2131362265);
      TextView localTextView2 = (TextView)paramViewGroup.findViewById(2131362266);
      CheckBox localCheckBox = (CheckBox)paramViewGroup.findViewById(2131362263);
      String str1 = ((Map)FSExplorer.this.c.get(paramInt)).get("path");
      localCheckBox.setOnCheckedChangeListener(null);
      String str2;
      if (FSExplorer.e.containsKey(str1))
      {
        localCheckBox.setChecked(true);
        localCheckBox.setOnCheckedChangeListener(new b(this, str1));
        str2 = ((Map)FSExplorer.this.c.get(paramInt)).get("name");
        if (!str2.equals("/")) {
          break label261;
        }
        localCheckBox.setVisibility(4);
      }
      for (;;)
      {
        localTextView1.setText(str2);
        localTextView2.setText(str1);
        paramView.setImageResource(Integer.parseInt(((Map)FSExplorer.this.c.get(paramInt)).get("img")));
        return paramViewGroup;
        localCheckBox.setChecked(false);
        break;
        label261:
        if (str2.equals("..")) {
          localCheckBox.setVisibility(4);
        } else {
          localCheckBox.setVisibility(0);
        }
      }
    }
  }
}

