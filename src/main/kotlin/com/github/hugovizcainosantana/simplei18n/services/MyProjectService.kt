package com.github.hugovizcainosantana.simplei18n.services

import com.github.hugovizcainosantana.simplei18n.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
