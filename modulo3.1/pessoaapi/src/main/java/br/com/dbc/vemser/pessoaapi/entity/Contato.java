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
public class Contato {
    private Integer idContato;

    private Integer idPessoa;
    @NotNull
    private TipoContato tipoContato;
    @NotNull
    @Size(max = 13)
    private String numero;
    @NotBlank
    @NotNull
    private String descricao;

}
