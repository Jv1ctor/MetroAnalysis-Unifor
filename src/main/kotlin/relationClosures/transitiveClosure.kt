package org.example.relationClosures

import Linear.Matrices.Matrix
import Linear.Matrices.MatrixOperators
import org.example.relationFunctions.isTransitive

fun transitiveClosure(project: Matrix): Matrix {
    val elements = project.elements.copyOf()
    val closure = Matrix(project.rows, project.columns, elements)
    val size = project.rows
    var changed: Boolean

    do {
        changed = false
        val product = MatrixOperators.dot(closure, closure)
        val normalized = product.elements.map { if (it >= 1f) 1f else 0f }.toFloatArray()

        for (i in 0 until size) {
            for (j in 0 until size) {
                if (normalized[i * size + j] == 1f && closure.get(i, j) != 1f) {
                    closure.elements[i * size + j] = 1f
                    changed = true
                }
            }
        }
    } while (changed)

    return closure
}