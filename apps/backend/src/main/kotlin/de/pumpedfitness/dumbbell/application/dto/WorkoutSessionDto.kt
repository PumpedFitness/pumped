package de.pumpedfitness.dumbbell.application.dto

data class WorkoutSessionDto(
    val id: String,
    val userId: String,
    val workoutTemplateId: String?,
    val name: String,
    val startedAt: Long,
    val endedAt: Long?,
    val notes: String?,
)
