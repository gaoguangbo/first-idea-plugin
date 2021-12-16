package com.github.gaoguangbo.firstideaplugin.services

import com.intellij.openapi.project.Project
import com.github.gaoguangbo.firstideaplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
