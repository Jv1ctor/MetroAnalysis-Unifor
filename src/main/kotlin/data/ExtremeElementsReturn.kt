package org.example.data

import kotlin.collections.mutableListOf

data class ExtremeElementsReturn(
    val maximals: MutableList<Stations>,
    val minimals: MutableList<Stations>,
    val maxs: MutableList<Stations>,
    val mins: MutableList<Stations>,
    )
