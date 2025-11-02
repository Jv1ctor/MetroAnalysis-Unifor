package org.example.utils

import Linear.Matrices.Matrix

fun setMainDiagonal(matrix: Matrix, compare: Float, newValue: Float) {
    for (i in 0 until matrix.rows){
        if(matrix.get(i, i) == compare){
            matrix.set(i, i, newValue)
        }
    }
}