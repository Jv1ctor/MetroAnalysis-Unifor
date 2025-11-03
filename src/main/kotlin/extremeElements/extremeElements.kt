package org.example.extremeElements

import Linear.Matrices.Matrix
import org.example.data.ExtremeElementsReturn
import org.example.data.Stations

fun extremeElements(project: Matrix): ExtremeElementsReturn{
    val maximals = mutableListOf<Stations>()
    val minimals = mutableListOf<Stations>()
    val maxs = mutableListOf<Stations>()
    val mins = mutableListOf<Stations>()

    for(i in 0 until project.rows){
        var isMaximal = true
        var isMinimal = true
        var isMax = true
        var isMin = true
        for (j in 0 until project.columns){
            if(i == j) continue

            if (project.get(i,j) == 1f) isMaximal = false
            if (project.get(j,i) == 1f) isMinimal = false
            if (project.get(j,i) != 1f) isMax = false
            if (project.get(i,j) != 1f) isMin = false
        }


        if (isMaximal) maximals.add(Stations.entries[i])
        if (isMinimal) minimals.add(Stations.entries[i])
        if (isMax) maxs.add(Stations.entries[i])
        if (isMin) mins.add(Stations.entries[i])
    }



    return ExtremeElementsReturn(maximals, minimals, maxs, mins)
}