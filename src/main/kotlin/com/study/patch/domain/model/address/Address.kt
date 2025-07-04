package com.study.patch.domain.model.address

data class Address(
    val street: String,
    val number: Int,
    val zipCode: String,
) {
    fun updateAddress(
        street: String,
        number: Int,
        zipCode: String
    ) {

    }
}