package org.example.relationFunctions

import Linear.Matrices.Matrix

fun isAntisymmetric(project: Matrix): Boolean{

    for(i in 0 until project.rows){
        for (j in 0 until project.columns){
            if(i != j && project.get(i, j) == 1f && project.get(j, i) == 1f){
                return false
            }
        }
    }

    return true
}