package pp5.kalkulator.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pp5.kalkulator.CalculationResult;
import pp5.kalkulator.CalculationType;

/**
 * @author Adrian Michalski
 */
public class DummyCalculationResultLogger implements CalculationResultLogger {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Override
    public String save(CalculationResult pCalculationResult) {
        log.info("Saved " + pCalculationResult);
        return "ABC123";
    }

    @Override
    public CalculationResult read(String pCode) {
        CalculationResult calculationResult = new CalculationResult(CalculationType.NETTO_TO_BRUTTO, 5000.0, 5500.0);
        log.info("Reading " + calculationResult);
        return calculationResult;
    }
}
