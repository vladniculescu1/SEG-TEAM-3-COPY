package uk.ac.soton.comp2211.calculator;

import org.junit.jupiter.api.Test;
import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwaySide;

import static org.junit.jupiter.api.Assertions.*;

class ConstantPositionCalculatorTest {

    /**
     * GIVEN a runway with no stopway and no clearway
     * WHEN no further action is taken
     * THEN the position of the runway on the lower side is equal to the length of the runway margin
     */
    @Test
    void getRunwayPosition_noStopWayNoClearwayLower() {
        PhysicalRunway runway = Runways.noStopWayNoClearway();
        var positionCalculator = runway.getConstantPositionCalculator();
        var lengthCalculator = runway.getConstantLengthCalculator();
        var expectedPosition = lengthCalculator.getRunwayMarginLength(RunwaySide.LOWER_THRESHOLD);
        var actualPosition = positionCalculator.getRunwayPosition(RunwaySide.LOWER_THRESHOLD);

        assertEquals(expectedPosition, actualPosition);
    }

    /**
     * GIVEN a runway with no stopway and no clearway
     * WHEN no further action is taken
     * THEN the position of the runway on the higher side is equal to the length of the runway margin + the length of
     * the runway
     */
    @Test
    void getRunwayPosition_noStopWayNoClearwayHigher() {
        PhysicalRunway runway = Runways.noStopWayNoClearway();
        var positionCalculator = runway.getConstantPositionCalculator();
        var lengthCalculator = runway.getConstantLengthCalculator();
        var expectedPosition = lengthCalculator.getRunwayMarginLength(RunwaySide.LOWER_THRESHOLD)
                + lengthCalculator.getRunwayLength();
        var actualPosition = positionCalculator.getRunwayPosition(RunwaySide.HIGHER_THRESHOLD);

        assertEquals(expectedPosition, actualPosition);
    }

    /**
     * GIVEN a runway with stopway on the lower side and no clearway
     * WHEN no further action is taken
     * THEN the position of the runway on the lower side is equal to the length of the runway margin
     */
    @Test
    void getRunwayPosition_stopWayNoClearwayLower() {
        PhysicalRunway runway = Runways.stopWayNoClearwayLower();
        var positionCalculator = runway.getConstantPositionCalculator();
        var lengthCalculator = runway.getConstantLengthCalculator();
        var expectedPosition = lengthCalculator.getRunwayMarginLength(RunwaySide.LOWER_THRESHOLD);
        var actualPosition = positionCalculator.getRunwayPosition(RunwaySide.LOWER_THRESHOLD);

        assertEquals(expectedPosition, actualPosition);
    }

    /**
     * GIVEN a runway with stopway on the higher side and no clearway
     * WHEN no further action is taken
     * THEN the position of the runway on the lower side is equal to the length of the runway margin + the length of
     * the runway
     */
    @Test
    void getRunwayPosition_stopWayNoClearwayHigher() {
        PhysicalRunway runway = Runways.stopWayNoClearwayHigher();
        var positionCalculator = runway.getConstantPositionCalculator();
        var lengthCalculator = runway.getConstantLengthCalculator();
        var expectedPosition = lengthCalculator.getRunwayMarginLength(RunwaySide.LOWER_THRESHOLD)
                + lengthCalculator.getRunwayLength();
        var actualPosition = positionCalculator.getRunwayPosition(RunwaySide.HIGHER_THRESHOLD);

        assertEquals(expectedPosition, actualPosition);
    }

    /**
     * GIVEN a runway with no stopway and no clearway
     * WHEN no further action is taken
     * THEN the position of the strip is equal to the position of the runway - strip margin
     */
    @Test
    void getStripPosition_noStopWayNoClearway() {
        PhysicalRunway runway = Runways.stopWayNoClearwayHigher();
        var positionCalculator = runway.getConstantPositionCalculator();
        var lengthCalculator = runway.getConstantLengthCalculator();
        var expectedPosition = positionCalculator.getRunwayPosition(RunwaySide.LOWER_THRESHOLD)
                - lengthCalculator.getStripMargin();
        var actualPosition = positionCalculator.getStripPosition();

        assertEquals(expectedPosition, actualPosition);
    }

    /**
     * GIVEN a runway with stopway and clearway on the lower side
     * WHEN no further action is taken
     * THEN the position of the strip is equal to the position of the runway - length of the stopway - strip margin
     */
    @Test
    void getStripPosition_stopWayClearwayLower() {
        PhysicalRunway runway = Runways.stopWayClearwayLower();
        var positionCalculator = runway.getConstantPositionCalculator();
        var lengthCalculator = runway.getConstantLengthCalculator();
        var expectedPosition = positionCalculator.getRunwayPosition(RunwaySide.LOWER_THRESHOLD)
                - lengthCalculator.getStopwayLength(RunwaySide.LOWER_THRESHOLD) - lengthCalculator.getStripMargin();;
        var actualPosition = positionCalculator.getStripPosition();

        assertEquals(expectedPosition, actualPosition);
    }

