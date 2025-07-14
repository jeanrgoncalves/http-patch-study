package com.study.patch.application.controller.client

import com.study.patch.domain.usecase.client.UpdateClientAddressUseCase
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/clients")
class ClientController(
    updateClientAddressUseCase: UpdateClientAddressUseCase
) {

    @PatchMapping("/{id}/address")
    fun updateAddress()
    //TODO: criar o resquest

}