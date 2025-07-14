package com.study.patch.domain.model.address

import com.study.patch.domain.model.address.exception.AddressEmptyStreetException
import com.study.patch.domain.model.address.exception.AddressInvalidZipCodeException

data class Address(
    val street: String,
    val number: Int,
    val zipCode: String,
) {
    companion object {
        val ZIP_CODE_REGEX = "\\d{5}-\\d{3}".toRegex()

        fun create(
            street: String,
            number: Int,
            zipCode: String
        ): Address {
            if (street.isEmpty()) {
                throw AddressEmptyStreetException()
            }

            if (!zipCode.matches(ZIP_CODE_REGEX)) {
                throw AddressInvalidZipCodeException(zipCode)
            }

            return Address(
                street = street,
                number = number,
                zipCode = zipCode
            )
        }
    }
}