package problem.easy.tax;

import java.time.LocalDate;

public class Solution {
    public static int calculateCorporationTax(String state, int year, int profit){
        // 州ごとの税率を計算
        double stateTax = TaxOfState.of(state).tax;
        // 閏年判定
        double union = isLeapYear(year) ? 0 : 0.21;
        // 小数点切り上げて、値を返す
        return (int)Math.ceil(profit * (union + stateTax));
    }
    public static boolean isLeapYear(int year) {
        return LocalDate.of(year, 1, 1).isLeapYear();
    }

    public static void main(String[] args) {
        System.out.println(calculateCorporationTax("CA",2021,100000));
        System.out.println(calculateCorporationTax("CA",2004,100000));
        System.out.println(calculateCorporationTax("TX",1990,207645));
        System.out.println(calculateCorporationTax("NC",2000,201735));
        System.out.println(calculateCorporationTax("AZ",2001,980379));
        System.out.println(calculateCorporationTax("AZ",2012,439935));
        System.out.println(calculateCorporationTax("MN",1990,546638));
        System.out.println(calculateCorporationTax("NE",1978,623131));
    }
}

enum TaxOfState {
    TEXAS("TX", -1),
    NORTHCARORINA("NC", -1.025),
    ARIZONA("AZ", -1.049),
    CARIFOLNIA("CA", -1.0884),
    OTHERS("others", -1.05);

    public final String code;
    public final double tax;

    TaxOfState(String code, double tax) {
        this.code = code;
        this.tax = tax;
    }

    public static TaxOfState of(String s) {
        for (var e : TaxOfState.values()) {
            if (e.code.equals(s)) {
                return e;
            }
        }
        return TaxOfState.OTHERS;
    }
}