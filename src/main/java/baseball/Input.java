package baseball;

import camp.nextstep.edu.missionutils.Randoms;
import camp.nextstep.edu.missionutils.Console;

class Input {
    private final static int LENGTH = 3;

    static String computer () {
        String number = new String();
        while (number.length() < LENGTH) {
            String str = String.valueOf(Randoms.pickNumberInRange(1,9));
            if (!number.contains(str)) {
                number = number.concat(str);
            }
        }
        return number;
    }

    static String player() {
        System.out.print("숫자를 입력해주세요 : " );
        String number = Console.readLine();
        return number;
    }

    static void checkError(String number) {
        char[] numberArray = number.toCharArray();
        if (number.length() != LENGTH) {
            throw new IllegalArgumentException("3자리가 아닙니다.");
        }

        for (char c : numberArray) {
            if ((int)c < 49 || (int)c > 57) {
                throw new IllegalArgumentException("0을 입력하셨거나 숫자가 아닌 문자를 입력하셨습니다.");
            }
        }

        for (int i = 0; i < LENGTH; i++) {
            if (numberArray[i] == numberArray[(i+1)%3] || numberArray[i] == numberArray[(i+2)%3]) {
                throw new IllegalArgumentException("숫자를 중복하여 입력하셨습니다.");
            }
        }
    }
}


