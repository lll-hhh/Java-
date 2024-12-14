package HackerDemo;
import java.util.Arrays;
public class String_ {
    public static void main(String[] args){
        int[] scores=new int[]{72,456};
        Scores sc=new Scores(scores);
        sc.Out_scores();
        scores[1]=324;
        sc.Out_scores();

        StringBuilder sb=new StringBuilder(1024);
        for(int i=0;i<1000;i++){
            sb.append(',');
            sb.append(i);
        }
        sb.append("asdf").append("sdf").insert(0,"hello");
        String s= sb.toString();
    }
}

class Scores{
    private int[] scores;
    public Scores(int[] scores){
        //this.scores=scores;引用传入，外部改变内部也改变
        this.scores=Arrays.copyOf(scores,scores.length);
        //赋值传入，外部改变不影响内部改变
    }
    public void Out_scores(){
        System.out.println(Arrays.toString(scores));
    }
}
