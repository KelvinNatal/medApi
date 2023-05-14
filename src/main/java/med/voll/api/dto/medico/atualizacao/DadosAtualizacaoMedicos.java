package med.voll.api.dto.medico.atualizacao;

import jakarta.validation.constraints.NotNull;
import med.voll.api.dto.endereco.DadosEndereco;

public record DadosAtualizacaoMedicos(

    @NotNull
    Long id, 

    String nome, 

    String telefone, 
    
    DadosEndereco endereco) {

}
