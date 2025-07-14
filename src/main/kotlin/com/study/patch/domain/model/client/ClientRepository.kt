package com.study.patch.domain.model.client

interface ClientRepository {
    fun save(client: Client): Client
    fun findById(clientId: String): Client?
}