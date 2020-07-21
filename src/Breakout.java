/*
 * File: Breakout.java
 * ---------------------
 * This class is a starter code for LBYCPEI Breakout exercise
 *
 */

import acm.graphics.GImage;
import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;
import acm.util.RandomGenerator;
import java.awt.*;
import java.awt.event.MouseEvent;

public class Breakout extends GraphicsProgram {

    // Breakout CONSTANTS
    private static final int CANVAS_WIDTH = 640;
    private static final int CANVAS_HEIGHT = 720;
    private static final int NBRICKS_PER_ROW = 10;
    private static final int NBRICKS_PER_COL = 10;
    private static final double BRICK_GAP = 4;
    private static final double BRICK_WIDTH = Math.floor(
            (CANVAS_WIDTH - (NBRICKS_PER_ROW + 1.0) * BRICK_GAP) / NBRICKS_PER_ROW);
    private static final double BRICK_HEIGHT = 12;
    private static final double BRICK_Y_OFFSET = 60;   // from top
    private static final double PADDLE_WIDTH = 80;
    private static final double PADDLE_HEIGHT = 12;
    private static final double PADDLE_Y_OFFSET = 30;    // from bottom
    private static final double BALL_RADIUS = 12;
    private static final double VELOCITY_Y = 3.0;
    private static final double VELOCITY_X_MIN = 1.0;
    private static final double VELOCITY_X_MAX = 3.0;
    private static final int BALL_DELAY = 1000 / 60;

    // Breakout class variables: main actors in the app
    private GRect paddle;
    private GOval ball;
    // Ball velocity
    private double dx;
    private double dy;
    // Ball direction randomizer
    private RandomGenerator rgen = RandomGenerator.getInstance();

    public void run() {
        setTitle("LBYCPEI Breakout");
        setSize(CANVAS_WIDTH, CANVAS_HEIGHT);
        /* You fill this in */
    }

    /* You fill this in with methods*/

    /* Solves NoClassDefFoundError */
    public static void main(String[] args) {
        new Breakout().start(args);
    }
}