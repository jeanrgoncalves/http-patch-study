package com.study.patch.domain.model.address.exception

import java.lang.RuntimeException

class AddressEmptyStreetException : RuntimeException("Street cannot be empty.")