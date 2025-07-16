package com.study.patch.domain.usecase.client

import com.study.patch.domain.model.client.ClientRepository

class GetClientUseCase(
    val clientRepository: ClientRepository
) {

    fun execute(clientId: String) =
        clientRepository.findById(clientId)?.let {
            println("Client found: $it")
            it
        }

}