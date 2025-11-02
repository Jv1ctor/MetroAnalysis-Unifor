package org.example.relationFunctions

import Linear.Matrices.Matrix
import org.example.utils.countCompareMainDiagonal

fun isAsymmetric(project: Matrix): Boolean{
    val countEquals = countCompareMainDiagonal(project, 0f)

    if(countEquals != project.rows) return false

    for(i in 0 until project.rows){
        for (j in 0 until project.columns){
            if(project.get(i, j) == 1f && project.get(j, i) != 0f){
                return false
            }
        }
    }

    return true
}