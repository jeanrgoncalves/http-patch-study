package com.study.patch.application.controller.client

import com.study.patch.domain.usecase.client.GetClientUseCase
import com.study.patch.domain.usecase.client.UpdateClientAddressUseCase
import com.study.patch.util.logger
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/clients")
class ClientController(
    val updateClientAddressUseCase: UpdateClientAddressUseCase,
    val getClientUseCase: GetClientUseCase
) {
    private val logger = logger()

    @PatchMapping("/{id}/address")
    fun updateAddress(@PathVariable id: String, @RequestBody request: UpdateClientAddressRequest) =
        logger.info("Request: $request").let {
            updateClientAddressUseCase.execute(
                id,
                request.street,
                request.number,
                request.zipCode
            )
        }

    @GetMapping("{id}")
    fun getClient(@PathVariable id: String) =
        getClientUseCase.execute(id).let {
            ResponseEntity.ok(it)
        }

}