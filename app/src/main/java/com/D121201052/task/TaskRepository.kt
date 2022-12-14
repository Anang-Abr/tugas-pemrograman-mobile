package com.D121201052.task

import androidx.lifecycle.LiveData

class TaskRepository (private val taskDao: TaskDao){
    val readAllData: LiveData<List<TaskModel>> = taskDao.getTask()
    suspend fun addTask(task: TaskModel){
        taskDao.insertTask(task)
    }
}