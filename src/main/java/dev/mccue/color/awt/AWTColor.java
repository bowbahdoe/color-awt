package dev.mccue.color.awt;

import dev.mccue.color.*;

import java.awt.color.ColorSpace;

public final class AWTColor
        extends java.awt.Color
        implements Color {
    /**
     * The color white.  In the default sRGB space.
     */
    public static final AWTColor white     = AWTColor.of(java.awt.Color.white);

    /**
     * The color white.  In the default sRGB space.
     */
    public static final AWTColor WHITE = AWTColor.of(java.awt.Color.WHITE);

    /**
     * The color light gray.  In the default sRGB space.
     */
    public static final AWTColor lightGray = AWTColor.of(java.awt.Color.lightGray);

    /**
     * The color light gray.  In the default sRGB space.
     */
    public static final AWTColor LIGHT_GRAY = AWTColor.of(java.awt.Color.LIGHT_GRAY);

    /**
     * The color gray.  In the default sRGB space.
     */
    public static final AWTColor gray      = AWTColor.of(java.awt.Color.gray);

    /**
     * The color gray.  In the default sRGB space.
     */
    public static final AWTColor GRAY = AWTColor.of(java.awt.Color.GRAY);

    /**
     * The color dark gray.  In the default sRGB space.
     */
    public static final AWTColor darkGray  = AWTColor.of(java.awt.Color.darkGray);

    /**
     * The color dark gray.  In the default sRGB space.
     */
    public static final AWTColor DARK_GRAY = AWTColor.of(java.awt.Color.DARK_GRAY);

    /**
     * The color black.  In the default sRGB space.
     */
    public static final AWTColor black     = AWTColor.of(java.awt.Color.black);

    /**
     * The color black.  In the default sRGB space.
     */
    public static final AWTColor BLACK = AWTColor.of(java.awt.Color.BLACK);

    /**
     * The color red.  In the default sRGB space.
     */
    public static final AWTColor red       = AWTColor.of(java.awt.Color.red);

    /**
     * The color red.  In the default sRGB space.
     */
    public static final AWTColor RED = AWTColor.of(java.awt.Color.RED);

    /**
     * The color pink.  In the default sRGB space.
     */
    public static final AWTColor pink      = AWTColor.of(java.awt.Color.pink);

    /**
     * The color pink.  In the default sRGB space.
     */
    public static final AWTColor PINK = AWTColor.of(java.awt.Color.PINK);

    /**
     * The color orange.  In the default sRGB space.
     */
    public static final AWTColor orange    = AWTColor.of(java.awt.Color.orange);

    /**
     * The color orange.  In the default sRGB space.
     */
    public static final AWTColor ORANGE = AWTColor.of(java.awt.Color.ORANGE);

    /**
     * The color yellow.  In the default sRGB space.
     */
    public static final AWTColor yellow    = AWTColor.of(java.awt.Color.yellow);

    /**
     * The color yellow.  In the default sRGB space.
     */
    public static final AWTColor YELLOW = AWTColor.of(java.awt.Color.YELLOW);

    /**
     * The color green.  In the default sRGB space.
     */
    public static final AWTColor green     = AWTColor.of(java.awt.Color.green);

    /**
     * The color green.  In the default sRGB space.
     */
    public static final AWTColor GREEN = AWTColor.of(java.awt.Color.GREEN);

    /**
     * The color magenta.  In the default sRGB space.
     */
    public static final AWTColor magenta   = AWTColor.of(java.awt.Color.magenta);

    /**
     * The color magenta.  In the default sRGB space.
     */
    public static final AWTColor MAGENTA = AWTColor.of(java.awt.Color.MAGENTA);

    /**
     * The color cyan.  In the default sRGB space.
     */
    public static final AWTColor cyan      = AWTColor.of(java.awt.Color.cyan);

    /**
     * The color cyan.  In the default sRGB space.
     */
    public static final AWTColor CYAN = AWTColor.of(java.awt.Color.CYAN);

    /**
     * The color blue.  In the default sRGB space.
     */
    public static final AWTColor blue      = AWTColor.of(java.awt.Color.blue);

    /**
     * The color blue.  In the default sRGB space.
     */
    public static final AWTColor BLUE = AWTColor.of(java.awt.Color.BLUE);

    private AWTColor(int r, int g, int b) {
        super(r, g, b);
    }

    public static AWTColor of(int r, int g, int b) {
        return new AWTColor(r, g, b);
    }

    private AWTColor(int r, int g, int b, int a) {
        super(r, g, b, a);
    }

    public static AWTColor of(int r, int g, int b, int a) {
        return new AWTColor(r, g, b, a);
    }

    private AWTColor(int rgb) {
        super(rgb);
    }

    public static AWTColor of(int rgb) {
        return new AWTColor(rgb);
    }

    private AWTColor(int rgba, boolean hasalpha) {
        super(rgba, hasalpha);
    }

    public static AWTColor of(int rgba, boolean hasalpha) {
        return new AWTColor(rgba, hasalpha);
    }

    private AWTColor(float r, float g, float b) {
        super(r, g, b);
    }

    public static AWTColor of(float r, float g, float b) {
        return new AWTColor(r, b, g);
    }

    public AWTColor(ColorSpace cspace, float[] components, float alpha) {
        super(cspace, components, alpha);
    }

    public static AWTColor of(ColorSpace cspace, float[] components, float alpha) {
        return new AWTColor(cspace, components, alpha);
    }

    private AWTColor(float r, float g, float b, float a) {
        super(r, g, b, a);
    }

    public static AWTColor of(float r, float g, float b, float a) {
        return new AWTColor(r, g, b, a);
    }

    public static AWTColor of(Color color) {
        return of(color, 1);
    }

    public static AWTColor of(Color color, float alpha) {
        return switch (color) {
            case sRGB srgb -> new AWTColor(
                    ColorSpace.getInstance(ColorSpace.CS_sRGB),
                    new float[] { (float) srgb.R(), (float) srgb.G(), (float) srgb.B() },
                    alpha
            );
            case LinearRGB linearRGB -> new AWTColor(
                    ColorSpace.getInstance(ColorSpace.CS_LINEAR_RGB),
                    new float[] { (float) linearRGB.R(), (float) linearRGB.G(), (float) linearRGB.B() },
                    alpha
            );
            case XYZ xyz -> new AWTColor(
                    ColorSpace.getInstance(ColorSpace.CS_CIEXYZ),
                    new float[] { (float) xyz.X(), (float) xyz.Y(), (float) xyz.Z() },
                    alpha
            );
            default -> of(color.sRGB());
        };
    }

    public static AWTColor of(java.awt.Color color) {
        return new AWTColor(
                color.getColorSpace(),
                color.getComponents(null),
                color.getAlpha() / 255.0f
        );
    }

    @Override
    public sRGB sRGB() {
        float[] comps = this.getComponents(
                ColorSpace.getInstance(ColorSpace.CS_sRGB),
                null
        );
        return new sRGB(comps[0], comps[1], comps[2]);
    }

    @Override
    public LinearRGB LinearRGB() {
        float[] comps = this.getComponents(
                ColorSpace.getInstance(ColorSpace.CS_LINEAR_RGB),
                null
        );
        return new LinearRGB(comps[0], comps[1], comps[2]);
    }
}
