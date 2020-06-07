package ex_4_1;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class HashMapAdapter<K> extends HashMap<K, K> implements Map<K, K>, Cloneable, Serializable
{
  
  private static final long serialVersionUID = 1L;
  public HashMapAdapter(K[][] matriz)
  {
	  for(int i=0; i<5; i=i+1)
		{
			put(matriz[0][i], matriz[1][i]);
		}
  }

}