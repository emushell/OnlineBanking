package lv.javaguru.java3OnlineBanking.core.services.clients.impl;

import lv.javaguru.java3OnlineBanking.core.database.api.ClientDAO;
import lv.javaguru.java3OnlineBanking.core.domain.Client;
import lv.javaguru.java3OnlineBanking.core.services.clients.api.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientDAO clientDAO;
    // @Autowired
    // private ClientValidator clientValidator;

    @Override
    public Client update(Long clientId, String newLogin, String newPassword, String newFullName) {
        //    clientValidator.validate(newLogin, newPassword);
        Client client = get(clientId);
        client.setLogin(newLogin);
        client.setPassword(newPassword);
        client.setFullName(newFullName);
        return client;
    }

    @Override
    public Client get(Long clientId) {
        return clientDAO.getRequired(clientId);
    }
}