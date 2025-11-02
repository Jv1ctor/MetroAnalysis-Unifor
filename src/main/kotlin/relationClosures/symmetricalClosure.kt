package org.example.relationClosures

import Linear.Matrices.Matrix
import Linear.Matrices.MatrixOperators
import org.example.relationFunctions.isSymmetrical


fun symmetricalClosure(project: Matrix): Matrix{
    if(isSymmetrical(project)){
        return project
    }


    val transposeMatrix = MatrixOperators.transpose(project)
    val newMatrix = Matrix(project.rows, project.columns, project.elements)
    for(i in 0 until newMatrix.rows){
        for (j in 0 until newMatrix.columns){
            if(newMatrix.get(i, j) != transposeMatrix.get(i, j)){
                newMatrix.set(i, j, 1f)
            }
        }
    }

    return newMatrix
}