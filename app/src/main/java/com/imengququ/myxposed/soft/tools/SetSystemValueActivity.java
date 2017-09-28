package com.imengququ.myxposed.soft.tools;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.soft.toos.findApp.QuickFindActivity;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;

public class SetSystemValueActivity
  extends Activity
{
  static JSONArray a = null;
  public static final String fileName = "SetSystemValueActivity";
  public static final String fileNamePackAge = "SetSystemValueActivity_packAge";
  public static final String fileNamePackAgeCheckAll = "SetSystemValueActivity_checkAll";
  static boolean using = false;
  private MyAdapter adapter;
 private JSONArray array = new JSONArray();
  private Button button;
  private Button button_clear;
  private Button button_delete;
  private CheckBox checkBox;
  private EditText edit;
  private ListView listView;
  OnClickListener listener = new OnClickListener()
  {
    public void onClick(View View)
    {
      if (SetSystemValueActivity.this.button.equals(View))
      {
       Intent i = new Intent();
        i.setClass(SetSystemValueActivity.this, QuickFindActivity.class);
        SetSystemValueActivity.this.startActivityForResult(i, 1);
      }
      do
      {
        return;
        if (SetSystemValueActivity.this.button_clear.equals(View))
        {
          array.clear();
          adapter.notifyDataSetChanged();
          return;
        }
      } while (!SetSystemValueActivity.this.button_delete.equals(View));
      SetSystemValueActivity.this.deleteSelect();
    }
  };
  
  public static void addItem(String paramString, boolean paramBoolean, Object paramObject)
  {
    if (a == null) {}
    Object localObject1;
    int i;
    try
    {
      a = (JSONArray)JSON.parse(PoseHelper008.getFileData("SetSystemValueActivity"));
      if (a == null) {
        return;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localException.printStackTrace();
      }
      localObject1 = null;
      i = 0;
    }
    Object localObject2;
    String str;
    if (i >= a.size())
    {
      localObject2 = localObject1;
      if (localObject1 == null)
      {
        localObject2 = new JSONObject();
        a.add(localObject2);
      }
      ((JSONObject)localObject2).put("text_name", paramString);
      str = (String)((JSONObject)localObject2).get("text_handleWay");
      if (!paramBoolean) {
        break label222;
      }
      paramString = "读";
      label107:
      if (str != null) {
        break label228;
      }
      localObject1 = paramString;
    }
    for (;;)
    {
      if (paramObject != null) {
        ((JSONObject)localObject2).put("kind", paramObject.getClass().getName());
      }
      ((JSONObject)localObject2).put("value", paramObject);
      ((JSONObject)localObject2).put("text_handleWay", localObject1);
      PoseHelper008.saveDataToFile("SetSystemValueActivity", JSON.toJSONString(a));
      using = false;
      return;
      localObject2 = (JSONObject)a.get(i);
      if (((String)((JSONObject)localObject2).get("text_name")).equals(paramString)) {
        localObject1 = localObject2;
      }
      i += 1;
      break;
      label222:
      paramString = "写";
      break label107;
      label228:
      localObject1 = str;
      if (str.indexOf(paramString) < 0) {
        localObject1 = str + paramString;
      }
    }
  }
  
  public static void deleteSelect(Context paramContext, String paramString)
  {
    try
    {
      paramString = JSON.parseArray(PoseHelper008.getFileData("SetSystemValueActivity"));
      if (paramString != null)
      {
        final int j = 0;
        int i = 0;
        for (;;)
        {
          if (i >= paramString.size())
          {
            if (!(paramContext instanceof Activity)) {
              break;
            }
            ((Activity)paramContext).runOnUiThread(new Runnable()
            {
              public void run()
              {
                Toast.makeText(SetSystemValueActivity.this, "共清除" + j + "条记录", 0).show();
              }
            });
            return;
          }
          Object localObject = paramString.getJSONObject(i);
          String str1 = (String)((JSONObject)localObject).get("text_name");
          String str2 = (String)((JSONObject)localObject).get("text_handleWay");
          localObject = ((JSONObject)localObject).get("check");
          str2 = PoseHelper008.getFileData("SetSystemValueActivity_checkAll").trim();
          int k;
          if (!((String)localObject).equals("true"))
          {
            k = j;
            if (!str2.equals("true")) {}
          }
          else
          {
            k = j + 1;
            Settings.System.putString(paramContext.getContentResolver(), str1, null);
          }
          i += 1;
          j = k;
        }
      }
      return;
    }
    catch (Exception paramContext) {}
  }
  
  public static String getSystemValuePackageName()
  {
    String str = PoseHelper008.getFileData("SetSystemValueActivity_packAge").trim();
    String[] arrayOfString = str.split("_");
    if (arrayOfString.length == 2)
    {
      int i = str.indexOf("_");
      if (i == -1) {
        return "";
      }
      arrayOfString[1] = str.substring(i + 1);
      return arrayOfString[1];
    }
    return "";
  }
  
  public static String getSystemValuePackageName1()
  {
    int i = 0;
    for (;;)
    {
      if (!using)
      {
        using = true;
        localObject1 = null;
      }
      try
      {
        localObject2 = (JSONObject)JSON.parse(PoseHelper008.getFileData("SetSystemValueActivity"));
        localObject1 = localObject2;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          Object localObject2;
          localException.printStackTrace();
        }
        localException[1] = localInterruptedException.substring(i + 1);
        return localException[1];
      }
      using = false;
      Object localObject1 = ((JSONObject)localObject1).get("package");
      localObject2 = ((String)localObject1).split("_");
      if (localObject2.length != 2) {
        break label131;
      }
      i = ((String)localObject1).indexOf("_");
      if (i != -1) {
        break;
      }
      return "";
      try
      {
        Thread.sleep(50L);
        int j = i + 1;
        i = j;
        if (j <= 20) {}
      }
      catch (InterruptedException localInterruptedException)
      {
        localInterruptedException.printStackTrace();
      }
    }
    label131:
    return "";
  }
  
  public void deleteSelect()
  {
    int j = 0;
    int i = 0;
    for (;;)
    {
      if (i >= this.array.size())
      {
        Toast.makeText(this, "共清除" + j + "条记录", 0).show();
        return;
      }
      JSONObject localJSONObject = this.array.getJSONObject(i);
      String str1 = (String)localJSONObject.get("text_name");
      String str2 = (String)localJSONObject.get("text_handleWay");
      int k = j;
      if (localJSONObject.get("check").equals("true"))
      {
        k = j + 1;
        Settings.System.putString(getContentResolver(), str1, null);
      }
      i += 1;
      j = k;
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent Intent)
  {
    if ((paramInt1 != 1) || (Intent == null)) {
      return;
    }
  String  strIntent = Intent.getStringExtra("packageName");
    PoseHelper008.saveDataToFile("SetSystemValueActivity_packAge", strIntent);
    this.edit.setText(strIntent);
    this.array.clear();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903083);
    this.edit = ((EditText)findViewById(2131230926));
    this.button = ((Button)findViewById(2131230927));
    this.button_delete = ((Button)findViewById(2131230929));
    this.button_clear = ((Button)findViewById(2131230930));
    this.checkBox = ((CheckBox)findViewById(2131230931));
    this.listView = ((ListView)findViewById(2131230928));
    try
    {
      this.array = JSON.parseArray(PoseHelper008.getFileData("SetSystemValueActivity"));
      label108:
      if (this.array == null) {
        this.array = new JSONArray();
      }
      paramBundle = PoseHelper008.getFileData("SetSystemValueActivity_packAge").trim();
      this.edit.setText(paramBundle);
      this.adapter = new MyAdapter();
      this.listView.setAdapter(this.adapter);
      this.button.setOnClickListener(this.listener);
      this.button_clear.setOnClickListener(this.listener);
      this.button_delete.setOnClickListener(this.listener);
      int i;
      if (PoseHelper008.getFileData("SetSystemValueActivity_checkAll").trim().equals("true"))
      {
        this.checkBox.setChecked(true);
        i = 0;
      }
      for (;;)
      {
        if (i >= this.array.size())
        {
          this.checkBox.setOnCheckedChangeListener(new OnCheckedChangeListener()
          {
            public void onCheckedChanged(CompoundButton paramAnonymousCompoundButton, boolean paramAnonymousBoolean)
            {
              int i;
              if (paramAnonymousBoolean) {
                i = 0;
              }
              try
              {
                int j = SetSystemValueActivity.this.array.size();
                if (i < j) {
                  break label35;
                }
              }
              catch (Exception paramAnonymousCompoundButton)
              {
                label24:
                label35:
                break label24;
              }
              SetSystemValueActivity.this.adapter.notifyDataSetChanged();
              for (;;)
              {
                return;
                SetSystemValueActivity.this.array.getJSONObject(i).put("check", "true");
                i += 1;
                break;
                i = 0;
                while (i < SetSystemValueActivity.this.array.size())
                {
                  SetSystemValueActivity.this.array.getJSONObject(i).put("check", "false");
                  i += 1;
                }
              }
            }
          });
          return;
        }
        this.array.getJSONObject(i).put("check", "true");
        i += 1;
      }
    }
    catch (Exception paramBundle)
    {
      break label108;
    }
  }
  
  protected void onDestroy()
  {
    String str = this.edit.getText().toString();
    PoseHelper008.saveDataToFile("SetSystemValueActivity", JSON.toJSONString(this.array));
    PoseHelper008.saveDataToFile("SetSystemValueActivity_packAge", str);
    if (this.checkBox.isChecked()) {
      PoseHelper008.saveDataToFile("SetSystemValueActivity_checkAll", "true");
    }
    for (;;)
    {
      super.onDestroy();
      return;
      PoseHelper008.saveDataToFile("SetSystemValueActivity_checkAll", "false");
    }
  }
  
  public void showAlertDialog(int paramInt)
  {
    Object localObject1 = new AlertDialog.Builder(this);
    Object localObject2 = ((LayoutInflater)getSystemService("layout_inflater")).inflate(2130903084, null);
    ((AlertDialog.Builder)localObject1).setView((View)localObject2);
    final EditText localEditText = (EditText)((View)localObject2).findViewById(2131230932);
    Button localButton = (Button)((View)localObject2).findViewById(2131230933);
    localObject2 = (Button)((View)localObject2).findViewById(2131230934);
    Object localObject3 = this.array.getJSONObject(paramInt);
    new StringBuilder().append(((JSONObject)localObject3).get("kind")).toString();
    new StringBuilder().append(((JSONObject)localObject3).get("text_handleWay")).toString();
    localObject3 = ((JSONObject)localObject3).get("text_name");
    String str = Settings.System.getString(getContentResolver(), (String)localObject3);
    if (str == null) {
      localEditText.setText("空");
    }
    for (;;)
    {
      localObject1 = ((AlertDialog.Builder)localObject1).create();
      ((Button)localObject2).setOnClickListener(new OnClickListener()
      {
        public void onClick(View paramAnonymousView)
        {
          Settings.System.putString(SetSystemValueActivity.this.getContentResolver(), this.val$name, null);
          Toast.makeText(SetSystemValueActivity.this, "清空成功！", 0).show();
          this.val$dialog.cancel();
        }
      });
      localButton.setOnClickListener(new OnClickListener()
      {
        public void onClick(View paramAnonymousView)
        {
          paramAnonymousView = localEditText.getText().toString();
          try
          {
            Settings.System.putString(SetSystemValueActivity.this.getContentResolver(), this.val$name, paramAnonymousView);
            Toast.makeText(SetSystemValueActivity.this, "设置成功！", 0).show();
            this.val$dialog.cancel();
            return;
          }
          catch (Exception paramAnonymousView)
          {
            paramAnonymousView.printStackTrace();
          }
        }
      });
      ((Dialog)localObject1).show();
      return;
      localEditText.setText(str);
    }
  }
  
  class MyAdapter
    extends BaseAdapter
  {
    MyAdapter() {}
    
    public int getCount()
    {
      return SetSystemValueActivity.this.array.size();
    }
    
    public Object getItem(int paramInt)
    {
      return null;
    }
    
    public long getItemId(int paramInt)
    {
      return 0L;
    }
    
    public View getView(final int paramInt, final View paramView, ViewGroup paramViewGroup)
    {
      paramViewGroup = paramView;
      if (paramView == null)
      {
        paramViewGroup = ((LayoutInflater)SetSystemValueActivity.this.getSystemService("layout_inflater")).inflate(2130903085, null);
        paramView = (TextView)paramViewGroup.findViewById(2131230937);
        localObject1 = (TextView)paramViewGroup.findViewById(2131230938);
        localObject2 = (Button)paramViewGroup.findViewById(2131230936);
        localObject3 = (CheckBox)paramViewGroup.findViewById(2131230935);
        ViewHolder localViewHolder = new ViewHolder(SetSystemValueActivity.this);
        localViewHolder.text_name = paramView;
        localViewHolder.text_handleWay = ((TextView)localObject1);
        localViewHolder.buttonChange = ((Button)localObject2);
        localViewHolder.check = ((CheckBox)localObject3);
        paramViewGroup.setTag(localViewHolder);
      }
      paramView = (ViewHolder)paramViewGroup.getTag();
      Object localObject3 = SetSystemValueActivity.this.array.getJSONObject(paramInt);
      Object localObject1 = (String)((JSONObject)localObject3).get("text_name");
      Object localObject2 = (String)((JSONObject)localObject3).get("text_handleWay");
      localObject3 = ((JSONObject)localObject3).get("check");
      paramView.text_name.setText((CharSequence)localObject1);
      paramView.text_handleWay.setText((CharSequence)localObject2);
      paramView.check.setTag(Integer.valueOf(paramInt));
      if (((String)localObject3).equals("true")) {
        paramView.check.setChecked(true);
      }
      for (;;)
      {
        paramView.check.setOnCheckedChangeListener(new OnCheckedChangeListener()
        {
          public void onCheckedChanged(CompoundButton paramAnonymousCompoundButton, boolean paramAnonymousBoolean)
          {
            int i = ((Integer)paramView.check.getTag()).intValue();
            paramAnonymousCompoundButton = SetSystemValueActivity.this.array.getJSONObject(i);
            if (paramAnonymousBoolean)
            {
              paramAnonymousCompoundButton.put("check", "true");
              return;
            }
            paramAnonymousCompoundButton.put("check", "false");
          }
        });
        paramView.buttonChange.setOnClickListener(new OnClickListener()
        {
          public void onClick(View paramAnonymousView)
          {
            SetSystemValueActivity.this.showAlertDialog(paramInt);
          }
        });
        return paramViewGroup;
        paramView.check.setChecked(false);
      }
    }
  }
  
  class ViewHolder
  {
    Button buttonChange;
    CheckBox check;
    TextView text_handleWay;
    TextView text_name;
    
    ViewHolder() {}
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008shenqi0113_downcc\ProjectSrc\smali\

 * Qualified Name:     SetSystemValueActivity

 * JD-Core Version:    0.7.0.1

 */