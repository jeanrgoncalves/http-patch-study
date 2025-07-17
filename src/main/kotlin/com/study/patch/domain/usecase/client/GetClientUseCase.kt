package com.study.patch.domain.usecase.client

import com.study.patch.domain.model.client.ClientRepository
import com.study.patch.util.logger

class GetClientUseCase(
    val clientRepository: ClientRepository
) {
    private val logger = logger()

    fun execute(clientId: String) =
        clientRepository.findById(clientId)?.let {
            logger.info("Client found: $it")
            it
        }

}