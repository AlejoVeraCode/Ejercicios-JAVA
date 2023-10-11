package com.apimysql.apimysql.controllers;

import ch.qos.logback.core.net.server.Client;
import com.apimysql.apimysql.domains.Cliente;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController



public class ClienteController {

    private List<Cliente> clientes = new ArrayList<>(Arrays.asList(

            new Cliente("Miguel", "Bellido", "159357"),
            new Cliente("Sebastian", "Contreras", "357689"),
            new Cliente("Davo", "TheKing", "KingTrelew")
    ));

    @GetMapping("/clientes")
    public List<Cliente> getListaClientes() {
        return clientes;
    }

    @GetMapping("/clientes/{name}")
    public Cliente getCliente(@PathVariable String name) {
        for (Cliente cli : clientes) {
            if (cli.getName().equals(name)) {
                return cli;
            }
        } return null;

    }

    @PostMapping("/clientes")
    public Cliente altaCliente (@RequestBody Cliente cliente) {
        clientes.add(cliente);
        return cliente;
    }

    @PutMapping("/clientes")
    public Cliente updateCliente (@RequestBody Cliente cliente) {
        Cliente clienteEncontrado = clientes.stream().
                filter(cli -> cli.getName().equalsIgnoreCase(cliente.getName())).findFirst().orElseThrow();

        clienteEncontrado.setName(cliente.getName());

        clienteEncontrado.setLastname(cliente.getLastname());
        clienteEncontrado.setPassword(cliente.getPassword());
        return clienteEncontrado;
    }

}

