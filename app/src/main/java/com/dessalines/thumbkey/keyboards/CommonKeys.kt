package com.dessalines.thumbkey.keyboards

import android.view.KeyEvent
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.KeyboardBackspace
import androidx.compose.material.icons.outlined.KeyboardReturn
import androidx.compose.material.icons.outlined.Numbers
import androidx.compose.material.icons.outlined.Settings
import com.dessalines.thumbkey.utils.ColorVariant
import com.dessalines.thumbkey.utils.FontSizeVariant
import com.dessalines.thumbkey.utils.KeyAction
import com.dessalines.thumbkey.utils.KeyC
import com.dessalines.thumbkey.utils.KeyDisplay
import com.dessalines.thumbkey.utils.KeyItemC
import com.dessalines.thumbkey.utils.SwipeDirection

val SETTINGS_KEY_ITEM =
    KeyItemC(
        center = KeyC(
            display = KeyDisplay.IconDisplay(Icons.Outlined.Settings),
            action = KeyAction.GotoSettings,
            size = FontSizeVariant.LARGE,
            color = ColorVariant.SECONDARY
        ),
        backgroundColor = ColorVariant.SURFACE_VARIANT
    )

val NUMERIC_KEY_ITEM =
    KeyItemC(
        center = KeyC(
            display = KeyDisplay.IconDisplay(Icons.Outlined.Numbers),
            action = KeyAction.ToggleNumericMode(true),
            size = FontSizeVariant.LARGE,
            color = ColorVariant.SECONDARY
        ),
        backgroundColor = ColorVariant.SURFACE_VARIANT
    )

val BACKSPACE_KEY_ITEM =
    KeyItemC(
        center = KeyC(
            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardBackspace),
            action = KeyAction.SendEvent(
                KeyEvent(
                    KeyEvent.ACTION_DOWN,
                    KeyEvent
                        .KEYCODE_DEL
                )
            ),
            size = FontSizeVariant.LARGE,
            color = ColorVariant.SECONDARY
        ),
        swipes = mapOf(
            SwipeDirection.LEFT to KeyC(
                action = KeyAction.DeleteLastWord,
                display = null
            ),
            SwipeDirection.TOP_LEFT to KeyC(
                action = KeyAction.DeleteLastWord,
                display = null
            ),
            SwipeDirection.BOTTOM_LEFT to KeyC(
                action = KeyAction.DeleteLastWord,
                display = null
            )
        ),
        backgroundColor = ColorVariant.SURFACE_VARIANT
    )

val SPACEBAR_KEY_ITEM =
    KeyItemC(
        center = KeyC(
            display = KeyDisplay.TextDisplay(" "),
            action = KeyAction.CommitText(" ")
        ),
        swipes = mapOf(
            SwipeDirection.LEFT to KeyC(
                action = KeyAction.SendEvent(
                    KeyEvent(
                        KeyEvent.ACTION_DOWN,
                        KeyEvent.KEYCODE_DPAD_LEFT
                    )
                ),
                display = null
            ),
            SwipeDirection.RIGHT to KeyC(
                action = KeyAction.SendEvent(
                    KeyEvent(
                        KeyEvent.ACTION_DOWN,
                        KeyEvent.KEYCODE_DPAD_RIGHT
                    )
                ),
                display = null
            )
        ),
        nextTapActions = arrayOf(
            KeyAction.ReplaceLastText(", ", trimCount = 1),
            KeyAction.ReplaceLastText(". "),
            KeyAction.ReplaceLastText("? "),
            KeyAction.ReplaceLastText("! "),
            KeyAction.ReplaceLastText(": "),
            KeyAction.ReplaceLastText("; ")
        ),
        backgroundColor = ColorVariant.SURFACE_VARIANT,
        widthMultiplier = 3
    )

val RETURN_KEY_ITEM =
    KeyItemC(
        center = KeyC(
            display = KeyDisplay.IconDisplay(Icons.Outlined.KeyboardReturn),
            action = KeyAction.IMECompleteAction,
            size = FontSizeVariant.LARGE,
            color = ColorVariant.SECONDARY
        ),
        backgroundColor = ColorVariant.SURFACE_VARIANT
    )
