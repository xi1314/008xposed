package com.a.a.e;

import java.security.PrivilegedAction;

final class b
  implements PrivilegedAction
{
  public final Object run()
  {
    return a.class.getProtectionDomain();
  }
}


