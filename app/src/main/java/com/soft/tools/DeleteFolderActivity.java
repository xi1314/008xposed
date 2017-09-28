package com.soft.tools;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.a.a.b;
import com.a.a.Map;
import com.utils.folderChoose.FSExplorer;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;
import java.io.File;

public class DeleteFolderActivity
  extends Activity
  implements View.OnClickListener
{
  private View a;
  private View b;
  private View c;
  private b d = null;
  private ListView e;
  private a f;
  
  private int a(File paramFile)
  {
    int k = 0;
    int i;
    if (!paramFile.exists()) {
      i = 1;
    }
    int m;
    int j;
    do
    {
      do
      {
        do
        {
          do
          {
            return i;
            if (!paramFile.canWrite()) {
              return 2;
            }
            i = k;
          } while (paramFile.isFile());
          paramFile = paramFile.listFiles();
          i = k;
        } while (paramFile == null);
        i = k;
      } while (paramFile.length == 0);
      m = paramFile.length;
      j = 0;
      i = k;
    } while (j >= m);
    File localFile = paramFile[j];
    if (localFile.isDirectory()) {
      b(localFile);
    }
    for (;;)
    {
      j += 1;
      break;
      localFile.delete();
    }
  }
  
  private int b(File paramFile)
  {
    int j = 2;
    int i;
    if (!paramFile.exists()) {
      i = 1;
    }
    File[] arrayOfFile;
    do
    {
      do
      {
        do
        {
          return i;
          i = j;
        } while (!paramFile.canWrite());
        if (!paramFile.isFile()) {
          break;
        }
        i = j;
      } while (!paramFile.delete());
      return 0;
      arrayOfFile = paramFile.listFiles();
      if ((arrayOfFile == null) || (arrayOfFile.length == 0))
      {
        paramFile.delete();
        return 0;
      }
      int k = arrayOfFile.length;
      i = 0;
      if (i < k) {
        break;
      }
      i = j;
    } while (!paramFile.delete());
    return 0;
    File localFile = arrayOfFile[i];
    if (localFile.isDirectory()) {
      b(localFile);
    }
    for (;;)
    {
      i += 1;
      break;
      localFile.delete();
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    paramIntent = FSExplorer.e.entrySet().iterator();
    if (!paramIntent.hasNext()) {
      return;
    }
    String str = (String)((Map.Entry)paramIntent.next()).getKey();
    paramInt1 = 0;
    for (;;)
    {
      if (paramInt1 >= this.d.size()) {}
      for (paramInt1 = 0;; paramInt1 = 1)
      {
        if (paramInt1 != 0) {
          break label183;
        }
        AlertDialog.Builder localBuilder = new AlertDialog.Builder(this);
        localBuilder.setTitle("设置删除的类型");
        View localView = LayoutInflater.from(this).inflate(2130903089, null);
        RadioButton localRadioButton = (RadioButton)localView.findViewById(2131362057);
        localView.findViewById(2131362058);
        ((TextView)localView.findViewById(2131362056)).setText(str);
        localBuilder.setView(localView);
        localBuilder.setNegativeButton("确定", new ae(this, localRadioButton, str));
        localBuilder.create().show();
        break;
        if (!this.d.e(paramInt1).equals(str)) {
          break label185;
        }
      }
      label183:
      break;
      label185:
      paramInt1 += 1;
    }
  }
  
  public void onClick(View paramView)
  {
    int k;
    int j;
    label63:
    String str;
    int i;
    if (paramView.equals(this.a))
    {
      k = this.d.size();
      j = 0;
      if (j >= this.d.size())
      {
        Toast.makeText(this, "共删除或清空" + k + "个文件和文件夹", 0).show();
        return;
      }
      paramView = this.d.a(j);
      str = paramView.j("filePath");
      i = paramView.h("kind");
      if (i == 0) {
        i = b(new File(str));
      }
    }
    for (;;)
    {
      int m = k;
      if (i > 0)
      {
        k -= 1;
        m = k;
        if (i == 2)
        {
          Toast.makeText(this, "删除" + str + "失败", 0).show();
          m = k;
        }
      }
      j += 1;
      k = m;
      break;
      if (i == 1)
      {
        i = a(new File(str));
        continue;
        if (paramView.equals(this.b))
        {
          paramView = new AlertDialog.Builder(this);
          paramView.setTitle("提示");
          paramView.setMessage("是否清空记录列表");
          paramView.setPositiveButton("确定", new ac(this));
          paramView.setNegativeButton("取消", new ad(this));
          paramView.create().show();
          return;
        }
        if (!paramView.equals(this.c)) {
          break label63;
        }
        paramView = new Intent();
        paramView.setClass(this, FSExplorer.class);
        startActivityForResult(paramView, 0);
        return;
      }
      i = 1;
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903088);
    this.a = findViewById(2131362053);
    this.b = findViewById(2131362054);
    this.c = findViewById(2131362055);
    this.a.setOnClickListener(this);
    this.b.setOnClickListener(this);
    this.c.setOnClickListener(this);
    this.e = ((ListView)findViewById(2131362052));
    paramBundle = PoseHelper008.getFileData("DeleteFolderActivity");
    if ((paramBundle != null) && (paramBundle.length() > 0)) {}
    try
    {
      this.d = a.c(paramBundle);
      label109:
      if (this.d == null) {
        this.d = new b();
      }
      while ((this.d.size() <= 0) || (!(this.d.get(0) instanceof String)))
      {
        this.f = new a();
        this.e.setAdapter(this.f);
        this.e.setOnItemLongClickListener(new z(this));
        return;
      }
      paramBundle = new b();
      int i = 0;
      for (;;)
      {
        if (i >= this.d.size())
        {
          this.d = paramBundle;
          break;
        }
        String str = this.d.e(i);
        Map locale = new Map();
        locale.putkey("filePath", str);
        locale.putkey("kind", Integer.valueOf(0));
        paramBundle.add(locale);
        i += 1;
      }
    }
    catch (Exception paramBundle)
    {
      break label109;
    }
  }
  
  protected void onDestroy()
  {
    PoseHelper008.saveDataToFile("DeleteFolderActivity", this.d.a());
    super.onDestroy();
  }
  
  final class a
    extends BaseAdapter
  {
    a() {}
    
    public final int getCount()
    {
      return DeleteFolderActivity.a(DeleteFolderActivity.this).size();
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
        paramViewGroup = LayoutInflater.from(DeleteFolderActivity.this).inflate(2130903090, null);
      }
      Object localObject = DeleteFolderActivity.a(DeleteFolderActivity.this).a(paramInt);
      paramView = ((Map)localObject).getStringfrommap("filePath");
      paramInt = ((Map)localObject).h("kind");
      localObject = (TextView)paramViewGroup.findViewById(2131362056);
      TextView localTextView = (TextView)paramViewGroup.findViewById(2131362059);
      ((TextView)localObject).setText(paramView);
      if (paramInt == 0) {
        localTextView.setText("删除文件夹");
      }
      while (paramInt != 1) {
        return paramViewGroup;
      }
      localTextView.setText("清空文件夹");
      return paramViewGroup;
    }
  }
}



/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\

 * Qualified Name:     com.soft.tools.DeleteFolderActivity

 * JD-Core Version:    0.7.0.1

 */