    /**
     * GIVEN a runway with no stopway and no clearway
     * WHEN no further action is taken
     * THEN the position of the stopway on the lower side is equal to the runway position on the higher side
     */
    @Test
    void getStopwayPosition_noStopWayNoClearwayLower() {
        PhysicalRunway runway = Runways.noStopWayNoClearway();
        var positionCalculator = runway.getConstantPositionCalculator();
        var expectedPosition = positionCalculator.getRunwayPosition(RunwaySide.HIGHER_THRESHOLD);
        var actualPosition = positionCalculator.getStopwayPosition(RunwaySide.LOWER_THRESHOLD);

        assertEquals(expectedPosition, actualPosition);
    }

    /**
     * GIVEN a runway with no stopway and no clearway
     * WHEN no further action is taken
     * THEN the position of the stopway on the higher side is equal to the runway position on the lower side
     */
    @Test
    void getStopwayPosition_noStopWayNoClearwayHigher() {
        PhysicalRunway runway = Runways.noStopWayNoClearway();
        var positionCalculator = runway.getConstantPositionCalculator();
        var expectedPosition = positionCalculator.getRunwayPosition(RunwaySide.LOWER_THRESHOLD);
        var actualPosition = positionCalculator.getStopwayPosition(RunwaySide.HIGHER_THRESHOLD);

        assertEquals(expectedPosition, actualPosition);
    }

    /**
     * GIVEN a runway with stopway on the lower side and no clearway
     * WHEN no further action is taken
     * THEN the position of the stopway on the lower side is equal to the runway position on the higher side
     */
    @Test
    void getStopwayPosition_stopWayNoClearwayLower() {
        PhysicalRunway runway = Runways.stopWayNoClearwayLower();
        var positionCalculator = runway.getConstantPositionCalculator();
        var expectedPosition = positionCalculator.getRunwayPosition(RunwaySide.HIGHER_THRESHOLD);
        var actualPosition = positionCalculator.getStopwayPosition(RunwaySide.LOWER_THRESHOLD);

        assertEquals(expectedPosition, actualPosition);
    }

    /**
     * GIVEN a runway with stopway on the higher side and no clearway
     * WHEN no further action is taken
     * THEN the position of the stopway on the higher side is equal to the runway position on the lower side - the
     * length of the stopway on the higher side
     */
    @Test
    void getStopwayPosition_stopWayNoClearwayHigher() {
        PhysicalRunway runway = Runways.stopWayNoClearwayHigher();
        var positionCalculator = runway.getConstantPositionCalculator();
        var lengthCalculator = runway.getConstantLengthCalculator();
        var expectedPosition = positionCalculator.getRunwayPosition(RunwaySide.LOWER_THRESHOLD)
                - lengthCalculator.getStopwayLength(RunwaySide.HIGHER_THRESHOLD);
        var actualPosition = positionCalculator.getStopwayPosition(RunwaySide.HIGHER_THRESHOLD);

        assertEquals(expectedPosition, actualPosition);
    }

    /**
     * GIVEN a runway with no stopway and no clearway
     * WHEN no further action is taken
     * THEN the position of the clearway on the lower side is equal to the runway position on the higher side
     */
    @Test
    void getClearwayPosition_noStopWayNoClearwayLower() {
        PhysicalRunway runway = Runways.noStopWayNoClearway();
        var positionCalculator = runway.getConstantPositionCalculator();
        var expectedPosition = positionCalculator.getRunwayPosition(RunwaySide.HIGHER_THRESHOLD);
        var actualPosition = positionCalculator.getClearwayPosition(RunwaySide.LOWER_THRESHOLD);

        assertEquals(expectedPosition, actualPosition);
    }

    /**
     * GIVEN a runway with no stopway and no clearway
     * WHEN no further action is taken
     * THEN the position of the clearway on the higher side is equal to the runway position on the lower side
     */
    @Test
    void getClearwayPosition_noStopWayNoClearwayHigher() {
        PhysicalRunway runway = Runways.noStopWayNoClearway();
        var positionCalculator = runway.getConstantPositionCalculator();
        var expectedPosition = positionCalculator.getRunwayPosition(RunwaySide.LOWER_THRESHOLD);
        var actualPosition = positionCalculator.getClearwayPosition(RunwaySide.HIGHER_THRESHOLD);

        assertEquals(expectedPosition, actualPosition);
    }

