package tabungan;

import java.math.BigDecimal;

public class tabungan {

    public static BigDecimal tabung(BigDecimal saldo, BigDecimal setor) {
        return saldo.add(setor);

    }

    public static BigDecimal nabung(BigDecimal zero, BigDecimal bigDecimal) {
        return zero;
    }

    public BigDecimal tarikdana(BigDecimal saldo,BigDecimal tariktunai){
        return saldo.subtract(tariktunai);
        }
    }

