package org.example.typedRelation

import Linear.Matrices.Matrix
import org.example.relationFunctions.isReflective
import org.example.relationFunctions.isSymmetrical
import org.example.relationFunctions.isTransitive

fun isRelationEquivalence(project: Matrix): Boolean {

    val t = isReflective(project)
    val a = isSymmetrical(project)
    val d = isTransitive(project)
    if (isReflective(project) && isSymmetrical(project) && isTransitive(project)) {
        return true
    }

    return false
}