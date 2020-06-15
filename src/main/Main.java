package main;

public class Main {

// 	        ⑦greetメソッドを定義してみよう⑨Helloと返そう
	public static String greet(String name) {
		System.out.println("Hello!!");
		String hello = name + "さん" + "Hello!";
		return hello;
	}


	public static void main (String[] args) {
		⑨の呼び出し
		System.out.println(greet("Yuki"));







// 	        ①代入して出力しよう
		String greeting = "Hello World";
		System.out.println(greeting);


// 		②1〜10までを足して表示しよう
		int sum = 0;
		for(int i = 1; i < 11; i++) {
			sum += i;
		}
		System.out.println(sum);


// 		③三年後の今日は何曜日？
		LocalDateTime now  = LocalDateTime.now();
		LocalDateTime future = now.plusDays(1095);
		DayOfWeek future1 = future.getDayOfWeek();
		System.out.println(future1);
		
// 		③三年後の今日は何曜日？（修正版）
		LocalDateTime now  = LocalDateTime.now();
		LocalDateTime future = now.plusYears(3);
		DayOfWeek future1 = future.getDayOfWeek();
		System.out.println(future1);


// 		④if文を使って引数が0なら偽1なら真を表示しよう(ランダムも入れてみました
		int number = new java.util.Random().nextInt(2);
		if(number == 1) {
			System.out.println("真");
		} else if(number == 0) {
			System.out.println("偽");
		}


// 　　	       ⑤-1Listを使ってみよう
		List<String> names = new ArrayList<>();
		names.add("Raise");
		names.add("Tech");

		for(String name: names) {
			System.out.print(name);
		}

// 		⑤ー2Mapを使ってみよう
		Map<Integer, String> sample = new HashMap<>();
		sample.put(1, "名前");
		sample.put(2, "名字");

		for(int key: sample.keySet()) {
			String value = sample.get(key);
			System.out.println(key + "は"  + value);
		}






	}
}
