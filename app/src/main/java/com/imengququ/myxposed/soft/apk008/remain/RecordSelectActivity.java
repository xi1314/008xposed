package com.imengququ.myxposed.soft.apk008.remain;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.lishu.jifen.db.FileHelper;
import java.util.ArrayList;
import java.util.HashMap;

public class RecordSelectActivity
  extends Activity
{
  private MyAdapter adapter;
  private ArrayList<HashMap<String, String>> dataList = new ArrayList();
  private Dialog dialog;
  private ListView listView;
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(R.layout.remain_select);
    this.listView = ((ListView)findViewById(R.id.remain_select_listView));
    paramBundle = FileHelper.getAllKind();
    int j = paramBundle.length;
    int i = 0;
    if (i >= j)
    {
      this.adapter = new MyAdapter();
      this.listView.setAdapter(this.adapter);
      this.listView.setOnItemClickListener(new OnItemClickListener()
      {
        public void onItemClick(AdapterView<?> AdapterView, View View, int Int, long Long)
        {
         Intent I  = new Intent();
          I.putExtra("name", (String)((HashMap)RecordSelectActivity.this.dataList.get(Int)).get("name"));
          RecordSelectActivity.this.setResult(1, AdapterView);
          RecordSelectActivity.this.finish();
        }
      });
      return;
    }
    Object localObject = paramBundle[i];
    ArrayList localArrayList = (ArrayList)FileHelper.AllItemList.get(localObject);
    if (localArrayList == null) {}
    for (;;)
    {
      i += 1;
      break;
      HashMap localHashMap = new HashMap();
      localHashMap.put("name", localObject);
      localHashMap.put("count", localArrayList.size() + "个");
      this.dataList.add(localHashMap);
    }
  }
  
  class MyAdapter
    extends BaseAdapter
  {
    MyAdapter() {}
    
    public int getCount()
    {
      return RecordSelectActivity.this.dataList.size();
    }
    
    public Object getItem(int paramInt)
    {
      return null;
    }
    
    public long getItemId(int paramInt)
    {
      return 0L;
    }
    
    public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      paramViewGroup = paramView;
      if (paramView == null)
      {
        paramViewGroup = LayoutInflater.from(RecordSelectActivity.this).inflate(2130903055, null);
        paramView = new ViewHolder(RecordSelectActivity.this);
        paramViewGroup.setTag(paramView);
        paramView.title = ((TextView)paramViewGroup.findViewById(2131230798));
        paramView.des = ((TextView)paramViewGroup.findViewById(2131230799));
      }
      paramView = (ViewHolder)paramViewGroup.getTag();
      Object localObject = (HashMap)RecordSelectActivity.this.dataList.get(paramInt);
      String str = (String)((HashMap)localObject).get("name");
      localObject = (String)((HashMap)localObject).get("count");
      paramView.des.setText((CharSequence)localObject);
      paramView.title.setText(str);
      return paramViewGroup;
    }
  }
  
  class ViewHolder
  {
    public TextView des;
    public TextView title;
    
    ViewHolder() {}
  }
}

