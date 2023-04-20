package functions;

public class DecompositionOfFunctions {
    // 良くない例として、全ての処理を　1　つの関数に入れます
    // デバッグのしづらい、可読性の低い、複雑なコード
    public static String randomCharEvenOrOdd(String s){
        // s.length() 未満のランダムな整数
        int randomIndex = (int) Math.floor(Math.random() * s.length());

        // 文字
        char character = s.charAt(randomIndex);

        boolean isEven = false;

        // codePointAt() メソッドで Unicode コードポイントを取得することができます。
        // ランダムなインデックスの文字の文字コード が偶数なら True と書き換えます
        if(character % 2 == 0){
            isEven = true;
        }

        String message = "The char [" + character + "] at index " + randomIndex;

        if (isEven) {
            message = message + " is Even";
        } else {
            message = message + " is Odd";
        }

        return message;
    }

    public static void main(String[] args){
        // 関数の呼び出し
        System.out.println(randomCharEvenOrOdd("Don't tell me lies."));
    }
}
