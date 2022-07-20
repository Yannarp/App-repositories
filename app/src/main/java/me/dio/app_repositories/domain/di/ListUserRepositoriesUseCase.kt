package me.dio.app_repositories.domain.di

import kotlinx.coroutines.flow.Flow
import me.dio.app_repositories.core.UseCase
import me.dio.app_repositories.data.di.model.repositories.services.Repo
import me.dio.app_repositories.data.di.model.repositories.services.RepoRepository

class ListUserRepositoriesUseCase(
    private val repository: RepoRepository
) : UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }

