package com.imengququ.myxposed.soft.apk008.remainNew;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.lishu.jifen.db.FileHelper;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import de.robv.android.xposed.mods.tutorial.PoseHelper008;

public class NewReMainSetActivity
  extends Activity
{
  static JSONArray array;
  static final String fileName = "newRemainSet";
  static JSONObject object;
  static final String remainFileName = "NewReMainSetActivity_remain";
  private MyAdapter adapter;
  private Button buttonAdd;
  private CheckBox check_clearData;
  private CheckBox check_deleteFile;
  private CheckBox check_deleteSystem;
  private ListView listView;
  private ArrayList<String> mItems;
  private Spinner spinner;
  
  private ArrayList<String> getArray()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add("自动");
    Iterator localIterator = FileHelper.AllItemList.entrySet().iterator();
    for (;;)
    {
      if (!localIterator.hasNext()) {
        return localArrayList;
      }
      String str = (String)((Map.Entry)localIterator.next()).getKey();
      Object localObject2 = new SimpleDateFormat("yyyy-MM-dd");
      Object localObject1 = null;
      try
      {
        localObject2 = ((SimpleDateFormat)localObject2).parse(str);
        localObject1 = localObject2;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          localException.printStackTrace();
        }
      }
      if (localObject1 != null) {
        localArrayList.add(str);
      }
    }
  }
  
  public static String getData(String paramString)
  {
    init();
    return object.get(paramString);
  }
  
  public static String getMode()
  {
    init();
    String str2 = object.get("mode");
    String str1 = str2;
    if (str2.equals("null"))
    {
      str1 = "自动";
      object.put("mode", "自动");
    }
    return str1;
  }
  
  public static int getRemain(int paramInt)
  {
    init();
    Iterator localIterator = array.iterator();
    JSONObject localJSONObject;
    do
    {
      if (!localIterator.hasNext()) {
        return 0;
      }
      localJSONObject = (JSONObject)localIterator.next();
    } while (paramInt != localJSONObject.getIntValue("day"));
    return localJSONObject.getIntValue("remain");
  }
  
  public static void init()
  {
    if (object == null) {
      object = JSON.parseObject(PoseHelper008.getFileData("newRemainSet"));
    }
    if (object == null)
    {
      object = new JSONObject();
      object.put("mode", "自动");
      save();
    }
    if (array == null) {
      array = JSON.parseArray(PoseHelper008.getFileData("NewReMainSetActivity_remain"));
    }
    if (array == null) {
      array = new JSONArray();
    }
  }
  
  public static void save()
  {
    PoseHelper008.saveDataToFile("newRemainSet", object.toJSONString());
    PoseHelper008.saveDataToFile("NewReMainSetActivity_remain", array.toJSONString());
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903059);
    this.listView = ((ListView)findViewById(2131230817));
    this.buttonAdd = ((Button)findViewById(2131230818));
    this.buttonAdd.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        NewReMainSetActivity.this.showOnAddDialog();
      }
    });
    init();
    this.spinner = ((Spinner)findViewById(2131230813));
    this.mItems = getArray();
    paramBundle = new ArrayAdapter(this, 17367043, this.mItems);
    this.spinner.setAdapter(paramBundle);
    paramBundle = getMode();
    int i = 0;
    Iterator localIterator = this.mItems.iterator();
    if (!localIterator.hasNext())
    {
      this.adapter = new MyAdapter();
      this.listView.setAdapter(this.adapter);
      this.check_deleteFile = ((CheckBox)findViewById(2131230814));
      this.check_clearData = ((CheckBox)findViewById(2131230816));
      this.check_deleteSystem = ((CheckBox)findViewById(2131230815));
      if ((getData("check_deleteFile") != null) && (!getData("check_deleteFile").equals("false"))) {
        break label315;
      }
      this.check_deleteFile.setChecked(false);
      label219:
      if ((getData("check_clearData") != null) && (!getData("check_clearData").equals("false"))) {
        break label326;
      }
      this.check_clearData.setChecked(false);
    }
    for (;;)
    {
      if ((getData("check_deleteSystem") != null) && (!getData("check_deleteSystem").equals("false"))) {
        break label337;
      }
      this.check_deleteSystem.setChecked(false);
      return;
      if (paramBundle.equals((String)localIterator.next())) {
        this.spinner.setSelection(i);
      }
      i += 1;
      break;
      label315:
      this.check_deleteFile.setChecked(true);
      break label219;
      label326:
      this.check_clearData.setChecked(true);
    }
    label337:
    this.check_deleteSystem.setChecked(true);
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    if (this.check_clearData.isChecked())
    {
      object.put("check_clearData", "true");
      if (!this.check_deleteFile.isChecked()) {
        break label123;
      }
      object.put("check_deleteFile", "true");
      label50:
      if (!this.check_deleteSystem.isChecked()) {
        break label139;
      }
      object.put("check_deleteSystem", "true");
    }
    for (;;)
    {
      int i = this.spinner.getSelectedItemPosition();
      String str = (String)this.mItems.get(i);
      object.put("mode", str);
      save();
      return;
      object.put("check_clearData", "false");
      break;
      label123:
      object.put("check_deleteFile", "false");
      break label50;
      label139:
      object.put("check_deleteSystem", "false");
    }
  }
  
  public void showChangeRemainDialog(int paramInt)
  {
    Builder localBuilder = new Builder(this);
    localBuilder.setTitle("注意");
    final EditText localEditText = new EditText(this);
    final JSONObject localJSONObject = array.getJSONObject(paramInt);
    localEditText.setText(localJSONObject.getIntValue("remain"));
    localBuilder.setView(localEditText);
    localBuilder.setPositiveButton("确定", new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        paramAnonymousDialogInterface = localEditText.getText().toString().trim();
        paramAnonymousInt = 0;
        try
        {
          int i = Integer.parseInt(paramAnonymousDialogInterface);
          paramAnonymousInt = i;
        }
        catch (Exception paramAnonymousDialogInterface)
        {
          label25:
          break label25;
        }
        if (paramAnonymousInt <= 0)
        {
          Toast.makeText(NewReMainSetActivity.this, "留存为1-100的整数", 0).show();
          return;
        }
        localJSONObject.put("remain", Integer.valueOf(paramAnonymousInt));
        NewReMainSetActivity.this.adapter.notifyDataSetChanged();
      }
    });
    localBuilder.setNegativeButton("取消", new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        paramAnonymousDialogInterface.cancel();
      }
    });
    localBuilder.create().show();
  }
  
  public void showHandleDialog(final int paramInt)
  {
    Builder localBuilder = new Builder(this);
    localBuilder.setTitle("确定");
    localBuilder.setMessage("选择操作");
    localBuilder.setNegativeButton("修改", new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        NewReMainSetActivity.this.showChangeRemainDialog(paramInt);
      }
    });
    localBuilder.setPositiveButton("删除", new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        NewReMainSetActivity.this.showIfDeleteDialog(paramInt);
      }
    });
    localBuilder.create().show();
  }
  
  public void showIfDeleteDialog(final int paramInt)
  {
    Builder localBuilder = new Builder(this);
    localBuilder.setTitle("注意");
    localBuilder.setMessage("是否删除");
    localBuilder.setPositiveButton("确定", new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        NewReMainSetActivity.array.remove(paramInt);
        NewReMainSetActivity.this.adapter.notifyDataSetChanged();
        NewReMainSetActivity.save();
      }
    });
    localBuilder.setNegativeButton("取消", new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        paramAnonymousDialogInterface.cancel();
      }
    });
    localBuilder.create().show();
  }
  
  public void showOnAddDialog()
  {
    Builder localBuilder = new Builder(this);
    localBuilder.setTitle("注意");
    View localView = LayoutInflater.from(this).inflate(2130903060, null);
    final EditText localEditText1 = (EditText)localView.findViewById(2131230820);
    final EditText localEditText2 = (EditText)localView.findViewById(2131230821);
    localBuilder.setView(localView);
    localBuilder.setNegativeButton("确定", new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        paramAnonymousInt = 0;
        try
        {
          i = Integer.parseInt(localEditText1.getText().toString().trim());
          paramAnonymousInt = i;
        }
        catch (Exception localException2)
        {
          int i;
          label23:
          break label23;
        }
        if (paramAnonymousInt <= 0)
        {
          Toast.makeText(NewReMainSetActivity.this, "天数输入错误", 0).show();
          return;
        }
        i = 0;
        try
        {
          int j = Integer.parseInt(localEditText2.getText().toString().trim());
          i = j;
        }
        catch (Exception localException1)
        {
          label66:
          Object localObject;
          JSONObject localJSONObject;
          break label66;
        }
        if (i <= 0)
        {
          Toast.makeText(NewReMainSetActivity.this, "留存输入错误", 0).show();
          return;
        }
        localObject = NewReMainSetActivity.array.iterator();
        do
        {
          if (!((Iterator)localObject).hasNext())
          {
            localObject = new JSONObject();
            ((JSONObject)localObject).put("day", Integer.valueOf(paramAnonymousInt));
            ((JSONObject)localObject).put("remain", Integer.valueOf(i));
            NewReMainSetActivity.array.add(localObject);
            NewReMainSetActivity.this.updateArray();
            paramAnonymousDialogInterface.cancel();
            NewReMainSetActivity.save();
            return;
          }
          localJSONObject = (JSONObject)((Iterator)localObject).next();
        } while (!localJSONObject.get("day").equals(paramAnonymousInt));
        Toast.makeText(NewReMainSetActivity.this, "天数已经存在", 0).show();
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
  
  protected void updateArray()
  {
    int i = 0;
    if (i >= array.size())
    {
      this.adapter.notifyDataSetChanged();
      return;
    }
    JSONObject localJSONObject1 = array.getJSONObject(i);
    int j = i + 1;
    for (;;)
    {
      if (j >= array.size())
      {
        i += 1;
        break;
      }
      JSONObject localJSONObject2 = array.getJSONObject(j);
      int k = localJSONObject1.getIntValue("day");
      if (localJSONObject2.getIntValue("day") < k)
      {
        array.remove(i);
        array.remove(j - 1);
        array.add(i, localJSONObject2);
        array.add(j, localJSONObject1);
      }
      j += 1;
    }
  }
  
  class MyAdapter
    extends BaseAdapter
  {
    MyAdapter() {}
    
    public int getCount()
    {
      return NewReMainSetActivity.array.size();
    }
    
    public Object getItem(int paramInt)
    {
      return null;
    }
    
    public long getItemId(int paramInt)
    {
      return 0L;
    }
    
    public View getView(final int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      paramViewGroup = paramView;
      if (paramView == null)
      {
        paramViewGroup = LayoutInflater.from(NewReMainSetActivity.this).inflate(2130903058, null);
        paramView = new ViewHolder(NewReMainSetActivity.this);
        paramViewGroup.setTag(paramView);
        localObject = (TextView)paramViewGroup.findViewById(2131230810);
        TextView localTextView = (TextView)paramViewGroup.findViewById(2131230812);
        Button localButton = (Button)paramViewGroup.findViewById(2131230811);
        ViewHolder.access$0(paramView, (TextView)localObject);
        ViewHolder.access$1(paramView, localTextView);
        ViewHolder.access$2(paramView, localButton);
      }
      paramView = (ViewHolder)paramViewGroup.getTag();
      Object localObject = (JSONObject)NewReMainSetActivity.array.get(paramInt);
      ViewHolder.access$3(paramView).setText("第" + ((JSONObject)localObject).get("day") + "天");
      ViewHolder.access$4(paramView).setText("留存:" + ((JSONObject)localObject).get("remain"));
      ViewHolder.access$5(paramView).setOnClickListener(new View.OnClickListener()
      {
        public void onClick(View paramAnonymousView)
        {
          NewReMainSetActivity.this.showHandleDialog(paramInt);
        }
      });
      return paramViewGroup;
    }
  }
  
  class ViewHolder
  {
    private Button buttonHandle;
    private TextView textDay;
    private TextView textRemain;
    
    ViewHolder() {}
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008shenqi0113_downcc\ProjectSrc\smali\

 * Qualified Name:     NewReMainSetActivity

 * JD-Core Version:    0.7.0.1

 */