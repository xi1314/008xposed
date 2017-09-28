package com.imengququ.myxposed.soft.apk008.remain;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.lishu.jifen.db.FileHelper;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;
import java.util.ArrayList;
import java.util.Iterator;

public class ReMainActivity
  extends Activity
{
  private MyAdapter adapter;
  private Button button_next;
  private Button button_pre;
  private Button button_reset;
  JSONArray dataList = new JSONArray();
  private Dialog dialog;
  private ListView listView;
  View.OnClickListener listener = new View.OnClickListener()
  {
    public void onClick(View paramAnonymousView)
    {
      Iterator localIterator;
      if (paramAnonymousView.equals(ReMainActivity.this.button_pre))
      {
        paramAnonymousView = null;
        localIterator = ReMainActivity.this.dataList.iterator();
        if (!localIterator.hasNext())
        {
          label38:
          if (paramAnonymousView != null) {
            break label99;
          }
          Toast.makeText(ReMainActivity.this, "向前已经没有了数据", 0).show();
        }
      }
      label99:
      label246:
      do
      {
        return;
        JSONObject localJSONObject = (JSONObject)localIterator.next();
        int i = localJSONObject.getIntValue("nowProgess");
        if (i == localJSONObject.getIntValue("count"))
        {
          paramAnonymousView = localJSONObject;
          break;
        }
        if (i <= 1) {
          break;
        }
        paramAnonymousView = localJSONObject;
        break label38;
        i = paramAnonymousView.getIntValue("nowProgess");
        paramAnonymousView.put("nowProgess", i - 1);
        ReMainActivity.this.setProgress(i - 1, paramAnonymousView.get("titleText"));
        return;
        if (paramAnonymousView.equals(ReMainActivity.this.button_next))
        {
          paramAnonymousView = null;
          localIterator = ReMainActivity.this.dataList.iterator();
          if (!localIterator.hasNext()) {}
          for (;;)
          {
            if (paramAnonymousView != null) {
              break label246;
            }
            Toast.makeText(ReMainActivity.this, "向后已经没有了数据", 0).show();
            return;
            localJSONObject = (JSONObject)localIterator.next();
            if (localJSONObject.getIntValue("nowProgess") >= localJSONObject.getIntValue("count")) {
              break;
            }
            paramAnonymousView = localJSONObject;
          }
          i = paramAnonymousView.getIntValue("nowProgess");
          paramAnonymousView.put("nowProgess", i + 1);
          ReMainActivity.this.setProgress(i + 1, paramAnonymousView.get("titleText"));
          return;
        }
      } while (!paramAnonymousView.equals(ReMainActivity.this.button_reset));
      paramAnonymousView = ReMainActivity.this.dataList.iterator();
      for (;;)
      {
        if (!paramAnonymousView.hasNext())
        {
          ReMainActivity.this.updateTotal();
          ReMainActivity.this.adapter.notifyDataSetChanged();
          return;
        }
        ((JSONObject)paramAnonymousView.next()).put("nowProgess", "0");
      }
    }
  };
  private ProgressBar mainProgress;
  private TextView textStatus;
  
  public void initData()
  {
    this.dataList = JSONArray.parseArray(PoseHelper008.getFileData("ReMainActivity"));
    if (this.dataList == null) {
      this.dataList = new JSONArray();
    }
    updateTotal();
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, final Intent paramIntent)
  {
    if ((paramInt1 == 1) && (paramIntent != null))
    {
      paramIntent = paramIntent.getStringExtra("name");
      final ArrayList localArrayList = (ArrayList)FileHelper.AllItemList.get(paramIntent);
      Builder localBuilder = new Builder(this);
      Object localObject = LayoutInflater.from(this).inflate(2130903052, null);
      localBuilder.setView((View)localObject);
      localBuilder.setTitle("设置留存");
      TextView localTextView1 = (TextView)((View)localObject).findViewById(2131230789);
      TextView localTextView2 = (TextView)((View)localObject).findViewById(2131230792);
      localObject = (EditText)((View)localObject).findViewById(2131230791);
      localTextView1.setText("请输入：");
      localTextView2.setText("留存为1-100以内的数值");
      localBuilder.setNegativeButton("确定", new DialogInterface.OnClickListener()
      {
        public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          paramAnonymousDialogInterface = this.val$editText.getText().toString();
          paramAnonymousInt = -1;
          try
          {
            int i = Integer.parseInt(paramAnonymousDialogInterface);
            paramAnonymousInt = i;
          }
          catch (Exception paramAnonymousDialogInterface)
          {
            for (;;)
            {
              paramAnonymousDialogInterface.printStackTrace();
            }
            if ((paramAnonymousInt <= 100) && (paramAnonymousInt > 0)) {
              break label73;
            }
            Toast.makeText(ReMainActivity.this, "留存为0到100的数值", 0).show();
            return;
            label73:
            paramAnonymousDialogInterface = new JSONObject();
            paramAnonymousDialogInterface.put("askText", "设置的留存为" + paramAnonymousInt + "%,总共任务数为：" + localArrayList.size() * paramAnonymousInt / 100);
            paramAnonymousDialogInterface.put("statusText", "当前第0个,进度为0%");
            paramAnonymousDialogInterface.put("titleText", paramIntent);
            paramAnonymousDialogInterface.put("count", localArrayList.size() * paramAnonymousInt / 100);
            paramAnonymousDialogInterface.put("nowProgess", "0");
            ReMainActivity.this.dataList.add(paramAnonymousDialogInterface);
            ReMainActivity.this.adapter.notifyDataSetChanged();
            ReMainActivity.this.updateTotal();
          }
          if (paramAnonymousInt == -1)
          {
            Toast.makeText(ReMainActivity.this, "留存为0到100的数值", 0).show();
            return;
          }
        }
      });
      localBuilder.setPositiveButton("取消", new DialogInterface.OnClickListener()
      {
        public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          paramAnonymousDialogInterface.cancel();
        }
      });
      localBuilder.create().show();
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(R.layout.remain);
    this.listView = ((ListView)findViewById(R.id.remain_listView));
    this.button_pre = ((Button)findViewById(R.id.remain_preData));
    this.button_next = ((Button)findViewById(R.id.remain_nextData));
    this.mainProgress = ((ProgressBar)findViewById(R.id.remain_progressBar);
    this.textStatus = ((TextView)findViewById(2131230785));
    this.button_reset = ((Button)findViewById(2131230788));
    initData();
    this.adapter = new MyAdapter();
    this.listView.setAdapter(this.adapter);
    this.button_next.setOnClickListener(this.listener);
    this.button_pre.setOnClickListener(this.listener);
    this.button_reset.setOnClickListener(this.listener);
    this.listView.setOnItemLongClickListener(new OnItemLongClickListener()
    {
      public boolean onItemLongClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        ReMainActivity.this.showEditAlertDialog(paramAnonymousInt);
        return false;
      }
    });
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    getMenuInflater().inflate(2131165185, paramMenu);
    return true;
  }
  
  protected void onDestroy()
  {
    PoseHelper008.saveDataToFile("ReMainActivity", this.dataList.toJSONString());
    super.onDestroy();
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == 2131230971)
    {
      paramMenuItem = new Intent();
      paramMenuItem.setClass(this, RecordSelectActivity.class);
      startActivityForResult(paramMenuItem, 1);
    }
    return true;
  }
  
  public void setProgress(int paramInt, String paramString)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("name", paramString);
    localIntent.putExtra("progress", paramInt);
    setResult(1, localIntent);
    finish();
  }
  
  public void showEditAlertDialog(final int paramInt)
  {
    Builder localBuilder = new Builder(this);
    localBuilder.setTitle("注意");
    localBuilder.setMessage("是否删除当前留存");
    localBuilder.setNegativeButton("确定", new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        ReMainActivity.this.dataList.remove(paramInt);
        ReMainActivity.this.adapter.notifyDataSetChanged();
        Toast.makeText(ReMainActivity.this, "删除成功", 0).show();
        ReMainActivity.this.updateTotal();
      }
    });
    localBuilder.setPositiveButton("取消", new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        paramAnonymousDialogInterface.cancel();
      }
    });
    this.dialog = localBuilder.create();
    this.dialog.show();
  }
  
  public void updateTotal()
  {
    int j = 0;
    int i = 0;
    Iterator localIterator = this.dataList.iterator();
    for (;;)
    {
      if (!localIterator.hasNext())
      {
        k = (int)(j * 100 / i);
        this.textStatus.setText("当前：" + j + ",总共:" + i + "  进度为：" + k + "%");
        this.mainProgress.setMax(i);
        this.mainProgress.setProgress(j);
        return;
      }
      JSONObject localJSONObject = (JSONObject)localIterator.next();
      j += localJSONObject.getIntValue("nowProgess");
      i += localJSONObject.getIntValue("count");
      int k = (int)(localJSONObject.getIntValue("nowProgess") * 100 / i);
      localJSONObject.put("statusText", "当前为：" + localJSONObject.getIntValue("nowProgess") + "个，进度为" + k + "%");
    }
  }
  
  class MyAdapter
    extends BaseAdapter
  {
    MyAdapter() {}
    
    public int getCount()
    {
      return ReMainActivity.this.dataList.size();
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
        paramViewGroup = LayoutInflater.from(ReMainActivity.this).inflate(2130903053, null);
        paramView = new ViewHolder(ReMainActivity.this);
        paramViewGroup.setTag(paramView);
        paramView.askText = ((TextView)paramViewGroup.findViewById(2131230794));
        paramView.progress = ((ProgressBar)paramViewGroup.findViewById(2131230795));
        paramView.statusText = ((TextView)paramViewGroup.findViewById(2131230796));
        paramView.titleText = ((TextView)paramViewGroup.findViewById(2131230793));
      }
      paramView = (ViewHolder)paramViewGroup.getTag();
      JSONObject localJSONObject = (JSONObject)ReMainActivity.this.dataList.get(paramInt);
      paramView.askText.setText(localJSONObject.getString("askText"));
      paramView.statusText.setText(localJSONObject.getString("statusText"));
      paramView.titleText.setText(localJSONObject.getString("titleText"));
      paramInt = Integer.parseInt(localJSONObject.getString("nowProgess"));
      int i = Integer.parseInt(localJSONObject.getString("count"));
      paramView.progress.setMax(i);
      paramView.progress.setProgress(paramInt);
      return paramViewGroup;
    }
  }
  
  class ViewHolder
  {
    public TextView askText;
    public ProgressBar progress;
    public TextView statusText;
    public TextView titleText;
    
    ViewHolder() {}
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008shenqi0113_downcc\ProjectSrc\smali\

 * Qualified Name:     ReMainActivity

 * JD-Core Version:    0.7.0.1

 */