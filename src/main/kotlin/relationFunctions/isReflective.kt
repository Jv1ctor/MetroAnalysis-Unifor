package org.example.relationFunctions

import Linear.Matrices.Matrix
import org.example.utils.countCompareMainDiagonal

fun isReflective(project: Matrix): Boolean{
    val countEquals = countCompareMainDiagonal(project, 1f)
    return countEquals == project.rows
}