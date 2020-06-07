package ex_4_1;

import java.util.Map;

public class Main
{
  public static void main(String[] args)
  {
	 String[][] matrizEstados = {{"SP", "RJ", "MG", "BA", "SC"},{"Sao Paulo", "Rio de Janeiro", "Minas Gerais", "Bahia", "Santa Catarina"}};
     Map<String, String> hashMap = new HashMapAdapter<String>(matrizEstados);
     Map<String, String> treeMap = new TreeMapAdapter<String>(matrizEstados);
     System.out.println("Hash Map");
     System.out.println(hashMap+"\n");
     System.out.println("Tree Map");
     System.out.println(treeMap+"\n");
  }
}