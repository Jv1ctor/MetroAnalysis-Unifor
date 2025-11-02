package org.example

import Linear.Matrices.Matrix
import Linear.Matrices.MatrixOperators
import org.example.data.Stations
import org.example.relationClosures.reflectiveClosure
import org.example.relationClosures.symmetricalClosure
import org.example.relationClosures.transitiveClosure
import org.example.relationFunctions.isAntisymmetric
import org.example.relationFunctions.isAsymmetric
import org.example.relationFunctions.isReflective
import org.example.relationFunctions.isSymmetrical
import org.example.relationFunctions.isTransitive

fun main() {
    val project10 = Matrix(6, 6, floatArrayOf(
        1f, 1f, 0f, 0f, 0f, 0f,
        1f, 1f, 1f, 0f, 0f, 1f,
        0f, 0f, 1f, 0f, 0f, 0f,
        0f, 0f, 0f, 1f, 0f, 1f,
        0f, 0f, 1f, 0f, 1f, 1f,
        0f, 1f, 0f, 0f, 1f, 1f,
    ))


    println(project10)
    println("é reflexiva: ${isReflective(project10)}")

    println("fecho reflexivo:\n${reflectiveClosure(project10)}")

    println("é simetrica: ${isSymmetrical(project10)}")

    println("fecho simetrico:\n${symmetricalClosure(project10)}")

    println("é assimetrica: ${isAsymmetric(project10)}")
    println("é antissimetrica: ${isAntisymmetric(project10)}")


    println("é transitiva: ${isTransitive(project10)}")

    val transitive = transitiveClosure(project10)

    println("fecho transitivo:\n$transitive")


    println(project10.get(Stations.CENTRO.value, Stations.PRACA.value))
}