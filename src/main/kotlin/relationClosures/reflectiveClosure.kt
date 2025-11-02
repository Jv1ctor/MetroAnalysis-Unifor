package org.example.relationClosures

import Linear.Matrices.Matrix
import Linear.Matrices.MatrixOperators
import org.example.relationFunctions.isReflective
import org.example.utils.setMainDiagonal


fun reflectiveClosure(project: Matrix): Matrix{
    if(isReflective(project)){
        return project
    }

    val elements = project.elements.copyOf()
    val newMatrix = Matrix(project.rows, project.columns, elements)

    setMainDiagonal(newMatrix, 0f, 1f)

    return newMatrix
}