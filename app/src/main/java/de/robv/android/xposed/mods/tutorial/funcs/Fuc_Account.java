package de.robv.android.xposed.mods.tutorial.funcs;

import android.accounts.Account;
import com.soft.tools.accountSim.AccountSimActivity;

import de.robv.android.xposed.XC_MethodHook;

import java.util.ArrayList;
//hook AccoutManage
public class Fuc_Account
  extends XhookMethod
{
  private static final String className = "android.accounts.AccountManager";
  
  public Fuc_Account()
  {
    addHookWithOnlyMethodName("android.accounts.AccountManager", "getAccounts");
  }
  
  protected void afterHookedMethod(XC_MethodHook.MethodHookParam paramMethodHookParam) {}
  
  protected void beforeHookedMethod(XC_MethodHook.MethodHookParam paramMethodHookParam)
  {
    ArrayList localArrayList ;
    Account[] arrayOfAccount;

    if (paramMethodHookParam.method.getName().equals("getAccounts"))
    {
      onLog(getClass().getName() + "  getAccounts");
      localArrayList = AccountSimActivity.accountarraylist();
      arrayOfAccount = new Account[localArrayList.size()];
      int i;
      for ( i = 0;i<localArrayList.size();i++){

       arrayOfAccount[i] = ((Account)localArrayList.get(i));
      }
      paramMethodHookParam.setResult(arrayOfAccount);
    }



  }
}

