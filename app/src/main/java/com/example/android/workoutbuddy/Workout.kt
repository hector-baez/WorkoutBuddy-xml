package com.example.android.workoutbuddy

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(tableName = "workout_table", primaryKeys = ["workout","exercise", "username"])
class Workout(@ColumnInfo(name="workout") val workout: String,
              @ColumnInfo(name="exercise") val exercise: String,
              @ColumnInfo(name="sets") val sets: Int,
              @ColumnInfo(name="reps") val reps: Int,
              @ColumnInfo(name="rest") val rest: Int,
              @ColumnInfo(name="weight") val weight: Int,
              @ColumnInfo(name="username") val username: String)