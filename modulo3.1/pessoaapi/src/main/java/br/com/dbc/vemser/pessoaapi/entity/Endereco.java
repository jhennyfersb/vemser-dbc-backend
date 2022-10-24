package br.com.dbc.vemser.pessoaapi.entity;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@ToString
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class Endereco {
    private Integer idEndereco;
    private Integer idPessoa;
    @NotNull
    private TipoEndereco tipo;
    @NotBlank
    @Size(max = 250)
    private String logradouro;
    @NotNull
    private Integer numero;
    private String complemento;
    @NotBlank
    @Size(max = 8)
    private String cep;
    @NotBlank
    @Size(max = 250)
    private String cidade;
    @NotBlank
    @NotNull
    private String estado;
    @NotBlank
    @NotNull
    private String pais;


}
