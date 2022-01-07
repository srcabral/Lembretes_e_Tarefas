package com.example.todolist.datasource

import com.example.todolist.model.Task
import java.util.ArrayList

object TaskDataSource{
    private val list = arrayListOf<Task>()

    fun getList() = list

    fun insertTask(task: Task){
        list.add(task.copy(id = list.size + 1))
    }
}