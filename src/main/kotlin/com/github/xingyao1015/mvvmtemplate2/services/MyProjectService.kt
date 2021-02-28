package com.github.xingyao1015.mvvmtemplate2.services

import com.github.xingyao1015.mvvmtemplate2.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
