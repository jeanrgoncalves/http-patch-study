package com.study.patch.domain.model.client

import com.study.patch.domain.model.address.Address

data class Client(
    val id: String,
    val name: String,
    val address: Address
) {
    fun updateAddress(newAddress: Address) = this.copy(
        address = Address.create(
            newAddress.street,
            newAddress.number,
            newAddress.zipCode
        )
    )
}