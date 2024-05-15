package com.example.salesagents.Repository;

import com.example.salesagents.Domain.Agent;

import java.util.Optional;

public interface AgentRepository extends Repository<Agent,Long>{
    Agent getByUsernameAndPassword(String username, String password);
}
