//문제: 문자열을 입력받아 문자열 내에 아래 중 하나가 존재하는지 여부를 리턴해야 합니다.
//        'a'로 시작해서 'b'로 끝나는 길이 5의 문자열
//        'b'로 시작해서 'a'로 끝나는 길이 5의 문자열

//주의사항: 대소문자를 구분하지 않습니다.
//        공백도 한 글자로 취급합니다.
//        'a'와 'b'는 중복해서 등장할 수 있습니다.

public class DailyCoding_ABCheck {
    public static void main(String[] args) {



        String str = "asDjhglsDd des";
        String result = "";


        str = str.toLowerCase();
        System.out.println(str);

        if (str.length() < 5) {
            System.out.println("false 5보다 작다");
        }

        // 반복문을 이용하여 0부터 length-5 길이만큼 반복한다.
        for (int i = 0; i < str.length() - 5; i++) {
            if (str.charAt(i) == 'a') {
                result = str.substring(i);
                if (result.charAt(4) == 'b') {
                    System.out.println("true_a_b");
                }
            } else if (str.charAt(i) == 'b') {
                result = str.substring(i);
                if (result.charAt(4) == 'a') {
                    System.out.println("true_b_a");
                }
            } else {
                continue;
            }
        }
        System.out.println("false 마지막");
        //만약 temp[i]가 a 라면 i부터 length-1까지 substring을 이용하여 result에 저장한다.
        // result[4]가 b라면 true 리턴
        //만약 temp[i]가 b 라면 i부터 length-1 substring을 이용하여 result에 저장한다.
        // result[4]가 a라면 true 리턴
        // 그렇지 않으면 continue
        // 반복문 빠져나오면 없다고 판단하고 false 리턴
    }
}