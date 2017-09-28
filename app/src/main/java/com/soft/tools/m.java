package com.soft.tools;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class m
  implements DialogInterface.OnClickListener
{
  m(BackupFileActivity paramBackupFileActivity, int paramInt, String[] paramArrayOfString) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface = new AlertDialog.Builder(this.a);
    paramDialogInterface.setTitle("注意");
    paramDialogInterface.setMessage("确定删除？删除后无法还原！");
    paramDialogInterface.setNegativeButton("确定", new n(this, this.b, this.c));
    paramDialogInterface.setPositiveButton("取消", new o(this));
    paramDialogInterface.create().show();
  }
}


/* Location:           D:\AndroidKiller_v1.3.1\projects\008\ProjectSrc\smali\
 * Qualified Name:     com.soft.tools.m
 * JD-Core Version:    0.7.0.1
 */