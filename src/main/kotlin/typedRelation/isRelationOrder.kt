package org.example.typedRelation

import Linear.Matrices.Matrix
import org.example.relationFunctions.isAsymmetric
import org.example.relationFunctions.isReflective
import org.example.relationFunctions.isTransitive

fun isRelationOrder(project: Matrix): Boolean {
    if (isReflective(project) && isAsymmetric(project) && isTransitive(project)) {
        return true
    }

    return false
}