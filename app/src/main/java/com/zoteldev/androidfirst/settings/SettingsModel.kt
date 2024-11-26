package com.zoteldev.androidfirst.settings

data class SettingsModel(
    var volume:Int,
    var bluetooth: Boolean,
    var darkMode: Boolean,
    var vibration: Boolean
)