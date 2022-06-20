package br.com.buritiscript.userapi.controller.responseDto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@EqualsAndHashCode
public class UserResponseDto {
    private String nome;
    private String cpf;
    private String endereco;
    private String email;
    private String telefone;

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
    public void toModel(UserResponseDto userResponseDto) {
        this.nome = userResponseDto.getNome();
        this.cpf = userResponseDto.getCpf();
        this.endereco = userResponseDto.endereco;
        this.email = userResponseDto.getEmail();
        this.telefone = userResponseDto.getTelefone();
    }

}
