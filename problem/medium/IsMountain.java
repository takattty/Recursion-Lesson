package problem.medium;

public class IsMountain {
    public static void main(String[] args) {
        System.out.println(isMountain(new int[]{1, 2, 3, 2}));
        System.out.println(isMountain(new int[]{1, 2}));
        System.out.println(isMountain(new int[]{2, 1}));
        System.out.println(isMountain(new int[]{1, 2, 2, 2, 2}));
        System.out.println(isMountain(new int[]{1, 2, 3}));
        System.out.println(isMountain(new int[]{4, 3, 2, 1}));
        System.out.println(isMountain(new int[]{1, 2, 2, 3, 2}));
        System.out.println(isMountain(new int[]{10,20,30,400,500,10}));
        System.out.println(isMountain(new int[]{100,200,100,400,500,100}));
        System.out.println(isMountain(new int[]{100,200,300,200,100,300}));
        System.out.println(isMountain(new int[]{100,50,100,200,300,400}));
        System.out.println(isMountain(new int[]{53,158,477,994,994,867,797,755,744,621,616}));
    }

    public static boolean isMountain(int[] height) {
        // 配列のサイズチェック
        if (height.length <= 2) return false;

        // isTopの山頂フラグを定義
        // 初めは上がり続け、一度下がったら下がり続けるチェック
        // 最初は前の値より今の値が大きくないといけないのをチェック
        // 1回目の前の値より今の値が最初に小さくなった時に、フラグを切り替え（下がり続けるの方にチェックを変える）
        // その後は、前の値より今の値が小さいといけないのをチェック
        // 同じ値が続くのをチェック
        // それぞれのチェックで違反があれば早期リターンで、falseを返す

        // trueなら登り続けている、falseなら下がり続けている
        // 登り続けておりかつ、前の値より今の値が小さくなったらfalseに切り替える
        boolean isToTop = true;
        int before = 0;

        for (int i = 0; i < height.length; i++) {
            if (isToTop) {
                // 登り続けている処理
                // 同じ値
                if (before == height[i]) return false;

                // 初っ端から下がっている時
                if (i == 1 && before > height[i]) return false;

                // 前の値が今の値より大きい時（i > 1の時）
                if (before > height[i]) {
                    // 山頂過ぎた処理
                    isToTop = false;
                }
                // 前の値が今の値より小さい時
                before = height[i];
            } else {
                // 下がり続けている処理
                // 同じ値
                if (before == height[i]) return false;

                // 前の値が今の値より小さい時
                if (before < height[i]) {
                    return false;
                }
                before = height[i];
            }
        }

        // isToTopがtrueのままならfalseを返し（登り続けているなので）、それ以外はtrueを返す
        return !isToTop;
    }
}
