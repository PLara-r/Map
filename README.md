# Map
Map<String, String> map = new HashMap<>();
map.put("koala", "bamboo");
map.put("lion", "meat");
map.put("giraffe", "leaf");
String food = map.get("koala");  // bamboo
for (String key: map.keySet())  
 System.out.print(key + ","); // koala,giraffe,lion,
Java использует hashCode()ключ для определения порядка. Порядок в данном случае не является порядком сортировки или порядком, в котором мы ввели значения. 
Теперь давайте посмотрим на TreeMap:
Map<String, String> map = new TreeMap<>();
map.put("koala", "bamboo");
map.put("lion", "meat");
map.put("giraffe", "leaf");
String food = map.get("koala");  // bamboo
for (String key: map.keySet()) 
  System.out.print(key + ","); // giraffe,koala,lion,

TreeMapсортирует ключи, как и следовало ожидать. Если бы мы звонили values()вместо keySet(), порядок значений соответствовал бы порядку ключей.
