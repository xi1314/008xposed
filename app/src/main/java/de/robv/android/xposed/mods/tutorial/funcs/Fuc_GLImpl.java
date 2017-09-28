package de.robv.android.xposed.mods.tutorial.funcs;

import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.mods.tutorial.PoseHelper008;

public class Fuc_GLImpl
  extends XhookMethod
{
  private static final String className = "com.google.android.gles_jni.GLImpl";
  
  public Fuc_GLImpl()
  {
    addHookWithOnlyMethodName("com.google.android.gles_jni.GLImpl", "glGetString");
  }
  
  protected void afterHookedMethod(XC_MethodHook.MethodHookParam paramMethodHookParam) {}
  
  protected void beforeHookedMethod(XC_MethodHook.MethodHookParam paramMethodHookParam)
  {
    int i = ((Integer)paramMethodHookParam.args[0]).intValue();
    String str = "";
    if (i == 7937)
    {
      str = "GL_RENDERER";

    }else if(i == 7936){
      str = "GL_VENDOR";
    }
    else if(i== 7938){
      str = "GL_VERSION";
    }

  if((PoseHelper008.valueMap != null)&&(PoseHelper008.valueMap.containsKey(str))){
        str = PoseHelper008.valueMap.getStringfrommap(str);
    }

    if  (str.length() > 0) {
      paramMethodHookParam.setResult(str);
    }


}}

