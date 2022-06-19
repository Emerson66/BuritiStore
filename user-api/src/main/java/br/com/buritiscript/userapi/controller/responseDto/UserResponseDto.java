package br.com.buritiscript.userapi.controller.responseDto;

import com.fasterxml.jackson.annotation.JsonCreator;
import jdk.jfr.Timestamp;

import java.util.Date;

public class UserResponseDto {
    private String nome;
    private String cpf;
    private String endereco;
    private String email;
    private String telefone;
    @Timestamp
    private Date dateCadastro
}