    /**
     * GIVEN a runway with clearway on the lower side and no stopway
     * WHEN no further action is taken
     * THEN the position of the clearway on the lower side is equal to the runway position on the higher side
     */
    @Test
    void getClearwayPosition_noStopWayClearwayLower() {
        PhysicalRunway runway = Runways.noStopWayClearwayLower();
        var positionCalculator = runway.getConstantPositionCalculator();
        var expectedPosition = positionCalculator.getRunwayPosition(RunwaySide.HIGHER_THRESHOLD);
        var actualPosition = positionCalculator.getClearwayPosition(RunwaySide.LOWER_THRESHOLD);

        assertEquals(expectedPosition, actualPosition);
    }

    /**
     * GIVEN a runway with clearway on the higher side and no stopway
     * WHEN no further action is taken
     * THEN the position of the stopway on the higher side is equal to the runway position on the lower side - the
     * length of the clearway on the higher side
     */
    @Test
    void getClearwayPosition_noStopWayClearwayHigher() {
        PhysicalRunway runway = Runways.noStopWayClearwayHigher();
        var positionCalculator = runway.getConstantPositionCalculator();
        var lengthCalculator = runway.getConstantLengthCalculator();
        var expectedPosition = positionCalculator.getRunwayPosition(RunwaySide.LOWER_THRESHOLD)
                - lengthCalculator.getClearwayLength(RunwaySide.HIGHER_THRESHOLD);
        var actualPosition = positionCalculator.getClearwayPosition(RunwaySide.HIGHER_THRESHOLD);

        assertEquals(expectedPosition, actualPosition);
    }

    /**
     * GIVEN a runway with no stopway and no clearway
     * WHEN no further action is taken
     * THEN the position of the threshold on the lower side is equal to the runway position on the lower side
     */
    @Test
    void getThresholdPosition_noStopWayNoClearwayLower() {
        PhysicalRunway runway = Runways.noStopWayNoClearway();
        var positionCalculator = runway.getConstantPositionCalculator();
        var expectedPosition = positionCalculator.getRunwayPosition(RunwaySide.LOWER_THRESHOLD);
        var actualPosition = positionCalculator.getThresholdPosition(RunwaySide.LOWER_THRESHOLD);

        assertEquals(expectedPosition, actualPosition);
    }

    /**
     * GIVEN a runway with no stopway and no clearway
     * WHEN no further action is taken
     * THEN the position of the threshold on the higher side is equal to the runway position on the higher side
     */
    @Test
    void getThresholdPosition_noStopWayNoClearwayHigher() {
        PhysicalRunway runway = Runways.noStopWayNoClearway();
        var positionCalculator = runway.getConstantPositionCalculator();
        var expectedPosition = positionCalculator.getRunwayPosition(RunwaySide.HIGHER_THRESHOLD);
        var actualPosition = positionCalculator.getThresholdPosition(RunwaySide.HIGHER_THRESHOLD);

        assertEquals(expectedPosition, actualPosition);
    }

    /**
     * GIVEN a runway with no stopway, no clearway and a displaced threshold on the lower side
     * WHEN no further action is taken
     * THEN the position of the threshold on the lower side is equal to the runway position on the lower side + the
     * length of the displaced threshold on the lower side
     */
    @Test
    void getThresholdPosition_displacedThresholdNoStopwayNoClearwayLower() {
        PhysicalRunway runway = Runways.displacedThresholdNoStopwayNoClearwayLower();
        var positionCalculator = runway.getConstantPositionCalculator();
        var lengthCalculator = runway.getConstantLengthCalculator();
        var expectedPosition = positionCalculator.getRunwayPosition(RunwaySide.LOWER_THRESHOLD)
                + lengthCalculator.getDisplacedThresholdLength(RunwaySide.LOWER_THRESHOLD);;
        var actualPosition = positionCalculator.getThresholdPosition(RunwaySide.LOWER_THRESHOLD);

        assertEquals(expectedPosition, actualPosition);
    }

    /**
     * GIVEN a runway with no stopway, no clearway and a displaced threshold on the higher side
     * WHEN no further action is taken
     * THEN the position of the threshold on the lower side is equal to the runway position on the higher side - the
     * length of the displaced threshold on the higher side
     */
    @Test
    void getThresholdPosition_displacedThresholdNoStopWayNoClearwayHigher() {
        PhysicalRunway runway = Runways.displacedThresholdNoStopwayNoClearwayHigher();
        var positionCalculator = runway.getConstantPositionCalculator();
        var lengthCalculator = runway.getConstantLengthCalculator();
        var expectedPosition = positionCalculator.getRunwayPosition(RunwaySide.HIGHER_THRESHOLD)
                - lengthCalculator.getDisplacedThresholdLength(RunwaySide.HIGHER_THRESHOLD);
        var actualPosition = positionCalculator.getThresholdPosition(RunwaySide.HIGHER_THRESHOLD);

        assertEquals(expectedPosition, actualPosition);
    }
}