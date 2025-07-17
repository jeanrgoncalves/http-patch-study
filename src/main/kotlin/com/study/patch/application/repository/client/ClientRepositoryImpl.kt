package com.study.patch.application.repository.client

import com.study.patch.domain.model.address.Address
import com.study.patch.domain.model.client.Client
import com.study.patch.domain.model.client.ClientRepository
import com.study.patch.domain.model.client.exception.ClientNotFoundException
import com.study.patch.util.logger

class ClientRepositoryImpl : ClientRepository {
    var clients = mutableListOf(
        Client(
            "1",
            "Liam Neeson",
            Address.create("Baker", 330, "19804-400")
        )
    )

    private val logger = logger()

    override fun save(client: Client): Client =
        clients.removeIf { it.id == client.id }.let {
            clients.add(client)
            client
        }.also {
            logger.info("Client $client saved")
            logger.info("DB: $clients")
        }

    override fun findById(clientId: String) =
        clients.find { it.id == clientId } ?: throw ClientNotFoundException(clientId)

}