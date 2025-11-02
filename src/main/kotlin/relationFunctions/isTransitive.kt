package org.example.relationFunctions

import Linear.Matrices.Matrix
import Linear.Matrices.MatrixOperators

fun isTransitive(project: Matrix): Boolean{
    val transitiveMatrix = MatrixOperators.dot(project, project)
    val normalizeElement = transitiveMatrix.elements.map { if(it >= 1f) 1f else 0f }.toFloatArray()

    return project.elements.contentEquals(normalizeElement)
}