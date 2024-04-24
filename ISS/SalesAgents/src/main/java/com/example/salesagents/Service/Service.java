package com.example.salesagents.Service;

import com.example.salesagents.Domain.Agent;
import com.example.salesagents.Domain.Comanda;
import com.example.salesagents.Domain.Produs;

import java.util.List;

public interface Service extends IObserver{

     List<Produs> getAllProduse();

     Comanda addComanda(Agent agent, Produs produs, int cantitate);

    Agent login(String username, String password);

    Agent addAgent(Agent agent);

    Agent updateAgent(Agent agent);

    Agent deleteAgent(Long id);
}
