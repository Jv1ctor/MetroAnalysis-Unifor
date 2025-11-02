package org.example.utils

import Linear.Matrices.Matrix

fun countCompareMainDiagonal(project: Matrix, compareValue: Float): Int{
    var countEquals = 0
    for(i in 0 until project.rows){
        val value = project.get(i, i)
        if(value == compareValue){
            countEquals++;
        }
    }

    return countEquals
}