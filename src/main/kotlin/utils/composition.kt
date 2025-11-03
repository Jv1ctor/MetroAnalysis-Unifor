package org.example.utils

import Linear.Matrices.Matrix
import Linear.Matrices.MatrixOperators

fun composition(a: Matrix, b: Matrix): Matrix{
    val dotMatrix = MatrixOperators.dot(a, b)
    val normalize = dotMatrix.elements.map { if(it >= 1f) 1f else 0f }.toFloatArray()


    return Matrix(dotMatrix.rows, dotMatrix.columns, normalize)
}