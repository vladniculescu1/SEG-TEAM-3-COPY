package uk.ac.soton.comp2211.draw;

import uk.ac.soton.comp2211.calculator.Calculator;
import uk.ac.soton.comp2211.model.RunwayMode;
import uk.ac.soton.comp2211.model.RunwaySelection;
import uk.ac.soton.comp2211.model.RunwaySide;

import java.awt.*;

/**
 * Draws the LDA value onto the runway.
 */
public class LdaDrawer extends DistanceDrawer {

    @Override
    public void draw(Graphics2D g2d, RunwaySelection runwaySelection) {

        if (runwaySelection.getSelectedRunway().getRunwayMode() == RunwayMode.TAKEOFF) {
            return;
        }

        RunwaySide side = runwaySelection.getSelectedRunway().getRunwayDirection();
        Calculator calc = runwaySelection.getSelectedRunway().getCalculator();
        int visualisationLength = calc.getTotalVisualisationLength();
        double runwayWidth = visualisationLength * (DrawConstants.STRIP_WIDTH_PERCENTAGE / 100);

        int startX = calc.getLandingObstacleOffest(side);
        int distance = calc.getLda(side);
        double height = - ((runwayWidth / DrawConstants.VALUE_DISPLAY_HEIGHT_FACTOR) * 3);

        switch (side) {
            case LOWER_THRESHOLD:
                drawDistance(g2d, startX, distance, (int) height, "LDA");
                break;
            case HIGHER_THRESHOLD:
                drawDistance(g2d, startX, -distance, (int) -height, "LDA");
                break;
            default:
                throw new UnsupportedOperationException("Cannot calculate value for side " + side);
        }
    }
}
