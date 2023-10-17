package com.satyamthakur.learning.basicstatecodelab

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

private fun getWellnessTask() = List(30) {i -> WellnessTask(i, "Task $i")}

@Composable
fun WellnessTasksList (
    modifier: Modifier = Modifier,
    list: List<WellnessTask> = getWellnessTask()
) {
    LazyColumn(
        modifier = modifier
    ) {
        items(list) { task ->
            WellnessTaskItem(taskName = task.label)
        }
    }
}