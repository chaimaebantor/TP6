package cigma.pfe.controllers;
import cigma.pfe.services.ClientService;
import cigma.pfe.models.Client;
import cigma.pfe.services.ClientServiceImpl;


public class ClientController {
    ClientService clientService;

    public void setClientService(ClientService clientService) {
        this.clientService = clientService;
    }

    public Client save(Client clt )
    {
        System.out.println("ClientController level...");
        return clientService.save(clt);
    }

    public ClientController() {
        System.out.println("Call ClientController ....");
    }
}
