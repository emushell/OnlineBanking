package lv.javaguru.java3OnlineBanking.core.commands.clients;

import lv.javaguru.java3OnlineBanking.core.commands.api.DomainCommandResult;
import lv.javaguru.java3OnlineBanking.core.integrations.rest.dto.ClientDTO;

public class UpdateClientResult implements DomainCommandResult{

    private ClientDTO client;

    public UpdateClientResult(ClientDTO client){
        this.client = client;
    }

    public ClientDTO getClient() {
        return client;
    }
}