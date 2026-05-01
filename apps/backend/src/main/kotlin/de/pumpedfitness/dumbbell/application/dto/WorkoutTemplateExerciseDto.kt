package de.pumpedfitness.dumbbell.application.dto

data class WorkoutTemplateExerciseDto(
    val id: String,
    val workoutTemplateId: String,
    val exerciseId: String,
    val orderIndex: Int,
    val sets: Int,
    val targetReps: String,
    val targetWeight: Double?,
    val restSeconds: Int?,
    val notes: String?,
    val createdAt: Long,
    val updatedAt: Long,
)
