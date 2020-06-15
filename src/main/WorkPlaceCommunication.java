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



}
