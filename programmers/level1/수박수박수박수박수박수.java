package programmers;

public class 수박수박수박수박수박수 {

    public static void main(String[] args) {
        System.out.println(solution(3));
        //System.out.println(solution(5));
    }

    private static String solution(int n){
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
             if(i % 2 == 0) {
                 sb.append("수");
             } else {
                 sb.append("박");
             }
        }
        answer = sb.toString();
        return answer;
    }
}
