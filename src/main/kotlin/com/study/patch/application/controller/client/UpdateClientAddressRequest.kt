package com.study.patch.application.controller.client

data class UpdateClientAddressRequest(
    val street: String,
    val number: Int,
    val zipCode: String
)