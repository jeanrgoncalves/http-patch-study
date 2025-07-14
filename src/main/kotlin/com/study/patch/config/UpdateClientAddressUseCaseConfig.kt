package com.study.patch.config

import com.study.patch.domain.model.client.ClientRepository
import com.study.patch.domain.usecase.client.UpdateClientAddressUseCase
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class UpdateClientAddressUseCaseConfig {

    @Bean
    fun updateClientAddressUseCase(clientRepository: ClientRepository) =
        UpdateClientAddressUseCase(clientRepository)

}