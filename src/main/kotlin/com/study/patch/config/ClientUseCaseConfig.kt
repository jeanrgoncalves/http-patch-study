package com.study.patch.config

import com.study.patch.application.repository.client.ClientRepositoryImpl
import com.study.patch.domain.model.client.ClientRepository
import com.study.patch.domain.usecase.client.GetClientUseCase
import com.study.patch.domain.usecase.client.UpdateClientAddressUseCase
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ClientUseCaseConfig {

    @Bean
    fun updateClientAddressUseCase(clientRepository: ClientRepository) =
        UpdateClientAddressUseCase(clientRepository)

    @Bean fun getClientUseCase(clientRepository: ClientRepository) =
        GetClientUseCase(clientRepository)

    @Bean
    fun clientRepository() = ClientRepositoryImpl()

}