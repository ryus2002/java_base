package codegym;

public class a5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] c = {'a', 'b', 'c'};
		String str = new String(c);
		
		System.out.println(c[1]);
		System.out.println(str);

		// charAt
		String s1 = "abc";
		System.out.println(s1.charAt(1));
		System.out.println(s1.substring(1,1));

		String[] sArray=s1.split("b");
		System.out.println(sArray[0]);
		
		System.out.println(s1.contains("a"));

		String str1 = "abc";
		String str2 = "abc";
		// equals 判斷字串是否相等
		
		System.out.println(str1.equals(str2));
		
		String json = "[{\"animal_id\":\"10305240201056\",\"animal_kind\":\"貓\",\"animal_sex\":\"F\",\"shelter_name\":\"臺北市動物之家\"},"
				     + "{\"animal_id\":\"10508011005002\",\"animal_kind\":\"狗\",\"animal_sex\":\"F\",\"shelter_name\":\"臺中市中途動物醫院\"}]";
		String[] cat = new String[4];
		String[] dog = new String[4];
		
		json = json.replace("[", "").replace("]", "");
		String catData = json.substring(json.indexOf("{"),json.indexOf("}")+1);
		String tmp = catData.replace("{", "").replace("}","");
		cat = tmp.split(",");
		
		String dogData = json.replace(catData+",", "");
		dogData = dogData.replace("{", "").replace("}","");
		dog = dogData.split(",");
		
		System.out.println("json:"+json);
		System.out.println("catData:"+catData);
		System.out.println("dogData:"+dogData);
		System.out.println(cat[3]);
		System.out.println(dog[3]);		

		int[] array = {1,2,3};
//		for(int i = 0; i < array.length; i ++){
//			System.out.println(array[i]);
//		}
		//foreach
		for(int m : array){
			System.out.println(m);
		}
		
	}

}
