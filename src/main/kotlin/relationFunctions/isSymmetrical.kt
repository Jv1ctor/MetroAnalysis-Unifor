package org.example.relationFunctions

import Linear.Matrices.Matrix
import Linear.Matrices.MatrixOperators

fun isSymmetrical(project: Matrix): Boolean{
    val transposeElements = MatrixOperators.transpose(project).elements
    return transposeElements.contentEquals(project.elements)
}