package me.dio.app_repositories.data.di.model.repositories.services


import kotlinx.coroutines.flow.Flow

interface RepoRepository {
    suspend fun listRepositories(user: String): Flow<List<Repo>>
}