package lv.javaguru.java3OnlineBanking.core.commands.clients;

import lv.javaguru.java3OnlineBanking.core.domain.Client;
import lv.javaguru.java3OnlineBanking.core.integrations.rest.dto.ClientDTO;
import lv.javaguru.java3OnlineBanking.core.services.DomainCommandHandler;
import lv.javaguru.java3OnlineBanking.core.services.clients.api.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpdateClientCommandHandler implements DomainCommandHandler<UpdateClientCommand, UpdateClientResult> {

    @Autowired
    private ClientService clientService;
    @Autowired
    private ClientConverter clientConverter;

    @Override
    public UpdateClientResult execute(UpdateClientCommand command) {
        Client client = clientService.update(
                command.getId(),
                command.getLogin(),
                command.getPassword(),
                command.getFullName()
        );
        ClientDTO clientDTO = clientConverter.convert(client);
        return new UpdateClientResult(clientDTO);
    }

    @Override
    public Class getCommandType() {
        return UpdateClientCommand.class;
    }
}
