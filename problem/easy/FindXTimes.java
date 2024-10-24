package problem.easy;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindXTimes {
    public static void main(String[] args) {
        // falseが正解
        System.out.println(findXTimes("silimqieuqlmiiiielileliimliiueimqmsiqiieilmimsuliiisuqiimiiiuuiqqqisseqqeiimssqisisiqelmemqiiiuqmiseiiiluiiimssiqsqluliiimueqeimmuiimmqsqequluuiqiqmiqeuilsullsimeqiiqmiqsiuqmimlliqiiiiiiiiiqeiiimeiliiiiieiiqmimimmimquqlsllemisseiemmiiluqsmieiiluisqlmsiiuieisiielmqsimiieuilqlqeliueiimseqeiisiqimmusiliiqsqiiiileeiuiilqsieesmqismqiieluqmiqieiqimieisillmssiqeiuieiiieismiqiulqiesimismeemieimiumusesmsiisimilllisumuluiiliqeqisllqslissusqimiiuleimisquussqillluimmiiieisieimqsiiiiqlemiuiuiiqililiileqmuiliimsilmiqsislqismiueieuiqmuiqiusieiuiqlqsiimimeluisuqqmeqiequqmqmisiiisliiquqsumsuiiiisueqqiieiluqmeuqiueqsmeieqseuillmslilmleiuqlqieeisliuiiilsueuuiiiuumuuiqeiililiimsmeiiiiilissuqssimsmmuisiieuqiimeqleiqsssimsiiiimemuilsiimiuiieueuimieiuiuqiilqelmmlismqlmleuliiqiusmiumiuessiilmiisimmeiisieliimllmseimqiuiiuuuqliqmluiisuqmemuimiiiuieuiiulmemieiiqiisilsulqeqieeeililqiiuliisiqeiuusqiilsilmieesmqisluleumilmieeiumqmismiieuqiuleumiluqumsimqiiueemilimeieeemilmiiiiqiluiieqqsqleesuueieiesiuiieqqiisiuilmqiissuilimiieiqeiilimlsississmmmlilmeieiiiuqimmqiiessmiieliuiiimeilqiuuumieiiilseiqleqemsiumiimiiiesiemieilqelmliiiiieiimieeueuiqseliqsqlqieiqleiqimiqsiiiililqmusimeusmiiliqumiqqqqsqeiuuisiqslssquimiiiimuuiiuisiueliilmeilmuiillmeieseqesseiuleiqmiuiqiiqqililmmiiuiemuiuuulmiiiiequsqieiqsesessimieeiimiiliusuquuiliiquuiielieismeusqsmlsqmimslllemeiesiqieuseliiiiqeuiiiieiuuuqmluiquqiiqumuimmesqqiiiiqislqmieiqesuselueiiimleleisseiiemsiellqisuemmimlsiiiimisiiqslsiuelluuieslueiqliluqeliuqleesilmlilqimmeussumuiueisueilqeimisimilsiieiiileliiiiieuisilmsillssseumelisqqqiqmululmlmluumlieiuiiliismemelqqimluqiluiumsuulmsslilimmiliuuisiluimlqeumeisiuillsuleiilissuulqmueieiiqiiusqqleeiqisiuisieqiilqqsliiiimisisimiiqieiieusisliqsiiiiquseuelessmismuelqeqmilqqiqsmusiuiqiilisiqqlieiiiqisqliiiuiilemiiiquuiqmiqmmqeiiiliimmiiissuiimieeisieimimiliiuqiimsillesmssemiuiuiiqlmmiimqiisuuliiiiiqquuimeuiuqielmeleelsuesilmeilslsquumsileseeliiqimisuqilieiiilqiqsilqlqisuiiiqmimimuqeqssiuiiisilsisssuiismmeqeilsiieqiiqqqlquiuiseqlieuuquiiiqleuqmqiqiqumuimseliilmqsiqiemsiuiimiissusimisisiimimqsiiuiuslulesuqeiilmssemlusiiqiqmiiiimuesilslisiuieeimuuliiesliqilimuiiqeiimquisiismeimimmilimmemuslmlmiiiisqmisqiliiiuieqiuilimimeuilmeeliuimisqiillliiiusumqilelmlisiliqliiulquimieiliiquuliumsuiilimimmuqsiesluqiussesqlisisiusmiqiiimeissilqilieimsueqiqlsiuieliiissiesiiqilqqiimimiiequuemmqsueeusumuiiseeessmuusmleiiiqqqsqmmiileulemmeeuimelsiisliiiqilimiliuiiuqlliuqmsesqliqiiiiiisquiiiimeiiquiuulssiiliismisliisisuueqeeeuumuiemesiiqqimlimqiiiilisiiluuiesmqulmmiqisiiqluiqqiemsiiieuuusquiqiqmsulmliiliiiqumeisuqeqsssmsiielqimqiluumiieisiqmiuilmliqumieqqsiieiiiuiqusleluiiqqluulslllieesqileqqiieisiissiiieuelummseqmqsseqeslisqilimumuimsleillulilsmleieqielmeqqmieuiuieqleqeeilemeeslillisismqieuiuiiismqsiimmmlqlqeqiqiiililluiqiieeisiiqqueieeesqmeiuqilmieslqimeiqmiemiiiuimlilumuiiimqiiqiiisilumsquuiulqliiiiqiluueseeesllimslqiqluusuqelsiliiiiqemillmiiuqiluiuqilqueuiliiiiisssuusememimieiiummmsilqiimiimislesiqisqmsmimeiulimsiuiillemeisuueiusquiiiqiuimqlleqls"));
    }

    public static boolean findXTimes(String teams){
//        Map<String, Integer> map = new HashMap<>();
//        var array = teams.toCharArray();
//        for (char e : array) {
//            if (map.get(String.valueOf(e)) == null) {
//                map.put(String.valueOf(e), 1);
//            } else {
//                map.replace(String.valueOf(e), map.get(String.valueOf(e) + 1));
//            }
//        }

        // リファクタ後
        Map<Character, Integer> map = teams.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.summingInt(ch -> 1)
                ));

        return map.values().stream().distinct().count() <= 1;
    }
}
