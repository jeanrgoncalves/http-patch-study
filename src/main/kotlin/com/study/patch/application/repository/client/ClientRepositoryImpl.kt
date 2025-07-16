package com.study.patch.application.repository.client

import com.study.patch.domain.model.address.Address
import com.study.patch.domain.model.client.Client
import com.study.patch.domain.model.client.ClientRepository

class ClientRepositoryImpl : ClientRepository {
    var clients = mutableListOf(
        Client(
            "1",
            "Liam Neeson",
            Address.create("Baker", 330, "19804-400")
        )
    )

    override fun save(client: Client): Client {
        clients.removeIf { it.id == client.id }
        clients.add(client)
        println("Cliente $client salvo")
        println("BD: $clients")
        return client
    }

    override fun findById(clientId: String) =
        clients.find { it.id == clientId }

}