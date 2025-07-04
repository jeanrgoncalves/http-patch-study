package com.study.patch.domain.model.address.exception

import java.lang.RuntimeException

class AddressInvalidZipCodeException(val zipCode: String)
    : RuntimeException("$zipCode is not a valid zip code. Example: 19804-400")