package br.com.buritiscript.userapi.controller.responseDto;

import jdk.jfr.Timestamp;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
public class UserResponseDto {
    private String nome;
    private String cpf;
    private String endereco;
    private String email;
    private String telefone;
    @Timestamp
    private Date dateCadastro;

    @Deprecated

    public UserResponseDto() {
    }

    public UserResponseDto(String nome, String cpf, String endereco, String email, String telefone, Date dateCadastro) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
        this.dateCadastro = dateCadastro;
    }

}
