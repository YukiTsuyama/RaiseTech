//3枚目のスライド課題クラスです。。自作例外クラスはGreetToSubordinateクラスにあります。
package main;

public class Communication2 {

	boolean superviosr;
	String name;

	public String greetOrNothing(boolean supervisor, String name) throws GreetToSubordinate {

		try {
			if(supervisor = false) {
				throw new GreetToSubordinate
				(name + "これやっとけ！！！！！！");
			} else if(supervisor = true) {
				System.out.println(name + "さん、おはようございます！！");
			}

		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				System.out.println("今日も仕事か〜...");
			}catch(Exception ee) {

			}
		}
		return name;

	}

}
