package com.study.patch.domain.usecase.client

import com.study.patch.domain.model.address.Address
import com.study.patch.domain.model.client.ClientRepository
import com.study.patch.util.logger

class UpdateClientAddressUseCase(
    val clientRepository: ClientRepository
) {
    private val logger = logger()

    fun execute(
        clientId: String,
        street: String,
        number: Int,
        zipCode: String
    ) = clientRepository.findById(clientId)?.let {
            val updatedClient = it.updateAddress(Address.create(street, number, zipCode))
            clientRepository.save(updatedClient)
            logger.info("Updated ${it.name} client address")
        }

}