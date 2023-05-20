package med.voll.api.dto.medico.atualizacao;

import med.voll.api.dto.medico.Especialidade;
import med.voll.api.entities.Endereco;
import med.voll.api.entities.Medico;

public record DadosDetalhamentoMedico(Long id, String nome, String email, String crm, String telefone, Especialidade especialidade, Endereco endereco) {

    public DadosDetalhamentoMedico(Medico medico){
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getTelefone(), medico.getEspecialidade(), medico.getEndereco());
    }
}
