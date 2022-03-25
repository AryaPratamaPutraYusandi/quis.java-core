import deposito.deposit;
import tabungan.tabungan;
import java.math.BigDecimal;
import java.util.Scanner;


public class Bunga {

    public static void main(String[] args) {

        BigDecimal nabungpertama = tabungan.nabung(BigDecimal.ZERO, new BigDecimal(10000));
        System.out.println(String.format("tabungan pertama %2.0f", nabungpertama));

        tabungan tabungan = new tabungan();
        System.out.println(String.format("Tarikan tabungan %2.0f",
                tabungan.tarikdana(new BigDecimal(10000), new BigDecimal(5000))));
        deposit deposit = new deposit();
        BigDecimal setorandepositawal = deposit.setoranawal = deposit.setoranawal(new BigDecimal(1000_000));
        System.out.println(String.format("Setoran deposit awal :  %2.0f ", deposit.setoranawal));



    }
}