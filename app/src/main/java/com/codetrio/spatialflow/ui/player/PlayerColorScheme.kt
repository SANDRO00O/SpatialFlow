package com.codetrio.spatialflow.ui.player

import androidx.compose.material3.ColorScheme
import androidx.compose.ui.graphics.Color

/**
 * A grayscale Material color scheme scoped to the player UI.
 * The rest of the app keeps its normal dynamic/Material You colors.
 */
internal fun ColorScheme.toMonochromePlayerScheme(isDark: Boolean): ColorScheme {
    val background = if (isDark) Color.Black else Color.White
    val foreground = if (isDark) Color.White else Color.Black
    val mutedForeground = if (isDark) Color(0xFFBDBDBD) else Color(0xFF555555)
    val container = if (isDark) Color(0xFF171717) else Color(0xFFF4F4F4)
    val containerHigh = if (isDark) Color(0xFF282828) else Color(0xFFE8E8E8)
    val containerHighest = if (isDark) Color(0xFF303030) else Color(0xFFDEDEDE)

    return copy(
        primary = foreground,
        onPrimary = background,
        primaryContainer = containerHigh,
        onPrimaryContainer = foreground,
        inversePrimary = foreground,
        secondary = mutedForeground,
        onSecondary = background,
        secondaryContainer = container,
        onSecondaryContainer = foreground,
        tertiary = mutedForeground,
        onTertiary = background,
        tertiaryContainer = container,
        onTertiaryContainer = foreground,
        background = background,
        onBackground = foreground,
        surface = background,
        onSurface = foreground,
        surfaceVariant = container,
        onSurfaceVariant = mutedForeground,
        surfaceTint = foreground,
        inverseSurface = foreground,
        inverseOnSurface = background,
        error = mutedForeground,
        onError = background,
        errorContainer = containerHigh,
        onErrorContainer = foreground,
        outline = mutedForeground,
        outlineVariant = containerHigh,
        scrim = Color.Black.copy(alpha = 0.32f),
        surfaceBright = if (isDark) Color(0xFF333333) else Color.White,
        surfaceDim = if (isDark) Color.Black else Color(0xFFDDDDDD),
        surfaceContainerLowest = if (isDark) Color.Black else Color.White,
        surfaceContainerLow = if (isDark) Color(0xFF101010) else Color(0xFFFAFAFA),
        surfaceContainer = container,
        surfaceContainerHigh = containerHigh,
        surfaceContainerHighest = containerHighest
    )
}
