package com.github.crypticspawn.cfmlplugin.services

import com.intellij.openapi.project.Project
import com.github.crypticspawn.cfmlplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
