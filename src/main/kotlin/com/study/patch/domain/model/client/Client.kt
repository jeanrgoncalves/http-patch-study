package com.study.patch.domain.model.client

import com.study.patch.domain.model.address.Address

data class Client(
    val id: String,
    val name: String,
    val address: Address
) {
    fun updateAddress(
        street: String,
        number: Int,
        zipCode: String
    ) = this.copy(address = Address.create(street, number, zipCode))
}