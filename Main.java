public class Main{
	public static void main(String[] args){
		int [][] trust1 = {{1,2}};
		System.out.println(Judge.findJudge(2, trust1));
		int [][] trust2 = {{1,3},{2,3}};
		System.out.println(Judge.findJudge(3, trust2));
		int [][] trust3 = {{1,3},{2,3},{3,1}};
		System.out.println(Judge.findJudge(3, trust3));
		int [][] trust4 = {{1,2},{2,3}};
		System.out.println(Judge.findJudge(3, trust4));
		int [][] trust5 = {{1,3},{1,4},{2,3},{2,4},{4,3}};
		System.out.println(Judge.findJudge(4, trust5));
	}
}