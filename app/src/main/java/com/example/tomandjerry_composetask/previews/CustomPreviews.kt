package com.example.tomandjerry_composetask.previews

import android.content.res.Configuration
import androidx.compose.ui.tooling.preview.Preview

//region Theme Previews
@Preview(
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    name = "Dark Theme",
    group = "Themes",
    showBackground = true
)
@Preview(
    uiMode = Configuration.UI_MODE_NIGHT_NO,
    name = "Light Theme",
    group = "Themes",
    showBackground = true
)
annotation class ThemesPreviews
//endregion

//region Localization Previews
@Preview(
    locale = "en", // English
    name = "English",
    group = "Localization",
    showBackground = true
)
@Preview(
    locale = "de", // German
    name = "French",
    group = "Localization",
    showBackground = true
)
@Preview(
    locale = "ru", // Russian
    name = "French",
    group = "Localization",
    showBackground = true
)
@Preview(
    locale = "fr", // French
    name = "French",
    group = "Localization",
    showBackground = true
)
@Preview(
    locale = "es", // Spanish
    name = "French",
    group = "Localization",
    showBackground = true
)
annotation class LocalizationPreviews
//endregion

//region Base Previews (Direction & Device)
@Preview(
    name = "English - LTR",
    showBackground = true,
    locale = "en",
    uiMode = Configuration.UI_MODE_NIGHT_NO or Configuration.UI_MODE_TYPE_NORMAL,
)
@Preview(
    name = "Arabic - RTL",
    showBackground = true,
    locale = "ar",
    uiMode = Configuration.UI_MODE_NIGHT_NO or Configuration.UI_MODE_TYPE_NORMAL,
)
@Preview(
    device = Devices.PIXEL_2_XL,
    name = "PIXEL_2_XL",
    showBackground = true,
    locale = "en",
    uiMode = Configuration.UI_MODE_NIGHT_NO or Configuration.UI_MODE_TYPE_NORMAL,
)
@Preview(
    device = "spec:width=1440px,height=3960px,dpi=560",
    name = "PIXEL_3_XL",
    showBackground = true,
    locale = "en",
    uiMode = Configuration.UI_MODE_NIGHT_NO or Configuration.UI_MODE_TYPE_NORMAL,
)
annotation class BasePreview
//endregion

//region All Previews Combined
@ThemesPreviews
@LocalizationPreviews
annotation class AllPreviews
//endregion

//region Device Constants
data object Devices {
    const val NEXUS_7 = "id:Nexus 7"
    const val NEXUS_7_2013 = "id:Nexus 7 2013"
    const val NEXUS_5 = "id:Nexus 5"
    const val NEXUS_6 = "id:Nexus 6"
    const val NEXUS_9 = "id:Nexus 9"
    const val NEXUS_10 = "name:Nexus 10"
    const val NEXUS_5X = "id:Nexus 5X"
    const val NEXUS_6P = "id:Nexus 6P"
    const val PIXEL_C = "id:pixel_c"
    const val PIXEL = "id:pixel"
    const val PIXEL_XL = "id:pixel_xl"
    const val PIXEL_2 = "id:pixel_2"
    const val PIXEL_2_XL = "id:pixel_2_xl"
    const val PIXEL_3 = "id:pixel_3"
    const val PIXEL_3_XL = "id:pixel_3_xl"
    const val PIXEL_3A = "id:pixel_3a"
    const val PIXEL_3A_XL = "id:pixel_3a_xl"
    const val PIXEL_4 = "id:pixel_4"
    const val PIXEL_4_XL = "id:pixel_4_xl"
    const val AUTOMOTIVE_1024P = "id:automotive_1024p_landscape"
}
//endregion