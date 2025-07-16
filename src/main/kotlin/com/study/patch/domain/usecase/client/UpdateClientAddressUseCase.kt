package com.study.patch.domain.usecase.client

import com.study.patch.domain.model.address.Address
import com.study.patch.domain.model.client.ClientRepository

class UpdateClientAddressUseCase(
    val clientRepository: ClientRepository
) {

    fun execute(
        clientId: String,
        street: String,
        number: Int,
        zipCode: String
    ) = clientRepository.findById(clientId)?.let {
            val updatedClient = it.updateAddress(Address.create(street, number, zipCode))
            clientRepository.save(updatedClient)
            println("Updated ${it.name} client address")
        }

}