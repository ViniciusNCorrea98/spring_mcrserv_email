package com.ms.user.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

/**Todos os atributos no Record estarão como parametros
 * */
public record UserRecordDto(@NotBlank String name,
                            @NotBlank @Email String email) {
}
