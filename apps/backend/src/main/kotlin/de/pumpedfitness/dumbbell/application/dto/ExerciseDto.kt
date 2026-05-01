package de.pumpedfitness.dumbbell.application.dto

import de.pumpedfitness.dumbbell.domain.model.workout.enum.ExerciseCategory
import de.pumpedfitness.dumbbell.domain.model.workout.enum.ExerciseEquipment
import de.pumpedfitness.dumbbell.domain.model.workout.enum.MuscleGroup

data class ExerciseDto(
    val id: String,
    val name: String,
    val description: String?,
    val muscleGroup: List<MuscleGroup>,
    val exerciseCategory: ExerciseCategory,
    val equipment: List<ExerciseEquipment>
)
