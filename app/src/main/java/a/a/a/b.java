package a.a.a;

import a.a.a.a.c;
import a.a.a.a.d;

public final class b
{
  public static String[] a(char paramChar)
  {
    return a.a.a.a(paramChar);
  }
  
  public static String[] a(char paramChar, a.a.a.a.b paramb)
    throws a.a.a.a.a.a
  {
    String[] arrayOfString = a.a.a.a(paramChar);
    Object localObject2;
    Object localObject1;
    label114:
    int n;
    int i;
    int m;
    int j;
    if (arrayOfString != null)
    {
      int k = 0;
      if (k < arrayOfString.length)
      {
        localObject2 = arrayOfString[k];
        if ((c.c == paramb.b()) && ((d.b == paramb.c()) || (d.a == paramb.c()))) {
          throw new a.a.a.a.a.a("tone marks cannot be added to v or u:");
        }
        if (c.b == paramb.b()) {
          localObject1 = ((String)localObject2).replaceAll("[1-5]", "");
        }
        for (;;)
        {
          if (d.b == paramb.c())
          {
            localObject2 = ((String)localObject1).replaceAll("u:", "v");
            localObject1 = localObject2;
            if (a.a.a.a.a.a == paramb.a()) {
              localObject1 = ((String)localObject2).toUpperCase();
            }
            arrayOfString[k] = localObject1;
            k += 1;
            break;
            localObject1 = localObject2;
            if (c.c == paramb.b())
            {
              localObject2 = ((String)localObject2).replaceAll("u:", "v").toLowerCase();
              localObject1 = localObject2;
              if (((String)localObject2).matches("[a-z]*[1-5]?")) {
                if (((String)localObject2).matches("[a-z]*[1-5]"))
                {
                  n = Character.getNumericValue(((String)localObject2).charAt(((String)localObject2).length() - 1));
                  i = ((String)localObject2).indexOf('XhookMethod');
                  m = ((String)localObject2).indexOf('e');
                  j = ((String)localObject2).indexOf("ou");
                  if (-1 != i) {
                    j = 97;
                  }
                }
              }
            }
          }
        }
      }
    }
    for (;;)
    {
      label253:
      localObject1 = localObject2;
      if (36 == j) {
        break;
      }
      localObject1 = localObject2;
      if (-1 == i) {
        break;
      }
      paramChar = "āáăàaēéĕèeīíĭìiōóŏòoūúŭùuǖǘǚǜü".charAt("aeiouv".indexOf(j) * 5 + (n - 1));
      localObject1 = new StringBuffer();
      ((StringBuffer)localObject1).append(((String)localObject2).substring(0, i).replaceAll("v", "ü"));
      ((StringBuffer)localObject1).append(paramChar);
      ((StringBuffer)localObject1).append(((String)localObject2).substring(i + 1, ((String)localObject2).length() - 1).replaceAll("v", "ü"));
      localObject1 = ((StringBuffer)localObject1).toString();
      break;
      if (-1 != m)
      {
        i = m;
        j = 101;
      }
      else if (-1 != j)
      {
        m = "ou".charAt(0);
        i = j;
        j = m;
      }
      else
      {
        i = ((String)localObject2).length() - 1;
        for (;;)
        {
          if (i >= 0)
          {
            if (String.valueOf(((String)localObject2).charAt(i)).matches("[aeiouv]"))
            {
              j = ((String)localObject2).charAt(i);
              break label253;
            }
            i -= 1;
            continue;
            localObject1 = ((String)localObject2).replaceAll("v", "ü");
            break;
            localObject2 = localObject1;
            if (d.c != paramb.c()) {
              break label114;
            }
            localObject2 = ((String)localObject1).replaceAll("u:", "ü");
            break label114;
            return arrayOfString;
            return null;
          }
        }
        i = -1;
        j = 36;
      }
    }
  }
}


