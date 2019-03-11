package uk.ac.soton.comp2211.calculator;

import uk.ac.soton.comp2211.model.LogicalRunway;
import uk.ac.soton.comp2211.model.PhysicalRunway;
import uk.ac.soton.comp2211.model.RunwaySide;
import uk.ac.soton.comp2211.model.ThresholdLocation;

public class Runways {

    public static PhysicalRunway noStopWayNoClearway(){
        LogicalRunway logicalRunway1 = new LogicalRunway(3000, 3000, 3000, 3000, 9, ThresholdLocation.LEFT);
        LogicalRunway logicalRunway2 = new LogicalRunway(3000, 3000, 3000, 3000, 27, ThresholdLocation.RIGHT);

        PhysicalRunway physicalRunway = new PhysicalRunway(logicalRunway2, logicalRunway1, RunwaySide.LOWER_THRESHOLD);

        return physicalRunway;
    }
    public static PhysicalRunway stopWayNoClearwayLower(){
        LogicalRunway logicalRunway1 = new LogicalRunway(3000, 3000, 3000, 3500, 9, ThresholdLocation.LEFT);
        LogicalRunway logicalRunway2 = new LogicalRunway(3000, 3000, 3000, 3000, 27, ThresholdLocation.RIGHT);

        PhysicalRunway physicalRunway = new PhysicalRunway(logicalRunway2, logicalRunway1, RunwaySide.LOWER_THRESHOLD);

        return physicalRunway;
    }
    public static PhysicalRunway stopWayNoClearwayHigher(){
        LogicalRunway logicalRunway1 = new LogicalRunway(3000, 3000, 3000, 3000, 9, ThresholdLocation.LEFT);
        LogicalRunway logicalRunway2 = new LogicalRunway(3000, 3000, 3000, 3500, 27, ThresholdLocation.RIGHT);

        PhysicalRunway physicalRunway = new PhysicalRunway(logicalRunway2, logicalRunway1, RunwaySide.LOWER_THRESHOLD);

        return physicalRunway;
    }
    public static PhysicalRunway noStopWayClearwayLower(){
        LogicalRunway logicalRunway1 = new LogicalRunway(3000, 3700, 3000, 3000, 9, ThresholdLocation.LEFT);
        LogicalRunway logicalRunway2 = new LogicalRunway(3000, 3000, 3000, 3000, 27, ThresholdLocation.RIGHT);

        PhysicalRunway physicalRunway = new PhysicalRunway(logicalRunway2, logicalRunway1, RunwaySide.LOWER_THRESHOLD);

        return physicalRunway;
    }
    public static PhysicalRunway noStopWayClearwayHigher(){
        LogicalRunway logicalRunway1 = new LogicalRunway(3000, 3000, 3000, 3000, 9, ThresholdLocation.LEFT);
        LogicalRunway logicalRunway2 = new LogicalRunway(3000, 3700, 3000, 3000, 27, ThresholdLocation.RIGHT);

        PhysicalRunway physicalRunway = new PhysicalRunway(logicalRunway2, logicalRunway1, RunwaySide.LOWER_THRESHOLD);

        return physicalRunway;
    }
    public static PhysicalRunway stopWayClearwayLower(){
        LogicalRunway logicalRunway1 = new LogicalRunway(3000, 3700, 3000, 3500, 9, ThresholdLocation.LEFT);
        LogicalRunway logicalRunway2 = new LogicalRunway(3000, 3000, 3000, 3000, 27, ThresholdLocation.RIGHT);

        PhysicalRunway physicalRunway = new PhysicalRunway(logicalRunway2, logicalRunway1, RunwaySide.LOWER_THRESHOLD);

        return physicalRunway;
    }
    public static PhysicalRunway stopWayClearwayHigher(){
        LogicalRunway logicalRunway1 = new LogicalRunway(3000, 3000, 3000, 3000, 9, ThresholdLocation.LEFT);
        LogicalRunway logicalRunway2 = new LogicalRunway(3000, 3700, 3000, 3500, 27, ThresholdLocation.RIGHT);

        PhysicalRunway physicalRunway = new PhysicalRunway(logicalRunway2, logicalRunway1, RunwaySide.LOWER_THRESHOLD);

        return physicalRunway;
    }
    public static PhysicalRunway displacedThresholdNoStopwayNoClearwayLower(){
        LogicalRunway logicalRunway1 = new LogicalRunway(2500, 3000, 3000, 3000, 9, ThresholdLocation.LEFT);
        LogicalRunway logicalRunway2 = new LogicalRunway(3000, 3000, 3000, 3000, 27, ThresholdLocation.RIGHT);

        PhysicalRunway physicalRunway = new PhysicalRunway(logicalRunway2, logicalRunway1, RunwaySide.LOWER_THRESHOLD);

        return physicalRunway;
    }
    public static PhysicalRunway displacedThresholdNoStopwayNoClearwayHigher(){
        LogicalRunway logicalRunway1 = new LogicalRunway(3000, 3000, 3000, 3000, 9, ThresholdLocation.LEFT);
        LogicalRunway logicalRunway2 = new LogicalRunway(2500, 3000, 3000, 3000, 27, ThresholdLocation.RIGHT);

        PhysicalRunway physicalRunway = new PhysicalRunway(logicalRunway2, logicalRunway1, RunwaySide.LOWER_THRESHOLD);

        return physicalRunway;
    }
    public static PhysicalRunway displacedThresholdStopwayNoClearwayLower(){
        LogicalRunway logicalRunway1 = new LogicalRunway(2500, 3000, 3000, 3500, 9, ThresholdLocation.LEFT);
        LogicalRunway logicalRunway2 = new LogicalRunway(3000, 3000, 3000, 3000, 27, ThresholdLocation.RIGHT);

        PhysicalRunway physicalRunway = new PhysicalRunway(logicalRunway2, logicalRunway1, RunwaySide.LOWER_THRESHOLD);

        return physicalRunway;
    }
    public static PhysicalRunway displacedThresholdStopwayNoClearwayHigher(){
        LogicalRunway logicalRunway1 = new LogicalRunway(3000, 3000, 3000, 3000, 9, ThresholdLocation.LEFT);
        LogicalRunway logicalRunway2 = new LogicalRunway(2500, 3000, 3000, 3500, 27, ThresholdLocation.RIGHT);

        PhysicalRunway physicalRunway = new PhysicalRunway(logicalRunway2, logicalRunway1, RunwaySide.LOWER_THRESHOLD);

        return physicalRunway;
    }
    public static PhysicalRunway displacedThresholdNoStopwayClearwayLower(){
        LogicalRunway logicalRunway1 = new LogicalRunway(2500, 3700, 3000, 3000, 9, ThresholdLocation.LEFT);
        LogicalRunway logicalRunway2 = new LogicalRunway(3000, 3000, 3000, 3000, 27, ThresholdLocation.RIGHT);

        PhysicalRunway physicalRunway = new PhysicalRunway(logicalRunway2, logicalRunway1, RunwaySide.LOWER_THRESHOLD);

        return physicalRunway;
    }
    public static PhysicalRunway displacedThresholdNoStopwayClearwayHigher(){
        LogicalRunway logicalRunway1 = new LogicalRunway(3000, 3000, 3000, 3000, 9, ThresholdLocation.LEFT);
        LogicalRunway logicalRunway2 = new LogicalRunway(2500, 3700, 3000, 3000, 27, ThresholdLocation.RIGHT);

        PhysicalRunway physicalRunway = new PhysicalRunway(logicalRunway2, logicalRunway1, RunwaySide.LOWER_THRESHOLD);

        return physicalRunway;
    }
    public static PhysicalRunway displacedThresholdStopwayClearwayLower(){
        LogicalRunway logicalRunway1 = new LogicalRunway(2500, 3700, 3000, 3500, 9, ThresholdLocation.LEFT);
        LogicalRunway logicalRunway2 = new LogicalRunway(3000, 3000, 3000, 3000, 27, ThresholdLocation.RIGHT);

        PhysicalRunway physicalRunway = new PhysicalRunway(logicalRunway2, logicalRunway1, RunwaySide.LOWER_THRESHOLD);

        return physicalRunway;
    }
    public static PhysicalRunway displacedThresholdStopwayClearwayHigher(){
        LogicalRunway logicalRunway1 = new LogicalRunway(3000, 3000, 3000, 3000, 9, ThresholdLocation.LEFT);
        LogicalRunway logicalRunway2 = new LogicalRunway(2500, 3700, 3000, 3500, 27, ThresholdLocation.RIGHT);

        PhysicalRunway physicalRunway = new PhysicalRunway(logicalRunway2, logicalRunway1, RunwaySide.LOWER_THRESHOLD);

        return physicalRunway;
    }
}
