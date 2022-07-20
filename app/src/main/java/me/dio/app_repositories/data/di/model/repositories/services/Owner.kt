package me.dio.app_repositories.data.di.model.repositories.services

import com.google.gson.annotations.SerializedName

data class Owner(
    val login: String,
    @SerializedName("avatar_url")
    val avatarURL: String
)