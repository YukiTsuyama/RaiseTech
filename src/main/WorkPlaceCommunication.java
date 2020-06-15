//⑧インターフェースの実装

package main;

public class WorkPlaceCommunication implements Communication{

//	⑩職場か判断するフィールドを作ってみよう
	boolean workstation;


	String greeting = "Good Morning";
	String name = "Yuki";


//	11職場じゃなければ挨拶しない
	public void judgement() {
		if(workstation = true) {
			System.out.println(name + "さん" + greeting);
		} else {
			System.out.println("..............");
		}
	}

// 　　　11職場じゃなければ挨拶しない（修正版）
	public void judgement(int place) {
		if(place == 0) {
			System.out.println(name + "さん" + greeting);
		} else if(place == 1){
			System.out.println("..............");
		}
	}


}
