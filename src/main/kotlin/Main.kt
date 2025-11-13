package org.example

import Linear.Matrices.Matrix
import Linear.Matrices.MatrixOperators
import org.example.extremeElements.extremeElements
import org.example.relationClosures.reflectiveClosure
import org.example.relationClosures.symmetricalClosure
import org.example.relationClosures.transitiveClosure
import org.example.relationFunctions.isAntisymmetric
import org.example.relationFunctions.isAsymmetric
import org.example.relationFunctions.isReflective
import org.example.relationFunctions.isSymmetrical
import org.example.relationFunctions.isTransitive
import org.example.typedRelation.isRelationEquivalence
import org.example.typedRelation.isRelationOrder
import org.example.utils.composition

fun main() {

    val teste = "asdadad"
    val project10 = Matrix(6, 6, floatArrayOf(
        1f, 1f, 0f, 0f, 0f, 0f,
        1f, 1f, 1f, 0f, 0f, 1f,
        0f, 0f, 1f, 10f, 0f, 0f,
        0f, 0f, 0f, 1f, 0f, 1f,
        0f, 0f, 0f, 1f, 1f, 1f,
        0f, 1f, 0f, 0f, 1f, 1f,
    ))

    val projectBusTerminal = Matrix(6, 6, floatArrayOf(
        0f, 1f, 0f, 0f, 0f, 1f,
        1f, 0f, 0f, 1f, 0f, 0f,
        0f, 0f, 0f, 1f, 0f, 0f,
        0f, 1f, 1f, 0f, 0f, 1f,
        0f, 0f, 0f, 0f, 0f, 1f,
        1f, 0f, 0f, 1f, 1f, 0f,
    ))

    println(project10)
    println("é reflexiva: ${isReflective(project10)}")

    val reflective = reflectiveClosure(project10)
    println("fecho reflexivo:\n$reflective")
    println("fecho é reflexivo: ${isReflective(reflective)}")

    println("é simetrica: ${isSymmetrical(project10)}")

    val symmetric = symmetricalClosure(project10)
    println("fecho simetrico:\n$symmetric")
    println("fecho é simetrico: ${isSymmetrical(symmetric)}")

    println("é assimetrica: ${isAsymmetric(project10)}")
    println("é antissimetrica: ${isAntisymmetric(project10)}")


    println("é transitiva: ${isTransitive(project10)}")
    val transitive = transitiveClosure(project10)

    println("fecho transitivo:\n$transitive")
    println("fecho é transitivo: ${isTransitive(transitive)}")


    println("é relacao de equivalencia: ${isRelationEquivalence(project10)}")
    println("é relacao de orem: ${isRelationOrder(project10)}")


    val extremeData = extremeElements(project10)

    println("""
        maximal: ${extremeData.maximals},
        minimal: ${extremeData.minimals},
        maxs: ${extremeData.maxs},
        mins: ${extremeData.mins}
    """.trimIndent())




    println("""composição de projeto 10 com as linhas de ônibus: 
        | projeto 10: 
        |$project10
        | 
        | linhas de ônibus:
        |$projectBusTerminal
        | 
        | 
        | composição:
        | 
        |${composition(project10, projectBusTerminal)}
    """.trimMargin())

}