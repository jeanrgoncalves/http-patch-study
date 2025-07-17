package com.study.patch.domain.model.client.exception

class ClientNotFoundException(id: String)
    : RuntimeException("Client not found for id $id")