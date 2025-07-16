package com.study.patch.application.controller.client

import com.study.patch.domain.usecase.client.UpdateClientAddressUseCase
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/clients")
class ClientController(
    val updateClientAddressUseCase: UpdateClientAddressUseCase
) {

    @PatchMapping("/{id}/address")
    fun updateAddress(@PathVariable id: String, @RequestBody request: UpdateClientAddressRequest) =
        updateClientAddressUseCase.execute(
            id,
            request.street,
            request.number,
            request.zipCode
        )

}